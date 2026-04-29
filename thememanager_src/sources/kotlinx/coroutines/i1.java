package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0014\"\u0018\u0010 \u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/bf2;", "", "mode", "Lkotlin/was;", "k", "Lkotlin/coroutines/q;", "delegate", "", "undispatched", "n", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/u;", "eventLoop", "Lkotlin/Function0;", "block", AnimatedProperty.PROPERTY_NAME_Y, "", "exception", "f7l8", com.market.sdk.reflect.toq.f28131g, "MODE_ATOMIC", "toq", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", "zy", "MODE_CANCELLABLE_REUSABLE", "q", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class i1 {

    /* JADX INFO: renamed from: k */
    public static final int f37200k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f37201n = -1;

    /* JADX INFO: renamed from: q */
    public static final int f37202q = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f82004toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f82005zy = 2;

    public static final void f7l8(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q, @InterfaceC7396q Throwable th) {
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
    }

    /* JADX INFO: renamed from: g */
    private static final void m24306g(bf2<?> bf2Var) {
        AbstractC6741u qVar = ixz.f37275k.toq();
        if (qVar.cnbm()) {
            qVar.lw(bf2Var);
            return;
        }
        qVar.oki(true);
        try {
            m24308n(bf2Var, bf2Var.mo23829q(), true);
            do {
            } while (qVar.nme());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final <T> void m24307k(@InterfaceC7396q bf2<? super T> bf2Var, int i2) {
        InterfaceC6216q<? super T> interfaceC6216qMo23829q = bf2Var.mo23829q();
        boolean z2 = i2 == 4;
        if (z2 || !(interfaceC6216qMo23829q instanceof kotlinx.coroutines.internal.x2) || zy(i2) != zy(bf2Var.f36789n)) {
            m24308n(bf2Var, interfaceC6216qMo23829q, z2);
            return;
        }
        dd ddVar = ((kotlinx.coroutines.internal.x2) interfaceC6216qMo23829q).f37260g;
        kotlin.coroutines.f7l8 context = interfaceC6216qMo23829q.getContext();
        if (ddVar.wlev(context)) {
            ddVar.bap7(context, bf2Var);
        } else {
            m24306g(bf2Var);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final <T> void m24308n(@InterfaceC7396q bf2<? super T> bf2Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, boolean z2) {
        Object objMo23827g;
        Object objMo23830y = bf2Var.mo23830y();
        Throwable thMo23828n = bf2Var.mo23828n(objMo23830y);
        if (thMo23828n != null) {
            C6323o.k kVar = C6323o.Companion;
            objMo23827g = C6318m.m23191k(thMo23828n);
        } else {
            C6323o.k kVar2 = C6323o.Companion;
            objMo23827g = bf2Var.mo23827g(objMo23830y);
        }
        Object objM28280constructorimpl = C6323o.m28280constructorimpl(objMo23827g);
        if (!z2) {
            interfaceC6216q.resumeWith(objM28280constructorimpl);
            return;
        }
        kotlinx.coroutines.internal.x2 x2Var = (kotlinx.coroutines.internal.x2) interfaceC6216q;
        InterfaceC6216q<T> interfaceC6216q2 = x2Var.f37263y;
        Object obj = x2Var.f37261p;
        kotlin.coroutines.f7l8 context = interfaceC6216q2.getContext();
        Object objZy = kotlinx.coroutines.internal.lrht.zy(context, obj);
        n2t<?> n2tVarF7l8 = objZy != kotlinx.coroutines.internal.lrht.f37225k ? C6710r.f7l8(interfaceC6216q2, context, objZy) : null;
        try {
            x2Var.f37263y.resumeWith(objM28280constructorimpl);
            kotlin.was wasVar = kotlin.was.f36763k;
        } finally {
            if (n2tVarF7l8 == null || n2tVarF7l8.pc()) {
                kotlinx.coroutines.internal.lrht.m24365k(context, objZy);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m24309q(int i2) {
        return i2 == 2;
    }

    @kotlin.nn86
    public static /* synthetic */ void toq() {
    }

    /* JADX INFO: renamed from: y */
    public static final void m24310y(@InterfaceC7396q bf2<?> bf2Var, @InterfaceC7396q AbstractC6741u abstractC6741u, @InterfaceC7396q InterfaceC5981k<kotlin.was> interfaceC5981k) {
        abstractC6741u.oki(true);
        try {
            interfaceC5981k.invoke();
            do {
            } while (abstractC6741u.nme());
            kotlin.jvm.internal.d3.m23090q(1);
        } catch (Throwable th) {
            try {
                bf2Var.f7l8(th, null);
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d3.m23090q(1);
                abstractC6741u.dxef(true);
                kotlin.jvm.internal.d3.zy(1);
                throw th2;
            }
        }
        abstractC6741u.dxef(true);
        kotlin.jvm.internal.d3.zy(1);
    }

    public static final boolean zy(int i2) {
        return i2 == 1 || i2 == 2;
    }
}
