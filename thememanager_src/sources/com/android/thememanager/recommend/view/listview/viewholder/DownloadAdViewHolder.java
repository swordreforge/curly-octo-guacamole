package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadAdViewHolder<T> extends BaseAdViewHolder<T> {

    /* JADX INFO: renamed from: h */
    protected TextView f13840h;

    /* JADX INFO: renamed from: i */
    protected AdSubTextView f13841i;

    /* JADX INFO: renamed from: p */
    protected TextView f13842p;

    /* JADX INFO: renamed from: r */
    private int f13843r;

    /* JADX INFO: renamed from: s */
    protected TextView f13844s;

    /* JADX INFO: renamed from: t */
    private boolean f13845t;

    /* JADX INFO: renamed from: z */
    private com.android.thememanager.ad.download.controller.toq f13846z;

    public DownloadAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter, boolean isDetail) {
        super(itemView, adapter);
        this.f13845t = isDetail;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        if (!C1653q.kja0(this.f13786g) && !this.f13845t) {
            TextView textView = this.f13844s;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f13844s;
        if (textView2 != null) {
            textView2.setVisibility(0);
            com.android.thememanager.ad.download.controller.toq toqVar = new com.android.thememanager.ad.download.controller.toq(this.f13844s, this.f13841i, this.f13786g, this.f13845t, this.f13843r != 0);
            this.f13846z = toqVar;
            C1653q.toq(toqVar);
            C1653q.m6526k(this.f13846z);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        super.onDestroy(owner);
        C1653q.cdj(this.f13846z);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        com.android.thememanager.ad.download.controller.toq toqVar = this.f13846z;
        if (toqVar != null) {
            C1653q.ki(toqVar);
            C1653q.cdj(this.f13846z);
        }
    }

    public DownloadAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter, boolean isDetail, int adEid) {
        super(itemView, adapter);
        this.f13845t = isDetail;
        this.f13843r = adEid;
    }
}
