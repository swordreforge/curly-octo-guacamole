package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchIconViewHolder extends BaseViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: g */
    private List<C2398k> f14025g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSearchIconViewHolder$k */
    static class C2398k {

        /* JADX INFO: renamed from: g */
        private ElementSearchIconViewHolder f14026g;

        /* JADX INFO: renamed from: k */
        private View f14027k;

        /* JADX INFO: renamed from: n */
        private int f14028n;

        /* JADX INFO: renamed from: q */
        private TextView f14029q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ImageView f60705toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private TextView f60706zy;

        C2398k(View parent, ElementSearchIconViewHolder baseViewHolder) {
            this.f14027k = parent;
            this.f14026g = baseViewHolder;
            this.f60705toq = (ImageView) parent.findViewById(R.id.image);
            this.f60706zy = (TextView) this.f14027k.findViewById(android.R.id.title);
            this.f14029q = (TextView) this.f14027k.findViewById(R.id.price);
            int iX9kr = baseViewHolder.wvg().x9kr() > 0 ? baseViewHolder.wvg().x9kr() : this.f14027k.getContext().getResources().getDimensionPixelSize(R.dimen.icon_recommend_image_width);
            float fraction = this.f14027k.getContext().getResources().getFraction(R.fraction.icon_thumbnail_default_ratio, iX9kr, iX9kr);
            this.f60705toq.getLayoutParams().width = iX9kr;
            this.f60705toq.getLayoutParams().height = (int) fraction;
            this.f14028n = this.f14027k.getContext().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
            C6077k.o1t(this.f60705toq);
        }

        /* JADX INFO: renamed from: q */
        private void m8658q(TextView priceView, int currentPriceInCent) {
            priceView.setText(C1815m.toq(this.f14027k.getContext(), currentPriceInCent));
            priceView.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq(UIProduct uIProduct, View view) {
            Intent intentKi = com.android.thememanager.toq.ki(this.f14026g.ki(), this.f14026g.ni7(), uIProduct.uuid, null, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
            if (this.f14026g.ni7() != null) {
                this.f14026g.ni7().startActivityForResult(intentKi, 1);
            } else {
                this.f14026g.ki().startActivity(intentKi);
            }
            this.f14026g.m6706z().d8wk(uIProduct.trackId, null);
        }

        public void zy(final UIProduct product, int position) {
            if (product == null) {
                this.f14027k.setVisibility(8);
                return;
            }
            this.f14027k.setVisibility(0);
            this.f60706zy.setText(product.name);
            m8658q(this.f14029q, product.currentPriceInCent);
            com.android.thememanager.basemodule.imageloader.x2.m6778n(this.f14026g.ki(), product.imageUrl, this.f60705toq, com.android.thememanager.basemodule.imageloader.x2.kja0(position), this.f14028n);
            this.f60705toq.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.ld6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14384k.toq(product, view);
                }
            });
        }
    }

    public ElementSearchIconViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        ArrayList arrayList = new ArrayList();
        this.f14025g = arrayList;
        arrayList.add(0, new C2398k(itemView.findViewById(R.id.item_0), this));
        this.f14025g.add(1, new C2398k(itemView.findViewById(R.id.item_1), this));
    }

    /* JADX INFO: renamed from: l */
    public static ElementSearchIconViewHolder m8656l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchIconViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_icon_two_items, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        for (int i2 = 0; i2 < this.f14025g.size(); i2++) {
            C2398k c2398k = this.f14025g.get(i2);
            if (i2 < item.getProductList().size()) {
                c2398k.zy(item.getProductList().get(i2), i2);
            } else {
                c2398k.zy(null, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        T t2 = this.f9849q;
        if (t2 != 0 && ((ThemeSearchElement) t2).getProductList() != null) {
            Iterator<UIProduct> it = ((ThemeSearchElement) this.f9849q).getProductList().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().trackId);
            }
        }
        return arrayList;
    }
}
