package miuix.hybrid.internal;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: SignUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f87718f7l8 = 2;

    /* JADX INFO: renamed from: g */
    public static final int f40279g = 1;

    /* JADX INFO: renamed from: k */
    public static final String f40280k = "RSA";

    /* JADX INFO: renamed from: n */
    public static final int f40281n = 0;

    /* JADX INFO: renamed from: p */
    public static final int f40282p = 16;

    /* JADX INFO: renamed from: q */
    public static final String f40283q = "MD5withRSA";

    /* JADX INFO: renamed from: s */
    public static final int f40284s = 8;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f87719toq = "RSA/ECB/PKCS1Padding";

    /* JADX INFO: renamed from: y */
    public static final int f40285y = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f87720zy = "SHA1withRSA";

    private n7h() {
    }

    public static String f7l8(String content, PrivateKey key) throws Exception {
        return m25832y(content, key, f87720zy);
    }

    /* JADX INFO: renamed from: g */
    public static PublicKey m25826g(KeySpec keySpec) throws Exception {
        return KeyFactory.getInstance(f40280k).generatePublic(keySpec);
    }

    /* JADX INFO: renamed from: k */
    public static PrivateKey m25827k(String key) throws Exception {
        return toq(key, 0);
    }

    public static boolean ld6(String content, PublicKey key, String sign) throws Exception {
        return x2(content, key, sign, f87720zy);
    }

    /* JADX INFO: renamed from: n */
    public static PublicKey m25828n(String key, int flags) throws Exception {
        return m25826g(new X509EncodedKeySpec(Base64.decode(key, flags)));
    }

    public static boolean n7h(byte[] data, PublicKey key, byte[] sign, String algorithm) throws Exception {
        Signature signature = Signature.getInstance(algorithm);
        signature.initVerify(key);
        signature.update(data);
        return signature.verify(sign);
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m25829p(byte[] data, PrivateKey key, String algorithm) throws Exception {
        Signature signature = Signature.getInstance(algorithm);
        signature.initSign(key);
        signature.update(data);
        return signature.sign();
    }

    /* JADX INFO: renamed from: q */
    public static PublicKey m25830q(String key) throws Exception {
        return m25828n(key, 0);
    }

    public static boolean qrj(byte[] data, PublicKey key, byte[] sign) throws Exception {
        return n7h(data, key, sign, f87720zy);
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m25831s(byte[] data, PrivateKey key) throws Exception {
        return m25829p(data, key, f87720zy);
    }

    public static PrivateKey toq(String key, int flags) throws Exception {
        return zy(new PKCS8EncodedKeySpec(Base64.decode(key, flags)));
    }

    public static boolean x2(String content, PublicKey key, String sign, String algorithm) throws Exception {
        return n7h(content.getBytes(), key, Base64.decode(sign, 2), algorithm);
    }

    /* JADX INFO: renamed from: y */
    public static String m25832y(String content, PrivateKey key, String algorithm) throws Exception {
        return new String(Base64.encode(m25829p(content.getBytes(), key, algorithm), 2));
    }

    public static PrivateKey zy(KeySpec keySpec) throws Exception {
        return KeyFactory.getInstance(f40280k).generatePrivate(keySpec);
    }
}
