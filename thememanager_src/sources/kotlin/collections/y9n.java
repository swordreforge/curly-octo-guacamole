package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes3.dex */
class y9n<T> extends zy<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<T> f36206k;

    /* JADX INFO: renamed from: kotlin.collections.y9n$k */
    /* JADX INFO: compiled from: ReversedViews.kt */
    public static final class C6173k implements ListIterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final ListIterator<T> f36207k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ y9n<T> f36208q;

        /* JADX WARN: Multi-variable type inference failed */
        C6173k(y9n<? extends T> y9nVar, int i2) {
            this.f36208q = y9nVar;
            this.f36207k = ((y9n) y9nVar).f36206k.listIterator(mcp.kcsr(y9nVar, i2));
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36207k.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36207k.hasNext();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ListIterator<T> m22668k() {
            return this.f36207k;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f36207k.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return mcp.yqrt(this.f36208q, this.f36207k.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f36207k.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return mcp.yqrt(this.f36208q, this.f36207k.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y9n(@InterfaceC7396q List<? extends T> delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f36206k = delegate;
    }

    @Override // kotlin.collections.zy, java.util.List
    public T get(int i2) {
        return this.f36206k.get(mcp.z4(this, i2));
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
    public int getSize() {
        return this.f36206k.size();
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.zy, java.util.List
    @InterfaceC7396q
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.zy, java.util.List
    @InterfaceC7396q
    public ListIterator<T> listIterator(int i2) {
        return new C6173k(this, i2);
    }
}
