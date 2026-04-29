package com.android.thememanager.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class SuperWallpaperBannerGroup {
    public ArrayList<SuperWallpaperBanner> superWallpaperBannerList;

    public String toString() {
        ArrayList<SuperWallpaperBanner> arrayList = this.superWallpaperBannerList;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.superWallpaperBannerList.size(); i2++) {
            sb.append(this.superWallpaperBannerList.get(i2).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
