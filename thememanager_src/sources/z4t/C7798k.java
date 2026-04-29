package z4t;

import java.util.Map;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import l05.InterfaceC6769y;

/* JADX INFO: renamed from: z4t.k */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "CollectionsJDK8Kt")
public final class C7798k {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: k */
    private static final <K, V> V m28217k(Map<? extends K, ? extends V> map, K k2, V v2) {
        d2ok.m23075h(map, "<this>");
        return map.getOrDefault(k2, v2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final <K, V> boolean toq(Map<? extends K, ? extends V> map, K k2, V v2) {
        d2ok.m23075h(map, "<this>");
        return bo.ld6(map).remove(k2, v2);
    }
}
