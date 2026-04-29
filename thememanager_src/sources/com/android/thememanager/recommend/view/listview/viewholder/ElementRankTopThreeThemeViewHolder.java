package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.recommend.model.entity.element.RankDetailTopThreeThemeElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRankTopThreeThemeViewHolder extends BaseViewHolder<RankDetailTopThreeThemeElement> {

    /* JADX INFO: renamed from: y */
    private static final Integer[] f13961y = {Integer.valueOf(R.drawable.rank_0), Integer.valueOf(R.drawable.rank_1), Integer.valueOf(R.drawable.rank_2)};

    /* JADX INFO: renamed from: g */
    private List<BaseViewHolder> f13962g;

    static class ElementSubThemeResourceViewHolder extends BaseAdViewHolder<UIProduct> {

        /* JADX INFO: renamed from: h */
        protected ImageView f13963h;

        /* JADX INFO: renamed from: i */
        protected int f13964i;

        /* JADX INFO: renamed from: p */
        private DiscountPriceView f13965p;

        /* JADX INFO: renamed from: s */
        private TextView f13966s;

        /* JADX INFO: renamed from: z */
        protected boolean f13967z;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRankTopThreeThemeViewHolder$ElementSubThemeResourceViewHolder$k */
        class ViewOnClickListenerC2391k implements View.OnClickListener {
            ViewOnClickListenerC2391k() {
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
            this.f13965p = (DiscountPriceView) itemView.findViewById(R.id.price);
            this.f13966s = (TextView) itemView.findViewById(android.R.id.title);
            this.f13963h = (ImageView) itemView.findViewById(R.id.thumbnail);
            this.f13964i = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
            C6077k.wvg((FrameLayout) itemView.findViewById(R.id.thumbnail_fl), this.f13963h);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct resource, int position) {
            super.o1t(resource, position);
            this.f13786g = resource.getAdInfo();
            if (!C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f13963h, this.f13964i, this.f13966s, this.f13965p.getCurrentPriceView(), this.f13965p.getOriginPriceView(), new Map[0]) && ("THEME".equals(resource.productType) || "LIVE_WALLPAPER".equals(resource.productType))) {
                TextView textView = this.f13966s;
                if (textView != null) {
                    textView.setVisibility(0);
                    this.f13966s.setText(resource.name);
                }
                DiscountPriceView discountPriceView = this.f13965p;
                if (discountPriceView == null) {
                    return;
                }
                if (this.f13967z) {
                    discountPriceView.setVisibility(8);
                } else {
                    discountPriceView.setVisibility(0);
                    this.f13965p.setPrice(resource.originPriceInCent, resource.currentPriceInCent);
                }
                com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), resource.imageUrl, this.f13963h, com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13964i, wvg().ncyb()), this.f13964i);
                C1812k.toq(this.f13963h, resource.name);
            }
            this.f13963h.setOnClickListener(new ViewOnClickListenerC2391k());
        }
    }

    public ElementRankTopThreeThemeViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13962g = new ArrayList();
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(itemView.findViewById(R.id.item_0));
        arrayList.add(itemView.findViewById(R.id.item_1));
        arrayList.add(itemView.findViewById(R.id.item_2));
        int i2 = 0;
        for (View view : arrayList) {
            this.f13962g.add(ncyb(view));
            ((ImageView) view.findViewById(R.id.rank_icon)).setImageResource(f13961y[i2].intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static ElementRankTopThreeThemeViewHolder m8629l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRankTopThreeThemeViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_rank_details_top_three_wallpaper, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubThemeResourceViewHolder(view, wvg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        for (int i2 = 0; i2 < ((RankDetailTopThreeThemeElement) this.f9849q).getProducts().size(); i2++) {
            this.f13962g.get(i2).mo8580n();
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(RankDetailTopThreeThemeElement item, int position) {
        super.o1t(item, position);
        int size = item.getProducts().size();
        for (int i2 = 0; i2 < size; i2++) {
            BaseViewHolder baseViewHolder = this.f13962g.get(i2);
            baseViewHolder.itemView.setVisibility(0);
            baseViewHolder.o1t(item.getProducts().get(i2), i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((RankDetailTopThreeThemeElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        for (int i2 = 0; i2 < ((RankDetailTopThreeThemeElement) this.f9849q).getProducts().size(); i2++) {
            this.f13962g.get(i2).zy();
        }
    }
}
