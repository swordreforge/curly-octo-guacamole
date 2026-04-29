package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
@kotlin.yz(version = "1.1")
public abstract class zy<E> extends AbstractC6147k<E> implements List<E>, InterfaceC7625k {

    @InterfaceC7396q
    public static final C6176k Companion = new C6176k(null);

    /* JADX INFO: renamed from: kotlin.collections.zy$k */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class C6176k {
        private C6176k() {
        }

        public /* synthetic */ C6176k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: g */
        public final int m22680g(@InterfaceC7396q Collection<?> c2) {
            kotlin.jvm.internal.d2ok.m23075h(c2, "c");
            Iterator<?> it = c2.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        /* JADX INFO: renamed from: k */
        public final void m22681k(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i3 + ", size: " + i4);
            }
            if (i2 <= i3) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: " + i3);
        }

        /* JADX INFO: renamed from: n */
        public final boolean m22682n(@InterfaceC7396q Collection<?> c2, @InterfaceC7396q Collection<?> other) {
            kotlin.jvm.internal.d2ok.m23075h(c2, "c");
            kotlin.jvm.internal.d2ok.m23075h(other, "other");
            if (c2.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c2.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.d2ok.f7l8(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: q */
        public final void m22683q(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
            }
            if (i2 <= i3) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
        }

        public final void toq(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void zy(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.zy$q */
    /* JADX INFO: compiled from: AbstractList.kt */
    private static final class C6177q<E> extends zy<E> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final zy<E> f36213k;

        /* JADX INFO: renamed from: n */
        private int f36214n;

        /* JADX INFO: renamed from: q */
        private final int f36215q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6177q(@InterfaceC7396q zy<? extends E> list, int i2, int i3) {
            kotlin.jvm.internal.d2ok.m23075h(list, "list");
            this.f36213k = list;
            this.f36215q = i2;
            zy.Companion.m22683q(i2, i3, list.size());
            this.f36214n = i3 - i2;
        }

        @Override // kotlin.collections.zy, java.util.List
        public E get(int i2) {
            zy.Companion.toq(i2, this.f36214n);
            return this.f36213k.get(this.f36215q + i2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36214n;
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    private class toq implements Iterator<E>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        private int f36216k;

        public toq() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36216k < zy.this.size();
        }

        /* JADX INFO: renamed from: k */
        protected final int m22684k() {
            return this.f36216k;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            zy<E> zyVar = zy.this;
            int i2 = this.f36216k;
            this.f36216k = i2 + 1;
            return zyVar.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        protected final void toq(int i2) {
            this.f36216k = i2;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractList.kt */
    private class C8054zy extends zy<E>.toq implements ListIterator<E>, InterfaceC7625k {
        public C8054zy(int i2) {
            super();
            zy.Companion.zy(i2, zy.this.size());
            toq(i2);
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m22684k() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m22684k();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            zy<E> zyVar = zy.this;
            toq(m22684k() - 1);
            return zyVar.get(m22684k());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m22684k() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    protected zy() {
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.m22682n(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i2);

    @Override // kotlin.collections.AbstractC6147k
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.m22680g(this);
    }

    public int indexOf(E e2) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.d2ok.f7l8(it.next(), e2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC7396q
    public Iterator<E> iterator() {
        return new toq();
    }

    public int lastIndexOf(E e2) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.d2ok.f7l8(listIterator.previous(), e2)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public ListIterator<E> listIterator() {
        return new C8054zy(0);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @InterfaceC7396q
    public List<E> subList(int i2, int i3) {
        return new C6177q(this, i2, i3);
    }

    @InterfaceC7396q
    public ListIterator<E> listIterator(int i2) {
        return new C8054zy(i2);
    }
}
