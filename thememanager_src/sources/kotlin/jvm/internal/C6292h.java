package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.h */
/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6292h extends AbstractC6300j<byte[]> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final byte[] f36411q;

    public C6292h(int i2) {
        super(i2);
        this.f36411q = new byte[i2];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final byte[] m23111p() {
        return f7l8(this.f36411q, new byte[m23115g()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6300j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int zy(@InterfaceC7396q byte[] bArr) {
        d2ok.m23075h(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: renamed from: y */
    public final void m23113y(byte b2) {
        byte[] bArr = this.f36411q;
        int qVar = toq();
        m23117n(qVar + 1);
        bArr[qVar] = b2;
    }
}
