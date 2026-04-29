package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.n */
/* JADX INFO: compiled from: ClippingMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3619n extends f7l8<Void> {

    /* JADX INFO: renamed from: a */
    private long f21626a;

    /* JADX INFO: renamed from: b */
    private long f21627b;

    /* JADX INFO: renamed from: c */
    private final boolean f21628c;

    /* JADX INFO: renamed from: e */
    private final ArrayList<C3625q> f21629e;

    /* JADX INFO: renamed from: f */
    private final boolean f21630f;

    /* JADX INFO: renamed from: j */
    private final pc.C3550q f21631j;

    /* JADX INFO: renamed from: l */
    private final boolean f21632l;

    /* JADX INFO: renamed from: m */
    @zy.dd
    private toq f21633m;

    /* JADX INFO: renamed from: o */
    @zy.dd
    private k f21634o;

    /* JADX INFO: renamed from: r */
    private final long f21635r;

    /* JADX INFO: renamed from: t */
    private final long f21636t;

    /* JADX INFO: renamed from: z */
    private final fti f21637z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$k */
    /* JADX INFO: compiled from: ClippingMediaSource.java */
    private static final class k extends fn3e {

        /* JADX INFO: renamed from: h */
        private final long f21638h;

        /* JADX INFO: renamed from: i */
        private final long f21639i;

        /* JADX INFO: renamed from: p */
        private final long f21640p;

        /* JADX INFO: renamed from: z */
        private final boolean f21641z;

        public k(pc pcVar, long j2, long j3) throws toq {
            super(pcVar);
            boolean z2 = false;
            if (pcVar.qrj() != 1) {
                throw new toq(0);
            }
            pc.C3550q c3550qM12484i = pcVar.m12484i(0, new pc.C3550q());
            long jMax = Math.max(0L, j2);
            if (!c3550qM12484i.f21138r && jMax != 0 && !c3550qM12484i.f21130h) {
                throw new toq(1);
            }
            long jMax2 = j3 == Long.MIN_VALUE ? c3550qM12484i.f21128f : Math.max(0L, j3);
            long j4 = c3550qM12484i.f21128f;
            if (j4 != C3548p.f65257toq) {
                jMax2 = jMax2 > j4 ? j4 : jMax2;
                if (jMax > jMax2) {
                    throw new toq(2);
                }
            }
            this.f21640p = jMax;
            this.f21638h = jMax2;
            this.f21639i = jMax2 == C3548p.f65257toq ? -9223372036854775807L : jMax2 - jMax;
            if (c3550qM12484i.f21131i && (jMax2 == C3548p.f65257toq || (j4 != C3548p.f65257toq && jMax2 == j4))) {
                z2 = true;
            }
            this.f21641z = z2;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.C3550q fn3e(int i2, pc.C3550q c3550q, long j2) {
            this.f21523s.fn3e(0, c3550q, 0L);
            long j3 = c3550q.f21132j;
            long j4 = this.f21640p;
            c3550q.f21132j = j3 + j4;
            c3550q.f21128f = this.f21639i;
            c3550q.f21131i = this.f21641z;
            long j5 = c3550q.f21134l;
            if (j5 != C3548p.f65257toq) {
                long jMax = Math.max(j5, j4);
                c3550q.f21134l = jMax;
                long j6 = this.f21638h;
                if (j6 != C3548p.f65257toq) {
                    jMax = Math.min(jMax, j6);
                }
                c3550q.f21134l = jMax - this.f21640p;
            }
            long jZwy = com.google.android.exoplayer2.util.lrht.zwy(this.f21640p);
            long j7 = c3550q.f21141y;
            if (j7 != C3548p.f65257toq) {
                c3550q.f21141y = j7 + jZwy;
            }
            long j8 = c3550q.f21139s;
            if (j8 != C3548p.f65257toq) {
                c3550q.f21139s = j8 + jZwy;
            }
            return c3550q;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
            this.f21523s.ld6(0, toqVar, z2);
            long jKi = toqVar.ki() - this.f21640p;
            long j2 = this.f21639i;
            return toqVar.ni7(toqVar.f21150k, toqVar.f21153q, 0, j2 == C3548p.f65257toq ? -9223372036854775807L : j2 - jKi, jKi);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$toq */
    /* JADX INFO: compiled from: ClippingMediaSource.java */
    public static final class toq extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$toq$k */
        /* JADX INFO: compiled from: ClippingMediaSource.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface k {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public toq(int i2) {
            String strValueOf = String.valueOf(m12792k(i2));
            super(strValueOf.length() != 0 ? "Illegal clipping: ".concat(strValueOf) : new String("Illegal clipping: "));
            this.reason = i2;
        }

        /* JADX INFO: renamed from: k */
        private static String m12792k(int i2) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C3619n(fti ftiVar, long j2, long j3) {
        this(ftiVar, j2, j3, true, false, false);
    }

    /* JADX INFO: renamed from: l */
    private void m12791l(pc pcVar) {
        long j2;
        long j3;
        pcVar.m12484i(0, this.f21631j);
        long jM12490p = this.f21631j.m12490p();
        if (this.f21634o == null || this.f21629e.isEmpty() || this.f21630f) {
            long j4 = this.f21636t;
            long j5 = this.f21635r;
            if (this.f21628c) {
                long jM12488g = this.f21631j.m12488g();
                j4 += jM12488g;
                j5 += jM12488g;
            }
            this.f21627b = jM12490p + j4;
            this.f21626a = this.f21635r != Long.MIN_VALUE ? jM12490p + j5 : Long.MIN_VALUE;
            int size = this.f21629e.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f21629e.get(i2).m12814i(this.f21627b, this.f21626a);
            }
            j2 = j4;
            j3 = j5;
        } else {
            long j6 = this.f21627b - jM12490p;
            j3 = this.f21635r != Long.MIN_VALUE ? this.f21626a - jM12490p : Long.MIN_VALUE;
            j2 = j6;
        }
        try {
            k kVar = new k(pcVar, j2, j3);
            this.f21634o = kVar;
            m12741t(kVar);
        } catch (toq e2) {
            this.f21633m = e2;
            for (int i3 = 0; i3 < this.f21629e.size(); i3++) {
                this.f21629e.get(i3).cdj(this.f21633m);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        C3844k.m13633s(this.f21629e.remove(jkVar));
        this.f21637z.mo12564g(((C3625q) jkVar).f21681k);
        if (!this.f21629e.isEmpty() || this.f21630f) {
            return;
        }
        m12791l(((k) C3844k.f7l8(this.f21634o)).f21523s);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        C3625q c3625q = new C3625q(this.f21637z.mo12565k(c3596k, toqVar, j2), this.f21632l, this.f21627b, this.f21626a);
        this.f21629e.add(c3625q);
        return c3625q;
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
        super.mcp();
        this.f21633m = null;
        this.f21634o = null;
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21637z.mo12566n();
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.fti
    public void n7h() throws IOException {
        toq toqVar = this.f21633m;
        if (toqVar != null) {
            throw toqVar;
        }
        super.n7h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: ncyb, reason: merged with bridge method [inline-methods] */
    public void lvui(Void r1, fti ftiVar, pc pcVar) {
        if (this.f21633m != null) {
            return;
        }
        m12791l(pcVar);
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        super.wvg(uv6Var);
        dd(null, this.f21637z);
    }

    public C3619n(fti ftiVar, long j2) {
        this(ftiVar, 0L, j2, true, false, true);
    }

    public C3619n(fti ftiVar, long j2, long j3, boolean z2, boolean z3, boolean z5) {
        C3844k.m13629k(j2 >= 0);
        this.f21637z = (fti) C3844k.f7l8(ftiVar);
        this.f21636t = j2;
        this.f21635r = j3;
        this.f21632l = z2;
        this.f21630f = z3;
        this.f21628c = z5;
        this.f21629e = new ArrayList<>();
        this.f21631j = new pc.C3550q();
    }
}
