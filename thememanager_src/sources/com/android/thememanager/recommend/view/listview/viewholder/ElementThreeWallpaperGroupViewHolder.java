package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.ThreeWallpaperGroupElement;
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
public class ElementThreeWallpaperGroupViewHolder extends BaseViewHolder<ThreeWallpaperGroupElement> {

    /* JADX INFO: renamed from: g */
    private List<BaseViewHolder> f14076g;

    static class ElementSubViewHolder extends BaseAdViewHolder<UIProduct> {

        /* JADX INFO: renamed from: p */
        protected int f14077p;

        /* JADX INFO: renamed from: s */
        protected ImageView f14078s;

        public ElementSubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f14078s = (ImageView) itemView;
            this.f14077p = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
            C6077k.o1t(itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: l */
        public /* synthetic */ void m8681l(View view) {
            AdInfo adInfo = ((UIProduct) this.f9849q).getAdInfo();
            if (adInfo != null) {
                C1653q.m6529q(ki(), adInfo, new Map[0]);
                return;
            }
            ActivityC0891q activityC0891qKi = ki();
            T t2 = this.f9849q;
            C2451n.kja0(activityC0891qKi, 0, "thememanager", ((UIProduct) t2).uuid, ((UIProduct) t2).trackId, false, ((UIProduct) t2).imageUrl);
            m6706z().d8wk(((UIProduct) this.f9849q).trackId, null);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct resource, int position) {
            super.o1t(resource, position);
            com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), resource.imageUrl, this.f14078s, com.android.thememanager.basemodule.imageloader.x2.ki(position, this.f14077p), this.f14077p);
            C1812k.toq(this.f14078s, resource.name);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14413k.m8681l(view);
                }
            });
        }
    }

    public ElementThreeWallpaperGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14076g = new ArrayList();
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(itemView.findViewById(R.id.item_0));
        arrayList.add(itemView.findViewById(R.id.item_1));
        arrayList.add(itemView.findViewById(R.id.item_2));
        for (View view : arrayList) {
            view.setVisibility(4);
            this.f14076g.add(ncyb(view));
        }
    }

    /* JADX INFO: renamed from: l */
    public static ElementThreeWallpaperGroupViewHolder m8680l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementThreeWallpaperGroupViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_three_wallpaper_group, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubViewHolder(view, wvg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        for (int i2 = 0; i2 < ((ThreeWallpaperGroupElement) this.f9849q).getProducts().size(); i2++) {
            this.f14076g.get(i2).mo8580n();
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThreeWallpaperGroupElement item, int position) {
        super.o1t(item, position);
        if (item.getOriginProducts() == null) {
            return;
        }
        int size = item.getProducts().size();
        for (int i2 = 0; i2 < size; i2++) {
            BaseViewHolder baseViewHolder = this.f14076g.get(i2);
            baseViewHolder.itemView.setVisibility(0);
            UIProduct uIProduct = item.getProducts().get(i2);
            baseViewHolder.o1t(uIProduct, item.getOriginProducts().indexOf(uIProduct));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((ThreeWallpaperGroupElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        for (int i2 = 0; i2 < ((ThreeWallpaperGroupElement) this.f9849q).getProducts().size(); i2++) {
            this.f14076g.get(i2).zy();
        }
    }
}
