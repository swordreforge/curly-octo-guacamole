package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0087\n¨\u0006\b"}, d2 = {"Landroid/util/Size;", "", "toq", "q", "Landroid/util/SizeF;", "", "k", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ki {
    @hyr(21)
    /* JADX INFO: renamed from: k */
    public static final float m2967k(@InterfaceC7396q SizeF component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.getWidth();
    }

    @hyr(21)
    /* JADX INFO: renamed from: q */
    public static final int m2968q(@InterfaceC7396q Size component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.getHeight();
    }

    @hyr(21)
    public static final int toq(@InterfaceC7396q Size component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.getWidth();
    }

    @hyr(21)
    public static final float zy(@InterfaceC7396q SizeF component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.getHeight();
    }
}
