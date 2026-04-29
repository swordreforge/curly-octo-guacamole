package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k */
/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3355k {

    /* JADX INFO: renamed from: n */
    private static final long f19846n = 262144;

    /* JADX INFO: renamed from: k */
    protected final k f19847k;

    /* JADX INFO: renamed from: q */
    private final int f19848q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected final g f63787toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    protected zy f63788zy;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k$g */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface g {
        /* JADX INFO: renamed from: k */
        n mo11710k(ld6 ld6Var, long j2) throws IOException;

        default void toq() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k$k */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class k implements o1t {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final long f63789f7l8;

        /* JADX INFO: renamed from: g */
        private final long f19849g;

        /* JADX INFO: renamed from: n */
        private final long f19850n;

        /* JADX INFO: renamed from: p */
        private final long f19851p;

        /* JADX INFO: renamed from: q */
        private final q f19852q;

        /* JADX INFO: renamed from: s */
        private final long f19853s;

        /* JADX INFO: renamed from: y */
        private final long f19854y;

        public k(q qVar, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f19852q = qVar;
            this.f19850n = j2;
            this.f19849g = j3;
            this.f63789f7l8 = j4;
            this.f19854y = j5;
            this.f19853s = j6;
            this.f19851p = j7;
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        public boolean f7l8() {
            return true;
        }

        public long ld6(long j2) {
            return this.f19852q.mo11704k(j2);
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: n */
        public o1t.C3388k mo11754n(long j2) {
            return new o1t.C3388k(new wvg(j2, zy.m11777y(this.f19852q.mo11704k(j2), this.f19849g, this.f63789f7l8, this.f19854y, this.f19853s, this.f19851p)));
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: s */
        public long mo11755s() {
            return this.f19850n;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k$n */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class n {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f63790f7l8 = -3;

        /* JADX INFO: renamed from: g */
        public static final int f19855g = -2;

        /* JADX INFO: renamed from: n */
        public static final int f19856n = -1;

        /* JADX INFO: renamed from: q */
        public static final int f19857q = 0;

        /* JADX INFO: renamed from: y */
        public static final n f19858y = new n(-3, C3548p.f65257toq, -1);

        /* JADX INFO: renamed from: k */
        private final int f19859k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f63791toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final long f63792zy;

        private n(int i2, long j2, long j3) {
            this.f19859k = i2;
            this.f63791toq = j2;
            this.f63792zy = j3;
        }

        /* JADX INFO: renamed from: g */
        public static n m11766g(long j2, long j3) {
            return new n(-2, j2, j3);
        }

        /* JADX INFO: renamed from: n */
        public static n m11768n(long j2) {
            return new n(0, C3548p.f65257toq, j2);
        }

        /* JADX INFO: renamed from: q */
        public static n m11769q(long j2, long j3) {
            return new n(-1, j2, j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k$q */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface q {
        /* JADX INFO: renamed from: k */
        long mo11704k(long j2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k$toq */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class toq implements q {
        @Override // com.google.android.exoplayer2.extractor.AbstractC3355k.q
        /* JADX INFO: renamed from: k */
        public long mo11704k(long j2) {
            return j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.k$zy */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    protected static class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f63793f7l8;

        /* JADX INFO: renamed from: g */
        private long f19860g;

        /* JADX INFO: renamed from: k */
        private final long f19861k;

        /* JADX INFO: renamed from: n */
        private long f19862n;

        /* JADX INFO: renamed from: q */
        private long f19863q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f63794toq;

        /* JADX INFO: renamed from: y */
        private long f19864y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final long f63795zy;

        protected zy(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.f19861k = j2;
            this.f63794toq = j3;
            this.f19863q = j4;
            this.f19862n = j5;
            this.f19860g = j6;
            this.f63793f7l8 = j7;
            this.f63795zy = j8;
            this.f19864y = m11777y(j3, j4, j5, j6, j7, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m11771h(long j2, long j3) {
            this.f19863q = j2;
            this.f19860g = j3;
            n7h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kja0(long j2, long j3) {
            this.f19862n = j2;
            this.f63793f7l8 = j3;
            n7h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long ld6() {
            return this.f19864y;
        }

        private void n7h() {
            this.f19864y = m11777y(this.f63794toq, this.f19863q, this.f19862n, this.f19860g, this.f63793f7l8, this.f63795zy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public long m11774p() {
            return this.f19860g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long qrj() {
            return this.f63794toq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public long m11776s() {
            return this.f63793f7l8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long x2() {
            return this.f19861k;
        }

        /* JADX INFO: renamed from: y */
        protected static long m11777y(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
            return lrht.m13660i(((j8 + j5) - j7) - (j8 / 20), j5, j6 - 1);
        }
    }

    protected AbstractC3355k(q qVar, g gVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.f63787toq = gVar;
        this.f19848q = i2;
        this.f19847k = new k(qVar, j2, j3, j4, j5, j6, j7);
    }

    protected final int f7l8(ld6 ld6Var, long j2, fu4 fu4Var) {
        if (j2 == ld6Var.getPosition()) {
            return 0;
        }
        fu4Var.f19818k = j2;
        return 1;
    }

    /* JADX INFO: renamed from: g */
    protected void m11757g(boolean z2, long j2) {
    }

    /* JADX INFO: renamed from: k */
    protected zy m11758k(long j2) {
        return new zy(j2, this.f19847k.ld6(j2), this.f19847k.f19849g, this.f19847k.f63789f7l8, this.f19847k.f19854y, this.f19847k.f19853s, this.f19847k.f19851p);
    }

    /* JADX INFO: renamed from: n */
    protected final void m11759n(boolean z2, long j2) {
        this.f63788zy = null;
        this.f63787toq.toq();
        m11757g(z2, j2);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11760q() {
        return this.f63788zy != null;
    }

    /* JADX INFO: renamed from: s */
    protected final boolean m11761s(ld6 ld6Var, long j2) throws IOException {
        long position = j2 - ld6Var.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        ld6Var.cdj((int) position);
        return true;
    }

    public final o1t toq() {
        return this.f19847k;
    }

    /* JADX INFO: renamed from: y */
    public final void m11762y(long j2) {
        zy zyVar = this.f63788zy;
        if (zyVar == null || zyVar.x2() != j2) {
            this.f63788zy = m11758k(j2);
        }
    }

    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        while (true) {
            zy zyVar = (zy) C3844k.ld6(this.f63788zy);
            long jM11774p = zyVar.m11774p();
            long jM11776s = zyVar.m11776s();
            long jLd6 = zyVar.ld6();
            if (jM11776s - jM11774p <= this.f19848q) {
                m11759n(false, jM11774p);
                return f7l8(ld6Var, jM11774p, fu4Var);
            }
            if (!m11761s(ld6Var, jLd6)) {
                return f7l8(ld6Var, jLd6, fu4Var);
            }
            ld6Var.mo11730y();
            n nVarMo11710k = this.f63787toq.mo11710k(ld6Var, zyVar.qrj());
            int i2 = nVarMo11710k.f19859k;
            if (i2 == -3) {
                m11759n(false, jLd6);
                return f7l8(ld6Var, jLd6, fu4Var);
            }
            if (i2 == -2) {
                zyVar.m11771h(nVarMo11710k.f63791toq, nVarMo11710k.f63792zy);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m11761s(ld6Var, nVarMo11710k.f63792zy);
                    m11759n(true, nVarMo11710k.f63792zy);
                    return f7l8(ld6Var, nVarMo11710k.f63792zy, fu4Var);
                }
                zyVar.kja0(nVarMo11710k.f63791toq, nVarMo11710k.f63792zy);
            }
        }
    }
}
