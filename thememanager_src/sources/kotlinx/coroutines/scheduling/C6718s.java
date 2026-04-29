package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.Executor;
import kotlin.d3;
import kotlin.jvm.internal.ni7;
import kotlinx.coroutines.xwq3;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.s */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0014\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\tH\u0016J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/s;", "Lkotlinx/coroutines/xwq3;", "Lkotlinx/coroutines/scheduling/k;", "vy", "Lkotlin/coroutines/f7l8;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "bap7", "h4b", "Lkotlinx/coroutines/scheduling/x2;", "", "tailDispatch", "a5id", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/x2;Z)V", "close", "oki", "()V", "", "timeout", "gcp", "(J)V", "lw", "", "n", com.market.sdk.reflect.toq.f28131g, "corePoolSize", C7704k.y.toq.f95579toq, "maxPoolSize", AnimatedProperty.PROPERTY_NAME_Y, com.market.sdk.reflect.toq.f68928f7l8, "idleWorkerKeepAliveNs", "", C7704k.y.toq.f44691k, "Ljava/lang/String;", "schedulerName", "p", "Lkotlinx/coroutines/scheduling/k;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "dxef", "()Ljava/util/concurrent/Executor;", "executor", C4991s.f28129n, "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class C6718s extends xwq3 {

    /* JADX INFO: renamed from: g */
    private final int f37388g;

    /* JADX INFO: renamed from: n */
    private final int f37389n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private ExecutorC6714k f37390p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final String f37391s;

    /* JADX INFO: renamed from: y */
    private final long f37392y;

    public C6718s() {
        this(0, 0, 0L, null, 15, null);
    }

    public /* synthetic */ C6718s(int i2, int i3, long j2, String str, int i4, ni7 ni7Var) {
        this((i4 & 1) != 0 ? kja0.f82062zy : i2, (i4 & 2) != 0 ? kja0.f37375q : i3, (i4 & 4) != 0 ? kja0.f37373n : j2, (i4 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final ExecutorC6714k vy() {
        return new ExecutorC6714k(this.f37389n, this.f37388g, this.f37392y, this.f37391s);
    }

    public final void a5id(@InterfaceC7396q Runnable runnable, @InterfaceC7396q x2 x2Var, boolean z2) {
        this.f37390p.fu4(runnable, x2Var, z2);
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        ExecutorC6714k.wvg(this.f37390p, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.xwq3, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f37390p.close();
    }

    @Override // kotlinx.coroutines.xwq3
    @InterfaceC7396q
    public Executor dxef() {
        return this.f37390p;
    }

    public final synchronized void gcp(long j2) {
        this.f37390p.t8iq(j2);
    }

    @Override // kotlinx.coroutines.dd
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        ExecutorC6714k.wvg(this.f37390p, runnable, null, true, 2, null);
    }

    public final void lw() {
        oki();
    }

    public final synchronized void oki() {
        this.f37390p.t8iq(1000L);
        this.f37390p = vy();
    }

    public C6718s(int i2, int i3, long j2, @InterfaceC7396q String str) {
        this.f37389n = i2;
        this.f37388g = i3;
        this.f37392y = j2;
        this.f37391s = str;
        this.f37390p = vy();
    }
}
