package com.xiaomi.onetrack.p015d;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.xiaomi.onetrack.util.C5804p;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import miuix.hybrid.internal.n7h;

/* JADX INFO: renamed from: com.xiaomi.onetrack.d.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5748b {

    /* JADX INFO: renamed from: a */
    public static final String f32074a = m20010b();

    /* JADX INFO: renamed from: b */
    private static final String f32075b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c */
    private static final String f32076c = "AndroidKeyStore";

    /* JADX INFO: renamed from: d */
    private static final String f32077d = "RSA/ECB/PKCS1Padding";

    /* JADX INFO: renamed from: e */
    private static final String f32078e = "RSA_KEY";

    /* JADX INFO: renamed from: a */
    public static synchronized String m20006a(Context context, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        m20009a(context, keyStore);
        Certificate certificate = keyStore.getCertificate(f32078e);
        if (certificate == null) {
            return null;
        }
        cipher.init(1, certificate.getPublicKey());
        return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 0);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m20011b(Context context, String str) throws Exception {
        Cipher cipher;
        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        m20009a(context, keyStore);
        cipher.init(2, (PrivateKey) keyStore.getKey(f32078e, null));
        return new String(cipher.doFinal(Base64.decode(str, 0)), "UTF-8");
    }

    /* JADX INFO: renamed from: b */
    private static String m20010b() {
        try {
            return new String("h*Y31]c!@5Ns_jPsvej!@3[(*w(!l".getBytes(), "UTF-8");
        } catch (Exception e2) {
            C5804p.m20347b("AndroidKeyStore", e2.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m20009a(Context context, KeyStore keyStore) {
        try {
            if (keyStore.containsAlias(f32078e)) {
                return;
            }
            m20007a();
        } catch (Throwable th) {
            C5804p.m20348b("AndroidKeyStore", "createKey e", th);
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    private static void m20008a(Context context) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(1, 1);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias(f32078e).setSubject(new X500Principal("CN=RSA_KEY")).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(n7h.f40280k, "AndroidKeyStore");
        keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
        keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: renamed from: a */
    private static void m20007a() throws IllegalAccessException, NoSuchFieldException, LinkageError, NoSuchMethodException, NoSuchAlgorithmException, InstantiationException, ClassNotFoundException, NoSuchProviderException, InvocationTargetException, InvalidAlgorithmParameterException {
        Class<?> cls = Class.forName("android.security.keystore.KeyGenParameterSpec$Builder");
        Constructor<?> constructor = cls.getConstructor(String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.security.keystore.KeyProperties");
        Object objNewInstance = constructor.newInstance(f32078e, Integer.valueOf(cls2.getDeclaredField("PURPOSE_ENCRYPT").getInt(null) | cls2.getDeclaredField("PURPOSE_DECRYPT").getInt(null)));
        cls.getMethod("setDigests", String[].class).invoke(objNewInstance, new String[]{(String) cls2.getDeclaredField("DIGEST_SHA256").get(null), (String) cls2.getDeclaredField("DIGEST_SHA512").get(null)});
        cls.getMethod("setEncryptionPaddings", String[].class).invoke(objNewInstance, new String[]{(String) cls2.getDeclaredField("ENCRYPTION_PADDING_RSA_PKCS1").get(null)});
        Object objInvoke = cls.getMethod("build", new Class[0]).invoke(objNewInstance, new Object[0]);
        Class<?> cls3 = Class.forName("java.security.KeyPairGenerator");
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) cls3.getMethod("getInstance", String.class, String.class).invoke(null, n7h.f40280k, "AndroidKeyStore");
        cls3.getMethod("initialize", AlgorithmParameterSpec.class).invoke(keyPairGenerator, objInvoke);
        keyPairGenerator.generateKeyPair();
    }
}
