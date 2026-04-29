package com.google.android.material.color;

/* JADX INFO: compiled from: Hct.java */
/* JADX INFO: loaded from: classes2.dex */
final class n7h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final float f67531f7l8 = 1.0E-9f;

    /* JADX INFO: renamed from: g */
    private static final float f24232g = 0.2f;

    /* JADX INFO: renamed from: n */
    private static final float f24233n = 1.0f;

    /* JADX INFO: renamed from: q */
    private static final float f24234q = 0.4f;

    /* JADX INFO: renamed from: y */
    private static final float f24235y = 0.01f;

    /* JADX INFO: renamed from: k */
    private float f24236k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f67532toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f67533zy;

    private n7h(float f2, float f3, float f4) {
        ld6(m14312q(f2, f3, f4));
    }

    /* JADX INFO: renamed from: k */
    private static toq m14310k(float f2, float f3, float f4) {
        float f5 = 1000.0f;
        float f6 = 0.0f;
        toq toqVar = null;
        float f7 = 100.0f;
        float f8 = 1000.0f;
        while (Math.abs(f6 - f7) > f24235y) {
            float f9 = ((f7 - f6) / 2.0f) + f6;
            int iX2 = toq.m14339q(f9, f3, f2).x2();
            float fX2 = f7l8.x2(iX2);
            float fAbs = Math.abs(f4 - fX2);
            if (fAbs < 0.2f) {
                toq qVar = toq.toq(iX2);
                float fM14341k = qVar.m14341k(toq.m14339q(qVar.qrj(), qVar.m14342p(), f2));
                if (fM14341k <= 1.0f && fM14341k <= f5) {
                    toqVar = qVar;
                    f8 = fAbs;
                    f5 = fM14341k;
                }
            }
            if (f8 == 0.0f && f5 < f67531f7l8) {
                break;
            }
            if (fX2 < f4) {
                f6 = f9;
            } else {
                f7 = f9;
            }
        }
        return toqVar;
    }

    private void ld6(int i2) {
        toq qVar = toq.toq(i2);
        float fX2 = f7l8.x2(i2);
        this.f24236k = qVar.ld6();
        this.f67532toq = qVar.m14342p();
        this.f67533zy = fX2;
    }

    /* JADX INFO: renamed from: n */
    static int m14311n(float f2, float f3, float f4, ki kiVar) {
        if (f3 < 1.0d || Math.round(f4) <= 0.0d || Math.round(f4) >= 100.0d) {
            return f7l8.m14258g(f4);
        }
        float fM14271q = C3982h.m14271q(f2);
        toq toqVar = null;
        boolean z2 = true;
        float f5 = 0.0f;
        float f6 = f3;
        while (Math.abs(f5 - f3) >= f24234q) {
            toq toqVarM14310k = m14310k(fM14271q, f6, f4);
            if (z2) {
                if (toqVarM14310k != null) {
                    return toqVarM14310k.ki(kiVar);
                }
                z2 = false;
            } else if (toqVarM14310k == null) {
                f3 = f6;
            } else {
                f5 = f6;
                toqVar = toqVarM14310k;
            }
            f6 = ((f3 - f5) / 2.0f) + f5;
        }
        return toqVar == null ? f7l8.m14258g(f4) : toqVar.ki(kiVar);
    }

    /* JADX INFO: renamed from: q */
    private static int m14312q(float f2, float f3, float f4) {
        return m14311n(f2, f3, f4, ki.f67489ld6);
    }

    public static n7h toq(float f2, float f3, float f4) {
        return new n7h(f2, f3, f4);
    }

    public static n7h zy(int i2) {
        toq qVar = toq.toq(i2);
        return new n7h(qVar.ld6(), qVar.m14342p(), f7l8.x2(i2));
    }

    public float f7l8() {
        return this.f24236k;
    }

    /* JADX INFO: renamed from: g */
    public float m14313g() {
        return this.f67532toq;
    }

    /* JADX INFO: renamed from: p */
    public void m14314p(float f2) {
        ld6(m14312q(C3982h.m14271q(f2), this.f67532toq, this.f67533zy));
    }

    public int qrj() {
        return m14312q(this.f24236k, this.f67532toq, this.f67533zy);
    }

    /* JADX INFO: renamed from: s */
    public void m14315s(float f2) {
        ld6(m14312q(this.f24236k, f2, this.f67533zy));
    }

    public void x2(float f2) {
        ld6(m14312q(this.f24236k, this.f67532toq, f2));
    }

    /* JADX INFO: renamed from: y */
    public float m14316y() {
        return this.f67533zy;
    }
}
