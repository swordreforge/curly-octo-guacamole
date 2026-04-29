package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.common.collect.nsb;
import com.google.common.collect.vep5;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Traverser.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class ncyb<N> {

    /* JADX INFO: renamed from: com.google.common.graph.ncyb$q */
    /* JADX INFO: compiled from: Traverser.java */
    private static final class C4636q<N> extends ncyb<N> {

        /* JADX INFO: renamed from: k */
        private final x9kr<N> f26922k;

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$g */
        /* JADX INFO: compiled from: Traverser.java */
        private final class g extends ab<N> {

            /* JADX INFO: renamed from: k */
            private final Deque<Iterator<? extends N>> f26923k;

            g(Iterable<? extends N> iterable) {
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f26923k = arrayDeque;
                arrayDeque.addLast(iterable.iterator());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f26923k.isEmpty();
            }

            @Override // java.util.Iterator
            public N next() {
                Iterator<? extends N> last = this.f26923k.getLast();
                N n2 = (N) com.google.common.base.jk.a9(last.next());
                if (!last.hasNext()) {
                    this.f26923k.removeLast();
                }
                Iterator<? extends N> it = C4636q.this.f26922k.toq(n2).iterator();
                if (it.hasNext()) {
                    this.f26923k.addLast(it);
                }
                return n2;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$k */
        /* JADX INFO: compiled from: Traverser.java */
        class k implements Iterable<N> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterable f26925k;

            k(Iterable iterable) {
                this.f26925k = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new q(this.f26925k);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$n */
        /* JADX INFO: compiled from: Traverser.java */
        private final class n extends com.google.common.collect.zy<N> {

            /* JADX INFO: renamed from: n */
            private final ArrayDeque<C4636q<N>.n.k> f26928n;

            /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$n$k */
            /* JADX INFO: compiled from: Traverser.java */
            private final class k {

                /* JADX INFO: renamed from: k */
                @NullableDecl
                final N f26929k;

                /* JADX INFO: renamed from: toq, reason: collision with root package name */
                final Iterator<? extends N> f68275toq;

                k(@NullableDecl N n2, Iterable<? extends N> iterable) {
                    this.f26929k = n2;
                    this.f68275toq = iterable.iterator();
                }
            }

            n(Iterable<? extends N> iterable) {
                ArrayDeque<C4636q<N>.n.k> arrayDeque = new ArrayDeque<>();
                this.f26928n = arrayDeque;
                arrayDeque.addLast(new k(null, iterable));
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected N mo15703k() {
                while (!this.f26928n.isEmpty()) {
                    C4636q<N>.n.k last = this.f26928n.getLast();
                    if (last.f68275toq.hasNext()) {
                        this.f26928n.addLast(m16285q(last.f68275toq.next()));
                    } else {
                        this.f26928n.removeLast();
                        N n2 = last.f26929k;
                        if (n2 != null) {
                            return n2;
                        }
                    }
                }
                return (N) toq();
            }

            /* JADX INFO: renamed from: q */
            C4636q<N>.n.k m16285q(N n2) {
                return new k(n2, C4636q.this.f26922k.toq(n2));
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$q */
        /* JADX INFO: compiled from: Traverser.java */
        private final class q extends ab<N> {

            /* JADX INFO: renamed from: k */
            private final Queue<N> f26930k = new ArrayDeque();

            q(Iterable<? extends N> iterable) {
                Iterator<? extends N> it = iterable.iterator();
                while (it.hasNext()) {
                    this.f26930k.add(it.next());
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f26930k.isEmpty();
            }

            @Override // java.util.Iterator
            public N next() {
                N nRemove = this.f26930k.remove();
                nsb.m15905k(this.f26930k, C4636q.this.f26922k.toq(nRemove));
                return nRemove;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$toq */
        /* JADX INFO: compiled from: Traverser.java */
        class toq implements Iterable<N> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterable f26932k;

            toq(Iterable iterable) {
                this.f26932k = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new g(this.f26932k);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$q$zy */
        /* JADX INFO: compiled from: Traverser.java */
        class zy implements Iterable<N> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterable f26934k;

            zy(Iterable iterable) {
                this.f26934k = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new n(this.f26934k);
            }
        }

        C4636q(x9kr<N> x9krVar) {
            super();
            this.f26922k = (x9kr) com.google.common.base.jk.a9(x9krVar);
        }

        /* JADX INFO: renamed from: p */
        private void m16283p(N n2) {
            this.f26922k.toq(n2);
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: g */
        public Iterable<N> mo16279g(N n2) {
            com.google.common.base.jk.a9(n2);
            return mo16281n(vep5.of(n2));
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: k */
        public Iterable<N> mo16280k(Iterable<? extends N> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (nsb.mcp(iterable)) {
                return vep5.of();
            }
            Iterator<? extends N> it = iterable.iterator();
            while (it.hasNext()) {
                m16283p(it.next());
            }
            return new k(iterable);
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: n */
        public Iterable<N> mo16281n(Iterable<? extends N> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (nsb.mcp(iterable)) {
                return vep5.of();
            }
            Iterator<? extends N> it = iterable.iterator();
            while (it.hasNext()) {
                m16283p(it.next());
            }
            return new toq(iterable);
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: q */
        public Iterable<N> mo16282q(N n2) {
            com.google.common.base.jk.a9(n2);
            return zy(vep5.of(n2));
        }

        @Override // com.google.common.graph.ncyb
        public Iterable<N> toq(N n2) {
            com.google.common.base.jk.a9(n2);
            return mo16280k(vep5.of(n2));
        }

        @Override // com.google.common.graph.ncyb
        public Iterable<N> zy(Iterable<? extends N> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (nsb.mcp(iterable)) {
                return vep5.of();
            }
            Iterator<? extends N> it = iterable.iterator();
            while (it.hasNext()) {
                m16283p(it.next());
            }
            return new zy(iterable);
        }
    }

    /* JADX INFO: compiled from: Traverser.java */
    private static final class toq<N> extends ncyb<N> {

        /* JADX INFO: renamed from: k */
        private final x9kr<N> f26936k;

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$toq$k */
        /* JADX INFO: compiled from: Traverser.java */
        class C4637k implements Iterable<N> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterable f26937k;

            C4637k(Iterable iterable) {
                this.f26937k = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new C4639q(this.f26937k);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$toq$n */
        /* JADX INFO: compiled from: Traverser.java */
        private final class C4638n extends com.google.common.collect.zy<N> {

            /* JADX INFO: renamed from: g */
            private final Set<N> f26939g;

            /* JADX INFO: renamed from: n */
            private final Deque<toq<N>.C4638n.k> f26940n;

            /* JADX INFO: renamed from: y */
            private final zy f26942y;

            /* JADX INFO: renamed from: com.google.common.graph.ncyb$toq$n$k */
            /* JADX INFO: compiled from: Traverser.java */
            private final class k {

                /* JADX INFO: renamed from: k */
                @NullableDecl
                final N f26943k;

                /* JADX INFO: renamed from: toq, reason: collision with root package name */
                final Iterator<? extends N> f68277toq;

                k(@NullableDecl N n2, Iterable<? extends N> iterable) {
                    this.f26943k = n2;
                    this.f68277toq = iterable.iterator();
                }
            }

            C4638n(Iterable<? extends N> iterable, zy zyVar) {
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f26940n = arrayDeque;
                this.f26939g = new HashSet();
                arrayDeque.push(new k(null, iterable));
                this.f26942y = zyVar;
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected N mo15703k() {
                N n2;
                while (!this.f26940n.isEmpty()) {
                    toq<N>.C4638n.k first = this.f26940n.getFirst();
                    boolean zAdd = this.f26939g.add(first.f26943k);
                    boolean z2 = true;
                    boolean z3 = !first.f68277toq.hasNext();
                    if ((!zAdd || this.f26942y != zy.PREORDER) && (!z3 || this.f26942y != zy.POSTORDER)) {
                        z2 = false;
                    }
                    if (z3) {
                        this.f26940n.pop();
                    } else {
                        N next = first.f68277toq.next();
                        if (!this.f26939g.contains(next)) {
                            this.f26940n.push(m16288q(next));
                        }
                    }
                    if (z2 && (n2 = first.f26943k) != null) {
                        return n2;
                    }
                }
                return (N) toq();
            }

            /* JADX INFO: renamed from: q */
            toq<N>.C4638n.k m16288q(N n2) {
                return new k(n2, toq.this.f26936k.toq(n2));
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$toq$q */
        /* JADX INFO: compiled from: Traverser.java */
        private final class C4639q extends ab<N> {

            /* JADX INFO: renamed from: k */
            private final Queue<N> f26944k = new ArrayDeque();

            /* JADX INFO: renamed from: q */
            private final Set<N> f26946q = new HashSet();

            C4639q(Iterable<? extends N> iterable) {
                for (N n2 : iterable) {
                    if (this.f26946q.add(n2)) {
                        this.f26944k.add(n2);
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f26944k.isEmpty();
            }

            @Override // java.util.Iterator
            public N next() {
                N nRemove = this.f26944k.remove();
                for (N n2 : toq.this.f26936k.toq(nRemove)) {
                    if (this.f26946q.add(n2)) {
                        this.f26944k.add(n2);
                    }
                }
                return nRemove;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.ncyb$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Traverser.java */
        class C8008toq implements Iterable<N> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterable f26947k;

            C8008toq(Iterable iterable) {
                this.f26947k = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new C4638n(this.f26947k, zy.PREORDER);
            }
        }

        /* JADX INFO: compiled from: Traverser.java */
        class zy implements Iterable<N> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterable f26949k;

            zy(Iterable iterable) {
                this.f26949k = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new C4638n(this.f26949k, zy.POSTORDER);
            }
        }

        toq(x9kr<N> x9krVar) {
            super();
            this.f26936k = (x9kr) com.google.common.base.jk.a9(x9krVar);
        }

        /* JADX INFO: renamed from: p */
        private void m16286p(N n2) {
            this.f26936k.toq(n2);
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: g */
        public Iterable<N> mo16279g(N n2) {
            com.google.common.base.jk.a9(n2);
            return mo16281n(vep5.of(n2));
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: k */
        public Iterable<N> mo16280k(Iterable<? extends N> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (nsb.mcp(iterable)) {
                return vep5.of();
            }
            Iterator<? extends N> it = iterable.iterator();
            while (it.hasNext()) {
                m16286p(it.next());
            }
            return new C4637k(iterable);
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: n */
        public Iterable<N> mo16281n(Iterable<? extends N> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (nsb.mcp(iterable)) {
                return vep5.of();
            }
            Iterator<? extends N> it = iterable.iterator();
            while (it.hasNext()) {
                m16286p(it.next());
            }
            return new C8008toq(iterable);
        }

        @Override // com.google.common.graph.ncyb
        /* JADX INFO: renamed from: q */
        public Iterable<N> mo16282q(N n2) {
            com.google.common.base.jk.a9(n2);
            return zy(vep5.of(n2));
        }

        @Override // com.google.common.graph.ncyb
        public Iterable<N> toq(N n2) {
            com.google.common.base.jk.a9(n2);
            return mo16280k(vep5.of(n2));
        }

        @Override // com.google.common.graph.ncyb
        public Iterable<N> zy(Iterable<? extends N> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (nsb.mcp(iterable)) {
                return vep5.of();
            }
            Iterator<? extends N> it = iterable.iterator();
            while (it.hasNext()) {
                m16286p(it.next());
            }
            return new zy(iterable);
        }
    }

    /* JADX INFO: compiled from: Traverser.java */
    private enum zy {
        PREORDER,
        POSTORDER
    }

    public static <N> ncyb<N> f7l8(x9kr<N> x9krVar) {
        com.google.common.base.jk.a9(x9krVar);
        return new toq(x9krVar);
    }

    /* JADX INFO: renamed from: y */
    public static <N> ncyb<N> m16278y(x9kr<N> x9krVar) {
        com.google.common.base.jk.a9(x9krVar);
        if (x9krVar instanceof InterfaceC4648y) {
            com.google.common.base.jk.m15380n(((InterfaceC4648y) x9krVar).mo16193n(), "Undirected graphs can never be trees.");
        }
        if (x9krVar instanceof d2ok) {
            com.google.common.base.jk.m15380n(((d2ok) x9krVar).mo16205n(), "Undirected networks can never be trees.");
        }
        return new C4636q(x9krVar);
    }

    /* JADX INFO: renamed from: g */
    public abstract Iterable<N> mo16279g(N n2);

    /* JADX INFO: renamed from: k */
    public abstract Iterable<N> mo16280k(Iterable<? extends N> iterable);

    /* JADX INFO: renamed from: n */
    public abstract Iterable<N> mo16281n(Iterable<? extends N> iterable);

    /* JADX INFO: renamed from: q */
    public abstract Iterable<N> mo16282q(N n2);

    public abstract Iterable<N> toq(N n2);

    public abstract Iterable<N> zy(Iterable<? extends N> iterable);

    private ncyb() {
    }
}
