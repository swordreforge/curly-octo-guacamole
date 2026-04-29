package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: RSACoder.java */
/* JADX INFO: loaded from: classes3.dex */
public class wvg {

    /* JADX INFO: renamed from: k */
    public static final String f31059k = "-----BEGIN CERTIFICATE-----\nMIICDzCCAXigAwIBAgIEWBw0IzANBgkqhkiG9w0BAQUFADBMMQswCQYDVQQGEwJD\nTjEPMA0GA1UEChMGeGlhb21pMQ8wDQYDVQQLEwZ4aWFvbWkxGzAZBgNVBAMTEmFj\nY291bnQueGlhb21pLmNvbTAeFw0xNjExMDQwNzA5MjNaFw0xNzExMDQwNzA5MjNa\nMEwxCzAJBgNVBAYTAkNOMQ8wDQYDVQQKEwZ4aWFvbWkxDzANBgNVBAsTBnhpYW9t\naTEbMBkGA1UEAxMSYWNjb3VudC54aWFvbWkuY29tMIGfMA0GCSqGSIb3DQEBAQUA\nA4GNADCBiQKBgQCHcPEm9Wo8/LWHL8mohOV5YalTgZLzng+nWCEkIRP//6GohYlI\nh3dvGpueJvQ3Sany/3dLx0x6MQKA34NxRyoO37R/LgPZUfe6eWzHQeColBBHxTED\nbCqDh46Gv5vogjqHRl4+q2WGCmZOIfmPjNHQWG8sMIZyTqFCLc6gk9vSewIDAQAB\nMA0GCSqGSIb3DQEBBQUAA4GBAHaPnscaxSPh0N0Z5OgQ6PcWr5uYPLMweatYGZRH\nSFxwSqYXpqIowuRxmrBj+oE5rG5rzFCtNjCBoeMVy/7JXZr9Juaw9NCWaTaqrmIV\nP4nK/0kizCvkx3088OOCGextGeZUC9/PCbVUEcRvGLwSrvgqiC1KG4ufeIdQWBaJ\n8ZlG\n-----END CERTIFICATE-----\n";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72981toq = "UTF-8";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f72982zy = 10;

    public static PublicKey f7l8(String str) throws p039w.toq {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("public key should not be empty");
        }
        try {
            return m19148y(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new p039w.toq("getPublicKey", e2.getCause());
        }
    }

    /* JADX INFO: renamed from: g */
    public static KeyPair m19142g(int i2) throws p039w.toq {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(miuix.hybrid.internal.n7h.f40280k);
            keyPairGenerator.initialize(i2, new SecureRandom());
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e2) {
            throw new p039w.toq("generate key", e2.getCause());
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m19143k(byte[] bArr, Key key, int i2) throws p039w.toq {
        try {
            Cipher cipher = Cipher.getInstance(miuix.hybrid.internal.n7h.f87719toq);
            cipher.init(i2, key);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e2) {
            throw new p039w.toq(e2.getCause());
        } catch (NoSuchAlgorithmException e3) {
            throw new p039w.toq(e3.getCause());
        } catch (BadPaddingException e4) {
            throw new p039w.toq(e4.getCause());
        } catch (IllegalBlockSizeException e6) {
            throw new p039w.toq(e6.getCause());
        } catch (NoSuchPaddingException e7) {
            throw new p039w.toq(e7.getCause());
        }
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m19144n(byte[] bArr, Key key) throws p039w.toq {
        try {
            return m19143k(bArr, key, 1);
        } catch (p039w.toq e2) {
            throw new p039w.toq("encrypt", e2.getCause());
        }
    }

    /* JADX INFO: renamed from: p */
    public static PublicKey m19145p(byte[] bArr) throws p039w.toq {
        if (bArr == null) {
            throw new IllegalStateException("public key bytes should not be empty");
        }
        try {
            return KeyFactory.getInstance(miuix.hybrid.internal.n7h.f40280k).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException e2) {
            throw new p039w.toq("getPublicKey", e2.getCause());
        } catch (InvalidKeySpecException e3) {
            throw new p039w.toq("getPublicKey", e3.getCause());
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m19146q(String str, Key key) throws p039w.toq {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("plain data should not be empty");
        }
        if (key != null) {
            return Base64.encodeToString(m19144n(Base64.decode(str, 10), key), 10);
        }
        throw new IllegalStateException("encrypt key should not be empty");
    }

    /* JADX INFO: renamed from: s */
    public static PrivateKey m19147s(byte[] bArr) throws p039w.toq {
        if (bArr == null) {
            throw new IllegalStateException("private key bytes should not be empty");
        }
        try {
            return KeyFactory.getInstance(miuix.hybrid.internal.n7h.f40280k).generatePrivate(new PKCS8EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException e2) {
            throw new p039w.toq("getPrivateKey", e2.getCause());
        } catch (InvalidKeySpecException e3) {
            throw new p039w.toq("getPrivateKey", e3.getCause());
        }
    }

    public static String toq(String str, Key key) throws p039w.toq {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("en data should not be empty");
        }
        if (key != null) {
            return Base64.encodeToString(zy(Base64.decode(str, 10), key), 10);
        }
        throw new IllegalStateException("decrypt key should not be empty");
    }

    /* JADX INFO: renamed from: y */
    public static PublicKey m19148y(byte[] bArr) throws p039w.toq {
        if (bArr == null) {
            throw new IllegalStateException("public key bytes should not be empty");
        }
        try {
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
        } catch (CertificateException e2) {
            throw new p039w.toq("getPublicKey", e2.getCause());
        }
    }

    public static byte[] zy(byte[] bArr, Key key) throws p039w.toq {
        try {
            return m19143k(bArr, key, 2);
        } catch (p039w.toq e2) {
            throw new p039w.toq("decrypt", e2.getCause());
        }
    }
}
