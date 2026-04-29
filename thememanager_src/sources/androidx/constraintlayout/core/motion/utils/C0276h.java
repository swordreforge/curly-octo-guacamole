package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.h */
/* JADX INFO: compiled from: SpringStopEngine.java */
/* JADX INFO: loaded from: classes.dex */
public class C0276h implements ki {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final double f47269x2 = Double.MAX_VALUE;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f47270f7l8;

    /* JADX INFO: renamed from: g */
    private float f1581g;

    /* JADX INFO: renamed from: n */
    private double f1583n;

    /* JADX INFO: renamed from: p */
    private float f1584p;

    /* JADX INFO: renamed from: q */
    private double f1585q;

    /* JADX INFO: renamed from: s */
    private float f1586s;

    /* JADX INFO: renamed from: y */
    private float f1587y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f47273zy;

    /* JADX INFO: renamed from: k */
    double f1582k = 0.5d;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f47272toq = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f47271ld6 = 0;

    /* JADX INFO: renamed from: n */
    private void m1004n(double d2) {
        double d4 = this.f47273zy;
        double d5 = this.f1582k;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d4 / ((double) this.f1586s)) * d2) * 4.0d)) + 1.0d);
        double d6 = d2 / ((double) iSqrt);
        int i2 = 0;
        while (i2 < iSqrt) {
            float f2 = this.f47270f7l8;
            double d7 = this.f1585q;
            float f3 = this.f1587y;
            double d8 = d4;
            double d9 = ((-d4) * (((double) f2) - d7)) - (((double) f3) * d5);
            float f4 = this.f1586s;
            double d10 = d5;
            double d11 = ((double) f3) + (((d9 / ((double) f4)) * d6) / 2.0d);
            double d12 = ((((-((((double) f2) + ((d6 * d11) / 2.0d)) - d7)) * d8) - (d11 * d10)) / ((double) f4)) * d6;
            float f5 = (float) (((double) f3) + d12);
            this.f1587y = f5;
            float f6 = (float) (((double) f2) + ((((double) f3) + (d12 / 2.0d)) * d6));
            this.f47270f7l8 = f6;
            int i3 = this.f47271ld6;
            if (i3 > 0) {
                if (f6 < 0.0f && (i3 & 1) == 1) {
                    this.f47270f7l8 = -f6;
                    this.f1587y = -f5;
                }
                float f7 = this.f47270f7l8;
                if (f7 > 1.0f && (i3 & 2) == 2) {
                    this.f47270f7l8 = 2.0f - f7;
                    this.f1587y = -this.f1587y;
                }
            }
            i2++;
            d4 = d8;
            d5 = d10;
        }
    }

    void f7l8(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    /* JADX INFO: renamed from: g */
    public float m1005g() {
        double d2 = this.f47273zy;
        return ((float) (((-d2) * (((double) this.f47270f7l8) - this.f1585q)) - (this.f1582k * ((double) this.f1587y)))) / this.f1586s;
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    public float getInterpolation(float f2) {
        m1004n(f2 - this.f1581g);
        this.f1581g = f2;
        return this.f47270f7l8;
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    /* JADX INFO: renamed from: k */
    public float mo1006k() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    /* JADX INFO: renamed from: q */
    public boolean mo1007q() {
        double d2 = ((double) this.f47270f7l8) - this.f1585q;
        double d4 = this.f47273zy;
        double d5 = this.f1587y;
        return Math.sqrt((((d5 * d5) * ((double) this.f1586s)) + ((d4 * d2) * d2)) / d4) <= ((double) this.f1584p);
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    public float toq(float f2) {
        return this.f1587y;
    }

    /* JADX INFO: renamed from: y */
    public void m1008y(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2) {
        this.f1585q = f3;
        this.f1582k = f7;
        this.f47272toq = false;
        this.f47270f7l8 = f2;
        this.f1583n = f4;
        this.f47273zy = f6;
        this.f1586s = f5;
        this.f1584p = f8;
        this.f47271ld6 = i2;
        this.f1581g = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.ki
    public String zy(String str, float f2) {
        return null;
    }
}
