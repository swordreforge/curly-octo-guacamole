package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
final class n7h<T> extends kja0<T> implements Iterator<T>, InterfaceC6216q<was>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private InterfaceC6216q<? super was> f36613g;

    /* JADX INFO: renamed from: k */
    private int f36614k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private Iterator<? extends T> f36615n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private T f36616q;

    private final T ld6() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: y */
    private final Throwable m23453y() {
        int i2 = this.f36614k;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f36614k);
    }

    @Override // kotlin.sequences.kja0
    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public Object mo23450g(@InterfaceC7396q Iterator<? extends T> it, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if (!it.hasNext()) {
            return was.f36763k;
        }
        this.f36615n = it;
        this.f36614k = 2;
        this.f36613g = interfaceC6216q;
        Object objX2 = C6199q.x2();
        if (objX2 == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objX2 == C6199q.x2() ? objX2 : was.f36763k;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return C6217s.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i2 = this.f36614k;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw m23453y();
                }
                Iterator<? extends T> it = this.f36615n;
                d2ok.qrj(it);
                if (it.hasNext()) {
                    this.f36614k = 2;
                    return true;
                }
                this.f36615n = null;
            }
            this.f36614k = 5;
            InterfaceC6216q<? super was> interfaceC6216q = this.f36613g;
            d2ok.qrj(interfaceC6216q);
            this.f36613g = null;
            C6323o.k kVar = C6323o.Companion;
            interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i2 = this.f36614k;
        if (i2 == 0 || i2 == 1) {
            return ld6();
        }
        if (i2 == 2) {
            this.f36614k = 1;
            Iterator<? extends T> it = this.f36615n;
            d2ok.qrj(it);
            return it.next();
        }
        if (i2 != 3) {
            throw m23453y();
        }
        this.f36614k = 0;
        T t2 = this.f36616q;
        this.f36616q = null;
        return t2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        C6318m.n7h(obj);
        this.f36614k = 4;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final InterfaceC6216q<was> m23454s() {
        return this.f36613g;
    }

    @Override // kotlin.sequences.kja0
    @InterfaceC7395n
    public Object toq(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        this.f36616q = t2;
        this.f36614k = 3;
        this.f36613g = interfaceC6216q;
        Object objX2 = C6199q.x2();
        if (objX2 == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objX2 == C6199q.x2() ? objX2 : was.f36763k;
    }

    public final void x2(@InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
        this.f36613g = interfaceC6216q;
    }
}
