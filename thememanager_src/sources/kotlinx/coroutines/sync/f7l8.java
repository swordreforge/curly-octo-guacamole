package kotlinx.coroutines.sync;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.google.common.util.concurrent.C4849x;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.x2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6668i;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.internal.AbstractC6693y;
import kotlinx.coroutines.internal.dd;
import kotlinx.coroutines.internal.x9kr;
import kotlinx.coroutines.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/sync/f7l8;", "Lkotlinx/coroutines/sync/g;", "Lkotlin/was;", "f7l8", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/cdj;", "cont", "", AnimatedProperty.PROPERTY_NAME_Y, "(Lkotlinx/coroutines/cdj;)Z", "p", "()Z", C7704k.y.toq.f44691k, "toq", "zy", "release", "()V", "", "k", com.market.sdk.reflect.toq.f28131g, "permits", "Lkotlin/Function1;", "", "Lcyoe/x2;", "onCancellationRelease", "()I", "availablePermits", "acquiredPermits", C4991s.f28129n, "(II)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class f7l8 implements InterfaceC6732g {

    @InterfaceC7396q
    volatile /* synthetic */ int _availablePermits;

    @InterfaceC7396q
    private volatile /* synthetic */ long deqIdx = 0;

    @InterfaceC7396q
    private volatile /* synthetic */ long enqIdx = 0;

    @InterfaceC7396q
    private volatile /* synthetic */ Object head;

    /* JADX INFO: renamed from: k */
    private final int f37421k;

    @InterfaceC7396q
    private volatile /* synthetic */ Object tail;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final x2<Throwable, was> f82072toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82071zy = AtomicReferenceFieldUpdater.newUpdater(f7l8.class, Object.class, C3678q.f65826kja0);

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ AtomicLongFieldUpdater f37420q = AtomicLongFieldUpdater.newUpdater(f7l8.class, "deqIdx");

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37419n = AtomicReferenceFieldUpdater.newUpdater(f7l8.class, Object.class, "tail");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f37418g = AtomicLongFieldUpdater.newUpdater(f7l8.class, "enqIdx");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f82070f7l8 = AtomicIntegerFieldUpdater.newUpdater(f7l8.class, "_availablePermits");

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.f7l8$k */
    /* JADX INFO: compiled from: Semaphore.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6731k extends AbstractC6308r implements x2<Throwable, was> {
        C6731k() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Throwable th) {
            f7l8.this.release();
        }
    }

    public f7l8(int i2, int i3) {
        this.f37421k = i2;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException(d2ok.mcp("Semaphore should have at least 1 permit, but had ", Integer.valueOf(i2)).toString());
        }
        if (!(i3 >= 0 && i3 <= i2)) {
            throw new IllegalArgumentException(d2ok.mcp("The number of acquired permits should be in 0..", Integer.valueOf(i2)).toString());
        }
        C6736s c6736s = new C6736s(0L, null, 2);
        this.head = c6736s;
        this.tail = c6736s;
        this._availablePermits = i2 - i3;
        this.f82072toq = new C6731k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f7l8(InterfaceC6216q<? super was> interfaceC6216q) {
        ki qVar = C6668i.toq(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q));
        while (true) {
            if (m24590y(qVar)) {
                break;
            }
            if (f82070f7l8.getAndDecrement(this) > 0) {
                qVar.n7h(was.f36763k, this.f82072toq);
                break;
            }
        }
        Object objM24474z = qVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z == C6199q.x2() ? objM24474z : was.f36763k;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m24587p() {
        Object qVar;
        int i2;
        boolean z2;
        C6736s c6736s = (C6736s) this.head;
        long andIncrement = f37420q.getAndIncrement(this);
        long j2 = andIncrement / ((long) C6737y.f37441g);
        do {
            dd ddVar = c6736s;
            while (true) {
                if (ddVar.kja0() >= j2 && !ddVar.f7l8()) {
                    qVar = x9kr.toq(ddVar);
                    break;
                }
                Object objM24434n = ddVar.m24434n();
                if (objM24434n == kotlinx.coroutines.internal.f7l8.f82009toq) {
                    qVar = x9kr.toq(kotlinx.coroutines.internal.f7l8.f82009toq);
                    break;
                }
                dd ddVarM24613p = (dd) ((AbstractC6693y) objM24434n);
                if (ddVarM24613p == null) {
                    ddVarM24613p = C6737y.m24613p(ddVar.kja0() + 1, (C6736s) ddVar);
                    if (ddVar.qrj(ddVarM24613p)) {
                        if (ddVar.f7l8()) {
                            ddVar.x2();
                        }
                    }
                }
                ddVar = ddVarM24613p;
            }
            i2 = 0;
            if (x9kr.m24431y(qVar)) {
                break;
            }
            dd ddVarM24426g = x9kr.m24426g(qVar);
            while (true) {
                dd ddVar2 = (dd) this.head;
                if (ddVar2.kja0() >= ddVarM24426g.kja0()) {
                    break;
                }
                if (!ddVarM24426g.ki()) {
                    z2 = false;
                    break;
                }
                if (androidx.concurrent.futures.toq.m906k(f82071zy, this, ddVar2, ddVarM24426g)) {
                    if (ddVar2.n7h()) {
                        ddVar2.x2();
                    }
                } else if (ddVarM24426g.n7h()) {
                    ddVarM24426g.x2();
                }
            }
            z2 = true;
        } while (!z2);
        C6736s c6736s2 = (C6736s) x9kr.m24426g(qVar);
        c6736s2.toq();
        if (c6736s2.kja0() > j2) {
            return false;
        }
        int i3 = (int) (andIncrement % ((long) C6737y.f37441g));
        Object andSet = c6736s2.f37439n.getAndSet(i3, C6737y.f82079toq);
        if (andSet != null) {
            if (andSet == C6737y.f37443n) {
                return false;
            }
            return m24589s((cdj) andSet);
        }
        int i4 = C6737y.f37442k;
        while (i2 < i4) {
            i2++;
            if (c6736s2.f37439n.get(i3) == C6737y.f82080zy) {
                return true;
            }
        }
        return !C4849x.m17025k(c6736s2.f37439n, i3, C6737y.f82079toq, C6737y.f37444q);
    }

    /* JADX INFO: renamed from: s */
    private final boolean m24589s(cdj<? super was> cdjVar) {
        Object objLvui = cdjVar.lvui(was.f36763k, null, this.f82072toq);
        if (objLvui == null) {
            return false;
        }
        cdjVar.mo23848r(objLvui);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final boolean m24590y(cdj<? super was> cdjVar) {
        Object qVar;
        boolean z2;
        C6736s c6736s = (C6736s) this.tail;
        long andIncrement = f37418g.getAndIncrement(this);
        long j2 = andIncrement / ((long) C6737y.f37441g);
        do {
            dd ddVar = c6736s;
            while (true) {
                if (ddVar.kja0() >= j2 && !ddVar.f7l8()) {
                    qVar = x9kr.toq(ddVar);
                    break;
                }
                Object objM24434n = ddVar.m24434n();
                if (objM24434n == kotlinx.coroutines.internal.f7l8.f82009toq) {
                    qVar = x9kr.toq(kotlinx.coroutines.internal.f7l8.f82009toq);
                    break;
                }
                dd ddVarM24613p = (dd) ((AbstractC6693y) objM24434n);
                if (ddVarM24613p == null) {
                    ddVarM24613p = C6737y.m24613p(ddVar.kja0() + 1, (C6736s) ddVar);
                    if (ddVar.qrj(ddVarM24613p)) {
                        if (ddVar.f7l8()) {
                            ddVar.x2();
                        }
                    }
                }
                ddVar = ddVarM24613p;
            }
            if (x9kr.m24431y(qVar)) {
                break;
            }
            dd ddVarM24426g = x9kr.m24426g(qVar);
            while (true) {
                dd ddVar2 = (dd) this.tail;
                if (ddVar2.kja0() >= ddVarM24426g.kja0()) {
                    break;
                }
                if (!ddVarM24426g.ki()) {
                    z2 = false;
                    break;
                }
                if (androidx.concurrent.futures.toq.m906k(f37419n, this, ddVar2, ddVarM24426g)) {
                    if (ddVar2.n7h()) {
                        ddVar2.x2();
                    }
                } else if (ddVarM24426g.n7h()) {
                    ddVarM24426g.x2();
                }
            }
            z2 = true;
        } while (!z2);
        C6736s c6736s2 = (C6736s) x9kr.m24426g(qVar);
        int i2 = (int) (andIncrement % ((long) C6737y.f37441g));
        if (C4849x.m17025k(c6736s2.f37439n, i2, null, cdjVar)) {
            cdjVar.ni7(new C6733k(c6736s2, i2));
            return true;
        }
        if (!C4849x.m17025k(c6736s2.f37439n, i2, C6737y.f82079toq, C6737y.f82080zy)) {
            return false;
        }
        cdjVar.n7h(was.f36763k, this.f82072toq);
        return true;
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6732g
    /* JADX INFO: renamed from: k */
    public int mo24591k() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6732g
    public void release() {
        while (true) {
            int i2 = this._availablePermits;
            int i3 = this.f37421k;
            if (!(i2 < i3)) {
                throw new IllegalStateException(d2ok.mcp("The number of released permits cannot be greater than ", Integer.valueOf(i3)).toString());
            }
            if (f82070f7l8.compareAndSet(this, i2, i2 + 1) && (i2 >= 0 || m24587p())) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6732g
    public boolean toq() {
        int i2;
        do {
            i2 = this._availablePermits;
            if (i2 <= 0) {
                return false;
            }
        } while (!f82070f7l8.compareAndSet(this, i2, i2 - 1));
        return true;
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6732g
    @InterfaceC7395n
    public Object zy(@InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if (f82070f7l8.getAndDecrement(this) > 0) {
            return was.f36763k;
        }
        Object objF7l8 = f7l8(interfaceC6216q);
        return objF7l8 == C6199q.x2() ? objF7l8 : was.f36763k;
    }
}
