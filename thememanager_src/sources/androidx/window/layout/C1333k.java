package androidx.window.layout;

import android.app.Activity;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.window.layout.k */
/* JADX INFO: compiled from: ActivityCompatHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Landroidx/window/layout/k;", "", "Landroid/app/Activity;", C1873k.f10652g, "", "k", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@hyr(24)
public final class C1333k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1333k f7161k = new C1333k();

    private C1333k() {
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5696k(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
