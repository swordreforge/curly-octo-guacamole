package com.android.thememanager.recommend.view.listview.viewholder;

import a98o.C0005q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchFontViewHolder extends BaseViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: g */
    private View f14014g;

    /* JADX INFO: renamed from: h */
    private float f14015h;

    /* JADX INFO: renamed from: i */
    private float f14016i;

    /* JADX INFO: renamed from: p */
    private ImageView f14017p;

    /* JADX INFO: renamed from: s */
    private TextView f14018s;

    /* JADX INFO: renamed from: y */
    private DiscountPriceView f14019y;

    /* JADX INFO: renamed from: z */
    private int f14020z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSearchFontViewHolder$k */
    class ViewOnClickListenerC2397k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f14021k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ UIProduct f14023q;

        ViewOnClickListenerC2397k(final int val$position, final UIProduct val$product) {
            this.f14021k = val$position;
            this.f14023q = val$product;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (ElementSearchFontViewHolder.this.wvg() == null || ElementSearchFontViewHolder.this.wvg().ni7() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = this.f14021k; i2 >= 0 && i2 <= ElementSearchFontViewHolder.this.wvg().ni7().size() && ElementSearchFontViewHolder.this.wvg().ni7().size() != 0; i2--) {
                UIElement uIElement = ElementSearchFontViewHolder.this.wvg().ni7().get(i2);
                if (!(uIElement instanceof ThemeSearchElement)) {
                    break;
                }
                UIProduct uIProduct = ((ThemeSearchElement) uIElement).getProductList().get(0);
                if (uIProduct != null) {
                    arrayList.add(0, new C0005q(uIProduct.uuid, uIProduct.trackId));
                }
            }
            int size = arrayList.size() - 1;
            int i3 = this.f14021k;
            while (true) {
                i3++;
                if (i3 >= ElementSearchFontViewHolder.this.wvg().ni7().size()) {
                    break;
                }
                UIElement uIElement2 = ElementSearchFontViewHolder.this.wvg().ni7().get(i3);
                if (!(uIElement2 instanceof ThemeSearchElement)) {
                    break;
                }
                UIProduct uIProduct2 = ((ThemeSearchElement) uIElement2).getProductList().get(0);
                if (uIProduct2 != null) {
                    arrayList.add(new C0005q(uIProduct2.uuid, uIProduct2.trackId));
                }
            }
            ActivityC0891q activityC0891qKi = ElementSearchFontViewHolder.this.ki();
            Fragment fragmentNi7 = ElementSearchFontViewHolder.this.ni7();
            UIProduct uIProduct3 = this.f14023q;
            C2451n.x2(activityC0891qKi, fragmentNi7, arrayList, size, uIProduct3.imageUrl, uIProduct3.productType);
            ElementSearchFontViewHolder.this.m6706z().d8wk(this.f14023q.trackId, null);
        }
    }

    public ElementSearchFontViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14014g = itemView;
        this.f14019y = (DiscountPriceView) itemView.findViewById(R.id.price);
        this.f14017p = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14015h = ki().getResources().getDimensionPixelOffset(R.dimen.recommend_font_card_list_current_price_text_size);
        this.f14016i = ki().getResources().getDimensionPixelOffset(R.dimen.recommend_font_card_list_origin_price_text_size);
        this.f14020z = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        C6077k.ld6(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementSearchFontViewHolder m8654l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchFontViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_font_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        if (item.getProductList() == null || item.getProductList().size() == 0) {
            return;
        }
        if (this.f14018s == null) {
            ViewStub viewStub = (ViewStub) this.f14014g.findViewById(R.id.rank_count);
            if (viewStub.getParent() != null) {
                viewStub.inflate();
            }
            this.f14018s = (TextView) this.f14014g.findViewById(R.id.count);
        }
        this.f14018s.setText(String.valueOf(position + 1));
        UIProduct uIProduct = item.getProductList().get(0);
        if (uIProduct == null) {
            return;
        }
        if (C1819o.x9kr()) {
            this.f14017p.setScaleType(ImageView.ScaleType.FIT_END);
        } else {
            this.f14017p.setScaleType(ImageView.ScaleType.FIT_START);
        }
        boolean zNcyb = wvg().ncyb();
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), uIProduct.getImageUrl(fn3e(), zNcyb), this.f14017p, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f14020z, zNcyb)).a9(false));
        C1812k.toq(this.f14017p, uIProduct.name);
        if (this.f14019y != null) {
            if (wvg().n5r1() || com.android.thememanager.basemodule.utils.o1t.fn3e()) {
                this.f14019y.setVisibility(8);
            } else {
                this.f14019y.setVisibility(0);
                this.f14019y.setPrice(uIProduct.originPriceInCent, uIProduct.currentPriceInCent);
                this.f14019y.setTextStyle(this.f14016i, this.f14015h, R.color.font_origin_price, R.color.font_current_price);
            }
        }
        this.itemView.setOnClickListener(new ViewOnClickListenerC2397k(position, uIProduct));
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
