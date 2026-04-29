package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.IconGroupEmptyElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementIconGroupEmptyViewHolder extends BaseViewHolder<IconGroupEmptyElement> {
    public ElementIconGroupEmptyViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        x9kr();
    }

    public static ElementIconGroupEmptyViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementIconGroupEmptyViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_icon_group_empty, parent, false), adapter);
    }
}
