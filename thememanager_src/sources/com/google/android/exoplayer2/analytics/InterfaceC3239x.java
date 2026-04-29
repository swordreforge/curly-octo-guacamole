package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.se;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3839h;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.was;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import com.google.common.base.C4280z;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.x */
/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3239x {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f63257a9 = 1011;

    /* JADX INFO: renamed from: c */
    public static final int f19245c = 1028;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f63258cdj = 16;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f63259d2ok = 1018;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f63260d3 = 1015;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f63261dd = 1021;

    /* JADX INFO: renamed from: e */
    public static final int f19246e = 1032;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f63262ek5k = 1038;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f63263eqxt = 1017;

    /* JADX INFO: renamed from: f */
    public static final int f19247f = 1027;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f63264f7l8 = 6;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f63265fn3e = 1001;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f63266fti = 1012;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f63267fu4 = 1004;

    /* JADX INFO: renamed from: g */
    public static final int f19248g = 5;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f63268gvn7 = 1014;

    /* JADX INFO: renamed from: h */
    public static final int f19249h = 15;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f63269hb = 1034;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int f63270hyr = 1026;

    /* JADX INFO: renamed from: i */
    public static final int f19250i = 1000;

    /* JADX INFO: renamed from: j */
    public static final int f19251j = 1035;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f63271jk = 1010;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f63272jp0y = 1013;

    /* JADX INFO: renamed from: k */
    public static final int f19252k = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f63273ki = 17;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f63274kja0 = 14;

    /* JADX INFO: renamed from: l */
    public static final int f19253l = 1024;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f63275ld6 = 10;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final int f63276lrht = 1029;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f63277lvui = 1019;

    /* JADX INFO: renamed from: m */
    public static final int f19254m = 1037;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f63278mcp = 1009;

    /* JADX INFO: renamed from: n */
    public static final int f19255n = 4;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f63279n5r1 = 1025;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f63280n7h = 13;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f63281ncyb = 1023;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f63282ni7 = 1003;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f63283nn86 = 1033;

    /* JADX INFO: renamed from: o */
    public static final int f19256o = 1036;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f63284o1t = 1006;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f63285oc = 1016;

    /* JADX INFO: renamed from: p */
    public static final int f19257p = 9;

    /* JADX INFO: renamed from: q */
    public static final int f19258q = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f63286qrj = 12;

    /* JADX INFO: renamed from: r */
    public static final int f19259r = 1020;

    /* JADX INFO: renamed from: s */
    public static final int f19260s = 8;

    /* JADX INFO: renamed from: t */
    public static final int f19261t = 1008;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f63287t8r = 18;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63288toq = 1;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f63289uv6 = 1030;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final int f63290vyq = 1031;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f63291wvg = 1007;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f63292x2 = 11;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f63293x9kr = 1022;

    /* JADX INFO: renamed from: y */
    public static final int f19262y = 7;

    /* JADX INFO: renamed from: z */
    public static final int f19263z = 1005;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f63294zurt = 1002;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63295zy = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.x$k */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.x$toq */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final int f63296f7l8;

        /* JADX INFO: renamed from: g */
        public final pc f19264g;

        /* JADX INFO: renamed from: k */
        public final long f19265k;

        /* JADX INFO: renamed from: n */
        public final long f19266n;

        /* JADX INFO: renamed from: p */
        public final long f19267p;

        /* JADX INFO: renamed from: q */
        @zy.dd
        public final fti.C3596k f19268q;

        /* JADX INFO: renamed from: s */
        public final long f19269s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final pc f63297toq;

        /* JADX INFO: renamed from: y */
        @zy.dd
        public final fti.C3596k f19270y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63298zy;

        public toq(long j2, pc pcVar, int i2, @zy.dd fti.C3596k c3596k, long j3, pc pcVar2, int i3, @zy.dd fti.C3596k c3596k2, long j4, long j5) {
            this.f19265k = j2;
            this.f63297toq = pcVar;
            this.f63298zy = i2;
            this.f19268q = c3596k;
            this.f19266n = j3;
            this.f19264g = pcVar2;
            this.f63296f7l8 = i3;
            this.f19270y = c3596k2;
            this.f19269s = j4;
            this.f19267p = j5;
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || toq.class != obj.getClass()) {
                return false;
            }
            toq toqVar = (toq) obj;
            return this.f19265k == toqVar.f19265k && this.f63298zy == toqVar.f63298zy && this.f19266n == toqVar.f19266n && this.f63296f7l8 == toqVar.f63296f7l8 && this.f19269s == toqVar.f19269s && this.f19267p == toqVar.f19267p && C4280z.m15455k(this.f63297toq, toqVar.f63297toq) && C4280z.m15455k(this.f19268q, toqVar.f19268q) && C4280z.m15455k(this.f19264g, toqVar.f19264g) && C4280z.m15455k(this.f19270y, toqVar.f19270y);
        }

        public int hashCode() {
            return C4280z.toq(Long.valueOf(this.f19265k), this.f63297toq, Integer.valueOf(this.f63298zy), this.f19268q, Long.valueOf(this.f19266n), this.f19264g, Integer.valueOf(this.f63296f7l8), this.f19270y, Long.valueOf(this.f19269s), Long.valueOf(this.f19267p));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.x$zy */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final C3839h f19271k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final SparseArray<toq> f63299toq;

        public zy(C3839h c3839h, SparseArray<toq> sparseArray) {
            this.f19271k = c3839h;
            SparseArray<toq> sparseArray2 = new SparseArray<>(c3839h.m13605q());
            for (int i2 = 0; i2 < c3839h.m13605q(); i2++) {
                int iZy = c3839h.zy(i2);
                sparseArray2.append(iZy, (toq) C3844k.f7l8(sparseArray.get(iZy)));
            }
            this.f63299toq = sparseArray2;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11354k(int i2) {
            return this.f19271k.m13604k(i2);
        }

        /* JADX INFO: renamed from: n */
        public int m11355n() {
            return this.f19271k.m13605q();
        }

        /* JADX INFO: renamed from: q */
        public toq m11356q(int i2) {
            return (toq) C3844k.f7l8(this.f63299toq.get(i2));
        }

        public boolean toq(int... iArr) {
            return this.f19271k.toq(iArr);
        }

        public int zy(int i2) {
            return this.f19271k.zy(i2);
        }
    }

    /* JADX INFO: renamed from: a */
    default void mo11322a(toq toqVar, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    default void a9(toq toqVar, int i2) {
    }

    default void a98o(toq toqVar, Exception exc) {
    }

    /* JADX INFO: renamed from: b */
    default void mo11336b(toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    @Deprecated
    default void bf2(toq toqVar, C3629x c3629x, com.google.android.exoplayer2.trackselection.kja0 kja0Var) {
    }

    default void bo(toq toqVar, was wasVar) {
    }

    /* JADX INFO: renamed from: c */
    default void mo11337c(toq toqVar, int i2, long j2, long j3) {
    }

    default void c8jq(toq toqVar, Object obj, long j2) {
    }

    default void cdj(toq toqVar, int i2) {
    }

    default void ch(toq toqVar, gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
    }

    default void d2ok(toq toqVar, int i2, long j2, long j3) {
    }

    default void d3(toq toqVar, long j2) {
    }

    @Deprecated
    default void dd(toq toqVar) {
    }

    default void dr(toq toqVar, boolean z2) {
    }

    /* JADX INFO: renamed from: e */
    default void mo11338e(toq toqVar, int i2) {
    }

    @Deprecated
    default void ek5k(toq toqVar, xwq3 xwq3Var) {
    }

    default void eqxt(toq toqVar) {
    }

    /* JADX INFO: renamed from: f */
    default void mo11339f(toq toqVar, se seVar) {
    }

    @Deprecated
    default void f7l8(toq toqVar, boolean z2) {
    }

    default void fn3e(toq toqVar, int i2, int i3) {
    }

    @Deprecated
    default void fti(toq toqVar) {
    }

    default void fu4(toq toqVar, Exception exc) {
    }

    /* JADX INFO: renamed from: g */
    default void mo11340g(toq toqVar, int i2) {
    }

    @Deprecated
    default void gvn7(toq toqVar) {
    }

    @Deprecated
    default void gyi(toq toqVar, int i2, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    default void m11341h(toq toqVar, boolean z2, int i2) {
    }

    default void hb(toq toqVar) {
    }

    default void hyr(toq toqVar) {
    }

    /* JADX INFO: renamed from: i */
    default void m11342i(toq toqVar, long j2) {
    }

    default void i1(toq toqVar, boolean z2) {
    }

    /* JADX INFO: renamed from: j */
    default void mo11324j(toq toqVar, com.google.android.exoplayer2.video.wvg wvgVar) {
    }

    default void jk(toq toqVar, Exception exc) {
    }

    default void jp0y(toq toqVar, @zy.dd tfm tfmVar, int i2) {
    }

    /* JADX INFO: renamed from: k */
    default void mo11343k(toq toqVar, String str) {
    }

    default void ki(toq toqVar, int i2) {
    }

    default void kja0(gc3c gc3cVar, zy zyVar) {
    }

    /* JADX INFO: renamed from: l */
    default void mo11344l(toq toqVar, yqrt yqrtVar) {
    }

    @Deprecated
    default void ld6(toq toqVar, int i2, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    default void lrht(toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    @Deprecated
    default void lvui(toq toqVar, int i2, int i3, int i4, float f2) {
    }

    default void mcp(toq toqVar, long j2) {
    }

    /* JADX INFO: renamed from: n */
    default void mo11345n(toq toqVar) {
    }

    @Deprecated
    default void n5r1(toq toqVar, int i2) {
    }

    default void n7h(toq toqVar, Metadata metadata) {
    }

    @Deprecated
    default void ncyb(toq toqVar, int i2, String str, long j2) {
    }

    default void ni7(toq toqVar, int i2, long j2) {
    }

    default void nmn5(toq toqVar, String str) {
    }

    default void nn86(toq toqVar, C3248g c3248g) {
    }

    default void o1t(toq toqVar, boolean z2, int i2) {
    }

    default void oc(toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    /* JADX INFO: renamed from: p */
    default void mo11325p(toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar, IOException iOException, boolean z2) {
    }

    /* JADX INFO: renamed from: q */
    default void mo11326q(toq toqVar, Exception exc) {
    }

    @Deprecated
    default void qrj(toq toqVar, String str, long j2) {
    }

    @Deprecated
    /* JADX INFO: renamed from: r */
    default void m11346r(toq toqVar, int i2, xwq3 xwq3Var) {
    }

    /* JADX INFO: renamed from: s */
    default void mo11347s(toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    /* JADX INFO: renamed from: t */
    default void mo11348t(toq toqVar, xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
    }

    @Deprecated
    default void t8iq(toq toqVar, String str, long j2) {
    }

    @Deprecated
    default void t8r(toq toqVar, xwq3 xwq3Var) {
    }

    default void toq(toq toqVar, long j2, int i2) {
    }

    /* JADX INFO: renamed from: u */
    default void mo11349u(toq toqVar, xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
    }

    default void uv6(toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    /* JADX INFO: renamed from: v */
    default void m11350v(toq toqVar, long j2) {
    }

    default void vyq(toq toqVar, String str, long j2, long j3) {
    }

    default void wvg(toq toqVar, String str, long j2, long j3) {
    }

    /* JADX INFO: renamed from: x */
    default void mo11351x(toq toqVar, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    default void x2(toq toqVar, pjz9 pjz9Var) {
    }

    default void x9kr(toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    /* JADX INFO: renamed from: y */
    default void m11352y(toq toqVar, was wasVar) {
    }

    default void y2(toq toqVar, gc3c.zy zyVar) {
    }

    default void y9n(toq toqVar, float f2) {
    }

    default void yz(toq toqVar) {
    }

    /* JADX INFO: renamed from: z */
    default void mo11353z(toq toqVar, boolean z2) {
    }

    default void zp(toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    default void zurt(toq toqVar, boolean z2) {
    }

    default void zy(toq toqVar, int i2) {
    }
}
