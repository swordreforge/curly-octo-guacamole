package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class wo {
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: k */
    private static final short[] m23798k(int i2, cyoe.x2<? super Integer, qo> init) {
        kotlin.jvm.internal.d2ok.m23075h(init, "init");
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = init.invoke(Integer.valueOf(i3)).bf2();
        }
        return tfm.m23651g(sArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] toq(short... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements;
    }
}
