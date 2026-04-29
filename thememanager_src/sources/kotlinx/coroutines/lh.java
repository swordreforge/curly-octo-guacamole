package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lkotlin/was;", "k", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class lh {
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final Object m24477k(@InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        Object objX2;
        kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
        ltg8.o1t(context);
        InterfaceC6216q interfaceC6216qM22747n = kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q);
        kotlinx.coroutines.internal.x2 x2Var = interfaceC6216qM22747n instanceof kotlinx.coroutines.internal.x2 ? (kotlinx.coroutines.internal.x2) interfaceC6216qM22747n : null;
        if (x2Var == null) {
            objX2 = kotlin.was.f36763k;
        } else {
            if (x2Var.f37260g.wlev(context)) {
                x2Var.x2(context, kotlin.was.f36763k);
            } else {
                ngy ngyVar = new ngy();
                kotlin.coroutines.f7l8 f7l8VarPlus = context.plus(ngyVar);
                kotlin.was wasVar = kotlin.was.f36763k;
                x2Var.x2(f7l8VarPlus, wasVar);
                objX2 = (!ngyVar.f37306k || kotlinx.coroutines.internal.qrj.m24403y(x2Var)) ? C6199q.x2() : wasVar;
            }
            objX2 = C6199q.x2();
        }
        if (objX2 == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objX2 == C6199q.x2() ? objX2 : kotlin.was.f36763k;
    }
}
