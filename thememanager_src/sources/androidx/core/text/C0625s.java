package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.exoplayer2.text.ttml.C3678q;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.core.text.s */
/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0087\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0086\n¨\u0006\u000e"}, d2 = {"", "Landroid/text/Spannable;", "q", "Lkotlin/was;", "k", "", "start", C3678q.f65807ch, "", C3678q.f65840t8r, "toq", "Lkotlin/ranges/x2;", "range", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0625s {
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: k */
    public static final void m2889k(@InterfaceC7396q Spannable clearSpans) {
        d2ok.cdj(clearSpans, "$this$clearSpans");
        Object[] spans = clearSpans.getSpans(0, clearSpans.length(), Object.class);
        d2ok.m23085y(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            clearSpans.removeSpan(obj);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final Spannable m2890q(@InterfaceC7396q CharSequence toSpannable) {
        d2ok.cdj(toSpannable, "$this$toSpannable");
        SpannableString spannableStringValueOf = SpannableString.valueOf(toSpannable);
        d2ok.m23085y(spannableStringValueOf, "SpannableString.valueOf(this)");
        return spannableStringValueOf;
    }

    public static final void toq(@InterfaceC7396q Spannable set, int i2, int i3, @InterfaceC7396q Object span) {
        d2ok.cdj(set, "$this$set");
        d2ok.cdj(span, "span");
        set.setSpan(span, i2, i3, 17);
    }

    public static final void zy(@InterfaceC7396q Spannable set, @InterfaceC7396q kotlin.ranges.x2 range, @InterfaceC7396q Object span) {
        d2ok.cdj(set, "$this$set");
        d2ok.cdj(range, "range");
        d2ok.cdj(span, "span");
        set.setSpan(span, range.mo2951k().intValue(), range.zy().intValue(), 17);
    }
}
