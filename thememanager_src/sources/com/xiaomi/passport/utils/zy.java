package com.xiaomi.passport.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.utils.C5570k;
import com.xiaomi.accountsdk.utils.wvg;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: PassportEnvEncryptUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f32635k = "AES";

    /* JADX INFO: renamed from: com.xiaomi.passport.utils.zy$k */
    /* JADX INFO: compiled from: PassportEnvEncryptUtils.java */
    public static class C5849k extends Exception {
        public C5849k(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: compiled from: PassportEnvEncryptUtils.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public String f32636k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f73256toq;
    }

    /* JADX INFO: renamed from: k */
    private static String m20549k(String str, SecretKey secretKey) throws C5849k {
        try {
            return new C5570k(secretKey.getEncoded()).mo19092k(str);
        } catch (C5545n e2) {
            throw new C5849k(e2);
        }
    }

    /* JADX INFO: renamed from: q */
    private static SecretKey m20550q() throws C5849k {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(f32635k);
            keyGenerator.init(new SecureRandom());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e2) {
            throw new C5849k(e2);
        }
    }

    public static toq toq(String str) throws C5849k {
        toq toqVar = new toq();
        SecretKey secretKeyM20550q = m20550q();
        try {
            String strEncodeToString = Base64.encodeToString(wvg.m19144n(Base64.encode(secretKeyM20550q.getEncoded(), 10), wvg.f7l8(wvg.f31059k)), 10);
            toqVar.f32636k = m20549k(str, secretKeyM20550q);
            toqVar.f73256toq = strEncodeToString;
            return toqVar;
        } catch (p039w.toq e2) {
            throw new C5849k(e2);
        }
    }

    public static toq zy(String[] strArr) throws C5849k {
        return toq(TextUtils.join(":", strArr));
    }
}
