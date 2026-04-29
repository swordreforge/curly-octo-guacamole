package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlinx.coroutines.internal.C6688p;
import kotlinx.coroutines.internal.C6690r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.c */
/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/coroutines/f7l8;", "context", "qrj", "toq", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "f7l8", "(Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "k", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/was;", "q", "", "message", "", "zy", "p", AnimatedProperty.PROPERTY_NAME_Y, "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "ld6", "(Lkotlinx/coroutines/f;)Z", "isActive$annotations", "(Lkotlinx/coroutines/f;)V", "isActive", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6490c {
    @InterfaceC7395n
    public static final <R> Object f7l8(@InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        C6690r c6690r = new C6690r(interfaceC6216q.getContext(), interfaceC6216q);
        Object objM28038g = tww7.toq.m28038g(c6690r, c6690r, interfaceC5979h);
        if (objM28038g == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM28038g;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23838g(InterfaceC6556f interfaceC6556f, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        m23842q(interfaceC6556f, cancellationException);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final InterfaceC6556f m23839k(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        if (f7l8Var.get(gbni.ygy) == null) {
            f7l8Var = f7l8Var.plus(m4.zy(null, 1, null));
        }
        return new C6688p(f7l8Var);
    }

    public static final boolean ld6(@InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        gbni gbniVar = (gbni) interfaceC6556f.i1().get(gbni.ygy);
        if (gbniVar == null) {
            return true;
        }
        return gbniVar.isActive();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m23840n(InterfaceC6556f interfaceC6556f, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        zy(interfaceC6556f, str, th);
    }

    /* JADX INFO: renamed from: p */
    public static final void m23841p(@InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        ltg8.o1t(interfaceC6556f.i1());
    }

    /* JADX INFO: renamed from: q */
    public static final void m23842q(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n CancellationException cancellationException) {
        gbni gbniVar = (gbni) interfaceC6556f.i1().get(gbni.ygy);
        if (gbniVar == null) {
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Scope cannot be cancelled because it does not have a job: ", interfaceC6556f).toString());
        }
        gbniVar.mo23862q(cancellationException);
    }

    @InterfaceC7396q
    public static final InterfaceC6556f qrj(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return new C6688p(interfaceC6556f.i1().plus(f7l8Var));
    }

    /* JADX INFO: renamed from: s */
    private static final Object m23843s(InterfaceC6216q<? super kotlin.coroutines.f7l8> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    @InterfaceC7396q
    public static final InterfaceC6556f toq() {
        return new C6688p(yl.zy(null, 1, null).plus(C6481a.m23813n()));
    }

    public static /* synthetic */ void x2(InterfaceC6556f interfaceC6556f) {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public static final Object m23844y(@InterfaceC7396q InterfaceC6216q<? super kotlin.coroutines.f7l8> interfaceC6216q) {
        return interfaceC6216q.getContext();
    }

    public static final void zy(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q String str, @InterfaceC7395n Throwable th) {
        m23842q(interfaceC6556f, dr.m24039k(str, th));
    }
}
