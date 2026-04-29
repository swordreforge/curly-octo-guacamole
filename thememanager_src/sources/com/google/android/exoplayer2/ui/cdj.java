package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.span.C3661g;
import com.google.android.exoplayer2.text.span.C3662k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.google.android.exoplayer2.ui.cdj;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.zkd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SpannedToHtmlConverter.java */
/* JADX INFO: loaded from: classes2.dex */
final class cdj {

    /* JADX INFO: renamed from: k */
    private static final Pattern f22565k = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.cdj$q */
    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    private static final class C3738q {

        /* JADX INFO: renamed from: k */
        private final List<zy> f22566k = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<zy> f66083toq = new ArrayList();
    }

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public final String f22567k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final Map<String, String> f66084toq;

        private toq(String str, Map<String, String> map) {
            this.f22567k = str;
            this.f66084toq = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    static final class zy {

        /* JADX INFO: renamed from: k */
        public final int f22570k;

        /* JADX INFO: renamed from: q */
        public final String f22571q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f66085toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final String f66086zy;

        /* JADX INFO: renamed from: n */
        private static final Comparator<zy> f22569n = new Comparator() { // from class: com.google.android.exoplayer2.ui.ki
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return cdj.zy.m13265n((cdj.zy) obj, (cdj.zy) obj2);
            }
        };

        /* JADX INFO: renamed from: g */
        private static final Comparator<zy> f22568g = new Comparator() { // from class: com.google.android.exoplayer2.ui.t8r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return cdj.zy.m13263g((cdj.zy) obj, (cdj.zy) obj2);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ int m13263g(zy zyVar, zy zyVar2) {
            int iCompare = Integer.compare(zyVar2.f22570k, zyVar.f22570k);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = zyVar2.f66086zy.compareTo(zyVar.f66086zy);
            return iCompareTo != 0 ? iCompareTo : zyVar2.f22571q.compareTo(zyVar.f22571q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ int m13265n(zy zyVar, zy zyVar2) {
            int iCompare = Integer.compare(zyVar2.f66085toq, zyVar.f66085toq);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = zyVar.f66086zy.compareTo(zyVar2.f66086zy);
            return iCompareTo != 0 ? iCompareTo : zyVar.f22571q.compareTo(zyVar2.f22571q);
        }

        private zy(int i2, int i3, String str, String str2) {
            this.f22570k = i2;
            this.f66085toq = i3;
            this.f66086zy = str;
            this.f22571q = str2;
        }
    }

    private cdj() {
    }

    private static String f7l8(int i2) {
        return i2 != 2 ? "over right" : "under left";
    }

    /* JADX INFO: renamed from: g */
    private static C3738q m13257g(SparseArray<C3738q> sparseArray, int i2) {
        C3738q c3738q = sparseArray.get(i2);
        if (c3738q != null) {
            return c3738q;
        }
        C3738q c3738q2 = new C3738q();
        sparseArray.put(i2, c3738q2);
        return c3738q2;
    }

    /* JADX INFO: renamed from: k */
    public static toq m13258k(@zy.dd CharSequence charSequence, float f2) {
        if (charSequence == null) {
            return new toq("", zkd.of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new toq(toq(charSequence), zkd.of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            StringBuilder sb = new StringBuilder(14);
            sb.append("bg_");
            sb.append(iIntValue);
            map.put(ld6.m13318k(sb.toString()), com.google.android.exoplayer2.util.lrht.gvn7("background-color:%s;", ld6.toq(iIntValue)));
        }
        SparseArray<C3738q> sparseArrayZy = zy(spanned, f2);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i3 = 0;
        while (i2 < sparseArrayZy.size()) {
            int iKeyAt = sparseArrayZy.keyAt(i2);
            sb2.append(toq(spanned.subSequence(i3, iKeyAt)));
            C3738q c3738q = sparseArrayZy.get(iKeyAt);
            Collections.sort(c3738q.f66083toq, zy.f22568g);
            Iterator it2 = c3738q.f66083toq.iterator();
            while (it2.hasNext()) {
                sb2.append(((zy) it2.next()).f22571q);
            }
            Collections.sort(c3738q.f22566k, zy.f22569n);
            Iterator it3 = c3738q.f22566k.iterator();
            while (it3.hasNext()) {
                sb2.append(((zy) it3.next()).f66086zy);
            }
            i2++;
            i3 = iKeyAt;
        }
        sb2.append(toq(spanned.subSequence(i3, spanned.length())));
        return new toq(sb2.toString(), map);
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    private static String m13259n(Object obj, float f2) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return com.google.android.exoplayer2.util.lrht.gvn7("<span style='color:%s;'>", ld6.toq(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return com.google.android.exoplayer2.util.lrht.gvn7("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C3662k) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return com.google.android.exoplayer2.util.lrht.gvn7("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r4.getSize() : r4.getSize() / f2));
        }
        if (obj instanceof RelativeSizeSpan) {
            return com.google.android.exoplayer2.util.lrht.gvn7("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return com.google.android.exoplayer2.util.lrht.gvn7("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof com.google.android.exoplayer2.text.span.zy)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof C3661g)) {
                return null;
            }
            C3661g c3661g = (C3661g) obj;
            return com.google.android.exoplayer2.util.lrht.gvn7("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m13261y(c3661g.f21947k, c3661g.f65717toq), f7l8(c3661g.f65718zy));
        }
        int i2 = ((com.google.android.exoplayer2.text.span.zy) obj).f65721toq;
        if (i2 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i2 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i2 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    private static String m13260q(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C3662k) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C3661g)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof com.google.android.exoplayer2.text.span.zy) {
                String qVar = toq(((com.google.android.exoplayer2.text.span.zy) obj).f21949k);
                StringBuilder sb = new StringBuilder(String.valueOf(qVar).length() + 16);
                sb.append("<rt>");
                sb.append(qVar);
                sb.append("</rt></ruby>");
                return sb.toString();
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String toq(CharSequence charSequence) {
        return f22565k.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* JADX INFO: renamed from: y */
    private static String m13261y(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (i3 == 1) {
            sb.append("filled ");
        } else if (i3 == 2) {
            sb.append("open ");
        }
        if (i2 == 0) {
            sb.append("none");
        } else if (i2 == 1) {
            sb.append(C3678q.f65845xwq3);
        } else if (i2 == 2) {
            sb.append("dot");
        } else if (i2 != 3) {
            sb.append("unset");
        } else {
            sb.append(C3678q.f65811dr);
        }
        return sb.toString();
    }

    private static SparseArray<C3738q> zy(Spanned spanned, float f2) {
        SparseArray<C3738q> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strM13259n = m13259n(obj, f2);
            String strM13260q = m13260q(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strM13259n != null) {
                C3844k.f7l8(strM13260q);
                zy zyVar = new zy(spanStart, spanEnd, strM13259n, strM13260q);
                m13257g(sparseArray, spanStart).f22566k.add(zyVar);
                m13257g(sparseArray, spanEnd).f66083toq.add(zyVar);
            }
        }
        return sparseArray;
    }
}
