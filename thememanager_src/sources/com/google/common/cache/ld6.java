package com.google.common.cache;

import com.google.common.base.x9kr;
import com.google.common.cache.AbstractC4282g;
import com.google.common.cache.AbstractC4285k;
import com.google.common.cache.C4304q;
import com.google.common.collect.g0ad;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.common.collect.zwy;
import com.google.common.primitives.C4746s;
import com.google.common.util.concurrent.C4815j;
import com.google.common.util.concurrent.C4857z;
import com.google.common.util.concurrent.InterfaceFutureC4792c;
import com.google.common.util.concurrent.bo;
import com.google.common.util.concurrent.c8jq;
import com.google.common.util.concurrent.dd;
import com.google.common.util.concurrent.i1;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: LocalCache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
class ld6<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    static final int f68153bo = 65536;

    /* JADX INFO: renamed from: d */
    static final int f25791d = 63;

    /* JADX INFO: renamed from: u */
    static final int f25792u = 1073741824;

    /* JADX INFO: renamed from: v */
    static final int f25793v = 3;

    /* JADX INFO: renamed from: w */
    static final int f25794w = 16;

    /* JADX INFO: renamed from: a */
    @MonotonicNonNullDecl
    Collection<V> f25795a;

    /* JADX INFO: renamed from: b */
    @MonotonicNonNullDecl
    Set<K> f25796b;

    /* JADX INFO: renamed from: c */
    final com.google.common.cache.cdj<K, V> f25797c;

    /* JADX INFO: renamed from: e */
    final x9kr f25798e;

    /* JADX INFO: renamed from: f */
    final Queue<com.google.common.cache.t8r<K, V>> f25799f;

    /* JADX INFO: renamed from: g */
    final int f25800g;

    /* JADX INFO: renamed from: h */
    final EnumC4290i f25801h;

    /* JADX INFO: renamed from: i */
    final long f25802i;

    /* JADX INFO: renamed from: j */
    final EnumC4288g f25803j;

    /* JADX INFO: renamed from: k */
    final int f25804k;

    /* JADX INFO: renamed from: l */
    final long f25805l;

    /* JADX INFO: renamed from: m */
    @NullableDecl
    final AbstractC4282g<? super K, V> f25806m;

    /* JADX INFO: renamed from: n */
    final ki<K, V>[] f25807n;

    /* JADX INFO: renamed from: o */
    final AbstractC4285k.toq f25808o;

    /* JADX INFO: renamed from: p */
    final EnumC4290i f25809p;

    /* JADX INFO: renamed from: q */
    final int f25810q;

    /* JADX INFO: renamed from: r */
    final long f25811r;

    /* JADX INFO: renamed from: s */
    final com.google.common.base.x2<Object> f25812s;

    /* JADX INFO: renamed from: t */
    final long f25813t;

    /* JADX INFO: renamed from: x */
    @MonotonicNonNullDecl
    Set<Map.Entry<K, V>> f25814x;

    /* JADX INFO: renamed from: y */
    final com.google.common.base.x2<Object> f25815y;

    /* JADX INFO: renamed from: z */
    final com.google.common.cache.fn3e<K, V> f25816z;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    static final Logger f68152ab = Logger.getLogger(ld6.class.getName());
    static final wvg<Object, Object> bb = new C4291k();
    static final Queue<?> bp = new toq();

    /* JADX INFO: compiled from: LocalCache.java */
    static class a9<K, V> extends WeakReference<K> implements com.google.common.cache.kja0<K, V> {

        /* JADX INFO: renamed from: k */
        final int f25817k;

        /* JADX INFO: renamed from: n */
        volatile wvg<K, V> f25818n;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        final com.google.common.cache.kja0<K, V> f25819q;

        a9(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(k2, referenceQueue);
            this.f25818n = ld6.m15478f();
            this.f25817k = i2;
            this.f25819q = kja0Var;
        }

        @Override // com.google.common.cache.kja0
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public int getHash() {
            return this.f25817k;
        }

        @Override // com.google.common.cache.kja0
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNext() {
            return this.f25819q;
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public wvg<K, V> getValueReference() {
            return this.f25818n;
        }

        @Override // com.google.common.cache.kja0
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setAccessTime(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setValueReference(wvg<K, V> wvgVar) {
            this.f25818n = wvgVar;
        }

        @Override // com.google.common.cache.kja0
        public void setWriteTime(long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    private enum cdj implements com.google.common.cache.kja0<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.kja0
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.kja0
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.kja0
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.kja0
        public wvg<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.kja0
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.kja0
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<Object, Object> kja0Var) {
        }

        @Override // com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<Object, Object> kja0Var) {
        }

        @Override // com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<Object, Object> kja0Var) {
        }

        @Override // com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<Object, Object> kja0Var) {
        }

        @Override // com.google.common.cache.kja0
        public void setValueReference(wvg<Object, Object> wvgVar) {
        }

        @Override // com.google.common.cache.kja0
        public void setWriteTime(long j2) {
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    final class d2ok implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: k */
        final K f25821k;

        /* JADX INFO: renamed from: q */
        V f25823q;

        d2ok(K k2, V v2) {
            this.f25821k = k2;
            this.f25823q = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f25821k.equals(entry.getKey()) && this.f25823q.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f25821k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f25823q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f25821k.hashCode() ^ this.f25823q.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = (V) ld6.this.put(this.f25821k, v2);
            this.f25823q = v2;
            return v3;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class d3<K, V> extends fu4<K, V> {

        /* JADX INFO: renamed from: q */
        final int f25824q;

        d3(V v2, int i2) {
            super(v2);
            this.f25824q = i2;
        }

        @Override // com.google.common.cache.ld6.fu4, com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return this.f25824q;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class eqxt<K, V> extends AbstractQueue<com.google.common.cache.kja0<K, V>> {

        /* JADX INFO: renamed from: k */
        final com.google.common.cache.kja0<K, V> f25825k = new C4287k();

        /* JADX INFO: renamed from: com.google.common.cache.ld6$eqxt$k */
        /* JADX INFO: compiled from: LocalCache.java */
        class C4287k extends AbstractC4296q<K, V> {

            /* JADX INFO: renamed from: k */
            com.google.common.cache.kja0<K, V> f25826k = this;

            /* JADX INFO: renamed from: q */
            com.google.common.cache.kja0<K, V> f25828q = this;

            C4287k() {
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
                return this.f25826k;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
                return this.f25828q;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
                this.f25826k = kja0Var;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
                this.f25828q = kja0Var;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public void setWriteTime(long j2) {
            }
        }

        /* JADX INFO: compiled from: LocalCache.java */
        class toq extends com.google.common.collect.x2<com.google.common.cache.kja0<K, V>> {
            toq(com.google.common.cache.kja0 kja0Var) {
                super(kja0Var);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.kja0<K, V> mo15494k(com.google.common.cache.kja0<K, V> kja0Var) {
                com.google.common.cache.kja0<K, V> nextInWriteQueue = kja0Var.getNextInWriteQueue();
                if (nextInWriteQueue == eqxt.this.f25825k) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        eqxt() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.kja0<K, V> nextInWriteQueue = this.f25825k.getNextInWriteQueue();
            while (true) {
                com.google.common.cache.kja0<K, V> kja0Var = this.f25825k;
                if (nextInWriteQueue == kja0Var) {
                    kja0Var.setNextInWriteQueue(kja0Var);
                    com.google.common.cache.kja0<K, V> kja0Var2 = this.f25825k;
                    kja0Var2.setPreviousInWriteQueue(kja0Var2);
                    return;
                } else {
                    com.google.common.cache.kja0<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    ld6.d3(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.kja0) obj).getNextInWriteQueue() != cdj.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f25825k.getNextInWriteQueue() == this.f25825k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.kja0<K, V>> iterator() {
            return new toq(peek());
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.kja0<K, V> kja0Var) {
            ld6.m15482q(kja0Var.getPreviousInWriteQueue(), kja0Var.getNextInWriteQueue());
            ld6.m15482q(this.f25825k.getPreviousInWriteQueue(), kja0Var);
            ld6.m15482q(kja0Var, this.f25825k);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.kja0 kja0Var = (com.google.common.cache.kja0) obj;
            com.google.common.cache.kja0<K, V> previousInWriteQueue = kja0Var.getPreviousInWriteQueue();
            com.google.common.cache.kja0<K, V> nextInWriteQueue = kja0Var.getNextInWriteQueue();
            ld6.m15482q(previousInWriteQueue, nextInWriteQueue);
            ld6.d3(kja0Var);
            return nextInWriteQueue != cdj.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i2 = 0;
            for (com.google.common.cache.kja0<K, V> nextInWriteQueue = this.f25825k.getNextInWriteQueue(); nextInWriteQueue != this.f25825k; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i2++;
            }
            return i2;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.kja0<K, V> peek() {
            com.google.common.cache.kja0<K, V> nextInWriteQueue = this.f25825k.getNextInWriteQueue();
            if (nextInWriteQueue == this.f25825k) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.kja0<K, V> poll() {
            com.google.common.cache.kja0<K, V> nextInWriteQueue = this.f25825k.getNextInWriteQueue();
            if (nextInWriteQueue == this.f25825k) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    final class f7l8 extends ld6<K, V>.AbstractC4298s<Map.Entry<K, V>> {
        f7l8() {
            super();
        }

        @Override // com.google.common.cache.ld6.AbstractC4298s, java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return zy();
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class fn3e<K, V> extends ni7<K, V> {

        /* JADX INFO: renamed from: p */
        com.google.common.cache.kja0<K, V> f25831p;

        /* JADX INFO: renamed from: s */
        com.google.common.cache.kja0<K, V> f25832s;

        /* JADX INFO: renamed from: y */
        volatile long f25833y;

        fn3e(K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(k2, i2, kja0Var);
            this.f25833y = Long.MAX_VALUE;
            this.f25832s = ld6.jp0y();
            this.f25831p = ld6.jp0y();
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public long getAccessTime() {
            return this.f25833y;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
            return this.f25832s;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
            return this.f25831p;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setAccessTime(long j2) {
            this.f25833y = j2;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25832s = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25831p = kja0Var;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class fti<K, V> extends WeakReference<V> implements wvg<K, V> {

        /* JADX INFO: renamed from: k */
        final com.google.common.cache.kja0<K, V> f25834k;

        fti(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            super(v2, referenceQueue);
            this.f25834k = kja0Var;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: g */
        public V mo15496g() {
            return get();
        }

        @Override // com.google.common.cache.ld6.wvg
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: k */
        public boolean mo15497k() {
            return false;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: n */
        public wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            return new fti(referenceQueue, v2, kja0Var);
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return 1;
        }

        @Override // com.google.common.cache.ld6.wvg
        public com.google.common.cache.kja0<K, V> toq() {
            return this.f25834k;
        }

        @Override // com.google.common.cache.ld6.wvg
        public void zy(V v2) {
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class fu4<K, V> implements wvg<K, V> {

        /* JADX INFO: renamed from: k */
        final V f25835k;

        fu4(V v2) {
            this.f25835k = v2;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: g */
        public V mo15496g() {
            return get();
        }

        @Override // com.google.common.cache.ld6.wvg
        public V get() {
            return this.f25835k;
        }

        @Override // com.google.common.cache.ld6.wvg
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: k */
        public boolean mo15497k() {
            return false;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: n */
        public wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            return this;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return 1;
        }

        @Override // com.google.common.cache.ld6.wvg
        public com.google.common.cache.kja0<K, V> toq() {
            return null;
        }

        @Override // com.google.common.cache.ld6.wvg
        public void zy(V v2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.cache.ld6$g */
    /* JADX INFO: compiled from: LocalCache.java */
    static abstract class EnumC4288g {
        static final int ACCESS_MASK = 1;
        public static final EnumC4288g STRONG;
        public static final EnumC4288g STRONG_ACCESS;
        public static final EnumC4288g STRONG_ACCESS_WRITE;
        public static final EnumC4288g STRONG_WRITE;
        public static final EnumC4288g WEAK;
        public static final EnumC4288g WEAK_ACCESS;
        public static final EnumC4288g WEAK_ACCESS_WRITE;
        static final int WEAK_MASK = 4;
        public static final EnumC4288g WEAK_WRITE;
        static final int WRITE_MASK = 2;
        static final EnumC4288g[] factories;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4288g[] f25836k;

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$f7l8 */
        /* JADX INFO: compiled from: LocalCache.java */
        enum f7l8 extends EnumC4288g {
            f7l8(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = super.copyEntry(kiVar, kja0Var, kja0Var2);
                copyWriteEntry(kja0Var, kja0VarCopyEntry);
                return kja0VarCopyEntry;
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new jp0y(kiVar.keyReferenceQueue, k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$g */
        /* JADX INFO: compiled from: LocalCache.java */
        enum g extends EnumC4288g {
            g(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = super.copyEntry(kiVar, kja0Var, kja0Var2);
                copyAccessEntry(kja0Var, kja0VarCopyEntry);
                return kja0VarCopyEntry;
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new mcp(kiVar.keyReferenceQueue, k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$k */
        /* JADX INFO: compiled from: LocalCache.java */
        enum k extends EnumC4288g {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new ni7(k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$n */
        /* JADX INFO: compiled from: LocalCache.java */
        enum n extends EnumC4288g {
            n(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new a9(kiVar.keyReferenceQueue, k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$q */
        /* JADX INFO: compiled from: LocalCache.java */
        enum q extends EnumC4288g {
            q(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = super.copyEntry(kiVar, kja0Var, kja0Var2);
                copyAccessEntry(kja0Var, kja0VarCopyEntry);
                copyWriteEntry(kja0Var, kja0VarCopyEntry);
                return kja0VarCopyEntry;
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new zurt(k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$toq */
        /* JADX INFO: compiled from: LocalCache.java */
        enum toq extends EnumC4288g {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = super.copyEntry(kiVar, kja0Var, kja0Var2);
                copyAccessEntry(kja0Var, kja0VarCopyEntry);
                return kja0VarCopyEntry;
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new fn3e(k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$y */
        /* JADX INFO: compiled from: LocalCache.java */
        enum y extends EnumC4288g {
            y(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = super.copyEntry(kiVar, kja0Var, kja0Var2);
                copyAccessEntry(kja0Var, kja0VarCopyEntry);
                copyWriteEntry(kja0Var, kja0VarCopyEntry);
                return kja0VarCopyEntry;
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new jk(kiVar.keyReferenceQueue, k2, i2, kja0Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$g$zy */
        /* JADX INFO: compiled from: LocalCache.java */
        enum zy extends EnumC4288g {
            zy(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = super.copyEntry(kiVar, kja0Var, kja0Var2);
                copyWriteEntry(kja0Var, kja0VarCopyEntry);
                return kja0VarCopyEntry;
            }

            @Override // com.google.common.cache.ld6.EnumC4288g
            <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
                return new C4301z(k2, i2, kja0Var);
            }
        }

        static {
            k kVar = new k("STRONG", 0);
            STRONG = kVar;
            toq toqVar = new toq("STRONG_ACCESS", 1);
            STRONG_ACCESS = toqVar;
            zy zyVar = new zy("STRONG_WRITE", 2);
            STRONG_WRITE = zyVar;
            q qVar = new q("STRONG_ACCESS_WRITE", 3);
            STRONG_ACCESS_WRITE = qVar;
            n nVar = new n("WEAK", 4);
            WEAK = nVar;
            g gVar = new g("WEAK_ACCESS", 5);
            WEAK_ACCESS = gVar;
            f7l8 f7l8Var = new f7l8("WEAK_WRITE", 6);
            WEAK_WRITE = f7l8Var;
            y yVar = new y("WEAK_ACCESS_WRITE", 7);
            WEAK_ACCESS_WRITE = yVar;
            f25836k = new EnumC4288g[]{kVar, toqVar, zyVar, qVar, nVar, gVar, f7l8Var, yVar};
            factories = new EnumC4288g[]{kVar, toqVar, zyVar, qVar, nVar, gVar, f7l8Var, yVar};
        }

        private EnumC4288g(String str, int i2) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static EnumC4288g getFactory(EnumC4290i enumC4290i, boolean z2, boolean z3) {
            return factories[(enumC4290i == EnumC4290i.WEAK ? (char) 4 : (char) 0) | (z2 ? 1 : 0) | (z3 ? 2 : 0)];
        }

        public static EnumC4288g valueOf(String str) {
            return (EnumC4288g) Enum.valueOf(EnumC4288g.class, str);
        }

        public static EnumC4288g[] values() {
            return (EnumC4288g[]) f25836k.clone();
        }

        <K, V> void copyAccessEntry(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
            kja0Var2.setAccessTime(kja0Var.getAccessTime());
            ld6.zy(kja0Var.getPreviousInAccessQueue(), kja0Var2);
            ld6.zy(kja0Var2, kja0Var.getNextInAccessQueue());
            ld6.gvn7(kja0Var);
        }

        <K, V> com.google.common.cache.kja0<K, V> copyEntry(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
            return newEntry(kiVar, kja0Var.getKey(), kja0Var.getHash(), kja0Var2);
        }

        <K, V> void copyWriteEntry(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
            kja0Var2.setWriteTime(kja0Var.getWriteTime());
            ld6.m15482q(kja0Var.getPreviousInWriteQueue(), kja0Var2);
            ld6.m15482q(kja0Var2, kja0Var.getNextInWriteQueue());
            ld6.d3(kja0Var);
        }

        abstract <K, V> com.google.common.cache.kja0<K, V> newEntry(ki<K, V> kiVar, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var);

        /* synthetic */ EnumC4288g(String str, int i2, C4291k c4291k) {
            this(str, i2);
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class gvn7<K, V> extends t8r<K, V> {

        /* JADX INFO: renamed from: q */
        final int f25837q;

        gvn7(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var, int i2) {
            super(referenceQueue, v2, kja0Var);
            this.f25837q = i2;
        }

        @Override // com.google.common.cache.ld6.t8r, com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: n */
        public wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            return new gvn7(referenceQueue, v2, kja0Var, this.f25837q);
        }

        @Override // com.google.common.cache.ld6.t8r, com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return this.f25837q;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$h */
    /* JADX INFO: compiled from: LocalCache.java */
    static class C4289h<K, V> extends AbstractC4307y<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;

        @MonotonicNonNullDecl
        transient com.google.common.cache.zy<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final com.google.common.base.x2<Object> keyEquivalence;
        final EnumC4290i keyStrength;
        final AbstractC4282g<? super K, V> loader;
        final long maxWeight;
        final com.google.common.cache.cdj<? super K, ? super V> removalListener;

        @NullableDecl
        final x9kr ticker;
        final com.google.common.base.x2<Object> valueEquivalence;
        final EnumC4290i valueStrength;
        final com.google.common.cache.fn3e<K, V> weigher;

        C4289h(ld6<K, V> ld6Var) {
            this(ld6Var.f25809p, ld6Var.f25801h, ld6Var.f25815y, ld6Var.f25812s, ld6Var.f25811r, ld6Var.f25813t, ld6Var.f25802i, ld6Var.f25816z, ld6Var.f25800g, ld6Var.f25797c, ld6Var.f25798e, ld6Var.f25806m);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = (com.google.common.cache.zy<K, V>) recreateCacheBuilder().m15517k();
        }

        private Object readResolve() {
            return this.delegate;
        }

        C4304q<K, V> recreateCacheBuilder() {
            C4304q<K, V> c4304q = (C4304q<K, V>) C4304q.jk().gvn7(this.keyStrength).d3(this.valueStrength).o1t(this.keyEquivalence).d2ok(this.valueEquivalence).m15518n(this.concurrencyLevel).jp0y(this.removalListener);
            c4304q.f25913k = false;
            long j2 = this.expireAfterWriteNanos;
            if (j2 > 0) {
                c4304q.f7l8(j2, TimeUnit.NANOSECONDS);
            }
            long j3 = this.expireAfterAccessNanos;
            if (j3 > 0) {
                c4304q.m15514g(j3, TimeUnit.NANOSECONDS);
            }
            com.google.common.cache.fn3e fn3eVar = this.weigher;
            if (fn3eVar != C4304q.n.INSTANCE) {
                c4304q.dd(fn3eVar);
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    c4304q.mcp(j4);
                }
            } else {
                long j5 = this.maxWeight;
                if (j5 != -1) {
                    c4304q.m15521t(j5);
                }
            }
            x9kr x9krVar = this.ticker;
            if (x9krVar != null) {
                c4304q.eqxt(x9krVar);
            }
            return c4304q;
        }

        private C4289h(EnumC4290i enumC4290i, EnumC4290i enumC4290i2, com.google.common.base.x2<Object> x2Var, com.google.common.base.x2<Object> x2Var2, long j2, long j3, long j4, com.google.common.cache.fn3e<K, V> fn3eVar, int i2, com.google.common.cache.cdj<? super K, ? super V> cdjVar, x9kr x9krVar, AbstractC4282g<? super K, V> abstractC4282g) {
            this.keyStrength = enumC4290i;
            this.valueStrength = enumC4290i2;
            this.keyEquivalence = x2Var;
            this.valueEquivalence = x2Var2;
            this.expireAfterWriteNanos = j2;
            this.expireAfterAccessNanos = j3;
            this.maxWeight = j4;
            this.weigher = fn3eVar;
            this.concurrencyLevel = i2;
            this.removalListener = cdjVar;
            this.ticker = (x9krVar == x9kr.toq() || x9krVar == C4304q.f68165fu4) ? null : x9krVar;
            this.loader = abstractC4282g;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.AbstractC4307y, com.google.common.collect.qkj8
        public com.google.common.cache.zy<K, V> delegate() {
            return this.delegate;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.cache.ld6$i */
    /* JADX INFO: compiled from: LocalCache.java */
    static abstract class EnumC4290i {
        public static final EnumC4290i SOFT;
        public static final EnumC4290i STRONG;
        public static final EnumC4290i WEAK;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4290i[] f25838k;

        /* JADX INFO: renamed from: com.google.common.cache.ld6$i$k */
        /* JADX INFO: compiled from: LocalCache.java */
        enum k extends EnumC4290i {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4290i
            com.google.common.base.x2<Object> defaultEquivalence() {
                return com.google.common.base.x2.equals();
            }

            @Override // com.google.common.cache.ld6.EnumC4290i
            <K, V> wvg<K, V> referenceValue(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, V v2, int i2) {
                return i2 == 1 ? new fu4(v2) : new d3(v2, i2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$i$toq */
        /* JADX INFO: compiled from: LocalCache.java */
        enum toq extends EnumC4290i {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4290i
            com.google.common.base.x2<Object> defaultEquivalence() {
                return com.google.common.base.x2.identity();
            }

            @Override // com.google.common.cache.ld6.EnumC4290i
            <K, V> wvg<K, V> referenceValue(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, V v2, int i2) {
                return i2 == 1 ? new t8r(kiVar.valueReferenceQueue, v2, kja0Var) : new gvn7(kiVar.valueReferenceQueue, v2, kja0Var, i2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$i$zy */
        /* JADX INFO: compiled from: LocalCache.java */
        enum zy extends EnumC4290i {
            zy(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.cache.ld6.EnumC4290i
            com.google.common.base.x2<Object> defaultEquivalence() {
                return com.google.common.base.x2.identity();
            }

            @Override // com.google.common.cache.ld6.EnumC4290i
            <K, V> wvg<K, V> referenceValue(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, V v2, int i2) {
                return i2 == 1 ? new fti(kiVar.valueReferenceQueue, v2, kja0Var) : new oc(kiVar.valueReferenceQueue, v2, kja0Var, i2);
            }
        }

        static {
            k kVar = new k("STRONG", 0);
            STRONG = kVar;
            toq toqVar = new toq("SOFT", 1);
            SOFT = toqVar;
            zy zyVar = new zy("WEAK", 2);
            WEAK = zyVar;
            f25838k = new EnumC4290i[]{kVar, toqVar, zyVar};
        }

        private EnumC4290i(String str, int i2) {
        }

        public static EnumC4290i valueOf(String str) {
            return (EnumC4290i) Enum.valueOf(EnumC4290i.class, str);
        }

        public static EnumC4290i[] values() {
            return (EnumC4290i[]) f25838k.clone();
        }

        abstract com.google.common.base.x2<Object> defaultEquivalence();

        abstract <K, V> wvg<K, V> referenceValue(ki<K, V> kiVar, com.google.common.cache.kja0<K, V> kja0Var, V v2, int i2);

        /* synthetic */ EnumC4290i(String str, int i2, C4291k c4291k) {
            this(str, i2);
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class jk<K, V> extends a9<K, V> {

        /* JADX INFO: renamed from: g */
        volatile long f25839g;

        /* JADX INFO: renamed from: h */
        com.google.common.cache.kja0<K, V> f25840h;

        /* JADX INFO: renamed from: i */
        com.google.common.cache.kja0<K, V> f25841i;

        /* JADX INFO: renamed from: p */
        volatile long f25842p;

        /* JADX INFO: renamed from: s */
        com.google.common.cache.kja0<K, V> f25843s;

        /* JADX INFO: renamed from: y */
        com.google.common.cache.kja0<K, V> f25844y;

        jk(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(referenceQueue, k2, i2, kja0Var);
            this.f25839g = Long.MAX_VALUE;
            this.f25844y = ld6.jp0y();
            this.f25843s = ld6.jp0y();
            this.f25842p = Long.MAX_VALUE;
            this.f25840h = ld6.jp0y();
            this.f25841i = ld6.jp0y();
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public long getAccessTime() {
            return this.f25839g;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
            return this.f25844y;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
            return this.f25840h;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
            return this.f25843s;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
            return this.f25841i;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public long getWriteTime() {
            return this.f25842p;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setAccessTime(long j2) {
            this.f25839g = j2;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25844y = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25840h = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25843s = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25841i = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setWriteTime(long j2) {
            this.f25842p = j2;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class jp0y<K, V> extends a9<K, V> {

        /* JADX INFO: renamed from: g */
        volatile long f25845g;

        /* JADX INFO: renamed from: s */
        com.google.common.cache.kja0<K, V> f25846s;

        /* JADX INFO: renamed from: y */
        com.google.common.cache.kja0<K, V> f25847y;

        jp0y(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(referenceQueue, k2, i2, kja0Var);
            this.f25845g = Long.MAX_VALUE;
            this.f25847y = ld6.jp0y();
            this.f25846s = ld6.jp0y();
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
            return this.f25847y;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
            return this.f25846s;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public long getWriteTime() {
            return this.f25845g;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25847y = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25846s = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setWriteTime(long j2) {
            this.f25845g = j2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$k */
    /* JADX INFO: compiled from: LocalCache.java */
    static class C4291k implements wvg<Object, Object> {
        C4291k() {
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: g */
        public Object mo15496g() {
            return null;
        }

        @Override // com.google.common.cache.ld6.wvg
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.ld6.wvg
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: k */
        public boolean mo15497k() {
            return false;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: n */
        public wvg<Object, Object> mo15498n(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, com.google.common.cache.kja0<Object, Object> kja0Var) {
            return this;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return 0;
        }

        @Override // com.google.common.cache.ld6.wvg
        public com.google.common.cache.kja0<Object, Object> toq() {
            return null;
        }

        @Override // com.google.common.cache.ld6.wvg
        public void zy(Object obj) {
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class kja0<K, V> implements com.google.common.cache.zy<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final ld6<K, V> localCache;

        /* JADX INFO: renamed from: com.google.common.cache.ld6$kja0$k */
        /* JADX INFO: compiled from: LocalCache.java */
        class C4293k extends AbstractC4282g<Object, V> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Callable f25853k;

            C4293k(Callable callable) {
                this.f25853k = callable;
            }

            @Override // com.google.common.cache.AbstractC4282g
            public V load(Object obj) throws Exception {
                return (V) this.f25853k.call();
            }
        }

        /* synthetic */ kja0(ld6 ld6Var, C4291k c4291k) {
            this(ld6Var);
        }

        @Override // com.google.common.cache.zy
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // com.google.common.cache.zy
        public void cleanUp() {
            this.localCache.toq();
        }

        @Override // com.google.common.cache.zy
        public V get(K k2, Callable<? extends V> callable) throws ExecutionException {
            com.google.common.base.jk.a9(callable);
            return this.localCache.m15486h(k2, new C4293k(callable));
        }

        @Override // com.google.common.cache.zy
        public zkd<K, V> getAllPresent(Iterable<?> iterable) {
            return this.localCache.t8r(iterable);
        }

        @Override // com.google.common.cache.zy
        @NullableDecl
        public V getIfPresent(Object obj) {
            return this.localCache.fn3e(obj);
        }

        @Override // com.google.common.cache.zy
        public void invalidate(Object obj) {
            com.google.common.base.jk.a9(obj);
            this.localCache.remove(obj);
        }

        @Override // com.google.common.cache.zy
        public void invalidateAll(Iterable<?> iterable) {
            this.localCache.m15491z(iterable);
        }

        @Override // com.google.common.cache.zy
        public void put(K k2, V v2) {
            this.localCache.put(k2, v2);
        }

        @Override // com.google.common.cache.zy
        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // com.google.common.cache.zy
        public long size() {
            return this.localCache.mcp();
        }

        @Override // com.google.common.cache.zy
        public com.google.common.cache.f7l8 stats() {
            AbstractC4285k.k kVar = new AbstractC4285k.k();
            kVar.f7l8(this.localCache.f25808o);
            for (ki<K, V> kiVar : this.localCache.f25807n) {
                kVar.f7l8(kiVar.statsCounter);
            }
            return kVar.mo15473g();
        }

        Object writeReplace() {
            return new C4289h(this.localCache);
        }

        kja0(C4304q<? super K, ? super V> c4304q) {
            this(new ld6(c4304q, null));
        }

        @Override // com.google.common.cache.zy
        public void invalidateAll() {
            this.localCache.clear();
        }

        private kja0(ld6<K, V> ld6Var) {
            this.localCache = ld6Var;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$ld6, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalCache.java */
    final class C7985ld6 extends ld6<K, V>.zy<K> {
        C7985ld6(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f25896k.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C4295p();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f25896k.remove(obj) != null;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class mcp<K, V> extends a9<K, V> {

        /* JADX INFO: renamed from: g */
        volatile long f25856g;

        /* JADX INFO: renamed from: s */
        com.google.common.cache.kja0<K, V> f25857s;

        /* JADX INFO: renamed from: y */
        com.google.common.cache.kja0<K, V> f25858y;

        mcp(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(referenceQueue, k2, i2, kja0Var);
            this.f25856g = Long.MAX_VALUE;
            this.f25858y = ld6.jp0y();
            this.f25857s = ld6.jp0y();
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public long getAccessTime() {
            return this.f25856g;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
            return this.f25858y;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
            return this.f25857s;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setAccessTime(long j2) {
            this.f25856g = j2;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25858y = kja0Var;
        }

        @Override // com.google.common.cache.ld6.a9, com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25857s = kja0Var;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$n */
    /* JADX INFO: compiled from: LocalCache.java */
    static final class C4294n<K, V> extends AbstractQueue<com.google.common.cache.kja0<K, V>> {

        /* JADX INFO: renamed from: k */
        final com.google.common.cache.kja0<K, V> f25859k = new k();

        /* JADX INFO: renamed from: com.google.common.cache.ld6$n$k */
        /* JADX INFO: compiled from: LocalCache.java */
        class k extends AbstractC4296q<K, V> {

            /* JADX INFO: renamed from: k */
            com.google.common.cache.kja0<K, V> f25860k = this;

            /* JADX INFO: renamed from: q */
            com.google.common.cache.kja0<K, V> f25862q = this;

            k() {
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
                return this.f25860k;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
                return this.f25862q;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public void setAccessTime(long j2) {
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
                this.f25860k = kja0Var;
            }

            @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
            public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
                this.f25862q = kja0Var;
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.ld6$n$toq */
        /* JADX INFO: compiled from: LocalCache.java */
        class toq extends com.google.common.collect.x2<com.google.common.cache.kja0<K, V>> {
            toq(com.google.common.cache.kja0 kja0Var) {
                super(kja0Var);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.kja0<K, V> mo15494k(com.google.common.cache.kja0<K, V> kja0Var) {
                com.google.common.cache.kja0<K, V> nextInAccessQueue = kja0Var.getNextInAccessQueue();
                if (nextInAccessQueue == C4294n.this.f25859k) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        C4294n() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.kja0<K, V> nextInAccessQueue = this.f25859k.getNextInAccessQueue();
            while (true) {
                com.google.common.cache.kja0<K, V> kja0Var = this.f25859k;
                if (nextInAccessQueue == kja0Var) {
                    kja0Var.setNextInAccessQueue(kja0Var);
                    com.google.common.cache.kja0<K, V> kja0Var2 = this.f25859k;
                    kja0Var2.setPreviousInAccessQueue(kja0Var2);
                    return;
                } else {
                    com.google.common.cache.kja0<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    ld6.gvn7(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.kja0) obj).getNextInAccessQueue() != cdj.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f25859k.getNextInAccessQueue() == this.f25859k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.kja0<K, V>> iterator() {
            return new toq(peek());
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.kja0<K, V> kja0Var) {
            ld6.zy(kja0Var.getPreviousInAccessQueue(), kja0Var.getNextInAccessQueue());
            ld6.zy(this.f25859k.getPreviousInAccessQueue(), kja0Var);
            ld6.zy(kja0Var, this.f25859k);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.kja0 kja0Var = (com.google.common.cache.kja0) obj;
            com.google.common.cache.kja0<K, V> previousInAccessQueue = kja0Var.getPreviousInAccessQueue();
            com.google.common.cache.kja0<K, V> nextInAccessQueue = kja0Var.getNextInAccessQueue();
            ld6.zy(previousInAccessQueue, nextInAccessQueue);
            ld6.gvn7(kja0Var);
            return nextInAccessQueue != cdj.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i2 = 0;
            for (com.google.common.cache.kja0<K, V> nextInAccessQueue = this.f25859k.getNextInAccessQueue(); nextInAccessQueue != this.f25859k; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i2++;
            }
            return i2;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.kja0<K, V> peek() {
            com.google.common.cache.kja0<K, V> nextInAccessQueue = this.f25859k.getNextInAccessQueue();
            if (nextInAccessQueue == this.f25859k) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.kja0<K, V> poll() {
            com.google.common.cache.kja0<K, V> nextInAccessQueue = this.f25859k.getNextInAccessQueue();
            if (nextInAccessQueue == this.f25859k) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class n7h<K, V> extends kja0<K, V> implements InterfaceC4303p<K, V> {
        private static final long serialVersionUID = 1;

        n7h(C4304q<? super K, ? super V> c4304q, AbstractC4282g<? super K, V> abstractC4282g) {
            super(new ld6(c4304q, (AbstractC4282g) com.google.common.base.jk.a9(abstractC4282g)), null);
        }

        @Override // com.google.common.cache.InterfaceC4303p, com.google.common.base.t8r
        public final V apply(K k2) {
            return getUnchecked(k2);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public V get(K k2) throws ExecutionException {
            return this.localCache.ni7(k2);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public zkd<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.localCache.cdj(iterable);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public V getUnchecked(K k2) {
            try {
                return get(k2);
            } catch (ExecutionException e2) {
                throw new bo(e2.getCause());
            }
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public void refresh(K k2) {
            this.localCache.x9kr(k2);
        }

        @Override // com.google.common.cache.ld6.kja0
        Object writeReplace() {
            return new x2(this.localCache);
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class ni7<K, V> extends AbstractC4296q<K, V> {

        /* JADX INFO: renamed from: g */
        volatile wvg<K, V> f25864g = ld6.m15478f();

        /* JADX INFO: renamed from: k */
        final K f25865k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        final com.google.common.cache.kja0<K, V> f25866n;

        /* JADX INFO: renamed from: q */
        final int f25867q;

        ni7(K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25865k = k2;
            this.f25867q = i2;
            this.f25866n = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public int getHash() {
            return this.f25867q;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public K getKey() {
            return this.f25865k;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNext() {
            return this.f25866n;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public wvg<K, V> getValueReference() {
            return this.f25864g;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setValueReference(wvg<K, V> wvgVar) {
            this.f25864g = wvgVar;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    final class o1t extends ld6<K, V>.AbstractC4298s<V> {
        o1t() {
            super();
        }

        @Override // com.google.common.cache.ld6.AbstractC4298s, java.util.Iterator
        public V next() {
            return zy().getValue();
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class oc<K, V> extends fti<K, V> {

        /* JADX INFO: renamed from: q */
        final int f25869q;

        oc(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var, int i2) {
            super(referenceQueue, v2, kja0Var);
            this.f25869q = i2;
        }

        @Override // com.google.common.cache.ld6.fti, com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: n */
        public wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            return new oc(referenceQueue, v2, kja0Var, this.f25869q);
        }

        @Override // com.google.common.cache.ld6.fti, com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return this.f25869q;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$p */
    /* JADX INFO: compiled from: LocalCache.java */
    final class C4295p extends ld6<K, V>.AbstractC4298s<K> {
        C4295p() {
            super();
        }

        @Override // com.google.common.cache.ld6.AbstractC4298s, java.util.Iterator
        public K next() {
            return zy().getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$q */
    /* JADX INFO: compiled from: LocalCache.java */
    static abstract class AbstractC4296q<K, V> implements com.google.common.cache.kja0<K, V> {
        AbstractC4296q() {
        }

        @Override // com.google.common.cache.kja0
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public wvg<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setAccessTime(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setValueReference(wvg<K, V> wvgVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.kja0
        public void setWriteTime(long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class qrj<K, V> implements wvg<K, V> {

        /* JADX INFO: renamed from: k */
        volatile wvg<K, V> f25871k;

        /* JADX INFO: renamed from: n */
        final com.google.common.base.eqxt f25872n;

        /* JADX INFO: renamed from: q */
        final i1<V> f25873q;

        /* JADX INFO: renamed from: com.google.common.cache.ld6$qrj$k */
        /* JADX INFO: compiled from: LocalCache.java */
        class C4297k implements com.google.common.base.t8r<V, V> {
            C4297k() {
            }

            @Override // com.google.common.base.t8r
            public V apply(V v2) {
                qrj.this.ld6(v2);
                return v2;
            }
        }

        public qrj() {
            this(ld6.m15478f());
        }

        /* JADX INFO: renamed from: y */
        private InterfaceFutureC4792c<V> m15500y(Throwable th) {
            return dd.qrj(th);
        }

        public long f7l8() {
            return this.f25872n.f7l8(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: g */
        public V mo15496g() throws ExecutionException {
            return (V) c8jq.m16895q(this.f25873q);
        }

        @Override // com.google.common.cache.ld6.wvg
        public V get() {
            return this.f25871k.get();
        }

        @Override // com.google.common.cache.ld6.wvg
        public boolean isActive() {
            return this.f25871k.isActive();
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: k */
        public boolean mo15497k() {
            return true;
        }

        public boolean ld6(@NullableDecl V v2) {
            return this.f25873q.mcp(v2);
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: n */
        public wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, @NullableDecl V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            return this;
        }

        /* JADX INFO: renamed from: p */
        public InterfaceFutureC4792c<V> m15501p(K k2, AbstractC4282g<? super K, V> abstractC4282g) {
            try {
                this.f25872n.ld6();
                V v2 = this.f25871k.get();
                if (v2 == null) {
                    V vLoad = abstractC4282g.load(k2);
                    return ld6(vLoad) ? this.f25873q : dd.n7h(vLoad);
                }
                InterfaceFutureC4792c<V> interfaceFutureC4792cReload = abstractC4282g.reload(k2, v2);
                return interfaceFutureC4792cReload == null ? dd.n7h(null) : dd.ni7(interfaceFutureC4792cReload, new C4297k(), C4815j.zy());
            } catch (Throwable th) {
                InterfaceFutureC4792c<V> interfaceFutureC4792cM15500y = x2(th) ? this.f25873q : m15500y(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return interfaceFutureC4792cM15500y;
            }
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return this.f25871k.mo15492q();
        }

        /* JADX INFO: renamed from: s */
        public wvg<K, V> m15502s() {
            return this.f25871k;
        }

        @Override // com.google.common.cache.ld6.wvg
        public com.google.common.cache.kja0<K, V> toq() {
            return null;
        }

        public boolean x2(Throwable th) {
            return this.f25873q.jk(th);
        }

        @Override // com.google.common.cache.ld6.wvg
        public void zy(@NullableDecl V v2) {
            if (v2 != null) {
                ld6(v2);
            } else {
                this.f25871k = ld6.m15478f();
            }
        }

        public qrj(wvg<K, V> wvgVar) {
            this.f25873q = i1.gvn7();
            this.f25872n = com.google.common.base.eqxt.m15328n();
            this.f25871k = wvgVar;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$s */
    /* JADX INFO: compiled from: LocalCache.java */
    abstract class AbstractC4298s<T> implements Iterator<T> {

        /* JADX INFO: renamed from: g */
        @MonotonicNonNullDecl
        AtomicReferenceArray<com.google.common.cache.kja0<K, V>> f25875g;

        /* JADX INFO: renamed from: k */
        int f25877k;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        ki<K, V> f25878n;

        /* JADX INFO: renamed from: p */
        @NullableDecl
        ld6<K, V>.d2ok f25879p;

        /* JADX INFO: renamed from: q */
        int f25880q = -1;

        /* JADX INFO: renamed from: s */
        @NullableDecl
        ld6<K, V>.d2ok f25881s;

        /* JADX INFO: renamed from: y */
        @NullableDecl
        com.google.common.cache.kja0<K, V> f25882y;

        AbstractC4298s() {
            this.f25877k = ld6.this.f25807n.length - 1;
            m15503k();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25881s != null;
        }

        /* JADX INFO: renamed from: k */
        final void m15503k() {
            this.f25881s = null;
            if (m15505q() || m15504n()) {
                return;
            }
            while (true) {
                int i2 = this.f25877k;
                if (i2 < 0) {
                    return;
                }
                ki<K, V>[] kiVarArr = ld6.this.f25807n;
                this.f25877k = i2 - 1;
                ki<K, V> kiVar = kiVarArr[i2];
                this.f25878n = kiVar;
                if (kiVar.count != 0) {
                    this.f25875g = this.f25878n.table;
                    this.f25880q = r0.length() - 1;
                    if (m15504n()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        boolean m15504n() {
            while (true) {
                int i2 = this.f25880q;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.f25875g;
                this.f25880q = i2 - 1;
                com.google.common.cache.kja0<K, V> kja0Var = atomicReferenceArray.get(i2);
                this.f25882y = kja0Var;
                if (kja0Var != null && (toq(kja0Var) || m15505q())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public abstract T next();

        /* JADX INFO: renamed from: q */
        boolean m15505q() {
            com.google.common.cache.kja0<K, V> kja0Var = this.f25882y;
            if (kja0Var == null) {
                return false;
            }
            while (true) {
                this.f25882y = kja0Var.getNext();
                com.google.common.cache.kja0<K, V> kja0Var2 = this.f25882y;
                if (kja0Var2 == null) {
                    return false;
                }
                if (toq(kja0Var2)) {
                    return true;
                }
                kja0Var = this.f25882y;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.jk.yz(this.f25879p != null);
            ld6.this.remove(this.f25879p.getKey());
            this.f25879p = null;
        }

        boolean toq(com.google.common.cache.kja0<K, V> kja0Var) {
            boolean z2;
            try {
                long jMo15454k = ld6.this.f25798e.mo15454k();
                K key = kja0Var.getKey();
                Object objZurt = ld6.this.zurt(kja0Var, jMo15454k);
                if (objZurt != null) {
                    this.f25881s = new d2ok(key, objZurt);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return z2;
            } finally {
                this.f25878n.postReadCleanup();
            }
        }

        ld6<K, V>.d2ok zy() {
            ld6<K, V>.d2ok d2okVar = this.f25881s;
            if (d2okVar == null) {
                throw new NoSuchElementException();
            }
            this.f25879p = d2okVar;
            m15503k();
            return this.f25879p;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$t */
    /* JADX INFO: compiled from: LocalCache.java */
    final class C4299t extends AbstractCollection<V> {

        /* JADX INFO: renamed from: k */
        private final ConcurrentMap<?, ?> f25883k;

        C4299t(ConcurrentMap<?, ?> concurrentMap) {
            this.f25883k = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f25883k.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f25883k.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f25883k.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new o1t();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f25883k.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return ld6.hyr(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ld6.hyr(this).toArray(eArr);
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class t8r<K, V> extends SoftReference<V> implements wvg<K, V> {

        /* JADX INFO: renamed from: k */
        final com.google.common.cache.kja0<K, V> f25885k;

        t8r(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            super(v2, referenceQueue);
            this.f25885k = kja0Var;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: g */
        public V mo15496g() {
            return get();
        }

        @Override // com.google.common.cache.ld6.wvg
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.ld6.wvg
        /* JADX INFO: renamed from: k */
        public boolean mo15497k() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, V v2, com.google.common.cache.kja0<K, V> kja0Var) {
            return new t8r(referenceQueue, v2, kja0Var);
        }

        /* JADX INFO: renamed from: q */
        public int mo15492q() {
            return 1;
        }

        @Override // com.google.common.cache.ld6.wvg
        public com.google.common.cache.kja0<K, V> toq() {
            return this.f25885k;
        }

        @Override // com.google.common.cache.ld6.wvg
        public void zy(V v2) {
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class toq extends AbstractQueue<Object> {
        toq() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return vep5.of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    interface wvg<K, V> {
        /* JADX INFO: renamed from: g */
        V mo15496g() throws ExecutionException;

        @NullableDecl
        V get();

        boolean isActive();

        /* JADX INFO: renamed from: k */
        boolean mo15497k();

        /* JADX INFO: renamed from: n */
        wvg<K, V> mo15498n(ReferenceQueue<V> referenceQueue, @NullableDecl V v2, com.google.common.cache.kja0<K, V> kja0Var);

        /* JADX INFO: renamed from: q */
        int mo15492q();

        @NullableDecl
        com.google.common.cache.kja0<K, V> toq();

        void zy(@NullableDecl V v2);
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class x2<K, V> extends C4289h<K, V> implements InterfaceC4303p<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        @MonotonicNonNullDecl
        transient InterfaceC4303p<K, V> autoDelegate;

        x2(ld6<K, V> ld6Var) {
            super(ld6Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (InterfaceC4303p<K, V>) recreateCacheBuilder().toq(this.loader);
        }

        private Object readResolve() {
            return this.autoDelegate;
        }

        @Override // com.google.common.cache.InterfaceC4303p, com.google.common.base.t8r
        public final V apply(K k2) {
            return this.autoDelegate.apply(k2);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public V get(K k2) throws ExecutionException {
            return this.autoDelegate.get(k2);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public zkd<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public V getUnchecked(K k2) {
            return this.autoDelegate.getUnchecked(k2);
        }

        @Override // com.google.common.cache.InterfaceC4303p
        public void refresh(K k2) {
            this.autoDelegate.refresh(k2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$y */
    /* JADX INFO: compiled from: LocalCache.java */
    final class C4300y extends ld6<K, V>.zy<Map.Entry<K, V>> {
        C4300y(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = ld6.this.get(key)) != null && ld6.this.f25812s.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f7l8();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && ld6.this.remove(key, entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.ld6$z */
    /* JADX INFO: compiled from: LocalCache.java */
    static final class C4301z<K, V> extends ni7<K, V> {

        /* JADX INFO: renamed from: p */
        com.google.common.cache.kja0<K, V> f25887p;

        /* JADX INFO: renamed from: s */
        com.google.common.cache.kja0<K, V> f25888s;

        /* JADX INFO: renamed from: y */
        volatile long f25889y;

        C4301z(K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(k2, i2, kja0Var);
            this.f25889y = Long.MAX_VALUE;
            this.f25888s = ld6.jp0y();
            this.f25887p = ld6.jp0y();
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
            return this.f25888s;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
            return this.f25887p;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public long getWriteTime() {
            return this.f25889y;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25888s = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25887p = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setWriteTime(long j2) {
            this.f25889y = j2;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static final class zurt<K, V> extends ni7<K, V> {

        /* JADX INFO: renamed from: h */
        volatile long f25890h;

        /* JADX INFO: renamed from: i */
        com.google.common.cache.kja0<K, V> f25891i;

        /* JADX INFO: renamed from: p */
        com.google.common.cache.kja0<K, V> f25892p;

        /* JADX INFO: renamed from: s */
        com.google.common.cache.kja0<K, V> f25893s;

        /* JADX INFO: renamed from: y */
        volatile long f25894y;

        /* JADX INFO: renamed from: z */
        com.google.common.cache.kja0<K, V> f25895z;

        zurt(K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            super(k2, i2, kja0Var);
            this.f25894y = Long.MAX_VALUE;
            this.f25893s = ld6.jp0y();
            this.f25892p = ld6.jp0y();
            this.f25890h = Long.MAX_VALUE;
            this.f25891i = ld6.jp0y();
            this.f25895z = ld6.jp0y();
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public long getAccessTime() {
            return this.f25894y;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInAccessQueue() {
            return this.f25893s;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getNextInWriteQueue() {
            return this.f25891i;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInAccessQueue() {
            return this.f25892p;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public com.google.common.cache.kja0<K, V> getPreviousInWriteQueue() {
            return this.f25895z;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public long getWriteTime() {
            return this.f25890h;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setAccessTime(long j2) {
            this.f25894y = j2;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setNextInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25893s = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setNextInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25891i = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setPreviousInAccessQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25892p = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setPreviousInWriteQueue(com.google.common.cache.kja0<K, V> kja0Var) {
            this.f25895z = kja0Var;
        }

        @Override // com.google.common.cache.ld6.AbstractC4296q, com.google.common.cache.kja0
        public void setWriteTime(long j2) {
            this.f25890h = j2;
        }
    }

    /* JADX INFO: compiled from: LocalCache.java */
    abstract class zy<T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: k */
        @Weak
        final ConcurrentMap<?, ?> f25896k;

        zy(ConcurrentMap<?, ?> concurrentMap) {
            this.f25896k = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f25896k.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f25896k.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f25896k.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return ld6.hyr(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ld6.hyr(this).toArray(eArr);
        }
    }

    ld6(C4304q<? super K, ? super V> c4304q, @NullableDecl AbstractC4282g<? super K, V> abstractC4282g) {
        this.f25800g = Math.min(c4304q.m15519p(), 65536);
        EnumC4290i enumC4290iKja0 = c4304q.kja0();
        this.f25809p = enumC4290iKja0;
        this.f25801h = c4304q.zurt();
        this.f25815y = c4304q.n7h();
        this.f25812s = c4304q.fn3e();
        long jM15515h = c4304q.m15515h();
        this.f25802i = jM15515h;
        this.f25816z = (com.google.common.cache.fn3e<K, V>) c4304q.ni7();
        this.f25813t = c4304q.ld6();
        this.f25811r = c4304q.x2();
        this.f25805l = c4304q.cdj();
        C4304q.q qVar = (com.google.common.cache.cdj<K, V>) c4304q.ki();
        this.f25797c = qVar;
        this.f25799f = qVar == C4304q.q.INSTANCE ? m15481p() : new ConcurrentLinkedQueue<>();
        this.f25798e = c4304q.m15516i(m15488r());
        this.f25803j = EnumC4288g.getFactory(enumC4290iKja0, m15483c(), m15484e());
        this.f25808o = c4304q.t8r().get();
        this.f25806m = abstractC4282g;
        int iMin = Math.min(c4304q.qrj(), 1073741824);
        if (ld6() && !m15490y()) {
            iMin = (int) Math.min(iMin, jM15515h);
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.f25800g && (!ld6() || i5 * 20 <= this.f25802i)) {
            i4++;
            i5 <<= 1;
        }
        this.f25810q = 32 - i4;
        this.f25804k = i5 - 1;
        this.f25807n = a9(i5);
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (ld6()) {
            long j2 = this.f25802i;
            long j3 = i5;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (true) {
                ki<K, V>[] kiVarArr = this.f25807n;
                if (i2 >= kiVarArr.length) {
                    return;
                }
                if (i2 == j5) {
                    j4--;
                }
                kiVarArr[i2] = f7l8(i3, j4, c4304q.t8r().get());
                i2++;
            }
        } else {
            while (true) {
                ki<K, V>[] kiVarArr2 = this.f25807n;
                if (i2 >= kiVarArr2.length) {
                    return;
                }
                kiVarArr2[i2] = f7l8(i3, -1L, c4304q.t8r().get());
                i2++;
            }
        }
    }

    static <K, V> void d3(com.google.common.cache.kja0<K, V> kja0Var) {
        com.google.common.cache.kja0<K, V> kja0VarJp0y = jp0y();
        kja0Var.setNextInWriteQueue(kja0VarJp0y);
        kja0Var.setPreviousInWriteQueue(kja0VarJp0y);
    }

    /* JADX INFO: renamed from: f */
    static <K, V> wvg<K, V> m15478f() {
        return (wvg<K, V>) bb;
    }

    static <K, V> void gvn7(com.google.common.cache.kja0<K, V> kja0Var) {
        com.google.common.cache.kja0<K, V> kja0VarJp0y = jp0y();
        kja0Var.setNextInAccessQueue(kja0VarJp0y);
        kja0Var.setPreviousInAccessQueue(kja0VarJp0y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> hyr(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        zwy.m16125k(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V> com.google.common.cache.kja0<K, V> jp0y() {
        return cdj.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    static int m15480l(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    /* JADX INFO: renamed from: p */
    static <E> Queue<E> m15481p() {
        return (Queue<E>) bp;
    }

    /* JADX INFO: renamed from: q */
    static <K, V> void m15482q(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
        kja0Var.setNextInWriteQueue(kja0Var2);
        kja0Var2.setPreviousInWriteQueue(kja0Var);
    }

    static <K, V> void zy(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
        kja0Var.setNextInAccessQueue(kja0Var2);
        kja0Var2.setPreviousInAccessQueue(kja0Var);
    }

    final ki<K, V>[] a9(int i2) {
        return new ki[i2];
    }

    /* JADX INFO: renamed from: c */
    boolean m15483c() {
        return lrht() || lvui();
    }

    /* JADX WARN: Multi-variable type inference failed */
    zkd<K, V> cdj(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapM16017j = vy.m16017j();
        LinkedHashSet linkedHashSetWvg = g0ad.wvg();
        int i2 = 0;
        int i3 = 0;
        for (K k2 : iterable) {
            Object obj = get(k2);
            if (!linkedHashMapM16017j.containsKey(k2)) {
                linkedHashMapM16017j.put(k2, obj);
                if (obj == null) {
                    i3++;
                    linkedHashSetWvg.add(k2);
                } else {
                    i2++;
                }
            }
        }
        try {
            if (!linkedHashSetWvg.isEmpty()) {
                try {
                    Map mapM15489t = m15489t(linkedHashSetWvg, this.f25806m);
                    for (Object obj2 : linkedHashSetWvg) {
                        Object obj3 = mapM15489t.get(obj2);
                        if (obj3 == null) {
                            throw new AbstractC4282g.zy("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapM16017j.put(obj2, obj3);
                    }
                } catch (AbstractC4282g.n unused) {
                    for (Object obj4 : linkedHashSetWvg) {
                        i3--;
                        linkedHashMapM16017j.put(obj4, m15486h(obj4, this.f25806m));
                    }
                }
            }
            return zkd.copyOf((Map) linkedHashMapM16017j);
        } finally {
            this.f25808o.mo15474k(i2);
            this.f25808o.toq(i3);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (ki<K, V> kiVar : this.f25807n) {
            kiVar.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int iFu4 = fu4(obj);
        return n5r1(iFu4).containsKey(obj, iFu4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        long jMo15454k = this.f25798e.mo15454k();
        ki<K, V>[] kiVarArr = this.f25807n;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            int length = kiVarArr.length;
            for (?? r12 = z2; r12 < length; r12++) {
                ki<K, V> kiVar = kiVarArr[r12];
                int i3 = kiVar.count;
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = kiVar.table;
                for (?? r15 = z2; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.kja0<K, V> next = atomicReferenceArray.get(r15);
                    while (next != null) {
                        ki<K, V>[] kiVarArr2 = kiVarArr;
                        V liveValue = kiVar.getLiveValue(next, jMo15454k);
                        long j4 = jMo15454k;
                        if (liveValue != null && this.f25812s.equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = next.getNext();
                        kiVarArr = kiVarArr2;
                        jMo15454k = j4;
                    }
                }
                j3 += (long) kiVar.modCount;
                jMo15454k = jMo15454k;
                z2 = false;
            }
            long j5 = jMo15454k;
            ki<K, V>[] kiVarArr3 = kiVarArr;
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            kiVarArr = kiVarArr3;
            jMo15454k = j5;
            z2 = false;
        }
        return z2;
    }

    void d2ok(wvg<K, V> wvgVar) {
        com.google.common.cache.kja0<K, V> qVar = wvgVar.toq();
        int hash = qVar.getHash();
        n5r1(hash).reclaimValue(qVar.getKey(), hash, wvgVar);
    }

    boolean dd() {
        return kja0() || ncyb();
    }

    /* JADX INFO: renamed from: e */
    boolean m15484e() {
        return nn86() || dd();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @wlev.zy
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f25814x;
        if (set != null) {
            return set;
        }
        C4300y c4300y = new C4300y(this);
        this.f25814x = c4300y;
        return c4300y;
    }

    void eqxt(com.google.common.cache.kja0<K, V> kja0Var) {
        int hash = kja0Var.getHash();
        n5r1(hash).reclaimKey(kja0Var, hash);
    }

    ki<K, V> f7l8(int i2, long j2, AbstractC4285k.toq toqVar) {
        return new ki<>(this, i2, j2, toqVar);
    }

    @NullableDecl
    public V fn3e(Object obj) {
        int iFu4 = fu4(com.google.common.base.jk.a9(obj));
        V v2 = n5r1(iFu4).get(obj, iFu4);
        if (v2 == null) {
            this.f25808o.toq(1);
        } else {
            this.f25808o.mo15474k(1);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @InterfaceC7732q
    wvg<K, V> fti(com.google.common.cache.kja0<K, V> kja0Var, V v2, int i2) {
        return this.f25801h.referenceValue(n5r1(kja0Var.getHash()), kja0Var, com.google.common.base.jk.a9(v2), i2);
    }

    int fu4(@NullableDecl Object obj) {
        return m15480l(this.f25815y.hash(obj));
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: g */
    com.google.common.cache.kja0<K, V> m15485g(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
        return n5r1(kja0Var.getHash()).copyEntry(kja0Var, kja0Var2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iFu4 = fu4(obj);
        return n5r1(iFu4).get(obj, iFu4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @NullableDecl
    public V getOrDefault(@NullableDecl Object obj, @NullableDecl V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    /* JADX INFO: renamed from: h */
    V m15486h(K k2, AbstractC4282g<? super K, V> abstractC4282g) throws ExecutionException {
        int iFu4 = fu4(com.google.common.base.jk.a9(k2));
        return n5r1(iFu4).get(k2, iFu4, abstractC4282g);
    }

    /* JADX INFO: renamed from: i */
    com.google.common.cache.kja0<K, V> m15487i(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iFu4 = fu4(obj);
        return n5r1(iFu4).getEntry(obj, iFu4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        ki<K, V>[] kiVarArr = this.f25807n;
        long j2 = 0;
        for (int i2 = 0; i2 < kiVarArr.length; i2++) {
            if (kiVarArr[i2].count != 0) {
                return false;
            }
            j2 += (long) kiVarArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < kiVarArr.length; i3++) {
            if (kiVarArr[i3].count != 0) {
                return false;
            }
            j2 -= (long) kiVarArr[i3].modCount;
        }
        return j2 == 0;
    }

    @InterfaceC7732q
    com.google.common.cache.kja0<K, V> jk(K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
        ki<K, V> kiVarN5r1 = n5r1(i2);
        kiVarN5r1.lock();
        try {
            return kiVarN5r1.newEntry(k2, i2, kja0Var);
        } finally {
            kiVarN5r1.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f25796b;
        if (set != null) {
            return set;
        }
        C7985ld6 c7985ld6 = new C7985ld6(this);
        this.f25796b = c7985ld6;
        return c7985ld6;
    }

    boolean kja0() {
        return this.f25811r > 0;
    }

    boolean ld6() {
        return this.f25802i >= 0;
    }

    boolean lrht() {
        return n7h() || ld6();
    }

    boolean lvui() {
        return n7h();
    }

    long mcp() {
        long jMax = 0;
        for (ki<K, V> kiVar : this.f25807n) {
            jMax += (long) Math.max(0, kiVar.count);
        }
        return jMax;
    }

    ki<K, V> n5r1(int i2) {
        return this.f25807n[(i2 >>> this.f25810q) & this.f25804k];
    }

    boolean n7h() {
        return this.f25813t > 0;
    }

    boolean ncyb() {
        return this.f25805l > 0;
    }

    V ni7(K k2) throws ExecutionException {
        return m15486h(k2, this.f25806m);
    }

    boolean nn86() {
        return kja0();
    }

    boolean o1t(com.google.common.cache.kja0<K, V> kja0Var, long j2) {
        com.google.common.base.jk.a9(kja0Var);
        if (!n7h() || j2 - kja0Var.getAccessTime() < this.f25813t) {
            return kja0() && j2 - kja0Var.getWriteTime() >= this.f25811r;
        }
        return true;
    }

    void oc() {
        while (true) {
            com.google.common.cache.t8r<K, V> t8rVarPoll = this.f25799f.poll();
            if (t8rVarPoll == null) {
                return;
            }
            try {
                this.f25797c.onRemoval(t8rVarPoll);
            } catch (Throwable th) {
                f68152ab.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v2);
        int iFu4 = fu4(k2);
        return n5r1(iFu4).put(k2, iFu4, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v2);
        int iFu4 = fu4(k2);
        return n5r1(iFu4).put(k2, iFu4, v2, true);
    }

    /* JADX INFO: renamed from: r */
    boolean m15488r() {
        return dd() || lvui();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iFu4 = fu4(obj);
        return n5r1(iFu4).remove(obj, iFu4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @NullableDecl V v2, V v3) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v3);
        if (v2 == null) {
            return false;
        }
        int iFu4 = fu4(k2);
        return n5r1(iFu4).replace(k2, iFu4, v2, v3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return C4746s.fu4(mcp());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.Map<K, V> m15489t(java.util.Set<? extends K> r7, com.google.common.cache.AbstractC4282g<? super K, V> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            com.google.common.base.jk.a9(r8)
            com.google.common.base.jk.a9(r7)
            com.google.common.base.eqxt r0 = com.google.common.base.eqxt.zy()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.loadAll(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Error -> L91 java.lang.Exception -> L98 java.lang.RuntimeException -> L9f java.lang.InterruptedException -> La6 com.google.common.cache.AbstractC4282g.n -> Lb4
            if (r7 == 0) goto L6c
            r0.x2()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = r1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.k$toq r8 = r6.f25808o
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.f7l8(r1)
            r8.mo15475n(r0)
            return r7
        L4a:
            com.google.common.cache.k$toq r7 = r6.f25808o
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.f7l8(r1)
            r7.mo15476q(r0)
            com.google.common.cache.g$zy r7 = new com.google.common.cache.g$zy
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L6c:
            com.google.common.cache.k$toq r7 = r6.f25808o
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.f7l8(r1)
            r7.mo15476q(r0)
            com.google.common.cache.g$zy r7 = new com.google.common.cache.g$zy
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L8e:
            r7 = move-exception
            r1 = r2
            goto Lb7
        L91:
            r7 = move-exception
            com.google.common.util.concurrent.z r8 = new com.google.common.util.concurrent.z     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L98:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L9f:
            r7 = move-exception
            com.google.common.util.concurrent.bo r8 = new com.google.common.util.concurrent.bo     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        La6:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8e
            r8.interrupt()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        Lb4:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r7 = move-exception
        Lb7:
            if (r1 != 0) goto Lc4
            com.google.common.cache.k$toq r8 = r6.f25808o
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.f7l8(r1)
            r8.mo15476q(r0)
        Lc4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.m15489t(java.util.Set, com.google.common.cache.g):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    zkd<K, V> t8r(Iterable<?> iterable) {
        LinkedHashMap linkedHashMapM16017j = vy.m16017j();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : iterable) {
            V v2 = get(obj);
            if (v2 == null) {
                i3++;
            } else {
                linkedHashMapM16017j.put(obj, v2);
                i2++;
            }
        }
        this.f25808o.mo15474k(i2);
        this.f25808o.toq(i3);
        return zkd.copyOf((Map) linkedHashMapM16017j);
    }

    public void toq() {
        for (ki<K, V> kiVar : this.f25807n) {
            kiVar.cleanUp();
        }
    }

    boolean uv6() {
        return this.f25809p != EnumC4290i.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f25795a;
        if (collection != null) {
            return collection;
        }
        C4299t c4299t = new C4299t(this);
        this.f25795a = c4299t;
        return c4299t;
    }

    boolean vyq() {
        return this.f25801h != EnumC4290i.STRONG;
    }

    @InterfaceC7732q
    boolean wvg(com.google.common.cache.kja0<K, V> kja0Var, long j2) {
        return n5r1(kja0Var.getHash()).getLiveValue(kja0Var, j2) != null;
    }

    boolean x2() {
        return kja0() || n7h();
    }

    void x9kr(K k2) {
        int iFu4 = fu4(com.google.common.base.jk.a9(k2));
        n5r1(iFu4).refresh(k2, iFu4, this.f25806m, false);
    }

    /* JADX INFO: renamed from: y */
    boolean m15490y() {
        return this.f25816z != C4304q.n.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    void m15491z(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @NullableDecl
    V zurt(com.google.common.cache.kja0<K, V> kja0Var, long j2) {
        V v2;
        if (kja0Var.getKey() == null || (v2 = kja0Var.getValueReference().get()) == null || o1t(kja0Var, j2)) {
            return null;
        }
        return v2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iFu4 = fu4(obj);
        return n5r1(iFu4).remove(obj, iFu4, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v2);
        int iFu4 = fu4(k2);
        return n5r1(iFu4).replace(k2, iFu4, v2);
    }

    /* JADX INFO: compiled from: LocalCache.java */
    static class ki<K, V> extends ReentrantLock {

        @GuardedBy("this")
        final Queue<com.google.common.cache.kja0<K, V>> accessQueue;
        volatile int count;

        @NullableDecl
        final ReferenceQueue<K> keyReferenceQueue;

        @Weak
        final ld6<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<com.google.common.cache.kja0<K, V>> recencyQueue;
        final AbstractC4285k.toq statsCounter;

        @MonotonicNonNullDecl
        volatile AtomicReferenceArray<com.google.common.cache.kja0<K, V>> table;
        int threshold;

        @GuardedBy("this")
        long totalWeight;

        @NullableDecl
        final ReferenceQueue<V> valueReferenceQueue;

        @GuardedBy("this")
        final Queue<com.google.common.cache.kja0<K, V>> writeQueue;

        /* JADX INFO: renamed from: com.google.common.cache.ld6$ki$k */
        /* JADX INFO: compiled from: LocalCache.java */
        class RunnableC4292k implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ InterfaceFutureC4792c f25848g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Object f25849k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ qrj f25850n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ int f25851q;

            RunnableC4292k(Object obj, int i2, qrj qrjVar, InterfaceFutureC4792c interfaceFutureC4792c) {
                this.f25849k = obj;
                this.f25851q = i2;
                this.f25850n = qrjVar;
                this.f25848g = interfaceFutureC4792c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ki.this.getAndRecordStats(this.f25849k, this.f25851q, this.f25850n, this.f25848g);
                } catch (Throwable th) {
                    ld6.f68152ab.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f25850n.x2(th);
                }
            }
        }

        ki(ld6<K, V> ld6Var, int i2, long j2, AbstractC4285k.toq toqVar) {
            this.map = ld6Var;
            this.maxSegmentWeight = j2;
            this.statsCounter = (AbstractC4285k.toq) com.google.common.base.jk.a9(toqVar);
            initTable(newEntryArray(i2));
            this.keyReferenceQueue = ld6Var.uv6() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = ld6Var.vyq() ? new ReferenceQueue<>() : null;
            this.recencyQueue = ld6Var.lrht() ? new ConcurrentLinkedQueue<>() : ld6.m15481p();
            this.writeQueue = ld6Var.nn86() ? new eqxt<>() : ld6.m15481p();
            this.accessQueue = ld6Var.lrht() ? new C4294n<>() : ld6.m15481p();
        }

        void cleanUp() {
            runLockedCleanup(this.map.f25798e.mo15454k());
            runUnlockedCleanup();
        }

        void clear() {
            if (this.count != 0) {
                lock();
                try {
                    preWriteCleanup(this.map.f25798e.mo15454k());
                    AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (com.google.common.cache.kja0<K, V> next = atomicReferenceArray.get(i2); next != null; next = next.getNext()) {
                            if (next.getValueReference().isActive()) {
                                K key = next.getKey();
                                V v2 = next.getValueReference().get();
                                enqueueNotification(key, next.getHash(), v2, next.getValueReference().mo15492q(), (key == null || v2 == null) ? EnumC4283h.COLLECTED : EnumC4283h.EXPLICIT);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    clearReferenceQueues();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    postWriteCleanup();
                }
            }
        }

        void clearKeyReferenceQueue() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        void clearReferenceQueues() {
            if (this.map.uv6()) {
                clearKeyReferenceQueue();
            }
            if (this.map.vyq()) {
                clearValueReferenceQueue();
            }
        }

        void clearValueReferenceQueue() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        boolean containsKey(Object obj, int i2) {
            try {
                if (this.count == 0) {
                    return false;
                }
                com.google.common.cache.kja0<K, V> liveEntry = getLiveEntry(obj, i2, this.map.f25798e.mo15454k());
                if (liveEntry == null) {
                    return false;
                }
                return liveEntry.getValueReference().get() != null;
            } finally {
                postReadCleanup();
            }
        }

        @InterfaceC7732q
        boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    long jMo15454k = this.map.f25798e.mo15454k();
                    AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        for (com.google.common.cache.kja0<K, V> next = atomicReferenceArray.get(i2); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next, jMo15454k);
                            if (liveValue != null && this.map.f25812s.equivalent(obj, liveValue)) {
                                postReadCleanup();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        @GuardedBy("this")
        com.google.common.cache.kja0<K, V> copyEntry(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
            if (kja0Var.getKey() == null) {
                return null;
            }
            wvg<K, V> valueReference = kja0Var.getValueReference();
            V v2 = valueReference.get();
            if (v2 == null && valueReference.isActive()) {
                return null;
            }
            com.google.common.cache.kja0<K, V> kja0VarCopyEntry = this.map.f25803j.copyEntry(this, kja0Var, kja0Var2);
            kja0VarCopyEntry.setValueReference(valueReference.mo15498n(this.valueReferenceQueue, v2, kja0VarCopyEntry));
            return kja0VarCopyEntry;
        }

        @GuardedBy("this")
        void drainKeyReferenceQueue() {
            int i2 = 0;
            do {
                Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.eqxt((com.google.common.cache.kja0) referencePoll);
                i2++;
            } while (i2 != 16);
        }

        @GuardedBy("this")
        void drainRecencyQueue() {
            while (true) {
                com.google.common.cache.kja0<K, V> kja0VarPoll = this.recencyQueue.poll();
                if (kja0VarPoll == null) {
                    return;
                }
                if (this.accessQueue.contains(kja0VarPoll)) {
                    this.accessQueue.add(kja0VarPoll);
                }
            }
        }

        @GuardedBy("this")
        void drainReferenceQueues() {
            if (this.map.uv6()) {
                drainKeyReferenceQueue();
            }
            if (this.map.vyq()) {
                drainValueReferenceQueue();
            }
        }

        @GuardedBy("this")
        void drainValueReferenceQueue() {
            int i2 = 0;
            do {
                Reference<? extends V> referencePoll = this.valueReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.d2ok((wvg) referencePoll);
                i2++;
            } while (i2 != 16);
        }

        @GuardedBy("this")
        void enqueueNotification(@NullableDecl K k2, int i2, @NullableDecl V v2, int i3, EnumC4283h enumC4283h) {
            this.totalWeight -= (long) i3;
            if (enumC4283h.wasEvicted()) {
                this.statsCounter.zy();
            }
            if (this.map.f25799f != ld6.bp) {
                this.map.f25799f.offer(com.google.common.cache.t8r.create(k2, v2, enumC4283h));
            }
        }

        @GuardedBy("this")
        void evictEntries(com.google.common.cache.kja0<K, V> kja0Var) {
            if (this.map.ld6()) {
                drainRecencyQueue();
                if (kja0Var.getValueReference().mo15492q() > this.maxSegmentWeight && !removeEntry(kja0Var, kja0Var.getHash(), EnumC4283h.SIZE)) {
                    throw new AssertionError();
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    com.google.common.cache.kja0<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), EnumC4283h.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @GuardedBy("this")
        void expand() {
            AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.count;
            AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                com.google.common.cache.kja0<K, V> next = atomicReferenceArray.get(i3);
                if (next != null) {
                    com.google.common.cache.kja0<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        com.google.common.cache.kja0<K, V> kja0Var = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                kja0Var = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, kja0Var);
                        while (next != kja0Var) {
                            int hash3 = next.getHash() & length2;
                            com.google.common.cache.kja0<K, V> kja0VarCopyEntry = copyEntry(next, atomicReferenceArrayNewEntryArray.get(hash3));
                            if (kja0VarCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, kja0VarCopyEntry);
                            } else {
                                removeCollectedEntry(next);
                                i2--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i2;
        }

        @GuardedBy("this")
        void expireEntries(long j2) {
            com.google.common.cache.kja0<K, V> kja0VarPeek;
            com.google.common.cache.kja0<K, V> kja0VarPeek2;
            drainRecencyQueue();
            do {
                kja0VarPeek = this.writeQueue.peek();
                if (kja0VarPeek == null || !this.map.o1t(kja0VarPeek, j2)) {
                    do {
                        kja0VarPeek2 = this.accessQueue.peek();
                        if (kja0VarPeek2 == null || !this.map.o1t(kja0VarPeek2, j2)) {
                            return;
                        }
                    } while (removeEntry(kja0VarPeek2, kja0VarPeek2.getHash(), EnumC4283h.EXPIRED));
                    throw new AssertionError();
                }
            } while (removeEntry(kja0VarPeek, kja0VarPeek.getHash(), EnumC4283h.EXPIRED));
            throw new AssertionError();
        }

        V get(K k2, int i2, AbstractC4282g<? super K, V> abstractC4282g) throws ExecutionException {
            com.google.common.cache.kja0<K, V> entry;
            com.google.common.base.jk.a9(k2);
            com.google.common.base.jk.a9(abstractC4282g);
            try {
                try {
                    if (this.count != 0 && (entry = getEntry(k2, i2)) != null) {
                        long jMo15454k = this.map.f25798e.mo15454k();
                        V liveValue = getLiveValue(entry, jMo15454k);
                        if (liveValue != null) {
                            recordRead(entry, jMo15454k);
                            this.statsCounter.mo15474k(1);
                            return scheduleRefresh(entry, k2, i2, liveValue, jMo15454k, abstractC4282g);
                        }
                        wvg<K, V> valueReference = entry.getValueReference();
                        if (valueReference.mo15497k()) {
                            return waitForLoadingValue(entry, k2, valueReference);
                        }
                    }
                    return lockedGetOrLoad(k2, i2, abstractC4282g);
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof Error) {
                        throw new C4857z((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new bo(cause);
                    }
                    throw e2;
                }
            } finally {
                postReadCleanup();
            }
        }

        V getAndRecordStats(K k2, int i2, qrj<K, V> qrjVar, InterfaceFutureC4792c<V> interfaceFutureC4792c) throws Throwable {
            V v2;
            try {
                v2 = (V) c8jq.m16895q(interfaceFutureC4792c);
            } catch (Throwable th) {
                th = th;
                v2 = null;
            }
            try {
                if (v2 != null) {
                    this.statsCounter.mo15475n(qrjVar.f7l8());
                    storeLoadedValue(k2, i2, qrjVar, v2);
                    return v2;
                }
                throw new AbstractC4282g.zy("CacheLoader returned null for key " + k2 + ".");
            } catch (Throwable th2) {
                th = th2;
                if (v2 == null) {
                    this.statsCounter.mo15476q(qrjVar.f7l8());
                    removeLoadingValue(k2, i2, qrjVar);
                }
                throw th;
            }
        }

        @NullableDecl
        com.google.common.cache.kja0<K, V> getEntry(Object obj, int i2) {
            for (com.google.common.cache.kja0<K, V> first = getFirst(i2); first != null; first = first.getNext()) {
                if (first.getHash() == i2) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.f25815y.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        com.google.common.cache.kja0<K, V> getFirst(int i2) {
            return this.table.get(i2 & (r0.length() - 1));
        }

        @NullableDecl
        com.google.common.cache.kja0<K, V> getLiveEntry(Object obj, int i2, long j2) {
            com.google.common.cache.kja0<K, V> entry = getEntry(obj, i2);
            if (entry == null) {
                return null;
            }
            if (!this.map.o1t(entry, j2)) {
                return entry;
            }
            tryExpireEntries(j2);
            return null;
        }

        V getLiveValue(com.google.common.cache.kja0<K, V> kja0Var, long j2) {
            if (kja0Var.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v2 = kja0Var.getValueReference().get();
            if (v2 == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (!this.map.o1t(kja0Var, j2)) {
                return v2;
            }
            tryExpireEntries(j2);
            return null;
        }

        @GuardedBy("this")
        com.google.common.cache.kja0<K, V> getNextEvictable() {
            for (com.google.common.cache.kja0<K, V> kja0Var : this.accessQueue) {
                if (kja0Var.getValueReference().mo15492q() > 0) {
                    return kja0Var;
                }
            }
            throw new AssertionError();
        }

        void initTable(AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.m15490y()) {
                int i2 = this.threshold;
                if (i2 == this.maxSegmentWeight) {
                    this.threshold = i2 + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        @NullableDecl
        qrj<K, V> insertLoadingValueReference(K k2, int i2, boolean z2) {
            lock();
            try {
                long jMo15454k = this.map.f25798e.mo15454k();
                preWriteCleanup(jMo15454k);
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                com.google.common.cache.kja0<K, V> kja0Var = (com.google.common.cache.kja0) atomicReferenceArray.get(length);
                for (com.google.common.cache.kja0 next = kja0Var; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.f25815y.equivalent(k2, key)) {
                        wvg<K, V> valueReference = next.getValueReference();
                        if (!valueReference.mo15497k() && (!z2 || jMo15454k - next.getWriteTime() >= this.map.f25805l)) {
                            this.modCount++;
                            qrj<K, V> qrjVar = new qrj<>(valueReference);
                            next.setValueReference(qrjVar);
                            return qrjVar;
                        }
                        return null;
                    }
                }
                this.modCount++;
                qrj<K, V> qrjVar2 = new qrj<>();
                com.google.common.cache.kja0<K, V> kja0VarNewEntry = newEntry(k2, i2, kja0Var);
                kja0VarNewEntry.setValueReference(qrjVar2);
                atomicReferenceArray.set(length, kja0VarNewEntry);
                return qrjVar2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        InterfaceFutureC4792c<V> loadAsync(K k2, int i2, qrj<K, V> qrjVar, AbstractC4282g<? super K, V> abstractC4282g) {
            InterfaceFutureC4792c<V> interfaceFutureC4792cM15501p = qrjVar.m15501p(k2, abstractC4282g);
            interfaceFutureC4792cM15501p.n7h(new RunnableC4292k(k2, i2, qrjVar, interfaceFutureC4792cM15501p), C4815j.zy());
            return interfaceFutureC4792cM15501p;
        }

        V loadSync(K k2, int i2, qrj<K, V> qrjVar, AbstractC4282g<? super K, V> abstractC4282g) throws ExecutionException {
            return getAndRecordStats(k2, i2, qrjVar, qrjVar.m15501p(k2, abstractC4282g));
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        
            if (r1 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        
            r15 = new com.google.common.cache.ld6.qrj<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
        
            if (r14 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        
            r14 = newEntry(r18, r19, r13);
            r14.setValueReference(r15);
            r11.set(r12, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
        
            r14.setValueReference(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        
            monitor-enter(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
        
            r0 = loadSync(r18, r19, r15, r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        
            monitor-exit(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        
            r17.statsCounter.toq(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
        
            return waitForLoadingValue(r14, r18, r2);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V lockedGetOrLoad(K r18, int r19, com.google.common.cache.AbstractC4282g<? super K, V> r20) throws java.util.concurrent.ExecutionException {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.ki.lockedGetOrLoad(java.lang.Object, int, com.google.common.cache.g):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @GuardedBy("this")
        com.google.common.cache.kja0<K, V> newEntry(K k2, int i2, @NullableDecl com.google.common.cache.kja0<K, V> kja0Var) {
            return this.map.f25803j.newEntry(this, com.google.common.base.jk.a9(k2), i2, kja0Var);
        }

        AtomicReferenceArray<com.google.common.cache.kja0<K, V>> newEntryArray(int i2) {
            return new AtomicReferenceArray<>(i2);
        }

        void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        void postWriteCleanup() {
            runUnlockedCleanup();
        }

        @GuardedBy("this")
        void preWriteCleanup(long j2) {
            runLockedCleanup(j2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        
            return null;
         */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V put(K r15, int r16, V r17, boolean r18) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.ki.put(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        boolean reclaimKey(com.google.common.cache.kja0<K, V> kja0Var, int i2) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                com.google.common.cache.kja0<K, V> kja0Var2 = atomicReferenceArray.get(length);
                for (com.google.common.cache.kja0<K, V> next = kja0Var2; next != null; next = next.getNext()) {
                    if (next == kja0Var) {
                        this.modCount++;
                        com.google.common.cache.kja0<K, V> kja0VarRemoveValueFromChain = removeValueFromChain(kja0Var2, next, next.getKey(), i2, next.getValueReference().get(), next.getValueReference(), EnumC4283h.COLLECTED);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, kja0VarRemoveValueFromChain);
                        this.count = i3;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        boolean reclaimValue(K k2, int i2, wvg<K, V> wvgVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                com.google.common.cache.kja0<K, V> kja0Var = atomicReferenceArray.get(length);
                for (com.google.common.cache.kja0<K, V> next = kja0Var; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.f25815y.equivalent(k2, key)) {
                        if (next.getValueReference() != wvgVar) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                postWriteCleanup();
                            }
                            return false;
                        }
                        this.modCount++;
                        com.google.common.cache.kja0<K, V> kja0VarRemoveValueFromChain = removeValueFromChain(kja0Var, next, key, i2, wvgVar.get(), wvgVar, EnumC4283h.COLLECTED);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, kja0VarRemoveValueFromChain);
                        this.count = i3;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
            }
        }

        @GuardedBy("this")
        void recordLockedRead(com.google.common.cache.kja0<K, V> kja0Var, long j2) {
            if (this.map.lvui()) {
                kja0Var.setAccessTime(j2);
            }
            this.accessQueue.add(kja0Var);
        }

        void recordRead(com.google.common.cache.kja0<K, V> kja0Var, long j2) {
            if (this.map.lvui()) {
                kja0Var.setAccessTime(j2);
            }
            this.recencyQueue.add(kja0Var);
        }

        @GuardedBy("this")
        void recordWrite(com.google.common.cache.kja0<K, V> kja0Var, int i2, long j2) {
            drainRecencyQueue();
            this.totalWeight += (long) i2;
            if (this.map.lvui()) {
                kja0Var.setAccessTime(j2);
            }
            if (this.map.dd()) {
                kja0Var.setWriteTime(j2);
            }
            this.accessQueue.add(kja0Var);
            this.writeQueue.add(kja0Var);
        }

        @NullableDecl
        V refresh(K k2, int i2, AbstractC4282g<? super K, V> abstractC4282g, boolean z2) {
            qrj<K, V> qrjVarInsertLoadingValueReference = insertLoadingValueReference(k2, i2, z2);
            if (qrjVarInsertLoadingValueReference == null) {
                return null;
            }
            InterfaceFutureC4792c<V> interfaceFutureC4792cLoadAsync = loadAsync(k2, i2, qrjVarInsertLoadingValueReference, abstractC4282g);
            if (interfaceFutureC4792cLoadAsync.isDone()) {
                try {
                    return (V) c8jq.m16895q(interfaceFutureC4792cLoadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r9 = r5.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            if (r12 == null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            r2 = com.google.common.cache.EnumC4283h.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r9.isActive() == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            r2 = com.google.common.cache.EnumC4283h.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            r11.modCount++;
            r13 = removeValueFromChain(r4, r5, r6, r13, r12, r9, r10);
            r2 = r11.count - 1;
            r0.set(r1, r13);
            r11.count = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            return r12;
         */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V remove(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                r11.lock()
                com.google.common.cache.ld6<K, V> r0 = r11.map     // Catch: java.lang.Throwable -> L78
                com.google.common.base.x9kr r0 = r0.f25798e     // Catch: java.lang.Throwable -> L78
                long r0 = r0.mo15454k()     // Catch: java.lang.Throwable -> L78
                r11.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L78
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.kja0<K, V>> r0 = r11.table     // Catch: java.lang.Throwable -> L78
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L78
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L78
                r4 = r2
                com.google.common.cache.kja0 r4 = (com.google.common.cache.kja0) r4     // Catch: java.lang.Throwable -> L78
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6c
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L78
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L78
                if (r3 != r13) goto L73
                if (r6 == 0) goto L73
                com.google.common.cache.ld6<K, V> r3 = r11.map     // Catch: java.lang.Throwable -> L78
                com.google.common.base.x2<java.lang.Object> r3 = r3.f25815y     // Catch: java.lang.Throwable -> L78
                boolean r3 = r3.equivalent(r12, r6)     // Catch: java.lang.Throwable -> L78
                if (r3 == 0) goto L73
                com.google.common.cache.ld6$wvg r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L78
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L78
                if (r12 == 0) goto L46
                com.google.common.cache.h r2 = com.google.common.cache.EnumC4283h.EXPLICIT     // Catch: java.lang.Throwable -> L78
            L44:
                r10 = r2
                goto L4f
            L46:
                boolean r3 = r9.isActive()     // Catch: java.lang.Throwable -> L78
                if (r3 == 0) goto L6c
                com.google.common.cache.h r2 = com.google.common.cache.EnumC4283h.COLLECTED     // Catch: java.lang.Throwable -> L78
                goto L44
            L4f:
                int r2 = r11.modCount     // Catch: java.lang.Throwable -> L78
                int r2 = r2 + 1
                r11.modCount = r2     // Catch: java.lang.Throwable -> L78
                r3 = r11
                r7 = r13
                r8 = r12
                com.google.common.cache.kja0 r13 = r3.removeValueFromChain(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L78
                int r2 = r11.count     // Catch: java.lang.Throwable -> L78
                int r2 = r2 + (-1)
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L78
                r11.count = r2     // Catch: java.lang.Throwable -> L78
                r11.unlock()
                r11.postWriteCleanup()
                return r12
            L6c:
                r11.unlock()
                r11.postWriteCleanup()
                return r2
            L73:
                com.google.common.cache.kja0 r5 = r5.getNext()     // Catch: java.lang.Throwable -> L78
                goto L1f
            L78:
                r12 = move-exception
                r11.unlock()
                r11.postWriteCleanup()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.ki.remove(java.lang.Object, int):java.lang.Object");
        }

        @GuardedBy("this")
        void removeCollectedEntry(com.google.common.cache.kja0<K, V> kja0Var) {
            enqueueNotification(kja0Var.getKey(), kja0Var.getHash(), kja0Var.getValueReference().get(), kja0Var.getValueReference().mo15492q(), EnumC4283h.COLLECTED);
            this.writeQueue.remove(kja0Var);
            this.accessQueue.remove(kja0Var);
        }

        @InterfaceC7732q
        @GuardedBy("this")
        boolean removeEntry(com.google.common.cache.kja0<K, V> kja0Var, int i2, EnumC4283h enumC4283h) {
            AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i2;
            com.google.common.cache.kja0<K, V> kja0Var2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.kja0<K, V> next = kja0Var2; next != null; next = next.getNext()) {
                if (next == kja0Var) {
                    this.modCount++;
                    com.google.common.cache.kja0<K, V> kja0VarRemoveValueFromChain = removeValueFromChain(kja0Var2, next, next.getKey(), i2, next.getValueReference().get(), next.getValueReference(), enumC4283h);
                    int i3 = this.count - 1;
                    atomicReferenceArray.set(length, kja0VarRemoveValueFromChain);
                    this.count = i3;
                    return true;
                }
            }
            return false;
        }

        @NullableDecl
        @GuardedBy("this")
        com.google.common.cache.kja0<K, V> removeEntryFromChain(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2) {
            int i2 = this.count;
            com.google.common.cache.kja0<K, V> next = kja0Var2.getNext();
            while (kja0Var != kja0Var2) {
                com.google.common.cache.kja0<K, V> kja0VarCopyEntry = copyEntry(kja0Var, next);
                if (kja0VarCopyEntry != null) {
                    next = kja0VarCopyEntry;
                } else {
                    removeCollectedEntry(kja0Var);
                    i2--;
                }
                kja0Var = kja0Var.getNext();
            }
            this.count = i2;
            return next;
        }

        boolean removeLoadingValue(K k2, int i2, qrj<K, V> qrjVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                com.google.common.cache.kja0<K, V> kja0Var = atomicReferenceArray.get(length);
                com.google.common.cache.kja0<K, V> next = kja0Var;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    K key = next.getKey();
                    if (next.getHash() != i2 || key == null || !this.map.f25815y.equivalent(k2, key)) {
                        next = next.getNext();
                    } else if (next.getValueReference() == qrjVar) {
                        if (qrjVar.isActive()) {
                            next.setValueReference(qrjVar.m15502s());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(kja0Var, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @NullableDecl
        @GuardedBy("this")
        com.google.common.cache.kja0<K, V> removeValueFromChain(com.google.common.cache.kja0<K, V> kja0Var, com.google.common.cache.kja0<K, V> kja0Var2, @NullableDecl K k2, int i2, V v2, wvg<K, V> wvgVar, EnumC4283h enumC4283h) {
            enqueueNotification(k2, i2, v2, wvgVar.mo15492q(), enumC4283h);
            this.writeQueue.remove(kja0Var2);
            this.accessQueue.remove(kja0Var2);
            if (!wvgVar.mo15497k()) {
                return removeEntryFromChain(kja0Var, kja0Var2);
            }
            wvgVar.zy(null);
            return kja0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean replace(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.ld6<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> Lb5
                com.google.common.base.x9kr r1 = r1.f25798e     // Catch: java.lang.Throwable -> Lb5
                long r7 = r1.mo15454k()     // Catch: java.lang.Throwable -> Lb5
                r9.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> Lb5
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.kja0<K, V>> r10 = r9.table     // Catch: java.lang.Throwable -> Lb5
                int r1 = r10.length()     // Catch: java.lang.Throwable -> Lb5
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch: java.lang.Throwable -> Lb5
                r2 = r1
                com.google.common.cache.kja0 r2 = (com.google.common.cache.kja0) r2     // Catch: java.lang.Throwable -> Lb5
                r13 = r2
            L24:
                r14 = 0
                if (r13 == 0) goto L69
                java.lang.Object r4 = r13.getKey()     // Catch: java.lang.Throwable -> Lb5
                int r1 = r13.getHash()     // Catch: java.lang.Throwable -> Lb5
                if (r1 != r0) goto Lab
                if (r4 == 0) goto Lab
                com.google.common.cache.ld6<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> Lb5
                com.google.common.base.x2<java.lang.Object> r1 = r1.f25815y     // Catch: java.lang.Throwable -> Lb5
                r15 = r18
                boolean r1 = r1.equivalent(r15, r4)     // Catch: java.lang.Throwable -> Lb5
                if (r1 == 0) goto Lad
                com.google.common.cache.ld6$wvg r16 = r13.getValueReference()     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r6 = r16.get()     // Catch: java.lang.Throwable -> Lb5
                if (r6 != 0) goto L70
                boolean r1 = r16.isActive()     // Catch: java.lang.Throwable -> Lb5
                if (r1 == 0) goto L69
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> Lb5
                int r1 = r1 + r11
                r9.modCount = r1     // Catch: java.lang.Throwable -> Lb5
                com.google.common.cache.h r8 = com.google.common.cache.EnumC4283h.COLLECTED     // Catch: java.lang.Throwable -> Lb5
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.kja0 r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb5
                int r1 = r9.count     // Catch: java.lang.Throwable -> Lb5
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch: java.lang.Throwable -> Lb5
                r9.count = r1     // Catch: java.lang.Throwable -> Lb5
            L69:
                r17.unlock()
                r17.postWriteCleanup()
                return r14
            L70:
                com.google.common.cache.ld6<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> Lb5
                com.google.common.base.x2<java.lang.Object> r1 = r1.f25812s     // Catch: java.lang.Throwable -> Lb5
                r3 = r20
                boolean r1 = r1.equivalent(r3, r6)     // Catch: java.lang.Throwable -> Lb5
                if (r1 == 0) goto La7
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> Lb5
                int r1 = r1 + r11
                r9.modCount = r1     // Catch: java.lang.Throwable -> Lb5
                int r5 = r16.mo15492q()     // Catch: java.lang.Throwable -> Lb5
                com.google.common.cache.h r10 = com.google.common.cache.EnumC4283h.REPLACED     // Catch: java.lang.Throwable -> Lb5
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb5
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb5
                r9.evictEntries(r13)     // Catch: java.lang.Throwable -> Lb5
                r17.unlock()
                r17.postWriteCleanup()
                return r11
            La7:
                r9.recordLockedRead(r13, r7)     // Catch: java.lang.Throwable -> Lb5
                goto L69
            Lab:
                r15 = r18
            Lad:
                r3 = r20
                com.google.common.cache.kja0 r13 = r13.getNext()     // Catch: java.lang.Throwable -> Lb5
                goto L24
            Lb5:
                r0 = move-exception
                r17.unlock()
                r17.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.ki.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        void runLockedCleanup(long j2) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j2);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void runUnlockedCleanup() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.map.oc();
        }

        V scheduleRefresh(com.google.common.cache.kja0<K, V> kja0Var, K k2, int i2, V v2, long j2, AbstractC4282g<? super K, V> abstractC4282g) {
            V vRefresh;
            return (!this.map.ncyb() || j2 - kja0Var.getWriteTime() <= this.map.f25805l || kja0Var.getValueReference().mo15497k() || (vRefresh = refresh(k2, i2, abstractC4282g, true)) == null) ? v2 : vRefresh;
        }

        @GuardedBy("this")
        void setValue(com.google.common.cache.kja0<K, V> kja0Var, K k2, V v2, long j2) {
            wvg<K, V> valueReference = kja0Var.getValueReference();
            int iWeigh = this.map.f25816z.weigh(k2, v2);
            com.google.common.base.jk.y9n(iWeigh >= 0, "Weights must be non-negative");
            kja0Var.setValueReference(this.map.f25801h.referenceValue(this, kja0Var, v2, iWeigh));
            recordWrite(kja0Var, iWeigh, j2);
            valueReference.zy(v2);
        }

        boolean storeLoadedValue(K k2, int i2, qrj<K, V> qrjVar, V v2) {
            lock();
            try {
                long jMo15454k = this.map.f25798e.mo15454k();
                preWriteCleanup(jMo15454k);
                int i3 = this.count + 1;
                if (i3 > this.threshold) {
                    expand();
                    i3 = this.count + 1;
                }
                int i4 = i3;
                AtomicReferenceArray<com.google.common.cache.kja0<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.kja0<K, V> kja0Var = atomicReferenceArray.get(length);
                com.google.common.cache.kja0<K, V> next = kja0Var;
                while (true) {
                    if (next == null) {
                        this.modCount++;
                        com.google.common.cache.kja0<K, V> kja0VarNewEntry = newEntry(k2, i2, kja0Var);
                        setValue(kja0VarNewEntry, k2, v2, jMo15454k);
                        atomicReferenceArray.set(length, kja0VarNewEntry);
                        this.count = i4;
                        evictEntries(kja0VarNewEntry);
                        break;
                    }
                    K key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.f25815y.equivalent(k2, key)) {
                        wvg<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (qrjVar != valueReference && (v3 != null || valueReference == ld6.bb)) {
                            enqueueNotification(k2, i2, v2, 0, EnumC4283h.REPLACED);
                            return false;
                        }
                        this.modCount++;
                        if (qrjVar.isActive()) {
                            enqueueNotification(k2, i2, v3, qrjVar.mo15492q(), v3 == null ? EnumC4283h.COLLECTED : EnumC4283h.REPLACED);
                            i4--;
                        }
                        setValue(next, k2, v2, jMo15454k);
                        this.count = i4;
                        evictEntries(next);
                    } else {
                        next = next.getNext();
                    }
                }
                return true;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        void tryExpireEntries(long j2) {
            if (tryLock()) {
                try {
                    expireEntries(j2);
                } finally {
                    unlock();
                }
            }
        }

        V waitForLoadingValue(com.google.common.cache.kja0<K, V> kja0Var, K k2, wvg<K, V> wvgVar) throws ExecutionException {
            if (!wvgVar.mo15497k()) {
                throw new AssertionError();
            }
            com.google.common.base.jk.gyi(!Thread.holdsLock(kja0Var), "Recursive load of: %s", k2);
            try {
                V vMo15496g = wvgVar.mo15496g();
                if (vMo15496g != null) {
                    recordRead(kja0Var, this.map.f25798e.mo15454k());
                    return vMo15496g;
                }
                throw new AbstractC4282g.zy("CacheLoader returned null for key " + k2 + ".");
            } finally {
                this.statsCounter.toq(1);
            }
        }

        @NullableDecl
        V get(Object obj, int i2) {
            try {
                if (this.count != 0) {
                    long jMo15454k = this.map.f25798e.mo15454k();
                    com.google.common.cache.kja0<K, V> liveEntry = getLiveEntry(obj, i2, jMo15454k);
                    if (liveEntry == null) {
                        return null;
                    }
                    V v2 = liveEntry.getValueReference().get();
                    if (v2 != null) {
                        recordRead(liveEntry, jMo15454k);
                        return scheduleRefresh(liveEntry, liveEntry.getKey(), i2, v2, jMo15454k, this.map.f25806m);
                    }
                    tryDrainReferenceQueues();
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if (r12.map.f25812s.equivalent(r15, r9) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r13 = com.google.common.cache.EnumC4283h.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r9 != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r10.isActive() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            r13 = com.google.common.cache.EnumC4283h.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            r12.modCount++;
            r14 = removeValueFromChain(r5, r6, r7, r14, r9, r10, r13);
            r15 = r12.count - 1;
            r0.set(r1, r14);
            r12.count = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        
            if (r13 != com.google.common.cache.EnumC4283h.EXPLICIT) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean remove(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
                r12 = this;
                r12.lock()
                com.google.common.cache.ld6<K, V> r0 = r12.map     // Catch: java.lang.Throwable -> L84
                com.google.common.base.x9kr r0 = r0.f25798e     // Catch: java.lang.Throwable -> L84
                long r0 = r0.mo15454k()     // Catch: java.lang.Throwable -> L84
                r12.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L84
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.kja0<K, V>> r0 = r12.table     // Catch: java.lang.Throwable -> L84
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L84
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L84
                r5 = r3
                com.google.common.cache.kja0 r5 = (com.google.common.cache.kja0) r5     // Catch: java.lang.Throwable -> L84
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L78
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L84
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L84
                if (r4 != r14) goto L7f
                if (r7 == 0) goto L7f
                com.google.common.cache.ld6<K, V> r4 = r12.map     // Catch: java.lang.Throwable -> L84
                com.google.common.base.x2<java.lang.Object> r4 = r4.f25815y     // Catch: java.lang.Throwable -> L84
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L84
                if (r4 == 0) goto L7f
                com.google.common.cache.ld6$wvg r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L84
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L84
                com.google.common.cache.ld6<K, V> r13 = r12.map     // Catch: java.lang.Throwable -> L84
                com.google.common.base.x2<java.lang.Object> r13 = r13.f25812s     // Catch: java.lang.Throwable -> L84
                boolean r13 = r13.equivalent(r15, r9)     // Catch: java.lang.Throwable -> L84
                if (r13 == 0) goto L4d
                com.google.common.cache.h r13 = com.google.common.cache.EnumC4283h.EXPLICIT     // Catch: java.lang.Throwable -> L84
                goto L57
            L4d:
                if (r9 != 0) goto L78
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L84
                if (r13 == 0) goto L78
                com.google.common.cache.h r13 = com.google.common.cache.EnumC4283h.COLLECTED     // Catch: java.lang.Throwable -> L84
            L57:
                int r15 = r12.modCount     // Catch: java.lang.Throwable -> L84
                int r15 = r15 + r2
                r12.modCount = r15     // Catch: java.lang.Throwable -> L84
                r4 = r12
                r8 = r14
                r11 = r13
                com.google.common.cache.kja0 r14 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L84
                int r15 = r12.count     // Catch: java.lang.Throwable -> L84
                int r15 = r15 - r2
                r0.set(r1, r14)     // Catch: java.lang.Throwable -> L84
                r12.count = r15     // Catch: java.lang.Throwable -> L84
                com.google.common.cache.h r14 = com.google.common.cache.EnumC4283h.EXPLICIT     // Catch: java.lang.Throwable -> L84
                if (r13 != r14) goto L70
                goto L71
            L70:
                r2 = r3
            L71:
                r12.unlock()
                r12.postWriteCleanup()
                return r2
            L78:
                r12.unlock()
                r12.postWriteCleanup()
                return r3
            L7f:
                com.google.common.cache.kja0 r6 = r6.getNext()     // Catch: java.lang.Throwable -> L84
                goto L1f
            L84:
                r13 = move-exception
                r12.unlock()
                r12.postWriteCleanup()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.ki.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            return null;
         */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V replace(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.ld6<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> La7
                com.google.common.base.x9kr r1 = r1.f25798e     // Catch: java.lang.Throwable -> La7
                long r7 = r1.mo15454k()     // Catch: java.lang.Throwable -> La7
                r9.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> La7
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.kja0<K, V>> r10 = r9.table     // Catch: java.lang.Throwable -> La7
                int r1 = r10.length()     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + (-1)
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> La7
                r2 = r1
                com.google.common.cache.kja0 r2 = (com.google.common.cache.kja0) r2     // Catch: java.lang.Throwable -> La7
                r12 = r2
            L24:
                r13 = 0
                if (r12 == 0) goto L6c
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> La7
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> La7
                if (r1 != r0) goto L9f
                if (r4 == 0) goto L9f
                com.google.common.cache.ld6<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> La7
                com.google.common.base.x2<java.lang.Object> r1 = r1.f25815y     // Catch: java.lang.Throwable -> La7
                r14 = r18
                boolean r1 = r1.equivalent(r14, r4)     // Catch: java.lang.Throwable -> La7
                if (r1 == 0) goto La1
                com.google.common.cache.ld6$wvg r15 = r12.getValueReference()     // Catch: java.lang.Throwable -> La7
                java.lang.Object r16 = r15.get()     // Catch: java.lang.Throwable -> La7
                if (r16 != 0) goto L73
                boolean r1 = r15.isActive()     // Catch: java.lang.Throwable -> La7
                if (r1 == 0) goto L6c
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + 1
                r9.modCount = r1     // Catch: java.lang.Throwable -> La7
                com.google.common.cache.h r8 = com.google.common.cache.EnumC4283h.COLLECTED     // Catch: java.lang.Throwable -> La7
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.kja0 r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La7
                int r1 = r9.count     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + (-1)
                r10.set(r11, r0)     // Catch: java.lang.Throwable -> La7
                r9.count = r1     // Catch: java.lang.Throwable -> La7
            L6c:
                r17.unlock()
                r17.postWriteCleanup()
                return r13
            L73:
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + 1
                r9.modCount = r1     // Catch: java.lang.Throwable -> La7
                int r5 = r15.mo15492q()     // Catch: java.lang.Throwable -> La7
                com.google.common.cache.h r6 = com.google.common.cache.EnumC4283h.REPLACED     // Catch: java.lang.Throwable -> La7
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La7
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
                r9.evictEntries(r12)     // Catch: java.lang.Throwable -> La7
                r17.unlock()
                r17.postWriteCleanup()
                return r16
            L9f:
                r14 = r18
            La1:
                com.google.common.cache.kja0 r12 = r12.getNext()     // Catch: java.lang.Throwable -> La7
                goto L24
            La7:
                r0 = move-exception
                r17.unlock()
                r17.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.ld6.ki.replace(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }
    }
}
