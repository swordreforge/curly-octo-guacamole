package com.xiaomi.onetrack.p015d;

import android.util.Base64;
import com.xiaomi.onetrack.util.C5780m;
import com.xiaomi.onetrack.util.C5804p;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.xiaomi.onetrack.d.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5747a {

    /* JADX INFO: renamed from: a */
    private static final String f32070a = "AES";

    /* JADX INFO: renamed from: b */
    private static final String f32071b = "AES/ECB/PKCS5Padding";

    /* JADX INFO: renamed from: c */
    private static final String f32072c = "AES";

    /* JADX INFO: renamed from: d */
    private static KeyGenerator f32073d;

    static {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            f32073d = keyGenerator;
            keyGenerator.init(128);
        } catch (Exception e2) {
            C5804p.m20348b(C5804p.m20340a("AES"), "AesUtil e", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m19996a() {
        return f32073d.generateKey().getEncoded();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m20001b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(f32071b);
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            C5804p.m20348b("AES", "decrypt exception:", e2);
            C5804p.m20347b("AES", "content len=" + bArr.length + ", passwd len=" + bArr2.length);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m20003c(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i2 = 0; i2 < str.length() / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            bArr[i2] = (byte) ((Integer.parseInt(str.substring(i3, i4), 16) * 16) + Integer.parseInt(str.substring(i4, i3 + 2), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public static String m20004d(String str, String str2) {
        return new String(m19997a(Base64.decode(str, 10), str2));
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m20005e(String str, String str2) {
        return m19998a(str.getBytes(), str2.getBytes());
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m19998a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(f32071b);
            cipher.init(1, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            C5804p.m20348b(C5804p.m20340a("AES"), "encrypt exception:", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m19997a(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m20000b(str), "AES");
            Cipher cipher = Cipher.getInstance(f32071b);
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            C5804p.m20348b(C5804p.m20340a("AES"), "decrypt exception:", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m20000b(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m20002c(String str, String str2) {
        return new String(m19997a(m20003c(str), str2));
    }

    /* JADX INFO: renamed from: b */
    public static String m19999b(String str, String str2) {
        return Base64.encodeToString(m20005e(str, str2), 10);
    }

    /* JADX INFO: renamed from: a */
    public static String m19995a(String str, String str2) {
        return C5780m.m20276a(m20005e(str, str2));
    }

    /* JADX INFO: renamed from: a */
    public static String m19994a(String str) {
        try {
            char[] charArray = (str + C5748b.f32074a).toCharArray();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                for (int i3 = 0; i3 < charArray.length - 1; i3++) {
                    char c2 = charArray[i2];
                    char c3 = charArray[i3];
                    if (c2 < c3) {
                        charArray[i2] = c3;
                        charArray[i3] = c2;
                    }
                }
            }
            return C5750d.m20034h(new String(charArray));
        } catch (Exception unused) {
            C5804p.m20347b("AES", "encodeFromSalt ");
            return "";
        }
    }
}
