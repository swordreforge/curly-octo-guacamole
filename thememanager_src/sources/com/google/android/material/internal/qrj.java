package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import zy.a9;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: StaticLayoutBuilderCompat.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
final class qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f67654cdj = "android.text.TextDirectionHeuristic";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static boolean f67655fn3e = false;

    /* JADX INFO: renamed from: h */
    static final float f24600h = 1.0f;

    /* JADX INFO: renamed from: i */
    private static final String f24601i = "RTL";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f67656ki = "android.text.TextDirectionHeuristics";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final float f67657kja0 = 0.0f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final int f67658n7h = 1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @dd
    private static Object f67659ni7 = null;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f67660t8r = "LTR";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @dd
    private static Constructor<StaticLayout> f67661zurt;

    /* JADX INFO: renamed from: k */
    private CharSequence f24603k;

    /* JADX INFO: renamed from: n */
    private int f24604n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final TextPaint f67665toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f67666x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f67667zy;

    /* JADX INFO: renamed from: q */
    private int f24606q = 0;

    /* JADX INFO: renamed from: g */
    private Layout.Alignment f24602g = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67662f7l8 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y */
    private float f24608y = 0.0f;

    /* JADX INFO: renamed from: s */
    private float f24607s = 1.0f;

    /* JADX INFO: renamed from: p */
    private int f24605p = f67658n7h;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f67663ld6 = true;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private TextUtils.TruncateAt f67664qrj = null;

    /* JADX INFO: renamed from: com.google.android.material.internal.qrj$k */
    /* JADX INFO: compiled from: StaticLayoutBuilderCompat.java */
    static class C4053k extends Exception {
        C4053k(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private qrj(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f24603k = charSequence;
        this.f67665toq = textPaint;
        this.f67667zy = i2;
        this.f24604n = charSequence.length();
    }

    private void toq() throws C4053k {
        if (f67655fn3e) {
            return;
        }
        try {
            f67659ni7 = this.f67666x2 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f67661zurt = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f67655fn3e = true;
        } catch (Exception e2) {
            throw new C4053k(e2);
        }
    }

    @lvui
    public static qrj zy(@lvui CharSequence charSequence, @lvui TextPaint textPaint, @a9(from = 0) int i2) {
        return new qrj(charSequence, textPaint, i2);
    }

    @lvui
    public qrj f7l8(int i2) {
        this.f24605p = i2;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public qrj m14584g(@a9(from = 0) int i2) {
        this.f24604n = i2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public StaticLayout m14585k() throws C4053k {
        if (this.f24603k == null) {
            this.f24603k = "";
        }
        int iMax = Math.max(0, this.f67667zy);
        CharSequence charSequenceEllipsize = this.f24603k;
        if (this.f67662f7l8 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f67665toq, iMax, this.f67664qrj);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f24604n);
        this.f24604n = iMin;
        if (this.f67666x2 && this.f67662f7l8 == 1) {
            this.f24602g = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f24606q, iMin, this.f67665toq, iMax);
        builderObtain.setAlignment(this.f24602g);
        builderObtain.setIncludePad(this.f67663ld6);
        builderObtain.setTextDirection(this.f67666x2 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f67664qrj;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f67662f7l8);
        float f2 = this.f24608y;
        if (f2 != 0.0f || this.f24607s != 1.0f) {
            builderObtain.setLineSpacing(f2, this.f24607s);
        }
        if (this.f67662f7l8 > 1) {
            builderObtain.setHyphenationFrequency(this.f24605p);
        }
        return builderObtain.build();
    }

    @lvui
    public qrj ld6(@a9(from = 0) int i2) {
        this.f67662f7l8 = i2;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public qrj m14586n(@dd TextUtils.TruncateAt truncateAt) {
        this.f67664qrj = truncateAt;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public qrj m14587p(float f2, float f3) {
        this.f24608y = f2;
        this.f24607s = f3;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public qrj m14588q(@lvui Layout.Alignment alignment) {
        this.f24602g = alignment;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public qrj m14589s(boolean z2) {
        this.f67666x2 = z2;
        return this;
    }

    @lvui
    public qrj x2(@a9(from = 0) int i2) {
        this.f24606q = i2;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public qrj m14590y(boolean z2) {
        this.f67663ld6 = z2;
        return this;
    }
}
