package kotlin.collections;

import java.util.Map;
import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6769y;

/* JADX INFO: renamed from: kotlin.collections.f */
/* JADX INFO: compiled from: MapAccessors.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "MapAccessorsKt")
public final class C6141f {
    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final <V, V1 extends V> V1 m22486k(Map<? super String, ? extends V> map, Object obj, kotlin.reflect.kja0<?> property) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        return (V1) vyq.m22655k(map, property.getName());
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "getVar")
    private static final <V, V1 extends V> V1 toq(Map<? super String, ? extends V> map, Object obj, kotlin.reflect.kja0<?> property) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        return (V1) vyq.m22655k(map, property.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <V> void zy(Map<? super String, ? super V> map, Object obj, kotlin.reflect.kja0<?> property, V v2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        map.put(property.getName(), v2);
    }
}
