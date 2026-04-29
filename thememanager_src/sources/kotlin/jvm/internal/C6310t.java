package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.t */
/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6310t extends AbstractC6300j<float[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final float[] f36442q;

    public C6310t(int i2) {
        super(i2);
        this.f36442q = new float[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final float[] m23146p() {
        return f7l8(this.f36442q, new float[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q float[] fArr) {
        d2ok.m23075h(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23148y(float f2) {
        float[] fArr = this.f36442q;
        int qVar = toq();
        m23117n(qVar + 1);
        fArr[qVar] = f2;
    }
}
