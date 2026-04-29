package com.google.android.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.n */
/* JADX INFO: compiled from: CaptionStyleCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3760n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f66704f7l8 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f66705ld6 = 4;

    /* JADX INFO: renamed from: p */
    public static final int f22823p = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final C3760n f66706qrj = new C3760n(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: s */
    public static final int f22824s = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f66707x2 = 1;

    /* JADX INFO: renamed from: y */
    public static final int f22825y = 1;

    /* JADX INFO: renamed from: g */
    @zy.dd
    public final Typeface f22826g;

    /* JADX INFO: renamed from: k */
    public final int f22827k;

    /* JADX INFO: renamed from: n */
    public final int f22828n;

    /* JADX INFO: renamed from: q */
    public final int f22829q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f66708toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f66709zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.n$k */
    /* JADX INFO: compiled from: CaptionStyleCompat.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3760n(int i2, int i3, int i4, int i5, int i6, @zy.dd Typeface typeface) {
        this.f22827k = i2;
        this.f66708toq = i3;
        this.f66709zy = i4;
        this.f22829q = i5;
        this.f22828n = i6;
        this.f22826g = typeface;
    }

    @zy.hyr(19)
    /* JADX INFO: renamed from: k */
    public static C3760n m13320k(CaptioningManager.CaptionStyle captionStyle) {
        return com.google.android.exoplayer2.util.lrht.f23230k >= 21 ? zy(captionStyle) : toq(captionStyle);
    }

    @zy.hyr(19)
    private static C3760n toq(CaptioningManager.CaptionStyle captionStyle) {
        return new C3760n(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @zy.hyr(21)
    private static C3760n zy(CaptioningManager.CaptionStyle captionStyle) {
        return new C3760n(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f66706qrj.f22827k, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f66706qrj.f66708toq, captionStyle.hasWindowColor() ? captionStyle.windowColor : f66706qrj.f66709zy, captionStyle.hasEdgeType() ? captionStyle.edgeType : f66706qrj.f22829q, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f66706qrj.f22828n, captionStyle.getTypeface());
    }
}
