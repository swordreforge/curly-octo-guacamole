package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.Executor;
import kotlin.coroutines.C6217s;
import kotlin.d3;
import kotlin.ranges.fn3e;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.internal.C6669c;
import kotlinx.coroutines.internal.hyr;
import kotlinx.coroutines.tfm;
import kotlinx.coroutines.xwq3;
import kotlinx.coroutines.zp;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/scheduling/zy;", "Lkotlinx/coroutines/xwq3;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/was;", "execute", "", "parallelism", "Lkotlinx/coroutines/dd;", "ga", "Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/Runnable;", "block", "bap7", "h4b", "close", "", "toString", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/dd;", "default", "dxef", "()Ljava/util/concurrent/Executor;", "executor", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class zy extends xwq3 implements Executor {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final zy f37395n = new zy();

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final dd f37394g = C6713h.f37333q.ga(C6669c.m24317q(zp.f37489k, fn3e.fn3e(64, hyr.m24348k()), 0, 0, 12, null));

    private zy() {
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        f37394g.bap7(f7l8Var, runnable);
    }

    @Override // kotlinx.coroutines.xwq3, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // kotlinx.coroutines.xwq3
    @InterfaceC7396q
    public Executor dxef() {
        return this;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC7396q Runnable runnable) {
        bap7(C6217s.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    @InterfaceC6533d
    public dd ga(int i2) {
        return C6713h.f37333q.ga(i2);
    }

    @Override // kotlinx.coroutines.dd
    @tfm
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        f37394g.h4b(f7l8Var, runnable);
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        return "Dispatchers.IO";
    }
}
