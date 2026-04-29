package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.ConcentrationListElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.fragment.AbstractC2352n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperConcentrationListViewHolder extends BaseViewHolder<ConcentrationListElement> implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: f */
    private int f14302f;

    /* JADX INFO: renamed from: g */
    private TextView f14303g;

    /* JADX INFO: renamed from: h */
    private toq f14304h;

    /* JADX INFO: renamed from: i */
    private List<UIProduct> f14305i;

    /* JADX INFO: renamed from: l */
    private int f14306l;

    /* JADX INFO: renamed from: p */
    private RecyclerView f14307p;

    /* JADX INFO: renamed from: r */
    private int f14308r;

    /* JADX INFO: renamed from: s */
    private TextView f14309s;

    /* JADX INFO: renamed from: t */
    private int f14310t;

    /* JADX INFO: renamed from: y */
    private TextView f14311y;

    /* JADX INFO: renamed from: z */
    private int f14312z;

    private class toq extends RecyclerView.AbstractC1060y<C7929toq> {

        /* JADX INFO: renamed from: k */
        private List<UIProduct> f14313k;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WallpaperConcentrationListViewHolder$toq$k */
        class ViewOnClickListenerC2432k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f14315k;

            ViewOnClickListenerC2432k(final int val$position) {
                this.f14315k = val$position;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                List listVyq = WallpaperConcentrationListViewHolder.this.vyq();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= listVyq.size()) {
                        break;
                    }
                    String onlineId = ((Resource) listVyq.get(i3)).getOnlineId();
                    if (!TextUtils.isEmpty(onlineId) && onlineId.equals(((UIProduct) WallpaperConcentrationListViewHolder.this.f14305i.get(this.f14315k)).uuid)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                Intent intentMcp = com.android.thememanager.toq.mcp(WallpaperConcentrationListViewHolder.this.ki(), listVyq, com.android.thememanager.basemodule.analysis.toq.npjo);
                intentMcp.putExtra(InterfaceC1357q.f53879gvn7, i2);
                if (WallpaperConcentrationListViewHolder.this.ni7() != null) {
                    WallpaperConcentrationListViewHolder.this.ni7().startActivityForResult(intentMcp, 109);
                } else {
                    WallpaperConcentrationListViewHolder.this.ki().startActivity(intentMcp);
                }
                if (((UIProduct) toq.this.f14313k.get(this.f14315k)).link != null) {
                    WallpaperConcentrationListViewHolder.this.m6706z().d8wk(((UIProduct) toq.this.f14313k.get(this.f14315k)).link.trackId, null);
                    C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.cud));
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WallpaperConcentrationListViewHolder$toq$toq, reason: collision with other inner class name */
        private class C7929toq extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            private NinePatchImageView f14317k;

            /* JADX INFO: renamed from: q */
            private SmoothFrameLayout2 f14319q;

            public C7929toq(@lvui View itemView) {
                super(itemView);
                this.f14317k = (NinePatchImageView) itemView.findViewById(R.id.detail_image);
                this.f14319q = (SmoothFrameLayout2) itemView.findViewById(R.id.detail_image_container);
            }
        }

        public toq(List<UIProduct> uiProductList) {
            new ArrayList();
            this.f14313k = uiProductList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
        public C7929toq onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
            return new C7929toq(LayoutInflater.from(WallpaperConcentrationListViewHolder.this.ki()).inflate(R.layout.rc_detail_picture, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f14313k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui C7929toq viewHolder, int position) {
            com.android.thememanager.basemodule.imageloader.x2.m6782y(WallpaperConcentrationListViewHolder.this.ki(), this.f14313k.get(position).imageUrl, viewHolder.f14317k, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(com.android.thememanager.basemodule.imageloader.x2.kja0(com.android.thememanager.basemodule.imageloader.x2.x2())));
            C6077k.o1t(viewHolder.f14319q);
            View view = viewHolder.itemView;
            C1812k.toq(view, view.getContext().getString(R.string.de_order, Integer.valueOf(position + 1)));
            viewHolder.f14319q.setOnClickListener(new ViewOnClickListenerC2432k(position));
        }

        public void ni7(List<UIProduct> uiProductList) {
            this.f14313k = uiProductList;
        }
    }

    private class zy extends RecyclerView.kja0 {
        private zy() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            outRect.left = WallpaperConcentrationListViewHolder.this.f14306l;
            outRect.right = 0;
            if (parent.getChildPosition(view) == WallpaperConcentrationListViewHolder.this.f14305i.size() - 1) {
                outRect.right = WallpaperConcentrationListViewHolder.this.f14302f;
            } else if (parent.getChildPosition(view) == 0) {
                outRect.left = WallpaperConcentrationListViewHolder.this.f14308r;
            }
        }
    }

    public WallpaperConcentrationListViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14305i = new ArrayList();
        m8769e();
    }

    /* JADX INFO: renamed from: e */
    private void m8769e() {
        Resources resources = ki().getResources();
        this.f14312z = resources.getDimensionPixelSize(R.dimen.detail_concentration_title_text_size);
        this.f14310t = resources.getDimensionPixelSize(R.dimen.detail_concentration_title_margin_start);
        this.f14308r = resources.getDimensionPixelSize(R.dimen.detail_concentration_list_first_item_margin_start);
        this.f14306l = resources.getDimensionPixelSize(R.dimen.detail_concentration_list_item_margin_start);
        this.f14302f = resources.getDimensionPixelSize(R.dimen.detail_concentration_list_last_item_margin_end);
        TextView textView = (TextView) this.itemView.findViewById(R.id.concentration_title);
        this.f14303g = textView;
        textView.setTextSize(0, this.f14312z);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.concentration_subtitle);
        this.f14311y = textView2;
        textView2.setVisibility(0);
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.concentration_count);
        this.f14309s = textView3;
        textView3.setVisibility(0);
        this.f14307p = (RecyclerView) this.itemView.findViewById(R.id.detail_concentration_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ki());
        linearLayoutManager.setOrientation(0);
        this.f14304h = new toq(this.f14305i);
        this.f14307p.setLayoutManager(linearLayoutManager);
        this.f14307p.addItemDecoration(new zy());
        this.f14307p.setAdapter(this.f14304h);
        this.f14307p.setOverScrollMode(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14303g.getLayoutParams();
        layoutParams.setMarginStart(this.f14310t);
        this.f14303g.setLayoutParams(layoutParams);
    }

    public static WallpaperConcentrationListViewHolder nn86(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WallpaperConcentrationListViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_list_concentration_view, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Resource> vyq() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f9847k.ni7().size(); i2++) {
            if (this.f9847k.ni7().get(i2) instanceof ConcentrationListElement) {
                ConcentrationListElement concentrationListElement = (ConcentrationListElement) this.f9847k.ni7().get(i2);
                for (int i3 = 0; i3 < concentrationListElement.getProducts().size(); i3++) {
                    Resource resourceM8801q = C2451n.m8801q(concentrationListElement.getProducts().get(i3), false);
                    if (resourceM8801q != null) {
                        arrayList.add(resourceM8801q);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: hb, reason: merged with bridge method [inline-methods] */
    public void o1t(ConcentrationListElement item, int position) {
        super.o1t(item, position);
        this.f14303g.setText(item.getTitle());
        this.f14311y.setText(item.getSubTitle());
        this.f14309s.setText(ki().getString(R.string.lockscreen_magazine_system_subscribe, item.getProducts().size() + ""));
        List<UIProduct> products = item.getProducts();
        this.f14305i = products;
        toq toqVar = this.f14304h;
        if (toqVar == null || products == null) {
            return;
        }
        toqVar.ni7(products);
        this.f14304h.notifyDataSetChanged();
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1721s
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 109 && data != null && data.hasExtra(InterfaceC1357q.f53846bap7)) {
            String stringExtra = data.getStringExtra(InterfaceC1357q.f53846bap7);
            for (int i2 = 0; i2 < this.f9847k.ni7().size(); i2++) {
                if (this.f9847k.ni7().get(i2) instanceof ConcentrationListElement) {
                    ConcentrationListElement concentrationListElement = (ConcentrationListElement) this.f9847k.ni7().get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= concentrationListElement.getProducts().size()) {
                            break;
                        }
                        if (concentrationListElement.getProducts().get(i3).productUuid.equals(stringExtra)) {
                            ((AbstractC2352n) ni7()).zff0().smoothScrolltoPosition(i2);
                            data.removeExtra(InterfaceC1357q.f53902lh);
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f14305i.size(); i2++) {
            arrayList.add(this.f14305i.get(i2).link.trackId);
        }
        return arrayList;
    }
}
