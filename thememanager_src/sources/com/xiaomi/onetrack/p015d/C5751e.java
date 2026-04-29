package com.xiaomi.onetrack.p015d;

import android.os.Build;
import com.xiaomi.onetrack.util.C5804p;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.xiaomi.onetrack.d.e */
/* JADX INFO: loaded from: classes3.dex */
public class C5751e {

    /* JADX INFO: renamed from: a */
    public static final String f32085a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiH0r18h2G+lOzZz0mSZT9liZY\r6ibWUv/biAioduf0zuRbWUYGb3pHobyCOaw2LpVnlf8CeCYtbRJhxL9skOyoU1Qa\rwGtoJzvVR4GbCo1MBTmZ8XThMprr0unRfzsu9GNV4+twciOdS2cNJB7INcwAYBFQ\r9vKpgXFoEjWRhIgwMwIDAQAB\r";

    /* JADX INFO: renamed from: b */
    private static final String f32086b = "RsaUtils";

    /* JADX INFO: renamed from: c */
    private static final String f32087c = "RSA/ECB/PKCS1Padding";

    /* JADX INFO: renamed from: d */
    private static final String f32088d = "BC";

    /* JADX INFO: renamed from: e */
    private static final String f32089e = "RSA";

    /* JADX INFO: renamed from: a */
    public static byte[] m20036a(byte[] bArr) throws Exception {
        try {
            RSAPublicKey rSAPublicKeyM20035a = m20035a(f32085a);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", f32088d);
            cipher.init(1, rSAPublicKeyM20035a);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            C5804p.m20348b(C5804p.m20340a(f32086b), "RsaUtils encrypt exception:", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static RSAPublicKey m20038b(byte[] bArr) throws Exception {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m20037a(byte[] bArr, byte[] bArr2) {
        try {
            RSAPublicKey rSAPublicKeyM20038b = m20038b(bArr);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPublicKeyM20038b);
            return cipher.doFinal(bArr2);
        } catch (Exception e2) {
            C5804p.m20348b(f32086b, "RsaUtil encrypt exception:", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static RSAPublicKey m20035a(String str) throws Exception {
        KeyFactory keyFactory;
        if (Build.VERSION.SDK_INT >= 28) {
            keyFactory = KeyFactory.getInstance("RSA");
        } else {
            keyFactory = KeyFactory.getInstance("RSA", f32088d);
        }
        return (RSAPublicKey) keyFactory.generatePublic(new X509EncodedKeySpec(C5749c.m20014a(str)));
    }
}
