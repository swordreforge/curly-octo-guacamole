package com.miui.maml.util;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.google.android.exoplayer2.extractor.ts.wvg;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import z4j7.C7797k;

/* JADX INFO: loaded from: classes3.dex */
public class ThemeDensityFallbackUtils {
    private static final int DENSITY_NONE = 1;
    private static final int[] DENSITIES = {C7797k.f100633toq, 480, 320, wvg.f64659wvg, 0};
    private static final int[] ALL_SUPPORT_DENSITY = {C7797k.f100633toq, 480, 320, 440, wvg.f64659wvg, ThemeStatus.Redeem.REDEEMING, 120};

    private ThemeDensityFallbackUtils() {
    }

    public static String findNearestDir(String str, final int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            int[] iArr = ALL_SUPPORT_DENSITY;
            if (i3 >= iArr.length) {
                break;
            }
            arrayList.add(Integer.valueOf(iArr[i3]));
            i3++;
        }
        Collections.sort(arrayList, new Comparator<Integer>() { // from class: com.miui.maml.util.ThemeDensityFallbackUtils.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Math.abs(num.intValue() - i2) - Math.abs(num2.intValue() - i2);
            }
        });
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str2 = "drawable" + getScreenWidthSuffix(Resources.getSystem().getConfiguration()) + getDensitySuffix(((Integer) arrayList.get(i4)).intValue());
            if (new File(str + str2).exists()) {
                return str2;
            }
        }
        return null;
    }

    public static int findNearestSupportDensity(int i2) {
        int i3 = 440;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (true) {
            int[] iArr = ALL_SUPPORT_DENSITY;
            if (i5 >= iArr.length) {
                return i3;
            }
            int iAbs = Math.abs(i2 - iArr[i5]);
            if (iAbs < i4) {
                i3 = iArr[i5];
                i4 = iAbs;
            }
            i5++;
        }
    }

    public static String getDensitySuffix(int i2) {
        if (i2 == 0) {
            return "";
        }
        if (i2 == 1) {
            return "-nodpi";
        }
        if (i2 == 120) {
            return "-ldpi";
        }
        if (i2 == 160) {
            return "-mdpi";
        }
        if (i2 == 240) {
            return "-hdpi";
        }
        if (i2 == 320) {
            return "-xhdpi";
        }
        if (i2 == 440) {
            return "-nxhdpi";
        }
        if (i2 == 480) {
            return "-xxhdpi";
        }
        if (i2 == 640) {
            return "-xxxhdpi";
        }
        int length = DENSITIES.length - 1;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            int[] iArr = DENSITIES;
            if (Math.abs(iArr[i3] - i2) <= Math.abs(iArr[length] - i2)) {
                length = i3;
            }
        }
        return getDensitySuffix(DENSITIES[length]);
    }

    public static String getScreenWidthSuffix(Configuration configuration) {
        return configuration.smallestScreenWidthDp >= 720 ? "-sw720dp" : "";
    }
}
