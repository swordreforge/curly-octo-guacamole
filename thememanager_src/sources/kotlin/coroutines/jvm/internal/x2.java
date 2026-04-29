package kotlin.coroutines.jvm.internal;

import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RunSuspend.kt */
/* JADX INFO: loaded from: classes3.dex */
final class x2 implements InterfaceC6216q<was> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private C6323o<was> f36256k;

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return C6217s.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final void m22770q(@InterfaceC7395n C6323o<was> c6323o) {
        this.f36256k = c6323o;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        synchronized (this) {
            this.f36256k = C6323o.m28279boximpl(obj);
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            was wasVar = was.f36763k;
        }
    }

    public final void toq() {
        synchronized (this) {
            while (true) {
                C6323o<was> c6323o = this.f36256k;
                if (c6323o == null) {
                    d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    C6318m.n7h(c6323o.m28288unboximpl());
                }
            }
        }
    }

    @InterfaceC7395n
    public final C6323o<was> zy() {
        return this.f36256k;
    }
}
