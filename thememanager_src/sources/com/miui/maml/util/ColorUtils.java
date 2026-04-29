package com.miui.maml.util;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class ColorUtils {
    public static String ColorToHex(int i2) {
        int iAlpha = Color.alpha(i2);
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        return "#" + toHex(iAlpha) + toHex(iRed) + toHex(iGreen) + toHex(iBlue);
    }

    private static String toHex(int i2) {
        return "00".concat(Integer.toHexString(i2)).substring(r1.length() - 2);
    }
}
