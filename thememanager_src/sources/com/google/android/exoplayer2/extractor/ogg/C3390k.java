package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.qrj;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.EOFException;
import java.io.IOException;
import zy.dd;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.k */
/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3390k implements f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64341cdj = 1;

    /* JADX INFO: renamed from: h */
    private static final int f20118h = 0;

    /* JADX INFO: renamed from: i */
    private static final int f20119i = 4;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64342ki = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64343kja0 = 30000;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64344n7h = 100000;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64345qrj = 72000;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64346t8r = 3;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64347f7l8;

    /* JADX INFO: renamed from: g */
    private long f20120g;

    /* JADX INFO: renamed from: k */
    private final C3389g f20121k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64348ld6;

    /* JADX INFO: renamed from: n */
    private int f20122n;

    /* JADX INFO: renamed from: p */
    private long f20123p;

    /* JADX INFO: renamed from: q */
    private final AbstractC3394s f20124q;

    /* JADX INFO: renamed from: s */
    private long f20125s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f64349toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f64350x2;

    /* JADX INFO: renamed from: y */
    private long f20126y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f64351zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.k$toq */
    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    private final class toq implements o1t {
        private toq() {
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        public boolean f7l8() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: n */
        public o1t.C3388k mo11754n(long j2) {
            return new o1t.C3388k(new wvg(j2, lrht.m13660i((C3390k.this.f64349toq + ((C3390k.this.f20124q.zy(j2) * (C3390k.this.f64351zy - C3390k.this.f64349toq)) / C3390k.this.f20120g)) - 30000, C3390k.this.f64349toq, C3390k.this.f64351zy - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: s */
        public long mo11755s() {
            return C3390k.this.f20124q.toq(C3390k.this.f20120g);
        }
    }

    public C3390k(AbstractC3394s abstractC3394s, long j2, long j3, long j4, long j5, boolean z2) {
        C3844k.m13629k(j2 >= 0 && j3 > j2);
        this.f20124q = abstractC3394s;
        this.f64349toq = j2;
        this.f64351zy = j3;
        if (j4 == j3 - j2 || z2) {
            this.f20120g = j5;
            this.f20122n = 4;
        } else {
            this.f20122n = 0;
        }
        this.f20121k = new C3389g();
    }

    private void ld6(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        while (true) {
            this.f20121k.zy(ld6Var);
            this.f20121k.m11897k(ld6Var, false);
            C3389g c3389g = this.f20121k;
            if (c3389g.f64340zy > this.f20126y) {
                ld6Var.mo11730y();
                return;
            } else {
                ld6Var.cdj(c3389g.f20117y + c3389g.f20116s);
                this.f20125s = ld6Var.getPosition();
                this.f64348ld6 = this.f20121k.f64340zy;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private long m11902s(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        if (this.f20125s == this.f20123p) {
            return -1L;
        }
        long position = ld6Var.getPosition();
        if (!this.f20121k.m11898q(ld6Var, this.f20123p)) {
            long j2 = this.f20125s;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f20121k.m11897k(ld6Var, false);
        ld6Var.mo11730y();
        long j3 = this.f20126y;
        C3389g c3389g = this.f20121k;
        long j4 = c3389g.f64340zy;
        long j5 = j3 - j4;
        int i2 = c3389g.f20117y + c3389g.f20116s;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        if (j5 < 0) {
            this.f20123p = position;
            this.f64350x2 = j4;
        } else {
            this.f20125s = ld6Var.getPosition() + ((long) i2);
            this.f64348ld6 = this.f20121k.f64340zy;
        }
        long j6 = this.f20123p;
        long j7 = this.f20125s;
        if (j6 - j7 < 100000) {
            this.f20123p = j7;
            return j7;
        }
        long position2 = ld6Var.getPosition() - (((long) i2) * (j5 <= 0 ? 2L : 1L));
        long j8 = this.f20123p;
        long j9 = this.f20125s;
        return lrht.m13660i(position2 + ((j5 * (j8 - j9)) / (this.f64350x2 - this.f64348ld6)), j9, j8 - 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
    /* JADX INFO: renamed from: k */
    public long mo11896k(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int i2 = this.f20122n;
        if (i2 == 0) {
            long position = ld6Var.getPosition();
            this.f64347f7l8 = position;
            this.f20122n = 1;
            long j2 = this.f64351zy - 65307;
            if (j2 > position) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long jM11902s = m11902s(ld6Var);
                if (jM11902s != -1) {
                    return jM11902s;
                }
                this.f20122n = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            ld6(ld6Var);
            this.f20122n = 4;
            return -(this.f64348ld6 + 2);
        }
        this.f20120g = m11903p(ld6Var);
        this.f20122n = 4;
        return this.f64347f7l8;
    }

    @yz
    /* JADX INFO: renamed from: p */
    long m11903p(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        this.f20121k.toq();
        if (!this.f20121k.zy(ld6Var)) {
            throw new EOFException();
        }
        this.f20121k.m11897k(ld6Var, false);
        C3389g c3389g = this.f20121k;
        ld6Var.cdj(c3389g.f20117y + c3389g.f20116s);
        long j2 = this.f20121k.f64340zy;
        while (true) {
            C3389g c3389g2 = this.f20121k;
            if ((c3389g2.f64339toq & 4) == 4 || !c3389g2.zy(ld6Var) || ld6Var.getPosition() >= this.f64351zy || !this.f20121k.m11897k(ld6Var, true)) {
                break;
            }
            C3389g c3389g3 = this.f20121k;
            if (!qrj.m11924n(ld6Var, c3389g3.f20117y + c3389g3.f20116s)) {
                break;
            }
            j2 = this.f20121k.f64340zy;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
    @dd
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public toq toq() {
        if (this.f20120g != 0) {
            return new toq();
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
    public void zy(long j2) {
        this.f20126y = lrht.m13660i(j2, 0L, this.f20120g - 1);
        this.f20122n = 2;
        this.f20125s = this.f64349toq;
        this.f20123p = this.f64351zy;
        this.f64348ld6 = 0L;
        this.f64350x2 = this.f20120g;
    }
}
