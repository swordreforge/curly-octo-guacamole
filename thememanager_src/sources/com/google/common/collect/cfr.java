package com.google.common.collect;

import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableBiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public abstract class cfr<K, V> extends zkd<K, V> implements ni7<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.cfr$k */
    /* JADX INFO: compiled from: ImmutableBiMap.java */
    public static final class C4326k<K, V> extends zkd.toq<K, V> {
        public C4326k() {
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public C4326k<K, V> mo15592q(K k2, V v2) {
            super.mo15592q(k2, v2);
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public C4326k<K, V> f7l8(Map<? extends K, ? extends V> map) {
            super.f7l8(map);
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C4326k<K, V> zy(Comparator<? super V> comparator) {
            super.zy(comparator);
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public C4326k<K, V> mo15588g(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15588g(iterable);
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public cfr<K, V> mo15589k() {
            if (this.f68241zy == 0) {
                return cfr.of();
            }
            m16117y();
            this.f26783q = true;
            return new z4t(this.f68240toq, this.f68241zy);
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public C4326k<K, V> mo15590n(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15590n(entry);
            return this;
        }

        C4326k(int i2) {
            super(i2);
        }
    }

    /* JADX INFO: compiled from: ImmutableBiMap.java */
    private static class toq extends zkd.C4586n {
        private static final long serialVersionUID = 0;

        toq(cfr<?, ?> cfrVar) {
            super(cfrVar);
        }

        @Override // com.google.common.collect.zkd.C4586n
        Object readResolve() {
            return createMap(new C4326k());
        }
    }

    cfr() {
    }

    public static <K, V> C4326k<K, V> builder() {
        return new C4326k<>();
    }

    @InterfaceC7731k
    public static <K, V> C4326k<K, V> builderWithExpectedSize(int i2) {
        C4524t.toq(i2, "expectedSize");
        return new C4326k<>(i2);
    }

    public static <K, V> cfr<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof cfr) {
            cfr<K, V> cfrVar = (cfr) map;
            if (!cfrVar.isPartialView()) {
                return cfrVar;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> cfr<K, V> of() {
        return z4t.EMPTY;
    }

    @Override // com.google.common.collect.ni7
    @CanIgnoreReturnValue
    @Deprecated
    public V forcePut(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ni7
    public abstract cfr<V, K> inverse();

    @Override // com.google.common.collect.zkd
    Object writeReplace() {
        return new toq(this);
    }

    public static <K, V> cfr<K, V> of(K k2, V v2) {
        C4524t.m15983k(k2, v2);
        return new z4t(new Object[]{k2, v2}, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.zkd
    public final vep5<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public static <K, V> cfr<K, V> of(K k2, V v2, K k3, V v3) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        return new z4t(new Object[]{k2, v2, k3, v3}, 2);
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public vep5<V> values() {
        return inverse().keySet();
    }

    @InterfaceC7731k
    public static <K, V> cfr<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C4326k(iterable instanceof Collection ? ((Collection) iterable).size() : 4).mo15588g(iterable).mo15589k();
    }

    public static <K, V> cfr<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        C4524t.m15983k(k4, v4);
        return new z4t(new Object[]{k2, v2, k3, v3, k4, v4}, 3);
    }

    public static <K, V> cfr<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        C4524t.m15983k(k4, v4);
        C4524t.m15983k(k5, v5);
        return new z4t(new Object[]{k2, v2, k3, v3, k4, v4, k5, v5}, 4);
    }

    public static <K, V> cfr<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        C4524t.m15983k(k4, v4);
        C4524t.m15983k(k5, v5);
        C4524t.m15983k(k6, v6);
        return new z4t(new Object[]{k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 5);
    }
}
