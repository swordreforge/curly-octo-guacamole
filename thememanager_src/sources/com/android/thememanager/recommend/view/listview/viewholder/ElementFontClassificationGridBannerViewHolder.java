package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.FontWallpaperClassListItemElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementFontClassificationGridBannerViewHolder extends BaseViewHolder<FontWallpaperClassListItemElement> {

    /* JADX INFO: renamed from: i */
    private static final int f13877i = 3;

    /* JADX INFO: renamed from: g */
    private List<View> f13878g;

    /* JADX INFO: renamed from: h */
    private Integer[] f13879h;

    /* JADX INFO: renamed from: p */
    private int f13880p;

    /* JADX INFO: renamed from: s */
    private int f13881s;

    /* JADX INFO: renamed from: y */
    private int f13882y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementFontClassificationGridBannerViewHolder$k */
    class ViewOnClickListenerC2383k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIImageWithLink f13883k;

        ViewOnClickListenerC2383k(final UIImageWithLink val$banner) {
            this.f13883k = val$banner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f13883k.link != null) {
                C2451n.toq qVar = C2451n.m8797g().toq(this.f13883k.link.productType);
                qVar.x2(ElementFontClassificationGridBannerViewHolder.this.wvg().lvui());
                qVar.m8804g(ElementFontClassificationGridBannerViewHolder.this.wvg().m8549l());
                qVar.f7l8(ElementFontClassificationGridBannerViewHolder.this.wvg().n5r1());
                C2451n.m8803y(ElementFontClassificationGridBannerViewHolder.this.ki(), ElementFontClassificationGridBannerViewHolder.this.ni7(), this.f13883k.link, qVar);
                ElementFontClassificationGridBannerViewHolder.this.m6706z().d8wk(this.f13883k.link.trackId, null);
            }
        }
    }

    public ElementFontClassificationGridBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13878g = new ArrayList();
        this.f13879h = new Integer[]{Integer.valueOf(R.id.thumbnail_0), Integer.valueOf(R.id.thumbnail_1), Integer.valueOf(R.id.thumbnail_2)};
        for (int i2 = 0; i2 < 3; i2++) {
            View viewFindViewById = itemView.findViewById(this.f13879h[i2].intValue());
            C6077k.o1t(viewFindViewById);
            this.f13878g.add(viewFindViewById);
        }
        this.f13882y = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_recommend_three_img_radius);
        this.f13881s = ki().getResources().getDimensionPixelOffset(R.dimen.category_customize_container_padding_bottom);
        this.f13880p = ki().getResources().getDimensionPixelOffset(R.dimen.category_font_wallpaper_space_width);
    }

    /* JADX INFO: renamed from: l */
    public static ElementFontClassificationGridBannerViewHolder m8611l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementFontClassificationGridBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_three_classification_banner_group, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final FontWallpaperClassListItemElement item, int position) {
        super.o1t(item, position);
        for (int i2 = 0; i2 < 3; i2++) {
            this.f13878g.get(i2).setVisibility(4);
        }
        int iMin = Math.min(3, item.getBanners().size());
        for (int i3 = 0; i3 < iMin; i3++) {
            View view = this.f13878g.get(i3);
            view.setVisibility(0);
            UIImageWithLink uIImageWithLink = item.getBanners().get(i3);
            com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), uIImageWithLink.imageUrl, (ImageView) view.findViewById(R.id.thumbnail), com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13882y, wvg().ncyb()), this.f13882y);
            if (uIImageWithLink.link != null) {
                view.setOnClickListener(new ViewOnClickListenerC2383k(uIImageWithLink));
            }
        }
        if (item.getLastItem()) {
            this.itemView.setPadding(0, 0, 0, this.f13881s);
        } else {
            this.itemView.setPadding(0, 0, 0, this.f13880p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIImageWithLink> it = ((FontWallpaperClassListItemElement) this.f9849q).getBanners().iterator();
        while (it.hasNext()) {
            UILink uILink = it.next().link;
            if (uILink != null) {
                arrayList.add(uILink.trackId);
            }
        }
        return arrayList;
    }
}
