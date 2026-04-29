package miuix.overscroller.internal.dynamicanimation.animation;

import miuix.overscroller.internal.dynamicanimation.animation.toq;

/* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.y */
/* JADX INFO: compiled from: SpringForce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C7226y implements InterfaceC7214g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final float f87919cdj = 0.5f;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final float f87920fn3e = 0.6f;

    /* JADX INFO: renamed from: h */
    public static final float f40745h = 0.2f;

    /* JADX INFO: renamed from: i */
    private static final double f40746i = 62.5d;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final float f87921ki = 0.75f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final float f87922kja0 = 50.0f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final float f87923n7h = 200.0f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final float f87924qrj = 1500.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final float f87925t8r = 1.0f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final float f87926x2 = 10000.0f;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final double f87927zurt = Double.MAX_VALUE;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private double f87928f7l8;

    /* JADX INFO: renamed from: g */
    private double f40747g;

    /* JADX INFO: renamed from: k */
    double f40748k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final toq.C7219h f87929ld6;

    /* JADX INFO: renamed from: n */
    private double f40749n;

    /* JADX INFO: renamed from: p */
    private double f40750p;

    /* JADX INFO: renamed from: q */
    private boolean f40751q;

    /* JADX INFO: renamed from: s */
    private double f40752s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    double f87930toq;

    /* JADX INFO: renamed from: y */
    private double f40753y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    double f87931zy;

    public C7226y() {
        this.f40748k = Math.sqrt(1500.0d);
        this.f87930toq = 0.5d;
        this.f87931zy = 1000.0d;
        this.f40751q = false;
        this.f40750p = Double.MAX_VALUE;
        this.f87929ld6 = new toq.C7219h();
    }

    /* JADX INFO: renamed from: q */
    private void m26233q() {
        if (this.f40751q) {
            return;
        }
        if (this.f40750p == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d2 = this.f87930toq;
        if (d2 > 1.0d) {
            double d4 = this.f40748k;
            this.f87928f7l8 = ((-d2) * d4) + (d4 * Math.sqrt((d2 * d2) - 1.0d));
            double d5 = this.f87930toq;
            double d6 = this.f40748k;
            this.f40753y = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
        } else if (d2 >= 0.0d && d2 < 1.0d) {
            this.f40752s = this.f40748k * Math.sqrt(1.0d - (d2 * d2));
        }
        this.f40751q = true;
    }

    public C7226y f7l8(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f40748k = Math.sqrt(f2);
        this.f40751q = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C7226y m26234g(float f2) {
        this.f40750p = f2;
        return this;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.InterfaceC7214g
    public float getAcceleration(float f2, float f3) {
        float qVar = f2 - toq();
        double d2 = this.f40748k;
        return (float) (((-(d2 * d2)) * ((double) qVar)) - (((d2 * 2.0d) * this.f87930toq) * ((double) f3)));
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.InterfaceC7214g
    public boolean isAtEquilibrium(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.f40747g && ((double) Math.abs(f2 - toq())) < this.f40749n;
    }

    /* JADX INFO: renamed from: k */
    public float m26235k() {
        return (float) this.f87930toq;
    }

    /* JADX INFO: renamed from: n */
    public C7226y m26236n(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f87930toq = f2;
        this.f40751q = false;
        return this;
    }

    /* JADX INFO: renamed from: p */
    toq.C7219h m26237p(double d2, double d4, long j2) {
        double dCos;
        double dPow;
        m26233q();
        double d5 = j2 / this.f87931zy;
        double d6 = d2 - this.f40750p;
        double d7 = this.f87930toq;
        if (d7 > 1.0d) {
            double d8 = this.f40753y;
            double d9 = this.f87928f7l8;
            double d10 = d6 - (((d8 * d6) - d4) / (d8 - d9));
            double d11 = ((d6 * d8) - d4) / (d8 - d9);
            dPow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f87928f7l8 * d5) * d11);
            double d12 = this.f40753y;
            double dPow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f87928f7l8;
            dCos = dPow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f40748k;
            double d15 = d4 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            dPow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double dPow3 = d16 * Math.pow(2.718281828459045d, (-this.f40748k) * d5);
            double d17 = this.f40748k;
            dCos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (dPow3 * (-d17));
        } else {
            double d18 = 1.0d / this.f40752s;
            double d19 = this.f40748k;
            double d20 = d18 * ((d7 * d19 * d6) + d4);
            double dPow4 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f40752s * d5) * d6) + (Math.sin(this.f40752s * d5) * d20));
            double d21 = this.f40748k;
            double d22 = this.f87930toq;
            double d23 = (-d21) * dPow4 * d22;
            double dPow5 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d24 = this.f40752s;
            double dSin = (-d24) * d6 * Math.sin(d24 * d5);
            double d25 = this.f40752s;
            dCos = d23 + (dPow5 * (dSin + (d20 * d25 * Math.cos(d25 * d5))));
            dPow = dPow4;
        }
        if (Math.abs(dPow) < 0.6000000238418579d) {
            dPow = 0.0d;
            dCos = 0.0d;
        }
        toq.C7219h c7219h = this.f87929ld6;
        c7219h.f40744k = (float) (dPow + this.f40750p);
        c7219h.f87918toq = (float) dCos;
        return c7219h;
    }

    /* JADX INFO: renamed from: s */
    void m26238s(double d2) {
        double dAbs = Math.abs(d2);
        this.f40749n = dAbs;
        this.f40747g = dAbs * f40746i;
    }

    public float toq() {
        return (float) this.f40750p;
    }

    /* JADX INFO: renamed from: y */
    public C7226y m26239y(double d2) {
        this.f87931zy = d2;
        return this;
    }

    public float zy() {
        double d2 = this.f40748k;
        return (float) (d2 * d2);
    }

    public C7226y(float f2) {
        this.f40748k = Math.sqrt(1500.0d);
        this.f87930toq = 0.5d;
        this.f87931zy = 1000.0d;
        this.f40751q = false;
        this.f40750p = Double.MAX_VALUE;
        this.f87929ld6 = new toq.C7219h();
        this.f40750p = f2;
    }
}
