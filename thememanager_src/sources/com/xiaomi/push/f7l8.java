package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    static final char[] f32893k = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: k */
    public static String m20835k(byte[] bArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i3 * 2);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i2 + i4] & 255;
            char[] cArr = f32893k;
            sb.append(cArr[i5 >> 4]);
            sb.append(cArr[i5 & 15]);
        }
        return sb.toString();
    }

    public static boolean toq(Context context) {
        return C5864g.f32950k;
    }
}
