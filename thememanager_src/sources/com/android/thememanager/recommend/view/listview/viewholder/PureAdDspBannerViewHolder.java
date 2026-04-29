package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.recommend.model.entity.element.AdPureDspBannerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import y9n.C7780k;

/* JADX INFO: compiled from: PureAdDspBannerViewHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PureAdDspBannerViewHolder extends DownloadAdViewHolder<AdPureDspBannerElement> implements InterfaceC1694q {

    /* JADX INFO: renamed from: c */
    @InterfaceC7396q
    public static final C2424k f14241c = new C2424k(null);

    /* JADX INFO: renamed from: f */
    private final int f14242f;

    /* JADX INFO: renamed from: l */
    @InterfaceC7396q
    private final ImageView f14243l;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.PureAdDspBannerViewHolder$k */
    /* JADX INFO: compiled from: PureAdDspBannerViewHolder.kt */
    public static final class C2424k {
        private C2424k() {
        }

        public /* synthetic */ C2424k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final PureAdDspBannerViewHolder m8744k(@InterfaceC7395n ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter adapter) {
            d2ok.m23075h(adapter, "adapter");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(adapter.fn3e());
            d2ok.kja0(layoutInflaterFrom, "from(...)");
            View viewInflate = layoutInflaterFrom.inflate(R.layout.element_ad_detail_dsp_banner, viewGroup, false);
            d2ok.kja0(viewInflate, "inflate(...)");
            return new PureAdDspBannerViewHolder(viewInflate, adapter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PureAdDspBannerViewHolder(@InterfaceC7396q View itemView, @InterfaceC7396q RecommendListViewAdapter adapter) {
        super(itemView, adapter, true);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
        x9kr();
        View viewFindViewById = itemView.findViewById(R.id.thumbnail);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f14243l = imageView;
        this.f13787y = itemView.findViewById(R.id.ad_info_view);
        this.f14242f = itemView.getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        this.f13841i = (AdSubTextView) itemView.findViewById(R.id.ad_textview);
        this.f13844s = (TextView) itemView.findViewById(R.id.download_button);
        this.f13842p = (TextView) itemView.findViewById(R.id.ad_title);
        this.f13840h = (TextView) itemView.findViewById(R.id.ad_subtitle);
        C6077k.o1t(imageView);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final PureAdDspBannerViewHolder ncyb(@InterfaceC7395n ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter recommendListViewAdapter) {
        return f14241c.m8744k(viewGroup, recommendListViewAdapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(@InterfaceC7395n AdPureDspBannerElement adPureDspBannerElement, int i2) {
        super.o1t(adPureDspBannerElement, i2);
        this.f13786g = adPureDspBannerElement != null ? adPureDspBannerElement.getAdInfo() : null;
        n5r1();
        C1653q.m6530s(ki(), this.f13786g, this.itemView, this.f14243l, this.f14242f, this.f13842p, this.f13840h, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100571ek5k));
        C1812k.toq(this.f14243l, C1653q.x2(this.f13786g));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.DownloadAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        C1653q.m6526k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n5r1() {
        /*
            r8 = this;
            androidx.fragment.app.q r0 = r8.ki()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "getResources(...)"
            kotlin.jvm.internal.d2ok.kja0(r0, r1)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r2 = 2
            float r2 = (float) r2
            r3 = 2131166108(0x7f07039c, float:1.7946452E38)
            float r3 = r0.getDimension(r3)
            float r2 = r2 * r3
            float r1 = r1 - r2
            com.android.thememanager.basemodule.ad.model.AdInfo r2 = r8.f13786g
            if (r2 == 0) goto L3e
            float r3 = r2.height
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L2e
            r5 = r6
            goto L2f
        L2e:
            r5 = r7
        L2f:
            if (r5 != 0) goto L3e
            float r2 = r2.width
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L38
            goto L39
        L38:
            r6 = r7
        L39:
            if (r6 != 0) goto L3e
            float r3 = r3 / r2
            float r3 = r3 * r1
            goto L45
        L3e:
            r2 = 2131169109(0x7f070f55, float:1.7952539E38)
            float r3 = r0.getDimension(r2)
        L45:
            android.widget.ImageView r0 = r8.f14243l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = (int) r3
            r0.height = r2
            android.widget.ImageView r0 = r8.f14243l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = (int) r1
            r0.width = r1
            android.view.View r0 = r8.f13787y
            if (r0 == 0) goto L61
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.PureAdDspBannerViewHolder.n5r1():void");
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.DownloadAdViewHolder, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@InterfaceC7396q InterfaceC0954z owner) {
        d2ok.m23075h(owner, "owner");
        super.onDestroy(owner);
        C1653q.cdj(this);
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(@InterfaceC7395n String str) {
        if (this.f9848n < 0 || wvg().ni7().size() <= 0) {
            return;
        }
        wvg().ni7().remove(this.f9848n);
        wvg().notifyItemRemoved(this.f9848n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    @InterfaceC7395n
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        UILink link;
        AdPureDspBannerElement adPureDspBannerElement = (AdPureDspBannerElement) this.f9849q;
        String str = (adPureDspBannerElement == null || (link = adPureDspBannerElement.getLink()) == null) ? null : link.trackId;
        if (str == null) {
            return null;
        }
        return kotlin.collections.zurt.ld6(str);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.DownloadAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        C1653q.cdj(this);
    }
}
