package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.z */
/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6315z extends AbstractC6300j<double[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final double[] f36464q;

    public C6315z(int i2) {
        super(i2);
        this.f36464q = new double[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final double[] m23168p() {
        return f7l8(this.f36464q, new double[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q double[] dArr) {
        d2ok.m23075h(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23170y(double d2) {
        double[] dArr = this.f36464q;
        int qVar = toq();
        m23117n(qVar + 1);
        dArr[qVar] = d2;
    }
}
