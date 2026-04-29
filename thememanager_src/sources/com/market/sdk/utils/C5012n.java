package com.market.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.market.sdk.MarketManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import miuix.security.C7323k;
import t8iq.C7672k;

/* JADX INFO: renamed from: com.market.sdk.utils.n */
/* JADX INFO: compiled from: Coder.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5012n {

    /* JADX INFO: renamed from: k */
    public static final String f28215k = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String[] f69000toq = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", C7672k.f94880zy, "e", "f"};

    public static final String f7l8(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    /* JADX INFO: renamed from: g */
    public static final String m17448g(String str, String str2) {
        byte[] bArrM17450n;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (bArrM17450n = m17450n(str2)) != null && bArrM17450n.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM17450n, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                return m17454y(cipher.doFinal(str.getBytes()));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private static String m17449k(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(toq(b2));
        }
        return stringBuffer.toString();
    }

    public static final String ld6(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(str.getBytes());
            return m17449k(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            C5013p.m17465q(MarketManager.f27964n, e2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final byte[] m17450n(String str) {
        return Base64.decode(str, 0);
    }

    public static byte[] n7h(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 == 1) {
            return null;
        }
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 != length / 2; i2++) {
            try {
                int i3 = i2 * 2;
                bArr[i2] = (byte) Integer.parseInt(str.substring(i3, i3 + 2), 16);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public static final String m17451p(File file) {
        byte[] bArr = new byte[1024];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                try {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
                        while (true) {
                            int i2 = fileInputStream.read(bArr);
                            if (i2 > 0) {
                                messageDigest.update(bArr, 0, i2);
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                }
                            }
                        }
                        return m17449k(messageDigest.digest());
                    } finally {
                        try {
                            fileInputStream.close();
                        } catch (IOException e22) {
                            C5013p.m17465q(MarketManager.f27964n, e22.toString());
                        }
                    }
                } catch (IOException e3) {
                    C5013p.m17465q(MarketManager.f27964n, e3.toString());
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        C5013p.m17465q(MarketManager.f27964n, e4.toString());
                    }
                    return null;
                }
            } catch (NoSuchAlgorithmException e6) {
                C5013p.m17465q(MarketManager.f27964n, e6.toString());
                try {
                    fileInputStream.close();
                } catch (IOException e7) {
                    C5013p.m17465q(MarketManager.f27964n, e7.toString());
                }
                return null;
            }
        } catch (FileNotFoundException e8) {
            C5013p.m17465q(MarketManager.f27964n, e8.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final String m17452q(String str, String str2) {
        byte[] bArrM17450n;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (bArrM17450n = m17450n(str2)) != null && bArrM17450n.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM17450n, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                byte[] bArrM17450n2 = m17450n(str);
                if (bArrM17450n2 == null) {
                    return null;
                }
                return new String(cipher.doFinal(bArrM17450n2));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            }
        }
        return null;
    }

    public static final byte[] qrj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            C5013p.m17465q(MarketManager.f27964n, e2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final byte[] m17453s(String str) {
        return Base64.encode(str.getBytes(), 2);
    }

    private static String toq(byte b2) {
        int i2 = b2;
        if (b2 < 0) {
            i2 = b2 + 256;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = f69000toq;
        sb.append(strArr[i2 / 16]);
        sb.append(strArr[i2 % 16]);
        return sb.toString();
    }

    public static final String x2(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(str.getBytes());
            return m17449k(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            C5013p.m17465q(MarketManager.f27964n, e2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final String m17454y(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static final String zy(String str) {
        return new String(Base64.decode(str, 0));
    }
}
