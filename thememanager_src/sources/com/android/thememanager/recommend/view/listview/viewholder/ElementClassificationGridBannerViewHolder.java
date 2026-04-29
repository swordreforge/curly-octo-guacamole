package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.recommend.model.entity.element.WallpaperClassListItemElement;
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
public class ElementClassificationGridBannerViewHolder extends BaseViewHolder<WallpaperClassListItemElement> {

    /* JADX INFO: renamed from: z */
    private static final int f13861z = 2;

    /* JADX INFO: renamed from: g */
    private List<View> f13862g;

    /* JADX INFO: renamed from: h */
    private View f13863h;

    /* JADX INFO: renamed from: i */
    private Integer[] f13864i;

    /* JADX INFO: renamed from: p */
    private int f13865p;

    /* JADX INFO: renamed from: s */
    private int f13866s;

    /* JADX INFO: renamed from: y */
    private int f13867y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementClassificationGridBannerViewHolder$k */
    class ViewOnClickListenerC2382k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIImageWithLink f13868k;

        ViewOnClickListenerC2382k(final UIImageWithLink val$banner) {
            this.f13868k = val$banner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f13868k.link != null) {
                String strLvui = ElementClassificationGridBannerViewHolder.this.wvg().lvui();
                boolean zEquals = "widget_suit".equals(strLvui);
                C2451n.toq qVar = C2451n.m8797g().toq(this.f13868k.link.productType);
                qVar.x2(strLvui);
                qVar.m8804g(ElementClassificationGridBannerViewHolder.this.wvg().m8549l());
                qVar.f7l8(ElementClassificationGridBannerViewHolder.this.wvg().n5r1());
                qVar.m8806n(zEquals);
                C2451n.m8803y(ElementClassificationGridBannerViewHolder.this.ki(), ElementClassificationGridBannerViewHolder.this.ni7(), this.f13868k.link, qVar);
                InterfaceC1719p interfaceC1719pM6706z = ElementClassificationGridBannerViewHolder.this.m6706z();
                UILink uILink = this.f13868k.link;
                interfaceC1719pM6706z.d8wk(uILink.trackId, uILink.title);
            }
        }
    }

    public ElementClassificationGridBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13862g = new ArrayList();
        this.f13864i = new Integer[]{Integer.valueOf(R.id.thumbnail_0), Integer.valueOf(R.id.thumbnail_1)};
        for (int i2 = 0; i2 < 2; i2++) {
            this.f13862g.add(itemView.findViewById(this.f13864i[i2].intValue()));
        }
        this.f13863h = itemView.findViewById(R.id.wallpaper_classification_banner_divider);
        this.f13867y = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_recommend_three_img_radius);
        this.f13866s = ki().getResources().getDimensionPixelOffset(R.dimen.category_customize_container_padding_bottom);
        this.f13865p = ki().getResources().getDimensionPixelOffset(R.dimen.wallpaper_classification_banner_item_bottom);
    }

    /* JADX INFO: renamed from: l */
    public static ElementClassificationGridBannerViewHolder m8608l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementClassificationGridBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_two_classification_banner_group, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final WallpaperClassListItemElement item, int position) {
        super.o1t(item, position);
        for (int i2 = 0; i2 < 2; i2++) {
            this.f13862g.get(i2).setVisibility(4);
        }
        int iMin = Math.min(2, item.getBanners().size());
        for (int i3 = 0; i3 < iMin; i3++) {
            View view = this.f13862g.get(i3);
            view.setVisibility(0);
            UIImageWithLink uIImageWithLink = item.getBanners().get(i3);
            com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), uIImageWithLink.imageUrl, (ImageView) view.findViewById(R.id.thumbnail), com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13867y, wvg().ncyb()), this.f13867y);
            UILink uILink = uIImageWithLink.link;
            if (uILink != null) {
                if (!TextUtils.isEmpty(uILink.title)) {
                    ((TextView) view.findViewById(R.id.title)).setText(uIImageWithLink.link.title);
                }
                C6077k.o1t(view);
                view.setOnClickListener(new ViewOnClickListenerC2382k(uIImageWithLink));
            }
        }
        if (!item.getLastItem()) {
            this.f13863h.setVisibility(8);
            this.itemView.setPadding(0, 0, 0, this.f13865p);
        } else if (item.getFisrtCard()) {
            this.f13863h.setVisibility(0);
            this.itemView.setPadding(0, 0, 0, 0);
        } else {
            this.f13863h.setVisibility(8);
            this.itemView.setPadding(0, 0, 0, this.f13866s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIImageWithLink> it = ((WallpaperClassListItemElement) this.f9849q).getBanners().iterator();
        while (it.hasNext()) {
            UILink uILink = it.next().link;
            if (uILink != null) {
                arrayList.add(uILink.trackId);
            }
        }
        return arrayList;
    }
}
