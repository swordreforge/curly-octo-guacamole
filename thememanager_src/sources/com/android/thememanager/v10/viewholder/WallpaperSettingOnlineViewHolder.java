package com.android.thememanager.v10.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder;
import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSettingOnlineViewHolder extends BaseViewHolder<UIElement> {
    WallpaperSettingOnlineViewHolder(View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        x9kr();
    }

    public static WallpaperSettingOnlineViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WallpaperSettingOnlineViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_setting_staggered_title, parent, false), adapter);
    }
}
