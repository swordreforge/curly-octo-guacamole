package androidx.arch.core.internal;

import androidx.arch.core.internal.toq;
import java.util.HashMap;
import java.util.Map;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.arch.core.internal.k */
/* JADX INFO: compiled from: FastSafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0233k<K, V> extends toq<K, V> {

    /* JADX INFO: renamed from: y */
    private HashMap<K, toq.zy<K, V>> f1264y = new HashMap<>();

    public boolean contains(K k2) {
        return this.f1264y.containsKey(k2);
    }

    @Override // androidx.arch.core.internal.toq
    public V f7l8(@lvui K k2, @lvui V v2) {
        toq.zy<K, V> qVar = toq(k2);
        if (qVar != null) {
            return qVar.f1277q;
        }
        this.f1264y.put(k2, m771g(k2, v2));
        return null;
    }

    /* JADX INFO: renamed from: s */
    public Map.Entry<K, V> m769s(K k2) {
        if (contains(k2)) {
            return this.f1264y.get(k2).f1274g;
        }
        return null;
    }

    @Override // androidx.arch.core.internal.toq
    protected toq.zy<K, V> toq(K k2) {
        return this.f1264y.get(k2);
    }

    @Override // androidx.arch.core.internal.toq
    /* JADX INFO: renamed from: y */
    public V mo770y(@lvui K k2) {
        V v2 = (V) super.mo770y(k2);
        this.f1264y.remove(k2);
        return v2;
    }
}
