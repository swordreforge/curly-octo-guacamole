package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementFourGridGroupViewHolder extends ElementGridGroupViewHolder {
    public ElementFourGridGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter, 4);
    }

    public static ElementFourGridGroupViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementFourGridGroupViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_four_grid_banner, parent, false), adapter);
    }
}
