package com.google.common.collect;

import com.google.common.collect.mcp;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import com.google.common.math.C4723q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class g0ad {

    /* JADX INFO: compiled from: Sets.java */
    @wlev.zy
    static class f7l8<E> extends vq<E> {

        /* JADX INFO: renamed from: k */
        private final NavigableSet<E> f26145k;

        f7l8(NavigableSet<E> navigableSet) {
            this.f26145k = navigableSet;
        }

        /* JADX INFO: renamed from: t */
        private static <T> kx3<T> m15701t(Comparator<T> comparator) {
            return kx3.from(comparator).reverse();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public E ceiling(E e2) {
            return this.f26145k.floor(e2);
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f26145k.comparator();
            return comparator == null ? kx3.natural().reverse() : m15701t(comparator);
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f26145k.iterator();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f26145k;
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet
        public E first() {
            return this.f26145k.last();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public E floor(E e2) {
            return this.f26145k.ceiling(e2);
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z2) {
            return this.f26145k.tailSet(e2, z2).descendingSet();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public E higher(E e2) {
            return this.f26145k.lower(e2);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f26145k.descendingIterator();
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet
        public E last() {
            return this.f26145k.first();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public E lower(E e2) {
            return this.f26145k.higher(e2);
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public E pollFirst() {
            return this.f26145k.pollLast();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public E pollLast() {
            return this.f26145k.pollFirst();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
            return this.f26145k.subSet(e3, z3, e2, z2).descendingSet();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z2) {
            return this.f26145k.headSet(e2, z2).descendingSet();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.qkj8, com.google.common.collect.o05
        public String toString() {
            return standardToString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.vq, com.google.common.collect.g1, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public NavigableSet<E> delegate() {
            return this.f26145k;
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e2) {
            return m16006i(e2);
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e2, E e3) {
            return standardSubSet(e2, e3);
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e2) {
            return wvg(e2);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.g0ad$g */
    /* JADX INFO: compiled from: Sets.java */
    private static final class C4376g<E> extends AbstractC4572x<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: k */
        private final transient se<vep5<E>> f26146k;

        /* JADX INFO: renamed from: q */
        private final transient o1t<E> f26147q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$g$k */
        /* JADX INFO: compiled from: Sets.java */
        static class k extends se<List<E>> {
            final /* synthetic */ se val$axes;

            k(se seVar) {
                this.val$axes = seVar;
            }

            @Override // com.google.common.collect.z4
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.val$axes.size();
            }

            @Override // java.util.List
            public List<E> get(int i2) {
                return ((vep5) this.val$axes.get(i2)).asList();
            }
        }

        private C4376g(se<vep5<E>> seVar, o1t<E> o1tVar) {
            this.f26146k = seVar;
            this.f26147q = o1tVar;
        }

        static <E> Set<List<E>> ld6(List<? extends Set<? extends E>> list) {
            se.C4520k c4520k = new se.C4520k(list.size());
            Iterator<? extends Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                vep5 vep5VarCopyOf = vep5.copyOf((Collection) it.next());
                if (vep5VarCopyOf.isEmpty()) {
                    return vep5.of();
                }
                c4520k.mo15569k(vep5VarCopyOf);
            }
            se<E> seVarQrj = c4520k.mo15570n();
            return new C4376g(seVarQrj, new o1t(new k(seVarQrj)));
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return obj instanceof C4376g ? this.f26146k.equals(((C4376g) obj).f26146k) : super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i2 = 1;
            int size = size() - 1;
            for (int i3 = 0; i3 < this.f26146k.size(); i3++) {
                size = ~(~(size * 31));
            }
            ab<vep5<E>> it = this.f26146k.iterator();
            while (it.hasNext()) {
                vep5<E> next = it.next();
                i2 = ~(~((i2 * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i2 + size));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Collection<List<E>> delegate() {
            return this.f26147q;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.g0ad$k */
    /* JADX INFO: compiled from: Sets.java */
    static class C4377k<E> extends qrj<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f26148k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Set f26149q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$k$k */
        /* JADX INFO: compiled from: Sets.java */
        class k extends com.google.common.collect.zy<E> {

            /* JADX INFO: renamed from: g */
            final Iterator<? extends E> f26150g;

            /* JADX INFO: renamed from: n */
            final Iterator<? extends E> f26151n;

            k() {
                this.f26151n = C4377k.this.f26148k.iterator();
                this.f26150g = C4377k.this.f26149q.iterator();
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected E mo15703k() {
                if (this.f26151n.hasNext()) {
                    return this.f26151n.next();
                }
                while (this.f26150g.hasNext()) {
                    E next = this.f26150g.next();
                    if (!C4377k.this.f26148k.contains(next)) {
                        return next;
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4377k(Set set, Set set2) {
            super(null);
            this.f26148k = set;
            this.f26149q = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26148k.contains(obj) || this.f26149q.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f26148k.isEmpty() && this.f26149q.isEmpty();
        }

        @Override // com.google.common.collect.g0ad.qrj
        /* JADX INFO: renamed from: k */
        public <S extends Set<E>> S mo15702k(S s2) {
            s2.addAll(this.f26148k);
            s2.addAll(this.f26149q);
            return s2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f26148k.size();
            Iterator<E> it = this.f26149q.iterator();
            while (it.hasNext()) {
                if (!this.f26148k.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // com.google.common.collect.g0ad.qrj
        public vep5<E> toq() {
            return new vep5.C4532k().zy(this.f26148k).zy(this.f26149q).mo15570n();
        }

        @Override // com.google.common.collect.g0ad.qrj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public ab<E> iterator() {
            return new k();
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    static abstract class ld6<E> extends AbstractSet<E> {
        ld6() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return g0ad.d3(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) com.google.common.base.jk.a9(collection));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.g0ad$n */
    /* JADX INFO: compiled from: Sets.java */
    static class C4378n<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f26154k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ zkd f26155q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$n$k */
        /* JADX INFO: compiled from: Sets.java */
        class k extends com.google.common.collect.zy<Set<E>> {

            /* JADX INFO: renamed from: n */
            final BitSet f26157n;

            /* JADX INFO: renamed from: com.google.common.collect.g0ad$n$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Sets.java */
            class C7986k extends AbstractSet<E> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ BitSet f26158k;

                /* JADX INFO: renamed from: com.google.common.collect.g0ad$n$k$k$k, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Sets.java */
                class C7987k extends com.google.common.collect.zy<E> {

                    /* JADX INFO: renamed from: n */
                    int f26161n = -1;

                    C7987k() {
                    }

                    @Override // com.google.common.collect.zy
                    /* JADX INFO: renamed from: k */
                    protected E mo15703k() {
                        int iNextSetBit = C7986k.this.f26158k.nextSetBit(this.f26161n + 1);
                        this.f26161n = iNextSetBit;
                        return iNextSetBit == -1 ? toq() : C4378n.this.f26155q.keySet().asList().get(this.f26161n);
                    }
                }

                C7986k(BitSet bitSet) {
                    this.f26158k = bitSet;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@NullableDecl Object obj) {
                    Integer num = (Integer) C4378n.this.f26155q.get(obj);
                    return num != null && this.f26158k.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C7987k();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C4378n.this.f26154k;
                }
            }

            k() {
                this.f26157n = new BitSet(C4378n.this.f26155q.size());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Set<E> mo15703k() {
                if (this.f26157n.isEmpty()) {
                    this.f26157n.set(0, C4378n.this.f26154k);
                } else {
                    int iNextSetBit = this.f26157n.nextSetBit(0);
                    int iNextClearBit = this.f26157n.nextClearBit(iNextSetBit);
                    if (iNextClearBit == C4378n.this.f26155q.size()) {
                        return toq();
                    }
                    int i2 = (iNextClearBit - iNextSetBit) - 1;
                    this.f26157n.set(0, i2);
                    this.f26157n.clear(i2, iNextClearBit);
                    this.f26157n.set(iNextClearBit);
                }
                return new C7986k((BitSet) this.f26157n.clone());
            }
        }

        C4378n(int i2, zkd zkdVar) {
            this.f26154k = i2;
            this.f26155q = zkdVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            return set.size() == this.f26154k && this.f26155q.keySet().containsAll(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4723q.m16544k(this.f26155q.size(), this.f26154k);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f26155q.keySet() + ", " + this.f26154k + ")";
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    private static final class n7h<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: k */
        private final zkd<E, Integer> f26162k;

        /* JADX INFO: renamed from: q */
        private final int f26163q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$n7h$k */
        /* JADX INFO: compiled from: Sets.java */
        class C4379k extends ab<E> {

            /* JADX INFO: renamed from: k */
            final se<E> f26164k;

            /* JADX INFO: renamed from: q */
            int f26166q;

            C4379k() {
                this.f26164k = n7h.this.f26162k.keySet().asList();
                this.f26166q = n7h.this.f26163q;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26166q != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f26166q);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f26166q &= ~(1 << iNumberOfTrailingZeros);
                return this.f26164k.get(iNumberOfTrailingZeros);
            }
        }

        n7h(zkd<E, Integer> zkdVar, int i2) {
            this.f26162k = zkdVar;
            this.f26163q = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            Integer num = this.f26162k.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f26163q) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new C4379k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f26163q);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.g0ad$p */
    /* JADX INFO: compiled from: Sets.java */
    private static class C4380p<E> extends C4382s<E> implements SortedSet<E> {
        C4380p(SortedSet<E> sortedSet, com.google.common.base.a9<? super E> a9Var) {
            super(sortedSet, a9Var);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f26406k).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) zwy.o1t(this.f26406k.iterator(), this.f26407q);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
            return new C4380p(((SortedSet) this.f26406k).headSet(e2), this.f26407q);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f26406k;
            while (true) {
                E e2 = (Object) sortedSetHeadSet.last();
                if (this.f26407q.apply(e2)) {
                    return e2;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e2);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
            return new C4380p(((SortedSet) this.f26406k).subSet(e2, e3), this.f26407q);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
            return new C4380p(((SortedSet) this.f26406k).tailSet(e2), this.f26407q);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.g0ad$q */
    /* JADX INFO: compiled from: Sets.java */
    static class C4381q<E> extends qrj<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f26167k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Set f26168q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$q$k */
        /* JADX INFO: compiled from: Sets.java */
        class k extends com.google.common.collect.zy<E> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Iterator f26169g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26170n;

            k(Iterator it, Iterator it2) {
                this.f26170n = it;
                this.f26169g = it2;
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            public E mo15703k() {
                while (this.f26170n.hasNext()) {
                    E e2 = (E) this.f26170n.next();
                    if (!C4381q.this.f26168q.contains(e2)) {
                        return e2;
                    }
                }
                while (this.f26169g.hasNext()) {
                    E e3 = (E) this.f26169g.next();
                    if (!C4381q.this.f26167k.contains(e3)) {
                        return e3;
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4381q(Set set, Set set2) {
            super(null);
            this.f26167k = set;
            this.f26168q = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26168q.contains(obj) ^ this.f26167k.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f26167k.equals(this.f26168q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f26167k.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (!this.f26168q.contains(it.next())) {
                    i2++;
                }
            }
            Iterator<E> it2 = this.f26168q.iterator();
            while (it2.hasNext()) {
                if (!this.f26167k.contains(it2.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // com.google.common.collect.g0ad.qrj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: zy */
        public ab<E> iterator() {
            return new k(this.f26167k.iterator(), this.f26168q.iterator());
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    public static abstract class qrj<E> extends AbstractSet<E> {
        /* synthetic */ qrj(C4377k c4377k) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: k */
        public <S extends Set<E>> S mo15702k(S s2) {
            s2.addAll(this);
            return s2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public vep5<E> toq() {
            return vep5.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: zy */
        public abstract ab<E> iterator();

        private qrj() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.g0ad$s */
    /* JADX INFO: compiled from: Sets.java */
    private static class C4382s<E> extends mcp.C4463k<E> implements Set<E> {
        C4382s(Set<E> set, com.google.common.base.a9<? super E> a9Var) {
            super(set, a9Var);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return g0ad.f7l8(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return g0ad.ld6(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Sets.java */
    static class toq<E> extends qrj<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f26172k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Set f26173q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$toq$k */
        /* JADX INFO: compiled from: Sets.java */
        class C4383k extends com.google.common.collect.zy<E> {

            /* JADX INFO: renamed from: n */
            final Iterator<E> f26175n;

            C4383k() {
                this.f26175n = toq.this.f26172k.iterator();
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected E mo15703k() {
                while (this.f26175n.hasNext()) {
                    E next = this.f26175n.next();
                    if (toq.this.f26173q.contains(next)) {
                        return next;
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Set set, Set set2) {
            super(null);
            this.f26172k = set;
            this.f26173q = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26172k.contains(obj) && this.f26173q.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f26172k.containsAll(collection) && this.f26173q.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f26173q, this.f26172k);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f26172k.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f26173q.contains(it.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // com.google.common.collect.g0ad.qrj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: zy */
        public ab<E> iterator() {
            return new C4383k();
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    private static final class x2<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: k */
        final zkd<E, Integer> f26176k;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$x2$k */
        /* JADX INFO: compiled from: Sets.java */
        class C4384k extends com.google.common.collect.toq<Set<E>> {
            C4384k(int i2) {
                super(i2);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.toq
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Set<E> mo15538k(int i2) {
                return new n7h(x2.this.f26176k, i2);
            }
        }

        x2(Set<E> set) {
            com.google.common.base.jk.ld6(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.f26176k = vy.ncyb(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f26176k.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return obj instanceof x2 ? this.f26176k.equals(((x2) obj).f26176k) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f26176k.keySet().hashCode() << (this.f26176k.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new C4384k(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f26176k.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f26176k + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.g0ad$y */
    /* JADX INFO: compiled from: Sets.java */
    @wlev.zy
    private static class C4385y<E> extends C4380p<E> implements NavigableSet<E> {
        C4385y(NavigableSet<E> navigableSet, com.google.common.base.a9<? super E> a9Var) {
            super(navigableSet, a9Var);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            return (E) nsb.ki(toq().tailSet(e2, true), this.f26407q, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return zwy.fu4(toq().descendingIterator(), this.f26407q);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return g0ad.m15699y(toq().descendingSet(), this.f26407q);
        }

        @Override // java.util.NavigableSet
        @NullableDecl
        public E floor(E e2) {
            return (E) zwy.wvg(toq().headSet(e2, true).descendingIterator(), this.f26407q, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z2) {
            return g0ad.m15699y(toq().headSet(e2, z2), this.f26407q);
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            return (E) nsb.ki(toq().tailSet(e2, false), this.f26407q, null);
        }

        @Override // com.google.common.collect.g0ad.C4380p, java.util.SortedSet
        public E last() {
            return (E) zwy.o1t(toq().descendingIterator(), this.f26407q);
        }

        @Override // java.util.NavigableSet
        @NullableDecl
        public E lower(E e2) {
            return (E) zwy.wvg(toq().headSet(e2, false).descendingIterator(), this.f26407q, null);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) nsb.d3(toq(), this.f26407q);
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) nsb.d3(toq().descendingSet(), this.f26407q);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
            return g0ad.m15699y(toq().subSet(e2, z2, e3, z3), this.f26407q);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z2) {
            return g0ad.m15699y(toq().tailSet(e2, z2), this.f26407q);
        }

        NavigableSet<E> toq() {
            return (NavigableSet) this.f26406k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Sets.java */
    static class zy<E> extends qrj<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f26178k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Set f26179q;

        /* JADX INFO: renamed from: com.google.common.collect.g0ad$zy$k */
        /* JADX INFO: compiled from: Sets.java */
        class C4386k extends com.google.common.collect.zy<E> {

            /* JADX INFO: renamed from: n */
            final Iterator<E> f26181n;

            C4386k() {
                this.f26181n = zy.this.f26178k.iterator();
            }

            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: k */
            protected E mo15703k() {
                while (this.f26181n.hasNext()) {
                    E next = this.f26181n.next();
                    if (!zy.this.f26179q.contains(next)) {
                        return next;
                    }
                }
                return toq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(Set set, Set set2) {
            super(null);
            this.f26178k = set;
            this.f26179q = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26178k.contains(obj) && !this.f26179q.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f26179q.containsAll(this.f26178k);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f26178k.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (!this.f26179q.contains(it.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // com.google.common.collect.g0ad.qrj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: zy */
        public ab<E> iterator() {
            return new C4386k();
        }
    }

    private g0ad() {
    }

    public static <E extends Comparable> TreeSet<E> a9() {
        return new TreeSet<>();
    }

    public static <E> Set<E> cdj(Iterable<? extends E> iterable) {
        Set<E> setM15690h = m15690h();
        nsb.m15905k(setM15690h, iterable);
        return setM15690h;
    }

    public static <E> qrj<E> d2ok(Set<? extends E> set, Set<? extends E> set2) {
        com.google.common.base.jk.fti(set, "set1");
        com.google.common.base.jk.fti(set2, "set2");
        return new C4381q(set, set2);
    }

    static boolean d3(Set<?> set, Collection<?> collection) {
        com.google.common.base.jk.a9(collection);
        if (collection instanceof o05) {
            collection = ((o05) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? oc(set, collection.iterator()) : zwy.m16118c(set.iterator(), collection);
    }

    public static <E> NavigableSet<E> dd(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof z4) || (navigableSet instanceof kja0)) ? navigableSet : new kja0(navigableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7731k
    @wlev.zy
    public static <K extends Comparable<? super K>> NavigableSet<K> eqxt(NavigableSet<K> navigableSet, ps<K> psVar) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != kx3.natural() && psVar.hasLowerBound() && psVar.hasUpperBound()) {
            com.google.common.base.jk.m15380n(navigableSet.comparator().compare(psVar.lowerEndpoint(), psVar.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (psVar.hasLowerBound() && psVar.hasUpperBound()) {
            Comparable comparableLowerEndpoint = psVar.lowerEndpoint();
            fu4 fu4VarLowerBoundType = psVar.lowerBoundType();
            fu4 fu4Var = fu4.CLOSED;
            return navigableSet.subSet(comparableLowerEndpoint, fu4VarLowerBoundType == fu4Var, psVar.upperEndpoint(), psVar.upperBoundType() == fu4Var);
        }
        if (psVar.hasLowerBound()) {
            return navigableSet.tailSet(psVar.lowerEndpoint(), psVar.lowerBoundType() == fu4.CLOSED);
        }
        if (psVar.hasUpperBound()) {
            return navigableSet.headSet(psVar.upperEndpoint(), psVar.upperBoundType() == fu4.CLOSED);
        }
        return (NavigableSet) com.google.common.base.jk.a9(navigableSet);
    }

    static boolean f7l8(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> HashSet<E> fn3e() {
        return new HashSet<>();
    }

    public static <E extends Comparable> TreeSet<E> fti(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetA9 = a9();
        nsb.m15905k(treeSetA9, iterable);
        return treeSetA9;
    }

    public static <E> HashSet<E> fu4(E... eArr) {
        HashSet<E> hashSetM15700z = m15700z(eArr.length);
        Collections.addAll(hashSetM15700z, eArr);
        return hashSetM15700z;
    }

    /* JADX INFO: renamed from: g */
    public static <E> qrj<E> m15689g(Set<E> set, Set<?> set2) {
        com.google.common.base.jk.fti(set, "set1");
        com.google.common.base.jk.fti(set2, "set2");
        return new zy(set, set2);
    }

    @wlev.toq(serializable = false)
    public static <E> Set<Set<E>> gvn7(Set<E> set) {
        return new x2(set);
    }

    /* JADX INFO: renamed from: h */
    public static <E> Set<E> m15690h() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX INFO: renamed from: i */
    public static <E extends Enum<E>> EnumSet<E> m15691i(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        nsb.m15905k(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    @Deprecated
    public static <E> Set<E> jk(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E> TreeSet<E> jp0y(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) com.google.common.base.jk.a9(comparator));
    }

    /* JADX INFO: renamed from: k */
    public static <B> Set<List<B>> m15692k(List<? extends Set<? extends B>> list) {
        return C4376g.ld6(list);
    }

    @wlev.zy
    public static <E> CopyOnWriteArraySet<E> ki() {
        return new CopyOnWriteArraySet<>();
    }

    private static <E extends Enum<E>> EnumSet<E> kja0(Collection<E> collection, Class<E> cls) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    static int ld6(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    @wlev.zy
    public static <E> NavigableSet<E> lvui(NavigableSet<E> navigableSet) {
        return exv8.cdj(navigableSet);
    }

    public static <E> LinkedHashSet<E> mcp(int i2) {
        return new LinkedHashSet<>(vy.kja0(i2));
    }

    /* JADX INFO: renamed from: n */
    public static <E extends Enum<E>> EnumSet<E> m15693n(Collection<E> collection, Class<E> cls) {
        com.google.common.base.jk.a9(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : kja0(collection, cls);
    }

    public static <E> qrj<E> n7h(Set<E> set, Set<?> set2) {
        com.google.common.base.jk.fti(set, "set1");
        com.google.common.base.jk.fti(set2, "set2");
        return new toq(set, set2);
    }

    public static <E> HashSet<E> ni7(Iterator<? extends E> it) {
        HashSet<E> hashSetFn3e = fn3e();
        zwy.m16125k(hashSetFn3e, it);
        return hashSetFn3e;
    }

    public static <E> Set<E> o1t() {
        return Collections.newSetFromMap(vy.hb());
    }

    static boolean oc(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static <E> SortedSet<E> m15694p(SortedSet<E> sortedSet, com.google.common.base.a9<? super E> a9Var) {
        if (!(sortedSet instanceof C4382s)) {
            return new C4380p((SortedSet) com.google.common.base.jk.a9(sortedSet), (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var));
        }
        C4382s c4382s = (C4382s) sortedSet;
        return new C4380p((SortedSet) c4382s.f26406k, com.google.common.base.fti.m15348q(c4382s.f26407q, a9Var));
    }

    /* JADX INFO: renamed from: q */
    public static <E extends Enum<E>> EnumSet<E> m15695q(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        com.google.common.base.jk.m15380n(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return kja0(collection, collection.iterator().next().getDeclaringClass());
    }

    @wlev.toq(serializable = true)
    public static <E extends Enum<E>> vep5<E> qrj(Iterable<E> iterable) {
        if (iterable instanceof bwp) {
            return (bwp) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? vep5.of() : bwp.asImmutable(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return vep5.of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        zwy.m16125k(enumSetOf, it);
        return bwp.asImmutable(enumSetOf);
    }

    /* JADX INFO: renamed from: r */
    public static <E> qrj<E> m15696r(Set<? extends E> set, Set<? extends E> set2) {
        com.google.common.base.jk.fti(set, "set1");
        com.google.common.base.jk.fti(set2, "set2");
        return new C4377k(set, set2);
    }

    /* JADX INFO: renamed from: s */
    public static <E> Set<E> m15697s(Set<E> set, com.google.common.base.a9<? super E> a9Var) {
        if (set instanceof SortedSet) {
            return m15694p((SortedSet) set, a9Var);
        }
        if (!(set instanceof C4382s)) {
            return new C4382s((Set) com.google.common.base.jk.a9(set), (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var));
        }
        C4382s c4382s = (C4382s) set;
        return new C4382s((Set) c4382s.f26406k, com.google.common.base.fti.m15348q(c4382s.f26407q, a9Var));
    }

    /* JADX INFO: renamed from: t */
    public static <E> LinkedHashSet<E> m15698t(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>(mcp.toq(iterable));
        }
        LinkedHashSet<E> linkedHashSetWvg = wvg();
        nsb.m15905k(linkedHashSetWvg, iterable);
        return linkedHashSetWvg;
    }

    @wlev.zy
    public static <E> CopyOnWriteArraySet<E> t8r(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? mcp.toq(iterable) : wlev.ki(iterable));
    }

    @SafeVarargs
    public static <B> Set<List<B>> toq(Set<? extends B>... setArr) {
        return m15692k(Arrays.asList(setArr));
    }

    public static <E> LinkedHashSet<E> wvg() {
        return new LinkedHashSet<>();
    }

    @wlev.toq(serializable = true)
    public static <E extends Enum<E>> vep5<E> x2(E e2, E... eArr) {
        return bwp.asImmutable(EnumSet.of((Enum) e2, (Enum[]) eArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    /* JADX INFO: renamed from: y */
    public static <E> NavigableSet<E> m15699y(NavigableSet<E> navigableSet, com.google.common.base.a9<? super E> a9Var) {
        if (!(navigableSet instanceof C4382s)) {
            return new C4385y((NavigableSet) com.google.common.base.jk.a9(navigableSet), (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var));
        }
        C4382s c4382s = (C4382s) navigableSet;
        return new C4385y((NavigableSet) c4382s.f26406k, com.google.common.base.fti.m15348q(c4382s.f26407q, a9Var));
    }

    /* JADX INFO: renamed from: z */
    public static <E> HashSet<E> m15700z(int i2) {
        return new HashSet<>(vy.kja0(i2));
    }

    public static <E> HashSet<E> zurt(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<>(mcp.toq(iterable)) : ni7(iterable.iterator());
    }

    @InterfaceC7731k
    public static <E> Set<Set<E>> zy(Set<E> set, int i2) {
        zkd zkdVarNcyb = vy.ncyb(set);
        C4524t.toq(i2, "size");
        com.google.common.base.jk.qrj(i2 <= zkdVarNcyb.size(), "size (%s) must be <= set.size() (%s)", i2, zkdVarNcyb.size());
        return i2 == 0 ? vep5.of(vep5.of()) : i2 == zkdVarNcyb.size() ? vep5.of(zkdVarNcyb.keySet()) : new C4378n(i2, zkdVarNcyb);
    }

    /* JADX INFO: compiled from: Sets.java */
    static final class kja0<E> extends g1<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        private transient kja0<E> f26153k;
        private final SortedSet<E> unmodifiableDelegate;

        kja0(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) com.google.common.base.jk.a9(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            return this.delegate.ceiling(e2);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return zwy.ek5k(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            kja0<E> kja0Var = this.f26153k;
            if (kja0Var != null) {
                return kja0Var;
            }
            kja0<E> kja0Var2 = new kja0<>(this.delegate.descendingSet());
            this.f26153k = kja0Var2;
            kja0Var2.f26153k = this;
            return kja0Var2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
            return this.delegate.floor(e2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z2) {
            return g0ad.dd(this.delegate.headSet(e2, z2));
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            return this.delegate.higher(e2);
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
            return this.delegate.lower(e2);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
            return g0ad.dd(this.delegate.subSet(e2, z2, e3, z3));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z2) {
            return g0ad.dd(this.delegate.tailSet(e2, z2));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g1, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }
}
