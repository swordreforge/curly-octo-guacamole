package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import com.android.thememanager.controller.online.InterfaceC1925p;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.core.text.q */
/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b¨\u0006\u000b"}, d2 = {"", "", InterfaceC1925p.pwo, "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "k", "option", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0620q {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Spanned m2884k(@InterfaceC7396q String parseAsHtml, int i2, @InterfaceC7395n Html.ImageGetter imageGetter, @InterfaceC7395n Html.TagHandler tagHandler) {
        d2ok.cdj(parseAsHtml, "$this$parseAsHtml");
        Spanned qVar = zy.toq(parseAsHtml, i2, imageGetter, tagHandler);
        d2ok.m23085y(qVar, "HtmlCompat.fromHtml(this… imageGetter, tagHandler)");
        return qVar;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m2885q(Spanned toHtml, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        d2ok.cdj(toHtml, "$this$toHtml");
        String strZy = zy.zy(toHtml, i2);
        d2ok.m23085y(strZy, "HtmlCompat.toHtml(this, option)");
        return strZy;
    }

    public static /* synthetic */ Spanned toq(String parseAsHtml, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            imageGetter = null;
        }
        if ((i3 & 4) != 0) {
            tagHandler = null;
        }
        d2ok.cdj(parseAsHtml, "$this$parseAsHtml");
        Spanned qVar = zy.toq(parseAsHtml, i2, imageGetter, tagHandler);
        d2ok.m23085y(qVar, "HtmlCompat.fromHtml(this… imageGetter, tagHandler)");
        return qVar;
    }

    @InterfaceC7396q
    public static final String zy(@InterfaceC7396q Spanned toHtml, int i2) {
        d2ok.cdj(toHtml, "$this$toHtml");
        String strZy = zy.zy(toHtml, i2);
        d2ok.m23085y(strZy, "HtmlCompat.toHtml(this, option)");
        return strZy;
    }
}
