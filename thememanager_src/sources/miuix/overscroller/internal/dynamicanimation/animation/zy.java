package miuix.overscroller.internal.dynamicanimation.animation;

import miuix.overscroller.internal.dynamicanimation.animation.toq;

/* JADX INFO: compiled from: FlingAnimation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy extends miuix.overscroller.internal.dynamicanimation.animation.toq<zy> {

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private toq f87932d3;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private final C7227k f87933gvn7;

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.zy$k */
    /* JADX INFO: compiled from: FlingAnimation.java */
    static final class C7227k implements InterfaceC7214g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final float f87934f7l8 = 62.5f;

        /* JADX INFO: renamed from: g */
        private static final float f40754g = -4.2f;

        /* JADX INFO: renamed from: y */
        private static final int f40755y = 16;

        /* JADX INFO: renamed from: q */
        private double f40758q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f87935toq;

        /* JADX INFO: renamed from: k */
        private float f40756k = f40754g;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final toq.C7219h f87936zy = new toq.C7219h();

        /* JADX INFO: renamed from: n */
        private final float f40757n = 1000.0f;

        C7227k() {
        }

        /* JADX INFO: renamed from: g */
        toq.C7219h m26242g(float f2, float f3, long j2) {
            float fMin = Math.min(j2, 16L) / 1000.0f;
            double dPow = Math.pow(1.0d - this.f40758q, fMin);
            toq.C7219h c7219h = this.f87936zy;
            float f4 = (float) (((double) f3) * dPow);
            c7219h.f87918toq = f4;
            float f5 = f2 + (fMin * f4);
            c7219h.f40744k = f5;
            if (isAtEquilibrium(f5, f4)) {
                this.f87936zy.f87918toq = 0.0f;
            }
            return this.f87936zy;
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.InterfaceC7214g
        public float getAcceleration(float f2, float f3) {
            return f3 * this.f40756k;
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.InterfaceC7214g
        public boolean isAtEquilibrium(float f2, float f3) {
            return Math.abs(f3) < this.f87935toq;
        }

        /* JADX INFO: renamed from: n */
        void m26243n(float f2) {
            this.f87935toq = f2 * f87934f7l8;
        }

        /* JADX INFO: renamed from: q */
        void m26244q(float f2) {
            float f3 = f2 * f40754g;
            this.f40756k = f3;
            this.f40758q = 1.0d - Math.pow(2.718281828459045d, f3);
        }

        float zy() {
            return this.f40756k / f40754g;
        }
    }

    /* JADX INFO: compiled from: FlingAnimation.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo26245k(int i2);
    }

    public zy(C7216n c7216n, toq toqVar) {
        super(c7216n);
        C7227k c7227k = new C7227k();
        this.f87933gvn7 = c7227k;
        c7227k.m26243n(m26202y());
        this.f87932d3 = toqVar;
    }

    private float jk(float f2) {
        return (float) ((Math.log(f2 / this.f40738k) * 1000.0d) / ((double) this.f87933gvn7.f40756k));
    }

    public zy a9(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.f87933gvn7.m26244q(f2);
        return this;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    void fn3e(float f2) {
        this.f87933gvn7.m26243n(f2);
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: fti, reason: merged with bridge method [inline-methods] */
    public zy kja0(float f2) {
        super.kja0(f2);
        return this;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: gvn7, reason: merged with bridge method [inline-methods] */
    public zy mo26199i(float f2) {
        super.mo26199i(f2);
        return this;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: jp0y, reason: merged with bridge method [inline-methods] */
    public zy mo26198h(float f2) {
        super.mo26198h(f2);
        return this;
    }

    public float mcp(float f2) {
        return jk(((f2 - this.f87913toq) + (this.f40738k / this.f87933gvn7.f40756k)) * this.f87933gvn7.f40756k);
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: n */
    float mo26182n(float f2, float f3) {
        return this.f87933gvn7.getAcceleration(f2, f3);
    }

    public float o1t() {
        return this.f87933gvn7.zy();
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: s */
    boolean mo26183s(float f2, float f3) {
        return f2 >= this.f87910f7l8 || f2 <= this.f40743y || this.f87933gvn7.isAtEquilibrium(f2, f3);
    }

    /* JADX INFO: renamed from: t */
    public float m26240t() {
        return (this.f87913toq - (this.f40738k / this.f87933gvn7.f40756k)) + ((Math.signum(this.f40738k) * this.f87933gvn7.f87935toq) / this.f87933gvn7.f40756k);
    }

    public float wvg() {
        return jk(Math.signum(this.f40738k) * this.f87933gvn7.f87935toq);
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: z */
    boolean mo26185z(long j2) {
        toq.C7219h c7219hM26242g = this.f87933gvn7.m26242g(this.f87913toq, this.f40738k, j2);
        float f2 = c7219hM26242g.f40744k;
        this.f87913toq = f2;
        float f3 = c7219hM26242g.f87918toq;
        this.f40738k = f3;
        float f4 = this.f40743y;
        if (f2 < f4) {
            this.f87913toq = f4;
            return true;
        }
        float f5 = this.f87910f7l8;
        if (f2 > f5) {
            this.f87913toq = f5;
            return true;
        }
        if (!mo26183s(f2, f3)) {
            return false;
        }
        this.f87932d3.mo26245k((int) this.f87913toq);
        return true;
    }

    public <K> zy(K k2, AbstractC7217q<K> abstractC7217q) {
        super(k2, abstractC7217q);
        C7227k c7227k = new C7227k();
        this.f87933gvn7 = c7227k;
        c7227k.m26243n(m26202y());
    }
}
