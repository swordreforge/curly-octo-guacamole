package kotlinx.coroutines.selects;

import cyoe.x2;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.y */
/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/k;", "Lkotlin/was;", "Lkotlin/fn3e;", "builder", "k", "(Lcyoe/x2;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6730y {
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <R> Object m24577k(@InterfaceC7396q x2<? super InterfaceC6721k<? super R>, was> x2Var, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        C6724p c6724p = new C6724p(interfaceC6216q);
        try {
            x2Var.invoke(c6724p);
        } catch (Throwable th) {
            c6724p.zy(th);
        }
        Object objM24572q = c6724p.m24572q();
        if (objM24572q == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24572q;
    }

    private static final <R> Object toq(x2<? super InterfaceC6721k<? super R>, was> x2Var, InterfaceC6216q<? super R> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        C6724p c6724p = new C6724p(interfaceC6216q);
        try {
            x2Var.invoke(c6724p);
        } catch (Throwable th) {
            c6724p.zy(th);
        }
        Object objM24572q = c6724p.m24572q();
        if (objM24572q == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        kotlin.jvm.internal.d3.m23089n(1);
        return objM24572q;
    }
}
