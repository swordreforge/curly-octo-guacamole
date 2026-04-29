package com.google.common.reflect;

import com.google.common.base.jk;
import com.google.common.base.t8r;
import com.google.common.collect.AbstractC4531v;
import com.google.common.collect.qo;
import com.google.common.collect.vy;
import com.google.common.collect.xwq3;
import com.google.common.collect.zwy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.reflect.g */
/* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class C4751g<B> extends xwq3<qrj<? extends B>, B> implements x2<B> {

    /* JADX INFO: renamed from: k */
    private final Map<qrj<? extends B>, B> f27316k = vy.vyq();

    /* JADX INFO: renamed from: com.google.common.reflect.g$toq */
    /* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
    private static final class toq<K, V> extends AbstractC4531v<K, V> {

        /* JADX INFO: renamed from: k */
        private final Map.Entry<K, V> f27317k;

        /* JADX INFO: renamed from: com.google.common.reflect.g$toq$k */
        /* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
        static class k extends qo<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Set f27318k;

            k(Set set) {
                this.f27318k = set;
            }

            @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return toq.kja0(super.iterator());
            }

            @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return standardToArray();
            }

            @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) standardToArray(tArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
            public Set<Map.Entry<K, V>> delegate() {
                return this.f27318k;
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.g$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
        static class C8013toq implements t8r<Map.Entry<K, V>, Map.Entry<K, V>> {
            C8013toq() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> apply(Map.Entry<K, V> entry) {
                return new toq(entry);
            }
        }

        /* JADX INFO: renamed from: h */
        static <K, V> Set<Map.Entry<K, V>> m16762h(Set<Map.Entry<K, V>> set) {
            return new k(set);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> Iterator<Map.Entry<K, V>> kja0(Iterator<Map.Entry<K, V>> it) {
            return zwy.m16124j(it, new C8013toq());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4531v, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6 */
        public Map.Entry<K, V> delegate() {
            return this.f27317k;
        }

        @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException();
        }

        private toq(Map.Entry<K, V> entry) {
            this.f27317k = (Map.Entry) jk.a9(entry);
        }
    }

    @NullableDecl
    private <T extends B> T kja0(qrj<T> qrjVar, @NullableDecl T t2) {
        return this.f27316k.put(qrjVar, t2);
    }

    @NullableDecl
    private <T extends B> T x2(qrj<T> qrjVar) {
        return this.f27316k.get(qrjVar);
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public Set<Map.Entry<qrj<? extends B>, B>> entrySet() {
        return toq.m16762h(super.entrySet());
    }

    @Override // com.google.common.reflect.x2
    @NullableDecl
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) x2(qrj.of((Class) cls));
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public B put(qrj<? extends B> qrjVar, B b2) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @Deprecated
    public void putAll(Map<? extends qrj<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.x2
    @CanIgnoreReturnValue
    @NullableDecl
    public <T extends B> T putInstance(Class<T> cls, @NullableDecl T t2) {
        return (T) kja0(qrj.of((Class) cls), t2);
    }

    @Override // com.google.common.reflect.x2
    @CanIgnoreReturnValue
    @NullableDecl
    public <T extends B> T qrj(qrj<T> qrjVar, @NullableDecl T t2) {
        return (T) kja0(qrjVar.rejectTypeVariables(), t2);
    }

    @Override // com.google.common.reflect.x2
    @NullableDecl
    /* JADX INFO: renamed from: s */
    public <T extends B> T mo16761s(qrj<T> qrjVar) {
        return (T) x2(qrjVar.rejectTypeVariables());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public Map<qrj<? extends B>, B> delegate() {
        return this.f27316k;
    }
}
