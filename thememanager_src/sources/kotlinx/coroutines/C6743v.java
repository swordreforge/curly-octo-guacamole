package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.internal.C6673g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.v */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/xwq3;", "Lkotlinx/coroutines/m;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/f7l8;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "a5id", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/was;", "vy", "bap7", "Lkotlinx/coroutines/cdj;", "continuation", "zy", "Lkotlinx/coroutines/ch;", "i1", "close", "", "toString", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", "n", "Ljava/util/concurrent/Executor;", "dxef", "()Ljava/util/concurrent/Executor;", "executor", C4991s.f28129n, "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6743v extends xwq3 implements InterfaceC6699m {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Executor f37470n;

    public C6743v(@InterfaceC7396q Executor executor) {
        this.f37470n = executor;
        C6673g.zy(dxef());
    }

    private final ScheduledFuture<?> a5id(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.f7l8 f7l8Var, long j2) {
        try {
            return scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            vy(f7l8Var, e2);
            return null;
        }
    }

    private final void vy(kotlin.coroutines.f7l8 f7l8Var, RejectedExecutionException rejectedExecutionException) {
        ltg8.m24478g(f7l8Var, dr.m24039k("The task was rejected", rejectedExecutionException));
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        Runnable runnableM24632s;
        try {
            Executor executorDxef = dxef();
            toq qVar = zy.toq();
            if (qVar == null || (runnableM24632s = qVar.m24632s(runnable)) == null) {
                runnableM24632s = runnable;
            }
            executorDxef.execute(runnableM24632s);
        } catch (RejectedExecutionException e2) {
            toq qVar2 = zy.toq();
            if (qVar2 != null) {
                qVar2.m24628g();
            }
            vy(f7l8Var, e2);
            C6481a.zy().bap7(f7l8Var, runnable);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        return InterfaceC6699m.k.m24489k(this, j2, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.xwq3, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorDxef = dxef();
        ExecutorService executorService = executorDxef instanceof ExecutorService ? (ExecutorService) executorDxef : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    @Override // kotlinx.coroutines.xwq3
    @InterfaceC7396q
    public Executor dxef() {
        return this.f37470n;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof C6743v) && ((C6743v) obj).dxef() == dxef();
    }

    public int hashCode() {
        return System.identityHashCode(dxef());
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        Executor executorDxef = dxef();
        ScheduledExecutorService scheduledExecutorService = executorDxef instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorDxef : null;
        ScheduledFuture<?> scheduledFutureA5id = scheduledExecutorService != null ? a5id(scheduledExecutorService, runnable, f7l8Var, j2) : null;
        return scheduledFutureA5id != null ? new C6745x(scheduledFutureA5id) : nn86.f37313p.i1(j2, runnable, f7l8Var);
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        return dxef().toString();
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    public void zy(long j2, @InterfaceC7396q cdj<? super kotlin.was> cdjVar) {
        Executor executorDxef = dxef();
        ScheduledExecutorService scheduledExecutorService = executorDxef instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorDxef : null;
        ScheduledFuture<?> scheduledFutureA5id = scheduledExecutorService != null ? a5id(scheduledExecutorService, new ktq(this, cdjVar), cdjVar.getContext(), j2) : null;
        if (scheduledFutureA5id != null) {
            ltg8.ni7(cdjVar, scheduledFutureA5id);
        } else {
            nn86.f37313p.zy(j2, cdjVar);
        }
    }
}
