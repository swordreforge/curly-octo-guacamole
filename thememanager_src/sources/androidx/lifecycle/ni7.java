package androidx.lifecycle;

import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.yl;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/kja0;", "Landroidx/lifecycle/ki;", "k", "(Landroidx/lifecycle/kja0;)Landroidx/lifecycle/ki;", "coroutineScope", "lifecycle-runtime-ktx_release"}, m22787k = 2, mv = {1, 6, 0})
public final class ni7 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final ki m4464k(@InterfaceC7396q kja0 kja0Var) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.d2ok.m23075h(kja0Var, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) kja0Var.f5093k.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(kja0Var, yl.zy(null, 1, null).plus(C6481a.m23813n().dxef()));
        } while (!zurt.m4493k(kja0Var.f5093k, null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m4380g();
        return lifecycleCoroutineScopeImpl;
    }
}
