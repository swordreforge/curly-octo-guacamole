package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseAdViewHolder<T> extends BaseViewHolder<T> {

    /* JADX INFO: renamed from: g */
    protected AdInfo f13786g;

    /* JADX INFO: renamed from: y */
    protected View f13787y;

    public BaseAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13787y = itemView.findViewById(R.id.ad_info_view);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        if (this.f13786g != null) {
            C1708s.f7l8().ld6().fti(this.f13786g);
        }
    }
}
