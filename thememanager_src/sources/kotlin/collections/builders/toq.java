package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractC6143g;
import kotlin.collections.kja0;
import kotlin.collections.ld6;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7624g;
import r6ty.InterfaceC7626n;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class toq<E> extends AbstractC6143g<E> implements List<E>, RandomAccess, Serializable, InterfaceC7626n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6137k f36131k = new C6137k(null);

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final toq f36132q;

    @InterfaceC7396q
    private E[] array;

    @InterfaceC7395n
    private final toq<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;

    @InterfaceC7395n
    private final toq<E> root;

    /* JADX INFO: renamed from: kotlin.collections.builders.toq$k */
    /* JADX INFO: compiled from: ListBuilder.kt */
    private static final class C6137k {
        private C6137k() {
        }

        public /* synthetic */ C6137k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ListBuilder.kt */
    @lv5({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
    private static final class C8051toq<E> implements ListIterator<E>, InterfaceC7624g {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final toq<E> f36133k;

        /* JADX INFO: renamed from: n */
        private int f36134n;

        /* JADX INFO: renamed from: q */
        private int f36135q;

        public C8051toq(@InterfaceC7396q toq<E> list, int i2) {
            d2ok.m23075h(list, "list");
            this.f36133k = list;
            this.f36135q = i2;
            this.f36134n = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            toq<E> toqVar = this.f36133k;
            int i2 = this.f36135q;
            this.f36135q = i2 + 1;
            toqVar.add(i2, e2);
            this.f36134n = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36135q < ((toq) this.f36133k).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36135q > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f36135q >= ((toq) this.f36133k).length) {
                throw new NoSuchElementException();
            }
            int i2 = this.f36135q;
            this.f36135q = i2 + 1;
            this.f36134n = i2;
            return (E) ((toq) this.f36133k).array[((toq) this.f36133k).offset + this.f36134n];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f36135q;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i2 = this.f36135q;
            if (i2 <= 0) {
                throw new NoSuchElementException();
            }
            int i3 = i2 - 1;
            this.f36135q = i3;
            this.f36134n = i3;
            return (E) ((toq) this.f36133k).array[((toq) this.f36133k).offset + this.f36134n];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f36135q - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i2 = this.f36134n;
            if (!(i2 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f36133k.remove(i2);
            this.f36135q = this.f36134n;
            this.f36134n = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            int i2 = this.f36134n;
            if (!(i2 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f36133k.set(i2, e2);
        }
    }

    static {
        toq toqVar = new toq(0);
        toqVar.isReadOnly = true;
        f36132q = toqVar;
    }

    private toq(E[] eArr, int i2, int i3, boolean z2, toq<E> toqVar, toq<E> toqVar2) {
        this.array = eArr;
        this.offset = i2;
        this.length = i3;
        this.isReadOnly = z2;
        this.backing = toqVar;
        this.root = toqVar2;
    }

    private final void f7l8(int i2) {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        if (i2 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.array;
        if (i2 > eArr.length) {
            this.array = (E[]) zy.m22463n(this.array, ld6.f36172g.m22550k(eArr.length, i2));
        }
    }

    /* JADX INFO: renamed from: g */
    private final boolean m22456g(List<?> list) {
        return zy.m22467y(this.array, this.offset, this.length, list);
    }

    /* JADX INFO: renamed from: k */
    private final void m22457k(int i2, Collection<? extends E> collection, int i3) {
        toq<E> toqVar = this.backing;
        if (toqVar != null) {
            toqVar.m22457k(i2, collection, i3);
            this.array = this.backing.array;
            this.length += i3;
        } else {
            m22459s(i2, i3);
            Iterator<? extends E> it = collection.iterator();
            for (int i4 = 0; i4 < i3; i4++) {
                this.array[i2 + i4] = it.next();
            }
        }
    }

    private final E ld6(int i2) {
        toq<E> toqVar = this.backing;
        if (toqVar != null) {
            this.length--;
            return toqVar.ld6(i2);
        }
        E[] eArr = this.array;
        E e2 = eArr[i2];
        kja0.ikck(eArr, eArr, i2, i2 + 1, this.offset + this.length);
        zy.m22461g(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e2;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m22458p() {
        toq<E> toqVar;
        return this.isReadOnly || ((toqVar = this.root) != null && toqVar.isReadOnly);
    }

    private final int qrj(int i2, int i3, Collection<? extends E> collection, boolean z2) {
        toq<E> toqVar = this.backing;
        if (toqVar != null) {
            int iQrj = toqVar.qrj(i2, i3, collection, z2);
            this.length -= iQrj;
            return iQrj;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.array[i6]) == z2) {
                E[] eArr = this.array;
                i4++;
                eArr[i5 + i2] = eArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        E[] eArr2 = this.array;
        kja0.ikck(eArr2, eArr2, i2 + i5, i3 + i2, this.length);
        E[] eArr3 = this.array;
        int i8 = this.length;
        zy.f7l8(eArr3, i8 - i7, i8);
        this.length -= i7;
        return i7;
    }

    /* JADX INFO: renamed from: s */
    private final void m22459s(int i2, int i3) {
        m22460y(i3);
        E[] eArr = this.array;
        kja0.ikck(eArr, eArr, i2 + i3, i2, this.offset + this.length);
        this.length += i3;
    }

    private final void toq(int i2, E e2) {
        toq<E> toqVar = this.backing;
        if (toqVar == null) {
            m22459s(i2, 1);
            this.array[i2] = e2;
        } else {
            toqVar.toq(i2, e2);
            this.array = this.backing.array;
            this.length++;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (m22458p()) {
            return new C6138y(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void x2(int i2, int i3) {
        toq<E> toqVar = this.backing;
        if (toqVar != null) {
            toqVar.x2(i2, i3);
        } else {
            E[] eArr = this.array;
            kja0.ikck(eArr, eArr, i2, i2 + i3, this.length);
            E[] eArr2 = this.array;
            int i4 = this.length;
            zy.f7l8(eArr2, i4 - i3, i4);
        }
        this.length -= i3;
    }

    /* JADX INFO: renamed from: y */
    private final void m22460y(int i2) {
        f7l8(this.length + i2);
    }

    private final void zy() {
        if (m22458p()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        zy();
        toq(this.offset + this.length, e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@InterfaceC7396q Collection<? extends E> elements) {
        d2ok.m23075h(elements, "elements");
        zy();
        int size = elements.size();
        m22457k(this.offset + this.length, elements, size);
        return size > 0;
    }

    @InterfaceC7396q
    public final List<E> build() {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        zy();
        this.isReadOnly = true;
        return this.length > 0 ? this : f36132q;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        zy();
        x2(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@InterfaceC7395n Object obj) {
        return obj == this || ((obj instanceof List) && m22456g((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        kotlin.collections.zy.Companion.toq(i2, this.length);
        return this.array[this.offset + i2];
    }

    @Override // kotlin.collections.AbstractC6143g
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return zy.m22466s(this.array, this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (d2ok.f7l8(this.array[this.offset + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC7396q
    public Iterator<E> iterator() {
        return new C8051toq(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i2 = this.length - 1; i2 >= 0; i2--) {
            if (d2ok.f7l8(this.array[this.offset + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @InterfaceC7396q
    public ListIterator<E> listIterator() {
        return new C8051toq(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        zy();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        zy();
        return qrj(this.offset, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractC6143g
    public E removeAt(int i2) {
        zy();
        kotlin.collections.zy.Companion.toq(i2, this.length);
        return ld6(this.offset + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        zy();
        return qrj(this.offset, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractC6143g, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        zy();
        kotlin.collections.zy.Companion.toq(i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset;
        E e3 = eArr[i3 + i2];
        eArr[i3 + i2] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    @InterfaceC7396q
    public List<E> subList(int i2, int i3) {
        kotlin.collections.zy.Companion.m22683q(i2, i3, this.length);
        E[] eArr = this.array;
        int i4 = this.offset + i2;
        int i5 = i3 - i2;
        boolean z2 = this.isReadOnly;
        toq<E> toqVar = this.root;
        return new toq(eArr, i4, i5, z2, this, toqVar == null ? this : toqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC7396q
    public <T> T[] toArray(@InterfaceC7396q T[] destination) {
        d2ok.m23075h(destination, "destination");
        int length = destination.length;
        int i2 = this.length;
        if (length < i2) {
            E[] eArr = this.array;
            int i3 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i3, i2 + i3, destination.getClass());
            d2ok.kja0(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i4 = this.offset;
        kja0.ikck(eArr2, destination, 0, i4, i2 + i4);
        int length2 = destination.length;
        int i5 = this.length;
        if (length2 > i5) {
            destination[i5] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    @InterfaceC7396q
    public String toString() {
        return zy.m22464p(this.array, this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    @InterfaceC7396q
    public ListIterator<E> listIterator(int i2) {
        kotlin.collections.zy.Companion.zy(i2, this.length);
        return new C8051toq(this, i2);
    }

    @Override // kotlin.collections.AbstractC6143g, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        zy();
        kotlin.collections.zy.Companion.zy(i2, this.length);
        toq(this.offset + i2, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, @InterfaceC7396q Collection<? extends E> elements) {
        d2ok.m23075h(elements, "elements");
        zy();
        kotlin.collections.zy.Companion.zy(i2, this.length);
        int size = elements.size();
        m22457k(this.offset + i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC7396q
    public Object[] toArray() {
        E[] eArr = this.array;
        int i2 = this.offset;
        return kja0.bek6(eArr, i2, this.length + i2);
    }

    public toq() {
        this(10);
    }

    public toq(int i2) {
        this(zy.m22465q(i2), 0, 0, false, null, null);
    }
}
