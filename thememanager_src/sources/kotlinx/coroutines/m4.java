package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.at;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.intrinsics.C6199q;
import kotlinx.coroutines.gbni;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0010\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0013H\u0007\u001a\n\u0010\u0016\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u0013\u001a\u001e\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011\u001a\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0013H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\t*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001d\u0010!\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u00020\u001b*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010 \u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/gbni;", "parent", "Lkotlinx/coroutines/mcp;", "k", "toq", "(Lkotlinx/coroutines/gbni;)Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/ch;", "handle", "ni7", "Lkotlin/was;", "x2", "(Lkotlinx/coroutines/gbni;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "ki", AnimatedProperty.PROPERTY_NAME_H, "", "cdj", "Lkotlin/coroutines/f7l8;", C7704k.y.toq.f95579toq, "n", "z", "fu4", "", "message", "f7l8", "", AnimatedProperty.PROPERTY_NAME_Y, "kja0", "qrj", "n7h", at.f31711e, "t", "(Ljava/lang/Throwable;Lkotlinx/coroutines/gbni;)Ljava/lang/Throwable;", "wvg", "(Lkotlin/coroutines/f7l8;)Z", "isActive", "o1t", "(Lkotlin/coroutines/f7l8;)Lkotlinx/coroutines/gbni;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class m4 {
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cdj(gbni gbniVar, Throwable th) throws Throwable {
        for (gbni gbniVar2 : gbniVar.wvg()) {
            etdu etduVar = gbniVar2 instanceof etdu ? (etdu) gbniVar2 : null;
            if (etduVar != null) {
                etduVar.hb(m24498t(th, gbniVar));
            }
        }
    }

    public static final void f7l8(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q String str, @InterfaceC7395n Throwable th) {
        gbniVar.mo23862q(dr.m24039k(str, th));
    }

    public static /* synthetic */ void fn3e(gbni gbniVar, Throwable th, int i2, Object obj) throws Throwable {
        if ((i2 & 1) != 0) {
            th = null;
        }
        cdj(gbniVar, th);
    }

    public static final void fu4(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        if (gbniVar == null) {
            return;
        }
        ltg8.wvg(gbniVar);
    }

    /* JADX INFO: renamed from: g */
    public static final void m24490g(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n CancellationException cancellationException) {
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        if (gbniVar == null) {
            return;
        }
        gbniVar.mo23862q(cancellationException);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24492i(kotlin.coroutines.f7l8 f7l8Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        ltg8.kja0(f7l8Var, cancellationException);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final mcp m24493k(@InterfaceC7395n gbni gbniVar) {
        return new i9jn(gbniVar);
    }

    public static final void ki(@InterfaceC7396q gbni gbniVar, @InterfaceC7395n CancellationException cancellationException) {
        Iterator<gbni> it = gbniVar.wvg().iterator();
        while (it.hasNext()) {
            it.next().mo23862q(cancellationException);
        }
    }

    public static final void kja0(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n CancellationException cancellationException) {
        kotlin.sequences.qrj<gbni> qrjVarWvg;
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        if (gbniVar == null || (qrjVarWvg = gbniVar.wvg()) == null) {
            return;
        }
        Iterator<gbni> it = qrjVarWvg.iterator();
        while (it.hasNext()) {
            it.next().mo23862q(cancellationException);
        }
    }

    public static /* synthetic */ boolean ld6(kotlin.coroutines.f7l8 f7l8Var, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        return m24499y(f7l8Var, th);
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n7h(kotlin.coroutines.f7l8 f7l8Var, Throwable th) throws Throwable {
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        if (gbniVar == null) {
            return;
        }
        for (gbni gbniVar2 : gbniVar.wvg()) {
            etdu etduVar = gbniVar2 instanceof etdu ? (etdu) gbniVar2 : null;
            if (etduVar != null) {
                etduVar.hb(m24498t(th, gbniVar));
            }
        }
    }

    @InterfaceC7396q
    public static final ch ni7(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q ch chVar) {
        return gbniVar.yz(new lv5(chVar));
    }

    @InterfaceC7396q
    public static final gbni o1t(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        if (gbniVar != null) {
            return gbniVar;
        }
        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Current context doesn't contain Job in it: ", f7l8Var).toString());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m24495p(gbni gbniVar, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        ltg8.f7l8(gbniVar, str, th);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ gbni m24496q(gbni gbniVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gbniVar = null;
        }
        return toq(gbniVar);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m24497s(kotlin.coroutines.f7l8 f7l8Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        ltg8.m24478g(f7l8Var, cancellationException);
    }

    /* JADX INFO: renamed from: t */
    private static final Throwable m24498t(Throwable th, gbni gbniVar) {
        return th == null ? new zsr0("Job was cancelled", null, gbniVar) : th;
    }

    public static /* synthetic */ void t8r(kotlin.coroutines.f7l8 f7l8Var, Throwable th, int i2, Object obj) throws Throwable {
        if ((i2 & 1) != 0) {
            th = null;
        }
        n7h(f7l8Var, th);
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @InterfaceC6769y(name = "Job")
    public static final /* synthetic */ gbni toq(gbni gbniVar) {
        return ltg8.m24481k(gbniVar);
    }

    public static final boolean wvg(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        return gbniVar != null && gbniVar.isActive();
    }

    @InterfaceC7395n
    public static final Object x2(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        gbni.C6665k.toq(gbniVar, null, 1, null);
        Object objWas = gbniVar.was(interfaceC6216q);
        return objWas == C6199q.x2() ? objWas : kotlin.was.f36763k;
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ boolean m24499y(kotlin.coroutines.f7l8 f7l8Var, Throwable th) throws Throwable {
        f7l8.toq toqVar = f7l8Var.get(gbni.ygy);
        etdu etduVar = toqVar instanceof etdu ? (etdu) toqVar : null;
        if (etduVar == null) {
            return false;
        }
        etduVar.hb(m24498t(th, etduVar));
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static final void m24500z(@InterfaceC7396q gbni gbniVar) {
        if (!gbniVar.isActive()) {
            throw gbniVar.d2ok();
        }
    }

    public static /* synthetic */ void zurt(gbni gbniVar, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        ltg8.ki(gbniVar, cancellationException);
    }

    public static /* synthetic */ mcp zy(gbni gbniVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gbniVar = null;
        }
        return ltg8.m24481k(gbniVar);
    }
}
