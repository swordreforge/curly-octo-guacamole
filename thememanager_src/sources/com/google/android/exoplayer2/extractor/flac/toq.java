package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.AbstractC3355k;
import com.google.android.exoplayer2.extractor.C3348h;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.t8r;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq extends AbstractC3355k {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flac.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    private static final class C7953toq implements AbstractC3355k.g {

        /* JADX INFO: renamed from: k */
        private final t8r f19778k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f63717toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C3348h.k f63718zy;

        private long zy(ld6 ld6Var) throws IOException {
            while (ld6Var.x2() < ld6Var.getLength() - 6 && !C3348h.m11737y(ld6Var, this.f19778k, this.f63717toq, this.f63718zy)) {
                ld6Var.qrj(1);
            }
            if (ld6Var.x2() < ld6Var.getLength() - 6) {
                return this.f63718zy.f19825k;
            }
            ld6Var.qrj((int) (ld6Var.getLength() - ld6Var.x2()));
            return this.f19778k.f20172p;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.g
        /* JADX INFO: renamed from: k */
        public AbstractC3355k.n mo11710k(ld6 ld6Var, long j2) throws IOException {
            long position = ld6Var.getPosition();
            long jZy = zy(ld6Var);
            long jX2 = ld6Var.x2();
            ld6Var.qrj(Math.max(6, this.f19778k.f64401zy));
            long jZy2 = zy(ld6Var);
            return (jZy > j2 || jZy2 <= j2) ? jZy2 <= j2 ? AbstractC3355k.n.m11766g(jZy2, ld6Var.x2()) : AbstractC3355k.n.m11769q(jZy, position) : AbstractC3355k.n.m11768n(jX2);
        }

        private C7953toq(t8r t8rVar, int i2) {
            this.f19778k = t8rVar;
            this.f63717toq = i2;
            this.f63718zy = new C3348h.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toq(final t8r t8rVar, int i2, long j2, long j3) {
        super(new AbstractC3355k.q() { // from class: com.google.android.exoplayer2.extractor.flac.k
            @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.q
            /* JADX INFO: renamed from: k */
            public final long mo11704k(long j4) {
                return t8rVar.x2(j4);
            }
        }, new C7953toq(t8rVar, i2), t8rVar.m11938y(), 0L, t8rVar.f20172p, j2, j3, t8rVar.m11934n(), Math.max(6, t8rVar.f64401zy));
        Objects.requireNonNull(t8rVar);
    }
}
