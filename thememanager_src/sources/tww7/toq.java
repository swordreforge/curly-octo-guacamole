package tww7;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import cyoe.x2;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.jvm.internal.bo;
import kotlinx.coroutines.a9;
import kotlinx.coroutines.internal.C6690r;
import kotlinx.coroutines.internal.lrht;
import kotlinx.coroutines.pc;
import kotlinx.coroutines.sok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007\u001aT\u0010\u000e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a9\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0082\b\u001a[\u0010\u0013\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a?\u0010\u001b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {C0846k.zaso, "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "", "completion", "Lkotlin/was;", "zy", "(Lcyoe/x2;Lkotlin/coroutines/q;)V", "R", "Lkotlin/Function2;", "receiver", "q", "(Lcyoe/h;Ljava/lang/Object;Lkotlin/coroutines/q;)V", "k", "toq", "block", "n", "Lkotlinx/coroutines/internal/r;", "Lkotlin/fn3e;", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/internal/r;Ljava/lang/Object;Lcyoe/h;)Ljava/lang/Object;", "f7l8", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", AnimatedProperty.PROPERTY_NAME_Y, "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class toq {
    @InterfaceC7395n
    public static final <T, R> Object f7l8(@InterfaceC7396q C6690r<? super T> c6690r, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h) throws Throwable {
        Object a9Var;
        try {
            a9Var = ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(r2, c6690r);
        } catch (Throwable th) {
            a9Var = new a9(th, false, 2, null);
        }
        if (a9Var == C6199q.x2()) {
            return C6199q.x2();
        }
        Object objLtg8 = c6690r.ltg8(a9Var);
        if (objLtg8 == sok.f82068toq) {
            return C6199q.x2();
        }
        if (objLtg8 instanceof a9) {
            Throwable th2 = ((a9) objLtg8).f36774k;
            if (((th2 instanceof pc) && ((pc) th2).coroutine == c6690r) ? false : true) {
                throw th2;
            }
            if (a9Var instanceof a9) {
                throw ((a9) a9Var).f36774k;
            }
        } else {
            a9Var = sok.kja0(objLtg8);
        }
        return a9Var;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final <T, R> Object m28038g(@InterfaceC7396q C6690r<? super T> c6690r, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h) {
        Object a9Var;
        try {
            a9Var = ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(r2, c6690r);
        } catch (Throwable th) {
            a9Var = new a9(th, false, 2, null);
        }
        if (a9Var == C6199q.x2()) {
            return C6199q.x2();
        }
        Object objLtg8 = c6690r.ltg8(a9Var);
        if (objLtg8 == sok.f82068toq) {
            return C6199q.x2();
        }
        if (objLtg8 instanceof a9) {
            throw ((a9) objLtg8).f36774k;
        }
        return sok.kja0(objLtg8);
    }

    /* JADX INFO: renamed from: k */
    public static final <T> void m28039k(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        InterfaceC6216q interfaceC6216qM22771k = C6211y.m22771k(interfaceC6216q);
        try {
            f7l8 context = interfaceC6216q.getContext();
            Object objZy = lrht.zy(context, null);
            try {
                Object objInvoke = ((x2) bo.cdj(x2Var, 1)).invoke(interfaceC6216qM22771k);
                if (objInvoke != C6199q.x2()) {
                    C6323o.k kVar = C6323o.Companion;
                    interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(objInvoke));
                }
            } finally {
                lrht.m24365k(context, objZy);
            }
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        }
    }

    /* JADX INFO: renamed from: n */
    private static final <T> void m28040n(InterfaceC6216q<? super T> interfaceC6216q, x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var) {
        InterfaceC6216q interfaceC6216qM22771k = C6211y.m22771k(interfaceC6216q);
        try {
            Object objInvoke = x2Var.invoke(interfaceC6216qM22771k);
            if (objInvoke != C6199q.x2()) {
                C6323o.k kVar = C6323o.Companion;
                interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(objInvoke));
            }
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        }
    }

    /* JADX INFO: renamed from: q */
    public static final <R, T> void m28041q(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        InterfaceC6216q interfaceC6216qM22771k = C6211y.m22771k(interfaceC6216q);
        try {
            Object objInvoke = ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(r2, interfaceC6216qM22771k);
            if (objInvoke != C6199q.x2()) {
                C6323o.k kVar = C6323o.Companion;
                interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(objInvoke));
            }
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        }
    }

    public static final <R, T> void toq(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        InterfaceC6216q interfaceC6216qM22771k = C6211y.m22771k(interfaceC6216q);
        try {
            f7l8 context = interfaceC6216q.getContext();
            Object objZy = lrht.zy(context, null);
            try {
                Object objInvoke = ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(r2, interfaceC6216qM22771k);
                if (objInvoke != C6199q.x2()) {
                    C6323o.k kVar = C6323o.Companion;
                    interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(objInvoke));
                }
            } finally {
                lrht.m24365k(context, objZy);
            }
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        }
    }

    /* JADX INFO: renamed from: y */
    private static final <T> Object m28042y(C6690r<? super T> c6690r, x2<? super Throwable, Boolean> x2Var, InterfaceC5981k<? extends Object> interfaceC5981k) throws Throwable {
        Object a9Var;
        try {
            a9Var = interfaceC5981k.invoke();
        } catch (Throwable th) {
            a9Var = new a9(th, false, 2, null);
        }
        if (a9Var == C6199q.x2()) {
            return C6199q.x2();
        }
        Object objLtg8 = c6690r.ltg8(a9Var);
        if (objLtg8 == sok.f82068toq) {
            return C6199q.x2();
        }
        if (!(objLtg8 instanceof a9)) {
            return sok.kja0(objLtg8);
        }
        a9 a9Var2 = (a9) objLtg8;
        if (x2Var.invoke(a9Var2.f36774k).booleanValue()) {
            throw a9Var2.f36774k;
        }
        if (a9Var instanceof a9) {
            throw ((a9) a9Var).f36774k;
        }
        return a9Var;
    }

    public static final <T> void zy(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        InterfaceC6216q interfaceC6216qM22771k = C6211y.m22771k(interfaceC6216q);
        try {
            Object objInvoke = ((x2) bo.cdj(x2Var, 1)).invoke(interfaceC6216qM22771k);
            if (objInvoke != C6199q.x2()) {
                C6323o.k kVar = C6323o.Companion;
                interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(objInvoke));
            }
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            interfaceC6216qM22771k.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        }
    }
}
