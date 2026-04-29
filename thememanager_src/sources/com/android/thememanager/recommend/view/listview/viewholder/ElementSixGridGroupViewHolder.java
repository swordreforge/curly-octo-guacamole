package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSixGridGroupViewHolder extends ElementGridGroupViewHolder {
    public ElementSixGridGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter, 6);
        if (ncyb()) {
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
                itemView.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static ElementSixGridGroupViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSixGridGroupViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_font_six_grid_group, parent, false), adapter);
    }
}
