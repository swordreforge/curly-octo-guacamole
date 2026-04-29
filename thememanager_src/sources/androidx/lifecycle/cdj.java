package androidx.lifecycle;

import androidx.lifecycle.kja0;
import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LifecycleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\bJ\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/cdj;", "", "Lkotlinx/coroutines/gbni;", "parentJob", "Lkotlin/was;", "zy", "toq", "Landroidx/lifecycle/kja0;", "k", "Landroidx/lifecycle/kja0;", "lifecycle", "Landroidx/lifecycle/kja0$zy;", "Landroidx/lifecycle/kja0$zy;", "minState", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "dispatchQueue", "Landroidx/lifecycle/fn3e;", "q", "Landroidx/lifecycle/fn3e;", "observer", C4991s.f28129n, "(Landroidx/lifecycle/kja0;Landroidx/lifecycle/kja0$zy;Landroidx/lifecycle/y;Lkotlinx/coroutines/gbni;)V", "lifecycle-runtime-ktx_release"}, m22787k = 1, mv = {1, 6, 0})
@zy.oc
public final class cdj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kja0 f5049k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final fn3e f5050q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final kja0.zy f51567toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C0953y f51568zy;

    public cdj(@InterfaceC7396q kja0 lifecycle, @InterfaceC7396q kja0.zy minState, @InterfaceC7396q C0953y dispatchQueue, @InterfaceC7396q final gbni parentJob) {
        kotlin.jvm.internal.d2ok.m23075h(lifecycle, "lifecycle");
        kotlin.jvm.internal.d2ok.m23075h(minState, "minState");
        kotlin.jvm.internal.d2ok.m23075h(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.d2ok.m23075h(parentJob, "parentJob");
        this.f5049k = lifecycle;
        this.f51567toq = minState;
        this.f51568zy = dispatchQueue;
        fn3e fn3eVar = new fn3e() { // from class: androidx.lifecycle.h
            @Override // androidx.lifecycle.fn3e
            public final void gvn7(InterfaceC0954z interfaceC0954z, kja0.toq toqVar) {
                cdj.m4409q(this.f5085k, parentJob, interfaceC0954z, toqVar);
            }
        };
        this.f5050q = fn3eVar;
        if (lifecycle.toq() != kja0.zy.DESTROYED) {
            lifecycle.mo4451k(fn3eVar);
        } else {
            gbni.C6665k.toq(parentJob, null, 1, null);
            toq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m4409q(cdj this$0, gbni parentJob, InterfaceC0954z source, kja0.toq toqVar) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        kotlin.jvm.internal.d2ok.m23075h(parentJob, "$parentJob");
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(toqVar, "<anonymous parameter 1>");
        if (source.getLifecycle().toq() == kja0.zy.DESTROYED) {
            gbni.C6665k.toq(parentJob, null, 1, null);
            this$0.toq();
        } else if (source.getLifecycle().toq().compareTo(this$0.f51567toq) < 0) {
            this$0.f51568zy.m4492y();
        } else {
            this$0.f51568zy.m4491s();
        }
    }

    private final void zy(gbni gbniVar) {
        gbni.C6665k.toq(gbniVar, null, 1, null);
        toq();
    }

    @zy.oc
    public final void toq() {
        this.f5049k.zy(this.f5050q);
        this.f51568zy.f7l8();
    }
}
