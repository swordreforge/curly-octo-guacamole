package androidx.lifecycle;

import androidx.lifecycle.kja0;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.m4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/ki;", "Landroidx/lifecycle/fn3e;", "Lkotlin/was;", C7704k.y.toq.f95579toq, "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/kja0$toq;", "event", "gvn7", "Landroidx/lifecycle/kja0;", "k", "Landroidx/lifecycle/kja0;", "()Landroidx/lifecycle/kja0;", "lifecycle", "Lkotlin/coroutines/f7l8;", "q", "Lkotlin/coroutines/f7l8;", "i1", "()Lkotlin/coroutines/f7l8;", "coroutineContext", C4991s.f28129n, "(Landroidx/lifecycle/kja0;Lkotlin/coroutines/f7l8;)V", "lifecycle-runtime-ktx_release"}, m22787k = 1, mv = {1, 6, 0})
public final class LifecycleCoroutineScopeImpl extends ki implements fn3e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kja0 f5006k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f5007q;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$k */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m22756f = "Lifecycle.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C0914k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C0914k(InterfaceC6216q<? super C0914k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C0914k c0914k = LifecycleCoroutineScopeImpl.this.new C0914k(interfaceC6216q);
            c0914k.L$0 = obj;
            return c0914k;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C0914k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            InterfaceC6556f interfaceC6556f = (InterfaceC6556f) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.mo4381k().toq().compareTo(kja0.zy.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.mo4381k().mo4451k(LifecycleCoroutineScopeImpl.this);
            } else {
                m4.m24497s(interfaceC6556f.i1(), null, 1, null);
            }
            return was.f36763k;
        }
    }

    public LifecycleCoroutineScopeImpl(@InterfaceC7396q kja0 lifecycle, @InterfaceC7396q kotlin.coroutines.f7l8 coroutineContext) {
        kotlin.jvm.internal.d2ok.m23075h(lifecycle, "lifecycle");
        kotlin.jvm.internal.d2ok.m23075h(coroutineContext, "coroutineContext");
        this.f5006k = lifecycle;
        this.f5007q = coroutineContext;
        if (mo4381k().toq() == kja0.zy.DESTROYED) {
            m4.m24497s(i1(), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4380g() {
        kotlinx.coroutines.x2.m24649g(this, C6481a.m23813n().dxef(), null, new C0914k(null), 2, null);
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@InterfaceC7396q InterfaceC0954z source, @InterfaceC7396q kja0.toq event) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(event, "event");
        if (mo4381k().toq().compareTo(kja0.zy.DESTROYED) <= 0) {
            mo4381k().zy(this);
            m4.m24497s(i1(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6556f
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 i1() {
        return this.f5007q;
    }

    @Override // androidx.lifecycle.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public kja0 mo4381k() {
        return this.f5006k;
    }
}
