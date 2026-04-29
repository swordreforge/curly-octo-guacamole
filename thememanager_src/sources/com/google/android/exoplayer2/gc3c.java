package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.trackselection.C3707i;
import com.google.android.exoplayer2.util.C3839h;
import com.google.android.exoplayer2.util.C3853q;
import com.google.common.base.C4280z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes2.dex */
public interface gc3c {

    /* JADX INFO: renamed from: a */
    public static final int f20488a = 13;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f64731a9 = 2;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final int f64732a98o = 12;

    /* JADX INFO: renamed from: b */
    public static final int f20489b = 10;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    @Deprecated
    public static final int f64733bf2 = 10;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f64734bo = 21;

    /* JADX INFO: renamed from: c */
    public static final int f20490c = 19;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final int f64735c8jq = 23;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f64736cdj = 0;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final int f64737ch = 16;

    /* JADX INFO: renamed from: d */
    public static final int f20491d = 29;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f64738d2ok = 9;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f64739d3 = 6;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f64740dd = 12;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public static final int f64741dr = 25;

    /* JADX INFO: renamed from: e */
    public static final int f20492e = 4;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f64742ek5k = 8;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f64743eqxt = 8;

    /* JADX INFO: renamed from: f */
    public static final int f20493f = 18;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f64744f7l8 = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f64745fn3e = 4;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f64746fti = 3;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f64747fu4 = 1;

    /* JADX INFO: renamed from: g */
    public static final int f20494g = 4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f64748gvn7 = 5;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final int f64749gyi = 24;

    /* JADX INFO: renamed from: h */
    public static final int f20495h = 2;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    @Deprecated
    public static final int f64750hb = 5;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int f64751hyr = 17;

    /* JADX INFO: renamed from: i */
    public static final int f20496i = 3;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f64752i1 = 11;

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    public static final int f64753ikck = 28;

    /* JADX INFO: renamed from: j */
    public static final int f20497j = 6;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f64754jk = 1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f64755jp0y = 4;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f64756ki = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f64757kja0 = 1;

    /* JADX INFO: renamed from: l */
    public static final int f20498l = 15;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f64758ld6 = 5;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final int f64759lrht = 1;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final int f64760lv5 = 18;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f64761lvui = 10;

    /* JADX INFO: renamed from: m */
    public static final int f20499m = 7;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f64762mcp = 0;

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    public static final int f64763mu = 30;

    /* JADX INFO: renamed from: n */
    public static final int f20500n = 3;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f64764n5r1 = 16;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f64765n7h = 0;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f64766ncyb = 14;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f64767ni7 = 0;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final int f64768nmn5 = 17;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f64769nn86 = 5;

    /* JADX INFO: renamed from: o */
    @Deprecated
    public static final int f20501o = 6;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f64770o1t = 1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f64771oc = 7;

    /* JADX INFO: renamed from: p */
    public static final int f20502p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f20503q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f64772qrj = 1;

    /* JADX INFO: renamed from: r */
    public static final int f20504r = 11;

    /* JADX INFO: renamed from: s */
    public static final int f20505s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f20506t = 3;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final int f64773t8iq = 19;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f64774t8r = 2;

    /* JADX INFO: renamed from: u */
    public static final int f20507u = 20;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f64775uv6 = 2;

    /* JADX INFO: renamed from: v */
    public static final int f20508v = 27;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    public static final int f64776vq = -1;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final int f64777vyq = 3;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f64778wvg = 2;

    /* JADX INFO: renamed from: x */
    public static final int f20509x = 15;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f64779x2 = 0;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f64780x9kr = 13;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final int f64781xwq3 = 26;

    /* JADX INFO: renamed from: y */
    public static final int f20510y = 2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f64782y2 = 22;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f64783y9n = 9;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    @Deprecated
    public static final int f64784yz = 8;

    /* JADX INFO: renamed from: z */
    public static final int f20511z = 0;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final int f64785zp = 14;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f64786zurt = 5;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64787zy = 1;

    /* JADX INFO: compiled from: Player.java */
    public static final class f7l8 {

        /* JADX INFO: renamed from: k */
        private final C3839h f20512k;

        public f7l8(C3839h c3839h) {
            this.f20512k = c3839h;
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f7l8) {
                return this.f20512k.equals(((f7l8) obj).f20512k);
            }
            return false;
        }

        public int hashCode() {
            return this.f20512k.hashCode();
        }

        /* JADX INFO: renamed from: k */
        public boolean m12094k(int i2) {
            return this.f20512k.m13604k(i2);
        }

        /* JADX INFO: renamed from: q */
        public int m12095q() {
            return this.f20512k.m13605q();
        }

        public boolean toq(int... iArr) {
            return this.f20512k.toq(iArr);
        }

        public int zy(int i2) {
            return this.f20512k.zy(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$g */
    /* JADX INFO: compiled from: Player.java */
    @Deprecated
    public interface InterfaceC3434g {
        default void a98o(long j2) {
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        default void mo11364e() {
        }

        /* JADX INFO: renamed from: f */
        default void mo12096f(C3707i c3707i) {
        }

        default void fn3e(boolean z2) {
        }

        default void fu4(gc3c gc3cVar, f7l8 f7l8Var) {
        }

        /* JADX INFO: renamed from: g */
        default void mo11365g(int i2) {
        }

        @Deprecated
        default void jk(boolean z2) {
        }

        default void ki(@zy.dd yqrt yqrtVar) {
        }

        default void kja0(long j2) {
        }

        default void ld6(int i2) {
        }

        @Deprecated
        /* JADX INFO: renamed from: m */
        default void mo6500m(boolean z2, int i2) {
        }

        default void mcp(boolean z2) {
        }

        /* JADX INFO: renamed from: n */
        default void mo11370n(x2 x2Var, x2 x2Var2, int i2) {
        }

        @Deprecated
        default void n5r1(C3629x c3629x, com.google.android.exoplayer2.trackselection.kja0 kja0Var) {
        }

        default void ni7(yqrt yqrtVar) {
        }

        default void o1t(@zy.dd tfm tfmVar, int i2) {
        }

        default void onRepeatModeChanged(int i2) {
        }

        /* JADX INFO: renamed from: p */
        default void mo11372p(pc pcVar, int i2) {
        }

        /* JADX INFO: renamed from: q */
        default void mo11373q(se seVar) {
        }

        default void qrj(boolean z2) {
        }

        /* JADX INFO: renamed from: s */
        default void mo11374s(zy zyVar) {
        }

        /* JADX INFO: renamed from: t */
        default void mo11375t(was wasVar) {
        }

        @Deprecated
        default void uv6(int i2) {
        }

        default void wvg(boolean z2, int i2) {
        }

        default void x2(was wasVar) {
        }

        /* JADX INFO: renamed from: y */
        default void mo11377y(pjz9 pjz9Var) {
        }

        /* JADX INFO: renamed from: z */
        default void mo11378z(long j2) {
        }
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface kja0 {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ld6 {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$n */
    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3436n {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface n7h {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$p */
    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3437p {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$q */
    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3438q {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface qrj {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$s */
    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3439s {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class x2 implements InterfaceC3555s {

        /* JADX INFO: renamed from: c */
        private static final int f20513c = 4;

        /* JADX INFO: renamed from: e */
        private static final int f20514e = 5;

        /* JADX INFO: renamed from: f */
        private static final int f20515f = 3;

        /* JADX INFO: renamed from: j */
        private static final int f20516j = 6;

        /* JADX INFO: renamed from: l */
        private static final int f20517l = 2;

        /* JADX INFO: renamed from: o */
        public static final InterfaceC3555s.k<x2> f20518o = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.bz2
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return gc3c.x2.toq(bundle);
            }
        };

        /* JADX INFO: renamed from: r */
        private static final int f20519r = 1;

        /* JADX INFO: renamed from: t */
        private static final int f20520t = 0;

        /* JADX INFO: renamed from: g */
        @zy.dd
        public final tfm f20521g;

        /* JADX INFO: renamed from: h */
        public final long f20522h;

        /* JADX INFO: renamed from: i */
        public final int f20523i;

        /* JADX INFO: renamed from: k */
        @zy.dd
        public final Object f20524k;

        /* JADX INFO: renamed from: n */
        public final int f20525n;

        /* JADX INFO: renamed from: p */
        public final long f20526p;

        /* JADX INFO: renamed from: q */
        @Deprecated
        public final int f20527q;

        /* JADX INFO: renamed from: s */
        public final int f20528s;

        /* JADX INFO: renamed from: y */
        @zy.dd
        public final Object f20529y;

        /* JADX INFO: renamed from: z */
        public final int f20530z;

        @Deprecated
        public x2(@zy.dd Object obj, int i2, @zy.dd Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this(obj, i2, tfm.f22141i, obj2, i3, j2, j3, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static x2 toq(Bundle bundle) {
            return new x2(null, bundle.getInt(zy(0), -1), (tfm) C3853q.m13718n(tfm.f22139f, bundle.getBundle(zy(1))), null, bundle.getInt(zy(2), -1), bundle.getLong(zy(3), C3548p.f65257toq), bundle.getLong(zy(4), C3548p.f65257toq), bundle.getInt(zy(5), -1), bundle.getInt(zy(6), -1));
        }

        private static String zy(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || x2.class != obj.getClass()) {
                return false;
            }
            x2 x2Var = (x2) obj;
            return this.f20525n == x2Var.f20525n && this.f20528s == x2Var.f20528s && this.f20526p == x2Var.f20526p && this.f20522h == x2Var.f20522h && this.f20523i == x2Var.f20523i && this.f20530z == x2Var.f20530z && C4280z.m15455k(this.f20524k, x2Var.f20524k) && C4280z.m15455k(this.f20529y, x2Var.f20529y) && C4280z.m15455k(this.f20521g, x2Var.f20521g);
        }

        public int hashCode() {
            return C4280z.toq(this.f20524k, Integer.valueOf(this.f20525n), this.f20521g, this.f20529y, Integer.valueOf(this.f20528s), Long.valueOf(this.f20526p), Long.valueOf(this.f20522h), Integer.valueOf(this.f20523i), Integer.valueOf(this.f20530z));
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(zy(0), this.f20525n);
            bundle.putBundle(zy(1), C3853q.m13719p(this.f20521g));
            bundle.putInt(zy(2), this.f20528s);
            bundle.putLong(zy(3), this.f20526p);
            bundle.putLong(zy(4), this.f20522h);
            bundle.putInt(zy(5), this.f20523i);
            bundle.putInt(zy(6), this.f20530z);
            return bundle;
        }

        public x2(@zy.dd Object obj, int i2, @zy.dd tfm tfmVar, @zy.dd Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this.f20524k = obj;
            this.f20527q = i2;
            this.f20525n = i2;
            this.f20521g = tfmVar;
            this.f20529y = obj2;
            this.f20528s = i3;
            this.f20526p = j2;
            this.f20522h = j3;
            this.f20523i = i4;
            this.f20530z = i5;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$y */
    /* JADX INFO: compiled from: Player.java */
    public interface InterfaceC3440y extends InterfaceC3434g {
        /* JADX INFO: renamed from: c */
        default void mo11363c(int i2, int i3) {
        }

        default void cdj(com.google.android.exoplayer2.video.wvg wvgVar) {
        }

        default void d2ok(C3443h c3443h) {
        }

        default void ek5k(C3248g c3248g) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void fn3e(boolean z2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void fu4(gc3c gc3cVar, f7l8 f7l8Var) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: g */
        default void mo11365g(int i2) {
        }

        /* JADX INFO: renamed from: h */
        default void mo12098h(List<com.google.android.exoplayer2.text.toq> list) {
        }

        default void hb(float f2) {
        }

        /* JADX INFO: renamed from: k */
        default void mo11368k(boolean z2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void ki(@zy.dd yqrt yqrtVar) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void kja0(long j2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void ld6(int i2) {
        }

        default void lvui(int i2, boolean z2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void mcp(boolean z2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: n */
        default void mo11370n(x2 x2Var, x2 x2Var2, int i2) {
        }

        default void n7h(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void ni7(yqrt yqrtVar) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void o1t(@zy.dd tfm tfmVar, int i2) {
        }

        default void oc(int i2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void onRepeatModeChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: p */
        default void mo11372p(pc pcVar, int i2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: q */
        default void mo11373q(se seVar) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void qrj(boolean z2) {
        }

        /* JADX INFO: renamed from: r */
        default void mo6501r() {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: s */
        default void mo11374s(zy zyVar) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: t */
        default void mo11375t(was wasVar) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void wvg(boolean z2, int i2) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        default void x2(was wasVar) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: y */
        default void mo11377y(pjz9 pjz9Var) {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: z */
        default void mo11378z(long j2) {
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class zy implements InterfaceC3555s {

        /* JADX INFO: renamed from: n */
        private static final int f20532n = 0;

        /* JADX INFO: renamed from: k */
        private final C3839h f20534k;

        /* JADX INFO: renamed from: q */
        public static final zy f20533q = new C3441k().m12104g();

        /* JADX INFO: renamed from: g */
        public static final InterfaceC3555s.k<zy> f20531g = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.zkd
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return gc3c.zy.m12100n(bundle);
            }
        };

        /* JADX INFO: renamed from: com.google.android.exoplayer2.gc3c$zy$k */
        /* JADX INFO: compiled from: Player.java */
        public static final class C3441k {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private static final int[] f64788toq = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* JADX INFO: renamed from: k */
            private final C3839h.toq f20535k;

            public C3441k f7l8(int i2) {
                this.f20535k.m13606g(i2);
                return this;
            }

            /* JADX INFO: renamed from: g */
            public zy m12104g() {
                return new zy(this.f20535k.m13608n());
            }

            /* JADX INFO: renamed from: k */
            public C3441k m12105k(int i2) {
                this.f20535k.m13607k(i2);
                return this;
            }

            /* JADX INFO: renamed from: n */
            public C3441k m12106n(int i2, boolean z2) {
                this.f20535k.m13609q(i2, z2);
                return this;
            }

            /* JADX INFO: renamed from: q */
            public C3441k m12107q() {
                this.f20535k.zy(f64788toq);
                return this;
            }

            /* JADX INFO: renamed from: s */
            public C3441k m12108s(int i2, boolean z2) {
                this.f20535k.m13610y(i2, z2);
                return this;
            }

            public C3441k toq(zy zyVar) {
                this.f20535k.toq(zyVar.f20534k);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public C3441k m12109y(int... iArr) {
                this.f20535k.f7l8(iArr);
                return this;
            }

            public C3441k zy(int... iArr) {
                this.f20535k.zy(iArr);
                return this;
            }

            public C3441k() {
                this.f20535k = new C3839h.toq();
            }

            private C3441k(zy zyVar) {
                C3839h.toq toqVar = new C3839h.toq();
                this.f20535k = toqVar;
                toqVar.toq(zyVar.f20534k);
            }
        }

        private static String f7l8(int i2) {
            return Integer.toString(i2, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static zy m12100n(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f7l8(0));
            if (integerArrayList == null) {
                return f20533q;
            }
            C3441k c3441k = new C3441k();
            for (int i2 = 0; i2 < integerArrayList.size(); i2++) {
                c3441k.m12105k(integerArrayList.get(i2).intValue());
            }
            return c3441k.m12104g();
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zy) {
                return this.f20534k.equals(((zy) obj).f20534k);
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m12101g(int i2) {
            return this.f20534k.zy(i2);
        }

        public int hashCode() {
            return this.f20534k.hashCode();
        }

        /* JADX INFO: renamed from: q */
        public boolean m12102q(int i2) {
            return this.f20534k.m13604k(i2);
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < this.f20534k.m13605q(); i2++) {
                arrayList.add(Integer.valueOf(this.f20534k.zy(i2)));
            }
            bundle.putIntegerArrayList(f7l8(0), arrayList);
            return bundle;
        }

        /* JADX INFO: renamed from: y */
        public int m12103y() {
            return this.f20534k.m13605q();
        }

        public C3441k zy() {
            return new C3441k();
        }

        private zy(C3839h c3839h) {
            this.f20534k = c3839h;
        }
    }

    void a9(@zy.dd TextureView textureView);

    /* JADX INFO: renamed from: b */
    void mo12078b(int i2);

    void b3e(tfm tfmVar);

    void b8(int i2, int i3, int i4);

    @Deprecated
    boolean b9ub();

    @Deprecated
    int bap7();

    int bf2();

    void bo();

    @Deprecated
    void bwp(boolean z2);

    long bz2();

    @zy.a9(from = 0, to = 100)
    /* JADX INFO: renamed from: c */
    int mo12079c();

    void cfr(int i2, long j2);

    void ch();

    void cnbm(int i2, int i3);

    boolean cv06();

    /* JADX INFO: renamed from: d */
    boolean mo12080d(int i2);

    void d3();

    pc d8wk();

    @Deprecated
    boolean dd();

    @Deprecated
    /* JADX INFO: renamed from: do, reason: not valid java name */
    boolean mo28264do();

    boolean dr();

    /* JADX INFO: renamed from: e */
    void mo12081e(InterfaceC3440y interfaceC3440y);

    was e5();

    void ebn(List<tfm> list, int i2, long j2);

    @Deprecated
    void ek5k();

    boolean eqxt();

    se f7l8();

    boolean fnq8();

    com.google.android.exoplayer2.video.wvg fti();

    void fu4(@zy.dd SurfaceHolder surfaceHolder);

    Looper g1();

    void ga(C3707i c3707i);

    C3707i gbni();

    @Deprecated
    int gcp();

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    C3443h gvn7();

    /* JADX INFO: renamed from: h */
    void mo12082h(@zy.dd SurfaceView surfaceView);

    long h4b();

    int h7am();

    @Deprecated
    boolean hasNext();

    @Deprecated
    boolean hasPrevious();

    void hb();

    /* JADX INFO: renamed from: i */
    void mo12083i(boolean z2);

    long ij();

    boolean isPlaying();

    boolean ix();

    /* JADX INFO: renamed from: j */
    void mo12084j(List<tfm> list, boolean z2);

    @zy.zurt(from = 0.0d, to = 1.0d)
    float jp0y();

    long jz5();

    /* JADX INFO: renamed from: k */
    boolean mo12085k();

    void kcsr(boolean z2);

    List<com.google.android.exoplayer2.text.toq> ki();

    long kiv();

    void kja0();

    int ktq();

    @zy.dd
    /* JADX INFO: renamed from: l */
    tfm mo12086l();

    void ld6(se seVar);

    void lh(int i2, List<tfm> list);

    int lrht();

    void lvui(@zy.a9(from = 0) int i2);

    int lw();

    void m2t();

    @zy.dd
    /* JADX INFO: renamed from: n */
    yqrt mo12087n();

    long n2t();

    void n7h(@zy.dd Surface surface);

    void ncyb();

    @Deprecated
    void next();

    void ngy(InterfaceC3440y interfaceC3440y);

    void ni7(@zy.dd TextureView textureView);

    void nmn5(boolean z2);

    void nn86();

    void nnh(int i2, tfm tfmVar);

    void nsb(was wasVar);

    void oc(@zy.dd SurfaceView surfaceView);

    void pause();

    void pc(int i2);

    void play();

    void prepare();

    @Deprecated
    void previous();

    void ps();

    @Deprecated
    com.google.android.exoplayer2.trackselection.kja0 py();

    int qo();

    void qrj(@zy.dd Surface surface);

    /* JADX INFO: renamed from: r */
    boolean mo12088r();

    void r25n(List<tfm> list);

    was ra();

    void release();

    /* JADX INFO: renamed from: s */
    C3248g mo12089s();

    void seekTo(long j2);

    void setPlaybackSpeed(@zy.zurt(from = 0.0d, fromInclusive = false) float f2);

    void setRepeatMode(int i2);

    long sok();

    void stop();

    @Deprecated
    void t8iq();

    pjz9 tfm();

    void toq(@zy.zurt(from = 0.0d, to = 1.0d) float f2);

    @zy.dd
    /* JADX INFO: renamed from: u */
    Object mo12090u();

    void uf(List<tfm> list);

    @Deprecated
    boolean uv6();

    /* JADX INFO: renamed from: v */
    int mo12091v();

    void vep5(tfm tfmVar, long j2);

    /* JADX INFO: renamed from: w */
    long mo12092w();

    zy w831();

    boolean wlev();

    @Deprecated
    C3629x wo();

    @zy.a9(from = 0)
    int wvg();

    @Deprecated
    /* JADX INFO: renamed from: x */
    int mo12093x();

    long x9kr();

    int xwq3();

    boolean y9n();

    void yl(tfm tfmVar, boolean z2);

    boolean yqrt();

    @Deprecated
    boolean yz();

    void z4(tfm tfmVar);

    boolean z4t();

    tfm zkd(int i2);

    void zp(int i2, int i3);

    void zsr0();

    void zurt();

    void zy(@zy.dd SurfaceHolder surfaceHolder);
}
