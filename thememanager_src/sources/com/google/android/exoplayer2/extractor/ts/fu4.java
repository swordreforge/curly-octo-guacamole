package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.n5r1;
import com.google.android.exoplayer2.extractor.AbstractC3355k;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class fu4 extends AbstractC3355k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64445f7l8 = 1000;

    /* JADX INFO: renamed from: g */
    private static final long f20216g = 100000;

    /* JADX INFO: renamed from: y */
    private static final int f20217y = 20000;

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    private static final class toq implements AbstractC3355k.g {

        /* JADX INFO: renamed from: k */
        private final C3847l f20218k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.gvn7 f64446toq;

        /* JADX INFO: renamed from: q */
        private static void m11965q(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
            int iLd6;
            int iM13591g = gvn7Var.m13591g();
            if (gvn7Var.m13594k() < 10) {
                gvn7Var.n5r1(iM13591g);
                return;
            }
            gvn7Var.hyr(9);
            int iJp0y = gvn7Var.jp0y() & 7;
            if (gvn7Var.m13594k() < iJp0y) {
                gvn7Var.n5r1(iM13591g);
                return;
            }
            gvn7Var.hyr(iJp0y);
            if (gvn7Var.m13594k() < 4) {
                gvn7Var.n5r1(iM13591g);
                return;
            }
            if (fu4.ld6(gvn7Var.m13598q(), gvn7Var.m13596n()) == 443) {
                gvn7Var.hyr(4);
                int iLvui = gvn7Var.lvui();
                if (gvn7Var.m13594k() < iLvui) {
                    gvn7Var.n5r1(iM13591g);
                    return;
                }
                gvn7Var.hyr(iLvui);
            }
            while (gvn7Var.m13594k() >= 4 && (iLd6 = fu4.ld6(gvn7Var.m13598q(), gvn7Var.m13596n())) != 442 && iLd6 != 441 && (iLd6 >>> 8) == 1) {
                gvn7Var.hyr(4);
                if (gvn7Var.m13594k() < 2) {
                    gvn7Var.n5r1(iM13591g);
                    return;
                }
                gvn7Var.n5r1(Math.min(gvn7Var.m13591g(), gvn7Var.m13596n() + gvn7Var.lvui()));
            }
        }

        private AbstractC3355k.n zy(com.google.android.exoplayer2.util.gvn7 gvn7Var, long j2, long j3) {
            int iM13596n = -1;
            int iM13596n2 = -1;
            long j4 = -9223372036854775807L;
            while (gvn7Var.m13594k() >= 4) {
                if (fu4.ld6(gvn7Var.m13598q(), gvn7Var.m13596n()) != 442) {
                    gvn7Var.hyr(1);
                } else {
                    gvn7Var.hyr(4);
                    long jX2 = C3423z.x2(gvn7Var);
                    if (jX2 != C3548p.f65257toq) {
                        long qVar = this.f20218k.toq(jX2);
                        if (qVar > j2) {
                            return j4 == C3548p.f65257toq ? AbstractC3355k.n.m11769q(qVar, j3) : AbstractC3355k.n.m11768n(j3 + ((long) iM13596n2));
                        }
                        if (fu4.f20216g + qVar > j2) {
                            return AbstractC3355k.n.m11768n(j3 + ((long) gvn7Var.m13596n()));
                        }
                        iM13596n2 = gvn7Var.m13596n();
                        j4 = qVar;
                    }
                    m11965q(gvn7Var);
                    iM13596n = gvn7Var.m13596n();
                }
            }
            return j4 != C3548p.f65257toq ? AbstractC3355k.n.m11766g(j4, j3 + ((long) iM13596n)) : AbstractC3355k.n.f19858y;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.g
        /* JADX INFO: renamed from: k */
        public AbstractC3355k.n mo11710k(com.google.android.exoplayer2.extractor.ld6 ld6Var, long j2) throws IOException {
            long position = ld6Var.getPosition();
            int iMin = (int) Math.min(n5r1.f63474zurt, ld6Var.getLength() - position);
            this.f64446toq.dd(iMin);
            ld6Var.fn3e(this.f64446toq.m13598q(), 0, iMin);
            return zy(this.f64446toq, j2, position);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.g
        public void toq() {
            this.f64446toq.x9kr(lrht.f23228g);
        }

        private toq(C3847l c3847l) {
            this.f20218k = c3847l;
            this.f64446toq = new com.google.android.exoplayer2.util.gvn7();
        }
    }

    public fu4(C3847l c3847l, long j2, long j3) {
        super(new AbstractC3355k.toq(), new toq(c3847l), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ld6(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
