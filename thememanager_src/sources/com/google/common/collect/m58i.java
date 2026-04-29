package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.g0ad;
import com.google.common.collect.o05;
import com.google.common.math.C4723q;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Multisets.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class m58i {

    /* JADX INFO: compiled from: Multisets.java */
    private static final class f7l8 implements Comparator<o05.InterfaceC4482k<?>> {

        /* JADX INFO: renamed from: k */
        static final f7l8 f26369k = new f7l8();

        private f7l8() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(o05.InterfaceC4482k<?> interfaceC4482k, o05.InterfaceC4482k<?> interfaceC4482k2) {
            return interfaceC4482k2.getCount() - interfaceC4482k.getCount();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.m58i$g */
    /* JADX INFO: compiled from: Multisets.java */
    static abstract class AbstractC4452g<E> implements o05.InterfaceC4482k<E> {
        AbstractC4452g() {
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof o05.InterfaceC4482k)) {
                return false;
            }
            o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) obj;
            return getCount() == interfaceC4482k.getCount() && C4280z.m15455k(getElement(), interfaceC4482k.getElement());
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.m58i$k */
    /* JADX INFO: compiled from: Multisets.java */
    static class C4453k<E> extends n7h<E> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ o05 f26370g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ o05 f26371n;

        /* JADX INFO: renamed from: com.google.common.collect.m58i$k$k */
        /* JADX INFO: compiled from: Multisets.java */
        class k extends com.google.common.collect.zy<o05.InterfaceC4482k<E>> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Iterator f26372g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26373n;

            k(Iterator it, Iterator it2) {
                this.f26373n = it;
                this.f26372g = it2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public o05.InterfaceC4482k<E> mo15703k() {
                if (this.f26373n.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) this.f26373n.next();
                    Object element = interfaceC4482k.getElement();
                    return m58i.ld6(element, Math.max(interfaceC4482k.getCount(), C4453k.this.f26370g.count(element)));
                }
                while (this.f26372g.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k2 = (o05.InterfaceC4482k) this.f26372g.next();
                    Object element2 = interfaceC4482k2.getElement();
                    if (!C4453k.this.f26371n.contains(element2)) {
                        return m58i.ld6(element2, interfaceC4482k2.getCount());
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4453k(o05 o05Var, o05 o05Var2) {
            super(null);
            this.f26371n = o05Var;
            this.f26370g = o05Var2;
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return this.f26371n.contains(obj) || this.f26370g.contains(obj);
        }

        @Override // com.google.common.collect.o05
        public int count(Object obj) {
            return Math.max(this.f26371n.count(obj), this.f26370g.count(obj));
        }

        @Override // com.google.common.collect.AbstractC4519s
        Set<E> createElementSet() {
            return g0ad.m15696r(this.f26371n.elementSet(), this.f26370g.elementSet());
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<o05.InterfaceC4482k<E>> entryIterator() {
            return new k(this.f26371n.entrySet().iterator(), this.f26370g.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f26371n.isEmpty() && this.f26370g.isEmpty();
        }
    }

    /* JADX INFO: compiled from: Multisets.java */
    static class ld6<E> extends AbstractC4452g<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;

        @NullableDecl
        private final E element;

        ld6(@NullableDecl E e2, int i2) {
            this.element = e2;
            this.count = i2;
            C4524t.toq(i2, "count");
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        @NullableDecl
        public final E getElement() {
            return this.element;
        }

        public ld6<E> nextInBucket() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.m58i$n */
    /* JADX INFO: compiled from: Multisets.java */
    static class C4454n<E> extends pnt2<o05.InterfaceC4482k<E>, E> {
        C4454n(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.pnt2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public E mo15580k(o05.InterfaceC4482k<E> interfaceC4482k) {
            return interfaceC4482k.getElement();
        }
    }

    /* JADX INFO: compiled from: Multisets.java */
    private static abstract class n7h<E> extends AbstractC4519s<E> {
        private n7h() {
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // com.google.common.collect.AbstractC4519s
        int distinctElements() {
            return elementSet().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public Iterator<E> iterator() {
            return m58i.n7h(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public int size() {
            return m58i.kja0(this);
        }

        /* synthetic */ n7h(C4453k c4453k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.m58i$p */
    /* JADX INFO: compiled from: Multisets.java */
    private static final class C4455p<E> extends n7h<E> {

        /* JADX INFO: renamed from: g */
        final com.google.common.base.a9<? super E> f26375g;

        /* JADX INFO: renamed from: n */
        final o05<E> f26376n;

        /* JADX INFO: renamed from: com.google.common.collect.m58i$p$k */
        /* JADX INFO: compiled from: Multisets.java */
        class k implements com.google.common.base.a9<o05.InterfaceC4482k<E>> {
            k() {
            }

            @Override // com.google.common.base.a9
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public boolean apply(o05.InterfaceC4482k<E> interfaceC4482k) {
                return C4455p.this.f26375g.apply(interfaceC4482k.getElement());
            }
        }

        C4455p(o05<E> o05Var, com.google.common.base.a9<? super E> a9Var) {
            super(null);
            this.f26376n = (o05) com.google.common.base.jk.a9(o05Var);
            this.f26375g = (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var);
        }

        @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
        public int add(@NullableDecl E e2, int i2) {
            com.google.common.base.jk.m15391z(this.f26375g.apply(e2), "Element %s does not match predicate %s", e2, this.f26375g);
            return this.f26376n.add(e2, i2);
        }

        @Override // com.google.common.collect.o05
        public int count(@NullableDecl Object obj) {
            int iCount = this.f26376n.count(obj);
            if (iCount <= 0 || !this.f26375g.apply(obj)) {
                return 0;
            }
            return iCount;
        }

        @Override // com.google.common.collect.AbstractC4519s
        Set<E> createElementSet() {
            return g0ad.m15697s(this.f26376n.elementSet(), this.f26375g);
        }

        @Override // com.google.common.collect.AbstractC4519s
        Set<o05.InterfaceC4482k<E>> createEntrySet() {
            return g0ad.m15697s(this.f26376n.entrySet(), new k());
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<o05.InterfaceC4482k<E>> entryIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.m58i.n7h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ab<E> iterator() {
            return zwy.fu4(this.f26376n.iterator(), this.f26375g);
        }

        @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
        public int remove(@NullableDecl Object obj, int i2) {
            C4524t.toq(i2, "occurrences");
            if (i2 == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.f26376n.remove(obj, i2);
            }
            return 0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.m58i$q */
    /* JADX INFO: compiled from: Multisets.java */
    static class C4456q<E> extends n7h<E> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ o05 f26378g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ o05 f26379n;

        /* JADX INFO: renamed from: com.google.common.collect.m58i$q$k */
        /* JADX INFO: compiled from: Multisets.java */
        class k extends com.google.common.collect.zy<E> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26381n;

            k(Iterator it) {
                this.f26381n = it;
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
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected E mo15703k() {
                while (this.f26381n.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) this.f26381n.next();
                    E e2 = (E) interfaceC4482k.getElement();
                    if (interfaceC4482k.getCount() > C4456q.this.f26378g.count(e2)) {
                        return e2;
                    }
                }
                return toq();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.m58i$q$toq */
        /* JADX INFO: compiled from: Multisets.java */
        class toq extends com.google.common.collect.zy<o05.InterfaceC4482k<E>> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26383n;

            toq(Iterator it) {
                this.f26383n = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public o05.InterfaceC4482k<E> mo15703k() {
                while (this.f26383n.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) this.f26383n.next();
                    Object element = interfaceC4482k.getElement();
                    int count = interfaceC4482k.getCount() - C4456q.this.f26378g.count(element);
                    if (count > 0) {
                        return m58i.ld6(element, count);
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4456q(o05 o05Var, o05 o05Var2) {
            super(null);
            this.f26379n = o05Var;
            this.f26378g = o05Var2;
        }

        @Override // com.google.common.collect.m58i.n7h, com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.o05
        public int count(@NullableDecl Object obj) {
            int iCount = this.f26379n.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.max(0, iCount - this.f26378g.count(obj));
        }

        @Override // com.google.common.collect.m58i.n7h, com.google.common.collect.AbstractC4519s
        int distinctElements() {
            return zwy.m16119e(entryIterator());
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<E> elementIterator() {
            return new k(this.f26379n.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<o05.InterfaceC4482k<E>> entryIterator() {
            return new toq(this.f26379n.entrySet().iterator());
        }
    }

    /* JADX INFO: compiled from: Multisets.java */
    static class qrj<E> extends AbstractC4333d<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final o05<? extends E> delegate;

        @MonotonicNonNullDecl
        transient Set<E> elementSet;

        @MonotonicNonNullDecl
        transient Set<o05.InterfaceC4482k<E>> entrySet;

        qrj(o05<? extends E> o05Var) {
            this.delegate = o05Var;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        Set<E> createElementSet() {
            return Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> setCreateElementSet = createElementSet();
            this.elementSet = setCreateElementSet;
            return setCreateElementSet;
        }

        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
        public Set<o05.InterfaceC4482k<E>> entrySet() {
            Set<o05.InterfaceC4482k<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<o05.InterfaceC4482k<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return zwy.ek5k(this.delegate.iterator());
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
        public int setCount(E e2, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
        public int add(E e2, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
        public int remove(Object obj, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
        public boolean setCount(E e2, int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public o05<E> delegate() {
            return this.delegate;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.m58i$s */
    /* JADX INFO: compiled from: Multisets.java */
    static abstract class AbstractC4457s<E> extends g0ad.ld6<o05.InterfaceC4482k<E>> {
        AbstractC4457s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15679k().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof o05.InterfaceC4482k)) {
                return false;
            }
            o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) obj;
            return interfaceC4482k.getCount() > 0 && mo15679k().count(interfaceC4482k.getElement()) == interfaceC4482k.getCount();
        }

        /* JADX INFO: renamed from: k */
        abstract o05<E> mo15679k();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof o05.InterfaceC4482k) {
                o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) obj;
                Object element = interfaceC4482k.getElement();
                int count = interfaceC4482k.getCount();
                if (count != 0) {
                    return mo15679k().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Multisets.java */
    static class toq<E> extends n7h<E> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ o05 f26384g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ o05 f26385n;

        /* JADX INFO: renamed from: com.google.common.collect.m58i$toq$k */
        /* JADX INFO: compiled from: Multisets.java */
        class C4458k extends com.google.common.collect.zy<o05.InterfaceC4482k<E>> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26387n;

            C4458k(Iterator it) {
                this.f26387n = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public o05.InterfaceC4482k<E> mo15703k() {
                while (this.f26387n.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) this.f26387n.next();
                    Object element = interfaceC4482k.getElement();
                    int iMin = Math.min(interfaceC4482k.getCount(), toq.this.f26384g.count(element));
                    if (iMin > 0) {
                        return m58i.ld6(element, iMin);
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(o05 o05Var, o05 o05Var2) {
            super(null);
            this.f26385n = o05Var;
            this.f26384g = o05Var2;
        }

        @Override // com.google.common.collect.o05
        public int count(Object obj) {
            int iCount = this.f26385n.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.min(iCount, this.f26384g.count(obj));
        }

        @Override // com.google.common.collect.AbstractC4519s
        Set<E> createElementSet() {
            return g0ad.n7h(this.f26385n.elementSet(), this.f26384g.elementSet());
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<o05.InterfaceC4482k<E>> entryIterator() {
            return new C4458k(this.f26385n.entrySet().iterator());
        }
    }

    /* JADX INFO: compiled from: Multisets.java */
    static final class x2<E> implements Iterator<E> {

        /* JADX INFO: renamed from: g */
        private int f26388g;

        /* JADX INFO: renamed from: k */
        private final o05<E> f26389k;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        private o05.InterfaceC4482k<E> f26390n;

        /* JADX INFO: renamed from: q */
        private final Iterator<o05.InterfaceC4482k<E>> f26391q;

        /* JADX INFO: renamed from: s */
        private boolean f26392s;

        /* JADX INFO: renamed from: y */
        private int f26393y;

        x2(o05<E> o05Var, Iterator<o05.InterfaceC4482k<E>> it) {
            this.f26389k = o05Var;
            this.f26391q = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26388g > 0 || this.f26391q.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f26388g == 0) {
                o05.InterfaceC4482k<E> next = this.f26391q.next();
                this.f26390n = next;
                int count = next.getCount();
                this.f26388g = count;
                this.f26393y = count;
            }
            this.f26388g--;
            this.f26392s = true;
            return this.f26390n.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26392s);
            if (this.f26393y == 1) {
                this.f26391q.remove();
            } else {
                this.f26389k.remove(this.f26390n.getElement());
            }
            this.f26393y--;
            this.f26392s = false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.m58i$y */
    /* JADX INFO: compiled from: Multisets.java */
    static abstract class AbstractC4459y<E> extends g0ad.ld6<E> {
        AbstractC4459y() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15598k().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo15598k().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo15598k().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo15598k().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        /* JADX INFO: renamed from: k */
        abstract o05<E> mo15598k();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return mo15598k().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo15598k().entrySet().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Multisets.java */
    static class zy<E> extends n7h<E> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ o05 f26394g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ o05 f26395n;

        /* JADX INFO: renamed from: com.google.common.collect.m58i$zy$k */
        /* JADX INFO: compiled from: Multisets.java */
        class C4460k extends com.google.common.collect.zy<o05.InterfaceC4482k<E>> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Iterator f26396g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26397n;

            C4460k(Iterator it, Iterator it2) {
                this.f26397n = it;
                this.f26396g = it2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public o05.InterfaceC4482k<E> mo15703k() {
                if (this.f26397n.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) this.f26397n.next();
                    Object element = interfaceC4482k.getElement();
                    return m58i.ld6(element, interfaceC4482k.getCount() + zy.this.f26394g.count(element));
                }
                while (this.f26396g.hasNext()) {
                    o05.InterfaceC4482k interfaceC4482k2 = (o05.InterfaceC4482k) this.f26396g.next();
                    Object element2 = interfaceC4482k2.getElement();
                    if (!zy.this.f26395n.contains(element2)) {
                        return m58i.ld6(element2, interfaceC4482k2.getCount());
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(o05 o05Var, o05 o05Var2) {
            super(null);
            this.f26395n = o05Var;
            this.f26394g = o05Var2;
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return this.f26395n.contains(obj) || this.f26394g.contains(obj);
        }

        @Override // com.google.common.collect.o05
        public int count(Object obj) {
            return this.f26395n.count(obj) + this.f26394g.count(obj);
        }

        @Override // com.google.common.collect.AbstractC4519s
        Set<E> createElementSet() {
            return g0ad.m15696r(this.f26395n.elementSet(), this.f26394g.elementSet());
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<o05.InterfaceC4482k<E>> entryIterator() {
            return new C4460k(this.f26395n.entrySet().iterator(), this.f26394g.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f26395n.isEmpty() && this.f26394g.isEmpty();
        }

        @Override // com.google.common.collect.m58i.n7h, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public int size() {
            return C4723q.m16543i(this.f26395n.size(), this.f26394g.size());
        }
    }

    private m58i() {
    }

    @CanIgnoreReturnValue
    public static boolean cdj(o05<?> o05Var, o05<?> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        Iterator<o05.InterfaceC4482k<?>> it = o05Var.entrySet().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            o05.InterfaceC4482k<?> next = it.next();
            int iCount = o05Var2.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                o05Var.remove(next.getElement(), iCount);
            }
            z2 = true;
        }
        return z2;
    }

    @InterfaceC7731k
    public static <E> o05<E> f7l8(o05<E> o05Var, o05<?> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        return new C4456q(o05Var, o05Var2);
    }

    private static <E> boolean fn3e(o05<E> o05Var, o05<?> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        Iterator<o05.InterfaceC4482k<E>> it = o05Var.entrySet().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            o05.InterfaceC4482k<E> next = it.next();
            int iCount = o05Var2.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                o05Var.setCount(next.getElement(), iCount);
            }
            z2 = true;
        }
        return z2;
    }

    @InterfaceC7731k
    public static <E> o05<E> fu4(o05<? extends E> o05Var, o05<? extends E> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        return new zy(o05Var, o05Var2);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static <E> b3e<E> m15833g(o05<E> o05Var) {
        o05.InterfaceC4482k[] interfaceC4482kArr = (o05.InterfaceC4482k[]) o05Var.entrySet().toArray(new o05.InterfaceC4482k[0]);
        Arrays.sort(interfaceC4482kArr, f7l8.f26369k);
        return b3e.copyFromEntries(Arrays.asList(interfaceC4482kArr));
    }

    /* JADX INFO: renamed from: h */
    static boolean m15834h(o05<?> o05Var, Collection<?> collection) {
        if (collection instanceof o05) {
            collection = ((o05) collection).elementSet();
        }
        return o05Var.elementSet().removeAll(collection);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: i */
    public static boolean m15835i(o05<?> o05Var, o05<?> o05Var2) {
        return fn3e(o05Var, o05Var2);
    }

    /* JADX INFO: renamed from: k */
    private static <E> boolean m15836k(o05<E> o05Var, AbstractC4375g<? extends E> abstractC4375g) {
        if (abstractC4375g.isEmpty()) {
            return false;
        }
        abstractC4375g.addTo(o05Var);
        return true;
    }

    @CanIgnoreReturnValue
    public static boolean ki(o05<?> o05Var, Iterable<?> iterable) {
        if (iterable instanceof o05) {
            return cdj(o05Var, (o05) iterable);
        }
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(iterable);
        boolean zRemove = false;
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            zRemove |= o05Var.remove(it.next());
        }
        return zRemove;
    }

    static int kja0(o05<?> o05Var) {
        Iterator<o05.InterfaceC4482k<?>> it = o05Var.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return C4746s.fu4(count);
    }

    public static <E> o05.InterfaceC4482k<E> ld6(@NullableDecl E e2, int i2) {
        return new ld6(e2, i2);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public static boolean m15837n(o05<?> o05Var, o05<?> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        for (o05.InterfaceC4482k<?> interfaceC4482k : o05Var2.entrySet()) {
            if (o05Var.count(interfaceC4482k.getElement()) < interfaceC4482k.getCount()) {
                return false;
            }
        }
        return true;
    }

    static <E> Iterator<E> n7h(o05<E> o05Var) {
        return new x2(o05Var, o05Var.entrySet().iterator());
    }

    static <E> boolean ni7(o05<E> o05Var, E e2, int i2, int i3) {
        C4524t.toq(i2, "oldCount");
        C4524t.toq(i3, "newCount");
        if (o05Var.count(e2) != i2) {
            return false;
        }
        o05Var.setCount(e2, i3);
        return true;
    }

    @Deprecated
    public static <E> o05<E> o1t(b3e<E> b3eVar) {
        return (o05) com.google.common.base.jk.a9(b3eVar);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static <E> o05<E> m15838p(o05<E> o05Var, com.google.common.base.a9<? super E> a9Var) {
        if (!(o05Var instanceof C4455p)) {
            return new C4455p(o05Var, a9Var);
        }
        C4455p c4455p = (C4455p) o05Var;
        return new C4455p(c4455p.f26376n, com.google.common.base.fti.m15348q(c4455p.f26375g, a9Var));
    }

    /* JADX INFO: renamed from: q */
    static <T> o05<T> m15839q(Iterable<T> iterable) {
        return (o05) iterable;
    }

    public static <E> o05<E> qrj(o05<E> o05Var, o05<?> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        return new toq(o05Var, o05Var2);
    }

    /* JADX INFO: renamed from: s */
    static boolean m15840s(o05<?> o05Var, @NullableDecl Object obj) {
        if (obj == o05Var) {
            return true;
        }
        if (obj instanceof o05) {
            o05 o05Var2 = (o05) obj;
            if (o05Var.size() == o05Var2.size() && o05Var.entrySet().size() == o05Var2.entrySet().size()) {
                for (o05.InterfaceC4482k interfaceC4482k : o05Var2.entrySet()) {
                    if (o05Var.count(interfaceC4482k.getElement()) != interfaceC4482k.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: t */
    public static <E> gb<E> m15841t(gb<E> gbVar) {
        return new tjz5((gb) com.google.common.base.jk.a9(gbVar));
    }

    static boolean t8r(o05<?> o05Var, Collection<?> collection) {
        com.google.common.base.jk.a9(collection);
        if (collection instanceof o05) {
            collection = ((o05) collection).elementSet();
        }
        return o05Var.elementSet().retainAll(collection);
    }

    private static <E> boolean toq(o05<E> o05Var, o05<? extends E> o05Var2) {
        if (o05Var2 instanceof AbstractC4375g) {
            return m15836k(o05Var, (AbstractC4375g) o05Var2);
        }
        if (o05Var2.isEmpty()) {
            return false;
        }
        for (o05.InterfaceC4482k<? extends E> interfaceC4482k : o05Var2.entrySet()) {
            o05Var.add(interfaceC4482k.getElement(), interfaceC4482k.getCount());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> o05<E> wvg(o05<? extends E> o05Var) {
        return ((o05Var instanceof qrj) || (o05Var instanceof b3e)) ? o05Var : new qrj((o05) com.google.common.base.jk.a9(o05Var));
    }

    static int x2(Iterable<?> iterable) {
        if (iterable instanceof o05) {
            return ((o05) iterable).elementSet().size();
        }
        return 11;
    }

    /* JADX INFO: renamed from: y */
    static <E> Iterator<E> m15842y(Iterator<o05.InterfaceC4482k<E>> it) {
        return new C4454n(it);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: z */
    public static <E> o05<E> m15843z(o05<? extends E> o05Var, o05<? extends E> o05Var2) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(o05Var2);
        return new C4453k(o05Var, o05Var2);
    }

    static <E> int zurt(o05<E> o05Var, E e2, int i2) {
        C4524t.toq(i2, "count");
        int iCount = o05Var.count(e2);
        int i3 = i2 - iCount;
        if (i3 > 0) {
            o05Var.add(e2, i3);
        } else if (i3 < 0) {
            o05Var.remove(e2, -i3);
        }
        return iCount;
    }

    static <E> boolean zy(o05<E> o05Var, Collection<? extends E> collection) {
        com.google.common.base.jk.a9(o05Var);
        com.google.common.base.jk.a9(collection);
        if (collection instanceof o05) {
            return toq(o05Var, m15839q(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return zwy.m16125k(o05Var, collection.iterator());
    }
}
