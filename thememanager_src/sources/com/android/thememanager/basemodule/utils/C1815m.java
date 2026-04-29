package com.android.thememanager.basemodule.utils;

import android.content.Context;
import com.android.thememanager.R;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.m */
/* JADX INFO: compiled from: UnitUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1815m {
    /* JADX INFO: renamed from: k */
    public static String m7136k(Context context, int price) {
        if (price <= 0) {
            return context.getString(R.string.resource_price_free);
        }
        float f2 = price / 100.0f;
        return context.getResources().getQuantityString(R.plurals.resource_mibi_per_set, (int) Math.ceil(f2), Float.valueOf(f2));
    }

    public static String toq(Context context, int price) {
        return zy(context, price, R.string.new_resource_price_unit);
    }

    public static String zy(Context context, int price, @zy.nn86 int priceStr) {
        String strSubstring;
        if (price <= 0) {
            return context.getString(R.string.resource_price_free);
        }
        if (price % 100 == 0) {
            strSubstring = String.valueOf(price / 100);
        } else {
            strSubstring = String.format("%.2f", Float.valueOf(price / 100.0f));
            while (strSubstring.charAt(strSubstring.length() - 1) == '0') {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            if (strSubstring.charAt(strSubstring.length() - 1) == '.') {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
        }
        return strSubstring + context.getString(priceStr);
    }
}
