package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.bo;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/y2;", "Lkotlinx/coroutines/u;", "Lkotlin/was;", "kx3", "", "now", "Lkotlinx/coroutines/bo$zy;", "delayedTask", "ix", "Ljava/lang/Thread;", "ew", "()Ljava/lang/Thread;", "thread", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class y2 extends AbstractC6741u {
    @InterfaceC7396q
    protected abstract Thread ew();

    protected void ix(long j2, @InterfaceC7396q bo.zy zyVar) {
        nn86.f37313p.uf(j2, zyVar);
    }

    protected final void kx3() {
        kotlin.was wasVar;
        Thread threadEw = ew();
        if (Thread.currentThread() != threadEw) {
            toq qVar = zy.toq();
            if (qVar == null) {
                wasVar = null;
            } else {
                qVar.f7l8(threadEw);
                wasVar = kotlin.was.f36763k;
            }
            if (wasVar == null) {
                LockSupport.unpark(threadEw);
            }
        }
    }
}
