package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: ColorDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b¨\u0006\u0005"}, d2 = {"", "Landroid/graphics/drawable/ColorDrawable;", "k", "Landroid/graphics/Color;", "toq", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class toq {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final ColorDrawable m2432k(@zy.x2 int i2) {
        return new ColorDrawable(i2);
    }

    @InterfaceC7396q
    @hyr(26)
    public static final ColorDrawable toq(@InterfaceC7396q Color toDrawable) {
        d2ok.cdj(toDrawable, "$this$toDrawable");
        return new ColorDrawable(toDrawable.toArgb());
    }
}
