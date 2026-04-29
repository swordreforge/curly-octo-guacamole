package com.android.thememanager.v9.holder;

import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView;
import com.android.thememanager.v9.data.C2854q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.v9.holder.k */
/* JADX INFO: compiled from: ApkSuperWallpaperViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2861k extends RecyclerView.fti {

    /* JADX INFO: renamed from: k */
    private ApkSuperWallpaperItemView f17114k;

    public C2861k(@lvui ApkSuperWallpaperItemView itemView) {
        super(itemView);
        this.f17114k = itemView;
        itemView.setIsSuperWallpaperListPage(true);
    }

    public ApkSuperWallpaperItemView fn3e() {
        return this.f17114k;
    }

    public void ki(int position, C2854q data) {
        if (data == null || this.f17114k.fti()) {
            return;
        }
        this.f17114k.setSuperWallpaperStatusChangeCallback(null);
        this.f17114k.setBaseContents(data.f17089q, data.f61468zy);
    }
}
