package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.AsyncTaskC1733q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.TopBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.widget.ConvenientBanner;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import ek5k.C6002g;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import miuix.smooth.SmoothFrameLayout2;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementTopBannerViewHolder extends BaseViewHolder<TopBannerElement> implements AsyncTaskC1733q.k {

    /* JADX INFO: renamed from: g */
    private ConvenientBanner f14079g;

    /* JADX INFO: renamed from: y */
    private UIElement f14080y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementTopBannerViewHolder$k */
    class RunnableC2406k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f14081k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f14083q;

        RunnableC2406k(final List val$imageList, final int val$position) {
            this.f14081k = val$imageList;
            this.f14083q = val$position;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f14081k;
            if (list == null || list.isEmpty()) {
                return;
            }
            int iAbs = Math.abs(this.f14083q) % this.f14081k.size();
            UILink uILink = ((UIImageWithLink) this.f14081k.get(iAbs)).link;
            if (uILink == null) {
                return;
            }
            ElementTopBannerViewHolder.this.m6706z().n5r1(uILink.trackId);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f14081k.size(); i2++) {
                if (i2 != this.f14083q) {
                    arrayList.add(((UIImageWithLink) this.f14081k.get(i2)).link.trackId);
                }
            }
            AdInfo adInfo = ((UIImageWithLink) this.f14081k.get(iAbs)).getAdInfo();
            if (adInfo != null) {
                C1708s.f7l8().x2(4001).fti(adInfo);
            }
            ElementTopBannerViewHolder.this.m6706z().x9kr(arrayList);
        }
    }

    class toq implements ViewPager.InterfaceC1284p {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f14084k;

        toq(final List val$imageList) {
            this.f14084k = val$imageList;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int position) {
            ElementTopBannerViewHolder.this.vyq(this.f14084k, position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    class zy implements ConvenientBanner.InterfaceC2455n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f14086k;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementTopBannerViewHolder$zy$k */
        class ViewOnClickListenerC2407k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIImageWithLink f14087k;

            ViewOnClickListenerC2407k(final UIImageWithLink val$uiImageWithLink) {
                this.f14087k = val$uiImageWithLink;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                C2451n.toq toqVarZy = C2451n.zy(ElementTopBannerViewHolder.this.wvg());
                toqVarZy.m8806n("widget_suit".equals(ElementTopBannerViewHolder.this.wvg().lvui()));
                C2451n.m8803y(ElementTopBannerViewHolder.this.ki(), ElementTopBannerViewHolder.this.ni7(), this.f14087k.link, toqVarZy);
                if (this.f14087k.link != null) {
                    ElementTopBannerViewHolder.this.m6706z().d8wk(this.f14087k.link.trackId, null);
                }
            }
        }

        zy(final List val$imageList) {
            this.f14086k = val$imageList;
        }

        @Override // com.android.thememanager.recommend.view.widget.ConvenientBanner.InterfaceC2455n
        /* JADX INFO: renamed from: k */
        public View mo8686k(Context context, int position, Object object) {
            int dimension = (int) ElementTopBannerViewHolder.this.fn3e().getResources().getDimension(R.dimen.stagger_divider);
            if (ElementTopBannerViewHolder.this.wvg().d2ok() == 1) {
                dimension *= 2;
            }
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.rc_loop_banner_layout, (ViewGroup) ElementTopBannerViewHolder.this.itemView, false);
            ElementTopBannerViewHolder.this.f14079g.setPadding(dimension, 0, dimension, 0);
            SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) viewInflate.findViewById(R.id.thumbnail);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.content_wallpaper);
            C6077k.wvg(smoothFrameLayout2, imageView);
            View viewFindViewById = viewInflate.findViewById(R.id.ad_info_view);
            UIImageWithLink uIImageWithLink = (UIImageWithLink) this.f14086k.get(position);
            AdInfo adInfo = uIImageWithLink.getAdInfo();
            if (C1653q.m6530s(ElementTopBannerViewHolder.this.ki(), adInfo, viewFindViewById, imageView, (int) ElementTopBannerViewHolder.this.ki().getResources().getDimension(R.dimen.round_corner_default), null, null, null, new Map[0])) {
                ((TextView) viewInflate.findViewById(R.id.download_tip)).setVisibility(8);
                C1812k.toq(imageView, C1653q.x2(adInfo));
            } else {
                imageView.setTag(((UIImageWithLink) this.f14086k.get(position)).imageUrl);
                imageView.setImageDrawable(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f));
                if (p029m.zy.toq(((UIImageWithLink) this.f14086k.get(position)).imageUrl) || !((UIImageWithLink) this.f14086k.get(position)).imageUrl.contains("gif")) {
                    new AsyncTaskC1733q(((UIImageWithLink) this.f14086k.get(position)).imageUrl, Bitmap.Config.RGB_565, ElementTopBannerViewHolder.this.itemView.getWidth(), ElementTopBannerViewHolder.this.itemView.getHeight(), 2, ElementTopBannerViewHolder.this, null, false).toq();
                } else {
                    com.android.thememanager.basemodule.imageloader.x2.m6782y(ElementTopBannerViewHolder.this.ki(), ((UIImageWithLink) this.f14086k.get(position)).imageUrl, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().jk(2).m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)));
                }
                imageView.setOnClickListener(new ViewOnClickListenerC2407k(uIImageWithLink));
                C1812k.toq(imageView, uIImageWithLink.link.title);
            }
            return viewInflate;
        }
    }

    public ElementTopBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14079g = (ConvenientBanner) itemView.findViewById(R.id.banner);
        x9kr();
    }

    public static ElementTopBannerViewHolder uv6(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementTopBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_top_banner, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vyq(@dd List<UIImageWithLink> imageList, int position) {
        C6002g.ld6().execute(new RunnableC2406k(imageList, position));
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void o1t(final TopBannerElement item, int position) {
        super.o1t(item, position);
        if (item.equals(this.f14080y)) {
            return;
        }
        this.f14080y = item;
        List<UIImageWithLink> banners = item.getBanners();
        if (banners != null) {
            for (int i2 = 0; i2 < banners.size(); i2++) {
                UIImageWithLink uIImageWithLink = banners.get(i2);
                if (uIImageWithLink != null && uIImageWithLink.adInfo != null) {
                    this.f14079g.x2(i2);
                }
            }
            this.f14079g.setOnPageChangeListener(new toq(banners));
            this.f14079g.setBannerData(banners, new zy(banners));
            if (m6706z().getLifecycle().toq().isAtLeast(kja0.zy.STARTED)) {
                this.f14079g.fn3e();
            } else {
                this.f14079g.zurt();
            }
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1721s
    public void jp0y(@lvui InterfaceC0954z owner) {
        super.jp0y(owner);
        ConvenientBanner convenientBanner = this.f14079g;
        if (convenientBanner != null) {
            convenientBanner.cdj();
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1721s
    public void ktq(@lvui InterfaceC0954z owner) {
        super.ktq(owner);
        boolean z2 = (owner instanceof com.android.thememanager.basemodule.base.toq) && ((com.android.thememanager.basemodule.base.toq) owner).getUserVisibleHint();
        ConvenientBanner convenientBanner = this.f14079g;
        if (convenientBanner != null && convenientBanner.isAttachedToWindow() && z2 && this.f14079g.ki() && !this.f14079g.kja0()) {
            vyq(fu4().getBanners(), this.f14079g.getCurrentItem());
        }
    }

    @Override // com.android.thememanager.basemodule.imageloader.AsyncTaskC1733q.k
    public void ld6(String key, Bitmap bitmap) {
        View[] currentView;
        if (bitmap == null || (currentView = this.f14079g.getCurrentView()) == null || currentView.length <= 0) {
            return;
        }
        for (View view : currentView) {
            ImageView imageView = (ImageView) view.findViewById(R.id.content_wallpaper);
            if (imageView != null && key != null && key.equals(imageView.getTag())) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        if (this.f14079g == null || !m6706z().getLifecycle().toq().isAtLeast(kja0.zy.STARTED)) {
            return;
        }
        this.f14079g.ki();
        vyq(fu4().getBanners(), this.f14079g.getCurrentItem());
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        ConvenientBanner convenientBanner = this.f14079g;
        if (convenientBanner != null) {
            convenientBanner.m8826h();
        }
        super.onDestroy(owner);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@lvui InterfaceC0954z owner) {
        super.onStart(owner);
        ConvenientBanner convenientBanner = this.f14079g;
        if (convenientBanner != null) {
            convenientBanner.fn3e();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@lvui InterfaceC0954z owner) {
        super.onStop(owner);
        ConvenientBanner convenientBanner = this.f14079g;
        if (convenientBanner != null) {
            convenientBanner.zurt();
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        ConvenientBanner convenientBanner = this.f14079g;
        if (convenientBanner != null) {
            convenientBanner.cdj();
        }
    }
}
