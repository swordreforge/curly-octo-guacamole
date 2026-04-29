package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.C6227f;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.internal.C6690r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/n2t;", C0846k.zaso, "Lkotlinx/coroutines/internal/r;", "Lkotlin/coroutines/f7l8;", "context", "", "oldValue", "Lkotlin/was;", "zwy", "", "pc", "state", "uc", "Ljava/lang/ThreadLocal;", "Lkotlin/f;", C7704k.y.toq.f95579toq, "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/q;", "uCont", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class n2t<T> extends C6690r<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private ThreadLocal<C6227f<kotlin.coroutines.f7l8, Object>> f37300g;

    /* JADX WARN: Illegal instructions before constructor call */
    public n2t(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        pjz9 pjz9Var = pjz9.f37317k;
        super(f7l8Var.get(pjz9Var) == null ? f7l8Var.plus(pjz9Var) : f7l8Var, interfaceC6216q);
        this.f37300g = new ThreadLocal<>();
    }

    public final boolean pc() {
        if (this.f37300g.get() == null) {
            return false;
        }
        this.f37300g.set(null);
        return true;
    }

    @Override // kotlinx.coroutines.internal.C6690r, kotlinx.coroutines.AbstractC6696k
    protected void uc(@InterfaceC7395n Object obj) {
        C6227f<kotlin.coroutines.f7l8, Object> c6227f = this.f37300g.get();
        if (c6227f != null) {
            kotlinx.coroutines.internal.lrht.m24365k(c6227f.component1(), c6227f.component2());
            this.f37300g.set(null);
        }
        Object objM24046k = eqxt.m24046k(obj, this.f37237n);
        InterfaceC6216q<T> interfaceC6216q = this.f37237n;
        kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
        Object objZy = kotlinx.coroutines.internal.lrht.zy(context, null);
        n2t<?> n2tVarF7l8 = objZy != kotlinx.coroutines.internal.lrht.f37225k ? C6710r.f7l8(interfaceC6216q, context, objZy) : null;
        try {
            this.f37237n.resumeWith(objM24046k);
            kotlin.was wasVar = kotlin.was.f36763k;
        } finally {
            if (n2tVarF7l8 == null || n2tVarF7l8.pc()) {
                kotlinx.coroutines.internal.lrht.m24365k(context, objZy);
            }
        }
    }

    public final void zwy(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n Object obj) {
        this.f37300g.set(kotlin.nmn5.m23230k(f7l8Var, obj));
    }
}
