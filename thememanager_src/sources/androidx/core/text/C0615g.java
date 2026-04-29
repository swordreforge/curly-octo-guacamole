package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.text.g */
/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "", "k", "(Ljava/util/Locale;)I", "layoutDirection", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0615g {
    @hyr(17)
    /* JADX INFO: renamed from: k */
    public static final int m2858k(@InterfaceC7396q Locale layoutDirection) {
        d2ok.cdj(layoutDirection, "$this$layoutDirection");
        return TextUtils.getLayoutDirectionFromLocale(layoutDirection);
    }
}
