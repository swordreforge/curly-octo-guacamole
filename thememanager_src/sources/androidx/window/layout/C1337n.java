package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.window.layout.n */
/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/window/layout/n;", "", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "point", "Lkotlin/was;", "k", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@hyr(17)
public final class C1337n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1337n f7164k = new C1337n();

    private C1337n() {
    }

    /* JADX INFO: renamed from: k */
    public final void m5705k(@InterfaceC7396q Display display, @InterfaceC7396q Point point) {
        d2ok.m23075h(display, "display");
        d2ok.m23075h(point, "point");
        display.getRealSize(point);
    }
}
