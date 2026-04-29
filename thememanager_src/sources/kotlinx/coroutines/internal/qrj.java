package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import java.util.concurrent.CancellationException;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import kotlinx.coroutines.AbstractC6741u;
import kotlinx.coroutines.C6710r;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.ixz;
import kotlinx.coroutines.n2t;
import kotlinx.coroutines.tfm;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0082\b\"\u001a\u0010\u001d\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {C0846k.zaso, "Lkotlin/coroutines/q;", "Lkotlin/o;", "result", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "onCancellation", C7704k.y.toq.f95579toq, "(Lkotlin/coroutines/q;Ljava/lang/Object;Lcyoe/x2;)V", "Lkotlinx/coroutines/internal/x2;", "", AnimatedProperty.PROPERTY_NAME_Y, "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "toq", "Lkotlinx/coroutines/internal/l;", "k", "Lkotlinx/coroutines/internal/l;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class qrj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6679l f37236k = new C6679l("UNDEFINED");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f82026toq = new C6679l("REUSABLE_CLAIMED");

    public static /* synthetic */ void f7l8(InterfaceC6216q interfaceC6216q, Object obj, cyoe.x2 x2Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            x2Var = null;
        }
        m24399g(interfaceC6216q, obj, x2Var);
    }

    /* JADX WARN: Finally extract failed */
    @tfm
    /* JADX INFO: renamed from: g */
    public static final <T> void m24399g(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, @InterfaceC7396q Object obj, @InterfaceC7395n cyoe.x2<? super Throwable, was> x2Var) {
        boolean z2;
        if (!(interfaceC6216q instanceof x2)) {
            interfaceC6216q.resumeWith(obj);
            return;
        }
        x2 x2Var2 = (x2) interfaceC6216q;
        Object qVar = kotlinx.coroutines.eqxt.toq(obj, x2Var);
        if (x2Var2.f37260g.wlev(x2Var2.getContext())) {
            x2Var2.f37262s = qVar;
            x2Var2.f36789n = 1;
            x2Var2.f37260g.bap7(x2Var2.getContext(), x2Var2);
            return;
        }
        AbstractC6741u qVar2 = ixz.f37275k.toq();
        if (qVar2.cnbm()) {
            x2Var2.f37262s = qVar;
            x2Var2.f36789n = 1;
            qVar2.lw(x2Var2);
            return;
        }
        qVar2.oki(true);
        try {
            gbni gbniVar = (gbni) x2Var2.getContext().get(gbni.ygy);
            if (gbniVar == null || gbniVar.isActive()) {
                z2 = false;
            } else {
                CancellationException cancellationExceptionD2ok = gbniVar.d2ok();
                x2Var2.zy(qVar, cancellationExceptionD2ok);
                C6323o.k kVar = C6323o.Companion;
                x2Var2.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(cancellationExceptionD2ok)));
                z2 = true;
            }
            if (!z2) {
                InterfaceC6216q<T> interfaceC6216q2 = x2Var2.f37263y;
                Object obj2 = x2Var2.f37261p;
                kotlin.coroutines.f7l8 context = interfaceC6216q2.getContext();
                Object objZy = lrht.zy(context, obj2);
                n2t<?> n2tVarF7l8 = objZy != lrht.f37225k ? C6710r.f7l8(interfaceC6216q2, context, objZy) : null;
                try {
                    x2Var2.f37263y.resumeWith(obj);
                    was wasVar = was.f36763k;
                    if (n2tVarF7l8 == null || n2tVarF7l8.pc()) {
                        lrht.m24365k(context, objZy);
                    }
                } catch (Throwable th) {
                    if (n2tVarF7l8 == null || n2tVarF7l8.pc()) {
                        lrht.m24365k(context, objZy);
                    }
                    throw th;
                }
            }
            while (qVar2.nme()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private static /* synthetic */ void m24401n() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m24402q() {
    }

    private static final boolean toq(x2<?> x2Var, Object obj, int i2, boolean z2, InterfaceC5981k<was> interfaceC5981k) {
        AbstractC6741u qVar = ixz.f37275k.toq();
        if (z2 && qVar.b9ub()) {
            return false;
        }
        if (qVar.cnbm()) {
            x2Var.f37262s = obj;
            x2Var.f36789n = i2;
            qVar.lw(x2Var);
            return true;
        }
        qVar.oki(true);
        try {
            interfaceC5981k.invoke();
            do {
            } while (qVar.nme());
            kotlin.jvm.internal.d3.m23090q(1);
        } catch (Throwable th) {
            try {
                x2Var.f7l8(th, null);
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d3.m23090q(1);
                qVar.dxef(true);
                kotlin.jvm.internal.d3.zy(1);
                throw th2;
            }
        }
        qVar.dxef(true);
        kotlin.jvm.internal.d3.zy(1);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m24403y(@InterfaceC7396q x2<? super was> x2Var) {
        was wasVar = was.f36763k;
        AbstractC6741u qVar = ixz.f37275k.toq();
        if (qVar.b9ub()) {
            return false;
        }
        if (qVar.cnbm()) {
            x2Var.f37262s = wasVar;
            x2Var.f36789n = 1;
            qVar.lw(x2Var);
            return true;
        }
        qVar.oki(true);
        try {
            x2Var.run();
            do {
            } while (qVar.nme());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }

    static /* synthetic */ boolean zy(x2 x2Var, Object obj, int i2, boolean z2, InterfaceC5981k interfaceC5981k, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        AbstractC6741u qVar = ixz.f37275k.toq();
        if (z2 && qVar.b9ub()) {
            return false;
        }
        if (qVar.cnbm()) {
            x2Var.f37262s = obj;
            x2Var.f36789n = i2;
            qVar.lw(x2Var);
            return true;
        }
        qVar.oki(true);
        try {
            interfaceC5981k.invoke();
            do {
            } while (qVar.nme());
            kotlin.jvm.internal.d3.m23090q(1);
        } catch (Throwable th) {
            try {
                x2Var.f7l8(th, null);
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d3.m23090q(1);
                qVar.dxef(true);
                kotlin.jvm.internal.d3.zy(1);
                throw th2;
            }
        }
        qVar.dxef(true);
        kotlin.jvm.internal.d3.zy(1);
        return false;
    }
}
