package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.d3;
import kotlinx.coroutines.xwq3;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lkotlinx/coroutines/scheduling/f7l8;", "Lkotlinx/coroutines/xwq3;", "Lkotlinx/coroutines/scheduling/x2;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "tailDispatch", "Lkotlin/was;", "vy", "(Ljava/lang/Runnable;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lkotlin/coroutines/f7l8;", "context", "bap7", "(Lkotlin/coroutines/f7l8;Ljava/lang/Runnable;)V", "h4b", "", "toString", "()Ljava/lang/String;", "ltg8", "Lkotlinx/coroutines/scheduling/n;", "n", "Lkotlinx/coroutines/scheduling/n;", "dispatcher", "", C7704k.y.toq.f95579toq, com.market.sdk.reflect.toq.f28131g, "parallelism", AnimatedProperty.PROPERTY_NAME_Y, "Ljava/lang/String;", "name", C7704k.y.toq.f44691k, "bwp", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "p", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "dxef", "()Ljava/util/concurrent/Executor;", "executor", C4991s.f28129n, "(Lkotlinx/coroutines/scheduling/n;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class f7l8 extends xwq3 implements x2, Executor {

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37327h = AtomicIntegerFieldUpdater.newUpdater(f7l8.class, "inFlightTasks");

    /* JADX INFO: renamed from: g */
    private final int f37328g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final C6715n f37329n;

    /* JADX INFO: renamed from: s */
    private final int f37331s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private final String f37332y;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final ConcurrentLinkedQueue<Runnable> f37330p = new ConcurrentLinkedQueue<>();

    @InterfaceC7396q
    private volatile /* synthetic */ int inFlightTasks = 0;

    public f7l8(@InterfaceC7396q C6715n c6715n, int i2, @InterfaceC7395n String str, int i3) {
        this.f37329n = c6715n;
        this.f37328g = i2;
        this.f37332y = str;
        this.f37331s = i3;
    }

    private final void vy(Runnable runnable, boolean z2) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37327h;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f37328g) {
                this.f37329n.gcp(runnable, this, z2);
                return;
            }
            this.f37330p.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f37328g) {
                return;
            } else {
                runnable = this.f37330p.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        vy(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.x2
    public int bwp() {
        return this.f37331s;
    }

    @Override // kotlinx.coroutines.xwq3, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.xwq3
    @InterfaceC7396q
    public Executor dxef() {
        return this;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC7396q Runnable runnable) {
        vy(runnable, false);
    }

    @Override // kotlinx.coroutines.dd
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        vy(runnable, true);
    }

    @Override // kotlinx.coroutines.scheduling.x2
    public void ltg8() {
        Runnable runnablePoll = this.f37330p.poll();
        if (runnablePoll != null) {
            this.f37329n.gcp(runnablePoll, this, true);
            return;
        }
        f37327h.decrementAndGet(this);
        Runnable runnablePoll2 = this.f37330p.poll();
        if (runnablePoll2 == null) {
            return;
        }
        vy(runnablePoll2, true);
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        String str = this.f37332y;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f37329n + ']';
    }
}
