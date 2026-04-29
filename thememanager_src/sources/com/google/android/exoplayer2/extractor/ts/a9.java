package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.AbstractC3355k;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class a9 extends AbstractC3355k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64405f7l8 = 940;

    /* JADX INFO: renamed from: g */
    private static final long f20178g = 100000;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.a9$k */
    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    private static final class C3403k implements AbstractC3355k.g {

        /* JADX INFO: renamed from: k */
        private final C3847l f20179k;

        /* JADX INFO: renamed from: q */
        private final int f20180q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.gvn7 f64406toq = new com.google.android.exoplayer2.util.gvn7();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f64407zy;

        public C3403k(int i2, C3847l c3847l, int i3) {
            this.f64407zy = i2;
            this.f20179k = c3847l;
            this.f20180q = i3;
        }

        private AbstractC3355k.n zy(com.google.android.exoplayer2.util.gvn7 gvn7Var, long j2, long j3) {
            int iM12005k;
            int iM12005k2;
            int iM13591g = gvn7Var.m13591g();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (gvn7Var.m13594k() >= 188 && (iM12005k2 = (iM12005k = oc.m12005k(gvn7Var.m13598q(), gvn7Var.m13596n(), iM13591g)) + gvn7.f64478wvg) <= iM13591g) {
                long jZy = oc.zy(gvn7Var, iM12005k, this.f64407zy);
                if (jZy != C3548p.f65257toq) {
                    long qVar = this.f20179k.toq(jZy);
                    if (qVar > j2) {
                        return j6 == C3548p.f65257toq ? AbstractC3355k.n.m11769q(qVar, j3) : AbstractC3355k.n.m11768n(j3 + j5);
                    }
                    if (a9.f20178g + qVar > j2) {
                        return AbstractC3355k.n.m11768n(j3 + ((long) iM12005k));
                    }
                    j5 = iM12005k;
                    j6 = qVar;
                }
                gvn7Var.n5r1(iM12005k2);
                j4 = iM12005k2;
            }
            return j6 != C3548p.f65257toq ? AbstractC3355k.n.m11766g(j6, j3 + j4) : AbstractC3355k.n.f19858y;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.g
        /* JADX INFO: renamed from: k */
        public AbstractC3355k.n mo11710k(com.google.android.exoplayer2.extractor.ld6 ld6Var, long j2) throws IOException {
            long position = ld6Var.getPosition();
            int iMin = (int) Math.min(this.f20180q, ld6Var.getLength() - position);
            this.f64406toq.dd(iMin);
            ld6Var.fn3e(this.f64406toq.m13598q(), 0, iMin);
            return zy(this.f64406toq, j2, position);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.g
        public void toq() {
            this.f64406toq.x9kr(lrht.f23228g);
        }
    }

    public a9(C3847l c3847l, long j2, long j3, int i2, int i3) {
        super(new AbstractC3355k.toq(), new C3403k(i2, c3847l, i3), j2, 0L, j2 + 1, 0L, j3, 188L, f64405f7l8);
    }
}
