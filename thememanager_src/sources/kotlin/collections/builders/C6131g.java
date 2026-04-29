package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC6172y;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7628y;

/* JADX INFO: renamed from: kotlin.collections.builders.g */
/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6131g<E> extends AbstractC6172y<E> implements Set<E>, InterfaceC7628y {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C6135q<E, ?> f36117k;

    public C6131g(@InterfaceC7396q C6135q<E, ?> backing) {
        d2ok.m23075h(backing, "backing");
        this.f36117k = backing;
    }

    @Override // kotlin.collections.AbstractC6172y, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC7396q Collection<? extends E> elements) {
        d2ok.m23075h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f36117k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f36117k.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC6172y
    public int getSize() {
        return this.f36117k.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f36117k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @InterfaceC7396q
    public Iterator<E> iterator() {
        return this.f36117k.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f36117k.removeKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.f36117k.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.f36117k.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
