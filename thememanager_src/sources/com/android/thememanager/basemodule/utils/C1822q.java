package com.android.thememanager.basemodule.utils;

import android.text.TextUtils;
import java.io.File;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import miui.util.HashUtils;
import miuix.security.C7323k;
import t8iq.C7672k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.q */
/* JADX INFO: compiled from: CoderUtls.java */
/* JADX INFO: loaded from: classes.dex */
public class C1822q {

    /* JADX INFO: renamed from: k */
    private static final String[] f10399k = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", C7672k.f94880zy, "e", "f"};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected static Map<String, k> f57808toq = new HashMap();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.q$k */
    /* JADX INFO: compiled from: CoderUtls.java */
    private static class k implements Serializable {
        private static final long serialVersionUID = 2;
        public String mHash;
        public long mModified;
        public long mSize;

        public k(File file, String hash) {
            this.mModified = file.lastModified();
            this.mSize = file.length();
            this.mHash = hash;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7192g(String path, String hash) {
        m7194n(path, new k(new File(path), hash));
    }

    /* JADX INFO: renamed from: k */
    private static String m7193k(byte[] b2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b3 : b2) {
            stringBuffer.append(toq(b3));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: n */
    private static void m7194n(String path, k cache) {
        synchronized (f57808toq) {
            f57808toq.put(path, cache);
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m7195q(String path) {
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        File file = new File(path);
        k kVar = f57808toq.get(path);
        if (kVar == null || file.lastModified() != kVar.mModified || file.length() != kVar.mSize) {
            kVar = new k(file, HashUtils.getSHA1(new File(path)));
            m7194n(path, kVar);
        }
        return kVar.mHash;
    }

    private static String toq(byte b2) {
        int i2 = b2;
        if (b2 < 0) {
            i2 = b2 + 256;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = f10399k;
        sb.append(strArr[i2 / 16]);
        sb.append(strArr[i2 % 16]);
        return sb.toString();
    }

    public static final String zy(String string) {
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(string.getBytes());
            return m7193k(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
