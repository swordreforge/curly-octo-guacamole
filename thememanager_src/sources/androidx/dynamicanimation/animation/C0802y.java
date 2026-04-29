package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.toq;
import zy.uv6;
import zy.zurt;

/* JADX INFO: renamed from: androidx.dynamicanimation.animation.y */
/* JADX INFO: compiled from: SpringForce.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0802y implements InterfaceC0790g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final float f51069cdj = 0.75f;

    /* JADX INFO: renamed from: h */
    public static final float f4418h = 0.5f;

    /* JADX INFO: renamed from: i */
    private static final double f4419i = Double.MAX_VALUE;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final float f51070ki = 1.0f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final float f51071kja0 = 0.2f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final float f51072ld6 = 10000.0f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final float f51073n7h = 50.0f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final float f51074qrj = 200.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final double f51075t8r = 62.5d;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final float f51076x2 = 1500.0f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private double f51077f7l8;

    /* JADX INFO: renamed from: g */
    private double f4420g;

    /* JADX INFO: renamed from: k */
    double f4421k;

    /* JADX INFO: renamed from: n */
    private double f4422n;

    /* JADX INFO: renamed from: p */
    private final toq.C0795h f4423p;

    /* JADX INFO: renamed from: q */
    private double f4424q;

    /* JADX INFO: renamed from: s */
    private double f4425s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    double f51078toq;

    /* JADX INFO: renamed from: y */
    private double f4426y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f51079zy;

    public C0802y() {
        this.f4421k = Math.sqrt(1500.0d);
        this.f51078toq = 0.5d;
        this.f51079zy = false;
        this.f4425s = Double.MAX_VALUE;
        this.f4423p = new toq.C0795h();
    }

    /* JADX INFO: renamed from: q */
    private void m3850q() {
        if (this.f51079zy) {
            return;
        }
        if (this.f4425s == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d2 = this.f51078toq;
        if (d2 > 1.0d) {
            double d4 = this.f4421k;
            this.f4420g = ((-d2) * d4) + (d4 * Math.sqrt((d2 * d2) - 1.0d));
            double d5 = this.f51078toq;
            double d6 = this.f4421k;
            this.f51077f7l8 = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
        } else if (d2 >= 0.0d && d2 < 1.0d) {
            this.f4426y = this.f4421k * Math.sqrt(1.0d - (d2 * d2));
        }
        this.f51079zy = true;
    }

    public C0802y f7l8(@zurt(from = 0.0d, fromInclusive = false) float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f4421k = Math.sqrt(f2);
        this.f51079zy = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0802y m3851g(float f2) {
        this.f4425s = f2;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.InterfaceC0790g
    @uv6({uv6.EnumC7844k.LIBRARY})
    public float getAcceleration(float f2, float f3) {
        float qVar = f2 - toq();
        double d2 = this.f4421k;
        return (float) (((-(d2 * d2)) * ((double) qVar)) - (((d2 * 2.0d) * this.f51078toq) * ((double) f3)));
    }

    @Override // androidx.dynamicanimation.animation.InterfaceC0790g
    @uv6({uv6.EnumC7844k.LIBRARY})
    public boolean isAtEquilibrium(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.f4422n && ((double) Math.abs(f2 - toq())) < this.f4424q;
    }

    /* JADX INFO: renamed from: k */
    public float m3852k() {
        return (float) this.f51078toq;
    }

    /* JADX INFO: renamed from: n */
    public C0802y m3853n(@zurt(from = 0.0d) float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f51078toq = f2;
        this.f51079zy = false;
        return this;
    }

    /* JADX INFO: renamed from: s */
    toq.C0795h m3854s(double d2, double d4, long j2) {
        double dCos;
        double dPow;
        m3850q();
        double d5 = j2 / 1000.0d;
        double d6 = d2 - this.f4425s;
        double d7 = this.f51078toq;
        if (d7 > 1.0d) {
            double d8 = this.f51077f7l8;
            double d9 = this.f4420g;
            double d10 = d6 - (((d8 * d6) - d4) / (d8 - d9));
            double d11 = ((d6 * d8) - d4) / (d8 - d9);
            dPow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f4420g * d5) * d11);
            double d12 = this.f51077f7l8;
            double dPow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f4420g;
            dCos = dPow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f4421k;
            double d15 = d4 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            dPow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double dPow3 = d16 * Math.pow(2.718281828459045d, (-this.f4421k) * d5);
            double d17 = this.f4421k;
            dCos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (dPow3 * (-d17));
        } else {
            double d18 = 1.0d / this.f4426y;
            double d19 = this.f4421k;
            double d20 = d18 * ((d7 * d19 * d6) + d4);
            double dPow4 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f4426y * d5) * d6) + (Math.sin(this.f4426y * d5) * d20));
            double d21 = this.f4421k;
            double d22 = this.f51078toq;
            double d23 = (-d21) * dPow4 * d22;
            double dPow5 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d24 = this.f4426y;
            double dSin = (-d24) * d6 * Math.sin(d24 * d5);
            double d25 = this.f4426y;
            dCos = d23 + (dPow5 * (dSin + (d20 * d25 * Math.cos(d25 * d5))));
            dPow = dPow4;
        }
        toq.C0795h c0795h = this.f4423p;
        c0795h.f4417k = (float) (dPow + this.f4425s);
        c0795h.f51068toq = (float) dCos;
        return c0795h;
    }

    public float toq() {
        return (float) this.f4425s;
    }

    /* JADX INFO: renamed from: y */
    void m3855y(double d2) {
        double dAbs = Math.abs(d2);
        this.f4424q = dAbs;
        this.f4422n = dAbs * f51075t8r;
    }

    public float zy() {
        double d2 = this.f4421k;
        return (float) (d2 * d2);
    }

    public C0802y(float f2) {
        this.f4421k = Math.sqrt(1500.0d);
        this.f51078toq = 0.5d;
        this.f51079zy = false;
        this.f4425s = Double.MAX_VALUE;
        this.f4423p = new toq.C0795h();
        this.f4425s = f2;
    }
}
