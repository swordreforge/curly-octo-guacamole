package androidx.activity.result;

import androidx.core.app.C0447s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ActivityResultLauncher.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a%\u0010\u0006\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/g;", "Ljava/lang/Void;", "Landroidx/core/app/s;", "options", "Lkotlin/was;", "k", "zy", "(Landroidx/activity/result/g;Landroidx/core/app/s;)V", "activity-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class f7l8 {
    /* JADX INFO: renamed from: k */
    public static final void m77k(@InterfaceC7396q AbstractC0067g<Void> launch, @InterfaceC7395n C0447s c0447s) {
        d2ok.m23075h(launch, "$this$launch");
        launch.zy(null, c0447s);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m78q(AbstractC0067g abstractC0067g, C0447s c0447s, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c0447s = null;
        }
        zy(abstractC0067g, c0447s);
    }

    public static /* synthetic */ void toq(AbstractC0067g abstractC0067g, C0447s c0447s, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c0447s = null;
        }
        m77k(abstractC0067g, c0447s);
    }

    @InterfaceC6769y(name = "launchUnit")
    public static final void zy(@InterfaceC7396q AbstractC0067g<was> launch, @InterfaceC7395n C0447s c0447s) {
        d2ok.m23075h(launch, "$this$launch");
        launch.zy(null, c0447s);
    }
}
