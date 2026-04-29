package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.s */
/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/bo;", "Ljava/lang/Thread;", "p", "Ljava/lang/Thread;", "ew", "()Ljava/lang/Thread;", "thread", C4991s.f28129n, "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6711s extends bo {

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final Thread f37323p;

    public C6711s(@InterfaceC7396q Thread thread) {
        this.f37323p = thread;
    }

    @Override // kotlinx.coroutines.y2
    @InterfaceC7396q
    protected Thread ew() {
        return this.f37323p;
    }
}
