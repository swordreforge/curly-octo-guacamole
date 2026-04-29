package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.GirdBannerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ElementGridGroupViewHolder extends BaseViewHolder<GirdBannerElement> {

    /* JADX INFO: renamed from: g */
    private List<ElementSubImageWithLinkViewHolder> f13895g;

    /* JADX INFO: renamed from: y */
    private Integer[] f13896y;

    public ElementGridGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter, int thumbnailSize) {
        super(itemView, adapter);
        this.f13895g = new ArrayList();
        this.f13896y = new Integer[]{Integer.valueOf(R.id.thumbnail_0), Integer.valueOf(R.id.thumbnail_1), Integer.valueOf(R.id.thumbnail_2), Integer.valueOf(R.id.thumbnail_3), Integer.valueOf(R.id.thumbnail_4), Integer.valueOf(R.id.thumbnail_5)};
        int iMin = Math.min(thumbnailSize, 6);
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f13895g.add(new ElementSubImageWithLinkViewHolder((ImageView) itemView.findViewById(this.f13896y[i2].intValue()), adapter));
        }
        if (ncyb()) {
            x9kr();
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(GirdBannerElement item, int position) {
        super.o1t(item, position);
        Iterator<ElementSubImageWithLinkViewHolder> it = this.f13895g.iterator();
        while (it.hasNext()) {
            it.next().itemView.setVisibility(8);
        }
        if (item.getBanners() == null) {
            return;
        }
        int iMin = Math.min(item.getBanners().size(), this.f13895g.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            ElementSubImageWithLinkViewHolder elementSubImageWithLinkViewHolder = this.f13895g.get(i2);
            elementSubImageWithLinkViewHolder.itemView.setVisibility(0);
            elementSubImageWithLinkViewHolder.o1t(item.getBanners().get(i2), i2);
        }
    }

    protected boolean ncyb() {
        return wvg() != null && "widget_suit".equals(wvg().lvui());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIImageWithLink> it = ((GirdBannerElement) this.f9849q).getBanners().iterator();
        while (it.hasNext()) {
            UILink uILink = it.next().link;
            if (uILink != null) {
                arrayList.add(uILink.trackId);
            }
        }
        return arrayList;
    }
}
