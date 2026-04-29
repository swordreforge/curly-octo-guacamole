package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes2.dex */
final class f7l8 {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f65775a9 = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final float f65776fn3e = Float.MAX_VALUE;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f65777fti = 2;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f65778fu4 = 2;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f65779gvn7 = 4;

    /* JADX INFO: renamed from: i */
    public static final int f22017i = -1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f65780jk = 1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f65781jp0y = 3;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f65782mcp = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f65783ni7 = 1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f65784o1t = 1;

    /* JADX INFO: renamed from: t */
    public static final int f22018t = 3;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f65785wvg = 2;

    /* JADX INFO: renamed from: z */
    public static final int f22019z = 3;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f65786zurt = 0;

    /* JADX INFO: renamed from: h */
    @dd
    private Layout.Alignment f22021h;

    /* JADX INFO: renamed from: k */
    @dd
    private String f22022k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.text.ttml.toq f65789ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private Layout.Alignment f65790kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private float f65791ld6;

    /* JADX INFO: renamed from: n */
    private boolean f22023n;

    /* JADX INFO: renamed from: q */
    private int f22025q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f65795toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private String f65796x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f65797zy;

    /* JADX INFO: renamed from: g */
    private int f22020g = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f65788f7l8 = -1;

    /* JADX INFO: renamed from: y */
    private int f22027y = -1;

    /* JADX INFO: renamed from: s */
    private int f22026s = -1;

    /* JADX INFO: renamed from: p */
    private int f22024p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f65793qrj = -1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f65792n7h = -1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f65787cdj = -1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private float f65794t8r = Float.MAX_VALUE;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.f7l8$k */
    /* JADX INFO: compiled from: TtmlStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3674k {
    }

    /* JADX INFO: compiled from: TtmlStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: compiled from: TtmlStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    private f7l8 t8r(@dd f7l8 f7l8Var, boolean z2) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (f7l8Var != null) {
            if (!this.f65797zy && f7l8Var.f65797zy) {
                fu4(f7l8Var.f65795toq);
            }
            if (this.f22027y == -1) {
                this.f22027y = f7l8Var.f22027y;
            }
            if (this.f22026s == -1) {
                this.f22026s = f7l8Var.f22026s;
            }
            if (this.f22022k == null && (str = f7l8Var.f22022k) != null) {
                this.f22022k = str;
            }
            if (this.f22020g == -1) {
                this.f22020g = f7l8Var.f22020g;
            }
            if (this.f65788f7l8 == -1) {
                this.f65788f7l8 = f7l8Var.f65788f7l8;
            }
            if (this.f65792n7h == -1) {
                this.f65792n7h = f7l8Var.f65792n7h;
            }
            if (this.f65790kja0 == null && (alignment2 = f7l8Var.f65790kja0) != null) {
                this.f65790kja0 = alignment2;
            }
            if (this.f22021h == null && (alignment = f7l8Var.f22021h) != null) {
                this.f22021h = alignment;
            }
            if (this.f65787cdj == -1) {
                this.f65787cdj = f7l8Var.f65787cdj;
            }
            if (this.f22024p == -1) {
                this.f22024p = f7l8Var.f22024p;
                this.f65791ld6 = f7l8Var.f65791ld6;
            }
            if (this.f65789ki == null) {
                this.f65789ki = f7l8Var.f65789ki;
            }
            if (this.f65794t8r == Float.MAX_VALUE) {
                this.f65794t8r = f7l8Var.f65794t8r;
            }
            if (z2 && !this.f22023n && f7l8Var.f22023n) {
                zurt(f7l8Var.f22025q);
            }
            if (z2 && this.f65793qrj == -1 && (i2 = f7l8Var.f65793qrj) != -1) {
                this.f65793qrj = i2;
            }
        }
        return this;
    }

    public f7l8 a9(@dd Layout.Alignment alignment) {
        this.f22021h = alignment;
        return this;
    }

    public boolean cdj() {
        return this.f65797zy;
    }

    public f7l8 d2ok(boolean z2) {
        this.f65788f7l8 = z2 ? 1 : 0;
        return this;
    }

    public f7l8 d3(@dd Layout.Alignment alignment) {
        this.f65790kja0 = alignment;
        return this;
    }

    public f7l8 eqxt(@dd com.google.android.exoplayer2.text.ttml.toq toqVar) {
        this.f65789ki = toqVar;
        return this;
    }

    @dd
    public String f7l8() {
        return this.f65796x2;
    }

    public boolean fn3e() {
        return this.f65788f7l8 == 1;
    }

    public f7l8 fti(int i2) {
        this.f65792n7h = i2;
        return this;
    }

    public f7l8 fu4(int i2) {
        this.f65795toq = i2;
        this.f65797zy = true;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public int m12946g() {
        return this.f22024p;
    }

    public f7l8 gvn7(float f2) {
        this.f65794t8r = f2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public boolean m12947h() {
        return this.f22023n;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12948i() {
        return this.f22020g == 1;
    }

    public f7l8 jk(boolean z2) {
        this.f22020g = z2 ? 1 : 0;
        return this;
    }

    public f7l8 jp0y(int i2) {
        this.f65793qrj = i2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public f7l8 m12949k(@dd f7l8 f7l8Var) {
        return t8r(f7l8Var, true);
    }

    public f7l8 ki(@dd f7l8 f7l8Var) {
        return t8r(f7l8Var, false);
    }

    @dd
    public com.google.android.exoplayer2.text.ttml.toq kja0() {
        return this.f65789ki;
    }

    public float ld6() {
        return this.f65794t8r;
    }

    public f7l8 mcp(boolean z2) {
        this.f22026s = z2 ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public float m12950n() {
        return this.f65791ld6;
    }

    public boolean n7h() {
        return this.f65787cdj == 1;
    }

    public f7l8 ni7(boolean z2) {
        this.f22027y = z2 ? 1 : 0;
        return this;
    }

    public f7l8 o1t(float f2) {
        this.f65791ld6 = f2;
        return this;
    }

    public f7l8 oc(boolean z2) {
        this.f65787cdj = z2 ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public int m12951p() {
        return this.f65793qrj;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public String m12952q() {
        return this.f22022k;
    }

    @dd
    public Layout.Alignment qrj() {
        return this.f65790kja0;
    }

    /* JADX INFO: renamed from: s */
    public int m12953s() {
        return this.f65792n7h;
    }

    /* JADX INFO: renamed from: t */
    public f7l8 m12954t(@dd String str) {
        this.f65796x2 = str;
        return this;
    }

    public int toq() {
        if (this.f22023n) {
            return this.f22025q;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public f7l8 wvg(int i2) {
        this.f22024p = i2;
        return this;
    }

    public int x2() {
        int i2 = this.f22027y;
        if (i2 == -1 && this.f22026s == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f22026s == 1 ? 2 : 0);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public Layout.Alignment m12955y() {
        return this.f22021h;
    }

    /* JADX INFO: renamed from: z */
    public f7l8 m12956z(@dd String str) {
        this.f22022k = str;
        return this;
    }

    public f7l8 zurt(int i2) {
        this.f22025q = i2;
        this.f22023n = true;
        return this;
    }

    public int zy() {
        if (this.f65797zy) {
            return this.f65795toq;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }
}
