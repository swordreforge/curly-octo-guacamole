package androidx.lifecycle;

import androidx.lifecycle.kja0;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.was;
import kotlinx.coroutines.C6490c;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/kja0;", "Landroidx/lifecycle/kja0$zy;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "block", "k", "(Landroidx/lifecycle/kja0;Landroidx/lifecycle/kja0$zy;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Landroidx/lifecycle/z;", "toq", "(Landroidx/lifecycle/z;Landroidx/lifecycle/kja0$zy;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, m22787k = 2, mv = {1, 6, 0})
public final class RepeatOnLifecycleKt {
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final Object m4396k(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0.zy zyVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if (!(zyVar != kja0.zy.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (kja0Var.toq() == kja0.zy.DESTROYED) {
            return was.f36763k;
        }
        Object objF7l8 = C6490c.f7l8(new RepeatOnLifecycleKt$repeatOnLifecycle$3(kja0Var, zyVar, interfaceC5979h, null), interfaceC6216q);
        return objF7l8 == C6199q.x2() ? objF7l8 : was.f36763k;
    }

    @InterfaceC7395n
    public static final Object toq(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q kja0.zy zyVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        Object objM4396k = m4396k(lifecycle, zyVar, interfaceC5979h, interfaceC6216q);
        return objM4396k == C6199q.x2() ? objM4396k : was.f36763k;
    }
}
