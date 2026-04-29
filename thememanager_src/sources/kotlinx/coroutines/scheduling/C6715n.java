package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.nn86;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.xwq3;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.n */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010.B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b,\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0017\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lkotlinx/coroutines/scheduling/n;", "Lkotlinx/coroutines/xwq3;", "Lkotlinx/coroutines/scheduling/k;", "lw", "Lkotlin/coroutines/f7l8;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "bap7", "h4b", "close", "", "toString", "", "parallelism", "Lkotlinx/coroutines/dd;", "vy", "oki", "Lkotlinx/coroutines/scheduling/x2;", "", "tailDispatch", "gcp", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/x2;Z)V", "n", com.market.sdk.reflect.toq.f28131g, "corePoolSize", C7704k.y.toq.f95579toq, "maxPoolSize", "", AnimatedProperty.PROPERTY_NAME_Y, com.market.sdk.reflect.toq.f68928f7l8, "idleWorkerKeepAliveNs", C7704k.y.toq.f44691k, "Ljava/lang/String;", "schedulerName", "p", "Lkotlinx/coroutines/scheduling/k;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "dxef", "()Ljava/util/concurrent/Executor;", "executor", C4991s.f28129n, "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@nn86
public class C6715n extends xwq3 {

    /* JADX INFO: renamed from: g */
    private final int f37380g;

    /* JADX INFO: renamed from: n */
    private final int f37381n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private ExecutorC6714k f37382p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final String f37383s;

    /* JADX INFO: renamed from: y */
    private final long f37384y;

    public /* synthetic */ C6715n(int i2, int i3, long j2, String str, int i4, ni7 ni7Var) {
        this(i2, i3, j2, (i4 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public static /* synthetic */ dd a5id(C6715n c6715n, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if ((i3 & 1) != 0) {
            i2 = 16;
        }
        return c6715n.vy(i2);
    }

    private final ExecutorC6714k lw() {
        return new ExecutorC6714k(this.f37381n, this.f37380g, this.f37384y, this.f37383s);
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        try {
            ExecutorC6714k.wvg(this.f37382p, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.nn86.f37313p.bap7(f7l8Var, runnable);
        }
    }

    @Override // kotlinx.coroutines.xwq3, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f37382p.close();
    }

    @Override // kotlinx.coroutines.xwq3
    @InterfaceC7396q
    public Executor dxef() {
        return this.f37382p;
    }

    public final void gcp(@InterfaceC7396q Runnable runnable, @InterfaceC7396q x2 x2Var, boolean z2) {
        try {
            this.f37382p.fu4(runnable, x2Var, z2);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.nn86.f37313p.ps(this.f37382p.m24545p(runnable, x2Var));
        }
    }

    @Override // kotlinx.coroutines.dd
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        try {
            ExecutorC6714k.wvg(this.f37382p, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.nn86.f37313p.h4b(f7l8Var, runnable);
        }
    }

    @InterfaceC7396q
    public final dd oki(int i2) {
        if (!(i2 > 0)) {
            throw new IllegalArgumentException(d2ok.mcp("Expected positive parallelism level, but have ", Integer.valueOf(i2)).toString());
        }
        if (i2 <= this.f37381n) {
            return new f7l8(this, i2, null, 0);
        }
        throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f37381n + "), but have " + i2).toString());
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        return super.toString() + "[scheduler = " + this.f37382p + ']';
    }

    @InterfaceC7396q
    public final dd vy(int i2) {
        if (i2 > 0) {
            return new f7l8(this, i2, null, 1);
        }
        throw new IllegalArgumentException(d2ok.mcp("Expected positive parallelism level, but have ", Integer.valueOf(i2)).toString());
    }

    public C6715n(int i2, int i3, long j2, @InterfaceC7396q String str) {
        this.f37381n = i2;
        this.f37380g = i3;
        this.f37384y = j2;
        this.f37383s = str;
        this.f37382p = lw();
    }

    public /* synthetic */ C6715n(int i2, int i3, String str, int i4, ni7 ni7Var) {
        this((i4 & 1) != 0 ? kja0.f82062zy : i2, (i4 & 2) != 0 ? kja0.f37375q : i3, (i4 & 4) != 0 ? kja0.f37372k : str);
    }

    public C6715n(int i2, int i3, @InterfaceC7396q String str) {
        this(i2, i3, kja0.f37373n, str);
    }

    public /* synthetic */ C6715n(int i2, int i3, int i4, ni7 ni7Var) {
        this((i4 & 1) != 0 ? kja0.f82062zy : i2, (i4 & 2) != 0 ? kja0.f37375q : i3);
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ C6715n(int i2, int i3) {
        this(i2, i3, kja0.f37373n, null, 8, null);
    }
}
