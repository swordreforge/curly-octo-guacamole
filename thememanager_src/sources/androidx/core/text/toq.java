package androidx.core.text;

import android.text.TextUtils;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b¨\u0006\u0005"}, d2 = {"", "", "k", "", "toq", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class toq {
    /* JADX INFO: renamed from: k */
    public static final boolean m2891k(@InterfaceC7396q CharSequence isDigitsOnly) {
        d2ok.cdj(isDigitsOnly, "$this$isDigitsOnly");
        return TextUtils.isDigitsOnly(isDigitsOnly);
    }

    public static final int toq(@InterfaceC7396q CharSequence trimmedLength) {
        d2ok.cdj(trimmedLength, "$this$trimmedLength");
        return TextUtils.getTrimmedLength(trimmedLength);
    }
}
