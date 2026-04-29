package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class ni7<T> implements qrj<T>, InterfaceC6405n<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36617k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f81872toq;

    /* JADX INFO: renamed from: kotlin.sequences.ni7$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C6406k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        private int f36618k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final Iterator<T> f36619q;

        C6406k(ni7<T> ni7Var) {
            this.f36618k = ((ni7) ni7Var).f81872toq;
            this.f36619q = ((ni7) ni7Var).f36617k.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36618k > 0 && this.f36619q.hasNext();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final Iterator<T> m23456k() {
            return this.f36619q;
        }

        @Override // java.util.Iterator
        public T next() {
            int i2 = this.f36618k;
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            this.f36618k = i2 - 1;
            return this.f36619q.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int toq() {
            return this.f36618k;
        }

        public final void zy(int i2) {
            this.f36618k = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni7(@InterfaceC7396q qrj<? extends T> sequence, int i2) {
        d2ok.m23075h(sequence, "sequence");
        this.f36617k = sequence;
        this.f81872toq = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new C6406k(this);
    }

    @Override // kotlin.sequences.InterfaceC6405n
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public qrj<T> mo23419k(int i2) {
        int i3 = this.f81872toq;
        return i2 >= i3 ? t8r.f7l8() : new zurt(this.f36617k, i2, i3);
    }

    @Override // kotlin.sequences.InterfaceC6405n
    @InterfaceC7396q
    public qrj<T> toq(int i2) {
        return i2 >= this.f81872toq ? this : new ni7(this.f36617k, i2);
    }
}
