package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: AbstractMutableMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.1")
public abstract class f7l8<K, V> extends AbstractMap<K, V> implements Map<K, V>, r6ty.f7l8 {
    protected f7l8() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo22488k();
    }

    /* JADX INFO: renamed from: g */
    public /* bridge */ Collection<Object> m22487g() {
        return super.values();
    }

    /* JADX INFO: renamed from: k */
    public abstract Set mo22488k();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) toq();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC7395n
    public abstract V put(K k2, V v2);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return zy();
    }

    public /* bridge */ Set<Object> toq() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) m22487g();
    }

    public /* bridge */ int zy() {
        return super.size();
    }
}
