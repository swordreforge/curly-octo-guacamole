package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
final class lrht<K, V> implements InterfaceC6139c<K, V> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Map<K, V> f36179k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final cyoe.x2<K, V> f36180q;

    /* JADX WARN: Multi-variable type inference failed */
    public lrht(@InterfaceC7396q Map<K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super K, ? extends V> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(map, "map");
        kotlin.jvm.internal.d2ok.m23075h(x2Var, "default");
        this.f36179k = map;
        this.f36180q = x2Var;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo22468n().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo22468n().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m22552k();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC7395n Object obj) {
        return mo22468n().equals(obj);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public Collection<V> m22551g() {
        return mo22468n().values();
    }

    @Override // java.util.Map
    @InterfaceC7395n
    public V get(Object obj) {
        return mo22468n().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo22468n().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo22468n().isEmpty();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public Set<Map.Entry<K, V>> m22552k() {
        return mo22468n().entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return toq();
    }

    @Override // kotlin.collections.InterfaceC6139c
    public V ki(K k2) {
        Map<K, V> mapMo22468n = mo22468n();
        V v2 = mapMo22468n.get(k2);
        return (v2 != null || mapMo22468n.containsKey(k2)) ? v2 : this.f36180q.invoke(k2);
    }

    @Override // kotlin.collections.InterfaceC6139c
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public Map<K, V> mo22468n() {
        return this.f36179k;
    }

    @Override // java.util.Map
    public V put(K k2, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return zy();
    }

    @InterfaceC7396q
    public String toString() {
        return mo22468n().toString();
    }

    @InterfaceC7396q
    public Set<K> toq() {
        return mo22468n().keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m22551g();
    }

    public int zy() {
        return mo22468n().size();
    }
}
