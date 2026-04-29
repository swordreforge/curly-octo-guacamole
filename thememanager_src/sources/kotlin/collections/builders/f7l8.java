package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC6156n;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f7l8<V> extends AbstractC6156n<V> implements Collection<V>, r6ty.toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C6135q<?, V> f36116k;

    public f7l8(@InterfaceC7396q C6135q<?, V> backing) {
        d2ok.m23075h(backing, "backing");
        this.f36116k = backing;
    }

    @Override // kotlin.collections.AbstractC6156n, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@InterfaceC7396q Collection<? extends V> elements) {
        d2ok.m23075h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f36116k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f36116k.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f36116k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @InterfaceC7396q
    public Iterator<V> iterator() {
        return this.f36116k.valuesIterator$kotlin_stdlib();
    }

    @Override // kotlin.collections.AbstractC6156n
    /* JADX INFO: renamed from: k */
    public int mo22439k() {
        return this.f36116k.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f36116k.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.f36116k.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.f36116k.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    @InterfaceC7396q
    public final C6135q<?, V> toq() {
        return this.f36116k;
    }
}
