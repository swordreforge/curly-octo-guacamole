package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t8r extends AbstractC6300j<char[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final char[] f36444q;

    public t8r(int i2) {
        super(i2);
        this.f36444q = new char[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final char[] m23151p() {
        return f7l8(this.f36444q, new char[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q char[] cArr) {
        d2ok.m23075h(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23153y(char c2) {
        char[] cArr = this.f36444q;
        int qVar = toq();
        m23117n(qVar + 1);
        cArr[qVar] = c2;
    }
}
