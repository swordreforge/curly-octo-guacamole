package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.C3348h;
import com.google.android.exoplayer2.extractor.cdj;
import com.google.android.exoplayer2.extractor.ki;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.ogg.AbstractC3394s;
import com.google.android.exoplayer2.extractor.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import zy.dd;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq extends AbstractC3394s {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64371fn3e = 4;

    /* JADX INFO: renamed from: i */
    private static final byte f20148i = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private t8r f64372ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @dd
    private C3395k f64373t8r;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.toq$k */
    /* JADX INFO: compiled from: FlacReader.java */
    private static final class C3395k implements f7l8 {

        /* JADX INFO: renamed from: k */
        private t8r f20149k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private t8r.C3402k f64374toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f64375zy = -1;

        /* JADX INFO: renamed from: q */
        private long f20150q = -1;

        public C3395k(t8r t8rVar, t8r.C3402k c3402k) {
            this.f20149k = t8rVar;
            this.f64374toq = c3402k;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
        /* JADX INFO: renamed from: k */
        public long mo11896k(com.google.android.exoplayer2.extractor.ld6 ld6Var) {
            long j2 = this.f20150q;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.f20150q = -1L;
            return j3;
        }

        /* JADX INFO: renamed from: q */
        public void m11921q(long j2) {
            this.f64375zy = j2;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
        public o1t toq() {
            C3844k.m13633s(this.f64375zy != -1);
            return new ki(this.f20149k, this.f64375zy);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
        public void zy(long j2) {
            long[] jArr = this.f64374toq.f20176k;
            this.f20150q = jArr[lrht.m13667p(jArr, j2, true, true)];
        }
    }

    toq() {
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11920h(gvn7 gvn7Var) {
        return gvn7Var.m13594k() >= 5 && gvn7Var.jp0y() == 127 && gvn7Var.d3() == 1179402563;
    }

    private static boolean kja0(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int n7h(gvn7 gvn7Var) {
        int i2 = (gvn7Var.m13598q()[2] & 255) >> 4;
        if (i2 == 6 || i2 == 7) {
            gvn7Var.hyr(4);
            gvn7Var.m13599r();
        }
        int iM11734p = C3348h.m11734p(gvn7Var, i2);
        gvn7Var.n5r1(0);
        return iM11734p;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    /* JADX INFO: renamed from: g */
    protected long mo11910g(gvn7 gvn7Var) {
        if (kja0(gvn7Var.m13598q())) {
            return n7h(gvn7Var);
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: s */
    protected boolean mo11912s(gvn7 gvn7Var, long j2, AbstractC3394s.toq toqVar) {
        byte[] bArrM13598q = gvn7Var.m13598q();
        t8r t8rVar = this.f64372ki;
        if (t8rVar == null) {
            t8r t8rVar2 = new t8r(bArrM13598q, 17);
            this.f64372ki = t8rVar2;
            toqVar.f20147k = t8rVar2.m11937s(Arrays.copyOfRange(bArrM13598q, 9, gvn7Var.m13591g()), null);
            return true;
        }
        if ((bArrM13598q[0] & 127) == 3) {
            t8r.C3402k c3402kM11696y = cdj.m11696y(gvn7Var);
            t8r t8rVarZy = t8rVar.zy(c3402kM11696y);
            this.f64372ki = t8rVarZy;
            this.f64373t8r = new C3395k(t8rVarZy, c3402kM11696y);
            return true;
        }
        if (!kja0(bArrM13598q)) {
            return true;
        }
        C3395k c3395k = this.f64373t8r;
        if (c3395k != null) {
            c3395k.m11921q(j2);
            toqVar.f64370toq = this.f64373t8r;
        }
        C3844k.f7l8(toqVar.f20147k);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    protected void x2(boolean z2) {
        super.x2(z2);
        if (z2) {
            this.f64372ki = null;
            this.f64373t8r = null;
        }
    }
}
