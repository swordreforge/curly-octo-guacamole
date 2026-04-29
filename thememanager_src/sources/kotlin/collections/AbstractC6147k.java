package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6308r;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.collections.k */
/* JADX INFO: compiled from: AbstractCollection.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1747#2,3:43\n1726#2,3:46\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:43,3\n22#1:46,3\n*E\n"})
@kotlin.yz(version = "1.1")
public abstract class AbstractC6147k<E> implements Collection<E>, InterfaceC7625k {

    /* JADX INFO: renamed from: kotlin.collections.k$k */
    /* JADX INFO: compiled from: AbstractCollection.kt */
    static final class k extends AbstractC6308r implements cyoe.x2<E, CharSequence> {
        final /* synthetic */ AbstractC6147k<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(AbstractC6147k<? extends E> abstractC6147k) {
            super(1);
            this.this$0 = abstractC6147k;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final CharSequence invoke(E e2) {
            return e2 == this.this$0 ? "(this Collection)" : String.valueOf(e2);
        }
    }

    protected AbstractC6147k() {
    }

    @Override // java.util.Collection
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e2) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.d2ok.f7l8(it.next(), e2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC7396q Collection<? extends Object> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC7396q
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.List
    @InterfaceC7396q
    public Object[] toArray() {
        return kotlin.jvm.internal.zurt.m23171k(this);
    }

    @InterfaceC7396q
    public String toString() {
        return a9.uo(this, ", ", "[", "]", 0, null, new k(this), 24, null);
    }

    @Override // java.util.Collection, java.util.List
    @InterfaceC7396q
    public <T> T[] toArray(@InterfaceC7396q T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        return (T[]) kotlin.jvm.internal.zurt.toq(this, array);
    }
}
