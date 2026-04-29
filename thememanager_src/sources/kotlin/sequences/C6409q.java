package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.sequences.q */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C6409q<T> implements qrj<T>, InterfaceC6405n<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36627k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f81875toq;

    /* JADX INFO: renamed from: kotlin.sequences.q$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36628k;

        /* JADX INFO: renamed from: q */
        private int f36629q;

        k(C6409q<T> c6409q) {
            this.f36628k = ((C6409q) c6409q).f36627k.iterator();
            this.f36629q = ((C6409q) c6409q).f81875toq;
        }

        /* JADX INFO: renamed from: k */
        private final void m23464k() {
            while (this.f36629q > 0 && this.f36628k.hasNext()) {
                this.f36628k.next();
                this.f36629q--;
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m23465g(int i2) {
            this.f36629q = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m23464k();
            return this.f36628k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m23464k();
            return this.f36628k.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T> toq() {
            return this.f36628k;
        }

        public final int zy() {
            return this.f36629q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6409q(@InterfaceC7396q qrj<? extends T> sequence, int i2) {
        d2ok.m23075h(sequence, "sequence");
        this.f36627k = sequence;
        this.f81875toq = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new k(this);
    }

    @Override // kotlin.sequences.InterfaceC6405n
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public qrj<T> mo23419k(int i2) {
        int i3 = this.f81875toq + i2;
        return i3 < 0 ? new C6409q(this, i2) : new C6409q(this.f36627k, i3);
    }

    @Override // kotlin.sequences.InterfaceC6405n
    @InterfaceC7396q
    public qrj<T> toq(int i2) {
        int i3 = this.f81875toq;
        int i4 = i3 + i2;
        return i4 < 0 ? new ni7(this, i2) : new zurt(this.f36627k, i3, i4);
    }
}
