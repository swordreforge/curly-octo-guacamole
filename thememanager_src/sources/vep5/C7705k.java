package vep5;

/* JADX INFO: renamed from: vep5.k */
/* JADX INFO: compiled from: AodPositionData.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7705k {

    /* JADX INFO: renamed from: k */
    private float f44699k;

    /* JADX INFO: renamed from: q */
    private float f44700q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f95586toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f95587zy;

    public void f7l8(float dualClockPositionXAnchorRight) {
        this.f44700q = dualClockPositionXAnchorRight;
    }

    /* JADX INFO: renamed from: g */
    public void m28100g(float clockPositionY) {
        this.f95587zy = clockPositionY;
    }

    /* JADX INFO: renamed from: k */
    public float m28101k() {
        return this.f95586toq;
    }

    /* JADX INFO: renamed from: n */
    public void m28102n(float clockPositionX) {
        this.f95586toq = clockPositionX;
    }

    /* JADX INFO: renamed from: q */
    public float m28103q() {
        return this.f44699k;
    }

    public float toq() {
        return this.f95587zy;
    }

    /* JADX INFO: renamed from: y */
    public void m28104y(float dualClockPositionY) {
        this.f44699k = dualClockPositionY;
    }

    public float zy() {
        return this.f44700q;
    }
}
