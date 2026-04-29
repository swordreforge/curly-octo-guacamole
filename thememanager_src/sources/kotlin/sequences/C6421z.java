package kotlin.sequences;

import cyoe.InterfaceC5979h;
import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.sequences.z */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6421z<T, R> implements qrj<R> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36648k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final InterfaceC5979h<Integer, T, R> f81882toq;

    /* JADX INFO: renamed from: kotlin.sequences.z$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements Iterator<R>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36649k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C6421z<T, R> f36650n;

        /* JADX INFO: renamed from: q */
        private int f36651q;

        k(C6421z<T, R> c6421z) {
            this.f36650n = c6421z;
            this.f36649k = ((C6421z) c6421z).f36648k.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36649k.hasNext();
        }

        /* JADX INFO: renamed from: k */
        public final int m23489k() {
            return this.f36651q;
        }

        @Override // java.util.Iterator
        public R next() {
            InterfaceC5979h interfaceC5979h = ((C6421z) this.f36650n).f81882toq;
            int i2 = this.f36651q;
            this.f36651q = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            return (R) interfaceC5979h.invoke(Integer.valueOf(i2), this.f36649k.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T> toq() {
            return this.f36649k;
        }

        public final void zy(int i2) {
            this.f36651q = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6421z(@InterfaceC7396q qrj<? extends T> sequence, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transformer) {
        d2ok.m23075h(sequence, "sequence");
        d2ok.m23075h(transformer, "transformer");
        this.f36648k = sequence;
        this.f81882toq = transformer;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<R> iterator() {
        return new k(this);
    }
}
