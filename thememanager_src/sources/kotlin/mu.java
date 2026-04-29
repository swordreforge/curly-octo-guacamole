package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class mu {
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: k */
    private static final long[] m23227k(int i2, cyoe.x2<? super Integer, ikck> init) {
        kotlin.jvm.internal.d2ok.m23075h(init, "init");
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = init.invoke(Integer.valueOf(i3)).a98o();
        }
        return C6220d.m22779g(jArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] toq(long... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements;
    }
}
