package miuix.animation.physics;

/* JADX INFO: loaded from: classes3.dex */
public class FrictionOperator implements PhysicsOperator {
    @Override // miuix.animation.physics.PhysicsOperator
    public void getParameters(float[] fArr, double[] dArr) {
        dArr[0] = 1.0d - Math.pow(2.718281828459045d, ((double) fArr[0]) * (-4.199999809265137d));
    }

    @Override // miuix.animation.physics.PhysicsOperator
    public double updateVelocity(double d2, double d4, double d5, double d6, double... dArr) {
        return d2 * Math.pow(1.0d - d4, d6);
    }
}
