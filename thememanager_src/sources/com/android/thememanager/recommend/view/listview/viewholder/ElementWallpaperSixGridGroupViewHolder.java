package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementWallpaperSixGridGroupViewHolder extends ElementGridGroupViewHolder {
    public ElementWallpaperSixGridGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter, 6);
    }

    public static ElementWallpaperSixGridGroupViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementWallpaperSixGridGroupViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_wallpaper_six_grid, parent, false), adapter);
    }
}
