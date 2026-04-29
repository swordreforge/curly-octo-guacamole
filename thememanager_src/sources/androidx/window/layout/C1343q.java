package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.window.layout.q */
/* JADX INFO: compiled from: ActivityCompatHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Landroidx/window/layout/q;", "", "Landroid/app/Activity;", C1873k.f10652g, "Landroid/graphics/Rect;", "k", "toq", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@hyr(30)
public final class C1343q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1343q f7172k = new C1343q();

    private C1343q() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Rect m5720k(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        d2ok.kja0(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @InterfaceC7396q
    public final Rect toq(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        d2ok.kja0(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
