package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.q */
/* JADX INFO: compiled from: Easing.java */
/* JADX INFO: loaded from: classes.dex */
public class C0284q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f47316f7l8 = "cubic(0.36, 0, 0.66, -0.56)";

    /* JADX INFO: renamed from: g */
    private static final String f1637g = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: n */
    private static final String f1638n = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f47319n7h = "overshoot";

    /* JADX INFO: renamed from: q */
    private static final String f1640q = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f47320qrj = "anticipate";

    /* JADX INFO: renamed from: y */
    private static final String f1642y = "cubic(0.34, 1.56, 0.64, 1)";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f47323zy = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: k */
    String f1643k = "identity";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static C0284q f47321toq = new C0284q();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f47318ld6 = "standard";

    /* JADX INFO: renamed from: p */
    private static final String f1639p = "accelerate";

    /* JADX INFO: renamed from: s */
    private static final String f1641s = "decelerate";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f47322x2 = "linear";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static String[] f47317kja0 = {f47318ld6, f1639p, f1641s, f47322x2};

    public static C0284q zy(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new k(str);
        }
        if (str.startsWith("spline")) {
            return new cdj(str);
        }
        if (str.startsWith("Schlick")) {
            return new n7h(str);
        }
        switch (str) {
            case "accelerate":
                return new k(f1640q);
            case "decelerate":
                return new k(f1638n);
            case "anticipate":
                return new k(f47316f7l8);
            case "linear":
                return new k(f1637g);
            case "overshoot":
                return new k(f1642y);
            case "standard":
                return new k(f47323zy);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f47317kja0));
                return f47321toq;
        }
    }

    /* JADX INFO: renamed from: k */
    public double mo986k(double d2) {
        return d2;
    }

    public String toString() {
        return this.f1643k;
    }

    public double toq(double d2) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.q$k */
    /* JADX INFO: compiled from: Easing.java */
    static class k extends C0284q {

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static double f47324fn3e = 1.0E-4d;

        /* JADX INFO: renamed from: i */
        private static double f1644i = 0.01d;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        double f47325cdj;

        /* JADX INFO: renamed from: h */
        double f1645h;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        double f47326ki;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        double f47327t8r;

        k(String str) {
            this.f1643k = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f1645h = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i2 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i2);
            this.f47325cdj = Double.parseDouble(str.substring(i2, iIndexOf3).trim());
            int i3 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i3);
            this.f47326ki = Double.parseDouble(str.substring(i3, iIndexOf4).trim());
            int i4 = iIndexOf4 + 1;
            this.f47327t8r = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        private double f7l8(double d2) {
            double d4 = 1.0d - d2;
            double d5 = 3.0d * d4;
            return (this.f47325cdj * d4 * d5 * d2) + (this.f47327t8r * d5 * d2 * d2) + (d2 * d2 * d2);
        }

        /* JADX INFO: renamed from: g */
        private double m1048g(double d2) {
            double d4 = 1.0d - d2;
            double d5 = 3.0d * d4;
            return (this.f1645h * d4 * d5 * d2) + (this.f47326ki * d5 * d2 * d2) + (d2 * d2 * d2);
        }

        /* JADX INFO: renamed from: n */
        private double m1049n(double d2) {
            double d4 = 1.0d - d2;
            double d5 = this.f47325cdj;
            double d6 = this.f47327t8r;
            return (d4 * 3.0d * d4 * d5) + (d4 * 6.0d * d2 * (d6 - d5)) + (3.0d * d2 * d2 * (1.0d - d6));
        }

        /* JADX INFO: renamed from: q */
        private double m1050q(double d2) {
            double d4 = 1.0d - d2;
            double d5 = this.f1645h;
            double d6 = this.f47326ki;
            return (d4 * 3.0d * d4 * d5) + (d4 * 6.0d * d2 * (d6 - d5)) + (3.0d * d2 * d2 * (1.0d - d6));
        }

        @Override // androidx.constraintlayout.core.motion.utils.C0284q
        /* JADX INFO: renamed from: k */
        public double mo986k(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double d4 = 0.5d;
            double d5 = 0.5d;
            while (d4 > f1644i) {
                d4 *= 0.5d;
                d5 = m1048g(d5) < d2 ? d5 + d4 : d5 - d4;
            }
            double d6 = d5 - d4;
            double dM1048g = m1048g(d6);
            double d7 = d5 + d4;
            double dM1048g2 = m1048g(d7);
            double dF7l8 = f7l8(d6);
            return (((f7l8(d7) - dF7l8) * (d2 - dM1048g)) / (dM1048g2 - dM1048g)) + dF7l8;
        }

        @Override // androidx.constraintlayout.core.motion.utils.C0284q
        public double toq(double d2) {
            double d4 = 0.5d;
            double d5 = 0.5d;
            while (d4 > f47324fn3e) {
                d4 *= 0.5d;
                d5 = m1048g(d5) < d2 ? d5 + d4 : d5 - d4;
            }
            double d6 = d5 - d4;
            double d7 = d5 + d4;
            return (f7l8(d7) - f7l8(d6)) / (m1048g(d7) - m1048g(d6));
        }

        /* JADX INFO: renamed from: y */
        void m1051y(double d2, double d4, double d5, double d6) {
            this.f1645h = d2;
            this.f47325cdj = d4;
            this.f47326ki = d5;
            this.f47327t8r = d6;
        }

        public k(double d2, double d4, double d5, double d6) {
            m1051y(d2, d4, d5, d6);
        }
    }
}
