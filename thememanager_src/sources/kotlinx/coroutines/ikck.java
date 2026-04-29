package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/xwq3;", "q", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/xwq3;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/dd;", "zy", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/dd;", "toq", "Lkotlinx/coroutines/d;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ikck {
    @InterfaceC6533d
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24312k() {
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "from")
    /* JADX INFO: renamed from: q */
    public static final xwq3 m24313q(@InterfaceC7396q ExecutorService executorService) {
        return new C6743v(executorService);
    }

    @InterfaceC7396q
    public static final Executor toq(@InterfaceC7396q dd ddVar) {
        xwq3 xwq3Var = ddVar instanceof xwq3 ? (xwq3) ddVar : null;
        Executor executorDxef = xwq3Var != null ? xwq3Var.dxef() : null;
        return executorDxef == null ? new a98o(ddVar) : executorDxef;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "from")
    public static final dd zy(@InterfaceC7396q Executor executor) {
        a98o a98oVar = executor instanceof a98o ? (a98o) executor : null;
        dd ddVar = a98oVar != null ? a98oVar.f36775k : null;
        return ddVar == null ? new C6743v(executor) : ddVar;
    }
}
