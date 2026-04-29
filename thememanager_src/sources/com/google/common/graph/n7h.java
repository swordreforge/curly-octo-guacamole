package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.common.collect.zkd;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: DirectedGraphConnections.java */
/* JADX INFO: loaded from: classes2.dex */
final class n7h<N, V> implements o1t<N, V> {

    /* JADX INFO: renamed from: q */
    private static final Object f26913q = new Object();

    /* JADX INFO: renamed from: k */
    private final Map<N, Object> f26914k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f68273toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f68274zy;

    /* JADX INFO: renamed from: com.google.common.graph.n7h$k */
    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    class C4633k extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.n7h$k$k */
        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        class k extends com.google.common.collect.zy<N> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26917n;

            k(Iterator it) {
                this.f26917n = it;
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected N mo15703k() {
                while (this.f26917n.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f26917n.next();
                    if (n7h.n7h(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return toq();
            }
        }

        C4633k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return n7h.n7h(n7h.this.f26914k.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ab<N> iterator() {
            return new k(n7h.this.f26914k.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n7h.this.f68273toq;
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    class toq extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.n7h$toq$k */
        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        class C4634k extends com.google.common.collect.zy<N> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26920n;

            C4634k(Iterator it) {
                this.f26920n = it;
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected N mo15703k() {
                while (this.f26920n.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f26920n.next();
                    if (n7h.kja0(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return toq();
            }
        }

        toq() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return n7h.kja0(n7h.this.f26914k.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ab<N> iterator() {
            return new C4634k(n7h.this.f26914k.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n7h.this.f68274zy;
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    private static final class zy {

        /* JADX INFO: renamed from: k */
        private final Object f26921k;

        zy(Object obj) {
            this.f26921k = obj;
        }
    }

    private n7h(Map<N, Object> map, int i2, int i3) {
        this.f26914k = (Map) com.google.common.base.jk.a9(map);
        this.f68273toq = C4644t.toq(i2);
        this.f68274zy = C4644t.toq(i3);
        com.google.common.base.jk.yz(i2 <= map.size() && i3 <= map.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> n7h<N, V> cdj(Set<N> set, Map<N, V> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        for (N n2 : set) {
            Object objPut = map2.put(n2, f26913q);
            if (objPut != null) {
                map2.put(n2, new zy(objPut));
            }
        }
        return new n7h<>(zkd.copyOf((Map) map2), set.size(), map.size());
    }

    /* JADX INFO: renamed from: h */
    static <N, V> n7h<N, V> m16272h() {
        return new n7h<>(new HashMap(4, 1.0f), 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean kja0(@NullableDecl Object obj) {
        return (obj == f26913q || obj == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n7h(@NullableDecl Object obj) {
        return obj == f26913q || (obj instanceof zy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.o1t
    public V f7l8(N n2, V v2) {
        V v3 = (V) this.f26914k.put(n2, v2);
        if (v3 == 0) {
            int i2 = this.f68274zy + 1;
            this.f68274zy = i2;
            C4644t.m16299q(i2);
            return null;
        }
        if (v3 instanceof zy) {
            this.f26914k.put(n2, new zy(v2));
            return (V) ((zy) v3).f26921k;
        }
        if (v3 != f26913q) {
            return v3;
        }
        this.f26914k.put(n2, new zy(v2));
        int i3 = this.f68274zy + 1;
        this.f68274zy = i3;
        C4644t.m16299q(i3);
        return null;
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: g */
    public void mo16253g(N n2) {
        Object obj = this.f26914k.get(n2);
        if (obj == f26913q) {
            this.f26914k.remove(n2);
            int i2 = this.f68273toq - 1;
            this.f68273toq = i2;
            C4644t.toq(i2);
            return;
        }
        if (obj instanceof zy) {
            this.f26914k.put(n2, ((zy) obj).f26921k);
            int i3 = this.f68273toq - 1;
            this.f68273toq = i3;
            C4644t.toq(i3);
        }
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: k */
    public Set<N> mo16254k() {
        return new toq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: n */
    public V mo16255n(Object obj) {
        Object obj2;
        V v2 = (V) this.f26914k.get(obj);
        if (v2 == 0 || v2 == (obj2 = f26913q)) {
            return null;
        }
        if (v2 instanceof zy) {
            this.f26914k.put(obj, obj2);
            int i2 = this.f68274zy - 1;
            this.f68274zy = i2;
            C4644t.toq(i2);
            return (V) ((zy) v2).f26921k;
        }
        this.f26914k.remove(obj);
        int i3 = this.f68274zy - 1;
        this.f68274zy = i3;
        C4644t.toq(i3);
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: q */
    public V mo16256q(N n2) {
        V v2 = (V) this.f26914k.get(n2);
        if (v2 == f26913q) {
            return null;
        }
        return v2 instanceof zy ? (V) ((zy) v2).f26921k : v2;
    }

    @Override // com.google.common.graph.o1t
    public Set<N> toq() {
        return new C4633k();
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: y */
    public void mo16257y(N n2, V v2) {
        Map<N, Object> map = this.f26914k;
        Object obj = f26913q;
        Object objPut = map.put(n2, obj);
        if (objPut == null) {
            int i2 = this.f68273toq + 1;
            this.f68273toq = i2;
            C4644t.m16299q(i2);
        } else if (objPut instanceof zy) {
            this.f26914k.put(n2, objPut);
        } else if (objPut != obj) {
            this.f26914k.put(n2, new zy(objPut));
            int i3 = this.f68273toq + 1;
            this.f68273toq = i3;
            C4644t.m16299q(i3);
        }
    }

    @Override // com.google.common.graph.o1t
    public Set<N> zy() {
        return Collections.unmodifiableSet(this.f26914k.keySet());
    }
}
