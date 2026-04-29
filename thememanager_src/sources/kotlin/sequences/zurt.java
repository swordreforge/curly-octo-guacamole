package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class zurt<T> implements qrj<T>, InterfaceC6405n<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36652k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f81883toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f81884zy;

    /* JADX INFO: renamed from: kotlin.sequences.zurt$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C6422k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36653k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ zurt<T> f36654n;

        /* JADX INFO: renamed from: q */
        private int f36655q;

        C6422k(zurt<T> zurtVar) {
            this.f36654n = zurtVar;
            this.f36653k = ((zurt) zurtVar).f36652k.iterator();
        }

        /* JADX INFO: renamed from: k */
        private final void m23493k() {
            while (this.f36655q < ((zurt) this.f36654n).f81883toq && this.f36653k.hasNext()) {
                this.f36653k.next();
                this.f36655q++;
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m23494g(int i2) {
            this.f36655q = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m23493k();
            return this.f36655q < ((zurt) this.f36654n).f81884zy && this.f36653k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m23493k();
            if (this.f36655q >= ((zurt) this.f36654n).f81884zy) {
                throw new NoSuchElementException();
            }
            this.f36655q++;
            return this.f36653k.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T> toq() {
            return this.f36653k;
        }

        public final int zy() {
            return this.f36655q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zurt(@InterfaceC7396q qrj<? extends T> sequence, int i2, int i3) {
        d2ok.m23075h(sequence, "sequence");
        this.f36652k = sequence;
        this.f81883toq = i2;
        this.f81884zy = i3;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i2).toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i3).toString());
        }
        if (i3 >= i2) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i3 + " < " + i2).toString());
    }

    /* JADX INFO: renamed from: g */
    private final int m23490g() {
        return this.f81884zy - this.f81883toq;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new C6422k(this);
    }

    @Override // kotlin.sequences.InterfaceC6405n
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public qrj<T> mo23419k(int i2) {
        return i2 >= m23490g() ? t8r.f7l8() : new zurt(this.f36652k, this.f81883toq + i2, this.f81884zy);
    }

    @Override // kotlin.sequences.InterfaceC6405n
    @InterfaceC7396q
    public qrj<T> toq(int i2) {
        if (i2 >= m23490g()) {
            return this;
        }
        qrj<T> qrjVar = this.f36652k;
        int i3 = this.f81883toq;
        return new zurt(qrjVar, i3, i2 + i3);
    }
}
