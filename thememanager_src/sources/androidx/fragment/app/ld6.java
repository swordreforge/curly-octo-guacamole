package androidx.fragment.app;

import android.os.Bundle;
import cyoe.InterfaceC5979h;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Fragment.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aJ\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\b\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Lkotlin/was;", "zy", "k", "Lkotlin/Function2;", "Lkotlin/c;", "name", "bundle", "listener", "q", "toq", "fragment-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class ld6 {
    /* JADX INFO: renamed from: k */
    public static final void m4305k(@InterfaceC7396q Fragment clearFragmentResult, @InterfaceC7396q String requestKey) {
        kotlin.jvm.internal.d2ok.m23075h(clearFragmentResult, "$this$clearFragmentResult");
        kotlin.jvm.internal.d2ok.m23075h(requestKey, "requestKey");
        clearFragmentResult.getParentFragmentManager().mo4204q(requestKey);
    }

    /* JADX INFO: renamed from: q */
    public static final void m4306q(@InterfaceC7396q Fragment setFragmentResultListener, @InterfaceC7396q String requestKey, @InterfaceC7396q InterfaceC5979h<? super String, ? super Bundle, was> listener) {
        kotlin.jvm.internal.d2ok.m23075h(setFragmentResultListener, "$this$setFragmentResultListener");
        kotlin.jvm.internal.d2ok.m23075h(requestKey, "requestKey");
        kotlin.jvm.internal.d2ok.m23075h(listener, "listener");
        setFragmentResultListener.getParentFragmentManager().toq(requestKey, setFragmentResultListener, new C0890p(listener));
    }

    public static final void toq(@InterfaceC7396q Fragment clearFragmentResultListener, @InterfaceC7396q String requestKey) {
        kotlin.jvm.internal.d2ok.m23075h(clearFragmentResultListener, "$this$clearFragmentResultListener");
        kotlin.jvm.internal.d2ok.m23075h(requestKey, "requestKey");
        clearFragmentResultListener.getParentFragmentManager().zy(requestKey);
    }

    public static final void zy(@InterfaceC7396q Fragment setFragmentResult, @InterfaceC7396q String requestKey, @InterfaceC7396q Bundle result) {
        kotlin.jvm.internal.d2ok.m23075h(setFragmentResult, "$this$setFragmentResult");
        kotlin.jvm.internal.d2ok.m23075h(requestKey, "requestKey");
        kotlin.jvm.internal.d2ok.m23075h(result, "result");
        setFragmentResult.getParentFragmentManager().mo4201k(requestKey, result);
    }
}
