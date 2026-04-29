package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.ads.zy;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.se;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class pc implements InterfaceC3555s {

    /* JADX INFO: renamed from: g */
    private static final int f21112g = 2;

    /* JADX INFO: renamed from: n */
    private static final int f21114n = 1;

    /* JADX INFO: renamed from: q */
    private static final int f21115q = 0;

    /* JADX INFO: renamed from: k */
    public static final pc f21113k = new C3549k();

    /* JADX INFO: renamed from: y */
    public static final InterfaceC3555s.k<pc> f21116y = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.ebn
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return pc.toq(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.pc$k */
    /* JADX INFO: compiled from: Timeline.java */
    class C3549k extends pc {
        C3549k() {
        }

        @Override // com.google.android.exoplayer2.pc
        public C3550q fn3e(int i2, C3550q c3550q, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: g */
        public int mo12147g(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.pc
        public toq ld6(int i2, toq toqVar, boolean z2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.pc
        public int qrj() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.pc
        public Object t8r(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.pc
        public int zurt() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.pc$q */
    /* JADX INFO: compiled from: Timeline.java */
    public static final class C3550q implements InterfaceC3555s {

        /* JADX INFO: renamed from: a */
        private static final int f21117a = 1;

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        private static final int f65304ab = 8;
        private static final int an = 12;
        private static final int bb = 9;

        /* JADX INFO: renamed from: bo, reason: collision with root package name */
        private static final int f65305bo = 4;
        private static final int bp = 10;
        private static final int bv = 11;

        /* JADX INFO: renamed from: d */
        private static final int f21119d = 6;
        private static final int id = 13;

        /* JADX INFO: renamed from: u */
        private static final int f21122u = 3;

        /* JADX INFO: renamed from: v */
        private static final int f21123v = 5;

        /* JADX INFO: renamed from: w */
        private static final int f21124w = 7;

        /* JADX INFO: renamed from: x */
        private static final int f21125x = 2;

        /* JADX INFO: renamed from: c */
        public int f21126c;

        /* JADX INFO: renamed from: e */
        public int f21127e;

        /* JADX INFO: renamed from: f */
        public long f21128f;

        /* JADX INFO: renamed from: g */
        @zy.dd
        public Object f21129g;

        /* JADX INFO: renamed from: h */
        public boolean f21130h;

        /* JADX INFO: renamed from: i */
        public boolean f21131i;

        /* JADX INFO: renamed from: j */
        public long f21132j;

        /* JADX INFO: renamed from: l */
        public long f21134l;

        /* JADX INFO: renamed from: p */
        public long f21136p;

        /* JADX INFO: renamed from: q */
        @Deprecated
        @zy.dd
        public Object f21137q;

        /* JADX INFO: renamed from: r */
        public boolean f21138r;

        /* JADX INFO: renamed from: s */
        public long f21139s;

        /* JADX INFO: renamed from: t */
        @zy.dd
        public tfm.f7l8 f21140t;

        /* JADX INFO: renamed from: y */
        public long f21141y;

        /* JADX INFO: renamed from: z */
        @Deprecated
        public boolean f21142z;

        /* JADX INFO: renamed from: o */
        public static final Object f21121o = new Object();

        /* JADX INFO: renamed from: m */
        private static final Object f21120m = new Object();

        /* JADX INFO: renamed from: b */
        private static final tfm f21118b = new tfm.zy().jk("com.google.android.exoplayer2.Timeline").eqxt(Uri.EMPTY).m13065k();
        public static final InterfaceC3555s.k<C3550q> in = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.nsb
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return pc.C3550q.zy(bundle);
            }
        };

        /* JADX INFO: renamed from: k */
        public Object f21133k = f21121o;

        /* JADX INFO: renamed from: n */
        public tfm f21135n = f21118b;

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle n7h(boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putBundle(x2(1), (z2 ? tfm.f22141i : this.f21135n).toBundle());
            bundle.putLong(x2(2), this.f21141y);
            bundle.putLong(x2(3), this.f21139s);
            bundle.putLong(x2(4), this.f21136p);
            bundle.putBoolean(x2(5), this.f21130h);
            bundle.putBoolean(x2(6), this.f21131i);
            tfm.f7l8 f7l8Var = this.f21140t;
            if (f7l8Var != null) {
                bundle.putBundle(x2(7), f7l8Var.toBundle());
            }
            bundle.putBoolean(x2(8), this.f21138r);
            bundle.putLong(x2(9), this.f21134l);
            bundle.putLong(x2(10), this.f21128f);
            bundle.putInt(x2(11), this.f21126c);
            bundle.putInt(x2(12), this.f21127e);
            bundle.putLong(x2(13), this.f21132j);
            return bundle;
        }

        private static String x2(int i2) {
            return Integer.toString(i2, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C3550q zy(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(x2(1));
            tfm tfmVar = bundle2 != null ? (tfm) tfm.f22139f.mo11492k(bundle2) : null;
            long j2 = bundle.getLong(x2(2), C3548p.f65257toq);
            long j3 = bundle.getLong(x2(3), C3548p.f65257toq);
            long j4 = bundle.getLong(x2(4), C3548p.f65257toq);
            boolean z2 = bundle.getBoolean(x2(5), false);
            boolean z3 = bundle.getBoolean(x2(6), false);
            Bundle bundle3 = bundle.getBundle(x2(7));
            tfm.f7l8 f7l8Var = bundle3 != null ? (tfm.f7l8) tfm.f7l8.f22156r.mo11492k(bundle3) : null;
            boolean z5 = bundle.getBoolean(x2(8), false);
            long j5 = bundle.getLong(x2(9), 0L);
            long j6 = bundle.getLong(x2(10), C3548p.f65257toq);
            int i2 = bundle.getInt(x2(11), 0);
            int i3 = bundle.getInt(x2(12), 0);
            long j7 = bundle.getLong(x2(13), 0L);
            C3550q c3550q = new C3550q();
            c3550q.qrj(f21120m, tfmVar, null, j2, j3, j4, z2, z3, f7l8Var, j5, j6, i2, i3, j7);
            c3550q.f21138r = z5;
            return c3550q;
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C3550q.class.equals(obj.getClass())) {
                return false;
            }
            C3550q c3550q = (C3550q) obj;
            return com.google.android.exoplayer2.util.lrht.zy(this.f21133k, c3550q.f21133k) && com.google.android.exoplayer2.util.lrht.zy(this.f21135n, c3550q.f21135n) && com.google.android.exoplayer2.util.lrht.zy(this.f21129g, c3550q.f21129g) && com.google.android.exoplayer2.util.lrht.zy(this.f21140t, c3550q.f21140t) && this.f21141y == c3550q.f21141y && this.f21139s == c3550q.f21139s && this.f21136p == c3550q.f21136p && this.f21130h == c3550q.f21130h && this.f21131i == c3550q.f21131i && this.f21138r == c3550q.f21138r && this.f21134l == c3550q.f21134l && this.f21128f == c3550q.f21128f && this.f21126c == c3550q.f21126c && this.f21127e == c3550q.f21127e && this.f21132j == c3550q.f21132j;
        }

        public long f7l8() {
            return com.google.android.exoplayer2.util.lrht.zwy(this.f21128f);
        }

        /* JADX INFO: renamed from: g */
        public long m12488g() {
            return this.f21134l;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f21133k.hashCode()) * 31) + this.f21135n.hashCode()) * 31;
            Object obj = this.f21129g;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            tfm.f7l8 f7l8Var = this.f21140t;
            int iHashCode3 = (iHashCode2 + (f7l8Var != null ? f7l8Var.hashCode() : 0)) * 31;
            long j2 = this.f21141y;
            int i2 = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f21139s;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f21136p;
            int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f21130h ? 1 : 0)) * 31) + (this.f21131i ? 1 : 0)) * 31) + (this.f21138r ? 1 : 0)) * 31;
            long j5 = this.f21134l;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f21128f;
            int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f21126c) * 31) + this.f21127e) * 31;
            long j7 = this.f21132j;
            return i6 + ((int) (j7 ^ (j7 >>> 32)));
        }

        public boolean ld6() {
            C3844k.m13633s(this.f21142z == (this.f21140t != null));
            return this.f21140t != null;
        }

        /* JADX INFO: renamed from: n */
        public long m12489n() {
            return com.google.android.exoplayer2.util.lrht.zwy(this.f21134l);
        }

        /* JADX INFO: renamed from: p */
        public long m12490p() {
            return this.f21132j;
        }

        /* JADX INFO: renamed from: q */
        public long m12491q() {
            return com.google.android.exoplayer2.util.lrht.a98o(this.f21136p);
        }

        public C3550q qrj(Object obj, @zy.dd tfm tfmVar, @zy.dd Object obj2, long j2, long j3, long j4, boolean z2, boolean z3, @zy.dd tfm.f7l8 f7l8Var, long j5, long j6, int i2, int i3, long j7) {
            tfm.C3701y c3701y;
            this.f21133k = obj;
            this.f21135n = tfmVar != null ? tfmVar : f21118b;
            this.f21137q = (tfmVar == null || (c3701y = tfmVar.f22150q) == null) ? null : c3701y.f22210s;
            this.f21129g = obj2;
            this.f21141y = j2;
            this.f21139s = j3;
            this.f21136p = j4;
            this.f21130h = z2;
            this.f21131i = z3;
            this.f21142z = f7l8Var != null;
            this.f21140t = f7l8Var;
            this.f21134l = j5;
            this.f21128f = j6;
            this.f21126c = i2;
            this.f21127e = i3;
            this.f21132j = j7;
            this.f21138r = false;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public long m12492s() {
            return com.google.android.exoplayer2.util.lrht.zwy(this.f21132j);
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            return n7h(false);
        }

        /* JADX INFO: renamed from: y */
        public long m12493y() {
            return this.f21128f;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class toq implements InterfaceC3555s {

        /* JADX INFO: renamed from: h */
        private static final int f21143h = 0;

        /* JADX INFO: renamed from: i */
        private static final int f21144i = 1;

        /* JADX INFO: renamed from: l */
        public static final InterfaceC3555s.k<toq> f21145l = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.ij
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return pc.toq.zy(bundle);
            }
        };

        /* JADX INFO: renamed from: r */
        private static final int f21146r = 4;

        /* JADX INFO: renamed from: t */
        private static final int f21147t = 3;

        /* JADX INFO: renamed from: z */
        private static final int f21148z = 2;

        /* JADX INFO: renamed from: g */
        public long f21149g;

        /* JADX INFO: renamed from: k */
        @zy.dd
        public Object f21150k;

        /* JADX INFO: renamed from: n */
        public int f21151n;

        /* JADX INFO: renamed from: p */
        private com.google.android.exoplayer2.source.ads.zy f21152p = com.google.android.exoplayer2.source.ads.zy.f21298r;

        /* JADX INFO: renamed from: q */
        @zy.dd
        public Object f21153q;

        /* JADX INFO: renamed from: s */
        public boolean f21154s;

        /* JADX INFO: renamed from: y */
        public long f21155y;

        private static String zurt(int i2) {
            return Integer.toString(i2, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static toq zy(Bundle bundle) {
            int i2 = bundle.getInt(zurt(0), 0);
            long j2 = bundle.getLong(zurt(1), C3548p.f65257toq);
            long j3 = bundle.getLong(zurt(2), 0L);
            boolean z2 = bundle.getBoolean(zurt(3));
            Bundle bundle2 = bundle.getBundle(zurt(4));
            com.google.android.exoplayer2.source.ads.zy zyVar = bundle2 != null ? (com.google.android.exoplayer2.source.ads.zy) com.google.android.exoplayer2.source.ads.zy.f21296o.mo11492k(bundle2) : com.google.android.exoplayer2.source.ads.zy.f21298r;
            toq toqVar = new toq();
            toqVar.fu4(null, null, i2, j2, j3, zyVar, z2);
            return toqVar;
        }

        public long cdj() {
            return com.google.android.exoplayer2.util.lrht.zwy(this.f21155y);
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !toq.class.equals(obj.getClass())) {
                return false;
            }
            toq toqVar = (toq) obj;
            return com.google.android.exoplayer2.util.lrht.zy(this.f21150k, toqVar.f21150k) && com.google.android.exoplayer2.util.lrht.zy(this.f21153q, toqVar.f21153q) && this.f21151n == toqVar.f21151n && this.f21149g == toqVar.f21149g && this.f21155y == toqVar.f21155y && this.f21154s == toqVar.f21154s && com.google.android.exoplayer2.util.lrht.zy(this.f21152p, toqVar.f21152p);
        }

        public int f7l8(long j2) {
            return this.f21152p.m12617n(j2, this.f21149g);
        }

        public boolean fn3e(int i2) {
            return this.f21152p.m12619q(i2).f21318p;
        }

        public toq fu4(@zy.dd Object obj, @zy.dd Object obj2, int i2, long j2, long j3, com.google.android.exoplayer2.source.ads.zy zyVar, boolean z2) {
            this.f21150k = obj;
            this.f21153q = obj2;
            this.f21151n = i2;
            this.f21149g = j2;
            this.f21155y = j3;
            this.f21152p = zyVar;
            this.f21154s = z2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public int m12495g() {
            return this.f21152p.f21304q;
        }

        /* JADX INFO: renamed from: h */
        public int m12496h(int i2, int i3) {
            return this.f21152p.m12619q(i2).m12623g(i3);
        }

        public int hashCode() {
            Object obj = this.f21150k;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f21153q;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f21151n) * 31;
            long j2 = this.f21149g;
            int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f21155y;
            return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f21154s ? 1 : 0)) * 31) + this.f21152p.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public boolean m12497i(int i2) {
            return !this.f21152p.m12619q(i2).f7l8();
        }

        public long ki() {
            return this.f21155y;
        }

        public int kja0(int i2) {
            return this.f21152p.m12619q(i2).m12625n();
        }

        @zy.dd
        public Object ld6() {
            return this.f21152p.f21302k;
        }

        /* JADX INFO: renamed from: n */
        public long m12498n(int i2, int i3) {
            zy.C3576k c3576kM12619q = this.f21152p.m12619q(i2);
            return c3576kM12619q.f21319q != -1 ? c3576kM12619q.f21321y[i3] : C3548p.f65257toq;
        }

        public long n7h() {
            return this.f21149g;
        }

        public toq ni7(@zy.dd Object obj, @zy.dd Object obj2, int i2, long j2, long j3) {
            return fu4(obj, obj2, i2, j2, j3, com.google.android.exoplayer2.source.ads.zy.f21298r, false);
        }

        /* JADX INFO: renamed from: p */
        public long m12499p() {
            return this.f21152p.f21303n;
        }

        /* JADX INFO: renamed from: q */
        public int m12500q(int i2) {
            return this.f21152p.m12619q(i2).f21319q;
        }

        public long qrj() {
            return com.google.android.exoplayer2.util.lrht.zwy(this.f21149g);
        }

        /* JADX INFO: renamed from: s */
        public long m12501s(int i2) {
            return this.f21152p.m12619q(i2).f21316k;
        }

        public int t8r() {
            return this.f21152p.f21306y;
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(zurt(0), this.f21151n);
            bundle.putLong(zurt(1), this.f21149g);
            bundle.putLong(zurt(2), this.f21155y);
            bundle.putBoolean(zurt(3), this.f21154s);
            bundle.putBundle(zurt(4), this.f21152p.toBundle());
            return bundle;
        }

        public long x2(int i2) {
            return this.f21152p.m12619q(i2).f21320s;
        }

        /* JADX INFO: renamed from: y */
        public int m12502y(long j2) {
            return this.f21152p.m12614g(j2, this.f21149g);
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class zy extends pc {

        /* JADX INFO: renamed from: h */
        private final int[] f21156h;

        /* JADX INFO: renamed from: i */
        private final int[] f21157i;

        /* JADX INFO: renamed from: p */
        private final com.google.common.collect.se<toq> f21158p;

        /* JADX INFO: renamed from: s */
        private final com.google.common.collect.se<C3550q> f21159s;

        public zy(com.google.common.collect.se<C3550q> seVar, com.google.common.collect.se<toq> seVar2, int[] iArr) {
            C3844k.m13629k(seVar.size() == iArr.length);
            this.f21159s = seVar;
            this.f21158p = seVar2;
            this.f21156h = iArr;
            this.f21157i = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f21157i[iArr[i2]] = i2;
            }
        }

        @Override // com.google.android.exoplayer2.pc
        public int f7l8(boolean z2) {
            if (ni7()) {
                return -1;
            }
            return z2 ? this.f21156h[zurt() - 1] : zurt() - 1;
        }

        @Override // com.google.android.exoplayer2.pc
        public C3550q fn3e(int i2, C3550q c3550q, long j2) {
            C3550q c3550q2 = this.f21159s.get(i2);
            c3550q.qrj(c3550q2.f21133k, c3550q2.f21135n, c3550q2.f21129g, c3550q2.f21141y, c3550q2.f21139s, c3550q2.f21136p, c3550q2.f21130h, c3550q2.f21131i, c3550q2.f21140t, c3550q2.f21134l, c3550q2.f21128f, c3550q2.f21126c, c3550q2.f21127e, c3550q2.f21132j);
            c3550q.f21138r = c3550q2.f21138r;
            return c3550q;
        }

        @Override // com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: g */
        public int mo12147g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.pc
        public int ki(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != mo12148n(z2)) {
                return z2 ? this.f21156h[this.f21157i[i2] - 1] : i2 - 1;
            }
            if (i3 == 2) {
                return f7l8(z2);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.pc
        public toq ld6(int i2, toq toqVar, boolean z2) {
            toq toqVar2 = this.f21158p.get(i2);
            toqVar.fu4(toqVar2.f21150k, toqVar2.f21153q, toqVar2.f21151n, toqVar2.f21149g, toqVar2.f21155y, toqVar2.f21152p, toqVar2.f21154s);
            return toqVar;
        }

        @Override // com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: n */
        public int mo12148n(boolean z2) {
            if (ni7()) {
                return -1;
            }
            if (z2) {
                return this.f21156h[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.pc
        public int qrj() {
            return this.f21158p.size();
        }

        @Override // com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: s */
        public int mo12149s(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != f7l8(z2)) {
                return z2 ? this.f21156h[this.f21157i[i2] + 1] : i2 + 1;
            }
            if (i3 == 2) {
                return mo12148n(z2);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.pc
        public Object t8r(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.pc
        public int zurt() {
            return this.f21159s.size();
        }
    }

    protected pc() {
    }

    /* JADX INFO: renamed from: q */
    private static int[] m12481q(int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static pc toq(Bundle bundle) {
        com.google.common.collect.se seVarZy = zy(C3550q.in, com.google.android.exoplayer2.util.zy.m13774k(bundle, m12482z(0)));
        com.google.common.collect.se seVarZy2 = zy(toq.f21145l, com.google.android.exoplayer2.util.zy.m13774k(bundle, m12482z(1)));
        int[] intArray = bundle.getIntArray(m12482z(2));
        if (intArray == null) {
            intArray = m12481q(seVarZy.size());
        }
        return new zy(seVarZy, seVarZy2, intArray);
    }

    /* JADX INFO: renamed from: z */
    private static String m12482z(int i2) {
        return Integer.toString(i2, 36);
    }

    private static <T extends InterfaceC3555s> com.google.common.collect.se<T> zy(InterfaceC3555s.k<T> kVar, @zy.dd IBinder iBinder) {
        if (iBinder == null) {
            return com.google.common.collect.se.of();
        }
        se.C4520k c4520k = new se.C4520k();
        com.google.common.collect.se<Bundle> seVarM13948k = BinderC3901y.m13948k(iBinder);
        for (int i2 = 0; i2 < seVarM13948k.size(); i2++) {
            c4520k.mo15569k(kVar.mo11492k(seVarM13948k.get(i2)));
        }
        return c4520k.mo15570n();
    }

    @zy.dd
    public final Pair<Object, Long> cdj(C3550q c3550q, toq toqVar, int i2, long j2, long j3) {
        C3844k.zy(i2, 0, zurt());
        fn3e(i2, c3550q, j3);
        if (j2 == C3548p.f65257toq) {
            j2 = c3550q.m12488g();
            if (j2 == C3548p.f65257toq) {
                return null;
            }
        }
        int i3 = c3550q.f21126c;
        m12485p(i3, toqVar);
        while (i3 < c3550q.f21127e && toqVar.f21155y != j2) {
            int i4 = i3 + 1;
            if (m12485p(i4, toqVar).f21155y > j2) {
                break;
            }
            i3 = i4;
        }
        ld6(i3, toqVar, true);
        long jMin = j2 - toqVar.f21155y;
        long j4 = toqVar.f21149g;
        if (j4 != C3548p.f65257toq) {
            jMin = Math.min(jMin, j4 - 1);
        }
        return Pair.create(C3844k.f7l8(toqVar.f21153q), Long.valueOf(Math.max(0L, jMin)));
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        if (pcVar.zurt() != zurt() || pcVar.qrj() != qrj()) {
            return false;
        }
        C3550q c3550q = new C3550q();
        toq toqVar = new toq();
        C3550q c3550q2 = new C3550q();
        toq toqVar2 = new toq();
        for (int i2 = 0; i2 < zurt(); i2++) {
            if (!m12484i(i2, c3550q).equals(pcVar.m12484i(i2, c3550q2))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < qrj(); i3++) {
            if (!ld6(i3, toqVar, true).equals(pcVar.ld6(i3, toqVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int f7l8(boolean z2) {
        if (ni7()) {
            return -1;
        }
        return zurt() - 1;
    }

    public abstract C3550q fn3e(int i2, C3550q c3550q, long j2);

    public final boolean fu4(int i2, toq toqVar, C3550q c3550q, int i3, boolean z2) {
        return m12486y(i2, toqVar, c3550q, i3, z2) == -1;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo12147g(Object obj);

    /* JADX INFO: renamed from: h */
    public final Pair<Object, Long> m12483h(C3550q c3550q, toq toqVar, int i2, long j2) {
        return (Pair) C3844k.f7l8(kja0(c3550q, toqVar, i2, j2, 0L));
    }

    public int hashCode() {
        C3550q c3550q = new C3550q();
        toq toqVar = new toq();
        int iZurt = 217 + zurt();
        for (int i2 = 0; i2 < zurt(); i2++) {
            iZurt = (iZurt * 31) + m12484i(i2, c3550q).hashCode();
        }
        int iQrj = (iZurt * 31) + qrj();
        for (int i3 = 0; i3 < qrj(); i3++) {
            iQrj = (iQrj * 31) + ld6(i3, toqVar, true).hashCode();
        }
        return iQrj;
    }

    /* JADX INFO: renamed from: i */
    public final C3550q m12484i(int i2, C3550q c3550q) {
        return fn3e(i2, c3550q, 0L);
    }

    public int ki(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == mo12148n(z2)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == mo12148n(z2) ? f7l8(z2) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    @zy.dd
    public final Pair<Object, Long> kja0(C3550q c3550q, toq toqVar, int i2, long j2, long j3) {
        return cdj(c3550q, toqVar, i2, j2, j3);
    }

    public abstract toq ld6(int i2, toq toqVar, boolean z2);

    /* JADX INFO: renamed from: n */
    public int mo12148n(boolean z2) {
        return ni7() ? -1 : 0;
    }

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> n7h(C3550q c3550q, toq toqVar, int i2, long j2) {
        return m12483h(c3550q, toqVar, i2, j2);
    }

    public final boolean ni7() {
        return zurt() == 0;
    }

    public final Bundle o1t(boolean z2) {
        ArrayList arrayList = new ArrayList();
        int iZurt = zurt();
        C3550q c3550q = new C3550q();
        for (int i2 = 0; i2 < iZurt; i2++) {
            arrayList.add(fn3e(i2, c3550q, 0L).n7h(z2));
        }
        ArrayList arrayList2 = new ArrayList();
        int iQrj = qrj();
        toq toqVar = new toq();
        for (int i3 = 0; i3 < iQrj; i3++) {
            arrayList2.add(ld6(i3, toqVar, false).toBundle());
        }
        int[] iArr = new int[iZurt];
        if (iZurt > 0) {
            iArr[0] = mo12148n(true);
        }
        for (int i4 = 1; i4 < iZurt; i4++) {
            iArr[i4] = mo12149s(iArr[i4 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        com.google.android.exoplayer2.util.zy.zy(bundle, m12482z(0), new BinderC3901y(arrayList));
        com.google.android.exoplayer2.util.zy.zy(bundle, m12482z(1), new BinderC3901y(arrayList2));
        bundle.putIntArray(m12482z(2), iArr);
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final toq m12485p(int i2, toq toqVar) {
        return ld6(i2, toqVar, false);
    }

    public abstract int qrj();

    /* JADX INFO: renamed from: s */
    public int mo12149s(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == f7l8(z2)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == f7l8(z2) ? mo12148n(z2) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object t8r(int i2);

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public final Bundle toBundle() {
        return o1t(false);
    }

    public toq x2(Object obj, toq toqVar) {
        return ld6(mo12147g(obj), toqVar, true);
    }

    /* JADX INFO: renamed from: y */
    public final int m12486y(int i2, toq toqVar, C3550q c3550q, int i3, boolean z2) {
        int i4 = m12485p(i2, toqVar).f21151n;
        if (m12484i(i4, c3550q).f21127e != i2) {
            return i2 + 1;
        }
        int iMo12149s = mo12149s(i4, i3, z2);
        if (iMo12149s == -1) {
            return -1;
        }
        return m12484i(iMo12149s, c3550q).f21126c;
    }

    public abstract int zurt();
}
