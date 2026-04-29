package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.x9kr;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp3.s */
/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3368s implements f7l8 {

    /* JADX INFO: renamed from: p */
    private static final String f19942p = "XingSeeker";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final long f64065f7l8;

    /* JADX INFO: renamed from: g */
    private final long f19943g;

    /* JADX INFO: renamed from: n */
    private final int f19944n;

    /* JADX INFO: renamed from: q */
    private final long f19945q;

    /* JADX INFO: renamed from: s */
    @dd
    private final long[] f19946s;

    /* JADX INFO: renamed from: y */
    private final long f19947y;

    private C3368s(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static C3368s m11823k(long j2, long j3, x9kr.C3269k c3269k, gvn7 gvn7Var) {
        int iEqxt;
        int i2 = c3269k.f63527f7l8;
        int i3 = c3269k.f19508q;
        int iKja0 = gvn7Var.kja0();
        if ((iKja0 & 1) != 1 || (iEqxt = gvn7Var.eqxt()) == 0) {
            return null;
        }
        long jKtq = lrht.ktq(iEqxt, ((long) i2) * 1000000, i3);
        if ((iKja0 & 6) != 6) {
            return new C3368s(j3, c3269k.f63529zy, jKtq);
        }
        long jD3 = gvn7Var.d3();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = gvn7Var.jp0y();
        }
        if (j2 != -1) {
            long j4 = j3 + jD3;
            if (j2 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j2);
                sb.append(", ");
                sb.append(j4);
                ni7.qrj(f19942p, sb.toString());
            }
        }
        return new C3368s(j3, c3269k.f63529zy, jKtq, jD3, jArr);
    }

    private long toq(int i2) {
        return (this.f19943g * ((long) i2)) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return this.f19946s != null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: g */
    public long mo11813g() {
        return this.f19947y;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        if (!f7l8()) {
            return new o1t.C3388k(new wvg(0L, this.f19945q + ((long) this.f19944n)));
        }
        long jM13660i = lrht.m13660i(j2, 0L, this.f19943g);
        double d2 = (jM13660i * 100.0d) / this.f19943g;
        double d4 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i2 = (int) d2;
                double d5 = ((long[]) C3844k.ld6(this.f19946s))[i2];
                d4 = d5 + ((d2 - ((double) i2)) * ((i2 == 99 ? 256.0d : r3[i2 + 1]) - d5));
            }
        }
        return new o1t.C3388k(new wvg(jM13660i, this.f19945q + lrht.m13660i(Math.round((d4 / 256.0d) * this.f64065f7l8), this.f19944n, this.f64065f7l8 - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f19943g;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: y */
    public long mo11814y(long j2) {
        long j3 = j2 - this.f19945q;
        if (!f7l8() || j3 <= this.f19944n) {
            return 0L;
        }
        long[] jArr = (long[]) C3844k.ld6(this.f19946s);
        double d2 = (j3 * 256.0d) / this.f64065f7l8;
        int iM13667p = lrht.m13667p(jArr, (long) d2, true, true);
        long qVar = toq(iM13667p);
        long j4 = jArr[iM13667p];
        int i2 = iM13667p + 1;
        long qVar2 = toq(i2);
        return qVar + Math.round((j4 == (iM13667p == 99 ? 256L : jArr[i2]) ? 0.0d : (d2 - j4) / (r0 - j4)) * (qVar2 - qVar));
    }

    private C3368s(long j2, int i2, long j3, long j4, @dd long[] jArr) {
        this.f19945q = j2;
        this.f19944n = i2;
        this.f19943g = j3;
        this.f19946s = jArr;
        this.f64065f7l8 = j4;
        this.f19947y = j4 != -1 ? j2 + j4 : -1L;
    }
}
