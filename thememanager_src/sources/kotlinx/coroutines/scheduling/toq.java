package kotlinx.coroutines.scheduling;

import kotlin.d3;
import kotlinx.coroutines.scheduling.ExecutorC6714k;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", "k", "toq", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class toq {
    @InterfaceC6769y(name = "isSchedulerWorker")
    /* JADX INFO: renamed from: k */
    public static final boolean m24557k(@InterfaceC7396q Thread thread) {
        return thread instanceof ExecutorC6714k.zy;
    }

    @InterfaceC6769y(name = "mayNotBlock")
    public static final boolean toq(@InterfaceC7396q Thread thread) {
        return (thread instanceof ExecutorC6714k.zy) && ((ExecutorC6714k.zy) thread).f37365q == ExecutorC6714k.q.CPU_ACQUIRED;
    }
}
