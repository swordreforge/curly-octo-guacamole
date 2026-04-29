package com.google.common.cache;

import com.google.common.base.jk;
import com.google.common.base.lvui;
import com.google.common.util.concurrent.InterfaceFutureC4792c;
import com.google.common.util.concurrent.dd;
import com.google.common.util.concurrent.lrht;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.common.cache.g */
/* JADX INFO: compiled from: CacheLoader.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class AbstractC4282g<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.g$k */
    /* JADX INFO: compiled from: CacheLoader.java */
    static class k extends AbstractC4282g<K, V> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Executor f25767q;

        /* JADX INFO: renamed from: com.google.common.cache.g$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CacheLoader.java */
        class CallableC7984k implements Callable<V> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Object f25768k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Object f25770q;

            CallableC7984k(Object obj, Object obj2) {
                this.f25768k = obj;
                this.f25770q = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                return AbstractC4282g.this.reload(this.f25768k, this.f25770q).get();
            }
        }

        k(Executor executor) {
            this.f25767q = executor;
        }

        @Override // com.google.common.cache.AbstractC4282g
        public V load(K k2) throws Exception {
            return (V) AbstractC4282g.this.load(k2);
        }

        @Override // com.google.common.cache.AbstractC4282g
        public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
            return AbstractC4282g.this.loadAll(iterable);
        }

        @Override // com.google.common.cache.AbstractC4282g
        public InterfaceFutureC4792c<V> reload(K k2, V v2) throws Exception {
            lrht qVar = lrht.toq(new CallableC7984k(k2, v2));
            this.f25767q.execute(qVar);
            return qVar;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.g$n */
    /* JADX INFO: compiled from: CacheLoader.java */
    public static final class n extends UnsupportedOperationException {
        n() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.g$q */
    /* JADX INFO: compiled from: CacheLoader.java */
    private static final class q<V> extends AbstractC4282g<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final lvui<V> computingSupplier;

        public q(lvui<V> lvuiVar) {
            this.computingSupplier = (lvui) jk.a9(lvuiVar);
        }

        @Override // com.google.common.cache.AbstractC4282g
        public V load(Object obj) {
            jk.a9(obj);
            return this.computingSupplier.get();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.g$toq */
    /* JADX INFO: compiled from: CacheLoader.java */
    private static final class toq<K, V> extends AbstractC4282g<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.t8r<K, V> computingFunction;

        public toq(com.google.common.base.t8r<K, V> t8rVar) {
            this.computingFunction = (com.google.common.base.t8r) jk.a9(t8rVar);
        }

        @Override // com.google.common.cache.AbstractC4282g
        public V load(K k2) {
            return this.computingFunction.apply((K) jk.a9(k2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.g$zy */
    /* JADX INFO: compiled from: CacheLoader.java */
    public static final class zy extends RuntimeException {
        public zy(String str) {
            super(str);
        }
    }

    protected AbstractC4282g() {
    }

    @wlev.zy
    public static <K, V> AbstractC4282g<K, V> asyncReloading(AbstractC4282g<K, V> abstractC4282g, Executor executor) {
        jk.a9(abstractC4282g);
        jk.a9(executor);
        return abstractC4282g.new k(executor);
    }

    public static <K, V> AbstractC4282g<K, V> from(com.google.common.base.t8r<K, V> t8rVar) {
        return new toq(t8rVar);
    }

    public abstract V load(K k2) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new n();
    }

    @wlev.zy
    public InterfaceFutureC4792c<V> reload(K k2, V v2) throws Exception {
        jk.a9(k2);
        jk.a9(v2);
        return dd.n7h(load(k2));
    }

    public static <V> AbstractC4282g<Object, V> from(lvui<V> lvuiVar) {
        return new q(lvuiVar);
    }
}
