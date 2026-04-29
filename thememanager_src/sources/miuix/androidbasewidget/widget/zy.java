package miuix.androidbasewidget.widget;

/* JADX INFO: compiled from: SpringOperator.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private final double f38709k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final double f86730toq;

    public zy(float f2, float f3) {
        double d2 = f3;
        this.f86730toq = Math.pow(6.283185307179586d / d2, 2.0d);
        this.f38709k = (((double) f2) * 12.566370614359172d) / d2;
    }

    /* JADX INFO: renamed from: k */
    public double m24807k(double d2, float f2, double d4, double d5) {
        double d6 = f2;
        return (d2 * (1.0d - (this.f38709k * d6))) + ((double) ((float) (this.f86730toq * (d4 - d5) * d6)));
    }
}
