package com.android.thememanager.basemodule.utils;

import android.widget.Toast;

/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class nn86 {

    /* JADX INFO: renamed from: k */
    private static final int f10369k = 2000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static CharSequence f57785toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static long f57786zy;

    private nn86() {
    }

    /* JADX INFO: renamed from: k */
    public static void m7150k(int resId, int duration) {
        toq(bf2.toq.toq().getResources().getString(resId), duration);
    }

    public static void toq(CharSequence text, int duration) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!text.equals(f57785toq) || jCurrentTimeMillis - f57786zy > com.google.android.exoplayer2.t8r.f65475toq) {
            f57785toq = text;
            f57786zy = jCurrentTimeMillis;
            Toast.makeText(bf2.toq.toq(), text, duration).show();
        }
    }
}
