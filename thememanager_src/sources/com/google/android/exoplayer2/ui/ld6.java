package com.google.android.exoplayer2.ui;

import android.graphics.Color;

/* JADX INFO: compiled from: HtmlUtils.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6 {
    private ld6() {
    }

    /* JADX INFO: renamed from: k */
    public static String m13318k(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str).length());
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static String toq(@zy.x2 int i2) {
        return com.google.android.exoplayer2.util.lrht.gvn7("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(((double) Color.alpha(i2)) / 255.0d));
    }
}
