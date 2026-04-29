package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.locks.LockSupport;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7395n;
import v5yj.C7704k;

/* JADX INFO: compiled from: AbstractTimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "k", "zy", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "ld6", "Lkotlin/was;", "f7l8", AnimatedProperty.PROPERTY_NAME_Y, "n", "p", "", "blocker", "nanos", "q", "Ljava/lang/Thread;", "thread", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/toq;", "Lkotlinx/coroutines/toq;", "toq", "()Lkotlinx/coroutines/toq;", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/toq;)V", "timeSource", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private static toq f37492k;

    @InterfaceC6234g
    private static final void f7l8() {
        toq qVar = toq();
        if (qVar == null) {
            return;
        }
        qVar.m24630n();
    }

    /* JADX INFO: renamed from: g */
    public static final void m24666g(@InterfaceC7395n toq toqVar) {
        f37492k = toqVar;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final long m24667k() {
        toq qVar = toq();
        Long lValueOf = qVar == null ? null : Long.valueOf(qVar.m24629k());
        return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
    }

    @InterfaceC6234g
    private static final Runnable ld6(Runnable runnable) {
        Runnable runnableM24632s;
        toq qVar = toq();
        return (qVar == null || (runnableM24632s = qVar.m24632s(runnable)) == null) ? runnable : runnableM24632s;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final void m24668n() {
        toq qVar = toq();
        if (qVar == null) {
            return;
        }
        qVar.m24631q();
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final void m24669p() {
        toq qVar = toq();
        if (qVar == null) {
            return;
        }
        qVar.m24633y();
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final void m24670q(Object obj, long j2) {
        kotlin.was wasVar;
        toq qVar = toq();
        if (qVar == null) {
            wasVar = null;
        } else {
            qVar.zy(obj, j2);
            wasVar = kotlin.was.f36763k;
        }
        if (wasVar == null) {
            LockSupport.parkNanos(obj, j2);
        }
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final void m24671s(Thread thread) {
        kotlin.was wasVar;
        toq qVar = toq();
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

    @InterfaceC7395n
    public static final toq toq() {
        return f37492k;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final void m24672y() {
        toq qVar = toq();
        if (qVar == null) {
            return;
        }
        qVar.m24628g();
    }

    @InterfaceC6234g
    private static final long zy() {
        toq qVar = toq();
        Long lValueOf = qVar == null ? null : Long.valueOf(qVar.toq());
        return lValueOf == null ? System.nanoTime() : lValueOf.longValue();
    }
}
