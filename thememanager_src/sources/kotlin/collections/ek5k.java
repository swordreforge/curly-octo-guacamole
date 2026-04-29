package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n101#1:105,6\n*E\n"})
final class ek5k<K, V> implements InterfaceC6155m<K, V> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Map<K, V> f36139k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final cyoe.x2<K, V> f36140q;

    /* JADX WARN: Multi-variable type inference failed */
    public ek5k(@InterfaceC7396q Map<K, V> map, @InterfaceC7396q cyoe.x2<? super K, ? extends V> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(map, "map");
        kotlin.jvm.internal.d2ok.m23075h(x2Var, "default");
        this.f36139k = map;
        this.f36140q = x2Var;
    }

    @Override // java.util.Map
    public void clear() {
        mo22468n().clear();
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
        return m22484k();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC7395n Object obj) {
        return mo22468n().equals(obj);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public Collection<V> m22483g() {
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
    public Set<Map.Entry<K, V>> m22484k() {
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
        return (v2 != null || mapMo22468n.containsKey(k2)) ? v2 : this.f36140q.invoke(k2);
    }

    @Override // kotlin.collections.InterfaceC6155m, kotlin.collections.InterfaceC6139c
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public Map<K, V> mo22468n() {
        return this.f36139k;
    }

    @Override // java.util.Map
    @InterfaceC7395n
    public V put(K k2, V v2) {
        return mo22468n().put(k2, v2);
    }

    @Override // java.util.Map
    public void putAll(@InterfaceC7396q Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.d2ok.m23075h(from, "from");
        mo22468n().putAll(from);
    }

    @Override // java.util.Map
    @InterfaceC7395n
    public V remove(Object obj) {
        return mo22468n().remove(obj);
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
        return m22483g();
    }

    public int zy() {
        return mo22468n().size();
    }
}
