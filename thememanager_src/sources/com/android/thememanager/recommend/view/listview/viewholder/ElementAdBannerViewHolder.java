package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.recommend.model.entity.element.AdBannerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementAdBannerViewHolder extends DownloadAdViewHolder<AdBannerElement> {

    /* JADX INFO: renamed from: l */
    private ImageView f13852l;

    public ElementAdBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter, false);
        this.f13852l = (ImageView) itemView.findViewById(R.id.thumbnail);
        ((TextView) itemView.findViewById(R.id.download_tip)).setVisibility(8);
        C6077k.fn3e(itemView, this.f13852l);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n5r1() {
        /*
            r6 = this;
            androidx.fragment.app.q r0 = r6.ki()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            com.android.thememanager.basemodule.ad.model.AdInfo r2 = r6.f13786g
            if (r2 == 0) goto L23
            float r3 = r2.height
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L23
            float r2 = r2.width
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L23
            float r3 = r3 / r2
            float r3 = r3 * r1
            goto L2a
        L23:
            r2 = 2131166116(0x7f0703a4, float:1.7946468E38)
            float r3 = r0.getDimension(r2)
        L2a:
            android.widget.ImageView r0 = r6.f13852l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = (int) r3
            r0.height = r2
            android.widget.ImageView r0 = r6.f13852l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = (int) r1
            r0.width = r1
            android.view.View r0 = r6.f13787y
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.ElementAdBannerViewHolder.n5r1():void");
    }

    public static ElementAdBannerViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementAdBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_ad_banner, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(final AdBannerElement item, int position) {
        super.o1t(item, position);
        this.f13786g = item.getAdInfo();
        n5r1();
        C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f13852l, 0, null, null, null, new Map[0]);
    }
}
