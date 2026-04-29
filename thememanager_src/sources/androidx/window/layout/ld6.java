package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.qrj;
import androidx.window.layout.x2;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import com.market.sdk.utils.C5019y;
import java.util.ArrayList;
import java.util.List;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/ld6;", "", "Landroid/app/Activity;", C1873k.f10652g, "Landroidx/window/core/toq;", "bounds", "", "zy", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/x2;", "k", "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/x2;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", C5019y.f69035jk, "Landroidx/window/layout/fu4;", "toq", "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/fu4;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ld6 f7163k = new ld6();

    private ld6() {
    }

    private final boolean zy(Activity activity, androidx.window.core.toq toqVar) {
        Rect rectM5736k = wvg.f53759toq.zy(activity).m5736k();
        if (toqVar.m5605y()) {
            return false;
        }
        if (toqVar.m5600g() != rectM5736k.width() && toqVar.toq() != rectM5736k.height()) {
            return false;
        }
        if (toqVar.m5600g() >= rectM5736k.width() || toqVar.toq() >= rectM5736k.height()) {
            return (toqVar.m5600g() == rectM5736k.width() && toqVar.toq() == rectM5736k.height()) ? false : true;
        }
        return false;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final x2 m5704k(@InterfaceC7396q Activity activity, @InterfaceC7396q FoldingFeature oemFeature) {
        qrj.toq toqVarM5725k;
        x2.zy zyVar;
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            toqVarM5725k = qrj.toq.f53755toq.m5725k();
        } else {
            if (type != 2) {
                return null;
            }
            toqVarM5725k = qrj.toq.f53755toq.toq();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            zyVar = x2.zy.f53766zy;
        } else {
            if (state != 2) {
                return null;
            }
            zyVar = x2.zy.f7184q;
        }
        Rect bounds = oemFeature.getBounds();
        d2ok.kja0(bounds, "oemFeature.bounds");
        if (!zy(activity, new androidx.window.core.toq(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        d2ok.kja0(bounds2, "oemFeature.bounds");
        return new qrj(new androidx.window.core.toq(bounds2), toqVarM5725k, zyVar);
    }

    @InterfaceC7396q
    public final fu4 toq(@InterfaceC7396q Activity activity, @InterfaceC7396q WindowLayoutInfo info) {
        x2 x2VarM5704k;
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        d2ok.kja0(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                ld6 ld6Var = f7163k;
                d2ok.kja0(feature, "feature");
                x2VarM5704k = ld6Var.m5704k(activity, feature);
            } else {
                x2VarM5704k = null;
            }
            if (x2VarM5704k != null) {
                arrayList.add(x2VarM5704k);
            }
        }
        return new fu4(arrayList);
    }
}
