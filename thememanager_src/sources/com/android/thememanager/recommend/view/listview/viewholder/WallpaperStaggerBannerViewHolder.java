package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.recommend.model.entity.element.StaggeredBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperStaggerBannerViewHolder extends BaseViewHolder<StaggeredBannerElement> {

    /* JADX INFO: renamed from: g */
    private int f14330g;

    /* JADX INFO: renamed from: y */
    private x2.C1735g f14331y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WallpaperStaggerBannerViewHolder$k */
    class ViewOnClickListenerC2433k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIImageWithLink f14332k;

        ViewOnClickListenerC2433k(final UIImageWithLink val$uiImageWithLink) {
            this.f14332k = val$uiImageWithLink;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            toqVarM8797g.m8807p(this.f14332k.index);
            toqVarM8797g.m8810y(this.f14332k.imageUrl);
            toqVarM8797g.toq(this.f14332k.link.productType);
            toqVarM8797g.x2(WallpaperStaggerBannerViewHolder.this.wvg().lvui());
            toqVarM8797g.m8804g(WallpaperStaggerBannerViewHolder.this.wvg().m8549l());
            toqVarM8797g.f7l8(WallpaperStaggerBannerViewHolder.this.wvg().n5r1());
            C2451n.m8803y(WallpaperStaggerBannerViewHolder.this.ki(), WallpaperStaggerBannerViewHolder.this.ni7(), this.f14332k.link, toqVarM8797g);
            if (this.f14332k.link != null) {
                WallpaperStaggerBannerViewHolder.this.m6706z().d8wk(this.f14332k.link.trackId, null);
            }
        }
    }

    public WallpaperStaggerBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14330g = fn3e().getResources().getDimensionPixelSize(R.dimen.wallpaper_category_height);
        m8776l();
    }

    /* JADX INFO: renamed from: l */
    private void m8776l() {
        this.f14331y = com.android.thememanager.basemodule.imageloader.x2.fn3e();
    }

    public static WallpaperStaggerBannerViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WallpaperStaggerBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_wallpaper_staggered_item_banner, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(StaggeredBannerElement item, int position) {
        super.o1t(item, position);
        ViewGroup viewGroup = (ViewGroup) this.itemView;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        UIImageWithLink imageBanner = item.getImageBanner();
        if (TextUtils.isEmpty(imageBanner.link.adTagId)) {
            layoutParams.height = this.f14330g;
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.image);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), imageBanner.imageUrl, imageView, this.f14331y.gvn7(com.android.thememanager.basemodule.imageloader.x2.kja0(position)));
            imageView.setOnClickListener(new ViewOnClickListenerC2433k(imageBanner));
            C6077k.o1t(imageView);
        } else {
            layoutParams.height = 0;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((StaggeredBannerElement) this.f9849q).getImageBanner().link.trackId);
        return arrayList;
    }
}
