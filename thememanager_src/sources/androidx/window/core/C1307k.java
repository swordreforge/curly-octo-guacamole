package androidx.window.core;

import android.util.Log;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.window.core.k */
/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/window/core/k;", "Landroidx/window/core/g;", "", "tag", "message", "Lkotlin/was;", "k", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1307k implements InterfaceC1306g {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1307k f7077k = new C1307k();

    private C1307k() {
    }

    @Override // androidx.window.core.InterfaceC1306g
    /* JADX INFO: renamed from: k */
    public void mo5587k(@InterfaceC7396q String tag, @InterfaceC7396q String message) {
        d2ok.m23075h(tag, "tag");
        d2ok.m23075h(message, "message");
        Log.d(tag, message);
    }
}
