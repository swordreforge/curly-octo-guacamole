package androidx.fragment.app;

import android.view.View;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/Fragment;", com.market.sdk.reflect.toq.f28136y, "Landroid/view/View;", "k", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class d2ok {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <F extends Fragment> F m4243k(@InterfaceC7396q View findFragment) {
        kotlin.jvm.internal.d2ok.m23075h(findFragment, "$this$findFragment");
        F f2 = (F) FragmentManager.m4192x(findFragment);
        kotlin.jvm.internal.d2ok.kja0(f2, "FragmentManager.findFragment(this)");
        return f2;
    }
}
