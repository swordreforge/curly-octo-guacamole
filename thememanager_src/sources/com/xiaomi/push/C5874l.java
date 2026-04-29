package com.xiaomi.push;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import miuix.security.C7323k;

/* JADX INFO: renamed from: com.xiaomi.push.l */
/* JADX INFO: loaded from: classes3.dex */
public class C5874l {
    /* JADX INFO: renamed from: k */
    private static String m21149k(byte b2) {
        int i2 = (b2 & 127) + (b2 < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i2 < 16 ? "0" : "");
        sb.append(Integer.toHexString(i2).toLowerCase());
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m21150q(String str) {
        return toq(str).subSequence(8, 24).toString();
    }

    public static String toq(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            StringBuffer stringBuffer = new StringBuffer();
            messageDigest.update(str.getBytes(), 0, str.length());
            for (byte b2 : messageDigest.digest()) {
                stringBuffer.append(m21149k(b2));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static byte[] zy(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
