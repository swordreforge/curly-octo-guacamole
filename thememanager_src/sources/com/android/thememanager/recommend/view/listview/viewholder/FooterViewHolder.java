package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.FooterElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FooterViewHolder extends BaseViewHolder<FooterElement> {
    public FooterViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        x9kr();
    }

    public static FooterViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new FooterViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_foot_tips, parent, false), adapter);
    }
}
