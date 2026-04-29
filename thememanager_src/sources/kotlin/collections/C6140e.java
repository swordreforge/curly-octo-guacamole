package kotlin.collections;

import cyoe.InterfaceC5981k;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C6227f;
import kotlin.collections.builders.C6135q;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.e */
/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public class C6140e extends vyq {

    /* JADX INFO: renamed from: k */
    private static final int f36138k = 1073741824;

    @InterfaceC7396q
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> cdj(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return new TreeMap(map);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final <K, V> Map<K, V> f7l8() {
        return new C6135q();
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: g */
    private static final <K, V> Map<K, V> m22476g(cyoe.x2<? super Map<K, V>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Map mapF7l8 = f7l8();
        builderAction.invoke(mapF7l8);
        return m22480q(mapF7l8);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final <K, V> Map<K, V> m22477h(Map<K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return kja0(map);
    }

    @InterfaceC7396q
    public static final <K, V> SortedMap<K, V> ki(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q Comparator<? super K> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> kja0(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.d2ok.kja0(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> ld6(@InterfaceC7396q C6227f<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.d2ok.m23075h(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        kotlin.jvm.internal.d2ok.kja0(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: n */
    private static final <K, V> Map<K, V> m22478n(int i2, cyoe.x2<? super Map<K, V>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Map mapM22482y = m22482y(i2);
        builderAction.invoke(mapM22482y);
        return m22480q(mapM22482y);
    }

    @InterfaceC6234g
    private static final Properties n7h(Map<String, String> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @kotlin.nn86
    /* JADX INFO: renamed from: p */
    public static int m22479p(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: q */
    public static <K, V> Map<K, V> m22480q(@InterfaceC7396q Map<K, V> builder) {
        kotlin.jvm.internal.d2ok.m23075h(builder, "builder");
        return ((C6135q) builder).build();
    }

    @InterfaceC7396q
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> qrj(@InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        nn86.dr(treeMap, pairs);
        return treeMap;
    }

    /* JADX INFO: renamed from: s */
    public static final <K, V> V m22481s(@InterfaceC7396q ConcurrentMap<K, V> concurrentMap, K k2, @InterfaceC7396q InterfaceC5981k<? extends V> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(concurrentMap, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        V v2 = concurrentMap.get(k2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k2, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <K, V> SortedMap<K, V> x2(@InterfaceC7396q Comparator<? super K> comparator, @InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        nn86.dr(treeMap, pairs);
        return treeMap;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: y */
    public static <K, V> Map<K, V> m22482y(int i2) {
        return new C6135q(i2);
    }
}
