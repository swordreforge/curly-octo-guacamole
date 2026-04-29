package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {C0846k.zaso, "Lkotlin/o;", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "onCancellation", "", "toq", "(Ljava/lang/Object;Lcyoe/x2;)Ljava/lang/Object;", "Lkotlinx/coroutines/cdj;", "caller", "zy", "(Ljava/lang/Object;Lkotlinx/coroutines/cdj;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/q;", "uCont", "k", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class eqxt {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> Object m24046k(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        if (obj instanceof a9) {
            C6323o.k kVar = C6323o.Companion;
            return C6323o.m28280constructorimpl(C6318m.m23191k(((a9) obj).f36774k));
        }
        C6323o.k kVar2 = C6323o.Companion;
        return C6323o.m28280constructorimpl(obj);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m24047q(Object obj, cyoe.x2 x2Var, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            x2Var = null;
        }
        return toq(obj, x2Var);
    }

    @InterfaceC7395n
    public static final <T> Object toq(@InterfaceC7396q Object obj, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        return thM28283exceptionOrNullimpl == null ? x2Var != null ? new fti(obj, x2Var) : obj : new a9(thM28283exceptionOrNullimpl, false, 2, null);
    }

    @InterfaceC7395n
    public static final <T> Object zy(@InterfaceC7396q Object obj, @InterfaceC7396q cdj<?> cdjVar) {
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        return thM28283exceptionOrNullimpl == null ? obj : new a9(thM28283exceptionOrNullimpl, false, 2, null);
    }
}
