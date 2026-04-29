package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.recommend.model.entity.element.ThreeThemeGroupElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miuix.smooth.SmoothFrameLayout2;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementThreeThemeGroupViewHolder extends BaseViewHolder<ThreeThemeGroupElement> {

    /* JADX INFO: renamed from: g */
    private List<BaseViewHolder> f14069g;

    static class ElementSubThemeResourceViewHolder extends BaseAdViewHolder<UIProduct> {

        /* JADX INFO: renamed from: h */
        private SmoothFrameLayout2 f14070h;

        /* JADX INFO: renamed from: i */
        protected ImageView f14071i;

        /* JADX INFO: renamed from: p */
        private DiscountPriceView f14072p;

        /* JADX INFO: renamed from: s */
        private TextView f14073s;

        /* JADX INFO: renamed from: z */
        protected boolean f14074z;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementThreeThemeGroupViewHolder$ElementSubThemeResourceViewHolder$k */
        class ViewOnClickListenerC2405k implements View.OnClickListener {
            ViewOnClickListenerC2405k() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                AdInfo adInfo = ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubThemeResourceViewHolder.this).f9849q).getAdInfo();
                if (adInfo != null) {
                    C1653q.m6529q(ElementSubThemeResourceViewHolder.this.ki(), adInfo, new Map[0]);
                } else {
                    C2451n.ld6(ElementSubThemeResourceViewHolder.this.ki(), ElementSubThemeResourceViewHolder.this.ni7(), (UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubThemeResourceViewHolder.this).f9849q);
                    ElementSubThemeResourceViewHolder.this.m6706z().d8wk(((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubThemeResourceViewHolder.this).f9849q).trackId, null);
                }
            }
        }

        public ElementSubThemeResourceViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f14072p = (DiscountPriceView) itemView.findViewById(R.id.price);
            this.f14073s = (TextView) itemView.findViewById(android.R.id.title);
            this.f14071i = (ImageView) itemView.findViewById(R.id.thumbnail);
            SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) itemView.findViewById(R.id.thumbnail_fl);
            this.f14070h = smoothFrameLayout2;
            C6077k.o1t(smoothFrameLayout2);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct resource, int position) {
            super.o1t(resource, position);
            this.f13786g = resource.getAdInfo();
            if (!C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f14071i, 0, this.f14073s, this.f14072p.getCurrentPriceView(), this.f14072p.getOriginPriceView(), new Map[0]) && ("THEME".equals(resource.productType) || "LIVE_WALLPAPER".equals(resource.productType))) {
                TextView textView = this.f14073s;
                if (textView != null) {
                    textView.setVisibility(0);
                    this.f14073s.setText(resource.name);
                }
                DiscountPriceView discountPriceView = this.f14072p;
                if (discountPriceView == null) {
                    return;
                }
                if (this.f14074z) {
                    discountPriceView.setVisibility(8);
                } else {
                    discountPriceView.setVisibility(0);
                    this.f14072p.setPrice(resource.originPriceInCent, resource.currentPriceInCent);
                }
                com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), resource.imageUrl, this.f14071i, com.android.thememanager.basemodule.imageloader.x2.fn3e().jk(1).m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb())));
                C1812k.toq(this.f14071i, resource.name);
            }
            this.f14070h.setOnClickListener(new ViewOnClickListenerC2405k());
        }
    }

    public ElementThreeThemeGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14069g = new ArrayList();
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(itemView.findViewById(R.id.item_0));
        arrayList.add(itemView.findViewById(R.id.item_1));
        arrayList.add(itemView.findViewById(R.id.item_2));
        for (View view : arrayList) {
            view.setVisibility(4);
            this.f14069g.add(ncyb(view));
        }
    }

    /* JADX INFO: renamed from: l */
    public static ElementThreeThemeGroupViewHolder m8676l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementThreeThemeGroupViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_three_theme_group, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubThemeResourceViewHolder(view, wvg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        for (int i2 = 0; i2 < ((ThreeThemeGroupElement) this.f9849q).getProducts().size(); i2++) {
            this.f14069g.get(i2).mo8580n();
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThreeThemeGroupElement item, int position) {
        super.o1t(item, position);
        if (item.getOriginProducts() == null) {
            return;
        }
        int size = item.getProducts().size();
        for (int i2 = 0; i2 < size; i2++) {
            BaseViewHolder baseViewHolder = this.f14069g.get(i2);
            baseViewHolder.itemView.setVisibility(0);
            UIProduct uIProduct = item.getProducts().get(i2);
            baseViewHolder.o1t(uIProduct, item.getOriginProducts().indexOf(uIProduct));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((ThreeThemeGroupElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        for (int i2 = 0; i2 < ((ThreeThemeGroupElement) this.f9849q).getProducts().size(); i2++) {
            this.f14069g.get(i2).zy();
        }
    }
}
