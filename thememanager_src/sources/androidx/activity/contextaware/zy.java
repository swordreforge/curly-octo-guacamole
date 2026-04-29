package androidx.activity.contextaware;

import android.content.Context;
import cyoe.x2;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"R", "Landroidx/activity/contextaware/k;", "Lkotlin/Function1;", "Landroid/content/Context;", "onContextAvailable", "k", "(Landroidx/activity/contextaware/k;Lcyoe/x2;Lkotlin/coroutines/q;)Ljava/lang/Object;", "activity-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class zy {

    /* JADX INFO: renamed from: androidx.activity.contextaware.zy$k */
    /* JADX INFO: compiled from: ContextAware.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/q;", "Landroid/content/Context;", "context", "Lkotlin/was;", "k", "activity-ktx_release"}, m22787k = 1, mv = {1, 4, 1})
    public static final class C0048k implements InterfaceC0047q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cdj f34k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ InterfaceC0046k f46341toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ x2 f46342zy;

        public C0048k(cdj cdjVar, InterfaceC0046k interfaceC0046k, x2 x2Var) {
            this.f34k = cdjVar;
            this.f46341toq = interfaceC0046k;
            this.f46342zy = x2Var;
        }

        @Override // androidx.activity.contextaware.InterfaceC0047q
        /* JADX INFO: renamed from: k */
        public void mo8k(@InterfaceC7396q Context context) {
            Object objM28280constructorimpl;
            d2ok.m23075h(context, "context");
            cdj cdjVar = this.f34k;
            try {
                C6323o.k kVar = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(this.f46342zy.invoke(context));
            } catch (Throwable th) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
            }
            cdjVar.resumeWith(objM28280constructorimpl);
        }
    }

    /* JADX INFO: compiled from: ContextAware.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class toq extends AbstractC6308r implements x2<Throwable, was> {
        final /* synthetic */ C0048k $listener;
        final /* synthetic */ x2 $onContextAvailable$inlined;
        final /* synthetic */ InterfaceC0046k $this_withContextAvailable$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(C0048k c0048k, InterfaceC0046k interfaceC0046k, x2 x2Var) {
            super(1);
            this.$listener = c0048k;
            this.$this_withContextAvailable$inlined = interfaceC0046k;
            this.$onContextAvailable$inlined = x2Var;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            this.$this_withContextAvailable$inlined.removeOnContextAvailableListener(this.$listener);
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <R> Object m18k(@InterfaceC7396q InterfaceC0046k interfaceC0046k, @InterfaceC7396q x2<? super Context, ? extends R> x2Var, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        Context contextPeekAvailableContext = interfaceC0046k.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return x2Var.invoke(contextPeekAvailableContext);
        }
        ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        C0048k c0048k = new C0048k(kiVar, interfaceC0046k, x2Var);
        interfaceC0046k.addOnContextAvailableListener(c0048k);
        kiVar.ni7(new toq(c0048k, interfaceC0046k, x2Var));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z != C6199q.x2()) {
            return objM24474z;
        }
        C6211y.zy(interfaceC6216q);
        return objM24474z;
    }

    @InterfaceC7395n
    private static final Object toq(@InterfaceC7396q InterfaceC0046k interfaceC0046k, @InterfaceC7396q x2 x2Var, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
        Context contextPeekAvailableContext = interfaceC0046k.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return x2Var.invoke(contextPeekAvailableContext);
        }
        kotlin.jvm.internal.d3.m23089n(0);
        ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        C0048k c0048k = new C0048k(kiVar, interfaceC0046k, x2Var);
        interfaceC0046k.addOnContextAvailableListener(c0048k);
        kiVar.ni7(new toq(c0048k, interfaceC0046k, x2Var));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        kotlin.jvm.internal.d3.m23089n(1);
        return objM24474z;
    }
}
