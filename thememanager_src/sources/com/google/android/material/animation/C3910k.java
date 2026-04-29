package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.C0909k;
import zy.uv6;
import zy.zurt;

/* JADX INFO: renamed from: com.google.android.material.animation.k */
/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C3910k {

    /* JADX INFO: renamed from: k */
    public static final TimeInterpolator f23771k = new LinearInterpolator();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final TimeInterpolator f67312toq = new androidx.interpolator.view.animation.toq();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final TimeInterpolator f67313zy = new C0909k();

    /* JADX INFO: renamed from: q */
    public static final TimeInterpolator f23773q = new androidx.interpolator.view.animation.zy();

    /* JADX INFO: renamed from: n */
    public static final TimeInterpolator f23772n = new DecelerateInterpolator();

    /* JADX INFO: renamed from: k */
    public static float m13980k(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    public static float toq(float f2, float f3, @zurt(from = 0.0d, to = 1.0d) float f4, @zurt(from = 0.0d, to = 1.0d) float f5, @zurt(from = 0.0d, to = 1.0d) float f6) {
        return f6 < f4 ? f2 : f6 > f5 ? f3 : m13980k(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int zy(int i2, int i3, float f2) {
        return i2 + Math.round(f2 * (i3 - i2));
    }
}
