package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 {
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: k */
    private static final byte[] m23809k(int i2, cyoe.x2<? super Integer, C6475u> init) {
        kotlin.jvm.internal.d2ok.m23075h(init, "init");
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = init.invoke(Integer.valueOf(i3)).bf2();
        }
        return bo.m22412g(bArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] toq(byte... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements;
    }
}
