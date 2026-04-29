package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.x9kr;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ld6<T> implements qrj<x9kr<? extends T>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36610k;

    /* JADX INFO: renamed from: kotlin.sequences.ld6$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C6404k implements Iterator<x9kr<? extends T>>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36611k;

        /* JADX INFO: renamed from: q */
        private int f36612q;

        C6404k(ld6<T> ld6Var) {
            this.f36611k = ((ld6) ld6Var).f36610k.iterator();
        }

        /* JADX INFO: renamed from: g */
        public final void m23451g(int i2) {
            this.f36612q = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36611k.hasNext();
        }

        /* JADX INFO: renamed from: k */
        public final int m23452k() {
            return this.f36612q;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T> toq() {
            return this.f36611k;
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public x9kr<T> next() {
            int i2 = this.f36612q;
            this.f36612q = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            return new x9kr<>(i2, this.f36611k.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ld6(@InterfaceC7396q qrj<? extends T> sequence) {
        d2ok.m23075h(sequence, "sequence");
        this.f36610k = sequence;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<x9kr<T>> iterator() {
        return new C6404k(this);
    }
}
