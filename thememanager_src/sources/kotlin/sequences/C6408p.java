package kotlin.sequences;

import cyoe.InterfaceC5981k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.sequences.p */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6408p<T> implements qrj<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC5981k<T> f36623k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, T> f81874toq;

    /* JADX INFO: renamed from: kotlin.sequences.p$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private T f36624k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C6408p<T> f36625n;

        /* JADX INFO: renamed from: q */
        private int f36626q = -2;

        k(C6408p<T> c6408p) {
            this.f36625n = c6408p;
        }

        /* JADX INFO: renamed from: k */
        private final void m23461k() {
            T t2;
            if (this.f36626q == -2) {
                t2 = (T) ((C6408p) this.f36625n).f36623k.invoke();
            } else {
                cyoe.x2 x2Var = ((C6408p) this.f36625n).f81874toq;
                T t3 = this.f36624k;
                d2ok.qrj(t3);
                t2 = (T) x2Var.invoke(t3);
            }
            this.f36624k = t2;
            this.f36626q = t2 == null ? 0 : 1;
        }

        public final void f7l8(int i2) {
            this.f36626q = i2;
        }

        /* JADX INFO: renamed from: g */
        public final void m23462g(@InterfaceC7395n T t2) {
            this.f36624k = t2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36626q < 0) {
                m23461k();
            }
            return this.f36626q == 1;
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        public T next() {
            if (this.f36626q < 0) {
                m23461k();
            }
            if (this.f36626q == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.f36624k;
            d2ok.n7h(t2, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f36626q = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7395n
        public final T toq() {
            return this.f36624k;
        }

        public final int zy() {
            return this.f36626q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6408p(@InterfaceC7396q InterfaceC5981k<? extends T> getInitialValue, @InterfaceC7396q cyoe.x2<? super T, ? extends T> getNextValue) {
        d2ok.m23075h(getInitialValue, "getInitialValue");
        d2ok.m23075h(getNextValue, "getNextValue");
        this.f36623k = getInitialValue;
        this.f81874toq = getNextValue;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new k(this);
    }
}
