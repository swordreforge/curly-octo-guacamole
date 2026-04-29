package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.gvn7;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.n */
/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3874n {

    /* JADX INFO: renamed from: k */
    public final int f23428k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f67181toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f67182zy;

    private C3874n(int i2, int i3, String str) {
        this.f23428k = i2;
        this.f67181toq = i3;
        this.f67182zy = str;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static C3874n m13798k(gvn7 gvn7Var) {
        String str;
        gvn7Var.hyr(2);
        int iJp0y = gvn7Var.jp0y();
        int i2 = iJp0y >> 1;
        int iJp0y2 = ((gvn7Var.jp0y() >> 3) & 31) | ((iJp0y & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iJp0y2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(iJp0y2);
        return new C3874n(i2, iJp0y2, sb.toString());
    }
}
