package com.xiaomi.accountsdk.hasheddeviceidlib;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.hasheddeviceidlib.k */
/* JADX INFO: compiled from: DeviceIdHasher.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5531k {
    /* JADX INFO: renamed from: k */
    public static String m18906k(String str) {
        return toq(str, 8);
    }

    public static String toq(String str, int i2) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA1").digest(str.getBytes()), i2).substring(0, 16);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("failed to init SHA1 digest");
        }
    }
}
