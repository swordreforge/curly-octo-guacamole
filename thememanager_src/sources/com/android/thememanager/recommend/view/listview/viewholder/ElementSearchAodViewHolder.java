package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchAodViewHolder extends BaseViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: g */
    private x2.C1735g f14009g;

    /* JADX INFO: renamed from: y */
    private List<C2396k> f14010y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSearchAodViewHolder$k */
    private static class C2396k {

        /* JADX INFO: renamed from: k */
        private View f14011k;

        /* JADX INFO: renamed from: n */
        private View f14012n;

        /* JADX INFO: renamed from: q */
        private TextView f14013q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ImageView f60703toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private TextView f60704zy;

        C2396k(View parent, int width) {
            this.f14011k = parent;
            this.f60703toq = (ImageView) parent.findViewById(R.id.image);
            this.f60704zy = (TextView) this.f14011k.findViewById(android.R.id.title);
            this.f14013q = (TextView) this.f14011k.findViewById(R.id.price);
            this.f14012n = this.f14011k.findViewById(R.id.image_fl);
            width = width <= 0 ? this.f14011k.getContext().getResources().getDimensionPixelSize(R.dimen.icon_recommend_image_width) : width;
            float fraction = this.f14011k.getResources().getFraction(R.fraction.aod_thumbnail_default_ratio, width, width);
            this.f60703toq.getLayoutParams().width = width;
            this.f60703toq.getLayoutParams().height = (int) fraction;
        }
    }

    public ElementSearchAodViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14010y = new ArrayList();
        this.f14009g = com.android.thememanager.basemodule.imageloader.x2.fn3e();
        if (C1819o.d2ok(fn3e())) {
            this.f14009g.wvg(0);
        }
        this.f14010y.add(0, new C2396k(itemView.findViewById(R.id.item_0), wvg().x9kr()));
        this.f14010y.add(1, new C2396k(itemView.findViewById(R.id.item_1), wvg().x9kr()));
    }

    /* JADX INFO: renamed from: c */
    private void m8648c(TextView priceView, int currentPriceInCent) {
        priceView.setText(C1815m.toq(fn3e(), currentPriceInCent));
        priceView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8649l(UIProduct uIProduct, View view) {
        Intent intentKi = com.android.thememanager.toq.ki(ki(), ni7(), uIProduct.uuid, null, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
        if (ni7() != null) {
            ni7().startActivityForResult(intentKi, 1);
        } else {
            ki().startActivity(intentKi);
        }
        m6706z().d8wk(uIProduct.trackId, null);
    }

    public static ElementSearchAodViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchAodViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_aod_two_items, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        int size = this.f14010y.size();
        int size2 = item.getProductList().size();
        if (size2 < size && item.isHasMore()) {
            this.itemView.setVisibility(8);
            return;
        }
        this.itemView.setVisibility(0);
        for (int i2 = 0; i2 < size; i2++) {
            C2396k c2396k = this.f14010y.get(i2);
            if (i2 < size2) {
                final UIProduct uIProduct = item.getProductList().get(i2);
                c2396k.f60704zy.setText(uIProduct.name);
                m8648c(c2396k.f14013q, uIProduct.currentPriceInCent);
                com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), uIProduct.imageUrl, c2396k.f60703toq, this.f14009g.m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)));
                C1812k.toq(c2396k.f14012n, uIProduct.name);
                c2396k.f14012n.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f14391k.m8649l(uIProduct, view);
                    }
                });
                C6077k.o1t(c2396k.f14012n);
                c2396k.f14011k.setVisibility(0);
            } else {
                C6077k.m22367g(c2396k.f14011k);
                c2396k.f14011k.setVisibility(4);
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
