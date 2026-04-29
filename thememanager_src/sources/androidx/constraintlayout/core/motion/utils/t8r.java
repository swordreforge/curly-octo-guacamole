package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: StopLogicEngine.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r implements ki {

    /* JADX INFO: renamed from: h */
    private static final float f1654h = 1.0E-5f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f47336f7l8;

    /* JADX INFO: renamed from: g */
    private float f1655g;

    /* JADX INFO: renamed from: k */
    private float f1656k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private String f47338ld6;

    /* JADX INFO: renamed from: n */
    private float f1657n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f47339n7h;

    /* JADX INFO: renamed from: p */
    private int f1658p;

    /* JADX INFO: renamed from: q */
    private float f1659q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f47340qrj;

    /* JADX INFO: renamed from: s */
    private float f1660s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f47341toq;

    /* JADX INFO: renamed from: y */
    private float f1661y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f47343zy;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f47342x2 = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f47337kja0 = false;

    private void f7l8(float f2, float f3, float f4, float f5, float f6) {
        this.f47337kja0 = false;
        if (f2 == 0.0f) {
            f2 = 1.0E-4f;
        }
        this.f1656k = f2;
        float f7 = f2 / f4;
        float f8 = (f7 * f2) / 2.0f;
        if (f2 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f3 - ((((-f2) / f4) * f2) / 2.0f)) * f4);
            if (fSqrt < f5) {
                this.f47338ld6 = "backward accelerate, decelerate";
                this.f1658p = 2;
                this.f1656k = f2;
                this.f47341toq = fSqrt;
                this.f47343zy = 0.0f;
                float f9 = (fSqrt - f2) / f4;
                this.f1659q = f9;
                this.f1657n = fSqrt / f4;
                this.f47336f7l8 = ((f2 + fSqrt) * f9) / 2.0f;
                this.f1661y = f3;
                this.f1660s = f3;
                return;
            }
            this.f47338ld6 = "backward accelerate cruse decelerate";
            this.f1658p = 3;
            this.f1656k = f2;
            this.f47341toq = f5;
            this.f47343zy = f5;
            float f10 = (f5 - f2) / f4;
            this.f1659q = f10;
            float f11 = f5 / f4;
            this.f1655g = f11;
            float f12 = ((f2 + f5) * f10) / 2.0f;
            float f13 = (f11 * f5) / 2.0f;
            this.f1657n = ((f3 - f12) - f13) / f5;
            this.f47336f7l8 = f12;
            this.f1661y = f3 - f13;
            this.f1660s = f3;
            return;
        }
        if (f8 >= f3) {
            this.f47338ld6 = "hard stop";
            this.f1658p = 1;
            this.f1656k = f2;
            this.f47341toq = 0.0f;
            this.f47336f7l8 = f3;
            this.f1659q = (2.0f * f3) / f2;
            return;
        }
        float f14 = f3 - f8;
        float f15 = f14 / f2;
        if (f15 + f7 < f6) {
            this.f47338ld6 = "cruse decelerate";
            this.f1658p = 2;
            this.f1656k = f2;
            this.f47341toq = f2;
            this.f47343zy = 0.0f;
            this.f47336f7l8 = f14;
            this.f1661y = f3;
            this.f1659q = f15;
            this.f1657n = f7;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f4 * f3) + ((f2 * f2) / 2.0f));
        float f16 = (fSqrt2 - f2) / f4;
        this.f1659q = f16;
        float f17 = fSqrt2 / f4;
        this.f1657n = f17;
        if (fSqrt2 < f5) {
            this.f47338ld6 = "accelerate decelerate";
            this.f1658p = 2;
            this.f1656k = f2;
            this.f47341toq = fSqrt2;
            this.f47343zy = 0.0f;
            this.f1659q = f16;
            this.f1657n = f17;
            this.f47336f7l8 = ((f2 + fSqrt2) * f16) / 2.0f;
            this.f1661y = f3;
            return;
        }
        this.f47338ld6 = "accelerate cruse decelerate";
        this.f1658p = 3;
        this.f1656k = f2;
        this.f47341toq = f5;
        this.f47343zy = f5;
        float f18 = (f5 - f2) / f4;
        this.f1659q = f18;
        float f19 = f5 / f4;
        this.f1655g = f19;
        float f20 = ((f2 + f5) * f18) / 2.0f;
        float f21 = (f19 * f5) / 2.0f;
        this.f1657n = ((f3 - f20) - f21) / f5;
        this.f47336f7l8 = f20;
        this.f1661y = f3 - f21;
        this.f1660s = f3;
    }

    /* JADX INFO: renamed from: n */
    private float m1065n(float f2) {
        this.f47337kja0 = false;
        float f3 = this.f1659q;
        if (f2 <= f3) {
            float f4 = this.f1656k;
            return (f4 * f2) + ((((this.f47341toq - f4) * f2) * f2) / (f3 * 2.0f));
        }
        int i2 = this.f1658p;
        if (i2 == 1) {
            return this.f47336f7l8;
        }
        float f5 = f2 - f3;
        float f6 = this.f1657n;
        if (f5 < f6) {
            float f7 = this.f47336f7l8;
            float f8 = this.f47341toq;
            return f7 + (f8 * f5) + ((((this.f47343zy - f8) * f5) * f5) / (f6 * 2.0f));
        }
        if (i2 == 2) {
            return this.f1661y;
        }
        float f9 = f5 - f6;
        float f10 = this.f1655g;
        if (f9 > f10) {
            this.f47337kja0 = true;
            return this.f1660s;
        }
        float f11 = this.f1661y;
        float f12 = this.f47343zy;
        return (f11 + (f12 * f9)) - (((f12 * f9) * f9) / (f10 * 2.0f));
    }

    /* JADX INFO: renamed from: g */
    public void m1066g(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f47337kja0 = false;
        this.f47340qrj = f2;
        boolean z2 = f2 > f3;
        this.f47342x2 = z2;
        if (z2) {
            f7l8(-f4, f2 - f3, f6, f7, f5);
        } else {
            f7l8(f4, f3 - f2, f6, f7, f5);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    public float getInterpolation(float f2) {
        float fM1065n = m1065n(f2);
        this.f47339n7h = f2;
        return this.f47342x2 ? this.f47340qrj - fM1065n : this.f47340qrj + fM1065n;
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    /* JADX INFO: renamed from: k */
    public float mo1006k() {
        return this.f47342x2 ? -toq(this.f47339n7h) : toq(this.f47339n7h);
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    /* JADX INFO: renamed from: q */
    public boolean mo1007q() {
        return mo1006k() < f1654h && Math.abs(this.f1660s - this.f47339n7h) < f1654h;
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    public float toq(float f2) {
        float f3 = this.f1659q;
        if (f2 <= f3) {
            float f4 = this.f1656k;
            return f4 + (((this.f47341toq - f4) * f2) / f3);
        }
        int i2 = this.f1658p;
        if (i2 == 1) {
            return 0.0f;
        }
        float f5 = f2 - f3;
        float f6 = this.f1657n;
        if (f5 < f6) {
            float f7 = this.f47341toq;
            return f7 + (((this.f47343zy - f7) * f5) / f6);
        }
        if (i2 == 2) {
            return this.f1661y;
        }
        float f8 = f5 - f6;
        float f9 = this.f1655g;
        if (f8 >= f9) {
            return this.f1660s;
        }
        float f10 = this.f47343zy;
        return f10 - ((f8 * f10) / f9);
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    public String zy(String str, float f2) {
        String str2 = str + " ===== " + this.f47338ld6 + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append(this.f47342x2 ? "backwards" : "forward ");
        sb.append(" time = ");
        sb.append(f2);
        sb.append("  stages ");
        sb.append(this.f1658p);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.f1659q + " vel " + this.f1656k + " pos " + this.f47336f7l8 + "\n";
        if (this.f1658p > 1) {
            str3 = str3 + str + " dur " + this.f1657n + " vel " + this.f47341toq + " pos " + this.f1661y + "\n";
        }
        if (this.f1658p > 2) {
            str3 = str3 + str + " dur " + this.f1655g + " vel " + this.f47343zy + " pos " + this.f1660s + "\n";
        }
        float f3 = this.f1659q;
        if (f2 <= f3) {
            return str3 + str + "stage 0\n";
        }
        int i2 = this.f1658p;
        if (i2 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f4 = f2 - f3;
        float f5 = this.f1657n;
        if (f4 < f5) {
            return str3 + str + " stage 1\n";
        }
        if (i2 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f4 - f5 < this.f1655g) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }
}
