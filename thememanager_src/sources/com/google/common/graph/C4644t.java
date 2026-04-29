package com.google.common.graph;

import com.google.common.base.C4280z;
import com.google.common.collect.nsb;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.graph.t */
/* JADX INFO: compiled from: Graphs.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class C4644t {

    /* JADX INFO: renamed from: com.google.common.graph.t$k */
    /* JADX INFO: compiled from: Graphs.java */
    private enum k {
        PENDING,
        COMPLETE
    }

    /* JADX INFO: renamed from: com.google.common.graph.t$q */
    /* JADX INFO: compiled from: Graphs.java */
    private static class q<N, V> extends ni7<N, V> {

        /* JADX INFO: renamed from: k */
        private final InterfaceC4618f<N, V> f26959k;

        q(InterfaceC4618f<N, V> interfaceC4618f) {
            this.f26959k = interfaceC4618f;
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: g */
        public boolean mo16190g(t8r<N> t8rVar) {
            return ncyb().mo16190g(C4644t.cdj(t8rVar));
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.InterfaceC4618f
        @NullableDecl
        /* JADX INFO: renamed from: i */
        public V mo16191i(t8r<N> t8rVar, @NullableDecl V v2) {
            return ncyb().mo16191i(C4644t.cdj(t8rVar), v2);
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        public int n7h(N n2) {
            return ncyb().mo16213s(n2);
        }

        @Override // com.google.common.graph.ni7
        protected InterfaceC4618f<N, V> ncyb() {
            return this.f26959k;
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: q */
        public boolean mo16195q(N n2, N n3) {
            return ncyb().mo16195q(n3, n2);
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        /* JADX INFO: renamed from: s */
        public int mo16213s(N n2) {
            return ncyb().n7h(n2);
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.InterfaceC4618f
        @NullableDecl
        /* JADX INFO: renamed from: z */
        public V mo16197z(N n2, N n3, @NullableDecl V v2) {
            return ncyb().mo16197z(n3, n2, v2);
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: k */
        public Set<N> mo16192k(N n2) {
            return ncyb().toq((Object) n2);
        }

        @Override // com.google.common.graph.ni7, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
        public Set<N> toq(N n2) {
            return ncyb().mo16192k((Object) n2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.t$toq */
    /* JADX INFO: compiled from: Graphs.java */
    private static class toq<N> extends fn3e<N> {

        /* JADX INFO: renamed from: k */
        private final fu4<N> f26960k;

        toq(fu4<N> fu4Var) {
            this.f26960k = fu4Var;
        }

        @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: g */
        public boolean mo16190g(t8r<N> t8rVar) {
            return x9kr().mo16190g(C4644t.cdj(t8rVar));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.graph.fn3e
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public fu4<N> x9kr() {
            return this.f26960k;
        }

        @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        public int n7h(N n2) {
            return x9kr().mo16213s(n2);
        }

        @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: q */
        public boolean mo16195q(N n2, N n3) {
            return x9kr().mo16195q(n3, n2);
        }

        @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        /* JADX INFO: renamed from: s */
        public int mo16213s(N n2) {
            return x9kr().n7h(n2);
        }

        @Override // com.google.common.graph.fn3e, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: k */
        public Set<N> mo16192k(N n2) {
            return x9kr().toq((Object) n2);
        }

        @Override // com.google.common.graph.fn3e, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
        public Set<N> toq(N n2) {
            return x9kr().mo16192k((Object) n2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.t$zy */
    /* JADX INFO: compiled from: Graphs.java */
    private static class zy<N, E> extends zurt<N, E> {

        /* JADX INFO: renamed from: k */
        private final d2ok<N, E> f26961k;

        zy(d2ok<N, E> d2okVar) {
            this.f26961k = d2okVar;
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.d2ok
        public t8r<N> a9(E e2) {
            t8r<N> t8rVarA9 = ncyb().a9(e2);
            return t8r.m16306y(this.f26961k, t8rVarA9.m16307g(), t8rVarA9.m16309n());
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.d2ok
        public Set<E> fn3e(N n2) {
            return ncyb().oc(n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        /* JADX INFO: renamed from: g */
        public boolean mo16204g(t8r<N> t8rVar) {
            return ncyb().mo16204g(C4644t.cdj(t8rVar));
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        public E gvn7(t8r<N> t8rVar) {
            return ncyb().gvn7(C4644t.cdj(t8rVar));
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        public E jk(N n2, N n3) {
            return ncyb().jk(n3, n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        public Set<E> mcp(t8r<N> t8rVar) {
            return ncyb().mcp(C4644t.cdj(t8rVar));
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        public int n7h(N n2) {
            return ncyb().mo16208s(n2);
        }

        @Override // com.google.common.graph.zurt
        protected d2ok<N, E> ncyb() {
            return this.f26961k;
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        public Set<E> ni7(N n2, N n3) {
            return ncyb().ni7(n3, n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.d2ok
        public Set<E> oc(N n2) {
            return ncyb().fn3e(n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        /* JADX INFO: renamed from: q */
        public boolean mo16207q(N n2, N n3) {
            return ncyb().mo16207q(n3, n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
        /* JADX INFO: renamed from: s */
        public int mo16208s(N n2) {
            return ncyb().n7h(n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: k */
        public Set<N> mo16192k(N n2) {
            return ncyb().toq((Object) n2);
        }

        @Override // com.google.common.graph.zurt, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
        public Set<N> toq(N n2) {
            return ncyb().mo16192k((Object) n2);
        }
    }

    private C4644t() {
    }

    static <N> t8r<N> cdj(t8r<N> t8rVar) {
        return t8rVar.toq() ? t8r.m16305s(t8rVar.ld6(), t8rVar.mo16310p()) : t8rVar;
    }

    public static <N, E> oc<N, E> f7l8(d2ok<N, E> d2okVar) {
        oc<N, E> ocVar = (oc<N, E>) lvui.m16262s(d2okVar).m16266y(d2okVar.qrj().size()).f7l8(d2okVar.zy().size()).zy();
        Iterator<N> it = d2okVar.qrj().iterator();
        while (it.hasNext()) {
            ocVar.mo16289h(it.next());
        }
        for (E e2 : d2okVar.zy()) {
            t8r<N> t8rVarA9 = d2okVar.a9(e2);
            ocVar.d2ok(t8rVarA9.m16309n(), t8rVarA9.m16307g(), e2);
        }
        return ocVar;
    }

    /* JADX INFO: renamed from: g */
    public static <N> d3<N> m16293g(fu4<N> fu4Var) {
        d3<N> d3Var = (d3<N>) C4649z.m16313g(fu4Var).m16317n(fu4Var.qrj().size()).toq();
        Iterator<N> it = fu4Var.qrj().iterator();
        while (it.hasNext()) {
            d3Var.mo16210h(it.next());
        }
        for (t8r<N> t8rVar : fu4Var.zy()) {
            d3Var.fti(t8rVar.m16309n(), t8rVar.m16307g());
        }
        return d3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static <N> fu4<N> m16294h(fu4<N> fu4Var) {
        C4643s qVar = C4649z.m16313g(fu4Var).m16316k(true).toq();
        if (fu4Var.mo16193n()) {
            for (N n2 : fu4Var.qrj()) {
                Iterator it = n7h(fu4Var, n2).iterator();
                while (it.hasNext()) {
                    qVar.fti(n2, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n3 : fu4Var.qrj()) {
                if (!hashSet.contains(n3)) {
                    Set setN7h = n7h(fu4Var, n3);
                    hashSet.addAll(setN7h);
                    int i2 = 1;
                    for (Object obj : setN7h) {
                        int i3 = i2 + 1;
                        Iterator it2 = nsb.jk(setN7h, i2).iterator();
                        while (it2.hasNext()) {
                            qVar.fti(obj, it2.next());
                        }
                        i2 = i3;
                    }
                }
            }
        }
        return qVar;
    }

    /* JADX INFO: renamed from: i */
    public static <N, V> InterfaceC4618f<N, V> m16295i(InterfaceC4618f<N, V> interfaceC4618f) {
        return !interfaceC4618f.mo16193n() ? interfaceC4618f : interfaceC4618f instanceof q ? ((q) interfaceC4618f).f26959k : new q(interfaceC4618f);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m16296k(fu4<?> fu4Var, Object obj, @NullableDecl Object obj2) {
        return fu4Var.mo16193n() || !C4280z.m15455k(obj2, obj);
    }

    public static <N> fu4<N> ki(fu4<N> fu4Var) {
        return !fu4Var.mo16193n() ? fu4Var : fu4Var instanceof toq ? ((toq) fu4Var).f26960k : new toq(fu4Var);
    }

    private static <N> boolean kja0(fu4<N> fu4Var, Map<Object, k> map, N n2, @NullableDecl N n3) {
        k kVar = map.get(n2);
        if (kVar == k.COMPLETE) {
            return false;
        }
        k kVar2 = k.PENDING;
        if (kVar == kVar2) {
            return true;
        }
        map.put(n2, kVar2);
        for (N n4 : fu4Var.toq((Object) n2)) {
            if (m16296k(fu4Var, n4, n3) && kja0(fu4Var, map, n4, n2)) {
                return true;
            }
        }
        map.put(n2, k.COMPLETE);
        return false;
    }

    public static <N> d3<N> ld6(fu4<N> fu4Var, Iterable<? extends N> iterable) {
        C4643s c4643s = iterable instanceof Collection ? (d3<N>) C4649z.m16313g(fu4Var).m16317n(((Collection) iterable).size()).toq() : (d3<N>) C4649z.m16313g(fu4Var).toq();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            c4643s.mo16210h(it.next());
        }
        for (N n2 : c4643s.qrj()) {
            for (N n3 : fu4Var.toq((Object) n2)) {
                if (c4643s.qrj().contains(n3)) {
                    c4643s.fti(n2, n3);
                }
            }
        }
        return c4643s;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    static long m16297n(long j2) {
        com.google.common.base.jk.m15374h(j2 > 0, "Not true that %s is positive.", j2);
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> Set<N> n7h(fu4<N> fu4Var, N n2) {
        com.google.common.base.jk.fn3e(fu4Var.qrj().contains(n2), "Node %s is not an element of this graph.", n2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        linkedHashSet.add(n2);
        arrayDeque.add(n2);
        while (!arrayDeque.isEmpty()) {
            for (Object obj : fu4Var.toq(arrayDeque.remove())) {
                if (linkedHashSet.add(obj)) {
                    arrayDeque.add(obj);
                }
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m16298p(d2ok<?, ?> d2okVar) {
        if (d2okVar.mo16205n() || !d2okVar.fu4() || d2okVar.zy().size() <= d2okVar.t8r().zy().size()) {
            return m16300s(d2okVar.t8r());
        }
        return true;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    static int m16299q(int i2) {
        com.google.common.base.jk.ld6(i2 > 0, "Not true that %s is positive.", i2);
        return i2;
    }

    public static <N, V> eqxt<N, V> qrj(InterfaceC4618f<N, V> interfaceC4618f, Iterable<? extends N> iterable) {
        ld6 ld6Var = iterable instanceof Collection ? (eqxt<N, V>) C4617c.m16198g(interfaceC4618f).m16202n(((Collection) iterable).size()).toq() : (eqxt<N, V>) C4617c.m16198g(interfaceC4618f).toq();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            ld6Var.mo16211h(it.next());
        }
        for (N n2 : ld6Var.qrj()) {
            for (N n3 : interfaceC4618f.toq((Object) n2)) {
                if (ld6Var.qrj().contains(n3)) {
                    ld6Var.eqxt(n2, n3, interfaceC4618f.mo16197z(n2, n3, null));
                }
            }
        }
        return ld6Var;
    }

    /* JADX INFO: renamed from: s */
    public static <N> boolean m16300s(fu4<N> fu4Var) {
        int size = fu4Var.zy().size();
        if (size == 0) {
            return false;
        }
        if (!fu4Var.mo16193n() && size >= fu4Var.qrj().size()) {
            return true;
        }
        HashMap mapNn86 = vy.nn86(fu4Var.qrj().size());
        Iterator<N> it = fu4Var.qrj().iterator();
        while (it.hasNext()) {
            if (kja0(fu4Var, mapNn86, it.next(), null)) {
                return true;
            }
        }
        return false;
    }

    public static <N, E> d2ok<N, E> t8r(d2ok<N, E> d2okVar) {
        return !d2okVar.mo16205n() ? d2okVar : d2okVar instanceof zy ? ((zy) d2okVar).f26961k : new zy(d2okVar);
    }

    @CanIgnoreReturnValue
    static int toq(int i2) {
        com.google.common.base.jk.ld6(i2 >= 0, "Not true that %s is non-negative.", i2);
        return i2;
    }

    public static <N, E> oc<N, E> x2(d2ok<N, E> d2okVar, Iterable<? extends N> iterable) {
        C4640p c4640p = iterable instanceof Collection ? (oc<N, E>) lvui.m16262s(d2okVar).m16266y(((Collection) iterable).size()).zy() : (oc<N, E>) lvui.m16262s(d2okVar).zy();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            c4640p.mo16289h(it.next());
        }
        for (E e2 : c4640p.qrj()) {
            for (E e3 : d2okVar.fn3e(e2)) {
                N nM16308k = d2okVar.a9(e3).m16308k(e2);
                if (c4640p.qrj().contains(nM16308k)) {
                    c4640p.d2ok(e2, nM16308k, e3);
                }
            }
        }
        return c4640p;
    }

    /* JADX INFO: renamed from: y */
    public static <N, V> eqxt<N, V> m16301y(InterfaceC4618f<N, V> interfaceC4618f) {
        eqxt<N, V> eqxtVar = (eqxt<N, V>) C4617c.m16198g(interfaceC4618f).m16202n(interfaceC4618f.qrj().size()).toq();
        Iterator<N> it = interfaceC4618f.qrj().iterator();
        while (it.hasNext()) {
            eqxtVar.mo16211h(it.next());
        }
        for (t8r<N> t8rVar : interfaceC4618f.zy()) {
            eqxtVar.eqxt(t8rVar.m16309n(), t8rVar.m16307g(), interfaceC4618f.mo16197z(t8rVar.m16309n(), t8rVar.m16307g(), null));
        }
        return eqxtVar;
    }

    @CanIgnoreReturnValue
    static long zy(long j2) {
        com.google.common.base.jk.m15374h(j2 >= 0, "Not true that %s is non-negative.", j2);
        return j2;
    }
}
