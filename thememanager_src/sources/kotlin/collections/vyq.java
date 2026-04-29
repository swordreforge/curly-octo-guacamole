package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
class vyq {
    @kotlin.nn86
    @InterfaceC6769y(name = "getOrImplicitDefaultNullable")
    /* JADX INFO: renamed from: k */
    public static final <K, V> V m22655k(@InterfaceC7396q Map<K, ? extends V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        if (map instanceof InterfaceC6139c) {
            return (V) ((InterfaceC6139c) map).ki(k2);
        }
        V v2 = map.get(k2);
        if (v2 != null || map.containsKey(k2)) {
            return v2;
        }
        throw new NoSuchElementException("Key " + k2 + " is missing in the map.");
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> toq(@InterfaceC7396q Map<K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return map instanceof InterfaceC6139c ? toq(((InterfaceC6139c) map).mo22468n(), defaultValue) : new lrht(map, defaultValue);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> zy(@InterfaceC7396q Map<K, V> map, @InterfaceC7396q cyoe.x2<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return map instanceof InterfaceC6155m ? zy(((InterfaceC6155m) map).mo22468n(), defaultValue) : new ek5k(map, defaultValue);
    }
}
