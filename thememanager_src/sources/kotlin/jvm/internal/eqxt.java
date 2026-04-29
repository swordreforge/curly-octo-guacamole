package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class eqxt extends AbstractC6300j<int[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final int[] f36394q;

    public eqxt(int i2) {
        super(i2);
        this.f36394q = new int[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final int[] m23091p() {
        return f7l8(this.f36394q, new int[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q int[] iArr) {
        d2ok.m23075h(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23093y(int i2) {
        int[] iArr = this.f36394q;
        int qVar = toq();
        m23117n(qVar + 1);
        iArr[qVar] = i2;
    }
}
