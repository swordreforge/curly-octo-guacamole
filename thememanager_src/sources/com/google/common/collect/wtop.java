package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: TreeTraverser.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
@Deprecated
public abstract class wtop<T> {

    /* JADX INFO: compiled from: TreeTraverser.java */
    private static final class f7l8<T> {

        /* JADX INFO: renamed from: k */
        final T f26680k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Iterator<T> f68235toq;

        f7l8(T t2, Iterator<T> it) {
            this.f26680k = (T) com.google.common.base.jk.a9(t2);
            this.f68235toq = (Iterator) com.google.common.base.jk.a9(it);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wtop$g */
    /* JADX INFO: compiled from: TreeTraverser.java */
    private final class C4567g extends com.google.common.collect.zy<T> {

        /* JADX INFO: renamed from: n */
        private final ArrayDeque<f7l8<T>> f26682n;

        C4567g(T t2) {
            ArrayDeque<f7l8<T>> arrayDeque = new ArrayDeque<>();
            this.f26682n = arrayDeque;
            arrayDeque.addLast(m16074q(t2));
        }

        /* JADX INFO: renamed from: q */
        private f7l8<T> m16074q(T t2) {
            return new f7l8<>(t2, wtop.this.toq(t2).iterator());
        }

        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: k */
        protected T mo15703k() {
            while (!this.f26682n.isEmpty()) {
                f7l8<T> last = this.f26682n.getLast();
                if (!last.f68235toq.hasNext()) {
                    this.f26682n.removeLast();
                    return last.f26680k;
                }
                this.f26682n.addLast(m16074q(last.f68235toq.next()));
            }
            return toq();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wtop$k */
    /* JADX INFO: compiled from: TreeTraverser.java */
    static class C4568k extends wtop<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.common.base.t8r f26683k;

        C4568k(com.google.common.base.t8r t8rVar) {
            this.f26683k = t8rVar;
        }

        @Override // com.google.common.collect.wtop
        public Iterable<T> toq(T t2) {
            return (Iterable) this.f26683k.apply(t2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wtop$n */
    /* JADX INFO: compiled from: TreeTraverser.java */
    private final class C4569n extends ab<T> implements InterfaceC4555w<T> {

        /* JADX INFO: renamed from: k */
        private final Queue<T> f26684k;

        C4569n(T t2) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f26684k = arrayDeque;
            arrayDeque.add(t2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f26684k.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.InterfaceC4555w
        public T next() {
            T tRemove = this.f26684k.remove();
            nsb.m15905k(this.f26684k, wtop.this.toq(tRemove));
            return tRemove;
        }

        @Override // com.google.common.collect.InterfaceC4555w
        public T peek() {
            return this.f26684k.element();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wtop$q */
    /* JADX INFO: compiled from: TreeTraverser.java */
    class C4570q extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26687q;

        C4570q(Object obj) {
            this.f26687q = obj;
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
        public ab<T> iterator() {
            return new C4569n(this.f26687q);
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    class toq extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26689q;

        toq(Object obj) {
            this.f26689q = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
        public ab<T> iterator() {
            return wtop.this.m16072n(this.f26689q);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wtop$y */
    /* JADX INFO: compiled from: TreeTraverser.java */
    private final class C4571y extends ab<T> {

        /* JADX INFO: renamed from: k */
        private final Deque<Iterator<T>> f26690k;

        C4571y(T t2) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f26690k = arrayDeque;
            arrayDeque.addLast(zwy.vyq(com.google.common.base.jk.a9(t2)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f26690k.isEmpty();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f26690k.getLast();
            T t2 = (T) com.google.common.base.jk.a9(last.next());
            if (!last.hasNext()) {
                this.f26690k.removeLast();
            }
            Iterator<T> it = wtop.this.toq(t2).iterator();
            if (it.hasNext()) {
                this.f26690k.addLast(it);
            }
            return t2;
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    class zy extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26693q;

        zy(Object obj) {
            this.f26693q = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
        public ab<T> iterator() {
            return wtop.this.zy(this.f26693q);
        }
    }

    @Deprecated
    public static <T> wtop<T> f7l8(com.google.common.base.t8r<T, ? extends Iterable<T>> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        return new C4568k(t8rVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public final AbstractC4308a<T> m16070g(T t2) {
        com.google.common.base.jk.a9(t2);
        return new toq(t2);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public final AbstractC4308a<T> m16071k(T t2) {
        com.google.common.base.jk.a9(t2);
        return new C4570q(t2);
    }

    /* JADX INFO: renamed from: n */
    ab<T> m16072n(T t2) {
        return new C4571y(t2);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public final AbstractC4308a<T> m16073q(T t2) {
        com.google.common.base.jk.a9(t2);
        return new zy(t2);
    }

    public abstract Iterable<T> toq(T t2);

    ab<T> zy(T t2) {
        return new C4567g(t2);
    }
}
