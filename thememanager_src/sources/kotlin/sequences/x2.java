package kotlin.sequences;

import cyoe.InterfaceC5979h;
import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x2<T1, T2, V> implements qrj<V> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T1> f36639k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final qrj<T2> f81878toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final InterfaceC5979h<T1, T2, V> f81879zy;

    /* JADX INFO: renamed from: kotlin.sequences.x2$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C6419k implements Iterator<V>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T1> f36640k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ x2<T1, T2, V> f36641n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final Iterator<T2> f36642q;

        C6419k(x2<T1, T2, V> x2Var) {
            this.f36641n = x2Var;
            this.f36640k = ((x2) x2Var).f36639k.iterator();
            this.f36642q = ((x2) x2Var).f81878toq.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36640k.hasNext() && this.f36642q.hasNext();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final Iterator<T1> m23482k() {
            return this.f36640k;
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((x2) this.f36641n).f81879zy.invoke(this.f36640k.next(), this.f36642q.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T2> toq() {
            return this.f36642q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x2(@InterfaceC7396q qrj<? extends T1> sequence1, @InterfaceC7396q qrj<? extends T2> sequence2, @InterfaceC7396q InterfaceC5979h<? super T1, ? super T2, ? extends V> transform) {
        d2ok.m23075h(sequence1, "sequence1");
        d2ok.m23075h(sequence2, "sequence2");
        d2ok.m23075h(transform, "transform");
        this.f36639k = sequence1;
        this.f81878toq = sequence2;
        this.f81879zy = transform;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<V> iterator() {
        return new C6419k(this);
    }
}
