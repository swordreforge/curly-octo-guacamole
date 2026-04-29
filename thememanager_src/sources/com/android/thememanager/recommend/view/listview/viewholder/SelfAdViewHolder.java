package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.StaggeredAdElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class SelfAdViewHolder extends DownloadAdViewHolder<StaggeredAdElement> {

    /* JADX INFO: renamed from: l */
    private ImageView f14244l;

    public SelfAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter, false);
        this.f14244l = (ImageView) itemView.findViewById(R.id.image);
        this.f13842p = (TextView) itemView.findViewById(R.id.ad_title);
        TextView textView = (TextView) itemView.findViewById(R.id.download_button);
        this.f13844s = textView;
        textView.setTag(new Object());
        C6077k.wvg(itemView, this.f14244l);
    }

    public static SelfAdViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new SelfAdViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_self_ad_view, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(StaggeredAdElement item, final int position) {
        this.f13786g = item.getImageBanner().getAdInfo();
        super.o1t(item, position);
        AdInfo adInfo = this.f13786g;
        if (adInfo != null && adInfo.width > 0.0f && adInfo.height > 0.0f) {
            int iX9kr = wvg().x9kr();
            AdInfo adInfo2 = this.f13786g;
            float f2 = iX9kr;
            adInfo2.height = (adInfo2.height / adInfo2.width) * f2;
            adInfo2.width = f2;
            ViewGroup.LayoutParams layoutParams = this.f14244l.getLayoutParams();
            AdInfo adInfo3 = this.f13786g;
            layoutParams.height = (int) adInfo3.height;
            C1812k.toq(this.f14244l, C1653q.x2(adInfo3));
        }
        C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f14244l, 0, this.f13842p, null, null, new Map[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((StaggeredAdElement) this.f9849q).getImageBanner().link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((StaggeredAdElement) this.f9849q).getImageBanner().link.trackId);
        return arrayList;
    }
}
