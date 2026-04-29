package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.model.entity.element.HomePageHybridSixGridCardElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class HomePageHybridSixGridViewHolder extends BaseHomePageHybridRecommendViewHolder<HomePageHybridSixGridCardElement> {

    /* JADX INFO: renamed from: f */
    private static final int f14128f = 6;

    /* JADX INFO: renamed from: l */
    private static final int f14129l = 3;

    /* JADX INFO: renamed from: r */
    private static final String f14130r = "HomePageHybridSixGridCardViewHolder";

    /* JADX INFO: renamed from: i */
    private int f14131i;

    /* JADX INFO: renamed from: t */
    private final List<C2414k> f14132t;

    /* JADX INFO: renamed from: z */
    private int f14133z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.HomePageHybridSixGridViewHolder$k */
    private class C2414k {

        /* JADX INFO: renamed from: k */
        private final NinePatchImageView f14134k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final TextView f60717toq;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.HomePageHybridSixGridViewHolder$k$k */
        class k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIProduct f14135k;

            k(final UIProduct val$product) {
                this.f14135k = val$product;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                HomePageHybridSixGridViewHolder homePageHybridSixGridViewHolder = HomePageHybridSixGridViewHolder.this;
                homePageHybridSixGridViewHolder.n5r1(homePageHybridSixGridViewHolder.ki(), this.f14135k);
                if (HomePageHybridSixGridViewHolder.this.m6706z() != null) {
                    HomePageHybridSixGridViewHolder.this.m6706z().d8wk(this.f14135k.trackId, null);
                }
            }
        }

        public C2414k(View parentView) {
            NinePatchImageView ninePatchImageView = (NinePatchImageView) parentView.findViewById(R.id.hybrid_recommend_item_preview);
            this.f14134k = ninePatchImageView;
            C6077k.cdj(ninePatchImageView);
            this.f60717toq = (TextView) parentView.findViewById(R.id.hybrid_recommend_item_title);
        }

        /* JADX INFO: renamed from: k */
        public void m8709k(UIProduct product) {
            if (product == null) {
                Log.w(HomePageHybridSixGridViewHolder.f14130r, "setInfo: product is null ");
                return;
            }
            this.f14134k.getLayoutParams().width = HomePageHybridSixGridViewHolder.this.f14131i;
            this.f14134k.setOnClickListener(new k(product));
            C1812k.toq(this.f14134k, product.name);
            String str = product.name;
            if (p029m.zy.toq(str)) {
                this.f60717toq.setVisibility(4);
            } else {
                this.f60717toq.setText(str);
                this.f60717toq.setVisibility(0);
            }
            HomePageHybridSixGridViewHolder homePageHybridSixGridViewHolder = HomePageHybridSixGridViewHolder.this;
            homePageHybridSixGridViewHolder.ncyb(this.f14134k, homePageHybridSixGridViewHolder.wvg().ki(), product, HomePageHybridSixGridViewHolder.this.f14133z);
        }
    }

    public HomePageHybridSixGridViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        if (adapter != null && adapter.d2ok() == 0) {
            x9kr();
        }
        this.f14132t = new ArrayList();
        nn86(itemView);
    }

    public static HomePageHybridSixGridViewHolder hb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new HomePageHybridSixGridViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.element_home_page_hybrid_six_grid_card, parent, false), adapter);
    }

    private void nn86(View itemView) {
        this.f13789g = (NinePatchImageView) itemView.findViewById(R.id.title_logo);
        this.f13792y = (TextView) itemView.findViewById(R.id.tv_title);
        TextView textView = (TextView) itemView.findViewById(R.id.tv_guide);
        this.f13791s = textView;
        textView.setOnClickListener(this);
        GridLayout gridLayout = (GridLayout) itemView.findViewById(R.id.hybrid_recommend_grid_container);
        gridLayout.setColumnCount(3);
        for (int i2 = 0; i2 < 6; i2++) {
            View viewInflate = LayoutInflater.from(fn3e()).inflate(R.layout.element_home_page_hybrid_six_grid_item, (ViewGroup) gridLayout, false);
            gridLayout.addView(viewInflate);
            this.f14132t.add(new C2414k(viewInflate));
        }
        Resources resources = itemView.getResources();
        this.f14131i = (y9n.fn3e().x - (resources.getDimensionPixelSize(R.dimen.hybrid_recommend_item_padding) * 4)) / 3;
        this.f14133z = resources.getDimensionPixelSize(R.dimen.hybrid_recommend_item_preview_radius);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void o1t(HomePageHybridSixGridCardElement item, int position) {
        super.o1t(item, position);
        List<UIProduct> products = item.getProducts();
        if (y9n.mcp(products)) {
            this.itemView.setVisibility(8);
            return;
        }
        m8582f(item);
        if (products.size() < 6) {
            int size = 6 - products.size();
            for (int i2 = 0; i2 < size; i2++) {
                products.add(new UIProduct());
            }
        }
        int iMin = Math.min(products.size(), 6);
        for (int i3 = 0; i3 < iMin; i3++) {
            C2414k c2414k = this.f14132t.get(i3);
            if (c2414k != null) {
                c2414k.m8709k(products.get(i3));
            }
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        if (fu4() != null && fu4().getProducts() != null) {
            for (UIProduct uIProduct : fu4().getProducts()) {
                if (uIProduct != null && !p029m.zy.toq(uIProduct.trackId)) {
                    arrayList.add(uIProduct.trackId);
                }
            }
        }
        return arrayList;
    }
}
