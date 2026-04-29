package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import com.android.thememanager.util.C2755a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class hyr {

    /* JADX INFO: renamed from: k */
    public static final String f10335k = ",";

    public static ArrayList<Integer> f7l8(String formatString, String separator) {
        if (TextUtils.isEmpty(formatString)) {
            return null;
        }
        try {
            List<String> listM7090g = m7090g(separator, formatString);
            if (listM7090g == null) {
                return null;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            Iterator<String> it = listM7090g.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt(it.next())));
            }
            return arrayList;
        } catch (NumberFormatException e2) {
            Log.e("StringUtils", "parsed exception:" + e2.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m7090g(@zy.lvui CharSequence sep, String value) {
        if (TextUtils.isEmpty(value)) {
            return null;
        }
        return Arrays.asList(value.split(sep.toString()));
    }

    /* JADX INFO: renamed from: k */
    public static Spanned m7091k(Context context, int stringId, int color, String... urls) {
        return m7092n((Spannable) Html.fromHtml(String.format(context.getResources().getString(stringId), urls)), color);
    }

    /* JADX INFO: renamed from: n */
    public static Spannable m7092n(Spannable p_Text, int color) {
        for (URLSpan uRLSpan : (URLSpan[]) p_Text.getSpans(0, p_Text.length(), URLSpan.class)) {
            int spanStart = p_Text.getSpanStart(uRLSpan);
            int spanEnd = p_Text.getSpanEnd(uRLSpan);
            p_Text.removeSpan(uRLSpan);
            p_Text.setSpan(new URLSpanNoUnderline(uRLSpan.getURL(), color), spanStart, spanEnd, 0);
        }
        return p_Text;
    }

    /* JADX INFO: renamed from: q */
    public static <T> String m7093q(List<T> list, String separator) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(separator);
        }
        int length = separator.length();
        int length2 = sb.length();
        if (length2 > 0) {
            sb.delete(length2 - length, length2);
        }
        return sb.toString();
    }

    public static Map<String, String> toq(String result) {
        if (TextUtils.isEmpty(result)) {
            return null;
        }
        HashMap map = new HashMap(5);
        for (String str : result.split(";")) {
            String[] strArrSplit = str.trim().split("=");
            if (strArrSplit.length >= 2) {
                map.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        Log.d(C2755a.f16307g, "getVerifyServiceToken: param size: " + map.size());
        return map;
    }

    /* JADX INFO: renamed from: y */
    public static int m7094y(String v2, int defaultValue) {
        if (TextUtils.isEmpty(v2)) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(v2);
        } catch (NumberFormatException unused) {
            return defaultValue;
        }
    }

    public static String zy(@zy.lvui CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return elements == null ? "" : String.join(delimiter, elements);
    }
}
