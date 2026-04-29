package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchWallpaperViewHolder extends BaseViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: g */
    private List<BaseViewHolder> f14053g;

    static class ElementSubViewHolder extends BaseAdViewHolder<UIProduct> {

        /* JADX INFO: renamed from: p */
        protected int f14054p;

        /* JADX INFO: renamed from: s */
        protected ImageView f14055s;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSearchWallpaperViewHolder$ElementSubViewHolder$k */
        class ViewOnClickListenerC2401k implements View.OnClickListener {
            ViewOnClickListenerC2401k() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                C2451n.kja0(ElementSubViewHolder.this.ki(), 0, "thememanager", ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).uuid, ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).trackId, false, ((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).imageUrl);
                ElementSubViewHolder.this.m6706z().d8wk(((UIProduct) ((BaseThemeAdapter.ViewHolder) ElementSubViewHolder.this).f9849q).trackId, null);
            }
        }

        public ElementSubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f14055s = (ImageView) itemView;
            this.f14054p = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
            C6077k.o1t(itemView);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: uv6, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct resource, int position) {
            super.o1t(resource, position);
            com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), resource.imageUrl, this.f14055s, com.android.thememanager.basemodule.imageloader.x2.ki(position, this.f14054p), this.f14054p);
            this.itemView.setOnClickListener(new ViewOnClickListenerC2401k());
            C1812k.toq(this.f14055s, resource.name);
        }
    }

    public ElementSearchWallpaperViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14053g = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(itemView.findViewById(R.id.item_0));
        arrayList.add(itemView.findViewById(R.id.item_1));
        arrayList.add(itemView.findViewById(R.id.item_2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f14053g.add(ncyb((View) it.next()));
        }
    }

    /* JADX INFO: renamed from: l */
    public static ElementSearchWallpaperViewHolder m8668l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchWallpaperViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_three_wallpaper_group, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubViewHolder(view, wvg());
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        if (item.getProductList() == null) {
            return;
        }
        int size = item.getProductList().size();
        for (int i2 = 0; i2 < size; i2++) {
            BaseViewHolder baseViewHolder = this.f14053g.get(i2);
            baseViewHolder.itemView.setVisibility(0);
            UIProduct uIProduct = item.getProductList().get(i2);
            baseViewHolder.o1t(uIProduct, item.getProductList().indexOf(uIProduct));
        }
        if (size < this.f14053g.size()) {
            for (int i3 = 0; i3 < this.f14053g.size() - size; i3++) {
                this.f14053g.get((r6.size() - 1) - i3).itemView.setVisibility(4);
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
