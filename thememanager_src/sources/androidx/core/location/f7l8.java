package androidx.core.location;

import android.location.Location;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Location.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n¨\u0006\u0004"}, d2 = {"Landroid/location/Location;", "", "k", "toq", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class f7l8 {
    /* JADX INFO: renamed from: k */
    public static final double m2621k(@InterfaceC7396q Location component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.getLatitude();
    }

    public static final double toq(@InterfaceC7396q Location component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.getLongitude();
    }
}
