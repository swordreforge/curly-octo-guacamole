package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.exifinterface.media.C0846k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.core.text.p */
/* JADX INFO: compiled from: SpannedString.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a<\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Landroid/text/Spanned;", "zy", "", C0846k.zaso, "", "start", C3678q.f65807ch, "", "k", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0619p {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ <T> T[] m2883k(@InterfaceC7396q Spanned getSpans, int i2, int i3) {
        d2ok.cdj(getSpans, "$this$getSpans");
        d2ok.m23086z(4, C0846k.zaso);
        T[] tArr = (T[]) getSpans.getSpans(i2, i3, Object.class);
        d2ok.m23085y(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static /* synthetic */ Object[] toq(Spanned getSpans, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = getSpans.length();
        }
        d2ok.cdj(getSpans, "$this$getSpans");
        d2ok.m23086z(4, C0846k.zaso);
        Object[] spans = getSpans.getSpans(i2, i3, Object.class);
        d2ok.m23085y(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @InterfaceC7396q
    public static final Spanned zy(@InterfaceC7396q CharSequence toSpanned) {
        d2ok.cdj(toSpanned, "$this$toSpanned");
        SpannedString spannedStringValueOf = SpannedString.valueOf(toSpanned);
        d2ok.m23085y(spannedStringValueOf, "SpannedString.valueOf(this)");
        return spannedStringValueOf;
    }
}
