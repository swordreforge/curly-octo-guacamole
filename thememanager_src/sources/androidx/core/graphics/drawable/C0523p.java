package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.p */
/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0087\b¨\u0006\b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "k", "toq", "Landroid/net/Uri;", "zy", "", "q", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0523p {
    @InterfaceC7396q
    @hyr(26)
    /* JADX INFO: renamed from: k */
    public static final Icon m2426k(@InterfaceC7396q Bitmap toAdaptiveIcon) {
        d2ok.cdj(toAdaptiveIcon, "$this$toAdaptiveIcon");
        Icon iconCreateWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(toAdaptiveIcon);
        d2ok.m23085y(iconCreateWithAdaptiveBitmap, "Icon.createWithAdaptiveBitmap(this)");
        return iconCreateWithAdaptiveBitmap;
    }

    @InterfaceC7396q
    @hyr(26)
    /* JADX INFO: renamed from: q */
    public static final Icon m2427q(@InterfaceC7396q byte[] toIcon) {
        d2ok.cdj(toIcon, "$this$toIcon");
        Icon iconCreateWithData = Icon.createWithData(toIcon, 0, toIcon.length);
        d2ok.m23085y(iconCreateWithData, "Icon.createWithData(this, 0, size)");
        return iconCreateWithData;
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Icon toq(@InterfaceC7396q Bitmap toIcon) {
        d2ok.cdj(toIcon, "$this$toIcon");
        Icon iconCreateWithBitmap = Icon.createWithBitmap(toIcon);
        d2ok.m23085y(iconCreateWithBitmap, "Icon.createWithBitmap(this)");
        return iconCreateWithBitmap;
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Icon zy(@InterfaceC7396q Uri toIcon) {
        d2ok.cdj(toIcon, "$this$toIcon");
        Icon iconCreateWithContentUri = Icon.createWithContentUri(toIcon);
        d2ok.m23085y(iconCreateWithContentUri, "Icon.createWithContentUri(this)");
        return iconCreateWithContentUri;
    }
}
