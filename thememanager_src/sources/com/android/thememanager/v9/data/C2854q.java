package com.android.thememanager.v9.data;

import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;

/* JADX INFO: renamed from: com.android.thememanager.v9.data.q */
/* JADX INFO: compiled from: SuperWallpaperApkData.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2854q extends C2852n {

    /* JADX INFO: renamed from: g */
    public boolean f17087g;

    /* JADX INFO: renamed from: n */
    public String f17088n;

    /* JADX INFO: renamed from: q */
    public SuperWallpaperSummaryData f17089q;

    public C2854q(SuperWallpaperSummaryData summaryData, String packageName, boolean isFromPreset) {
        this.f17089q = summaryData;
        this.f17088n = packageName;
        this.f17087g = isFromPreset;
    }
}
