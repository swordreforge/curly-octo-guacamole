package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6480z;
import kotlinx.coroutines.internal.AbstractC6693y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.y */
/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u001b\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\u001f\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/y;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "ld6", "(Lcyoe/k;)Lkotlinx/coroutines/internal/y;", "value", "", "qrj", "(Lkotlinx/coroutines/internal/y;)Z", "Lkotlin/was;", "toq", "()V", "p", "()Z", "x2", "n", "()Ljava/lang/Object;", "nextOrClosed", "zy", "()Lkotlinx/coroutines/internal/y;", "leftmostAliveNode", AnimatedProperty.PROPERTY_NAME_Y, "rightmostAliveNode", "q", "next", C7704k.y.toq.f44691k, "isTail", C7704k.y.toq.f95579toq, "prev", "f7l8", "removed", C4991s.f28129n, "(Lkotlinx/coroutines/internal/y;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class AbstractC6693y<N extends AbstractC6693y<N>> {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37265k = AtomicReferenceFieldUpdater.newUpdater(AbstractC6693y.class, Object.class, "_next");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82041toq = AtomicReferenceFieldUpdater.newUpdater(AbstractC6693y.class, Object.class, "_prev");

    @InterfaceC7396q
    private volatile /* synthetic */ Object _next = null;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _prev;

    public AbstractC6693y(@InterfaceC7395n N n2) {
        this._prev = n2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Object m24434n() {
        return this._next;
    }

    /* JADX INFO: renamed from: y */
    private final N m24435y() {
        N n2 = (N) m24438q();
        kotlin.jvm.internal.d2ok.qrj(n2);
        while (n2.f7l8()) {
            n2 = (N) n2.m24438q();
            kotlin.jvm.internal.d2ok.qrj(n2);
        }
        return n2;
    }

    private final N zy() {
        N n2 = (N) m24436g();
        while (n2 != null && n2.f7l8()) {
            n2 = (N) n2._prev;
        }
        return n2;
    }

    public abstract boolean f7l8();

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final N m24436g() {
        return (N) this._prev;
    }

    @InterfaceC7395n
    public final N ld6(@InterfaceC7396q InterfaceC5981k interfaceC5981k) {
        Object objM24434n = m24434n();
        if (objM24434n != f7l8.f82009toq) {
            return (N) objM24434n;
        }
        interfaceC5981k.invoke();
        throw new C6480z();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24437p() {
        return androidx.concurrent.futures.toq.m906k(f37265k, this, null, f7l8.f82009toq);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final N m24438q() {
        Object objM24434n = m24434n();
        if (objM24434n == f7l8.f82009toq) {
            return null;
        }
        return (N) objM24434n;
    }

    public final boolean qrj(@InterfaceC7396q N n2) {
        return androidx.concurrent.futures.toq.m906k(f37265k, this, null, n2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m24439s() {
        return m24438q() == null;
    }

    public final void toq() {
        f82041toq.lazySet(this, null);
    }

    public final void x2() {
        while (true) {
            AbstractC6693y abstractC6693yZy = zy();
            AbstractC6693y abstractC6693yM24435y = m24435y();
            abstractC6693yM24435y._prev = abstractC6693yZy;
            if (abstractC6693yZy != null) {
                abstractC6693yZy._next = abstractC6693yM24435y;
            }
            if (!abstractC6693yM24435y.f7l8() && (abstractC6693yZy == null || !abstractC6693yZy.f7l8())) {
                return;
            }
        }
    }
}
