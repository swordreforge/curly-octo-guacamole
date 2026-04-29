package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class nmn5 extends AbstractC6300j<short[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final short[] f36434q;

    public nmn5(int i2) {
        super(i2);
        this.f36434q = new short[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final short[] m23136p() {
        return f7l8(this.f36434q, new short[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q short[] sArr) {
        d2ok.m23075h(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23138y(short s2) {
        short[] sArr = this.f36434q;
        int qVar = toq();
        m23117n(qVar + 1);
        sArr[qVar] = s2;
    }
}
