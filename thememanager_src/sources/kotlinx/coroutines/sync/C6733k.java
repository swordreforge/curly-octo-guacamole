package kotlinx.coroutines.sync;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.kja0;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.k */
/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/k;", "Lkotlinx/coroutines/kja0;", "", "cause", "Lkotlin/was;", "k", "", "toString", "Lkotlinx/coroutines/sync/s;", "Lkotlinx/coroutines/sync/s;", "segment", "", "q", com.market.sdk.reflect.toq.f28131g, "index", C4991s.f28129n, "(Lkotlinx/coroutines/sync/s;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6733k extends kja0 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C6736s f37422k;

    /* JADX INFO: renamed from: q */
    private final int f37423q;

    public C6733k(@InterfaceC7396q C6736s c6736s, int i2) {
        this.f37422k = c6736s;
        this.f37423q = i2;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ was invoke(Throwable th) {
        mo23837k(th);
        return was.f36763k;
    }

    @Override // kotlinx.coroutines.AbstractC6666h
    /* JADX INFO: renamed from: k */
    public void mo23837k(@InterfaceC7395n Throwable th) {
        this.f37422k.t8r(this.f37423q);
    }

    @InterfaceC7396q
    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f37422k + ", " + this.f37423q + ']';
    }
}
