package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.ClassListDividerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementClassListDividerItemViewHolder extends BaseViewHolder<ClassListDividerElement> {

    /* JADX INFO: renamed from: g */
    private TextView f13859g;

    /* JADX INFO: renamed from: y */
    private String f13860y;

    public ElementClassListDividerItemViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13859g = (TextView) itemView.findViewById(R.id.class_divider_title);
        this.f13860y = fn3e().getString(R.string.classification_more_understand_you);
    }

    public static ElementClassListDividerItemViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementClassListDividerItemViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_classification_list_divider, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(ClassListDividerElement item, int position) {
        super.o1t(item, position);
        if (TextUtils.isEmpty(item.getSubTitle())) {
            this.f13859g.setText(this.f13860y);
        } else {
            this.f13859g.setText(item.getSubTitle());
        }
    }
}
