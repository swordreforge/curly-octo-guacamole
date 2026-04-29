package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import com.google.common.primitives.C4746s;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.i */
/* JADX INFO: compiled from: TrackSelectionParameters.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3707i implements InterfaceC3555s {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f66012ab = 2;
    private static final int ac = 16;
    private static final int ad = 17;
    private static final int aj = 21;
    private static final int am = 18;
    private static final int an = 6;
    private static final int ar = 24;
    private static final int as = 10;
    private static final int ax = 14;
    private static final int ay = 19;
    private static final int az = 12;
    private static final int ba = 13;
    private static final int bb = 3;
    private static final int bc = 25;
    private static final int be = 20;
    private static final int bg = 11;
    private static final int bl = 9;
    private static final int bp = 4;
    private static final int bq = 15;
    private static final int bs = 22;
    public static final InterfaceC3555s.k<C3707i> bu;
    private static final int bv = 5;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final C3707i f22280d;
    private static final int id = 7;
    private static final int in = 8;
    private static final int k0 = 23;

    /* JADX INFO: renamed from: v */
    public static final C3707i f22281v;

    /* JADX INFO: renamed from: w */
    private static final int f22282w = 1;

    /* JADX INFO: renamed from: a */
    public final boolean f22283a;

    /* JADX INFO: renamed from: b */
    public final boolean f22284b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public final vep5<Integer> f66013bo;

    /* JADX INFO: renamed from: c */
    public final int f22285c;

    /* JADX INFO: renamed from: e */
    public final int f22286e;

    /* JADX INFO: renamed from: f */
    public final int f22287f;

    /* JADX INFO: renamed from: g */
    public final int f22288g;

    /* JADX INFO: renamed from: h */
    public final int f22289h;

    /* JADX INFO: renamed from: i */
    public final int f22290i;

    /* JADX INFO: renamed from: j */
    public final se<String> f22291j;

    /* JADX INFO: renamed from: k */
    public final int f22292k;

    /* JADX INFO: renamed from: l */
    public final se<String> f22293l;

    /* JADX INFO: renamed from: m */
    public final int f22294m;

    /* JADX INFO: renamed from: n */
    public final int f22295n;

    /* JADX INFO: renamed from: o */
    public final se<String> f22296o;

    /* JADX INFO: renamed from: p */
    public final int f22297p;

    /* JADX INFO: renamed from: q */
    public final int f22298q;

    /* JADX INFO: renamed from: r */
    public final se<String> f22299r;

    /* JADX INFO: renamed from: s */
    public final int f22300s;

    /* JADX INFO: renamed from: t */
    public final boolean f22301t;

    /* JADX INFO: renamed from: u */
    public final cdj f22302u;

    /* JADX INFO: renamed from: x */
    public final boolean f22303x;

    /* JADX INFO: renamed from: y */
    public final int f22304y;

    /* JADX INFO: renamed from: z */
    public final int f22305z;

    static {
        C3707i c3707iMo13111z = new k().mo13111z();
        f22281v = c3707iMo13111z;
        f22280d = c3707iMo13111z;
        bu = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.trackselection.t8r
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return C3707i.m13118g(bundle);
            }
        };
    }

    protected C3707i(k kVar) {
        this.f22292k = kVar.f22309k;
        this.f22298q = kVar.f66025toq;
        this.f22295n = kVar.f66028zy;
        this.f22288g = kVar.f22312q;
        this.f22304y = kVar.f22310n;
        this.f22300s = kVar.f22306g;
        this.f22297p = kVar.f66015f7l8;
        this.f22289h = kVar.f22314y;
        this.f22290i = kVar.f22313s;
        this.f22305z = kVar.f22311p;
        this.f22301t = kVar.f66020ld6;
        this.f22299r = kVar.f66026x2;
        this.f22293l = kVar.f66023qrj;
        this.f22287f = kVar.f66021n7h;
        this.f22285c = kVar.f66019kja0;
        this.f22286e = kVar.f22307h;
        this.f22291j = kVar.f66014cdj;
        this.f22296o = kVar.f66018ki;
        this.f22294m = kVar.f66024t8r;
        this.f22284b = kVar.f22308i;
        this.f22283a = kVar.f66016fn3e;
        this.f22303x = kVar.f66027zurt;
        this.f22302u = kVar.f66022ni7;
        this.f66013bo = kVar.f66017fu4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C3707i m13118g(Bundle bundle) {
        return new k(bundle).mo13111z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static String m13120n(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: renamed from: q */
    public static C3707i m13121q(Context context) {
        return new k(context).mo13111z();
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3707i c3707i = (C3707i) obj;
        return this.f22292k == c3707i.f22292k && this.f22298q == c3707i.f22298q && this.f22295n == c3707i.f22295n && this.f22288g == c3707i.f22288g && this.f22304y == c3707i.f22304y && this.f22300s == c3707i.f22300s && this.f22297p == c3707i.f22297p && this.f22289h == c3707i.f22289h && this.f22301t == c3707i.f22301t && this.f22290i == c3707i.f22290i && this.f22305z == c3707i.f22305z && this.f22299r.equals(c3707i.f22299r) && this.f22293l.equals(c3707i.f22293l) && this.f22287f == c3707i.f22287f && this.f22285c == c3707i.f22285c && this.f22286e == c3707i.f22286e && this.f22291j.equals(c3707i.f22291j) && this.f22296o.equals(c3707i.f22296o) && this.f22294m == c3707i.f22294m && this.f22284b == c3707i.f22284b && this.f22283a == c3707i.f22283a && this.f22303x == c3707i.f22303x && this.f22302u.equals(c3707i.f22302u) && this.f66013bo.equals(c3707i.f66013bo);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((this.f22292k + 31) * 31) + this.f22298q) * 31) + this.f22295n) * 31) + this.f22288g) * 31) + this.f22304y) * 31) + this.f22300s) * 31) + this.f22297p) * 31) + this.f22289h) * 31) + (this.f22301t ? 1 : 0)) * 31) + this.f22290i) * 31) + this.f22305z) * 31) + this.f22299r.hashCode()) * 31) + this.f22293l.hashCode()) * 31) + this.f22287f) * 31) + this.f22285c) * 31) + this.f22286e) * 31) + this.f22291j.hashCode()) * 31) + this.f22296o.hashCode()) * 31) + this.f22294m) * 31) + (this.f22284b ? 1 : 0)) * 31) + (this.f22283a ? 1 : 0)) * 31) + (this.f22303x ? 1 : 0)) * 31) + this.f22302u.hashCode()) * 31) + this.f66013bo.hashCode();
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m13120n(6), this.f22292k);
        bundle.putInt(m13120n(7), this.f22298q);
        bundle.putInt(m13120n(8), this.f22295n);
        bundle.putInt(m13120n(9), this.f22288g);
        bundle.putInt(m13120n(10), this.f22304y);
        bundle.putInt(m13120n(11), this.f22300s);
        bundle.putInt(m13120n(12), this.f22297p);
        bundle.putInt(m13120n(13), this.f22289h);
        bundle.putInt(m13120n(14), this.f22290i);
        bundle.putInt(m13120n(15), this.f22305z);
        bundle.putBoolean(m13120n(16), this.f22301t);
        bundle.putStringArray(m13120n(17), (String[]) this.f22299r.toArray(new String[0]));
        bundle.putStringArray(m13120n(1), (String[]) this.f22293l.toArray(new String[0]));
        bundle.putInt(m13120n(2), this.f22287f);
        bundle.putInt(m13120n(18), this.f22285c);
        bundle.putInt(m13120n(19), this.f22286e);
        bundle.putStringArray(m13120n(20), (String[]) this.f22291j.toArray(new String[0]));
        bundle.putStringArray(m13120n(3), (String[]) this.f22296o.toArray(new String[0]));
        bundle.putInt(m13120n(4), this.f22294m);
        bundle.putBoolean(m13120n(5), this.f22284b);
        bundle.putBoolean(m13120n(21), this.f22283a);
        bundle.putBoolean(m13120n(22), this.f22303x);
        bundle.putBundle(m13120n(23), this.f22302u.toBundle());
        bundle.putIntArray(m13120n(25), C4746s.m16720t(this.f66013bo));
        return bundle;
    }

    public k zy() {
        return new k(this);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.i$k */
    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static class k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private se<String> f66014cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f66015f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private boolean f66016fn3e;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private vep5<Integer> f66017fu4;

        /* JADX INFO: renamed from: g */
        private int f22306g;

        /* JADX INFO: renamed from: h */
        private int f22307h;

        /* JADX INFO: renamed from: i */
        private boolean f22308i;

        /* JADX INFO: renamed from: k */
        private int f22309k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private se<String> f66018ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private int f66019kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f66020ld6;

        /* JADX INFO: renamed from: n */
        private int f22310n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private int f66021n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private cdj f66022ni7;

        /* JADX INFO: renamed from: p */
        private int f22311p;

        /* JADX INFO: renamed from: q */
        private int f22312q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private se<String> f66023qrj;

        /* JADX INFO: renamed from: s */
        private int f22313s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private int f66024t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f66025toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private se<String> f66026x2;

        /* JADX INFO: renamed from: y */
        private int f22314y;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private boolean f66027zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f66028zy;

        @Deprecated
        public k() {
            this.f22309k = Integer.MAX_VALUE;
            this.f66025toq = Integer.MAX_VALUE;
            this.f66028zy = Integer.MAX_VALUE;
            this.f22312q = Integer.MAX_VALUE;
            this.f22313s = Integer.MAX_VALUE;
            this.f22311p = Integer.MAX_VALUE;
            this.f66020ld6 = true;
            this.f66026x2 = se.of();
            this.f66023qrj = se.of();
            this.f66021n7h = 0;
            this.f66019kja0 = Integer.MAX_VALUE;
            this.f22307h = Integer.MAX_VALUE;
            this.f66014cdj = se.of();
            this.f66018ki = se.of();
            this.f66024t8r = 0;
            this.f22308i = false;
            this.f66016fn3e = false;
            this.f66027zurt = false;
            this.f66022ni7 = cdj.f22225q;
            this.f66017fu4 = vep5.of();
        }

        private static se<String> mcp(String[] strArr) {
            se.C4520k c4520kBuilder = se.builder();
            for (String str : (String[]) C3844k.f7l8(strArr)) {
                c4520kBuilder.mo15569k(lrht.sok((String) C3844k.f7l8(str)));
            }
            return c4520kBuilder.mo15570n();
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "trackSelectionOverrides", "disabledTrackTypes"})
        /* JADX INFO: renamed from: t */
        private void m13130t(C3707i c3707i) {
            this.f22309k = c3707i.f22292k;
            this.f66025toq = c3707i.f22298q;
            this.f66028zy = c3707i.f22295n;
            this.f22312q = c3707i.f22288g;
            this.f22310n = c3707i.f22304y;
            this.f22306g = c3707i.f22300s;
            this.f66015f7l8 = c3707i.f22297p;
            this.f22314y = c3707i.f22289h;
            this.f22313s = c3707i.f22290i;
            this.f22311p = c3707i.f22305z;
            this.f66020ld6 = c3707i.f22301t;
            this.f66026x2 = c3707i.f22299r;
            this.f66023qrj = c3707i.f22293l;
            this.f66021n7h = c3707i.f22287f;
            this.f66019kja0 = c3707i.f22285c;
            this.f22307h = c3707i.f22286e;
            this.f66014cdj = c3707i.f22291j;
            this.f66018ki = c3707i.f22296o;
            this.f66024t8r = c3707i.f22294m;
            this.f22308i = c3707i.f22284b;
            this.f66016fn3e = c3707i.f22283a;
            this.f66027zurt = c3707i.f22303x;
            this.f66022ni7 = c3707i.f22302u;
            this.f66017fu4 = c3707i.f66013bo;
        }

        @hyr(19)
        private void uv6(Context context) {
            CaptioningManager captioningManager;
            if ((lrht.f23230k >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f66024t8r = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f66018ki = se.of(lrht.m13653b(locale));
                }
            }
        }

        public k a9(Set<Integer> set) {
            this.f66017fu4 = vep5.copyOf((Collection) set);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public k mo13101c(@dd String str) {
            return str == null ? vyq(new String[0]) : vyq(str);
        }

        public k d2ok(int i2, int i3) {
            this.f22309k = i2;
            this.f66025toq = i3;
            return this;
        }

        public k d3(int i2) {
            this.f66019kja0 = i2;
            return this;
        }

        public k dd(int i2) {
            this.f66015f7l8 = i2;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public k mo13103e(int i2) {
            this.f66024t8r = i2;
            return this;
        }

        public k ek5k(Context context, boolean z2) {
            Point pointM13654c = lrht.m13654c(context);
            return mo13107m(pointM13654c.x, pointM13654c.y, z2);
        }

        public k eqxt(int i2) {
            this.f66028zy = i2;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public k mo13104f(int i2) {
            this.f66021n7h = i2;
            return this;
        }

        public k fti(boolean z2) {
            this.f66027zurt = z2;
            return this;
        }

        public k gvn7(int i2) {
            this.f22307h = i2;
            return this;
        }

        public k hb(String... strArr) {
            this.f66026x2 = se.copyOf(strArr);
            return this;
        }

        public k hyr(String... strArr) {
            this.f66014cdj = se.copyOf(strArr);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public k mo13105j(boolean z2) {
            this.f22308i = z2;
            return this;
        }

        protected k jk(C3707i c3707i) {
            m13130t(c3707i);
            return this;
        }

        public k jp0y(boolean z2) {
            this.f66016fn3e = z2;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public k mo13106l(String... strArr) {
            this.f66023qrj = mcp(strArr);
            return this;
        }

        public k lrht(Context context) {
            if (lrht.f23230k >= 19) {
                uv6(context);
            }
            return this;
        }

        public k lvui() {
            return d2ok(C3708k.f66033mcp, C3708k.f66031jk);
        }

        /* JADX INFO: renamed from: m */
        public k mo13107m(int i2, int i3, boolean z2) {
            this.f22313s = i2;
            this.f22311p = i3;
            this.f66020ld6 = z2;
            return this;
        }

        public k n5r1(@dd String str) {
            return str == null ? hyr(new String[0]) : hyr(str);
        }

        public k ncyb(@dd String str) {
            return str == null ? mo13106l(new String[0]) : mo13106l(str);
        }

        public k nn86(@dd String str) {
            return str == null ? hb(new String[0]) : hb(str);
        }

        /* JADX INFO: renamed from: o */
        public k mo13108o(cdj cdjVar) {
            this.f66022ni7 = cdjVar;
            return this;
        }

        public k o1t() {
            return d2ok(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public k oc(int i2) {
            this.f22312q = i2;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public k mo13109r(int i2) {
            this.f22314y = i2;
            return this;
        }

        public k vyq(String... strArr) {
            this.f66018ki = mcp(strArr);
            return this;
        }

        public k wvg() {
            return mo13107m(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public k x9kr(int i2, int i3) {
            this.f22310n = i2;
            this.f22306g = i3;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C3707i mo13111z() {
            return new C3707i(this);
        }

        public k(Context context) {
            this();
            lrht(context);
            ek5k(context, true);
        }

        protected k(C3707i c3707i) {
            m13130t(c3707i);
        }

        protected k(Bundle bundle) {
            String strM13120n = C3707i.m13120n(6);
            C3707i c3707i = C3707i.f22281v;
            this.f22309k = bundle.getInt(strM13120n, c3707i.f22292k);
            this.f66025toq = bundle.getInt(C3707i.m13120n(7), c3707i.f22298q);
            this.f66028zy = bundle.getInt(C3707i.m13120n(8), c3707i.f22295n);
            this.f22312q = bundle.getInt(C3707i.m13120n(9), c3707i.f22288g);
            this.f22310n = bundle.getInt(C3707i.m13120n(10), c3707i.f22304y);
            this.f22306g = bundle.getInt(C3707i.m13120n(11), c3707i.f22300s);
            this.f66015f7l8 = bundle.getInt(C3707i.m13120n(12), c3707i.f22297p);
            this.f22314y = bundle.getInt(C3707i.m13120n(13), c3707i.f22289h);
            this.f22313s = bundle.getInt(C3707i.m13120n(14), c3707i.f22290i);
            this.f22311p = bundle.getInt(C3707i.m13120n(15), c3707i.f22305z);
            this.f66020ld6 = bundle.getBoolean(C3707i.m13120n(16), c3707i.f22301t);
            this.f66026x2 = se.copyOf((String[]) com.google.common.base.fu4.m15351k(bundle.getStringArray(C3707i.m13120n(17)), new String[0]));
            this.f66023qrj = mcp((String[]) com.google.common.base.fu4.m15351k(bundle.getStringArray(C3707i.m13120n(1)), new String[0]));
            this.f66021n7h = bundle.getInt(C3707i.m13120n(2), c3707i.f22287f);
            this.f66019kja0 = bundle.getInt(C3707i.m13120n(18), c3707i.f22285c);
            this.f22307h = bundle.getInt(C3707i.m13120n(19), c3707i.f22286e);
            this.f66014cdj = se.copyOf((String[]) com.google.common.base.fu4.m15351k(bundle.getStringArray(C3707i.m13120n(20)), new String[0]));
            this.f66018ki = mcp((String[]) com.google.common.base.fu4.m15351k(bundle.getStringArray(C3707i.m13120n(3)), new String[0]));
            this.f66024t8r = bundle.getInt(C3707i.m13120n(4), c3707i.f22294m);
            this.f22308i = bundle.getBoolean(C3707i.m13120n(5), c3707i.f22284b);
            this.f66016fn3e = bundle.getBoolean(C3707i.m13120n(21), c3707i.f22283a);
            this.f66027zurt = bundle.getBoolean(C3707i.m13120n(22), c3707i.f22303x);
            this.f66022ni7 = (cdj) C3853q.m13716g(cdj.f22223g, bundle.getBundle(C3707i.m13120n(23)), cdj.f22225q);
            this.f66017fu4 = vep5.copyOf((Collection) C4746s.zy((int[]) com.google.common.base.fu4.m15351k(bundle.getIntArray(C3707i.m13120n(25)), new int[0])));
        }
    }
}
