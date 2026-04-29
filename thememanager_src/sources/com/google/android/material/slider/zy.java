package com.google.android.material.slider;

import java.util.Locale;
import zy.lvui;

/* JADX INFO: compiled from: BasicLabelFormatter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements InterfaceC4121q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67870f7l8 = 1000000;

    /* JADX INFO: renamed from: g */
    private static final int f25056g = 1000000000;

    /* JADX INFO: renamed from: n */
    private static final long f25057n = 1000000000000L;

    /* JADX INFO: renamed from: y */
    private static final int f25058y = 1000;

    @Override // com.google.android.material.slider.InterfaceC4121q
    @lvui
    /* JADX INFO: renamed from: k */
    public String mo14908k(float f2) {
        return f2 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f2 / 1.0E12f)) : f2 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f2 / 1.0E9f)) : f2 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f2 / 1000000.0f)) : f2 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f2 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f2));
    }
}
