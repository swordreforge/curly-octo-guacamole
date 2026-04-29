package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Schlick.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends C0284q {

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final boolean f47312t8r = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    double f47313cdj;

    /* JADX INFO: renamed from: h */
    double f1630h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    double f47314ki;

    n7h(String str) {
        this.f1643k = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f1630h = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i2 = iIndexOf2 + 1;
        this.f47313cdj = Double.parseDouble(str.substring(i2, str.indexOf(44, i2)).trim());
    }

    /* JADX INFO: renamed from: n */
    private double m1038n(double d2) {
        double d4 = this.f47313cdj;
        return d2 < d4 ? (d4 * d2) / (d2 + (this.f1630h * (d4 - d2))) : ((1.0d - d4) * (d2 - 1.0d)) / ((1.0d - d2) - (this.f1630h * (d4 - d2)));
    }

    /* JADX INFO: renamed from: q */
    private double m1039q(double d2) {
        double d4 = this.f47313cdj;
        if (d2 < d4) {
            double d5 = this.f1630h;
            return ((d5 * d4) * d4) / ((((d4 - d2) * d5) + d2) * ((d5 * (d4 - d2)) + d2));
        }
        double d6 = this.f1630h;
        return (((d4 - 1.0d) * d6) * (d4 - 1.0d)) / (((((-d6) * (d4 - d2)) - d2) + 1.0d) * ((((-d6) * (d4 - d2)) - d2) + 1.0d));
    }

    @Override // androidx.constraintlayout.core.motion.utils.C0284q
    /* JADX INFO: renamed from: k */
    public double mo986k(double d2) {
        return m1038n(d2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.C0284q
    public double toq(double d2) {
        return m1039q(d2);
    }
}
