package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.random.AbstractC6332g;
import kotlin.ranges.fn3e;
import kotlin.was;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.lvui;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.k */
/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0003\u00060\u0013B+\u0012\u0006\u0010H\u001a\u00020\f\u0012\u0006\u0010I\u001a\u00020\f\u0012\b\b\u0002\u0010L\u001a\u00020\u000f\u0012\b\b\u0002\u0010O\u001a\u00020B¢\u0006\u0004\b]\u0010^J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0014\u0010I\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010GR\u0014\u0010L\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010QR\u0014\u0010T\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u001e\u0010W\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010VR\u0015\u0010Y\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0015R\u0015\u0010[\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0015R\u0011\u0010\\\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\\\u0010\u001d¨\u0006_"}, d2 = {"Lkotlinx/coroutines/scheduling/k;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/ld6;", "task", "", "k", "(Lkotlinx/coroutines/scheduling/ld6;)Z", "Lkotlinx/coroutines/scheduling/k$zy;", "y9n", "()Lkotlinx/coroutines/scheduling/k$zy;", "worker", "", "yz", "(Lkotlinx/coroutines/scheduling/k$zy;)I", "", "state", "ld6", "(J)I", "q", "f", "()I", "ki", "hyr", "()J", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_H, "()V", "bwp", "()Z", AnimatedProperty.PROPERTY_NAME_X, "skipUnpark", "g1", "(Z)V", "bek6", "(J)Z", "ij", AnimatedProperty.PROPERTY_NAME_Y, "tailDispatch", "ltg8", "(Lkotlinx/coroutines/scheduling/k$zy;Lkotlinx/coroutines/scheduling/ld6;Z)Lkotlinx/coroutines/scheduling/ld6;", "x2", "oldIndex", "newIndex", "a98o", "(Lkotlinx/coroutines/scheduling/k$zy;II)V", "i1", "(Lkotlinx/coroutines/scheduling/k$zy;)Z", "zy", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "t8iq", "(J)V", "block", "Lkotlinx/coroutines/scheduling/x2;", "taskContext", "fu4", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/x2;Z)V", "p", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/x2;)Lkotlinx/coroutines/scheduling/ld6;", "was", "", "toString", "()Ljava/lang/String;", "nmn5", "(Lkotlinx/coroutines/scheduling/ld6;)V", com.market.sdk.reflect.toq.f28131g, "corePoolSize", "maxPoolSize", "n", com.market.sdk.reflect.toq.f68928f7l8, "idleWorkerKeepAliveNs", C7704k.y.toq.f95579toq, "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/g;", "Lkotlinx/coroutines/scheduling/g;", "globalCpuQueue", C7704k.y.toq.f44691k, "globalBlockingQueue", "Lkotlinx/coroutines/internal/lvui;", "Lkotlinx/coroutines/internal/lvui;", "workers", "d2ok", "createdWorkers", "t", "availableCpuPermits", "isTerminated", C4991s.f28129n, "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class ExecutorC6714k implements Executor, Closeable {

    /* JADX INFO: renamed from: a */
    public static final int f37334a = 1;

    /* JADX INFO: renamed from: b */
    private static final long f37335b = 9223367638808264704L;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final long f82057bo = -2097152;

    /* JADX INFO: renamed from: c */
    private static final int f37336c = 1;

    /* JADX INFO: renamed from: e */
    private static final int f37337e = 21;

    /* JADX INFO: renamed from: f */
    private static final int f37338f = 0;

    /* JADX INFO: renamed from: j */
    private static final long f37341j = 2097151;

    /* JADX INFO: renamed from: l */
    private static final int f37342l = -1;

    /* JADX INFO: renamed from: m */
    private static final int f37343m = 42;

    /* JADX INFO: renamed from: o */
    private static final long f37344o = 4398044413952L;

    /* JADX INFO: renamed from: u */
    private static final long f37347u = 2097151;

    /* JADX INFO: renamed from: v */
    private static final long f37348v = 2097152;

    /* JADX INFO: renamed from: x */
    public static final int f37349x = 2097150;

    @InterfaceC7396q
    private volatile /* synthetic */ int _isTerminated;

    @InterfaceC7396q
    volatile /* synthetic */ long controlState;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    public final String f37351g;

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    public final int f37352k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public final long f37353n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @InterfaceC6765n
    public final lvui<zy> f37354p;

    @InterfaceC7396q
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    public final int f37355q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public final C6712g f37356s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public final C6712g f37357y;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    public static final k f37339h = new k(null);

    /* JADX INFO: renamed from: r */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f37345r = new C6679l("NOT_IN_STACK");

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ AtomicLongFieldUpdater f37340i = AtomicLongFieldUpdater.newUpdater(ExecutorC6714k.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: z */
    static final /* synthetic */ AtomicLongFieldUpdater f37350z = AtomicLongFieldUpdater.newUpdater(ExecutorC6714k.class, "controlState");

    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37346t = AtomicIntegerFieldUpdater.newUpdater(ExecutorC6714k.class, "_isTerminated");

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.k$k */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/scheduling/k$k;", "", "", "BLOCKING_MASK", com.market.sdk.reflect.toq.f68928f7l8, "", "BLOCKING_SHIFT", com.market.sdk.reflect.toq.f28131g, "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/l;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/l;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.k$q */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/k$q;", "", C4991s.f28129n, "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public enum q {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.k$toq */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f37359k;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.PARKING.ordinal()] = 1;
            iArr[q.BLOCKING.ordinal()] = 2;
            iArr[q.CPU_ACQUIRED.ordinal()] = 3;
            iArr[q.DORMANT.ordinal()] = 4;
            iArr[q.TERMINATED.ordinal()] = 5;
            f37359k = iArr;
        }
    }

    public ExecutorC6714k(int i2, int i3, long j2, @InterfaceC7396q String str) {
        this.f37352k = i2;
        this.f37355q = i3;
        this.f37353n = j2;
        this.f37351g = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f37357y = new C6712g();
        this.f37356s = new C6712g();
        this.parkedWorkersStack = 0L;
        this.f37354p = new lvui<>(i2 + 1);
        this.controlState = ((long) i2) << 42;
        this._isTerminated = 0;
    }

    private final boolean bek6(long j2) {
        if (fn3e.fn3e(((int) (2097151 & j2)) - ((int) ((j2 & f37344o) >> 21)), 0) < this.f37352k) {
            int iM24544y = m24544y();
            if (iM24544y == 1 && this.f37352k > 1) {
                m24544y();
            }
            if (iM24544y > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean bwp() {
        long j2;
        do {
            j2 = this.controlState;
            if (((int) ((f37335b & j2) >> 42)) == 0) {
                return false;
            }
        } while (!f37350z.compareAndSet(this, j2, j2 - 4398046511104L));
        return true;
    }

    private final int d2ok() {
        return (int) (this.controlState & 2097151);
    }

    /* JADX INFO: renamed from: f */
    private final int m24538f() {
        return (int) (f37350z.incrementAndGet(this) & 2097151);
    }

    private final void g1(boolean z2) {
        long jAddAndGet = f37350z.addAndGet(this, 2097152L);
        if (z2 || ij() || bek6(jAddAndGet)) {
            return;
        }
        ij();
    }

    /* JADX INFO: renamed from: h */
    private final void m24539h() {
        f37350z.addAndGet(this, f82057bo);
    }

    static /* synthetic */ boolean h7am(ExecutorC6714k executorC6714k, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = executorC6714k.controlState;
        }
        return executorC6714k.bek6(j2);
    }

    private final long hyr() {
        return f37350z.addAndGet(this, 2097152L);
    }

    private final boolean ij() {
        zy zyVarY9n;
        do {
            zyVarY9n = y9n();
            if (zyVarY9n == null) {
                return false;
            }
        } while (!zy.f37360h.compareAndSet(zyVarY9n, -1, 0));
        LockSupport.unpark(zyVarY9n);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m24540k(ld6 ld6Var) {
        return ld6Var.f37379q.bwp() == 1 ? this.f37356s.m24419k(ld6Var) : this.f37357y.m24419k(ld6Var);
    }

    private final int ki() {
        return (int) (f37350z.getAndDecrement(this) & 2097151);
    }

    private final int ld6(long j2) {
        return (int) (j2 & 2097151);
    }

    private final ld6 ltg8(zy zyVar, ld6 ld6Var, boolean z2) {
        if (zyVar == null || zyVar.f37365q == q.TERMINATED) {
            return ld6Var;
        }
        if (ld6Var.f37379q.bwp() == 0 && zyVar.f37365q == q.BLOCKING) {
            return ld6Var;
        }
        zyVar.f37366s = true;
        return zyVar.f37362k.m24535k(ld6Var, z2);
    }

    /* JADX INFO: renamed from: q */
    private final int m24541q(long j2) {
        return (int) ((j2 & f37344o) >> 21);
    }

    /* JADX INFO: renamed from: t */
    private final int m24542t() {
        return (int) ((this.controlState & f37335b) >> 42);
    }

    public static /* synthetic */ void wvg(ExecutorC6714k executorC6714k, Runnable runnable, x2 x2Var, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            x2Var = kja0.f37376s;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        executorC6714k.fu4(runnable, x2Var, z2);
    }

    /* JADX INFO: renamed from: x */
    private final long m24543x() {
        return f37350z.addAndGet(this, 4398046511104L);
    }

    private final zy x2() {
        Thread threadCurrentThread = Thread.currentThread();
        zy zyVar = threadCurrentThread instanceof zy ? (zy) threadCurrentThread : null;
        if (zyVar != null && d2ok.f7l8(ExecutorC6714k.this, this)) {
            return zyVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private final int m24544y() {
        synchronized (this.f37354p) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int iFn3e = fn3e.fn3e(i2 - ((int) ((j2 & f37344o) >> 21)), 0);
            if (iFn3e >= this.f37352k) {
                return 0;
            }
            if (i2 >= this.f37355q) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i3 > 0 && this.f37354p.toq(i3) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            zy zyVar = new zy(i3);
            this.f37354p.zy(i3, zyVar);
            if (!(i3 == ((int) (2097151 & f37350z.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            zyVar.start();
            return iFn3e + 1;
        }
    }

    private final zy y9n() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            zy qVar = this.f37354p.toq((int) (2097151 & j2));
            if (qVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & f82057bo;
            int iYz = yz(qVar);
            if (iYz >= 0 && f37340i.compareAndSet(this, j2, ((long) iYz) | j3)) {
                qVar.cdj(f37345r);
                return qVar;
            }
        }
    }

    private final int yz(zy zyVar) {
        Object objM24554y = zyVar.m24554y();
        while (objM24554y != f37345r) {
            if (objM24554y == null) {
                return 0;
            }
            zy zyVar2 = (zy) objM24554y;
            int iF7l8 = zyVar2.f7l8();
            if (iF7l8 != 0) {
                return iF7l8;
            }
            objM24554y = zyVar2.m24554y();
        }
        return -1;
    }

    public final void a98o(@InterfaceC7396q zy zyVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int iYz = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & f82057bo;
            if (iYz == i2) {
                iYz = i3 == 0 ? yz(zyVar) : i3;
            }
            if (iYz >= 0 && f37340i.compareAndSet(this, j2, j3 | ((long) iYz))) {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        t8iq(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC7396q Runnable runnable) {
        wvg(this, runnable, null, false, 6, null);
    }

    public final void fu4(@InterfaceC7396q Runnable runnable, @InterfaceC7396q x2 x2Var, boolean z2) {
        kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
        if (qVar != null) {
            qVar.m24630n();
        }
        ld6 ld6VarM24545p = m24545p(runnable, x2Var);
        zy zyVarX2 = x2();
        ld6 ld6VarLtg8 = ltg8(zyVarX2, ld6VarM24545p, z2);
        if (ld6VarLtg8 != null && !m24540k(ld6VarLtg8)) {
            throw new RejectedExecutionException(d2ok.mcp(this.f37351g, " was terminated"));
        }
        boolean z3 = z2 && zyVarX2 != null;
        if (ld6VarM24545p.f37379q.bwp() != 0) {
            g1(z3);
        } else {
            if (z3) {
                return;
            }
            was();
        }
    }

    public final boolean i1(@InterfaceC7396q zy zyVar) {
        long j2;
        long j3;
        int iF7l8;
        if (zyVar.m24554y() != f37345r) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            j3 = (2097152 + j2) & f82057bo;
            iF7l8 = zyVar.f7l8();
            zyVar.cdj(this.f37354p.toq((int) (2097151 & j2)));
        } while (!f37340i.compareAndSet(this, j2, j3 | ((long) iF7l8)));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void nmn5(@InterfaceC7396q ld6 ld6Var) {
        try {
            ld6Var.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
                if (qVar == null) {
                }
            } finally {
                kotlinx.coroutines.toq qVar2 = kotlinx.coroutines.zy.toq();
                if (qVar2 != null) {
                    qVar2.m24628g();
                }
            }
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final ld6 m24545p(@InterfaceC7396q Runnable runnable, @InterfaceC7396q x2 x2Var) {
        long jMo24556k = kja0.f37371g.mo24556k();
        if (!(runnable instanceof ld6)) {
            return new n7h(runnable, jMo24556k, x2Var);
        }
        ld6 ld6Var = (ld6) runnable;
        ld6Var.f37378k = jMo24556k;
        ld6Var.f37379q = x2Var;
        return ld6Var;
    }

    public final void t8iq(long j2) throws InterruptedException {
        int i2;
        if (f37346t.compareAndSet(this, 0, 1)) {
            zy zyVarX2 = x2();
            synchronized (this.f37354p) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    zy qVar = this.f37354p.toq(i3);
                    d2ok.qrj(qVar);
                    zy zyVar = qVar;
                    if (zyVar != zyVarX2) {
                        while (zyVar.isAlive()) {
                            LockSupport.unpark(zyVar);
                            zyVar.join(j2);
                        }
                        zyVar.f37362k.f7l8(this.f37356s);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.f37356s.toq();
            this.f37357y.toq();
            while (true) {
                ld6 ld6VarM24550g = zyVarX2 == null ? null : zyVarX2.m24550g(true);
                if (ld6VarM24550g == null && (ld6VarM24550g = this.f37357y.f7l8()) == null && (ld6VarM24550g = this.f37356s.f7l8()) == null) {
                    break;
                } else {
                    nmn5(ld6VarM24550g);
                }
            }
            if (zyVarX2 != null) {
                zyVarX2.m24552i(q.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @InterfaceC7396q
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM24366k = this.f37354p.m24366k();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i7 < iM24366k) {
            int i8 = i7 + 1;
            zy qVar = this.f37354p.toq(i7);
            if (qVar != null) {
                int iM24534g = qVar.f37362k.m24534g();
                int i9 = toq.f37359k[qVar.f37365q.ordinal()];
                if (i9 == 1) {
                    i4++;
                } else if (i9 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM24534g);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i9 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM24534g);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i9 == 4) {
                    i5++;
                    if (iM24534g > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM24534g);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i9 == 5) {
                    i6++;
                }
            }
            i7 = i8;
        }
        long j2 = this.controlState;
        return this.f37351g + '@' + C6551e.toq(this) + "[Pool Size {core = " + this.f37352k + ", max = " + this.f37355q + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f37357y.zy() + ", global blocking queue size = " + this.f37356s.zy() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((f37344o & j2) >> 21)) + ", CPUs acquired = " + (this.f37352k - ((int) ((f37335b & j2) >> 42))) + "}]";
    }

    public final void was() {
        if (ij() || h7am(this, 0L, 1, null)) {
            return;
        }
        ij();
    }

    public final int zy(long j2) {
        return (int) ((j2 & f37335b) >> 42);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.k$zy */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @d3(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bE\u0010FB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bE\u0010GJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u00100\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00104R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010)R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0012\u0010D\u001a\u00020B8Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u0010C¨\u0006H"}, d2 = {"Lkotlinx/coroutines/scheduling/k$zy;", "Ljava/lang/Thread;", "", "ki", "()Z", "Lkotlin/was;", "kja0", "()V", "t8r", "ld6", "Lkotlinx/coroutines/scheduling/ld6;", "task", "q", "(Lkotlinx/coroutines/scheduling/ld6;)V", "", "taskMode", "zy", "(I)V", "toq", "qrj", "zurt", "mode", "p", "scanLocalQueue", "n", "(Z)Lkotlinx/coroutines/scheduling/ld6;", "n7h", "()Lkotlinx/coroutines/scheduling/ld6;", "blockingOnly", "fn3e", "Lkotlinx/coroutines/scheduling/k$q;", "newState", "i", "(Lkotlinx/coroutines/scheduling/k$q;)Z", "run", "upperBound", "x2", "(I)I", C7704k.y.toq.f95579toq, "index", "indexInArray", com.market.sdk.reflect.toq.f28131g, "f7l8", "()I", AnimatedProperty.PROPERTY_NAME_H, "Lkotlinx/coroutines/scheduling/cdj;", "k", "Lkotlinx/coroutines/scheduling/cdj;", "localQueue", "Lkotlinx/coroutines/scheduling/k$q;", "state", "", com.market.sdk.reflect.toq.f68928f7l8, "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_Y, "()Ljava/lang/Object;", "cdj", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", C7704k.y.toq.f44691k, com.market.sdk.reflect.toq.f68929toq, "mayHaveLocalTasks", "Lkotlinx/coroutines/scheduling/k;", "()Lkotlinx/coroutines/scheduling/k;", "scheduler", C4991s.f28129n, "(Lkotlinx/coroutines/scheduling/k;)V", "(Lkotlinx/coroutines/scheduling/k;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public final class zy extends Thread {

        /* JADX INFO: renamed from: h */
        static final /* synthetic */ AtomicIntegerFieldUpdater f37360h = AtomicIntegerFieldUpdater.newUpdater(zy.class, "workerCtl");

        /* JADX INFO: renamed from: g */
        private long f37361g;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        @InterfaceC6765n
        public final cdj f37362k;

        /* JADX INFO: renamed from: n */
        private long f37363n;

        @InterfaceC7395n
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @InterfaceC6765n
        public q f37365q;

        /* JADX INFO: renamed from: s */
        @InterfaceC6765n
        public boolean f37366s;

        @InterfaceC7396q
        volatile /* synthetic */ int workerCtl;

        /* JADX INFO: renamed from: y */
        private int f37367y;

        private zy() {
            setDaemon(true);
            this.f37362k = new cdj();
            this.f37365q = q.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC6714k.f37345r;
            this.f37367y = AbstractC6332g.Default.nextInt();
        }

        private final ld6 fn3e(boolean z2) {
            int i2 = (int) (ExecutorC6714k.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iX2 = x2(i2);
            ExecutorC6714k executorC6714k = ExecutorC6714k.this;
            int i3 = 0;
            long jMin = Long.MAX_VALUE;
            while (i3 < i2) {
                i3++;
                iX2++;
                if (iX2 > i2) {
                    iX2 = 1;
                }
                zy qVar = executorC6714k.f37354p.toq(iX2);
                if (qVar != null && qVar != this) {
                    long jLd6 = z2 ? this.f37362k.ld6(qVar.f37362k) : this.f37362k.x2(qVar.f37362k);
                    if (jLd6 == -1) {
                        return this.f37362k.m24537y();
                    }
                    if (jLd6 > 0) {
                        jMin = Math.min(jMin, jLd6);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f37361g = jMin;
            return null;
        }

        private final boolean ki() {
            boolean z2;
            if (this.f37365q != q.CPU_ACQUIRED) {
                ExecutorC6714k executorC6714k = ExecutorC6714k.this;
                while (true) {
                    long j2 = executorC6714k.controlState;
                    if (((int) ((ExecutorC6714k.f37335b & j2) >> 42)) == 0) {
                        z2 = false;
                        break;
                    }
                    if (ExecutorC6714k.f37350z.compareAndSet(executorC6714k, j2, j2 - 4398046511104L)) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    return false;
                }
                this.f37365q = q.CPU_ACQUIRED;
            }
            return true;
        }

        private final void kja0() {
            loop0: while (true) {
                boolean z2 = false;
                while (!ExecutorC6714k.this.isTerminated() && this.f37365q != q.TERMINATED) {
                    ld6 ld6VarM24550g = m24550g(this.f37366s);
                    if (ld6VarM24550g != null) {
                        this.f37361g = 0L;
                        m24549q(ld6VarM24550g);
                    } else {
                        this.f37366s = false;
                        if (this.f37361g == 0) {
                            t8r();
                        } else if (z2) {
                            m24552i(q.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f37361g);
                            this.f37361g = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
                break loop0;
            }
            m24552i(q.TERMINATED);
        }

        private final boolean ld6() {
            return this.nextParkedWorker != ExecutorC6714k.f37345r;
        }

        /* JADX INFO: renamed from: n */
        private final ld6 m24547n(boolean z2) {
            ld6 ld6VarN7h;
            ld6 ld6VarN7h2;
            if (z2) {
                boolean z3 = x2(ExecutorC6714k.this.f37352k * 2) == 0;
                if (z3 && (ld6VarN7h2 = n7h()) != null) {
                    return ld6VarN7h2;
                }
                ld6 ld6VarM24537y = this.f37362k.m24537y();
                if (ld6VarM24537y != null) {
                    return ld6VarM24537y;
                }
                if (!z3 && (ld6VarN7h = n7h()) != null) {
                    return ld6VarN7h;
                }
            } else {
                ld6 ld6VarN7h3 = n7h();
                if (ld6VarN7h3 != null) {
                    return ld6VarN7h3;
                }
            }
            return fn3e(false);
        }

        private final ld6 n7h() {
            if (x2(2) == 0) {
                ld6 ld6VarF7l8 = ExecutorC6714k.this.f37357y.f7l8();
                return ld6VarF7l8 == null ? ExecutorC6714k.this.f37356s.f7l8() : ld6VarF7l8;
            }
            ld6 ld6VarF7l82 = ExecutorC6714k.this.f37356s.f7l8();
            return ld6VarF7l82 == null ? ExecutorC6714k.this.f37357y.f7l8() : ld6VarF7l82;
        }

        /* JADX INFO: renamed from: p */
        private final void m24548p(int i2) {
            this.f37363n = 0L;
            if (this.f37365q == q.PARKING) {
                this.f37365q = q.BLOCKING;
            }
        }

        /* JADX INFO: renamed from: q */
        private final void m24549q(ld6 ld6Var) {
            int iBwp = ld6Var.f37379q.bwp();
            m24548p(iBwp);
            zy(iBwp);
            ExecutorC6714k.this.nmn5(ld6Var);
            toq(iBwp);
        }

        private final void qrj() {
            if (this.f37363n == 0) {
                this.f37363n = System.nanoTime() + ExecutorC6714k.this.f37353n;
            }
            LockSupport.parkNanos(ExecutorC6714k.this.f37353n);
            if (System.nanoTime() - this.f37363n >= 0) {
                this.f37363n = 0L;
                zurt();
            }
        }

        private final void t8r() {
            if (!ld6()) {
                ExecutorC6714k.this.i1(this);
                return;
            }
            this.workerCtl = -1;
            while (ld6() && this.workerCtl == -1 && !ExecutorC6714k.this.isTerminated() && this.f37365q != q.TERMINATED) {
                m24552i(q.PARKING);
                Thread.interrupted();
                qrj();
            }
        }

        private final void toq(int i2) {
            if (i2 == 0) {
                return;
            }
            ExecutorC6714k.f37350z.addAndGet(ExecutorC6714k.this, ExecutorC6714k.f82057bo);
            if (this.f37365q != q.TERMINATED) {
                this.f37365q = q.DORMANT;
            }
        }

        private final void zurt() {
            ExecutorC6714k executorC6714k = ExecutorC6714k.this;
            synchronized (executorC6714k.f37354p) {
                if (executorC6714k.isTerminated()) {
                    return;
                }
                if (((int) (executorC6714k.controlState & 2097151)) <= executorC6714k.f37352k) {
                    return;
                }
                if (f37360h.compareAndSet(this, -1, 1)) {
                    int iF7l8 = f7l8();
                    m24551h(0);
                    executorC6714k.a98o(this, iF7l8, 0);
                    int andDecrement = (int) (ExecutorC6714k.f37350z.getAndDecrement(executorC6714k) & 2097151);
                    if (andDecrement != iF7l8) {
                        zy qVar = executorC6714k.f37354p.toq(andDecrement);
                        d2ok.qrj(qVar);
                        zy zyVar = qVar;
                        executorC6714k.f37354p.zy(iF7l8, zyVar);
                        zyVar.m24551h(iF7l8);
                        executorC6714k.a98o(zyVar, andDecrement, iF7l8);
                    }
                    executorC6714k.f37354p.zy(andDecrement, null);
                    was wasVar = was.f36763k;
                    this.f37365q = q.TERMINATED;
                }
            }
        }

        private final void zy(int i2) {
            if (i2 != 0 && m24552i(q.BLOCKING)) {
                ExecutorC6714k.this.was();
            }
        }

        public final void cdj(@InterfaceC7395n Object obj) {
            this.nextParkedWorker = obj;
        }

        public final int f7l8() {
            return this.indexInArray;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: g */
        public final ld6 m24550g(boolean z2) {
            ld6 ld6VarF7l8;
            if (ki()) {
                return m24547n(z2);
            }
            if (!z2 || (ld6VarF7l8 = this.f37362k.m24537y()) == null) {
                ld6VarF7l8 = ExecutorC6714k.this.f37356s.f7l8();
            }
            return ld6VarF7l8 == null ? fn3e(true) : ld6VarF7l8;
        }

        /* JADX INFO: renamed from: h */
        public final void m24551h(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC6714k.this.f37351g);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m24552i(@InterfaceC7396q q qVar) {
            q qVar2 = this.f37365q;
            boolean z2 = qVar2 == q.CPU_ACQUIRED;
            if (z2) {
                ExecutorC6714k.f37350z.addAndGet(ExecutorC6714k.this, 4398046511104L);
            }
            if (qVar2 != qVar) {
                this.f37365q = qVar;
            }
            return z2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            kja0();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final ExecutorC6714k m24553s() {
            return ExecutorC6714k.this;
        }

        public final int x2(int i2) {
            int i3 = this.f37367y;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f37367y = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public final Object m24554y() {
            return this.nextParkedWorker;
        }

        public zy(int i2) {
            this();
            m24551h(i2);
        }
    }

    public /* synthetic */ ExecutorC6714k(int i2, int i3, long j2, String str, int i4, ni7 ni7Var) {
        this(i2, i3, (i4 & 4) != 0 ? kja0.f37373n : j2, (i4 & 8) != 0 ? kja0.f37372k : str);
    }
}
