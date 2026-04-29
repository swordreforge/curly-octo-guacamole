package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.hasheddeviceidlib.C5531k;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.request.wvg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import miuix.security.C7323k;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.y */
/* JADX INFO: compiled from: CloudCoder.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5581y {

    /* JADX INFO: renamed from: g */
    public static final int f31061g = 11;

    /* JADX INFO: renamed from: k */
    private static final String f31062k = "RC4";

    /* JADX INFO: renamed from: n */
    public static final String f31063n = "UTF-8";

    /* JADX INFO: renamed from: q */
    private static final Integer f31064q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72983toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72984zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.y$k */
    /* JADX INFO: compiled from: CloudCoder.java */
    public enum k {
        ENCRYPT,
        DECRYPT
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = C5502s.f72782f7l8;
        sb.append(str);
        sb.append("/user/getSecurityToken");
        f72983toq = sb.toString();
        f72984zy = str + "/user/getPlanText";
        f31064q = 0;
    }

    public static String cdj(String str) {
        return C5577s.m19132n(str);
    }

    public static String f7l8(String str, String str2) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        return m19150g(o1t(str, 1), str2, null);
    }

    public static String fn3e(String str) {
        return C5531k.toq(str, 8);
    }

    public static Cipher fu4(byte[] bArr, int i2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(i2, secretKeySpec);
            return cipher;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            throw new IllegalStateException("failed to init AES cipher");
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            throw new IllegalStateException("failed to init AES cipher");
        } catch (NoSuchPaddingException e4) {
            e4.printStackTrace();
            throw new IllegalStateException("failed to init AES cipher");
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m19150g(Cipher cipher, String str, String str2) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        if (str2 == null) {
            str2 = f31063n;
        }
        return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 2);
    }

    /* JADX INFO: renamed from: h */
    public static String m19151h(byte[] bArr) {
        return C5577s.m19133q(bArr);
    }

    /* JADX INFO: renamed from: i */
    public static String m19152i(String str, String[] strArr, int i2) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            String strKi = ki(str2);
            if (strKi != null) {
                if (i2 <= 0 || i2 > strKi.length()) {
                    arrayList.add(strKi);
                } else {
                    arrayList.add(strKi.substring(0, i2));
                }
            }
        }
        if (str == null) {
            str = "";
        }
        return TextUtils.join(str, arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static String m19153k(String str, String str2, String str3) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        return toq(ni7(str, 2), str2, str3);
    }

    public static String ki(String str) {
        return C5577s.m19130g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static String kja0(String str) {
        MessageDigest messageDigest;
        FileInputStream fileInputStream;
        try {
            try {
                messageDigest = MessageDigest.getInstance("SHA1");
            } catch (Throwable unused) {
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable unused2) {
            str = 0;
            messageDigest = null;
        }
        try {
            fileInputStream = new FileInputStream(new File((String) str));
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 != -1) {
                        messageDigest.update(bArr, 0, i2);
                    } else {
                        try {
                            break;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                fileInputStream.close();
                if (messageDigest != null) {
                    return m19151h(messageDigest.digest());
                }
                return null;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable unused3) {
            str = 0;
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            if (messageDigest != null) {
                return m19151h(messageDigest.digest());
            }
            return null;
        }
    }

    public static String ld6() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return m19159y(bArr);
    }

    public static String mcp(String str, String str2, String str3, String str4, String str5, k kVar) throws com.xiaomi.accountsdk.request.n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        String str6;
        if (!TextUtils.isDigitsOnly(str)) {
            throw new IllegalArgumentException("userId is not only digits");
        }
        HashMap map = new HashMap();
        k kVar2 = k.ENCRYPT;
        if (kVar == kVar2) {
            str6 = f72983toq;
            map.put("plainText", str3);
        } else {
            str6 = f72984zy;
            map.put("token", str3);
        }
        map.put("userId", str);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC1925p.dqjj, str2);
        map2.put(InterfaceC1925p.du, str4);
        wvg.C5553n c5553nM18974g = com.xiaomi.accountsdk.request.o1t.m18974g(str6, map, map2, true, str5);
        Object objM19019s = c5553nM18974g.m19019s("code");
        if (!f31064q.equals(objM19019s)) {
            throw new com.xiaomi.accountsdk.request.n7h("failed to encrypt, code: " + objM19019s);
        }
        Object objM19019s2 = c5553nM18974g.m19019s("data");
        if (!(objM19019s2 instanceof Map)) {
            throw new com.xiaomi.accountsdk.request.n7h("invalid data node");
        }
        Object obj = ((Map) objM19019s2).get(kVar == kVar2 ? "cipher" : "plainText");
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new com.xiaomi.accountsdk.request.n7h("invalid result: " + obj);
    }

    /* JADX INFO: renamed from: n */
    public static String m19154n(String str, String str2, String str3) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        Cipher cipherNi7 = ni7(str, 1);
        return cipherNi7 == null ? "" : m19150g(cipherNi7, str2, str3);
    }

    public static String n7h(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(bArr);
                return m19151h(messageDigest.digest());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static Cipher ni7(String str, int i2) {
        return m19160z(str, i2, "0102030405060708".getBytes());
    }

    public static Cipher o1t(String str, int i2) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest != null) {
            return fu4(messageDigest.digest(str.getBytes()), i2);
        }
        throw new IllegalStateException("failed to init MD5");
    }

    /* JADX INFO: renamed from: p */
    public static String m19155p(long j2) {
        return fu4.toq(j2);
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m19156q(String str, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, IOException {
        byte[] bArrDoFinal = wvg(m19158t(str), 1).doFinal(bArr);
        if (bArr.length == bArrDoFinal.length) {
            return bArrDoFinal;
        }
        throw new IOException("The encoded data length is not the same with original data");
    }

    public static String qrj(byte[] bArr) {
        return C5577s.zy(bArr);
    }

    /* JADX INFO: renamed from: s */
    public static String m19157s() {
        return fu4.m19076k();
    }

    /* JADX INFO: renamed from: t */
    private static byte[] m19158t(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String t8r(String str, List<String> list, int i2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return m19152i(str, (String[]) list.toArray(new String[list.size()]), i2);
    }

    public static String toq(Cipher cipher, String str, String str2) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return new String(cipher.doFinal(Base64.decode(str.getBytes(str2), 2)), str2);
        } catch (IllegalArgumentException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public static Cipher wvg(byte[] bArr, int i2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, f31062k);
        try {
            Cipher cipher = Cipher.getInstance(f31062k);
            cipher.init(i2, secretKeySpec);
            return cipher;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static String x2(String str, String str2, Map<String, String> map, String str3) {
        return C5577s.toq(str, str2, map, str3);
    }

    /* JADX INFO: renamed from: y */
    public static String m19159y(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02X", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public static Cipher m19160z(String str, int i2, byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 2), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i2, secretKeySpec, new IvParameterSpec(bArr));
            return cipher;
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static String zurt(String str, int i2) {
        return C5531k.toq(str, i2);
    }

    public static String zy(String str, String str2) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        return toq(o1t(str, 2), str2, null);
    }
}
