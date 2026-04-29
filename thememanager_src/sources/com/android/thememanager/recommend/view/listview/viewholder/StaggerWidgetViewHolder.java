package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.recommend.model.entity.element.WidgetSuitElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class StaggerWidgetViewHolder extends BaseViewHolder<WidgetSuitElement> {

    /* JADX INFO: renamed from: g */
    private gc3c.toq f14272g;

    public StaggerWidgetViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14272g = new gc3c.toq(itemView, adapter);
    }

    public static StaggerWidgetViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new StaggerWidgetViewHolder(gc3c.toq.m22285q(parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(WidgetSuitElement item, int position) {
        super.o1t(item, position);
        this.f14272g.m22287n(item, position);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        return this.f14272g.m22286k();
    }
}
