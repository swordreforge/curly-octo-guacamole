package com.android.thememanager.recommend.view.listview.viewholder;

import a98o.C0005q;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.recommend.model.entity.element.NormalFontElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementFontViewHolder extends BaseViewHolder<NormalFontElement> {

    /* JADX INFO: renamed from: g */
    private View f13885g;

    /* JADX INFO: renamed from: h */
    private float f13886h;

    /* JADX INFO: renamed from: i */
    private float f13887i;

    /* JADX INFO: renamed from: p */
    private ImageView f13888p;

    /* JADX INFO: renamed from: s */
    private TextView f13889s;

    /* JADX INFO: renamed from: y */
    private DiscountPriceView f13890y;

    /* JADX INFO: renamed from: z */
    private int f13891z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementFontViewHolder$k */
    class ViewOnClickListenerC2384k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f13892k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ UIProduct f13894q;

        ViewOnClickListenerC2384k(final int val$position, final UIProduct val$product) {
            this.f13892k = val$position;
            this.f13894q = val$product;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = this.f13892k; i2 >= 0; i2--) {
                UIElement uIElement = ElementFontViewHolder.this.wvg().ni7().get(i2);
                if (!(uIElement instanceof NormalFontElement)) {
                    break;
                }
                UIProduct product = ((NormalFontElement) uIElement).getProduct();
                if (product != null) {
                    arrayList.add(0, new C0005q(product.uuid, product.trackId));
                }
            }
            int size = arrayList.size() - 1;
            for (int i3 = this.f13892k + 1; i3 < ElementFontViewHolder.this.wvg().ni7().size(); i3++) {
                UIElement uIElement2 = ElementFontViewHolder.this.wvg().ni7().get(i3);
                if (!(uIElement2 instanceof NormalFontElement)) {
                    break;
                }
                UIProduct product2 = ((NormalFontElement) uIElement2).getProduct();
                if (product2 != null) {
                    arrayList.add(new C0005q(product2.uuid, product2.trackId));
                }
            }
            if (!ElementFontViewHolder.this.wvg().n5r1() || C1807g.zurt()) {
                ActivityC0891q activityC0891qKi = ElementFontViewHolder.this.ki();
                Fragment fragmentNi7 = ElementFontViewHolder.this.ni7();
                UIProduct uIProduct = this.f13894q;
                C2451n.x2(activityC0891qKi, fragmentNi7, arrayList, size, uIProduct.imageUrl, uIProduct.productType);
            } else {
                ActivityC0891q activityC0891qKi2 = ElementFontViewHolder.this.ki();
                Fragment fragmentNi72 = ElementFontViewHolder.this.ni7();
                UIProduct uIProduct2 = this.f13894q;
                Intent[] intentArr = {com.android.thememanager.toq.toq(ElementFontViewHolder.this.ki(), "fonts"), com.android.thememanager.toq.t8r(activityC0891qKi2, fragmentNi72, arrayList, size, uIProduct2.imageUrl, Boolean.FALSE, uIProduct2.productType)};
                if (ElementFontViewHolder.this.ni7() == null || !(ElementFontViewHolder.this.ki() instanceof AbstractActivityC1717k)) {
                    ElementFontViewHolder.this.ki().startActivities(intentArr);
                } else {
                    ((AbstractActivityC1717k) ElementFontViewHolder.this.ki()).qkj8(ElementFontViewHolder.this.ni7(), intentArr);
                }
            }
            ElementFontViewHolder.this.m6706z().d8wk(this.f13894q.trackId, null);
        }
    }

    public ElementFontViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13885g = itemView;
        this.f13890y = (DiscountPriceView) itemView.findViewById(R.id.price);
        this.f13888p = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f13886h = ki().getResources().getDimensionPixelOffset(R.dimen.recommend_font_card_list_current_price_text_size_element_font);
        this.f13887i = ki().getResources().getDimensionPixelOffset(R.dimen.recommend_font_card_list_origin_price_text_size_element_font);
        this.f13891z = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        C6077k.ld6(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementFontViewHolder m8612l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementFontViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_font_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(NormalFontElement uiElement, int position) {
        super.o1t(uiElement, position);
        if (this.f13889s == null) {
            ViewStub viewStub = (ViewStub) this.f13885g.findViewById(R.id.rank_count);
            if (viewStub.getParent() != null) {
                viewStub.inflate();
            }
            this.f13889s = (TextView) this.f13885g.findViewById(R.id.count);
        }
        if (wvg().n5r1()) {
            this.f13889s.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13888p.getLayoutParams();
            layoutParams.setMarginStart(0);
            this.f13888p.setLayoutParams(layoutParams);
            this.f13888p.setPadding(0, 0, 0, 0);
        } else if (uiElement.isEndlessList() || 40 == uiElement.getCardTypeOrdinal()) {
            this.f13889s.setText(String.valueOf(uiElement.isEndlessList() ? position + 1 : position));
        } else {
            this.f13889s.setText(uiElement.getPosition() + "");
        }
        UIProduct product = uiElement.getProduct();
        if (product == null) {
            return;
        }
        if (C1819o.x9kr()) {
            this.f13888p.setScaleType(ImageView.ScaleType.FIT_END);
        } else {
            this.f13888p.setScaleType(ImageView.ScaleType.FIT_START);
        }
        boolean zNcyb = wvg().ncyb();
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), product.getImageUrl(fn3e(), zNcyb), this.f13888p, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13891z, zNcyb)).a9(false));
        C1812k.toq(this.f13888p, product.name);
        DiscountPriceView discountPriceView = this.f13890y;
        if (discountPriceView != null) {
            discountPriceView.setVisibility(0);
            this.f13890y.setPrice(product.originPriceInCent, product.currentPriceInCent);
            this.f13890y.setTextStyle(this.f13887i, this.f13886h, R.color.font_origin_price, R.color.font_current_price);
        }
        if (com.android.thememanager.basemodule.utils.o1t.fn3e()) {
            this.f13890y.setVisibility(8);
        }
        this.itemView.setOnClickListener(new ViewOnClickListenerC2384k(position, product));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((NormalFontElement) this.f9849q).getProduct().trackId);
        return arrayList;
    }
}
