package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7624g;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes3.dex */
final class yz<T> extends AbstractC6143g<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<T> f36209k;

    /* JADX INFO: renamed from: kotlin.collections.yz$k */
    /* JADX INFO: compiled from: ReversedViews.kt */
    public static final class C6174k implements ListIterator<T>, InterfaceC7624g {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final ListIterator<T> f36210k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ yz<T> f36211q;

        C6174k(yz<T> yzVar, int i2) {
            this.f36211q = yzVar;
            this.f36210k = ((yz) yzVar).f36209k.listIterator(mcp.kcsr(yzVar, i2));
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            this.f36210k.add(t2);
            this.f36210k.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36210k.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36210k.hasNext();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ListIterator<T> m22670k() {
            return this.f36210k;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f36210k.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return mcp.yqrt(this.f36211q, this.f36210k.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f36210k.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return mcp.yqrt(this.f36211q, this.f36210k.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f36210k.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            this.f36210k.set(t2);
        }
    }

    public yz(@InterfaceC7396q List<T> delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f36209k = delegate;
    }

    @Override // kotlin.collections.AbstractC6143g, java.util.AbstractList, java.util.List
    public void add(int i2, T t2) {
        this.f36209k.add(mcp.kcsr(this, i2), t2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f36209k.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
        return this.f36209k.get(mcp.z4(this, i2));
    }

    @Override // kotlin.collections.AbstractC6143g
    public int getSize() {
        return this.f36209k.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @InterfaceC7396q
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC6143g
    public T removeAt(int i2) {
        return this.f36209k.remove(mcp.z4(this, i2));
    }

    @Override // kotlin.collections.AbstractC6143g, java.util.AbstractList, java.util.List
    public T set(int i2, T t2) {
        return this.f36209k.set(mcp.z4(this, i2), t2);
    }

    @Override // java.util.AbstractList, java.util.List
    @InterfaceC7396q
    public ListIterator<T> listIterator(int i2) {
        return new C6174k(this, i2);
    }
}
