package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.d3;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/cdj;", "", "Lkotlinx/coroutines/scheduling/ld6;", "task", "zy", "(Lkotlinx/coroutines/scheduling/ld6;)Lkotlinx/coroutines/scheduling/ld6;", "victim", "", "blockingOnly", "", "qrj", "(Lkotlinx/coroutines/scheduling/cdj;Z)J", "Lkotlinx/coroutines/scheduling/g;", "queue", "p", "(Lkotlinx/coroutines/scheduling/g;)Z", C7704k.y.toq.f44691k, "()Lkotlinx/coroutines/scheduling/ld6;", "Lkotlin/was;", "q", "(Lkotlinx/coroutines/scheduling/ld6;)V", AnimatedProperty.PROPERTY_NAME_Y, "fair", "k", "(Lkotlinx/coroutines/scheduling/ld6;Z)Lkotlinx/coroutines/scheduling/ld6;", "x2", "(Lkotlinx/coroutines/scheduling/cdj;)J", "ld6", "globalQueue", "f7l8", "(Lkotlinx/coroutines/scheduling/g;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "n", "()I", "bufferSize", C7704k.y.toq.f95579toq, "size", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class cdj {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82055toq = AtomicReferenceFieldUpdater.newUpdater(cdj.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f82056zy = AtomicIntegerFieldUpdater.newUpdater(cdj.class, "producerIndex");

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37325q = AtomicIntegerFieldUpdater.newUpdater(cdj.class, "consumerIndex");

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37324n = AtomicIntegerFieldUpdater.newUpdater(cdj.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final AtomicReferenceArray<ld6> f37326k = new AtomicReferenceArray<>(128);

    @InterfaceC7396q
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @InterfaceC7396q
    private volatile /* synthetic */ int producerIndex = 0;

    @InterfaceC7396q
    private volatile /* synthetic */ int consumerIndex = 0;

    @InterfaceC7396q
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: p */
    private final boolean m24531p(C6712g c6712g) {
        ld6 ld6VarM24533s = m24533s();
        if (ld6VarM24533s == null) {
            return false;
        }
        c6712g.m24419k(ld6VarM24533s);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private final void m24532q(ld6 ld6Var) {
        if (ld6Var != null) {
            if (ld6Var.f37379q.bwp() == 1) {
                f37324n.decrementAndGet(this);
            }
        }
    }

    private final long qrj(cdj cdjVar, boolean z2) {
        ld6 ld6Var;
        do {
            ld6Var = (ld6) cdjVar.lastScheduledTask;
            if (ld6Var == null) {
                return -2L;
            }
            if (z2) {
                if (!(ld6Var.f37379q.bwp() == 1)) {
                    return -2L;
                }
            }
            long jMo24556k = kja0.f37371g.mo24556k() - ld6Var.f37378k;
            long j2 = kja0.f82061toq;
            if (jMo24556k < j2) {
                return j2 - jMo24556k;
            }
        } while (!androidx.concurrent.futures.toq.m906k(f82055toq, cdjVar, ld6Var, null));
        toq(this, ld6Var, false, 2, null);
        return -1L;
    }

    /* JADX INFO: renamed from: s */
    private final ld6 m24533s() {
        ld6 andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f37325q.compareAndSet(this, i2, i2 + 1) && (andSet = this.f37326k.getAndSet(i3, null)) != null) {
                m24532q(andSet);
                return andSet;
            }
        }
    }

    public static /* synthetic */ ld6 toq(cdj cdjVar, ld6 ld6Var, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return cdjVar.m24535k(ld6Var, z2);
    }

    private final ld6 zy(ld6 ld6Var) {
        if (ld6Var.f37379q.bwp() == 1) {
            f37324n.incrementAndGet(this);
        }
        if (m24536n() == 127) {
            return ld6Var;
        }
        int i2 = this.producerIndex & 127;
        while (this.f37326k.get(i2) != null) {
            Thread.yield();
        }
        this.f37326k.lazySet(i2, ld6Var);
        f82056zy.incrementAndGet(this);
        return null;
    }

    public final void f7l8(@InterfaceC7396q C6712g c6712g) {
        ld6 ld6Var = (ld6) f82055toq.getAndSet(this, null);
        if (ld6Var != null) {
            c6712g.m24419k(ld6Var);
        }
        while (m24531p(c6712g)) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m24534g() {
        return this.lastScheduledTask != null ? m24536n() + 1 : m24536n();
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final ld6 m24535k(@InterfaceC7396q ld6 ld6Var, boolean z2) {
        if (z2) {
            return zy(ld6Var);
        }
        ld6 ld6Var2 = (ld6) f82055toq.getAndSet(this, ld6Var);
        if (ld6Var2 == null) {
            return null;
        }
        return zy(ld6Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return qrj(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ld6(@mub.InterfaceC7396q kotlinx.coroutines.scheduling.cdj r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.ld6> r2 = r9.f37326k
        L6:
            r3 = 1
            if (r0 == r1) goto L3b
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L3b
        L10:
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.ld6 r5 = (kotlinx.coroutines.scheduling.ld6) r5
            if (r5 == 0) goto L38
            kotlinx.coroutines.scheduling.x2 r6 = r5.f37379q
            int r6 = r6.bwp()
            r7 = 0
            if (r6 != r3) goto L22
            goto L23
        L22:
            r3 = r7
        L23:
            if (r3 == 0) goto L38
            r3 = 0
            boolean r4 = com.google.common.util.concurrent.C4849x.m17025k(r2, r4, r5, r3)
            if (r4 == 0) goto L38
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.cdj.f37324n
            r0.decrementAndGet(r9)
            r9 = 2
            toq(r8, r5, r7, r9, r3)
            r0 = -1
            return r0
        L38:
            int r0 = r0 + 1
            goto L6
        L3b:
            long r0 = r8.qrj(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.cdj.ld6(kotlinx.coroutines.scheduling.cdj):long");
    }

    /* JADX INFO: renamed from: n */
    public final int m24536n() {
        return this.producerIndex - this.consumerIndex;
    }

    public final long x2(@InterfaceC7396q cdj cdjVar) {
        ld6 ld6VarM24533s = cdjVar.m24533s();
        if (ld6VarM24533s == null) {
            return qrj(cdjVar, false);
        }
        toq(this, ld6VarM24533s, false, 2, null);
        return -1L;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final ld6 m24537y() {
        ld6 ld6Var = (ld6) f82055toq.getAndSet(this, null);
        return ld6Var == null ? m24533s() : ld6Var;
    }
}
