package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6308r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.collections.q */
/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
@kotlin.yz(version = "1.1")
public abstract class AbstractC6160q<K, V> implements Map<K, V>, InterfaceC7625k {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final k f36187n = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private volatile Set<? extends K> f36188k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private volatile Collection<? extends V> f36189q;

    /* JADX INFO: renamed from: kotlin.collections.q$k */
    /* JADX INFO: compiled from: AbstractMap.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final boolean m22600k(@InterfaceC7396q Map.Entry<?, ?> e2, @InterfaceC7395n Object obj) {
            kotlin.jvm.internal.d2ok.m23075h(e2, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return kotlin.jvm.internal.d2ok.f7l8(e2.getKey(), entry.getKey()) && kotlin.jvm.internal.d2ok.f7l8(e2.getValue(), entry.getValue());
        }

        public final int toq(@InterfaceC7396q Map.Entry<?, ?> e2) {
            kotlin.jvm.internal.d2ok.m23075h(e2, "e");
            Object key = e2.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = e2.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @InterfaceC7396q
        public final String zy(@InterfaceC7396q Map.Entry<?, ?> e2) {
            kotlin.jvm.internal.d2ok.m23075h(e2, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(e2.getKey());
            sb.append('=');
            sb.append(e2.getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$q */
    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class q extends AbstractC6147k<V> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC6160q<K, V> f36190k;

        /* JADX INFO: renamed from: kotlin.collections.q$q$k */
        /* JADX INFO: compiled from: AbstractMap.kt */
        public static final class k implements Iterator<V>, InterfaceC7625k {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f36191k;

            /* JADX WARN: Multi-variable type inference failed */
            k(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f36191k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f36191k.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f36191k.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        q(AbstractC6160q<K, ? extends V> abstractC6160q) {
            this.f36190k = abstractC6160q;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean contains(Object obj) {
            return this.f36190k.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36190k.size();
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
        @InterfaceC7396q
        public Iterator<V> iterator() {
            return new k(this.f36190k.entrySet().iterator());
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$toq */
    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class toq extends AbstractC6162s<K> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AbstractC6160q<K, V> f36192q;

        /* JADX INFO: renamed from: kotlin.collections.q$toq$k */
        /* JADX INFO: compiled from: AbstractMap.kt */
        public static final class k implements Iterator<K>, InterfaceC7625k {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f36193k;

            /* JADX WARN: Multi-variable type inference failed */
            k(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f36193k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f36193k.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f36193k.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        toq(AbstractC6160q<K, ? extends V> abstractC6160q) {
            this.f36192q = abstractC6160q;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean contains(Object obj) {
            return this.f36192q.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36192q.size();
        }

        @Override // kotlin.collections.AbstractC6162s, kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
        @InterfaceC7396q
        public Iterator<K> iterator() {
            return new k(this.f36192q.entrySet().iterator());
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$zy */
    /* JADX INFO: compiled from: AbstractMap.kt */
    static final class zy extends AbstractC6308r implements cyoe.x2<Map.Entry<? extends K, ? extends V>, CharSequence> {
        final /* synthetic */ AbstractC6160q<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(AbstractC6160q<K, ? extends V> abstractC6160q) {
            super(1);
            this.this$0 = abstractC6160q;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final CharSequence invoke(@InterfaceC7396q Map.Entry<? extends K, ? extends V> it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return this.this$0.x2(it);
        }
    }

    protected AbstractC6160q() {
    }

    private final String ld6(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: p */
    private final Map.Entry<K, V> m22597p(K k2) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.d2ok.f7l8(((Map.Entry) next).getKey(), k2)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String x2(Map.Entry<? extends K, ? extends V> entry) {
        return ld6(entry.getKey()) + '=' + ld6(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m22597p(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.d2ok.f7l8(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return zy();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!toq((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int f7l8() {
        return entrySet().size();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public Set<K> m22598g() {
        if (this.f36188k == null) {
            this.f36188k = new toq(this);
        }
        Set<? extends K> set = this.f36188k;
        kotlin.jvm.internal.d2ok.qrj(set);
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @InterfaceC7395n
    public V get(Object obj) {
        Map.Entry<K, V> entryM22597p = m22597p(obj);
        if (entryM22597p != null) {
            return entryM22597p.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m22598g();
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
        return f7l8();
    }

    @InterfaceC7396q
    public String toString() {
        return a9.uo(entrySet(), ", ", "{", "}", 0, null, new zy(this), 24, null);
    }

    public final boolean toq(@InterfaceC7395n Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.d2ok.n7h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v2 = get(key);
        if (!kotlin.jvm.internal.d2ok.f7l8(value, v2)) {
            return false;
        }
        if (v2 != null) {
            return true;
        }
        kotlin.jvm.internal.d2ok.n7h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m22599y();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public Collection<V> m22599y() {
        if (this.f36189q == null) {
            this.f36189q = new q(this);
        }
        Collection<? extends V> collection = this.f36189q;
        kotlin.jvm.internal.d2ok.qrj(collection);
        return collection;
    }

    public abstract Set zy();
}
