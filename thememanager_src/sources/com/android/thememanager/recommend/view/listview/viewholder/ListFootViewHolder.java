package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.EndItemListElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ListFootViewHolder extends BaseViewHolder<EndItemListElement> {
    public ListFootViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
    }

    public static ListFootViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ListFootViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_list_foot, parent, false), adapter);
    }
}
