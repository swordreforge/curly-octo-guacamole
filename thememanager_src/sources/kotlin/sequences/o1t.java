package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o1t<T, R> implements qrj<R> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36620k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, R> f81873toq;

    /* JADX INFO: renamed from: kotlin.sequences.o1t$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C6407k implements Iterator<R>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36621k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ o1t<T, R> f36622q;

        C6407k(o1t<T, R> o1tVar) {
            this.f36622q = o1tVar;
            this.f36621k = ((o1t) o1tVar).f36620k.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36621k.hasNext();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final Iterator<T> m23459k() {
            return this.f36621k;
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((o1t) this.f36622q).f81873toq.invoke(this.f36621k.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o1t(@InterfaceC7396q qrj<? extends T> sequence, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transformer) {
        d2ok.m23075h(sequence, "sequence");
        d2ok.m23075h(transformer, "transformer");
        this.f36620k = sequence;
        this.f81873toq = transformer;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<R> iterator() {
        return new C6407k(this);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final <E> qrj<E> m23458n(@InterfaceC7396q cyoe.x2<? super R, ? extends Iterator<? extends E>> iterator) {
        d2ok.m23075h(iterator, "iterator");
        return new C6410s(this.f36620k, this.f81873toq, iterator);
    }
}
