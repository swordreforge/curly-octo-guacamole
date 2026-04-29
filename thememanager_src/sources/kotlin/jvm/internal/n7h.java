package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n7h extends AbstractC6300j<boolean[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final boolean[] f36430q;

    public n7h(int i2) {
        super(i2);
        this.f36430q = new boolean[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final boolean[] m23132p() {
        return f7l8(this.f36430q, new boolean[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q boolean[] zArr) {
        d2ok.m23075h(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23134y(boolean z2) {
        boolean[] zArr = this.f36430q;
        int qVar = toq();
        m23117n(qVar + 1);
        zArr[qVar] = z2;
    }
}
