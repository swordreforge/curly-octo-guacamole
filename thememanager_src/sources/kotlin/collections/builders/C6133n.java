package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.builders.n */
/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6133n<K, V> extends AbstractC6132k<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C6135q<K, V> f36118k;

    public C6133n(@InterfaceC7396q C6135q<K, V> backing) {
        d2ok.m23075h(backing, "backing");
        this.f36118k = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC7396q Collection<? extends Map.Entry<K, V>> elements) {
        d2ok.m23075h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f36118k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        return this.f36118k.containsAllEntries$kotlin_stdlib(elements);
    }

    @InterfaceC7396q
    public final C6135q<K, V> f7l8() {
        return this.f36118k;
    }

    @Override // kotlin.collections.AbstractC6172y, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(@InterfaceC7396q Map.Entry<K, V> element) {
        d2ok.m23075h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractC6172y
    public int getSize() {
        return this.f36118k.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f36118k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @InterfaceC7396q
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f36118k.entriesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.f36118k.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.f36118k.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    @Override // kotlin.collections.builders.AbstractC6132k
    public boolean toq(@InterfaceC7396q Map.Entry<? extends K, ? extends V> element) {
        d2ok.m23075h(element, "element");
        return this.f36118k.containsEntry$kotlin_stdlib(element);
    }

    @Override // kotlin.collections.builders.AbstractC6132k
    public boolean zy(@InterfaceC7396q Map.Entry element) {
        d2ok.m23075h(element, "element");
        return this.f36118k.removeEntry$kotlin_stdlib(element);
    }
}
