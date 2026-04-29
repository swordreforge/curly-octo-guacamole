package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.C3844k;
import zy.dd;

/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: k */
    public final int f21955k;

    /* JADX INFO: renamed from: n */
    public final int f21956n;

    /* JADX INFO: renamed from: q */
    public final int f21957q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f65730toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f65731zy;

    private toq(int i2, int i3, int i4, int i5, int i6) {
        this.f21955k = i2;
        this.f65730toq = i3;
        this.f65731zy = i4;
        this.f21957q = i5;
        this.f21956n = i6;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static toq m12924k(String str) {
        C3844k.m13629k(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strF7l8 = com.google.common.base.zy.f7l8(strArrSplit[i6].trim());
            strF7l8.hashCode();
            switch (strF7l8) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new toq(i2, i3, i4, i5, strArrSplit.length);
    }
}
