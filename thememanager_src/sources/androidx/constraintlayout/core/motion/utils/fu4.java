package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: VelocityMatrix.java */
/* JADX INFO: loaded from: classes.dex */
public class fu4 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static String f47262f7l8 = "VelocityMatrix";

    /* JADX INFO: renamed from: g */
    float f1571g;

    /* JADX INFO: renamed from: k */
    float f1572k;

    /* JADX INFO: renamed from: n */
    float f1573n;

    /* JADX INFO: renamed from: q */
    float f1574q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    float f47263toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    float f47264zy;

    public void f7l8(AbstractC0287y abstractC0287y, AbstractC0287y abstractC0287y2, float f2) {
        if (abstractC0287y != null) {
            this.f47264zy = abstractC0287y.zy(f2);
        }
        if (abstractC0287y2 != null) {
            this.f1574q = abstractC0287y2.zy(f2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m994g(kja0 kja0Var, kja0 kja0Var2, float f2) {
        if (kja0Var != null) {
            this.f1572k = kja0Var.zy(f2);
        }
        if (kja0Var2 != null) {
            this.f47263toq = kja0Var2.zy(f2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m995k(float f2, float f3, int i2, int i3, float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = (f3 - 0.5f) * 2.0f;
        float f8 = f4 + this.f47264zy;
        float f9 = f5 + this.f1574q;
        float f10 = f8 + (this.f1572k * f6);
        float f11 = f9 + (this.f47263toq * f7);
        float radians = (float) Math.toRadians(this.f1571g);
        float radians2 = (float) Math.toRadians(this.f1573n);
        double d2 = radians;
        double d4 = i3 * f7;
        float fSin = f10 + (((float) ((((double) ((-i2) * f6)) * Math.sin(d2)) - (Math.cos(d2) * d4))) * radians2);
        float fCos = f11 + (radians2 * ((float) ((((double) (i2 * f6)) * Math.cos(d2)) - (d4 * Math.sin(d2)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* JADX INFO: renamed from: n */
    public void m996n(AbstractC0287y abstractC0287y, AbstractC0287y abstractC0287y2, float f2) {
        if (abstractC0287y != null) {
            this.f1572k = abstractC0287y.zy(f2);
        }
        if (abstractC0287y2 != null) {
            this.f47263toq = abstractC0287y2.zy(f2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m997q(kja0 kja0Var, float f2) {
        if (kja0Var != null) {
            this.f1573n = kja0Var.zy(f2);
            this.f1571g = kja0Var.m1030k(f2);
        }
    }

    public void toq() {
        this.f1573n = 0.0f;
        this.f1574q = 0.0f;
        this.f47264zy = 0.0f;
        this.f47263toq = 0.0f;
        this.f1572k = 0.0f;
    }

    /* JADX INFO: renamed from: y */
    public void m998y(kja0 kja0Var, kja0 kja0Var2, float f2) {
        if (kja0Var != null) {
            this.f47264zy = kja0Var.zy(f2);
        }
        if (kja0Var2 != null) {
            this.f1574q = kja0Var2.zy(f2);
        }
    }

    public void zy(AbstractC0287y abstractC0287y, float f2) {
        if (abstractC0287y != null) {
            this.f1573n = abstractC0287y.zy(f2);
        }
    }
}
