package com.airbnb.lottie.model.content;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.q */
/* JADX INFO: compiled from: GradientColor.java */
/* JADX INFO: loaded from: classes.dex */
public class C1456q {

    /* JADX INFO: renamed from: k */
    private final float[] f8032k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int[] f56014toq;

    public C1456q(float[] fArr, int[] iArr) {
        this.f8032k = fArr;
        this.f56014toq = iArr;
    }

    /* JADX INFO: renamed from: k */
    public int[] m6043k() {
        return this.f56014toq;
    }

    /* JADX INFO: renamed from: q */
    public void m6044q(C1456q c1456q, C1456q c1456q2, float f2) {
        if (c1456q.f56014toq.length == c1456q2.f56014toq.length) {
            for (int i2 = 0; i2 < c1456q.f56014toq.length; i2++) {
                this.f8032k[i2] = com.airbnb.lottie.utils.f7l8.ld6(c1456q.f8032k[i2], c1456q2.f8032k[i2], f2);
                this.f56014toq[i2] = com.airbnb.lottie.utils.toq.zy(f2, c1456q.f56014toq[i2], c1456q2.f56014toq[i2]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c1456q.f56014toq.length + " vs " + c1456q2.f56014toq.length + ")");
    }

    public float[] toq() {
        return this.f8032k;
    }

    public int zy() {
        return this.f56014toq.length;
    }
}
