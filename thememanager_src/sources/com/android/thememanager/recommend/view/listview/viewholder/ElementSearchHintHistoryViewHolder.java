package com.android.thememanager.recommend.view.listview.viewholder;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.android.thememanager.C2320q;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchHintHistoryViewHolder extends BaseViewHolder<ElementSearchHintHistoryViewHolder> {
    public ElementSearchHintHistoryViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        C2320q.d2ok(ki(), (ListView) itemView.findViewById(R.id.list), itemView.findViewById(com.android.thememanager.R.id.clear_history));
    }

    public static ElementSearchHintHistoryViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchHintHistoryViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(com.android.thememanager.R.layout.rc_element_search_history, parent, false), adapter);
    }
}
