package miuix.springback.view;

/* JADX INFO: compiled from: SpringOperator.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private final double f41889k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final double f90398toq;

    public toq(float f2, float f3) {
        double d2 = f3;
        this.f90398toq = Math.pow(6.283185307179586d / d2, 2.0d);
        this.f41889k = (((double) f2) * 12.566370614359172d) / d2;
    }

    /* JADX INFO: renamed from: k */
    public double m26733k(double d2, float f2, double d4, double d5) {
        double d6 = f2;
        return (d2 * (1.0d - (this.f41889k * d6))) + ((double) ((float) (this.f90398toq * (d4 - d5) * d6)));
    }
}
