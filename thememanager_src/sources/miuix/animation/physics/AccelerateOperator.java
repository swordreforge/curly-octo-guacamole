package miuix.animation.physics;

/* JADX INFO: loaded from: classes3.dex */
public class AccelerateOperator implements PhysicsOperator {
    @Override // miuix.animation.physics.PhysicsOperator
    public void getParameters(float[] fArr, double[] dArr) {
        dArr[0] = ((double) fArr[0]) * 1000.0d;
    }

    @Override // miuix.animation.physics.PhysicsOperator
    public double updateVelocity(double d2, double d4, double d5, double d6, double... dArr) {
        return d2 + (d4 * d6);
    }
}
