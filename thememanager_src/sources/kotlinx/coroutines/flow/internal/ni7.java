package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.gvn7;
import kotlin.was;
import kotlinx.coroutines.flow.InterfaceC6618p;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/flow/p;", "", "Lkotlin/coroutines/q;", "Lkotlin/was;", "k", "Lcyoe/cdj;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ni7 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final cyoe.cdj<InterfaceC6618p<Object>, Object, InterfaceC6216q<? super was>, Object> f36997k = (cyoe.cdj) bo.cdj(C6585k.INSTANCE, 3);

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ni7$k */
    /* JADX INFO: compiled from: SafeCollector.kt */
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    /* synthetic */ class C6585k extends gvn7 implements cyoe.cdj<InterfaceC6618p<? super Object>, Object, was>, kotlin.coroutines.jvm.internal.n7h {
        public static final C6585k INSTANCE = new C6585k();

        C6585k() {
            super(3, InterfaceC6618p.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<Object> interfaceC6618p, @InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            return interfaceC6618p.emit(obj, interfaceC6216q);
        }
    }

    private static /* synthetic */ void toq() {
    }
}
