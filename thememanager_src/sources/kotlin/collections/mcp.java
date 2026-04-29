package kotlin.collections;

import java.util.List;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes3.dex */
class mcp extends C6163t {
    @InterfaceC7396q
    public static final <T> List<T> cfr(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return new y9n(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int kcsr(List<?> list, int i2) {
        if (new kotlin.ranges.x2(0, list.size()).x2(i2)) {
            return list.size() - i2;
        }
        throw new IndexOutOfBoundsException("Position index " + i2 + " must be in range [" + new kotlin.ranges.x2(0, list.size()) + "].");
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "asReversedMutable")
    public static final <T> List<T> w831(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return new yz(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int yqrt(List<?> list, int i2) {
        return ni7.jp0y(list) - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z4(List<?> list, int i2) {
        if (new kotlin.ranges.x2(0, ni7.jp0y(list)).x2(i2)) {
            return ni7.jp0y(list) - i2;
        }
        throw new IndexOutOfBoundsException("Element index " + i2 + " must be in range [" + new kotlin.ranges.x2(0, ni7.jp0y(list)) + "].");
    }
}
