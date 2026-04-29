package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.recommend.model.entity.element.RankDetailTopThreeWallpaperElement;
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
public class ElementRankTopThreeWallpaperViewHolder extends BaseViewHolder<RankDetailTopThreeWallpaperElement> {

    /* JADX INFO: renamed from: y */
    private static final Integer[] f13969y = {Integer.valueOf(R.drawable.rank_0), Integer.valueOf(R.drawable.rank_1), Integer.valueOf(R.drawable.rank_2)};

    /* JADX INFO: renamed from: g */
    private List<BaseViewHolder> f13970g;

    static class ElementSubViewHolder extends BaseAdViewHolder<UIProduct> {

        /* JADX INFO: renamed from: p */
        protected int f13971p;

        /* JADX INFO: renamed from: s */
        protected ImageView f13972s;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRankTopThreeWallpaperViewHolder$ElementSubViewHolder$k */
        class ViewOnClickListenerC2392k implements View.OnClickListener {
            ViewOnClickListenerC2392k() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                AdInfo adInfo = ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).getAdInfo();
                if (adInfo != null) {
                    C1653q.m6529q(ElementSubViewHolder.this.ki(), adInfo, new Map[0]);
                } else {
                    C2451n.kja0(ElementSubViewHolder.this.ki(), 0, "thememanager", ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).uuid, ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).trackId, false, ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).imageUrl);
                    ElementSubViewHolder.this.m6706z().d8wk(((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).trackId, null);
                }
            }
        }

        public ElementSubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f13972s = (ImageView) itemView.findViewById(R.id.thumbnail);
            this.f13971p = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
            C6077k.o1t(itemView);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct resource, int position) {
            super.o1t(resource, position);
            com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), resource.imageUrl, this.f13972s, com.android.thememanager.basemodule.imageloader.x2.ki(position, this.f13971p), this.f13971p);
            this.itemView.setOnClickListener(new ViewOnClickListenerC2392k());
        }
    }

    public ElementRankTopThreeWallpaperViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13970g = new ArrayList();
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(itemView.findViewById(R.id.item_0));
        arrayList.add(itemView.findViewById(R.id.item_1));
        arrayList.add(itemView.findViewById(R.id.item_2));
        int i2 = 0;
        for (View view : arrayList) {
            this.f13970g.add(ncyb(view));
            ((ImageView) view.findViewById(R.id.rank_icon)).setImageResource(f13969y[i2].intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static ElementRankTopThreeWallpaperViewHolder m8633l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRankTopThreeWallpaperViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_rank_details_top_three_wallpaper, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubViewHolder(view, wvg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        for (int i2 = 0; i2 < ((RankDetailTopThreeWallpaperElement) this.f9849q).getProducts().size(); i2++) {
            this.f13970g.get(i2).mo8580n();
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(RankDetailTopThreeWallpaperElement item, int position) {
        super.o1t(item, position);
        int size = item.getProducts().size();
        for (int i2 = 0; i2 < size; i2++) {
            BaseViewHolder baseViewHolder = this.f13970g.get(i2);
            baseViewHolder.itemView.setVisibility(0);
            baseViewHolder.o1t(item.getProducts().get(i2), i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((RankDetailTopThreeWallpaperElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        for (int i2 = 0; i2 < ((RankDetailTopThreeWallpaperElement) this.f9849q).getProducts().size(); i2++) {
            this.f13970g.get(i2).zy();
        }
    }
}
