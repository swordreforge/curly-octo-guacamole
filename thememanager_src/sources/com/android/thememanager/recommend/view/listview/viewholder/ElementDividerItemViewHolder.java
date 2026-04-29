package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.DividerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementDividerItemViewHolder extends BaseViewHolder<DividerElement> {
    public ElementDividerItemViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
    }

    public static ElementDividerItemViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementDividerItemViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_divider_item, parent, false), adapter);
    }
}
