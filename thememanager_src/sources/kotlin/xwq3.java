package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class xwq3 {
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: k */
    private static final int[] m23807k(int i2, cyoe.x2<? super Integer, gyi> init) {
        kotlin.jvm.internal.d2ok.m23075h(init, "init");
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = init.invoke(Integer.valueOf(i3)).a98o();
        }
        return dr.m22802g(iArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] toq(int... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements;
    }
}
