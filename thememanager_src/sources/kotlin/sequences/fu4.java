package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class fu4<T> implements qrj<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36599k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, Boolean> f81870toq;

    /* JADX INFO: renamed from: kotlin.sequences.fu4$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C6399k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ fu4<T> f36600g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36601k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private T f36602n;

        /* JADX INFO: renamed from: q */
        private int f36603q = -1;

        C6399k(fu4<T> fu4Var) {
            this.f36600g = fu4Var;
            this.f36601k = ((fu4) fu4Var).f36599k.iterator();
        }

        /* JADX INFO: renamed from: k */
        private final void m23437k() {
            if (this.f36601k.hasNext()) {
                T next = this.f36601k.next();
                if (((Boolean) ((fu4) this.f36600g).f81870toq.invoke(next)).booleanValue()) {
                    this.f36603q = 1;
                    this.f36602n = next;
                    return;
                }
            }
            this.f36603q = 0;
        }

        public final void f7l8(@InterfaceC7395n T t2) {
            this.f36602n = t2;
        }

        /* JADX INFO: renamed from: g */
        public final int m23438g() {
            return this.f36603q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36603q == -1) {
                m23437k();
            }
            return this.f36603q == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f36603q == -1) {
                m23437k();
            }
            if (this.f36603q == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.f36602n;
            this.f36602n = null;
            this.f36603q = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T> toq() {
            return this.f36601k;
        }

        /* JADX INFO: renamed from: y */
        public final void m23439y(int i2) {
            this.f36603q = i2;
        }

        @InterfaceC7395n
        public final T zy() {
            return this.f36602n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fu4(@InterfaceC7396q qrj<? extends T> sequence, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(sequence, "sequence");
        d2ok.m23075h(predicate, "predicate");
        this.f36599k = sequence;
        this.f81870toq = predicate;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new C6399k(this);
    }
}
