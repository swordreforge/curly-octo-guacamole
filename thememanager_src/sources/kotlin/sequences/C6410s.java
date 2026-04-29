package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.sequences.s */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6410s<T, R, E> implements qrj<E> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36630k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, R> f81876toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<R, Iterator<E>> f81877zy;

    /* JADX INFO: renamed from: kotlin.sequences.s$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements Iterator<E>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36631k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C6410s<T, R, E> f36632n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private Iterator<? extends E> f36633q;

        k(C6410s<T, R, E> c6410s) {
            this.f36632n = c6410s;
            this.f36631k = ((C6410s) c6410s).f36630k.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            return true;
         */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean m23468k() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f36633q
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f36633q = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f36633q
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f36631k
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f36631k
                java.lang.Object r0 = r0.next()
                kotlin.sequences.s<T, R, E> r3 = r5.f36632n
                cyoe.x2 r3 = kotlin.sequences.C6410s.zy(r3)
                kotlin.sequences.s<T, R, E> r4 = r5.f36632n
                cyoe.x2 r4 = kotlin.sequences.C6410s.m23466n(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f36633q = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.C6410s.k.m23468k():boolean");
        }

        /* JADX INFO: renamed from: g */
        public final void m23469g(@InterfaceC7395n Iterator<? extends E> it) {
            this.f36633q = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return m23468k();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!m23468k()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f36633q;
            d2ok.qrj(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7395n
        public final Iterator<E> toq() {
            return this.f36633q;
        }

        @InterfaceC7396q
        public final Iterator<T> zy() {
            return this.f36631k;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6410s(@InterfaceC7396q qrj<? extends T> sequence, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transformer, @InterfaceC7396q cyoe.x2<? super R, ? extends Iterator<? extends E>> iterator) {
        d2ok.m23075h(sequence, "sequence");
        d2ok.m23075h(transformer, "transformer");
        d2ok.m23075h(iterator, "iterator");
        this.f36630k = sequence;
        this.f81876toq = transformer;
        this.f81877zy = iterator;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<E> iterator() {
        return new k(this);
    }
}
