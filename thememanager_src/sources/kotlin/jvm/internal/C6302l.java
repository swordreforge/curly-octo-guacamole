package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.l */
/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6302l extends AbstractC6300j<long[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final long[] f36425q;

    public C6302l(int i2) {
        super(i2);
        this.f36425q = new long[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final long[] m23122p() {
        return f7l8(this.f36425q, new long[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q long[] jArr) {
        d2ok.m23075h(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23124y(long j2) {
        long[] jArr = this.f36425q;
        int qVar = toq();
        m23117n(qVar + 1);
        jArr[qVar] = j2;
    }
}
