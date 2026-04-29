package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.internal.C6675i;
import kotlinx.coroutines.internal.C6678k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.u */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u001e¨\u0006*"}, d2 = {"Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/dd;", "", "unconfined", "", "a5id", "b8", "nme", "r25n", "Lkotlinx/coroutines/bf2;", "task", "Lkotlin/was;", "lw", "oki", "dxef", "", "parallelism", "ga", "shutdown", "q", com.market.sdk.reflect.toq.f68928f7l8, "useCount", "n", com.market.sdk.reflect.toq.f68929toq, "shared", "Lkotlinx/coroutines/internal/k;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/internal/k;", "unconfinedQueue", "m58i", "()Z", "isEmpty", "gcp", "()J", "nextTime", "isActive", "cnbm", "isUnconfinedLoopActive", "b9ub", "isUnconfinedQueueEmpty", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class AbstractC6741u extends dd {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private C6678k<bf2<?>> f37466g;

    /* JADX INFO: renamed from: n */
    private boolean f37467n;

    /* JADX INFO: renamed from: q */
    private long f37468q;

    private final long a5id(boolean z2) {
        return z2 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void o05(AbstractC6741u abstractC6741u, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        abstractC6741u.oki(z2);
    }

    public static /* synthetic */ void vy(AbstractC6741u abstractC6741u, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        abstractC6741u.dxef(z2);
    }

    public long b8() {
        return !nme() ? Long.MAX_VALUE : 0L;
    }

    public final boolean b9ub() {
        C6678k<bf2<?>> c6678k = this.f37466g;
        if (c6678k == null) {
            return true;
        }
        return c6678k.m24356q();
    }

    public final boolean cnbm() {
        return this.f37468q >= a5id(true);
    }

    public final void dxef(boolean z2) {
        long jA5id = this.f37468q - a5id(z2);
        this.f37468q = jA5id;
        if (jA5id <= 0 && this.f37467n) {
            shutdown();
        }
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public final dd ga(int i2) {
        C6675i.m24351k(i2);
        return this;
    }

    protected long gcp() {
        C6678k<bf2<?>> c6678k = this.f37466g;
        return (c6678k == null || c6678k.m24356q()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean isActive() {
        return this.f37468q > 0;
    }

    public final void lw(@InterfaceC7396q bf2<?> bf2Var) {
        C6678k<bf2<?>> c6678k = this.f37466g;
        if (c6678k == null) {
            c6678k = new C6678k<>();
            this.f37466g = c6678k;
        }
        c6678k.m24354k(bf2Var);
    }

    protected boolean m58i() {
        return b9ub();
    }

    public final boolean nme() {
        bf2<?> bf2VarM24355n;
        C6678k<bf2<?>> c6678k = this.f37466g;
        if (c6678k == null || (bf2VarM24355n = c6678k.m24355n()) == null) {
            return false;
        }
        bf2VarM24355n.run();
        return true;
    }

    public final void oki(boolean z2) {
        this.f37468q += a5id(z2);
        if (z2) {
            return;
        }
        this.f37467n = true;
    }

    public boolean r25n() {
        return false;
    }

    public void shutdown() {
    }
}
