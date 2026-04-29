package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p013b.C5717e;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.bo;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\bA\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u001bR\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00106\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00109\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010>\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00108¨\u0006B"}, d2 = {"Lkotlinx/coroutines/nn86;", "Lkotlinx/coroutines/bo;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/was;", "el", "Ljava/lang/Thread;", "yw", "", "zff0", "o5", "task", "ps", "", "now", "Lkotlinx/coroutines/bo$zy;", "delayedTask", "ix", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/ch;", "i1", "run", "rp", "()V", "timeout", "wt", "", AnimatedProperty.PROPERTY_NAME_H, "Ljava/lang/String;", "THREAD_NAME", "i", com.market.sdk.reflect.toq.f68928f7l8, "DEFAULT_KEEP_ALIVE_MS", "z", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "t", com.market.sdk.reflect.toq.f28131g, "FRESH", "r", "ACTIVE", C5717e.f31929a, "SHUTDOWN_REQ", "f", "SHUTDOWN_ACK", "c", "SHUTDOWN", "debugStatus", "cyoe", "()Z", "isShutDown", "r6ty", "isShutdownRequested", "ew", "()Ljava/lang/Thread;", "thread", "yp31", "isThreadPresent", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class nn86 extends bo implements Runnable {

    @InterfaceC7395n
    private static volatile Thread _thread = null;

    /* JADX INFO: renamed from: c */
    private static final int f37308c = 4;
    private static volatile int debugStatus = 0;

    /* JADX INFO: renamed from: f */
    private static final int f37309f = 3;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    public static final String f37310h = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: i */
    private static final long f37311i = 1000;

    /* JADX INFO: renamed from: l */
    private static final int f37312l = 2;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final nn86 f37313p;

    /* JADX INFO: renamed from: r */
    private static final int f37314r = 1;

    /* JADX INFO: renamed from: t */
    private static final int f37315t = 0;

    /* JADX INFO: renamed from: z */
    private static final long f37316z;

    static {
        Long l2;
        nn86 nn86Var = new nn86();
        f37313p = nn86Var;
        AbstractC6741u.o05(nn86Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f37316z = timeUnit.toNanos(l2.longValue());
    }

    private nn86() {
    }

    private final boolean cyoe() {
        return debugStatus == 4;
    }

    private final void el() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private static /* synthetic */ void l05() {
    }

    private final synchronized void o5() {
        if (r6ty()) {
            debugStatus = 3;
            nnh();
            notifyAll();
        }
    }

    private final boolean r6ty() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized Thread yw() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f37310h);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized boolean zff0() {
        if (r6ty()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // kotlinx.coroutines.y2
    @InterfaceC7396q
    protected Thread ew() {
        Thread thread = _thread;
        return thread == null ? yw() : thread;
    }

    @Override // kotlinx.coroutines.bo, kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return z4t(j2, runnable);
    }

    @Override // kotlinx.coroutines.y2
    protected void ix(long j2, @InterfaceC7396q bo.zy zyVar) {
        el();
    }

    @Override // kotlinx.coroutines.bo
    public void ps(@InterfaceC7396q Runnable runnable) {
        if (cyoe()) {
            el();
        }
        super.ps(runnable);
    }

    public final synchronized void rp() {
        debugStatus = 0;
        yw();
        while (debugStatus == 0) {
            wait();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.was wasVar;
        boolean zM58i;
        ixz.f37275k.m24456q(this);
        toq qVar = zy.toq();
        if (qVar != null) {
            qVar.m24631q();
        }
        try {
            if (!zff0()) {
                if (zM58i) {
                    return;
                } else {
                    return;
                }
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jB8 = b8();
                if (jB8 == Long.MAX_VALUE) {
                    toq qVar2 = zy.toq();
                    Long lValueOf = qVar2 == null ? null : Long.valueOf(qVar2.toq());
                    long jNanoTime = lValueOf == null ? System.nanoTime() : lValueOf.longValue();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f37316z + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        o5();
                        toq qVar3 = zy.toq();
                        if (qVar3 != null) {
                            qVar3.m24633y();
                        }
                        if (m58i()) {
                            return;
                        }
                        ew();
                        return;
                    }
                    jB8 = kotlin.ranges.fn3e.mcp(jB8, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (jB8 > 0) {
                    if (r6ty()) {
                        _thread = null;
                        o5();
                        toq qVar4 = zy.toq();
                        if (qVar4 != null) {
                            qVar4.m24633y();
                        }
                        if (m58i()) {
                            return;
                        }
                        ew();
                        return;
                    }
                    toq qVar5 = zy.toq();
                    if (qVar5 == null) {
                        wasVar = null;
                    } else {
                        qVar5.zy(this, jB8);
                        wasVar = kotlin.was.f36763k;
                    }
                    if (wasVar == null) {
                        LockSupport.parkNanos(this, jB8);
                    }
                }
            }
        } finally {
            _thread = null;
            o5();
            toq qVar6 = zy.toq();
            if (qVar6 != null) {
                qVar6.m24633y();
            }
            if (!m58i()) {
                ew();
            }
        }
    }

    @Override // kotlinx.coroutines.bo, kotlinx.coroutines.AbstractC6741u
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void wt(long j2) {
        kotlin.was wasVar;
        long jCurrentTimeMillis = System.currentTimeMillis() + j2;
        if (!r6ty()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                toq qVar = zy.toq();
                if (qVar == null) {
                    wasVar = null;
                } else {
                    qVar.f7l8(thread);
                    wasVar = kotlin.was.f36763k;
                }
                if (wasVar == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            } else {
                wait(j2);
            }
        }
        debugStatus = 0;
    }

    public final boolean yp31() {
        return _thread != null;
    }
}
