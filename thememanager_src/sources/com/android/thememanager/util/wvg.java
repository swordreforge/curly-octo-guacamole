package com.android.thememanager.util;

import android.graphics.Color;

/* JADX INFO: compiled from: ColorArt.java */
/* JADX INFO: loaded from: classes2.dex */
public class wvg {
    /* JADX INFO: renamed from: k */
    public static boolean m10067k(int color) {
        return 1.0d - ((((((double) Color.red(color)) * 0.299d) + (((double) Color.green(color)) * 0.587d)) + (((double) Color.blue(color)) * 0.114d)) / 255.0d) >= 0.5d;
    }
}
