package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.recommend.model.entity.element.WidgetSlideElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.listview.decoration.C2363n;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import gc3c.ViewOnClickListenerC6059k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetSlideViewHolder extends BaseViewHolder<WidgetSlideElement> implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    private static final String f14339l = "WidgetSlideViewHolder";

    /* JADX INFO: renamed from: g */
    private NinePatchImageView f14340g;

    /* JADX INFO: renamed from: h */
    private RecyclerView.AbstractC1048h f14341h;

    /* JADX INFO: renamed from: i */
    private C2436k f14342i;

    /* JADX INFO: renamed from: p */
    private RecyclerView f14343p;

    /* JADX INFO: renamed from: r */
    private x2.C1735g f14344r;

    /* JADX INFO: renamed from: s */
    private TextView f14345s;

    /* JADX INFO: renamed from: t */
    private int f14346t;

    /* JADX INFO: renamed from: y */
    private TextView f14347y;

    /* JADX INFO: renamed from: z */
    private int f14348z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WidgetSlideViewHolder$k */
    class C2436k extends RecyclerView.AbstractC1060y<k> {

        /* JADX INFO: renamed from: k */
        private List<UIProduct> f14349k = new ArrayList();

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WidgetSlideViewHolder$k$k */
        class k extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            private ViewOnClickListenerC6059k f14351k;

            public k(@lvui View itemView) {
                super(itemView);
                this.f14351k = new ViewOnClickListenerC6059k(itemView, WidgetSlideViewHolder.this.ki(), WidgetSlideViewHolder.this.wvg(), 2);
            }

            public void ki(UIProduct product, int position) {
                this.f14351k.m22283n(product, position);
            }
        }

        C2436k() {
        }

        public UIProduct cdj(int index) {
            if (index < 0 || index >= getItemCount()) {
                return null;
            }
            return this.f14349k.get(index);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
        public k onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
            return new k(ViewOnClickListenerC6059k.zy(parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f14349k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemViewType(int position) {
            return 122;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui k holder, int position) {
            UIProduct uIProductCdj = cdj(position);
            holder.itemView.setVisibility(uIProductCdj != null ? 0 : 8);
            if (uIProductCdj != null) {
                holder.ki(uIProductCdj, position);
            }
        }

        public void ni7(List<UIProduct> newProducts) {
            if (newProducts == null || newProducts.isEmpty()) {
                return;
            }
            this.f14349k.clear();
            this.f14349k.addAll(newProducts);
        }
    }

    public WidgetSlideViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14340g = (NinePatchImageView) itemView.findViewById(R.id.title_logo);
        this.f14347y = (TextView) itemView.findViewById(R.id.tv_title);
        this.f14345s = (TextView) itemView.findViewById(R.id.tv_guide);
        this.f14343p = (RecyclerView) itemView.findViewById(R.id.recycler_view);
        n5r1();
        this.f14345s.setOnClickListener(this);
        Resources resources = itemView.getResources();
        this.f14348z = resources.getDimensionPixelSize(R.dimen.hot_list_header_title_logo_width);
        this.f14346t = resources.getDimensionPixelSize(R.dimen.hot_list_header_title_logo_height);
        this.f14344r = com.android.thememanager.basemodule.imageloader.x2.fn3e().wvg(0).x9kr(this.f14348z, this.f14346t);
        x9kr();
    }

    /* JADX INFO: renamed from: f */
    public static WidgetSlideViewHolder m8782f(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WidgetSlideViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_widget_slide, parent, false), adapter);
    }

    /* JADX INFO: renamed from: l */
    private void m8783l() {
        ActivityC0891q activityC0891qKi = this.f9847k.ki();
        if (activityC0891qKi == null) {
            Log.w(f14339l, "gotoUILinkConfigurationPage failed: activity == null");
            return;
        }
        UILink uILink = fu4().link;
        if (uILink == null) {
            Log.w(f14339l, "gotoUILinkConfigurationPage failed: link == null");
            return;
        }
        BaseThemeAdapter baseThemeAdapter = this.f9847k;
        if (baseThemeAdapter instanceof RecommendListViewAdapter) {
            C2451n.m8803y(activityC0891qKi, baseThemeAdapter.fu4(), uILink, C2451n.zy((RecommendListViewAdapter) this.f9847k).m8806n(true));
        }
        InterfaceC1719p interfaceC1719pM6706z = m6706z();
        if (interfaceC1719pM6706z != null) {
            interfaceC1719pM6706z.d8wk(uILink.trackId, null);
        }
    }

    private void n5r1() {
        this.f14343p.setNestedScrollingEnabled(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ki(), 0, false);
        this.f14341h = linearLayoutManager;
        this.f14343p.setLayoutManager(linearLayoutManager);
        this.f14343p.addItemDecoration(new C2363n(fn3e(), R.dimen.inner_widget_top_offset, R.dimen.me_widget_bottom_offset));
        C2436k c2436k = new C2436k();
        this.f14342i = c2436k;
        this.f14343p.setAdapter(c2436k);
    }

    private String ncyb(WidgetSlideElement item) {
        RecommendListViewAdapter recommendListViewAdapterWvg = wvg();
        return recommendListViewAdapterWvg == null ? item.titlePic : recommendListViewAdapterWvg.ncyb() ? item.darkTitlePic : item.titlePic;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void o1t(WidgetSlideElement item, int position) {
        super.o1t(item, position);
        String strNcyb = ncyb(item);
        boolean qVar = p029m.zy.toq(strNcyb);
        if (qVar) {
            this.f14340g.setVisibility(8);
        } else {
            this.f14347y.setVisibility(8);
            this.f14340g.setVisibility(0);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), strNcyb, this.f14340g, this.f14344r);
        }
        if (qVar) {
            String str = item.title;
            if (p029m.zy.toq(str)) {
                this.f14347y.setVisibility(4);
            } else {
                this.f14347y.setVisibility(0);
                this.f14347y.setText(str);
            }
        }
        String str2 = item.guide;
        if (p029m.zy.toq(str2)) {
            this.f14345s.setVisibility(4);
        } else {
            this.f14345s.setVisibility(0);
            this.f14345s.setText(str2);
        }
        List<UIProduct> list = item.products;
        if (list == null || list.isEmpty()) {
            this.f14343p.setVisibility(8);
            return;
        }
        this.f14343p.setVisibility(0);
        this.f14342i.ni7(list);
        this.f14342i.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() == R.id.tv_guide) {
            m8783l();
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        if (fu4() != null && fu4().products != null) {
            for (UIProduct uIProduct : fu4().products) {
                if (uIProduct != null && !p029m.zy.toq(uIProduct.trackId)) {
                    arrayList.add(uIProduct.trackId);
                }
            }
        }
        return arrayList;
    }
}
