package kotlin.collections;

import cyoe.InterfaceC5981k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C6227f;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.bo;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n403#1:814\n414#1:819\n511#1,6:824\n536#1,6:830\n1#2:805\n1238#3,4:806\n1238#3,4:810\n1238#3,4:815\n1238#3,4:820\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n453#1:814\n468#1:819\n526#1:824,6\n551#1:830,6\n403#1:806,4\n414#1:810,4\n453#1:815,4\n468#1:820,4\n*E\n"})
public class nn86 extends C6140e {
    @InterfaceC7396q
    /* JADX INFO: renamed from: a */
    public static final <K, V> Map<K, V> m22575a(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q Iterable<? extends C6227f<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        if (map.isEmpty()) {
            return ikck(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        c8jq(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M a9(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <K, V> Map<K, V> a98o(Map<K, ? extends V> map) {
        return map == 0 ? o1t() : map;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: b */
    private static final <K, V> Map<K, V> m22576b() {
        return new LinkedHashMap();
    }

    @InterfaceC7396q
    public static <K, V> Map<K, V> bf2(@InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C6140e.m22479p(pairs.length));
        dr(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final <K, V> void bo(Map<? super K, ? super V> map, kotlin.sequences.qrj<? extends C6227f<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        gyi(map, pairs);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: c */
    private static final <K, V> Map<K, V> m22577c() {
        return o1t();
    }

    public static final <K, V> void c8jq(@InterfaceC7396q Map<? super K, ? super V> map, @InterfaceC7396q Iterable<? extends C6227f<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        for (C6227f<? extends K, ? extends V> c6227f : pairs) {
            map.put(c6227f.component1(), c6227f.component2());
        }
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> ch(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q kotlin.sequences.qrj<? extends C6227f<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        gyi(linkedHashMap, pairs);
        return i1(linkedHashMap);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: d */
    public static final <K, V, M extends Map<? super K, ? super V>> M m22578d(@InterfaceC7396q Iterable<? extends C6227f<? extends K, ? extends V>> iterable, @InterfaceC7396q M destination) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        c8jq(destination, iterable);
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <K, V> HashMap<K, V> d2ok() {
        return new HashMap<>();
    }

    public static final <K, V> V d3(@InterfaceC7396q Map<K, ? extends V> map, K k2, @InterfaceC7396q InterfaceC5981k<? extends V> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        V v2 = map.get(k2);
        return (v2 != null || map.containsKey(k2)) ? v2 : defaultValue.invoke();
    }

    @InterfaceC6234g
    private static final <K, V> C6227f<K, V> d8wk(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.d2ok.m23075h(entry, "<this>");
        return new C6227f<>(entry.getKey(), entry.getValue());
    }

    @InterfaceC6234g
    private static final <K, V> boolean dd(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> void dr(@InterfaceC7396q Map<? super K, ? super V> map, @InterfaceC7396q C6227f<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        for (C6227f<? extends K, ? extends V> c6227f : pairs) {
            map.put(c6227f.component1(), c6227f.component2());
        }
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: e */
    public static final <K, V> Map<K, V> m22579e(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q Iterable<? extends K> keys) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keys, "keys");
        Map mapWo = wo(map);
        C6163t.vq(mapWo.keySet(), keys);
        return i1(mapWo);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <K, V> void ek5k(Map<K, V> map, kotlin.sequences.qrj<? extends K> keys) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keys, "keys");
        C6163t.fnq8(map.keySet(), keys);
    }

    @kotlin.yz(version = "1.1")
    public static final <K, V> V eqxt(@InterfaceC7396q Map<K, ? extends V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return (V) vyq.m22655k(map, k2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    /* JADX INFO: renamed from: f */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M m22580f(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    @InterfaceC6234g
    private static final <K, V> K fn3e(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.d2ok.m23075h(entry, "<this>");
        return entry.getKey();
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M fnq8(@InterfaceC7396q kotlin.sequences.qrj<? extends C6227f<? extends K, ? extends V>> qrjVar, @InterfaceC7396q M destination) {
        kotlin.jvm.internal.d2ok.m23075h(qrjVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        gyi(destination, qrjVar);
        return destination;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> fti(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super V, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final <K> boolean fu4(Map<? extends K, ?> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.containsKey(k2);
    }

    @InterfaceC6234g
    private static final <K, V> V gvn7(Map<K, ? extends V> map, K k2, InterfaceC5981k<? extends V> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        V v2 = map.get(k2);
        return v2 == null ? defaultValue.invoke() : v2;
    }

    public static final <K, V> void gyi(@InterfaceC7396q Map<? super K, ? super V> map, @InterfaceC7396q kotlin.sequences.qrj<? extends C6227f<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        for (C6227f<? extends K, ? extends V> c6227f : pairs) {
            map.put(c6227f.component1(), c6227f.component2());
        }
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <K, V> Map<K, V> hb(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q kotlin.sequences.qrj<? extends K> keys) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keys, "keys");
        Map mapWo = wo(map);
        C6163t.fnq8(mapWo.keySet(), keys);
        return i1(mapWo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, R> Map<R, V> hyr(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C6140e.m22479p(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.6")
    /* JADX INFO: renamed from: i */
    private static final <K, V> Map<K, V> m22581i(@kotlin.toq cyoe.x2<? super Map<K, V>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Map mapF7l8 = C6140e.f7l8();
        builderAction.invoke(mapF7l8);
        return C6140e.m22480q(mapF7l8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V> Map<K, V> i1(@InterfaceC7396q Map<K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C6140e.kja0(map) : o1t();
    }

    @InterfaceC7396q
    public static <K, V> Map<K, V> ikck(@InterfaceC7396q Iterable<? extends C6227f<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i1(m22578d(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o1t();
        }
        if (size != 1) {
            return m22578d(iterable, new LinkedHashMap(C6140e.m22479p(collection.size())));
        }
        return C6140e.ld6(iterable instanceof List ? (C6227f<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: j */
    public static final <K, V> Map<K, V> m22582j(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q K[] keys) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keys, "keys");
        Map mapWo = wo(map);
        C6163t.qo(mapWo.keySet(), keys);
        return i1(mapWo);
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M jk(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @InterfaceC6234g
    private static final <K, V> V jp0y(Map<? extends K, ? extends V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.get(k2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: l */
    private static final <K, V> LinkedHashMap<K, V> m22583l() {
        return new LinkedHashMap<>();
    }

    @InterfaceC7396q
    public static <K, V> Map<K, V> lrht(@InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        return pairs.length > 0 ? tfm(pairs, new LinkedHashMap(C6140e.m22479p(pairs.length))) : o1t();
    }

    @InterfaceC6234g
    private static final <K, V> void lv5(Map<? super K, ? super V> map, Iterable<? extends C6227f<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        c8jq(map, pairs);
    }

    @InterfaceC7396q
    public static final <K, V> HashMap<K, V> lvui(@InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(C6140e.m22479p(pairs.length));
        dr(map, pairs);
        return map;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: m */
    private static final <K, V> void m22584m(Map<K, V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        map.remove(k2);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> mcp(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static <K, V> Map<K, V> mu(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? wo(map) : C6140e.kja0(map) : o1t();
    }

    @InterfaceC7396q
    public static final <K, V> LinkedHashMap<K, V> n5r1(@InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        return (LinkedHashMap) tfm(pairs, new LinkedHashMap(C6140e.m22479p(pairs.length)));
    }

    @InterfaceC6234g
    private static final <K, V> Iterator<Map.Entry<K, V>> ncyb(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.entrySet().iterator();
    }

    @InterfaceC6234g
    private static final <K, V> boolean ni7(Map<? extends K, ? extends V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.containsKey(k2);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> nmn5(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q C6227f<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        if (map.isEmpty()) {
            return qo(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        dr(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <K, V> Map<K, V> nn86(@InterfaceC7396q Map<? extends K, ? extends V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        Map mapWo = wo(map);
        mapWo.remove(k2);
        return i1(mapWo);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: o */
    private static final <K, V> void m22585o(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keys, "keys");
        C6163t.vq(map.keySet(), keys);
    }

    @InterfaceC7396q
    public static <K, V> Map<K, V> o1t() {
        d3 d3Var = d3.INSTANCE;
        kotlin.jvm.internal.d2ok.n7h(d3Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return d3Var;
    }

    public static final <K, V> V oc(@InterfaceC7396q Map<K, V> map, K k2, @InterfaceC7396q InterfaceC5981k<? extends V> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        V v2 = map.get(k2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        map.put(k2, vInvoke);
        return vInvoke;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> qkj8(@InterfaceC7396q kotlin.sequences.qrj<? extends C6227f<? extends K, ? extends V>> qrjVar) {
        kotlin.jvm.internal.d2ok.m23075h(qrjVar, "<this>");
        return i1(fnq8(qrjVar, new LinkedHashMap()));
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> qo(@InterfaceC7396q C6227f<? extends K, ? extends V>[] c6227fArr) {
        kotlin.jvm.internal.d2ok.m23075h(c6227fArr, "<this>");
        int length = c6227fArr.length;
        return length != 0 ? length != 1 ? tfm(c6227fArr, new LinkedHashMap(C6140e.m22479p(c6227fArr.length))) : C6140e.ld6(c6227fArr[0]) : o1t();
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lcyoe/k<+TR;>;)TR; */
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: r */
    private static final Object m22586r(Map map, InterfaceC5981k defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public static final <K, V> Map<K, V> m22587t(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super K, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <K, V> void t8iq(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(map2, "map");
        map.putAll(map2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.6")
    private static final <K, V> Map<K, V> t8r(int i2, @kotlin.toq cyoe.x2<? super Map<K, V>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Map mapM22482y = C6140e.m22482y(i2);
        builderAction.invoke(mapM22482y);
        return C6140e.m22480q(mapM22482y);
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M tfm(@InterfaceC7396q C6227f<? extends K, ? extends V>[] c6227fArr, @InterfaceC7396q M destination) {
        kotlin.jvm.internal.d2ok.m23075h(c6227fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        dr(destination, c6227fArr);
        return destination;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: u */
    private static final <K, V> void m22588u(Map<? super K, ? super V> map, C6227f<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, R> Map<K, R> uv6(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C6140e.m22479p(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: v */
    private static final <K, V> void m22589v(Map<K, V> map, K k2, V v2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        map.put(k2, v2);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M vq(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q M destination) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, R, M extends Map<? super K, ? super R>> M vyq(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static <K, V> Map<K, V> wo(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return new LinkedHashMap(map);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> wvg(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: x */
    public static final <K, V> Map<K, V> m22590x(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q C6227f<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pair, "pair");
        if (map.isEmpty()) {
            return C6140e.ld6(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <K, V> boolean x9kr(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @InterfaceC6234g
    private static final <K, V> V xwq3(Map<? extends K, V> map, K k2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return (V) bo.ld6(map).remove(k2);
    }

    @InterfaceC6234g
    private static final <K, V> void y2(Map<? super K, ? super V> map, C6227f<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(pairs, "pairs");
        dr(map, pairs);
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "mutableIterator")
    private static final <K, V> Iterator<Map.Entry<K, V>> y9n(Map<K, V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.entrySet().iterator();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <K, V> void yz(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keys, "keys");
        C6163t.qo(map.keySet(), keys);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: z */
    private static final <K, V> boolean m22591z(Map<K, ? extends V> map, V v2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.containsValue(v2);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> zp(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final <K, V> V zurt(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.d2ok.m23075h(entry, "<this>");
        return entry.getValue();
    }
}
