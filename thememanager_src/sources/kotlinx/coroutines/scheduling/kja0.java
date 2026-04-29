package kotlinx.coroutines.scheduling;

import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.TimeUnit;
import kotlin.d3;
import kotlin.ranges.fn3e;
import kotlinx.coroutines.internal.C6669c;
import kotlinx.coroutines.internal.hyr;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", "k", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "toq", com.market.sdk.reflect.toq.f68928f7l8, "WORK_STEALING_TIME_RESOLUTION_NS", "", "zy", com.market.sdk.reflect.toq.f28131g, "CORE_POOL_SIZE", "q", "MAX_POOL_SIZE", "n", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/p;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/scheduling/p;", "schedulerTimeSource", "f7l8", "TASK_NON_BLOCKING", AnimatedProperty.PROPERTY_NAME_Y, "TASK_PROBABLY_BLOCKING", "Lkotlinx/coroutines/scheduling/x2;", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/scheduling/x2;", "NonBlockingContext", "p", "BlockingContext", "Lkotlinx/coroutines/scheduling/ld6;", "", "(Lkotlinx/coroutines/scheduling/ld6;)Z", "isBlocking", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f82060f7l8 = 0;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final String f37372k = "DefaultDispatcher";

    /* JADX INFO: renamed from: y */
    public static final int f37377y = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    public static final long f82061toq = C6669c.m24316n("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC6765n
    public static final int f82062zy = C6669c.m24317q("kotlinx.coroutines.scheduler.core.pool.size", fn3e.fn3e(hyr.m24348k(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    public static final int f37375q = C6669c.m24317q("kotlinx.coroutines.scheduler.max.pool.size", ExecutorC6714k.f37349x, 0, ExecutorC6714k.f37349x, 4, null);

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public static final long f37373n = TimeUnit.SECONDS.toNanos(C6669c.m24316n("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    public static AbstractC6716p f37371g = C6719y.f37393k;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f37376s = new qrj(0);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f37374p = new qrj(1);

    /* JADX INFO: renamed from: k */
    public static final boolean m24555k(@InterfaceC7396q ld6 ld6Var) {
        return ld6Var.f37379q.bwp() == 1;
    }
}
