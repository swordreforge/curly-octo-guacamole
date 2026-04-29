package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
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
public class ElementSearchThemeViewHolder extends BaseViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: g */
    private List<BaseViewHolder> f14037g;

    static class ElementSubThemeResourceViewHolder extends BaseAdViewHolder<UIProduct> {

        /* JADX INFO: renamed from: h */
        protected ImageView f14038h;

        /* JADX INFO: renamed from: i */
        protected boolean f14039i;

        /* JADX INFO: renamed from: p */
        private DiscountPriceView f14040p;

        /* JADX INFO: renamed from: s */
        private TextView f14041s;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSearchThemeViewHolder$ElementSubThemeResourceViewHolder$k */
        class ViewOnClickListenerC2399k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIProduct f14042k;

            ViewOnClickListenerC2399k(final UIProduct val$resource) {
                this.f14042k = val$resource;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                C2451n.ld6(ElementSubThemeResourceViewHolder.this.ki(), ElementSubThemeResourceViewHolder.this.ni7(), this.f14042k);
                ElementSubThemeResourceViewHolder.this.m6706z().d8wk(this.f14042k.trackId, null);
            }
        }

        public ElementSubThemeResourceViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f14040p = (DiscountPriceView) itemView.findViewById(R.id.price);
            this.f14041s = (TextView) itemView.findViewById(android.R.id.title);
            this.f14038h = (ImageView) itemView.findViewById(R.id.thumbnail);
            C6077k.wvg((FrameLayout) itemView.findViewById(R.id.thumbnail_fl), this.f14038h);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct resource, int position) {
            this.f13786g = resource.getAdInfo();
            if (!C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f14038h, 0, this.f14041s, this.f14040p.getCurrentPriceView(), this.f14040p.getOriginPriceView(), new Map[0]) && ("THEME".equals(resource.productType) || "LIVE_WALLPAPER".equals(resource.productType))) {
                TextView textView = this.f14041s;
                if (textView != null) {
                    textView.setVisibility(0);
                    this.f14041s.setText(resource.name);
                }
                DiscountPriceView discountPriceView = this.f14040p;
                if (discountPriceView == null) {
                    return;
                }
                if (this.f14039i) {
                    discountPriceView.setVisibility(8);
                } else {
                    discountPriceView.setVisibility(0);
                    this.f14040p.setPrice(resource.originPriceInCent, resource.currentPriceInCent);
                }
                com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), resource.imageUrl, this.f14038h, com.android.thememanager.basemodule.imageloader.x2.fn3e().jk(1).m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)));
            }
            String str = resource.name;
            if (str != null) {
                C1812k.toq(this.f14038h, str.replaceAll(" ", ""));
            }
            this.f14038h.setOnClickListener(new ViewOnClickListenerC2399k(resource));
        }
    }

    public ElementSearchThemeViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14037g = new ArrayList();
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(itemView.findViewById(R.id.item_0));
        arrayList.add(itemView.findViewById(R.id.item_1));
        arrayList.add(itemView.findViewById(R.id.item_2));
        for (View view : arrayList) {
            view.setVisibility(4);
            this.f14037g.add(ncyb(view));
        }
    }

    /* JADX INFO: renamed from: l */
    public static ElementSearchThemeViewHolder m8661l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchThemeViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_three_theme_group, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubThemeResourceViewHolder(view, wvg());
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        if (item.getProductList() == null) {
            return;
        }
        int size = item.getProductList().size();
        for (int i2 = 0; i2 < size; i2++) {
            BaseViewHolder baseViewHolder = this.f14037g.get(i2);
            baseViewHolder.itemView.setVisibility(0);
            UIProduct uIProduct = item.getProductList().get(i2);
            baseViewHolder.o1t(uIProduct, item.getProductList().indexOf(uIProduct));
        }
        if (size < this.f14037g.size()) {
            for (int i3 = 0; i3 < this.f14037g.size() - size; i3++) {
                this.f14037g.get((r6.size() - 1) - i3).itemView.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        T t2 = this.f9849q;
        if (t2 == 0 || com.android.thememanager.basemodule.utils.kja0.qrj(((ThemeSearchElement) t2).getProductList())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((ThemeSearchElement) this.f9849q).getProductList().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }
}
