package miuix.animation.physics;

/* JADX INFO: loaded from: classes3.dex */
public class SpringOperator implements PhysicsOperator {
    double[] params;

    public SpringOperator() {
    }

    @Override // miuix.animation.physics.PhysicsOperator
    public void getParameters(float[] fArr, double[] dArr) {
        double d2 = fArr[0];
        double d4 = fArr[1];
        dArr[0] = Math.pow(6.283185307179586d / d4, 2.0d);
        dArr[1] = Math.min((d2 * 12.566370614359172d) / d4, 60.0d);
    }

    @Deprecated
    public double updateVelocity(double d2, float f2, float... fArr) {
        if (this.params == null) {
            return d2;
        }
        double[] dArr = new double[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            dArr[i2] = fArr[i2];
        }
        double[] dArr2 = this.params;
        return updateVelocity(d2, dArr2[0], dArr2[1], f2, dArr);
    }

    @Deprecated
    public SpringOperator(float f2, float f3) {
        double[] dArr = new double[2];
        this.params = dArr;
        getParameters(new float[]{f2, f3}, dArr);
    }

    @Override // miuix.animation.physics.PhysicsOperator
    public double updateVelocity(double d2, double d4, double d5, double d6, double... dArr) {
        return (d2 * (1.0d - (d5 * d6))) + ((double) ((float) (d4 * (dArr[0] - dArr[1]) * d6)));
    }
}
