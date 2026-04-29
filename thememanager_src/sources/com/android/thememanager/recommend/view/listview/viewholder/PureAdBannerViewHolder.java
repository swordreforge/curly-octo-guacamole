package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.recommend.model.entity.element.AdPureBannerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.view.LightingAnimationTextView;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import y9n.C7780k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class PureAdBannerViewHolder extends DownloadAdViewHolder<AdPureBannerElement> implements InterfaceC1694q {

    /* JADX INFO: renamed from: a */
    private View f14231a;

    /* JADX INFO: renamed from: b */
    private TextView f14232b;

    /* JADX INFO: renamed from: c */
    private int f14233c;

    /* JADX INFO: renamed from: e */
    private SmoothFrameLayout2 f14234e;

    /* JADX INFO: renamed from: f */
    private View f14235f;

    /* JADX INFO: renamed from: j */
    private ImageView f14236j;

    /* JADX INFO: renamed from: l */
    private ImageView f14237l;

    /* JADX INFO: renamed from: m */
    private TextView f14238m;

    /* JADX INFO: renamed from: o */
    private TextView f14239o;

    /* JADX INFO: renamed from: x */
    private int f14240x;

    public PureAdBannerViewHolder(View itemView, RecommendListViewAdapter adapter, int adEid) {
        super(itemView, adapter, true, adEid);
        this.f14240x = adEid;
        this.f14231a = itemView;
        x9kr();
        if (this.f14240x != 0) {
            ncyb(itemView);
            return;
        }
        this.f14237l = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14235f = itemView.findViewById(R.id.ad_info_view);
        this.f13841i = (AdSubTextView) itemView.findViewById(R.id.ad_textview);
        this.f13844s = (TextView) itemView.findViewById(R.id.download_button);
        C6077k.o1t(this.f14237l);
    }

    /* JADX INFO: renamed from: c */
    private void m8740c() {
        n5r1(fn3e(), this.f14231a);
        C1653q.m6528p(ki(), this.f13786g, this.f14231a, this.f14236j, this.f14239o, this.f14238m, this.f14232b, 0, this.f13842p, this.f13840h, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100565a98o));
        C6077k.o1t(this.f14231a);
        C1812k.toq(this.f14231a, C1653q.x2(this.f13786g));
    }

    /* JADX INFO: renamed from: l */
    public static PureAdBannerViewHolder m8741l(ViewGroup parent, RecommendListViewAdapter adapter) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(adapter.fn3e());
        int i2 = C1724k.m6723p().ld6().wallpaper_detail_page_style;
        return new PureAdBannerViewHolder(i2 == 0 ? layoutInflaterFrom.inflate(R.layout.element_ad_banner_wallpaper, parent, false) : (i2 == 1 || i2 == 2) ? layoutInflaterFrom.inflate(R.layout.detail_ad_view, parent, false) : layoutInflaterFrom.inflate(R.layout.detail_ad_view_with_rank, parent, false), adapter, i2);
    }

    private void n5r1(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.de_detail_new_ad_card_edge_padding);
        float f2 = resources.getDisplayMetrics().widthPixels - (2.0f * dimension);
        int i2 = this.f14240x;
        if (i2 == 3 || i2 == 4) {
            view.getLayoutParams().height = (int) resources.getDimension(R.dimen.element_ad_banner_test_three_ad_container_view_height);
        }
        view.getLayoutParams().width = (int) f2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.zy) {
            StaggeredGridLayoutManager.zy zyVar = (StaggeredGridLayoutManager.zy) layoutParams;
            int i3 = (int) dimension;
            zyVar.setMarginStart(i3);
            zyVar.setMarginEnd(i3);
        }
    }

    private void ncyb(View itemView) {
        this.f14234e = (SmoothFrameLayout2) itemView.findViewById(R.id.app_icon_container);
        this.f14236j = (ImageView) itemView.findViewById(R.id.app_icon);
        this.f13842p = (TextView) itemView.findViewById(R.id.ad_title);
        this.f13840h = (TextView) itemView.findViewById(R.id.ad_subtitle);
        this.f13844s = (TextView) itemView.findViewById(R.id.download_button);
        this.f13841i = (AdSubTextView) itemView.findViewById(R.id.ad_textview);
        int i2 = this.f14240x;
        if (i2 == 1 || i2 == 2) {
            int dimensionPixelSize = itemView.getResources().getDimensionPixelSize(R.dimen.element_ad_detail_test_one_app_icon_radius);
            this.f14233c = dimensionPixelSize;
            this.f14234e.setCornerRadius(dimensionPixelSize);
        } else if (i2 == 3 || i2 == 4) {
            this.f14239o = (TextView) itemView.findViewById(R.id.ad_category);
            this.f14238m = (TextView) itemView.findViewById(R.id.download_num);
            this.f14232b = (TextView) itemView.findViewById(R.id.app_size);
            int dimensionPixelSize2 = itemView.getResources().getDimensionPixelSize(R.dimen.element_ad_detail_test_three_app_icon_radius);
            this.f14233c = dimensionPixelSize2;
            this.f14234e.setCornerRadius(dimensionPixelSize2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uv6() {
        /*
            r6 = this;
            androidx.fragment.app.q r0 = r6.ki()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r2 = 2131169222(0x7f070fc6, float:1.7952768E38)
            float r2 = r0.getDimension(r2)
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            float r1 = r1 - r2
            com.android.thememanager.basemodule.ad.model.AdInfo r2 = r6.f13786g
            if (r2 == 0) goto L2e
            float r3 = r2.height
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L2e
            float r2 = r2.width
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2e
            float r3 = r3 / r2
            float r3 = r3 * r1
            goto L35
        L2e:
            r2 = 2131169109(0x7f070f55, float:1.7952539E38)
            float r3 = r0.getDimension(r2)
        L35:
            android.widget.ImageView r0 = r6.f14237l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = (int) r3
            r0.height = r2
            android.widget.ImageView r0 = r6.f14237l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = (int) r1
            r0.width = r1
            android.view.View r0 = r6.f14235f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.PureAdBannerViewHolder.uv6():void");
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(AdPureBannerElement item, final int position) {
        this.f13786g = item.adInfo;
        super.o1t(item, position);
        if (this.f14240x != 0) {
            m8740c();
            return;
        }
        uv6();
        C1653q.m6530s(ki(), this.f13786g, this.f14235f, this.f14237l, 0, null, null, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100565a98o));
        C1812k.toq(this.f14237l, C1653q.x2(this.f13786g));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.DownloadAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        C1653q.m6526k(this);
        int i2 = this.f14240x;
        if (i2 == 2 || i2 == 4) {
            TextView textView = this.f13844s;
            if (textView instanceof LightingAnimationTextView) {
                ((LightingAnimationTextView) textView).n7h(1000);
            }
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.DownloadAdViewHolder, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        super.onDestroy(owner);
        C1653q.cdj(this);
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(String tagId) {
        if (this.f9848n < 0 || wvg().ni7().size() <= 0) {
            return;
        }
        wvg().ni7().remove(this.f9848n);
        wvg().notifyItemRemoved(this.f9848n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((AdPureBannerElement) this.f9849q).link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((AdPureBannerElement) this.f9849q).link.trackId);
        return arrayList;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.DownloadAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        C1653q.cdj(this);
    }
}
