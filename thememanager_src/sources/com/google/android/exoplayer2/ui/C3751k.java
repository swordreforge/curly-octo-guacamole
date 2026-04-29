package com.google.android.exoplayer2.ui;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.k */
/* JADX INFO: compiled from: AdOverlayInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3751k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f66652f7l8 = 3;

    /* JADX INFO: renamed from: g */
    public static final int f22788g = 2;

    /* JADX INFO: renamed from: n */
    public static final int f22789n = 1;

    /* JADX INFO: renamed from: q */
    public static final int f22790q = 0;

    /* JADX INFO: renamed from: k */
    public final View f22791k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f66653toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    public final String f66654zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.k$k */
    /* JADX INFO: compiled from: AdOverlayInfo.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3751k(View view, int i2) {
        this(view, i2, null);
    }

    public C3751k(View view, int i2, @zy.dd String str) {
        this.f22791k = view;
        this.f66653toq = i2;
        this.f66654zy = str;
    }
}
