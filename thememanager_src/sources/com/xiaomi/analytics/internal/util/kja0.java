package com.xiaomi.analytics.internal.util;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import miuix.security.C7323k;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {
    /* JADX INFO: renamed from: k */
    public static String m19245k(String str) {
        return TextUtils.isEmpty(str) ? "" : toq(str.getBytes());
    }

    public static String toq(byte[] bArr) {
        String str;
        if (bArr != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
                messageDigest.update(bArr);
                str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (Exception unused) {
                str = "";
            }
        } else {
            str = "";
        }
        return str.toLowerCase();
    }

    public static <T> T[] zy(List<T> list, Class<T> cls) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, list.size()));
        for (int i2 = 0; i2 < list.size(); i2++) {
            tArr[i2] = list.get(i2);
        }
        return tArr;
    }
}
