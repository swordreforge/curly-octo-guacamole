package androidx.core.text.util;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.text.util.zy;
import androidx.core.util.x2;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: LinkifyCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final String[] f3849k = new String[0];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Comparator<toq> f50619toq = new Comparator() { // from class: androidx.core.text.util.toq
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zy.kja0((zy.toq) obj, (zy.toq) obj2);
        }
    };

    /* JADX INFO: renamed from: androidx.core.text.util.zy$k */
    /* JADX INFO: compiled from: LinkifyCompat.java */
    @hyr(24)
    static class C0627k {
        private C0627k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2907k(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @InterfaceC7830i
        static boolean toq(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LinkifyCompat.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        URLSpan f3850k;

        /* JADX INFO: renamed from: q */
        int f3851q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f50620toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f50621zy;

        toq() {
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.util.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LinkifyCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC7870zy {
    }

    private zy() {
    }

    private static void cdj(ArrayList<toq> arrayList, Spannable spannable) {
        int i2;
        int i3 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            toq toqVar = new toq();
            toqVar.f3850k = uRLSpan;
            toqVar.f50621zy = spannable.getSpanStart(uRLSpan);
            toqVar.f3851q = spannable.getSpanEnd(uRLSpan);
            arrayList.add(toqVar);
        }
        Collections.sort(arrayList, f50619toq);
        int size = arrayList.size();
        while (i3 < size - 1) {
            toq toqVar2 = arrayList.get(i3);
            int i4 = i3 + 1;
            toq toqVar3 = arrayList.get(i4);
            int i5 = toqVar2.f50621zy;
            int i6 = toqVar3.f50621zy;
            if (i5 <= i6 && (i2 = toqVar2.f3851q) > i6) {
                int i7 = toqVar3.f3851q;
                int i8 = (i7 > i2 && i2 - i5 <= i7 - i6) ? i2 - i5 < i7 - i6 ? i3 : -1 : i4;
                if (i8 != -1) {
                    Object obj = arrayList.get(i8).f3850k;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i8);
                    size--;
                }
            }
            i3 = i4;
        }
    }

    public static boolean f7l8(@lvui Spannable spannable, @lvui Pattern pattern, @dd String str) {
        return ki() ? Linkify.addLinks(spannable, pattern, str) : m2905s(spannable, pattern, str, null, null, null);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2899g(@lvui Spannable spannable, int i2) {
        if (ki()) {
            return Linkify.addLinks(spannable, i2);
        }
        if (i2 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i2 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<toq> arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            qrj(arrayList, spannable, x2.f50644ni7, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i2 & 2) != 0) {
            qrj(arrayList, spannable, x2.f50649wvg, new String[]{androidx.core.net.zy.f50536toq}, null, null);
        }
        if ((i2 & 8) != 0) {
            n7h(arrayList, spannable);
        }
        cdj(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        for (toq toqVar : arrayList) {
            if (toqVar.f3850k == null) {
                ld6(toqVar.f50620toq, toqVar.f50621zy, toqVar.f3851q, spannable);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private static String m2900h(@lvui String str, @lvui String[] strArr, Matcher matcher, @dd Linkify.TransformFilter transformFilter) {
        boolean z2;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= length) {
                z2 = false;
                break;
            }
            String str2 = strArr[i2];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                }
            } else {
                i2++;
            }
        }
        if (z2 || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static boolean ki() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int kja0(toq toqVar, toq toqVar2) {
        int i2 = toqVar.f50621zy;
        int i3 = toqVar2.f50621zy;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return Integer.compare(toqVar2.f3851q, toqVar.f3851q);
    }

    private static void ld6(String str, int i2, int i3, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i2, i3, 33);
    }

    /* JADX INFO: renamed from: n */
    public static void m2902n(@lvui TextView textView, @lvui Pattern pattern, @dd String str, @dd String[] strArr, @dd Linkify.MatchFilter matchFilter, @dd Linkify.TransformFilter transformFilter) {
        if (ki()) {
            C0627k.m2907k(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (m2905s(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            toq(textView);
        }
    }

    private static void n7h(ArrayList<toq> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i2 = 0;
        while (true) {
            try {
                String strX2 = x2(string);
                if (strX2 != null && (iIndexOf = string.indexOf(strX2)) >= 0) {
                    toq toqVar = new toq();
                    int length = strX2.length() + iIndexOf;
                    toqVar.f50621zy = iIndexOf + i2;
                    i2 += length;
                    toqVar.f3851q = i2;
                    string = string.substring(length);
                    try {
                        toqVar.f50620toq = "geo:0,0?q=" + URLEncoder.encode(strX2, "UTF-8");
                        arrayList.add(toqVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2903p(@lvui TextView textView, int i2) {
        if (ki()) {
            return Linkify.addLinks(textView, i2);
        }
        if (i2 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (m2899g(spannableStringValueOf, i2)) {
                toq(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        } else if (m2899g((Spannable) text, i2)) {
            toq(textView);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static void m2904q(@lvui TextView textView, @lvui Pattern pattern, @dd String str, @dd Linkify.MatchFilter matchFilter, @dd Linkify.TransformFilter transformFilter) {
        if (ki()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            m2902n(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    private static void qrj(ArrayList<toq> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    toq toqVar = new toq();
                    toqVar.f50620toq = m2900h(strGroup, strArr, matcher, transformFilter);
                    toqVar.f50621zy = iStart;
                    toqVar.f3851q = iEnd;
                    arrayList.add(toqVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2905s(@lvui Spannable spannable, @lvui Pattern pattern, @dd String str, @dd String[] strArr, @dd Linkify.MatchFilter matchFilter, @dd Linkify.TransformFilter transformFilter) {
        if (ki()) {
            return C0627k.toq(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f3849k;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str2 = strArr[i2];
            i2++;
            strArr2[i2] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z2 = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, iStart, iEnd) : true) && strGroup != null) {
                ld6(m2900h(strGroup, strArr2, matcher, transformFilter), iStart, iEnd, spannable);
                z2 = true;
            }
        }
        return z2;
    }

    private static void toq(@lvui TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private static String x2(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : C0626k.zy(str);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2906y(@lvui Spannable spannable, @lvui Pattern pattern, @dd String str, @dd Linkify.MatchFilter matchFilter, @dd Linkify.TransformFilter transformFilter) {
        return ki() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : m2905s(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static void zy(@lvui TextView textView, @lvui Pattern pattern, @dd String str) {
        if (ki()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            m2902n(textView, pattern, str, null, null, null);
        }
    }
}
