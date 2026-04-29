package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.StaggeredFontSubjectElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRecommendationFontViewHolder extends BaseViewHolder<StaggeredFontSubjectElement> {

    /* JADX INFO: renamed from: g */
    private final TextView f13974g;

    /* JADX INFO: renamed from: p */
    private ArrayList<BaseViewHolder> f13975p;

    /* JADX INFO: renamed from: s */
    private final LinearLayout f13976s;

    /* JADX INFO: renamed from: y */
    private final TextView f13977y;

    public static class SubViewHolder extends BaseViewHolder<UIProduct> {

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRecommendationFontViewHolder$SubViewHolder$k */
        class ViewOnClickListenerC2393k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIProduct f13978k;

            ViewOnClickListenerC2393k(final UIProduct val$product) {
                this.f13978k = val$product;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                C2451n.ld6(SubViewHolder.this.ki(), SubViewHolder.this.ni7(), this.f13978k);
                SubViewHolder.this.m6706z().d8wk(this.f13978k.trackId, null);
            }
        }

        public SubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            C6077k.m22369i(itemView);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct product, int position) {
            super.o1t(product, position);
            TextView textView = (TextView) this.itemView.findViewById(R.id.price);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), product.imageUrl, (ImageView) this.itemView.findViewById(R.id.thumbnail), com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(com.android.thememanager.basemodule.imageloader.x2.n7h(position)).a9(false));
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(C1815m.toq(ki(), product.originPriceInCent));
                if (product.originPriceInCent == 0) {
                    textView.setTextColor(ki().getResources().getColor(R.color.resource_price_free_text_color));
                } else {
                    TypedValue typedValue = new TypedValue();
                    if (ki().getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true)) {
                        textView.setTextColor(ki().getResources().getColorStateList(typedValue.resourceId));
                    }
                }
            }
            this.itemView.setOnClickListener(new ViewOnClickListenerC2393k(product));
        }
    }

    public ElementRecommendationFontViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13975p = new ArrayList<>();
        this.f13974g = (TextView) itemView.findViewById(R.id.top_title);
        TextView textView = (TextView) itemView.findViewById(R.id.category);
        this.f13977y = textView;
        this.f13976s = (LinearLayout) itemView.findViewById(R.id.container);
        textView.setText(R.string.theme_component_title_font);
    }

    public static ElementRecommendationFontViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRecommendationFontViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_home_recommendation_font_list, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(StaggeredFontSubjectElement uiElement, int position) {
        UIImageWithLink imageBanner;
        super.o1t(uiElement, position);
        if (uiElement.getProducts() == null || uiElement.getProducts().size() == 0 || (imageBanner = uiElement.getImageBanner()) == null || TextUtils.isEmpty(imageBanner.title)) {
            return;
        }
        this.f13975p.clear();
        this.f13974g.setText(imageBanner.title);
        this.f13976s.removeAllViews();
        for (int i2 = 0; i2 < uiElement.getProducts().size(); i2++) {
            UIProduct uIProduct = uiElement.getProducts().get(i2);
            View viewInflate = LayoutInflater.from(ki()).inflate(R.layout.rc_home_recommendation_font_item, (ViewGroup) null);
            SubViewHolder subViewHolder = new SubViewHolder(viewInflate, wvg());
            this.f13975p.add(subViewHolder);
            subViewHolder.o1t(uIProduct, i2);
            this.f13976s.addView(viewInflate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        for (int i2 = 0; i2 < ((StaggeredFontSubjectElement) this.f9849q).getProducts().size(); i2++) {
            this.f13975p.get(i2).mo8580n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((StaggeredFontSubjectElement) this.f9849q).getProducts() == null || ((StaggeredFontSubjectElement) this.f9849q).getProducts().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((StaggeredFontSubjectElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        for (int i2 = 0; i2 < ((StaggeredFontSubjectElement) this.f9849q).getProducts().size(); i2++) {
            this.f13975p.get(i2).zy();
        }
    }
}
