package com.android.thememanager.basemodule.utils;

import android.content.Context;
import com.android.thememanager.R;
import com.google.android.exoplayer2.C3548p;
import com.miui.maml.folme.AnimatedProperty;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: FormatUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f10437k = "10%s+";

    private x2() {
    }

    /* JADX INFO: renamed from: k */
    public static String m7238k(Context context, long number) {
        return context == null ? "" : number < 1000 ? String.valueOf(number) : number < 10000 ? String.valueOf((number / 100) * 100) : number < 100000 ? context.getResources().getString(R.string.ad_download_number_text_unit_ten_thousand, String.format("%.1f", Double.valueOf(number / 10000.0d))) : number < 100000000 ? context.getResources().getString(R.string.ad_download_number_text_unit_ten_thousand, String.valueOf(number / 10000)) : number < C3548p.f21101p ? context.getResources().getString(R.string.ad_download_number_text_unit_hundred_million, String.format("%.1f", Double.valueOf(number / 1.0E8d))) : context.getResources().getString(R.string.ad_download_number_text_unit_hundred_million, String.valueOf(number / 100000000));
    }

    public static String toq(long size) {
        return Math.round(size / 1048576.0f) + "M";
    }

    public static String zy(int count) {
        DecimalFormat decimalFormat = new DecimalFormat(".0");
        String strLd6 = kja0.ld6(R.string.ten_thousand_unit);
        if (count < 10000) {
            return String.valueOf(count);
        }
        if (count < 10000 || count >= 100000) {
            return Locale.getDefault().getCountry().equals("CN") ? String.format(f10437k, strLd6) : Locale.getDefault().getLanguage().startsWith("zh") ? "10w+" : "100k+";
        }
        boolean zEquals = Locale.getDefault().getCountry().equals("CN");
        boolean zStartsWith = Locale.getDefault().getLanguage().startsWith("zh");
        if (zEquals) {
            return decimalFormat.format(count / 10000.0f) + strLd6;
        }
        if (zStartsWith) {
            return decimalFormat.format(count / 10000.0f) + AnimatedProperty.PROPERTY_NAME_W;
        }
        return decimalFormat.format(count / 1000.0f) + "k";
    }
}
