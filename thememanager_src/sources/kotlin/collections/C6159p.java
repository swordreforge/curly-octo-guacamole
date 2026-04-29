package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6309s;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.collections.p */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1726#2,3:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:482,3\n*E\n"})
final class C6159p<T> implements Collection<T>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final T[] f36185k;

    /* JADX INFO: renamed from: q */
    private final boolean f36186q;

    public C6159p(@InterfaceC7396q T[] values, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(values, "values");
        this.f36185k = values;
        this.f36186q = z2;
    }

    @Override // java.util.Collection
    public boolean add(T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C6144h.ph5d(this.f36185k, obj);
    }

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

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f36185k.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return C6309s.m23145k(this.f36185k);
    }

    /* JADX INFO: renamed from: k */
    public int m22595k() {
        return this.f36185k.length;
    }

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
        return m22595k();
    }

    @Override // java.util.Collection
    @InterfaceC7396q
    public final Object[] toArray() {
        return zurt.m22679y(this.f36185k, this.f36186q);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        return (T[]) kotlin.jvm.internal.zurt.toq(this, array);
    }

    @InterfaceC7396q
    public final T[] toq() {
        return this.f36185k;
    }

    public final boolean zy() {
        return this.f36186q;
    }
}
