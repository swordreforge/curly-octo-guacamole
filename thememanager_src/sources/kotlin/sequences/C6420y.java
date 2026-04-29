package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.sequences.y */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6420y<T> implements qrj<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36643k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f81880toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, Boolean> f81881zy;

    /* JADX INFO: renamed from: kotlin.sequences.y$k */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C6420y<T> f36644g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<T> f36645k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private T f36646n;

        /* JADX INFO: renamed from: q */
        private int f36647q = -1;

        k(C6420y<T> c6420y) {
            this.f36644g = c6420y;
            this.f36645k = ((C6420y) c6420y).f36643k.iterator();
        }

        /* JADX INFO: renamed from: k */
        private final void m23485k() {
            while (this.f36645k.hasNext()) {
                T next = this.f36645k.next();
                if (((Boolean) ((C6420y) this.f36644g).f81881zy.invoke(next)).booleanValue() == ((C6420y) this.f36644g).f81880toq) {
                    this.f36646n = next;
                    this.f36647q = 1;
                    return;
                }
            }
            this.f36647q = 0;
        }

        public final void f7l8(@InterfaceC7395n T t2) {
            this.f36646n = t2;
        }

        /* JADX INFO: renamed from: g */
        public final int m23486g() {
            return this.f36647q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36647q == -1) {
                m23485k();
            }
            return this.f36647q == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f36647q == -1) {
                m23485k();
            }
            if (this.f36647q == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.f36646n;
            this.f36646n = null;
            this.f36647q = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC7396q
        public final Iterator<T> toq() {
            return this.f36645k;
        }

        /* JADX INFO: renamed from: y */
        public final void m23487y(int i2) {
            this.f36647q = i2;
        }

        @InterfaceC7395n
        public final T zy() {
            return this.f36646n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6420y(@InterfaceC7396q qrj<? extends T> sequence, boolean z2, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(sequence, "sequence");
        d2ok.m23075h(predicate, "predicate");
        this.f36643k = sequence;
        this.f81880toq = z2;
        this.f81881zy = predicate;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new k(this);
    }

    public /* synthetic */ C6420y(qrj qrjVar, boolean z2, cyoe.x2 x2Var, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(qrjVar, (i2 & 2) != 0 ? true : z2, x2Var);
    }
}
