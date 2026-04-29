package com.android.thememanager.recommend.view.listview.viewholder;

import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ld6;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.AutoScrollRecyclerView;
import com.android.thememanager.basemodule.views.InterfaceC1865s;
import com.android.thememanager.basemodule.views.TwoLineHorizontalLoopLayoutManager;
import com.android.thememanager.recommend.model.entity.element.HomePageHybridMarqueeCardElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class HomePageHybridMarqueeViewHolder extends BaseHomePageHybridRecommendViewHolder<HomePageHybridMarqueeCardElement> implements InterfaceC1865s {

    /* JADX INFO: renamed from: c */
    private static final int f14114c = 2;

    /* JADX INFO: renamed from: f */
    private static final String f14115f = "HomePageHybridMarqueeViewHolder";

    /* JADX INFO: renamed from: i */
    private boolean f14116i;

    /* JADX INFO: renamed from: l */
    private TwoLineHorizontalLoopLayoutManager f14117l;

    /* JADX INFO: renamed from: r */
    private zy f14118r;

    /* JADX INFO: renamed from: t */
    private AutoScrollRecyclerView f14119t;

    /* JADX INFO: renamed from: z */
    private boolean f14120z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.HomePageHybridMarqueeViewHolder$k */
    class C2412k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f14121k;

        C2412k(final int val$padding) {
            this.f14121k = val$padding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q @lvui Rect outRect, @InterfaceC7396q @lvui View view, @InterfaceC7396q @lvui RecyclerView parent, @InterfaceC7396q @lvui RecyclerView.mcp state) {
            outRect.top = 0;
            int i2 = this.f14121k;
            outRect.bottom = i2;
            outRect.left = 0;
            outRect.right = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        private final NinePatchImageView f14122k;

        public toq(@lvui View itemView) {
            super(itemView);
            NinePatchImageView ninePatchImageView = (NinePatchImageView) itemView.findViewById(R.id.preview);
            this.f14122k = ninePatchImageView;
            C6077k.cdj(ninePatchImageView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(UIProduct uIProduct, View view) {
            HomePageHybridMarqueeViewHolder homePageHybridMarqueeViewHolder = HomePageHybridMarqueeViewHolder.this;
            homePageHybridMarqueeViewHolder.n5r1(homePageHybridMarqueeViewHolder.ki(), uIProduct);
            if (HomePageHybridMarqueeViewHolder.this.m6706z() != null) {
                HomePageHybridMarqueeViewHolder.this.m6706z().d8wk(uIProduct.trackId, null);
            }
        }

        public void ni7(final UIProduct product, int cornerRadius) {
            if (product == null) {
                Log.w(HomePageHybridMarqueeViewHolder.f14115f, "setInfo: UIProduct is null ");
                return;
            }
            HomePageHybridMarqueeViewHolder homePageHybridMarqueeViewHolder = HomePageHybridMarqueeViewHolder.this;
            homePageHybridMarqueeViewHolder.ncyb(this.f14122k, homePageHybridMarqueeViewHolder.wvg().ki(), product, cornerRadius);
            C1812k.toq(this.f14122k, product.name);
            this.f14122k.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.n7h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14388k.fn3e(product, view);
                }
            });
        }
    }

    private class zy extends RecyclerView.AbstractC1060y<toq> {

        /* JADX INFO: renamed from: k */
        private List<UIProduct> f14124k = new ArrayList();

        /* JADX INFO: renamed from: q */
        private final int f14126q;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.HomePageHybridMarqueeViewHolder$zy$k */
        class C2413k extends ld6.toq {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ List f14127k;

            C2413k(final List val$newList) {
                this.f14127k = val$newList;
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: k */
            public boolean mo4703k(int a2, int b2) {
                boolean zFn3e = zy.this.fn3e((UIProduct) zy.this.f14124k.get(a2), (UIProduct) this.f14127k.get(b2));
                if (!zFn3e) {
                    HomePageHybridMarqueeViewHolder.this.f14117l.m7331g(true);
                }
                return zFn3e;
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: n */
            public int mo4704n() {
                return zy.this.f14124k.size();
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: q */
            public int mo4705q() {
                return this.f14127k.size();
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            public boolean toq(int a2, int b2) {
                boolean zFn3e = zy.this.fn3e((UIProduct) zy.this.f14124k.get(a2), (UIProduct) this.f14127k.get(b2));
                if (!zFn3e) {
                    HomePageHybridMarqueeViewHolder.this.f14117l.m7331g(true);
                }
                return zFn3e;
            }
        }

        public zy() {
            this.f14126q = HomePageHybridMarqueeViewHolder.this.ki().getResources().getDimensionPixelOffset(R.dimen.home_page_hybrid_marquee_card_item_radius);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean fn3e(UIProduct oldInfo, UIProduct newInfo) {
            return Objects.equals(oldInfo.uuid, newInfo.uuid) && Objects.equals(oldInfo.trackId, newInfo.trackId) && Objects.equals(oldInfo.name, newInfo.name) && Objects.equals(oldInfo.imageUrl, newInfo.imageUrl) && Objects.equals(oldInfo.title, newInfo.title) && Objects.equals(oldInfo.productType, newInfo.productType) && Objects.equals(oldInfo.productUuid, newInfo.productUuid);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public toq onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
            HomePageHybridMarqueeViewHolder homePageHybridMarqueeViewHolder = HomePageHybridMarqueeViewHolder.this;
            return homePageHybridMarqueeViewHolder.new toq(LayoutInflater.from(homePageHybridMarqueeViewHolder.fn3e()).inflate(R.layout.element_home_page_hybrid_marquee_card_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f14124k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui toq holder, int position) {
            holder.ni7(this.f14124k.get(position), this.f14126q);
        }

        /* JADX INFO: renamed from: z */
        public void m8705z(List<UIProduct> newList) {
            if (y9n.mcp(newList)) {
                this.f14124k.clear();
                notifyDataSetChanged();
            } else {
                androidx.recyclerview.widget.ld6.zy(new C2413k(newList), false).m5034n(this);
                this.f14124k.clear();
                this.f14124k.addAll(newList);
            }
        }
    }

    public HomePageHybridMarqueeViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        if (adapter != null && adapter.d2ok() == 0) {
            x9kr();
        }
        nn86();
    }

    public static HomePageHybridMarqueeViewHolder hb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new HomePageHybridMarqueeViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.element_home_page_hybrid_marquee_card, parent, false), adapter);
    }

    private void nn86() {
        this.f13789g = (NinePatchImageView) this.itemView.findViewById(R.id.title_logo);
        this.f13792y = (TextView) this.itemView.findViewById(R.id.tv_title);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_guide);
        this.f13791s = textView;
        textView.setOnClickListener(this);
        this.f14119t = (AutoScrollRecyclerView) this.itemView.findViewById(R.id.marquee_recyclerview);
        this.f14118r = new zy();
        int dimensionPixelSize = fn3e().getResources().getDimensionPixelSize(R.dimen.home_page_hybrid_marquee_card_list_padding);
        this.f14119t.addItemDecoration(new C2412k(dimensionPixelSize));
        TwoLineHorizontalLoopLayoutManager twoLineHorizontalLoopLayoutManager = new TwoLineHorizontalLoopLayoutManager();
        this.f14117l = twoLineHorizontalLoopLayoutManager;
        twoLineHorizontalLoopLayoutManager.m7333q(dimensionPixelSize);
        this.f14117l.m7331g(true);
        this.f14117l.m7332n(-100, 0);
        this.f14119t.setLayoutManager(this.f14117l);
        this.f14119t.setHasFixedSize(true);
        this.f14119t.setScrollDirection(0);
        this.f14119t.setFlingScale(0.2d);
        this.f14119t.setOpenAutoScroll(true ^ C1807g.oc().booleanValue());
        this.f14119t.setScrollSpeed(50);
        this.f14119t.setAdapter(this.f14118r);
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public View cdj() {
        return this.itemView;
    }

    /* JADX INFO: renamed from: e */
    public void m8702e() {
        if (!this.f14116i) {
            this.f14116i = true;
        }
        this.f14119t.m7285p();
    }

    /* JADX INFO: renamed from: j */
    public void m8703j() {
        if (this.f14116i) {
            this.f14119t.m7286s();
            this.f14116i = false;
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void o1t(HomePageHybridMarqueeCardElement item, int position) {
        super.o1t(item, position);
        List<UIProduct> products = item.getProducts();
        if (y9n.mcp(products) || products.size() < 2) {
            this.itemView.setVisibility(8);
            Log.w(f14115f, "setInfo: UIProduct dataList Is Empty or size less than 2 ");
        } else {
            m8582f(item);
            this.f14118r.m8705z(products);
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        this.f14120z = true;
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    /* JADX INFO: renamed from: p */
    public boolean mo7369p() {
        return this.f14120z;
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public void qrj(int state) {
        if (state == 4) {
            m8703j();
        } else if (state == 1) {
            m8702e();
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

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public int x2() {
        return 5;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        this.f14120z = false;
    }
}
