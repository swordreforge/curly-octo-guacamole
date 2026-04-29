package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J#\u0010\t\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0096\u0001J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u001c\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/t8r;", "Lkotlinx/coroutines/dd;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/m;", "block", "Lkotlin/Function0;", "Lkotlin/was;", "dispatch", "vy", "", "a5id", "dxef", "", "time", "bek6", "(JLkotlin/coroutines/q;)Ljava/lang/Object;", "timeMillis", "Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/ch;", "i1", "Lkotlinx/coroutines/cdj;", "continuation", "zy", "", "parallelism", "ga", "run", "bap7", "h4b", "q", "Lkotlinx/coroutines/dd;", "dispatcher", "n", com.market.sdk.reflect.toq.f28131g, "runningWorkers", "Lkotlinx/coroutines/internal/wvg;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/internal/wvg;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", C7704k.y.toq.f44691k, "Ljava/lang/Object;", "workerAllocationLock", C4991s.f28129n, "(Lkotlinx/coroutines/dd;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class t8r extends kotlinx.coroutines.dd implements Runnable, InterfaceC6699m {

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ InterfaceC6699m f37248g;

    /* JADX INFO: renamed from: n */
    private final int f37249n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlinx.coroutines.dd f37250q;
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final Object f37251s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final wvg<Runnable> f37252y;

    /* JADX WARN: Multi-variable type inference failed */
    public t8r(@InterfaceC7396q kotlinx.coroutines.dd ddVar, int i2) {
        this.f37250q = ddVar;
        this.f37249n = i2;
        InterfaceC6699m interfaceC6699m = ddVar instanceof InterfaceC6699m ? (InterfaceC6699m) ddVar : null;
        this.f37248g = interfaceC6699m == null ? kotlinx.coroutines.hb.m24301k() : interfaceC6699m;
        this.f37252y = new wvg<>(false);
        this.f37251s = new Object();
    }

    private final boolean a5id() {
        synchronized (this.f37251s) {
            if (this.runningWorkers >= this.f37249n) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    private final boolean dxef(Runnable runnable) {
        this.f37252y.m24419k(runnable);
        return this.runningWorkers >= this.f37249n;
    }

    private final void vy(Runnable runnable, InterfaceC5981k<was> interfaceC5981k) {
        if (!dxef(runnable) && a5id()) {
            interfaceC5981k.invoke();
        }
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        if (!dxef(runnable) && a5id()) {
            this.f37250q.bap7(this, this);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return this.f37248g.bek6(j2, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    @InterfaceC6533d
    public kotlinx.coroutines.dd ga(int i2) {
        C6675i.m24351k(i2);
        return i2 >= this.f37249n ? this : super.ga(i2);
    }

    @Override // kotlinx.coroutines.dd
    @tfm
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        if (!dxef(runnable) && a5id()) {
            this.f37250q.h4b(this, this);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return this.f37248g.i1(j2, runnable, f7l8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r1 = r4.f37251s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.f37252y.zy() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = kotlin.was.f36763k;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.wvg<java.lang.Runnable> r2 = r4.f37252y
            java.lang.Object r2 = r2.f7l8()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.s r3 = kotlin.coroutines.C6217s.INSTANCE
            kotlinx.coroutines.C6697l.toq(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.dd r2 = r4.f37250q
            boolean r2 = r2.wlev(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.dd r0 = r4.f37250q
            r0.bap7(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f37251s
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.wvg<java.lang.Runnable> r2 = r4.f37252y     // Catch: java.lang.Throwable -> L47
            int r2 = r2.zy()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.was r2 = kotlin.was.f36763k     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.t8r.run():void");
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    public void zy(long j2, @InterfaceC7396q kotlinx.coroutines.cdj<? super was> cdjVar) {
        this.f37248g.zy(j2, cdjVar);
    }
}
