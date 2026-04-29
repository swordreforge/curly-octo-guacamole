package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.IconRecommendElement;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IconRecommendViewHolder extends BaseViewHolder<IconRecommendElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f14159g;

    /* JADX INFO: renamed from: h */
    private final int f14160h;

    /* JADX INFO: renamed from: i */
    private final int f14161i;

    /* JADX INFO: renamed from: p */
    private TextView f14162p;

    /* JADX INFO: renamed from: s */
    private TextView f14163s;

    /* JADX INFO: renamed from: y */
    private SmoothFrameLayout2 f14164y;

    public IconRecommendViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14164y = (SmoothFrameLayout2) itemView.findViewById(R.id.image_container);
        this.f14159g = (ImageView) itemView.findViewById(R.id.image);
        this.f14163s = (TextView) itemView.findViewById(android.R.id.title);
        this.f14162p = (TextView) itemView.findViewById(R.id.price);
        Resources resources = ki().getResources();
        if (wvg().x9kr() > 0) {
            int iX9kr = wvg().x9kr();
            this.f14160h = iX9kr;
            this.f14159g.getLayoutParams().width = iX9kr;
        } else {
            this.f14160h = resources.getDimensionPixelSize(R.dimen.icon_recommend_image_width);
        }
        this.f14161i = resources.getDimensionPixelSize(R.dimen.icon_recommend_image_height);
        if (com.android.thememanager.basemodule.utils.o1t.m7169g(fn3e())) {
            return;
        }
        C6077k.o1t(this.f14164y);
    }

    /* JADX INFO: renamed from: c */
    private void m8713c(UIImageBannerElement item) {
        UIImageWithLink imageBanner = item.getImageBanner();
        if (imageBanner == null) {
            return;
        }
        this.f14162p.setText(C1815m.toq(fn3e(), imageBanner.currentPriceInCent));
        this.f14162p.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8714l(UIImageWithLink uIImageWithLink, View view) {
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

    public static IconRecommendViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new IconRecommendViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_icon_big_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(IconRecommendElement item, int position) {
        super.o1t(item, position);
        final UIImageWithLink imageBanner = item.getImageBanner();
        this.f14163s.setVisibility(0);
        UILink uILink = imageBanner.link;
        if (uILink != null) {
            this.f14163s.setText(uILink.title);
        }
        m8713c(item);
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), imageBanner.imageUrl, this.f14159g, com.android.thememanager.basemodule.imageloader.x2.fn3e().x9kr(this.f14160h, this.f14161i).m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb())));
        (com.android.thememanager.basemodule.utils.o1t.m7169g(fn3e()) ? this.itemView : this.f14164y).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14372k.m8714l(imageBanner, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        UILink uILink = ((IconRecommendElement) this.f9849q).getImageBanner().link;
        if (uILink != null) {
            arrayList.add(uILink.trackId);
        }
        return arrayList;
    }
}
