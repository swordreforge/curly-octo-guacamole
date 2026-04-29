package androidx.window.layout;

import android.view.DisplayCutout;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.window.layout.g */
/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/g;", "", "Landroid/view/DisplayCutout;", "displayCutout", "", "toq", "q", "zy", "k", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@hyr(28)
public final class C1330g {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1330g f7153k = new C1330g();

    private C1330g() {
    }

    /* JADX INFO: renamed from: k */
    public final int m5680k(@InterfaceC7396q DisplayCutout displayCutout) {
        d2ok.m23075h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: q */
    public final int m5681q(@InterfaceC7396q DisplayCutout displayCutout) {
        d2ok.m23075h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }

    public final int toq(@InterfaceC7396q DisplayCutout displayCutout) {
        d2ok.m23075h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int zy(@InterfaceC7396q DisplayCutout displayCutout) {
        d2ok.m23075h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }
}
