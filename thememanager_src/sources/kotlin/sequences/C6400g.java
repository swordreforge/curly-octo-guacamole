package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.sequences.g */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6400g<T> implements qrj<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36604k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, Boolean> f81871toq;

    /* JADX INFO: renamed from: kotlin.sequences.g$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C6400g<T> f36605g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36606k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private T f36607n;

        /* JADX INFO: renamed from: q */
        private int f36608q = -1;

        k(C6400g<T> c6400g) {
            this.f36605g = c6400g;
            this.f36606k = ((C6400g) c6400g).f36604k.iterator();
        }

        /* JADX INFO: renamed from: k */
        private final void m23441k() {
            while (this.f36606k.hasNext()) {
                T next = this.f36606k.next();
                if (!((Boolean) ((C6400g) this.f36605g).f81871toq.invoke(next)).booleanValue()) {
                    this.f36607n = next;
                    this.f36608q = 1;
                    return;
                }
            }
            this.f36608q = 0;
        }

        public final void f7l8(int i2) {
            this.f36608q = i2;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: g */
        public final T m23442g() {
            return this.f36607n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36608q == -1) {
                m23441k();
            }
            return this.f36608q == 1 || this.f36606k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f36608q == -1) {
                m23441k();
            }
            if (this.f36608q != 1) {
                return this.f36606k.next();
            }
            T t2 = this.f36607n;
            this.f36607n = null;
            this.f36608q = 0;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int toq() {
            return this.f36608q;
        }

        /* JADX INFO: renamed from: y */
        public final void m23443y(@InterfaceC7395n T t2) {
            this.f36607n = t2;
        }

        @InterfaceC7396q
        public final Iterator<T> zy() {
            return this.f36606k;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6400g(@InterfaceC7396q qrj<? extends T> sequence, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(sequence, "sequence");
        d2ok.m23075h(predicate, "predicate");
        this.f36604k = sequence;
        this.f81871toq = predicate;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new k(this);
    }
}
