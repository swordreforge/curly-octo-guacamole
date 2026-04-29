package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.k */
/* JADX INFO: compiled from: BitmapDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0005"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/drawable/BitmapDrawable;", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0521k {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final BitmapDrawable m2421k(@InterfaceC7396q Bitmap toDrawable, @InterfaceC7396q Resources resources) {
        d2ok.cdj(toDrawable, "$this$toDrawable");
        d2ok.cdj(resources, "resources");
        return new BitmapDrawable(resources, toDrawable);
    }
}
