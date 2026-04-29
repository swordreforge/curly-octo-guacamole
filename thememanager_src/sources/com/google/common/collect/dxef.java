package com.google.common.collect;

import com.google.common.collect.dxef.InterfaceC4344p;
import com.google.common.collect.dxef.kja0;
import com.google.common.collect.e5;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: MapMakerInternalMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class dxef<K, V, E extends InterfaceC4344p<K, V, E>, S extends kja0<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final gvn7<Object, Object, C4337g> UNSET_WEAK_VALUE_REFERENCE = new C4340k();
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient ld6<K, V, E, S> entryHelper;

    @MonotonicNonNullDecl
    transient Set<Map.Entry<K, V>> entrySet;
    final com.google.common.base.x2<Object> keyEquivalence;

    @MonotonicNonNullDecl
    transient Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient kja0<K, V, E, S>[] segments;

    @MonotonicNonNullDecl
    transient Collection<V> values;

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class a9<K, V> extends AbstractC4345q<K, V, a9<K, V>> implements jp0y<K, V, a9<K, V>> {

        /* JADX INFO: renamed from: n */
        private volatile gvn7<K, V, a9<K, V>> f26037n;

        /* JADX INFO: renamed from: com.google.common.collect.dxef$a9$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class C4335k<K, V> implements ld6<K, V, a9<K, V>, fti<K, V>> {

            /* JADX INFO: renamed from: k */
            private static final C4335k<?, ?> f26038k = new C4335k<>();

            C4335k() {
            }

            /* JADX INFO: renamed from: y */
            static <K, V> C4335k<K, V> m15605y() {
                return (C4335k<K, V>) f26038k;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
            public a9<K, V> mo15607k(fti<K, V> ftiVar, a9<K, V> a9Var, @NullableDecl a9<K, V> a9Var2) {
                if (a9Var.getKey() == null || kja0.isCollected(a9Var)) {
                    return null;
                }
                return a9Var.m15604q(((fti) ftiVar).queueForKeys, ((fti) ftiVar).queueForValues, a9Var2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void zy(fti<K, V> ftiVar, a9<K, V> a9Var, V v2) {
                a9Var.m15603n(v2, ((fti) ftiVar).queueForValues);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: n */
            public cdj mo15608n() {
                return cdj.WEAK;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public fti<K, V> mo15606g(dxef<K, V, a9<K, V>, fti<K, V>> dxefVar, int i2, int i3) {
                return new fti<>(dxefVar, i2, i3);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public a9<K, V> mo15610q(fti<K, V> ftiVar, K k2, int i2, @NullableDecl a9<K, V> a9Var) {
                return new a9<>(((fti) ftiVar).queueForKeys, k2, i2, a9Var);
            }

            @Override // com.google.common.collect.dxef.ld6
            public cdj toq() {
                return cdj.WEAK;
            }
        }

        a9(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl a9<K, V> a9Var) {
            super(referenceQueue, k2, i2, a9Var);
            this.f26037n = dxef.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public V getValue() {
            return this.f26037n.get();
        }

        @Override // com.google.common.collect.dxef.jp0y
        public gvn7<K, V, a9<K, V>> getValueReference() {
            return this.f26037n;
        }

        @Override // com.google.common.collect.dxef.jp0y
        /* JADX INFO: renamed from: k */
        public void mo15602k() {
            this.f26037n.clear();
        }

        /* JADX INFO: renamed from: n */
        void m15603n(V v2, ReferenceQueue<V> referenceQueue) {
            gvn7<K, V, a9<K, V>> gvn7Var = this.f26037n;
            this.f26037n = new d3(referenceQueue, v2, this);
            gvn7Var.clear();
        }

        /* JADX INFO: renamed from: q */
        a9<K, V> m15604q(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, a9<K, V> a9Var) {
            a9<K, V> a9Var2 = new a9<>(referenceQueue, getKey(), this.f26052k, a9Var);
            a9Var2.f26037n = this.f26037n.mo15612k(referenceQueue2, a9Var2);
            return a9Var2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class cdj {
        public static final cdj STRONG;
        public static final cdj WEAK;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ cdj[] f26039k;

        /* JADX INFO: renamed from: com.google.common.collect.dxef$cdj$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        enum C4336k extends cdj {
            C4336k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.collect.dxef.cdj
            com.google.common.base.x2<Object> defaultEquivalence() {
                return com.google.common.base.x2.equals();
            }
        }

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        enum toq extends cdj {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.collect.dxef.cdj
            com.google.common.base.x2<Object> defaultEquivalence() {
                return com.google.common.base.x2.identity();
            }
        }

        static {
            C4336k c4336k = new C4336k("STRONG", 0);
            STRONG = c4336k;
            toq toqVar = new toq("WEAK", 1);
            WEAK = toqVar;
            f26039k = new cdj[]{c4336k, toqVar};
        }

        private cdj(String str, int i2) {
        }

        public static cdj valueOf(String str) {
            return (cdj) Enum.valueOf(cdj.class, str);
        }

        public static cdj[] values() {
            return (cdj[]) f26039k.clone();
        }

        abstract com.google.common.base.x2<Object> defaultEquivalence();

        /* synthetic */ cdj(String str, int i2, C4340k c4340k) {
            this(str, i2);
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class d3<K, V, E extends InterfaceC4344p<K, V, E>> extends WeakReference<V> implements gvn7<K, V, E> {

        /* JADX INFO: renamed from: k */
        @Weak
        final E f26040k;

        d3(ReferenceQueue<V> referenceQueue, V v2, E e2) {
            super(v2, referenceQueue);
            this.f26040k = e2;
        }

        @Override // com.google.common.collect.dxef.gvn7
        /* JADX INFO: renamed from: k */
        public gvn7<K, V, E> mo15612k(ReferenceQueue<V> referenceQueue, E e2) {
            return new d3(referenceQueue, get(), e2);
        }

        @Override // com.google.common.collect.dxef.gvn7
        public E toq() {
            return this.f26040k;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class f7l8 extends dxef<K, V, E, S>.AbstractC4346s<Map.Entry<K, V>> {
        f7l8() {
            super();
        }

        @Override // com.google.common.collect.dxef.AbstractC4346s, java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return zy();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class fn3e<K, V> extends kja0<K, V, C4339i<K, V>, fn3e<K, V>> {
        fn3e(dxef<K, V, C4339i<K, V>, fn3e<K, V>> dxefVar, int i2, int i3) {
            super(dxefVar, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.dxef.kja0
        public fn3e<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.dxef.kja0
        public C4339i<K, V> castForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return (C4339i) interfaceC4344p;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class fti<K, V> extends kja0<K, V, a9<K, V>, fti<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        fti(dxef<K, V, a9<K, V>, fti<K, V>> dxefVar, int i2, int i3) {
            super(dxefVar, i2, i3);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.dxef.kja0
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.dxef.kja0
        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.dxef.kja0
        public gvn7<K, V, a9<K, V>> getWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return castForTesting((InterfaceC4344p) interfaceC4344p).getValueReference();
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.dxef.kja0
        public gvn7<K, V, a9<K, V>> newWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, V v2) {
            return new d3(this.queueForValues, v2, castForTesting((InterfaceC4344p) interfaceC4344p));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.dxef.kja0
        public fti<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.dxef.kja0
        public void setWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, gvn7<K, V, ? extends InterfaceC4344p<K, V, ?>> gvn7Var) {
            a9<K, V> a9VarCastForTesting = castForTesting((InterfaceC4344p) interfaceC4344p);
            gvn7 gvn7Var2 = ((a9) a9VarCastForTesting).f26037n;
            ((a9) a9VarCastForTesting).f26037n = gvn7Var;
            gvn7Var2.clear();
        }

        @Override // com.google.common.collect.dxef.kja0
        public a9<K, V> castForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return (a9) interfaceC4344p;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface fu4<K, V, E extends InterfaceC4344p<K, V, E>> extends InterfaceC4344p<K, V, E> {
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$g */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class C4337g implements InterfaceC4344p<Object, Object, C4337g> {
        private C4337g() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public Object getValue() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public C4337g getNext() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface gvn7<K, V, E extends InterfaceC4344p<K, V, E>> {
        void clear();

        @NullableDecl
        V get();

        /* JADX INFO: renamed from: k */
        gvn7<K, V, E> mo15612k(ReferenceQueue<V> referenceQueue, E e2);

        E toq();
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$h */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    private static final class C4338h<K, V> extends toq<K, V> {
        private static final long serialVersionUID = 3;

        C4338h(cdj cdjVar, cdj cdjVar2, com.google.common.base.x2<Object> x2Var, com.google.common.base.x2<Object> x2Var2, int i2, ConcurrentMap<K, V> concurrentMap) {
            super(cdjVar, cdjVar2, x2Var, x2Var2, i2, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).m15642s();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$i */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class C4339i<K, V> extends zy<K, V, C4339i<K, V>> implements fu4<K, V, C4339i<K, V>> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        private volatile V f26042g;

        /* JADX INFO: renamed from: com.google.common.collect.dxef$i$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class k<K, V> implements ld6<K, V, C4339i<K, V>, fn3e<K, V>> {

            /* JADX INFO: renamed from: k */
            private static final k<?, ?> f26043k = new k<>();

            k() {
            }

            /* JADX INFO: renamed from: y */
            static <K, V> k<K, V> m15614y() {
                return (k<K, V>) f26043k;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
            public C4339i<K, V> mo15607k(fn3e<K, V> fn3eVar, C4339i<K, V> c4339i, @NullableDecl C4339i<K, V> c4339i2) {
                return c4339i.toq(c4339i2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void zy(fn3e<K, V> fn3eVar, C4339i<K, V> c4339i, V v2) {
                c4339i.zy(v2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: n */
            public cdj mo15608n() {
                return cdj.STRONG;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public fn3e<K, V> mo15606g(dxef<K, V, C4339i<K, V>, fn3e<K, V>> dxefVar, int i2, int i3) {
                return new fn3e<>(dxefVar, i2, i3);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public C4339i<K, V> mo15610q(fn3e<K, V> fn3eVar, K k2, int i2, @NullableDecl C4339i<K, V> c4339i) {
                return new C4339i<>(k2, i2, c4339i);
            }

            @Override // com.google.common.collect.dxef.ld6
            public cdj toq() {
                return cdj.STRONG;
            }
        }

        C4339i(K k2, int i2, @NullableDecl C4339i<K, V> c4339i) {
            super(k2, i2, c4339i);
            this.f26042g = null;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        @NullableDecl
        public V getValue() {
            return this.f26042g;
        }

        C4339i<K, V> toq(C4339i<K, V> c4339i) {
            C4339i<K, V> c4339i2 = new C4339i<>(this.f26069k, this.f26071q, c4339i);
            c4339i2.f26042g = this.f26042g;
            return c4339i2;
        }

        void zy(V v2) {
            this.f26042g = v2;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class jk<K, V> extends kja0<K, V, mcp<K, V>, jk<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        jk(dxef<K, V, mcp<K, V>, jk<K, V>> dxefVar, int i2, int i3) {
            super(dxefVar, i2, i3);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.dxef.kja0
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.dxef.kja0
        public jk<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.dxef.kja0
        public mcp<K, V> castForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return (mcp) interfaceC4344p;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface jp0y<K, V, E extends InterfaceC4344p<K, V, E>> extends InterfaceC4344p<K, V, E> {
        gvn7<K, V, E> getValueReference();

        /* JADX INFO: renamed from: k */
        void mo15602k();
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$k */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static class C4340k implements gvn7<Object, Object, C4337g> {
        C4340k() {
        }

        @Override // com.google.common.collect.dxef.gvn7
        public void clear() {
        }

        @Override // com.google.common.collect.dxef.gvn7
        public Object get() {
            return null;
        }

        @Override // com.google.common.collect.dxef.gvn7
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C4337g toq() {
            return null;
        }

        @Override // com.google.common.collect.dxef.gvn7
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public gvn7<Object, Object, C4337g> mo15612k(ReferenceQueue<Object> referenceQueue, C4337g c4337g) {
            return this;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class ki<K> extends zy<K, e5.EnumC4353k, ki<K>> implements fu4<K, e5.EnumC4353k, ki<K>> {

        /* JADX INFO: renamed from: com.google.common.collect.dxef$ki$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class C4341k<K> implements ld6<K, e5.EnumC4353k, ki<K>, t8r<K>> {

            /* JADX INFO: renamed from: k */
            private static final C4341k<?> f26044k = new C4341k<>();

            C4341k() {
            }

            /* JADX INFO: renamed from: y */
            static <K> C4341k<K> m15619y() {
                return (C4341k<K>) f26044k;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
            public ki<K> mo15607k(t8r<K> t8rVar, ki<K> kiVar, @NullableDecl ki<K> kiVar2) {
                return kiVar.toq(kiVar2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void zy(t8r<K> t8rVar, ki<K> kiVar, e5.EnumC4353k enumC4353k) {
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: n */
            public cdj mo15608n() {
                return cdj.STRONG;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public t8r<K> mo15606g(dxef<K, e5.EnumC4353k, ki<K>, t8r<K>> dxefVar, int i2, int i3) {
                return new t8r<>(dxefVar, i2, i3);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public ki<K> mo15610q(t8r<K> t8rVar, K k2, int i2, @NullableDecl ki<K> kiVar) {
                return new ki<>(k2, i2, kiVar);
            }

            @Override // com.google.common.collect.dxef.ld6
            public cdj toq() {
                return cdj.STRONG;
            }
        }

        ki(K k2, int i2, @NullableDecl ki<K> kiVar) {
            super(k2, i2, kiVar);
        }

        /* JADX INFO: renamed from: q */
        void m15618q(e5.EnumC4353k enumC4353k) {
        }

        ki<K> toq(ki<K> kiVar) {
            return new ki<>(this.f26069k, this.f26071q, kiVar);
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public e5.EnumC4353k getValue() {
            return e5.EnumC4353k.VALUE;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface ld6<K, V, E extends InterfaceC4344p<K, V, E>, S extends kja0<K, V, E, S>> {
        /* JADX INFO: renamed from: g */
        S mo15606g(dxef<K, V, E, S> dxefVar, int i2, int i3);

        /* JADX INFO: renamed from: k */
        E mo15607k(S s2, E e2, @NullableDecl E e3);

        /* JADX INFO: renamed from: n */
        cdj mo15608n();

        /* JADX INFO: renamed from: q */
        E mo15610q(S s2, K k2, int i2, @NullableDecl E e2);

        cdj toq();

        void zy(S s2, E e2, V v2);
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class mcp<K, V> extends AbstractC4345q<K, V, mcp<K, V>> implements fu4<K, V, mcp<K, V>> {

        /* JADX INFO: renamed from: n */
        @NullableDecl
        private volatile V f26045n;

        /* JADX INFO: renamed from: com.google.common.collect.dxef$mcp$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class C4342k<K, V> implements ld6<K, V, mcp<K, V>, jk<K, V>> {

            /* JADX INFO: renamed from: k */
            private static final C4342k<?, ?> f26046k = new C4342k<>();

            C4342k() {
            }

            /* JADX INFO: renamed from: y */
            static <K, V> C4342k<K, V> m15622y() {
                return (C4342k<K, V>) f26046k;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
            public mcp<K, V> mo15607k(jk<K, V> jkVar, mcp<K, V> mcpVar, @NullableDecl mcp<K, V> mcpVar2) {
                if (mcpVar.getKey() == null) {
                    return null;
                }
                return mcpVar.toq(((jk) jkVar).queueForKeys, mcpVar2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void zy(jk<K, V> jkVar, mcp<K, V> mcpVar, V v2) {
                mcpVar.zy(v2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: n */
            public cdj mo15608n() {
                return cdj.WEAK;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public jk<K, V> mo15606g(dxef<K, V, mcp<K, V>, jk<K, V>> dxefVar, int i2, int i3) {
                return new jk<>(dxefVar, i2, i3);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public mcp<K, V> mo15610q(jk<K, V> jkVar, K k2, int i2, @NullableDecl mcp<K, V> mcpVar) {
                return new mcp<>(((jk) jkVar).queueForKeys, k2, i2, mcpVar);
            }

            @Override // com.google.common.collect.dxef.ld6
            public cdj toq() {
                return cdj.STRONG;
            }
        }

        mcp(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl mcp<K, V> mcpVar) {
            super(referenceQueue, k2, i2, mcpVar);
            this.f26045n = null;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        @NullableDecl
        public V getValue() {
            return this.f26045n;
        }

        mcp<K, V> toq(ReferenceQueue<K> referenceQueue, mcp<K, V> mcpVar) {
            mcp<K, V> mcpVar2 = new mcp<>(referenceQueue, getKey(), this.f26052k, mcpVar);
            mcpVar2.zy(this.f26045n);
            return mcpVar2;
        }

        void zy(V v2) {
            this.f26045n = v2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$n */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class RunnableC4343n implements Runnable {

        /* JADX INFO: renamed from: k */
        final WeakReference<dxef<?, ?, ?, ?>> f26047k;

        public RunnableC4343n(dxef<?, ?, ?, ?> dxefVar) {
            this.f26047k = new WeakReference<>(dxefVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            dxef<?, ?, ?, ?> dxefVar = this.f26047k.get();
            if (dxefVar == null) {
                throw new CancellationException();
            }
            for (kja0<?, ?, E, S> kja0Var : dxefVar.segments) {
                kja0Var.runCleanup();
            }
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    private static abstract class n7h<E> extends AbstractSet<E> {
        private n7h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return dxef.m15601k(this).toArray();
        }

        /* synthetic */ n7h(C4340k c4340k) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) dxef.m15601k(this).toArray(tArr);
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class ni7<K, V> extends kja0<K, V, zurt<K, V>, ni7<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        ni7(dxef<K, V, zurt<K, V>, ni7<K, V>> dxefVar, int i2, int i3) {
            super(dxefVar, i2, i3);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.dxef.kja0
        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.dxef.kja0
        public gvn7<K, V, zurt<K, V>> getWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return castForTesting((InterfaceC4344p) interfaceC4344p).getValueReference();
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.dxef.kja0
        public gvn7<K, V, zurt<K, V>> newWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, V v2) {
            return new d3(this.queueForValues, v2, castForTesting((InterfaceC4344p) interfaceC4344p));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.dxef.kja0
        public ni7<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.dxef.kja0
        public void setWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, gvn7<K, V, ? extends InterfaceC4344p<K, V, ?>> gvn7Var) {
            zurt<K, V> zurtVarCastForTesting = castForTesting((InterfaceC4344p) interfaceC4344p);
            gvn7 gvn7Var2 = ((zurt) zurtVarCastForTesting).f26067g;
            ((zurt) zurtVarCastForTesting).f26067g = gvn7Var;
            gvn7Var2.clear();
        }

        @Override // com.google.common.collect.dxef.kja0
        public zurt<K, V> castForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return (zurt) interfaceC4344p;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class o1t extends AbstractCollection<V> {
        o1t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            dxef.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return dxef.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return dxef.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C4350z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return dxef.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return dxef.m15601k(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) dxef.m15601k(this).toArray(tArr);
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class oc extends com.google.common.collect.f7l8<K, V> {

        /* JADX INFO: renamed from: k */
        final K f26049k;

        /* JADX INFO: renamed from: q */
        V f26051q;

        oc(K k2, V v2) {
            this.f26049k = k2;
            this.f26051q = v2;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f26049k.equals(entry.getKey()) && this.f26051q.equals(entry.getValue());
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getKey() {
            return this.f26049k;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V getValue() {
            return this.f26051q;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public int hashCode() {
            return this.f26049k.hashCode() ^ this.f26051q.hashCode();
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = (V) dxef.this.put(this.f26049k, v2);
            this.f26051q = v2;
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$p */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface InterfaceC4344p<K, V, E extends InterfaceC4344p<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$q */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class AbstractC4345q<K, V, E extends InterfaceC4344p<K, V, E>> extends WeakReference<K> implements InterfaceC4344p<K, V, E> {

        /* JADX INFO: renamed from: k */
        final int f26052k;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        final E f26053q;

        AbstractC4345q(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl E e2) {
            super(k2, referenceQueue);
            this.f26052k = i2;
            this.f26053q = e2;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public int getHash() {
            return this.f26052k;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public E getNext() {
            return this.f26053q;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class qrj extends n7h<K> {
        qrj() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            dxef.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return dxef.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return dxef.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new x2();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return dxef.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return dxef.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$s */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    abstract class AbstractC4346s<T> implements Iterator<T> {

        /* JADX INFO: renamed from: g */
        @MonotonicNonNullDecl
        AtomicReferenceArray<E> f26055g;

        /* JADX INFO: renamed from: k */
        int f26057k;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        kja0<K, V, E, S> f26058n;

        /* JADX INFO: renamed from: p */
        @NullableDecl
        dxef<K, V, E, S>.oc f26059p;

        /* JADX INFO: renamed from: q */
        int f26060q = -1;

        /* JADX INFO: renamed from: s */
        @NullableDecl
        dxef<K, V, E, S>.oc f26061s;

        /* JADX INFO: renamed from: y */
        @NullableDecl
        E f26062y;

        AbstractC4346s() {
            this.f26057k = dxef.this.segments.length - 1;
            m15625k();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26061s != null;
        }

        /* JADX INFO: renamed from: k */
        final void m15625k() {
            this.f26061s = null;
            if (m15627q() || m15626n()) {
                return;
            }
            while (true) {
                int i2 = this.f26057k;
                if (i2 < 0) {
                    return;
                }
                kja0<K, V, E, S>[] kja0VarArr = dxef.this.segments;
                this.f26057k = i2 - 1;
                kja0<K, V, E, S> kja0Var = kja0VarArr[i2];
                this.f26058n = kja0Var;
                if (kja0Var.count != 0) {
                    this.f26055g = this.f26058n.table;
                    this.f26060q = r0.length() - 1;
                    if (m15626n()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        boolean m15626n() {
            while (true) {
                int i2 = this.f26060q;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f26055g;
                this.f26060q = i2 - 1;
                E e2 = atomicReferenceArray.get(i2);
                this.f26062y = e2;
                if (e2 != null && (toq(e2) || m15627q())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public abstract T next();

        /* JADX INFO: renamed from: q */
        boolean m15627q() {
            E e2 = this.f26062y;
            if (e2 == null) {
                return false;
            }
            while (true) {
                this.f26062y = (E) e2.getNext();
                E e3 = this.f26062y;
                if (e3 == null) {
                    return false;
                }
                if (toq(e3)) {
                    return true;
                }
                e2 = this.f26062y;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26059p != null);
            dxef.this.remove(this.f26059p.getKey());
            this.f26059p = null;
        }

        boolean toq(E e2) {
            boolean z2;
            try {
                Object key = e2.getKey();
                Object liveValue = dxef.this.getLiveValue(e2);
                if (liveValue != null) {
                    this.f26061s = new oc(key, liveValue);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return z2;
            } finally {
                this.f26058n.postReadCleanup();
            }
        }

        dxef<K, V, E, S>.oc zy() {
            dxef<K, V, E, S>.oc ocVar = this.f26061s;
            if (ocVar == null) {
                throw new NoSuchElementException();
            }
            this.f26059p = ocVar;
            m15625k();
            return this.f26059p;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$t */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class C4347t<K> extends kja0<K, e5.EnumC4353k, wvg<K>, C4347t<K>> {
        private final ReferenceQueue<K> queueForKeys;

        C4347t(dxef<K, e5.EnumC4353k, wvg<K>, C4347t<K>> dxefVar, int i2, int i3) {
            super(dxefVar, i2, i3);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.dxef.kja0
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.dxef.kja0
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.dxef.kja0
        public C4347t<K> self() {
            return this;
        }

        @Override // com.google.common.collect.dxef.kja0
        public wvg<K> castForTesting(InterfaceC4344p<K, e5.EnumC4353k, ?> interfaceC4344p) {
            return (wvg) interfaceC4344p;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class t8r<K> extends kja0<K, e5.EnumC4353k, ki<K>, t8r<K>> {
        t8r(dxef<K, e5.EnumC4353k, ki<K>, t8r<K>> dxefVar, int i2, int i3) {
            super(dxefVar, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.dxef.kja0
        public t8r<K> self() {
            return this;
        }

        @Override // com.google.common.collect.dxef.kja0
        public ki<K> castForTesting(InterfaceC4344p<K, e5.EnumC4353k, ?> interfaceC4344p) {
            return (ki) interfaceC4344p;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class wvg<K> extends AbstractC4345q<K, e5.EnumC4353k, wvg<K>> implements fu4<K, e5.EnumC4353k, wvg<K>> {

        /* JADX INFO: renamed from: com.google.common.collect.dxef$wvg$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class C4348k<K> implements ld6<K, e5.EnumC4353k, wvg<K>, C4347t<K>> {

            /* JADX INFO: renamed from: k */
            private static final C4348k<?> f26063k = new C4348k<>();

            C4348k() {
            }

            /* JADX INFO: renamed from: y */
            static <K> C4348k<K> m15629y() {
                return (C4348k<K>) f26063k;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
            public wvg<K> mo15607k(C4347t<K> c4347t, wvg<K> wvgVar, @NullableDecl wvg<K> wvgVar2) {
                if (wvgVar.getKey() == null) {
                    return null;
                }
                return wvgVar.toq(((C4347t) c4347t).queueForKeys, wvgVar2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void zy(C4347t<K> c4347t, wvg<K> wvgVar, e5.EnumC4353k enumC4353k) {
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: n */
            public cdj mo15608n() {
                return cdj.WEAK;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public C4347t<K> mo15606g(dxef<K, e5.EnumC4353k, wvg<K>, C4347t<K>> dxefVar, int i2, int i3) {
                return new C4347t<>(dxefVar, i2, i3);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public wvg<K> mo15610q(C4347t<K> c4347t, K k2, int i2, @NullableDecl wvg<K> wvgVar) {
                return new wvg<>(((C4347t) c4347t).queueForKeys, k2, i2, wvgVar);
            }

            @Override // com.google.common.collect.dxef.ld6
            public cdj toq() {
                return cdj.STRONG;
            }
        }

        wvg(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl wvg<K> wvgVar) {
            super(referenceQueue, k2, i2, wvgVar);
        }

        /* JADX INFO: renamed from: q */
        void m15628q(e5.EnumC4353k enumC4353k) {
        }

        wvg<K> toq(ReferenceQueue<K> referenceQueue, wvg<K> wvgVar) {
            return new wvg<>(referenceQueue, getKey(), this.f26052k, wvgVar);
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public e5.EnumC4353k getValue() {
            return e5.EnumC4353k.VALUE;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class x2 extends dxef<K, V, E, S>.AbstractC4346s<K> {
        x2() {
            super();
        }

        @Override // com.google.common.collect.dxef.AbstractC4346s, java.util.Iterator
        public K next() {
            return zy().getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$y */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class C4349y extends n7h<Map.Entry<K, V>> {
        C4349y() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            dxef.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = dxef.this.get(key)) != null && dxef.this.valueEquivalence().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return dxef.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f7l8();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && dxef.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return dxef.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dxef$z */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class C4350z extends dxef<K, V, E, S>.AbstractC4346s<V> {
        C4350z() {
            super();
        }

        @Override // com.google.common.collect.dxef.AbstractC4346s, java.util.Iterator
        public V next() {
            return zy().getValue();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class zurt<K, V> extends zy<K, V, zurt<K, V>> implements jp0y<K, V, zurt<K, V>> {

        /* JADX INFO: renamed from: g */
        private volatile gvn7<K, V, zurt<K, V>> f26067g;

        /* JADX INFO: renamed from: com.google.common.collect.dxef$zurt$k */
        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class C4351k<K, V> implements ld6<K, V, zurt<K, V>, ni7<K, V>> {

            /* JADX INFO: renamed from: k */
            private static final C4351k<?, ?> f26068k = new C4351k<>();

            C4351k() {
            }

            /* JADX INFO: renamed from: y */
            static <K, V> C4351k<K, V> m15634y() {
                return (C4351k<K, V>) f26068k;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
            public zurt<K, V> mo15607k(ni7<K, V> ni7Var, zurt<K, V> zurtVar, @NullableDecl zurt<K, V> zurtVar2) {
                if (kja0.isCollected(zurtVar)) {
                    return null;
                }
                return zurtVar.m15633q(((ni7) ni7Var).queueForValues, zurtVar2);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void zy(ni7<K, V> ni7Var, zurt<K, V> zurtVar, V v2) {
                zurtVar.m15632n(v2, ((ni7) ni7Var).queueForValues);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: n */
            public cdj mo15608n() {
                return cdj.STRONG;
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public ni7<K, V> mo15606g(dxef<K, V, zurt<K, V>, ni7<K, V>> dxefVar, int i2, int i3) {
                return new ni7<>(dxefVar, i2, i3);
            }

            @Override // com.google.common.collect.dxef.ld6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public zurt<K, V> mo15610q(ni7<K, V> ni7Var, K k2, int i2, @NullableDecl zurt<K, V> zurtVar) {
                return new zurt<>(k2, i2, zurtVar);
            }

            @Override // com.google.common.collect.dxef.ld6
            public cdj toq() {
                return cdj.WEAK;
            }
        }

        zurt(K k2, int i2, @NullableDecl zurt<K, V> zurtVar) {
            super(k2, i2, zurtVar);
            this.f26067g = dxef.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public V getValue() {
            return this.f26067g.get();
        }

        @Override // com.google.common.collect.dxef.jp0y
        public gvn7<K, V, zurt<K, V>> getValueReference() {
            return this.f26067g;
        }

        @Override // com.google.common.collect.dxef.jp0y
        /* JADX INFO: renamed from: k */
        public void mo15602k() {
            this.f26067g.clear();
        }

        /* JADX INFO: renamed from: n */
        void m15632n(V v2, ReferenceQueue<V> referenceQueue) {
            gvn7<K, V, zurt<K, V>> gvn7Var = this.f26067g;
            this.f26067g = new d3(referenceQueue, v2, this);
            gvn7Var.clear();
        }

        /* JADX INFO: renamed from: q */
        zurt<K, V> m15633q(ReferenceQueue<V> referenceQueue, zurt<K, V> zurtVar) {
            zurt<K, V> zurtVar2 = new zurt<>(this.f26069k, this.f26071q, zurtVar);
            zurtVar2.f26067g = this.f26067g.mo15612k(referenceQueue, zurtVar2);
            return zurtVar2;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class zy<K, V, E extends InterfaceC4344p<K, V, E>> implements InterfaceC4344p<K, V, E> {

        /* JADX INFO: renamed from: k */
        final K f26069k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        final E f26070n;

        /* JADX INFO: renamed from: q */
        final int f26071q;

        zy(K k2, int i2, @NullableDecl E e2) {
            this.f26069k = k2;
            this.f26071q = i2;
            this.f26070n = e2;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public int getHash() {
            return this.f26071q;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public K getKey() {
            return this.f26069k;
        }

        @Override // com.google.common.collect.dxef.InterfaceC4344p
        public E getNext() {
            return this.f26070n;
        }
    }

    private dxef(e5 e5Var, ld6<K, V, E, S> ld6Var) {
        this.concurrencyLevel = Math.min(e5Var.toq(), 65536);
        this.keyEquivalence = e5Var.m15641q();
        this.entryHelper = ld6Var;
        int iMin = Math.min(e5Var.zy(), 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.concurrencyLevel) {
            i4++;
            i5 <<= 1;
        }
        this.segmentShift = 32 - i4;
        this.segmentMask = i5 - 1;
        this.segments = newSegmentArray(i5);
        int i6 = iMin / i5;
        while (i3 < (i5 * i6 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            kja0<K, V, E, S>[] kja0VarArr = this.segments;
            if (i2 >= kja0VarArr.length) {
                return;
            }
            kja0VarArr[i2] = createSegment(i3, -1);
            i2++;
        }
    }

    static <K, V> dxef<K, V, ? extends InterfaceC4344p<K, V, ?>, ?> create(e5 e5Var) {
        cdj cdjVarM15639n = e5Var.m15639n();
        cdj cdjVar = cdj.STRONG;
        if (cdjVarM15639n == cdjVar && e5Var.m15637g() == cdjVar) {
            return new dxef<>(e5Var, C4339i.k.m15614y());
        }
        if (e5Var.m15639n() == cdjVar && e5Var.m15637g() == cdj.WEAK) {
            return new dxef<>(e5Var, zurt.C4351k.m15634y());
        }
        cdj cdjVarM15639n2 = e5Var.m15639n();
        cdj cdjVar2 = cdj.WEAK;
        if (cdjVarM15639n2 == cdjVar2 && e5Var.m15637g() == cdjVar) {
            return new dxef<>(e5Var, mcp.C4342k.m15622y());
        }
        if (e5Var.m15639n() == cdjVar2 && e5Var.m15637g() == cdjVar2) {
            return new dxef<>(e5Var, a9.C4335k.m15605y());
        }
        throw new AssertionError();
    }

    static <K> dxef<K, e5.EnumC4353k, ? extends InterfaceC4344p<K, e5.EnumC4353k, ?>, ?> createWithDummyValues(e5 e5Var) {
        cdj cdjVarM15639n = e5Var.m15639n();
        cdj cdjVar = cdj.STRONG;
        if (cdjVarM15639n == cdjVar && e5Var.m15637g() == cdjVar) {
            return new dxef<>(e5Var, ki.C4341k.m15619y());
        }
        cdj cdjVarM15639n2 = e5Var.m15639n();
        cdj cdjVar2 = cdj.WEAK;
        if (cdjVarM15639n2 == cdjVar2 && e5Var.m15637g() == cdjVar) {
            return new dxef<>(e5Var, wvg.C4348k.m15629y());
        }
        if (e5Var.m15637g() == cdjVar2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static <E> ArrayList<E> m15601k(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        zwy.m16125k(arrayList, collection.iterator());
        return arrayList;
    }

    static int rehash(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    static <K, V, E extends InterfaceC4344p<K, V, E>> gvn7<K, V, E> unsetWeakValueReference() {
        return (gvn7<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (kja0<K, V, E, S> kja0Var : this.segments) {
            kja0Var.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        kja0<K, V, E, S>[] kja0VarArr = this.segments;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            int length = kja0VarArr.length;
            for (?? r10 = z2; r10 < length; r10++) {
                kja0<K, V, E, S> kja0Var = kja0VarArr[r10];
                int i3 = kja0Var.count;
                AtomicReferenceArray<E> atomicReferenceArray = kja0Var.table;
                for (?? r13 = z2; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        V liveValue = kja0Var.getLiveValue(next);
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j3 += (long) kja0Var.modCount;
                z2 = false;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            z2 = false;
        }
        return z2;
    }

    @InterfaceC7732q
    E copyEntry(E e2, E e3) {
        return (E) segmentFor(e2.getHash()).copyEntry(e2, e3);
    }

    kja0<K, V, E, S> createSegment(int i2, int i3) {
        return this.entryHelper.mo15606g(this, i2, i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C4349y c4349y = new C4349y();
        this.entrySet = c4349y;
        return c4349y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    E getEntry(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return (E) segmentFor(iHash).getEntry(obj, iHash);
    }

    V getLiveValue(E e2) {
        V v2;
        if (e2.getKey() == null || (v2 = (V) e2.getValue()) == null) {
            return null;
        }
        return v2;
    }

    int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        kja0<K, V, E, S>[] kja0VarArr = this.segments;
        long j2 = 0;
        for (int i2 = 0; i2 < kja0VarArr.length; i2++) {
            if (kja0VarArr[i2].count != 0) {
                return false;
            }
            j2 += (long) kja0VarArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < kja0VarArr.length; i3++) {
            if (kja0VarArr[i3].count != 0) {
                return false;
            }
            j2 -= (long) kja0VarArr[i3].modCount;
        }
        return j2 == 0;
    }

    @InterfaceC7732q
    boolean isLiveForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
        return segmentFor(interfaceC4344p.getHash()).getLiveValueForTesting(interfaceC4344p) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        qrj qrjVar = new qrj();
        this.keySet = qrjVar;
        return qrjVar;
    }

    @InterfaceC7732q
    cdj keyStrength() {
        return this.entryHelper.mo15608n();
    }

    final kja0<K, V, E, S>[] newSegmentArray(int i2) {
        return new kja0[i2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k2, V v2) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v2);
        int iHash = hash(k2);
        return segmentFor(iHash).put(k2, iHash, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k2, V v2) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v2);
        int iHash = hash(k2);
        return segmentFor(iHash).put(k2, iHash, v2, true);
    }

    void reclaimKey(E e2) {
        int hash = e2.getHash();
        segmentFor(hash).reclaimKey(e2, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void reclaimValue(gvn7<K, V, E> gvn7Var) {
        InterfaceC4344p qVar = gvn7Var.toq();
        int hash = qVar.getHash();
        segmentFor(hash).reclaimValue(qVar.getKey(), hash, gvn7Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k2, @NullableDecl V v2, V v3) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v3);
        if (v2 == null) {
            return false;
        }
        int iHash = hash(k2);
        return segmentFor(iHash).replace(k2, iHash, v2, v3);
    }

    kja0<K, V, E, S> segmentFor(int i2) {
        return this.segments[(i2 >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (kja0<K, V, E, S> kja0Var : this.segments) {
            j2 += (long) kja0Var.count;
        }
        return C4746s.fu4(j2);
    }

    @InterfaceC7732q
    com.google.common.base.x2<Object> valueEquivalence() {
        return this.entryHelper.toq().defaultEquivalence();
    }

    @InterfaceC7732q
    cdj valueStrength() {
        return this.entryHelper.toq();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        o1t o1tVar = new o1t();
        this.values = o1tVar;
        return o1tVar;
    }

    Object writeReplace() {
        return new C4338h(this.entryHelper.mo15608n(), this.entryHelper.toq(), this.keyEquivalence, this.entryHelper.toq().defaultEquivalence(), this.concurrencyLevel, this);
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class toq<K, V> extends ch<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient ConcurrentMap<K, V> delegate;
        final com.google.common.base.x2<Object> keyEquivalence;
        final cdj keyStrength;
        final com.google.common.base.x2<Object> valueEquivalence;
        final cdj valueStrength;

        toq(cdj cdjVar, cdj cdjVar2, com.google.common.base.x2<Object> x2Var, com.google.common.base.x2<Object> x2Var2, int i2, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = cdjVar;
            this.valueStrength = cdjVar2;
            this.keyEquivalence = x2Var;
            this.valueEquivalence = x2Var2;
            this.concurrencyLevel = i2;
            this.delegate = concurrentMap;
        }

        void readEntries(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.delegate.put((K) object, (V) objectInputStream.readObject());
            }
        }

        e5 readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            return new e5().f7l8(objectInputStream.readInt()).m15640p(this.keyStrength).ld6(this.valueStrength).m15643y(this.keyEquivalence).m15638k(this.concurrencyLevel);
        }

        void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ch, com.google.common.collect.xwq3, com.google.common.collect.qkj8
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k2, V v2) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(v2);
        int iHash = hash(k2);
        return segmentFor(iHash).replace(k2, iHash, v2);
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class kja0<K, V, E extends InterfaceC4344p<K, V, E>, S extends kja0<K, V, E, S>> extends ReentrantLock {
        volatile int count;

        @Weak
        final dxef<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();

        @MonotonicNonNullDecl
        volatile AtomicReferenceArray<E> table;
        int threshold;

        kja0(dxef<K, V, E, S> dxefVar, int i2, int i3) {
            this.map = dxefVar;
            this.maxSegmentSize = i3;
            initTable(newEntryArray(i2));
        }

        static <K, V, E extends InterfaceC4344p<K, V, E>> boolean isCollected(E e2) {
            return e2.getValue() == null;
        }

        abstract E castForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p);

        void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @CanIgnoreReturnValue
        boolean clearValueForTesting(K k2, int i2, gvn7<K, V, ? extends InterfaceC4344p<K, V, ?>> gvn7Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e2; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        if (((jp0y) next).getValueReference() != gvn7Var) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) removeFromChain(e2, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean containsKey(Object obj, int i2) {
            try {
                boolean z2 = false;
                if (this.count == 0) {
                    return false;
                }
                InterfaceC4344p liveEntry = getLiveEntry(obj, i2);
                if (liveEntry != null) {
                    if (liveEntry.getValue() != null) {
                        z2 = true;
                    }
                }
                return z2;
            } finally {
                postReadCleanup();
            }
        }

        @InterfaceC7732q
        boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        for (E next = atomicReferenceArray.get(i2); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next);
                            if (liveValue != null && this.map.valueEquivalence().equivalent(obj, liveValue)) {
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

        E copyEntry(E e2, E e3) {
            return (E) this.map.entryHelper.mo15607k(self(), e2, e3);
        }

        E copyForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, @NullableDecl InterfaceC4344p<K, V, ?> interfaceC4344p2) {
            return (E) this.map.entryHelper.mo15607k(self(), castForTesting(interfaceC4344p), castForTesting(interfaceC4344p2));
        }

        @GuardedBy("this")
        void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i2 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((InterfaceC4344p) referencePoll);
                i2++;
            } while (i2 != 16);
        }

        @GuardedBy("this")
        void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i2 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((gvn7) referencePoll);
                i2++;
            } while (i2 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.count;
            AtomicReferenceArray<E> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                E next = atomicReferenceArray.get(i3);
                if (next != null) {
                    InterfaceC4344p next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InterfaceC4344p interfaceC4344p = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC4344p = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, interfaceC4344p);
                        while (next != interfaceC4344p) {
                            int hash3 = next.getHash() & length2;
                            InterfaceC4344p interfaceC4344pCopyEntry = copyEntry(next, (InterfaceC4344p) atomicReferenceArrayNewEntryArray.get(hash3));
                            if (interfaceC4344pCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, interfaceC4344pCopyEntry);
                            } else {
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

        V get(Object obj, int i2) {
            try {
                InterfaceC4344p liveEntry = getLiveEntry(obj, i2);
                if (liveEntry == null) {
                    return null;
                }
                V v2 = (V) liveEntry.getValue();
                if (v2 == null) {
                    tryDrainReferenceQueues();
                }
                return v2;
            } finally {
                postReadCleanup();
            }
        }

        E getEntry(Object obj, int i2) {
            if (this.count == 0) {
                return null;
            }
            for (E e2 = (E) getFirst(i2); e2 != null; e2 = (E) e2.getNext()) {
                if (e2.getHash() == i2) {
                    Object key = e2.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return e2;
                    }
                }
            }
            return null;
        }

        E getFirst(int i2) {
            return this.table.get(i2 & (r0.length() - 1));
        }

        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        E getLiveEntry(Object obj, int i2) {
            return (E) getEntry(obj, i2);
        }

        @NullableDecl
        V getLiveValue(E e2) {
            if (e2.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v2 = (V) e2.getValue();
            if (v2 != null) {
                return v2;
            }
            tryDrainReferenceQueues();
            return null;
        }

        @NullableDecl
        V getLiveValueForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return getLiveValue(castForTesting(interfaceC4344p));
        }

        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        gvn7<K, V, E> getWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            throw new AssertionError();
        }

        void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        void maybeClearReferenceQueues() {
        }

        @GuardedBy("this")
        void maybeDrainReferenceQueues() {
        }

        AtomicReferenceArray<E> newEntryArray(int i2) {
            return new AtomicReferenceArray<>(i2);
        }

        E newEntryForTesting(K k2, int i2, @NullableDecl InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return (E) this.map.entryHelper.mo15610q(self(), k2, i2, castForTesting(interfaceC4344p));
        }

        gvn7<K, V, E> newWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, V v2) {
            throw new AssertionError();
        }

        void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        @GuardedBy("this")
        void preWriteCleanup() {
            runLockedCleanup();
        }

        V put(K k2, int i2, V v2, boolean z2) {
            lock();
            try {
                preWriteCleanup();
                int i3 = this.count + 1;
                if (i3 > this.threshold) {
                    expand();
                    i3 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e2; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        V v3 = (V) next.getValue();
                        if (v3 == null) {
                            this.modCount++;
                            setValue(next, v2);
                            this.count = this.count;
                            return null;
                        }
                        if (z2) {
                            return v3;
                        }
                        this.modCount++;
                        setValue(next, v2);
                        return v3;
                    }
                }
                this.modCount++;
                InterfaceC4344p interfaceC4344pMo15610q = this.map.entryHelper.mo15610q(self(), k2, i2, e2);
                setValue(interfaceC4344pMo15610q, v2);
                atomicReferenceArray.set(length, (E) interfaceC4344pMo15610q);
                this.count = i3;
                return null;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        boolean reclaimKey(E e2, int i2) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                E e3 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e3; next != null; next = next.getNext()) {
                    if (next == e2) {
                        this.modCount++;
                        InterfaceC4344p interfaceC4344pRemoveFromChain = removeFromChain(e3, next);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC4344pRemoveFromChain);
                        this.count = i3;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        boolean reclaimValue(K k2, int i2, gvn7<K, V, E> gvn7Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e2; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        if (((jp0y) next).getValueReference() != gvn7Var) {
                            return false;
                        }
                        this.modCount++;
                        InterfaceC4344p interfaceC4344pRemoveFromChain = removeFromChain(e2, next);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC4344pRemoveFromChain);
                        this.count = i3;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        V remove(Object obj, int i2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e2; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null && !isCollected(next)) {
                            return null;
                        }
                        this.modCount++;
                        InterfaceC4344p interfaceC4344pRemoveFromChain = removeFromChain(e2, next);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC4344pRemoveFromChain);
                        this.count = i3;
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        @GuardedBy("this")
        boolean removeEntryForTesting(E e2) {
            int hash = e2.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e3 = atomicReferenceArray.get(length);
            for (InterfaceC4344p next = e3; next != null; next = next.getNext()) {
                if (next == e2) {
                    this.modCount++;
                    InterfaceC4344p interfaceC4344pRemoveFromChain = removeFromChain(e3, next);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, (E) interfaceC4344pRemoveFromChain);
                    this.count = i2;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        E removeFromChain(E e2, E e3) {
            int i2 = this.count;
            E e4 = (E) e3.getNext();
            while (e2 != e3) {
                InterfaceC4344p interfaceC4344pCopyEntry = copyEntry(e2, e4);
                if (interfaceC4344pCopyEntry != null) {
                    e4 = (E) interfaceC4344pCopyEntry;
                } else {
                    i2--;
                }
                e2 = (E) e2.getNext();
            }
            this.count = i2;
            return e4;
        }

        E removeFromChainForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, InterfaceC4344p<K, V, ?> interfaceC4344p2) {
            return (E) removeFromChain(castForTesting(interfaceC4344p), castForTesting(interfaceC4344p2));
        }

        @CanIgnoreReturnValue
        boolean removeTableEntryForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p) {
            return removeEntryForTesting(castForTesting(interfaceC4344p));
        }

        boolean replace(K k2, int i2, V v2, V v3) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e2; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.map.valueEquivalence().equivalent(v2, value)) {
                                return false;
                            }
                            this.modCount++;
                            setValue(next, v3);
                            return true;
                        }
                        if (isCollected(next)) {
                            this.modCount++;
                            InterfaceC4344p interfaceC4344pRemoveFromChain = removeFromChain(e2, next);
                            int i3 = this.count - 1;
                            atomicReferenceArray.set(length, (E) interfaceC4344pRemoveFromChain);
                            this.count = i3;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void runCleanup() {
            runLockedCleanup();
        }

        void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S self();

        void setTableEntryForTesting(int i2, InterfaceC4344p<K, V, ?> interfaceC4344p) {
            this.table.set(i2, (E) castForTesting(interfaceC4344p));
        }

        void setValue(E e2, V v2) {
            this.map.entryHelper.zy(self(), e2, v2);
        }

        void setValueForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, V v2) {
            this.map.entryHelper.zy(self(), castForTesting(interfaceC4344p), v2);
        }

        void setWeakValueReferenceForTesting(InterfaceC4344p<K, V, ?> interfaceC4344p, gvn7<K, V, ? extends InterfaceC4344p<K, V, ?>> gvn7Var) {
            throw new AssertionError();
        }

        void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.map.valueEquivalence().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (isCollected(r4) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.modCount++;
            r9 = removeFromChain(r3, r4);
            r10 = r8.count - 1;
            r0.set(r1, (E) r9);
            r8.count = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean remove(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.preWriteCleanup()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.dxef$p<K, V, E>> r0 = r8.table     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.dxef$p r3 = (com.google.common.collect.dxef.InterfaceC4344p) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                com.google.common.collect.dxef<K, V, E extends com.google.common.collect.dxef$p<K, V, E>, S extends com.google.common.collect.dxef$kja0<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L69
                com.google.common.base.x2<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.dxef<K, V, E extends com.google.common.collect.dxef$p<K, V, E>, S extends com.google.common.collect.dxef$kja0<K, V, E, S>> r10 = r8.map     // Catch: java.lang.Throwable -> L69
                com.google.common.base.x2 r10 = r10.valueEquivalence()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = isCollected(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.dxef$p r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.count     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.count = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                com.google.common.collect.dxef$p r4 = r4.getNext()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.dxef.kja0.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        V replace(K k2, int i2, V v2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4344p next = e2; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i2 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        V v3 = (V) next.getValue();
                        if (v3 == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                InterfaceC4344p interfaceC4344pRemoveFromChain = removeFromChain(e2, next);
                                int i3 = this.count - 1;
                                atomicReferenceArray.set(length, (E) interfaceC4344pRemoveFromChain);
                                this.count = i3;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(next, v2);
                        return v3;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }
}
