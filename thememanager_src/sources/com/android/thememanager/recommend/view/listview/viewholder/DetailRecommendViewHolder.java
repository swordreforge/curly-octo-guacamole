package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.DetailRecommendElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DetailRecommendViewHolder extends DownloadAdViewHolder<DetailRecommendElement> {

    /* JADX INFO: renamed from: c */
    private TextView f13834c;

    /* JADX INFO: renamed from: e */
    private TextView f13835e;

    /* JADX INFO: renamed from: f */
    private ImageView f13836f;

    /* JADX INFO: renamed from: j */
    private View f13837j;

    /* JADX INFO: renamed from: l */
    private View f13838l;

    /* JADX INFO: renamed from: o */
    private float f13839o;

    public DetailRecommendViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter, false);
        this.f13838l = itemView;
        this.f13836f = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f13834c = (TextView) itemView.findViewById(android.R.id.title);
        this.f13835e = (TextView) itemView.findViewById(R.id.price);
        this.f13837j = itemView.findViewById(R.id.ad_info_view);
        Resources resources = ki().getResources();
        if (wvg().x9kr() > 0) {
            this.f13839o = wvg().x9kr();
        } else {
            this.f13839o = resources.getDimension(R.dimen.detail_recommend_item_width);
        }
        TextView textView = (TextView) itemView.findViewById(R.id.download_button);
        this.f13844s = textView;
        textView.setTag(new Object());
        C6077k.wvg((FrameLayout) itemView.findViewById(R.id.image_fl), this.f13836f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8598f(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 16
            float r0 = (float) r0
            r1 = 9
            float r1 = (float) r1
            float r0 = r0 / r1
            com.android.thememanager.basemodule.ad.model.AdInfo r1 = r5.f13786g
            if (r1 == 0) goto L23
            float r2 = r1.height
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L23
            float r4 = r1.width
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L23
            float r0 = r2 / r4
            float r6 = r5.f13839o
            float r2 = r6 * r0
            r1.height = r2
            r1.width = r6
            goto L45
        L23:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L45
            java.lang.String r1 = ":"
            java.lang.String[] r6 = r6.split(r1)
            int r1 = r6.length
            r2 = 2
            if (r1 != r2) goto L45
            r0 = 0
            r0 = r6[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 1
            r6 = r6[r1]
            int r6 = java.lang.Integer.parseInt(r6)
            float r6 = (float) r6
            float r0 = (float) r0
            float r0 = r6 / r0
        L45:
            android.widget.ImageView r6 = r5.f13836f
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            float r1 = r5.f13839o
            int r1 = (int) r1
            r6.width = r1
            android.widget.ImageView r6 = r5.f13836f
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            float r1 = r5.f13839o
            float r1 = r1 * r0
            int r0 = (int) r1
            r6.height = r0
            android.view.View r6 = r5.f13837j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.ImageView r0 = r5.f13836f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.width
            r6.width = r0
            android.view.View r6 = r5.f13837j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.ImageView r0 = r5.f13836f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            r6.height = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.DetailRecommendViewHolder.m8598f(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8599l(UIImageWithLink uIImageWithLink, View view) {
        C2451n.toq toqVarM8810y = C2451n.m8797g().m8810y(uIImageWithLink.imageUrl);
        if (uIImageWithLink.link != null) {
            m6706z().d8wk(uIImageWithLink.link.trackId, null);
            toqVarM8810y.toq(uIImageWithLink.link.productType);
        }
        toqVarM8810y.x2(wvg().lvui());
        toqVarM8810y.m8804g(wvg().m8549l());
        toqVarM8810y.f7l8(wvg().n5r1());
        C2451n.m8803y(ki(), ni7(), uIImageWithLink.link, toqVarM8810y);
    }

    public static DetailRecommendViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new DetailRecommendViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_theme_detail_recommend, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void o1t(DetailRecommendElement item, int position) {
        final UIImageWithLink imageBanner = item.getImageBanner();
        this.f13786g = imageBanner.getAdInfo();
        super.o1t(item, position);
        this.f13834c.setVisibility(0);
        m8598f(imageBanner.snapshotAspectRatio);
        if (C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f13836f, 0, this.f13834c, null, null, new Map[0])) {
            C1812k.toq(this.f13836f, C1653q.x2(this.f13786g));
            this.f13835e.setVisibility(8);
            return;
        }
        UILink uILink = imageBanner.link;
        if (uILink != null) {
            this.f13834c.setText(uILink.title);
        }
        ViewGroup.LayoutParams layoutParams = this.f13836f.getLayoutParams();
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), imageBanner.imageUrl, this.f13836f, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb())).x9kr(layoutParams.width, layoutParams.height));
        if (imageBanner.originPriceInCent == -1) {
            this.f13835e.setVisibility(4);
        } else {
            this.f13835e.setVisibility(0);
            this.f13835e.setText(C1815m.toq(ki(), imageBanner.originPriceInCent));
        }
        this.f13836f.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.f7l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14361k.m8599l(imageBanner, view);
            }
        });
        UILink uILink2 = imageBanner.link;
        if (uILink2 != null) {
            C1812k.toq(this.f13836f, uILink2.title);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        UILink uILink = ((DetailRecommendElement) this.f9849q).getImageBanner().link;
        if (uILink != null) {
            arrayList.add(uILink.trackId);
        }
        return arrayList;
    }
}
