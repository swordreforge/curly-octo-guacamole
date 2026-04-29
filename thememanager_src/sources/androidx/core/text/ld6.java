package androidx.core.text;

import android.text.TextUtils;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086\b¨\u0006\u0002"}, d2 = {"", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ld6 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final String m2877k(@InterfaceC7396q String htmlEncode) {
        d2ok.cdj(htmlEncode, "$this$htmlEncode");
        String strHtmlEncode = TextUtils.htmlEncode(htmlEncode);
        d2ok.m23085y(strHtmlEncode, "TextUtils.htmlEncode(this)");
        return strHtmlEncode;
    }
}
