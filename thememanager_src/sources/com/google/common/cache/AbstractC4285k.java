package com.google.common.cache;

import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.common.cache.k */
/* JADX INFO: compiled from: AbstractCache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4285k<K, V> implements zy<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.k$k */
    /* JADX INFO: compiled from: AbstractCache.java */
    public static final class k implements toq {

        /* JADX INFO: renamed from: k */
        private final x2 f25784k = qrj.m15524k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final x2 f68150toq = qrj.m15524k();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final x2 f68151zy = qrj.m15524k();

        /* JADX INFO: renamed from: q */
        private final x2 f25786q = qrj.m15524k();

        /* JADX INFO: renamed from: n */
        private final x2 f25785n = qrj.m15524k();

        /* JADX INFO: renamed from: g */
        private final x2 f25783g = qrj.m15524k();

        public void f7l8(toq toqVar) {
            f7l8 f7l8VarMo15473g = toqVar.mo15473g();
            this.f25784k.add(f7l8VarMo15473g.zy());
            this.f68150toq.add(f7l8VarMo15473g.m15466p());
            this.f68151zy.add(f7l8VarMo15473g.m15469y());
            this.f25786q.add(f7l8VarMo15473g.m15463g());
            this.f25785n.add(f7l8VarMo15473g.n7h());
            this.f25783g.add(f7l8VarMo15473g.toq());
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: g */
        public f7l8 mo15473g() {
            return new f7l8(this.f25784k.sum(), this.f68150toq.sum(), this.f68151zy.sum(), this.f25786q.sum(), this.f25785n.sum(), this.f25783g.sum());
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: k */
        public void mo15474k(int i2) {
            this.f25784k.add(i2);
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: n */
        public void mo15475n(long j2) {
            this.f68151zy.increment();
            this.f25785n.add(j2);
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: q */
        public void mo15476q(long j2) {
            this.f25786q.increment();
            this.f25785n.add(j2);
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        public void toq(int i2) {
            this.f68150toq.add(i2);
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        public void zy() {
            this.f25783g.increment();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.k$toq */
    /* JADX INFO: compiled from: AbstractCache.java */
    public interface toq {
        /* JADX INFO: renamed from: g */
        f7l8 mo15473g();

        /* JADX INFO: renamed from: k */
        void mo15474k(int i2);

        /* JADX INFO: renamed from: n */
        void mo15475n(long j2);

        /* JADX INFO: renamed from: q */
        void mo15476q(long j2);

        void toq(int i2);

        void zy();
    }

    protected AbstractC4285k() {
    }

    @Override // com.google.common.cache.zy
    public ConcurrentMap<K, V> asMap() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.zy
    public void cleanUp() {
    }

    @Override // com.google.common.cache.zy
    public V get(K k2, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.zy
    public zkd<K, V> getAllPresent(Iterable<?> iterable) {
        V ifPresent;
        LinkedHashMap linkedHashMapM16017j = vy.m16017j();
        for (Object obj : iterable) {
            if (!linkedHashMapM16017j.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                linkedHashMapM16017j.put(obj, ifPresent);
            }
        }
        return zkd.copyOf((Map) linkedHashMapM16017j);
    }

    @Override // com.google.common.cache.zy
    public void invalidate(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.zy
    public void invalidateAll(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            invalidate(it.next());
        }
    }

    @Override // com.google.common.cache.zy
    public void put(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.zy
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.zy
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.zy
    public f7l8 stats() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.zy
    public void invalidateAll() {
        throw new UnsupportedOperationException();
    }
}
