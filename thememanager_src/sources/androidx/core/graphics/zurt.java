package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PorterDuff.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "toq", "", "color", "Landroid/graphics/PorterDuffColorFilter;", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class zurt {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final PorterDuffColorFilter m2588k(@InterfaceC7396q PorterDuff.Mode toColorFilter, int i2) {
        d2ok.cdj(toColorFilter, "$this$toColorFilter");
        return new PorterDuffColorFilter(i2, toColorFilter);
    }

    @InterfaceC7396q
    public static final PorterDuffXfermode toq(@InterfaceC7396q PorterDuff.Mode toXfermode) {
        d2ok.cdj(toXfermode, "$this$toXfermode");
        return new PorterDuffXfermode(toXfermode);
    }
}
