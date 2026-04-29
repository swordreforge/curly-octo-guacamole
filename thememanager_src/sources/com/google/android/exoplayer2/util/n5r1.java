package com.google.android.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: compiled from: TraceUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n5r1 {
    private n5r1() {
    }

    /* JADX INFO: renamed from: k */
    public static void m13686k(String str) {
        if (lrht.f23230k >= 18) {
            toq(str);
        }
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: q */
    private static void m13687q() {
        Trace.endSection();
    }

    @zy.hyr(18)
    private static void toq(String str) {
        Trace.beginSection(str);
    }

    public static void zy() {
        if (lrht.f23230k >= 18) {
            m13687q();
        }
    }
}
