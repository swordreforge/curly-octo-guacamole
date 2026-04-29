package com.android.thememanager.settings.superwallpaper.wallpaper;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.wallpaper.k */
/* JADX INFO: compiled from: WallpaperColorsCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2671k {

    /* JADX INFO: renamed from: g */
    public static final int f15810g = 2;

    /* JADX INFO: renamed from: n */
    public static final int f15811n = 1;

    /* JADX INFO: renamed from: k */
    private final int f15812k;

    /* JADX INFO: renamed from: q */
    private final int f15813q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f61006toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f61007zy;

    public C2671k(int primaryColor, int secondaryColor, int tertiaryColor, int colorHints) {
        this.f15812k = primaryColor;
        this.f61006toq = secondaryColor;
        this.f61007zy = tertiaryColor;
        this.f15813q = colorHints;
    }

    /* JADX INFO: renamed from: k */
    public int m9318k() {
        return this.f15813q;
    }

    /* JADX INFO: renamed from: n */
    public int m9319n() {
        return this.f61007zy;
    }

    /* JADX INFO: renamed from: q */
    public int m9320q() {
        return this.f61006toq;
    }

    public int toq() {
        return (this.f15813q & 1) == 1 ? 2 : 0;
    }

    public int zy() {
        return this.f15812k;
    }
}
