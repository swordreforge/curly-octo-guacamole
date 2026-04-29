package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.toq;
import zy.zurt;

/* JADX INFO: compiled from: FlingAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends toq<zy> {

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private final C0803k f51080jp0y;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.zy$k */
    /* JADX INFO: compiled from: FlingAnimation.java */
    static final class C0803k implements InterfaceC0790g {

        /* JADX INFO: renamed from: n */
        private static final float f4427n = 62.5f;

        /* JADX INFO: renamed from: q */
        private static final float f4428q = -4.2f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f51081toq;

        /* JADX INFO: renamed from: k */
        private float f4429k = f4428q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final toq.C0795h f51082zy = new toq.C0795h();

        C0803k() {
        }

        @Override // androidx.dynamicanimation.animation.InterfaceC0790g
        public float getAcceleration(float f2, float f3) {
            return f3 * this.f4429k;
        }

        @Override // androidx.dynamicanimation.animation.InterfaceC0790g
        public boolean isAtEquilibrium(float f2, float f3) {
            return Math.abs(f3) < this.f51081toq;
        }

        /* JADX INFO: renamed from: k */
        float m3858k() {
            return this.f4429k / f4428q;
        }

        /* JADX INFO: renamed from: q */
        toq.C0795h m3859q(float f2, float f3, long j2) {
            float f4 = j2;
            this.f51082zy.f51068toq = (float) (((double) f3) * Math.exp((f4 / 1000.0f) * this.f4429k));
            toq.C0795h c0795h = this.f51082zy;
            float f5 = this.f4429k;
            c0795h.f4417k = (float) (((double) (f2 - (f3 / f5))) + (((double) (f3 / f5)) * Math.exp((f5 * f4) / 1000.0f)));
            toq.C0795h c0795h2 = this.f51082zy;
            if (isAtEquilibrium(c0795h2.f4417k, c0795h2.f51068toq)) {
                this.f51082zy.f51068toq = 0.0f;
            }
            return this.f51082zy;
        }

        void toq(float f2) {
            this.f4429k = f2 * f4428q;
        }

        void zy(float f2) {
            this.f51081toq = f2 * f4427n;
        }
    }

    public zy(C0792n c0792n) {
        super(c0792n);
        C0803k c0803k = new C0803k();
        this.f51080jp0y = c0803k;
        c0803k.zy(m3819y());
    }

    @Override // androidx.dynamicanimation.animation.toq
    void fn3e(float f2) {
        this.f51080jp0y.zy(f2);
    }

    @Override // androidx.dynamicanimation.animation.toq
    boolean fu4(long j2) {
        toq.C0795h c0795hM3859q = this.f51080jp0y.m3859q(this.f51063toq, this.f4411k, j2);
        float f2 = c0795hM3859q.f4417k;
        this.f51063toq = f2;
        float f3 = c0795hM3859q.f51068toq;
        this.f4411k = f3;
        float f4 = this.f4416y;
        if (f2 < f4) {
            this.f51063toq = f4;
            return true;
        }
        float f5 = this.f51061f7l8;
        if (f2 <= f5) {
            return mo3801s(f2, f3);
        }
        this.f51063toq = f5;
        return true;
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: mcp, reason: merged with bridge method [inline-methods] */
    public zy mo3816i(float f2) {
        super.mo3816i(f2);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: n */
    float mo3800n(float f2, float f3) {
        return this.f51080jp0y.getAcceleration(f2, f3);
    }

    public zy o1t(@zurt(from = 0.0d, fromInclusive = false) float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.f51080jp0y.toq(f2);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: s */
    boolean mo3801s(float f2, float f3) {
        return f2 >= this.f51061f7l8 || f2 <= this.f4416y || this.f51080jp0y.isAtEquilibrium(f2, f3);
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public zy mo3815h(float f2) {
        super.mo3815h(f2);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: wvg, reason: merged with bridge method [inline-methods] */
    public zy kja0(float f2) {
        super.kja0(f2);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public float m3857z() {
        return this.f51080jp0y.m3858k();
    }

    public <K> zy(K k2, AbstractC0793q<K> abstractC0793q) {
        super(k2, abstractC0793q);
        C0803k c0803k = new C0803k();
        this.f51080jp0y = c0803k;
        c0803k.zy(m3819y());
    }
}
