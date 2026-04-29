package androidx.lifecycle;

import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.yl;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"", "k", "Ljava/lang/String;", "JOB_KEY", "Landroidx/lifecycle/lrht;", "Lkotlinx/coroutines/f;", "(Landroidx/lifecycle/lrht;)Lkotlinx/coroutines/f;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, m22787k = 2, mv = {1, 6, 0})
public final class uv6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f5118k = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final InterfaceC6556f m4473k(@InterfaceC7396q lrht lrhtVar) {
        kotlin.jvm.internal.d2ok.m23075h(lrhtVar, "<this>");
        InterfaceC6556f interfaceC6556f = (InterfaceC6556f) lrhtVar.x9kr(f5118k);
        if (interfaceC6556f != null) {
            return interfaceC6556f;
        }
        Object objM4452l = lrhtVar.m4452l(f5118k, new C0945q(yl.zy(null, 1, null).plus(C6481a.m23813n().dxef())));
        kotlin.jvm.internal.d2ok.kja0(objM4452l, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (InterfaceC6556f) objM4452l;
    }
}
