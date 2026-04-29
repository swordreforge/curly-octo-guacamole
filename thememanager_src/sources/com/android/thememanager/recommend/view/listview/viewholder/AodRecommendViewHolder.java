package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.AodRecommendElement;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodRecommendViewHolder extends BaseViewHolder<AodRecommendElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f13768g;

    /* JADX INFO: renamed from: h */
    private float f13769h;

    /* JADX INFO: renamed from: i */
    private x2.C1735g f13770i;

    /* JADX INFO: renamed from: p */
    private FrameLayout f13771p;

    /* JADX INFO: renamed from: s */
    private TextView f13772s;

    /* JADX INFO: renamed from: y */
    private TextView f13773y;

    public AodRecommendViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13768g = (ImageView) itemView.findViewById(R.id.image);
        this.f13773y = (TextView) itemView.findViewById(android.R.id.title);
        this.f13772s = (TextView) itemView.findViewById(R.id.price);
        this.f13771p = (FrameLayout) itemView.findViewById(R.id.image_fl);
        Resources resources = ki().getResources();
        this.f13770i = com.android.thememanager.basemodule.imageloader.x2.fn3e();
        if (C1819o.d2ok(fn3e())) {
            this.f13770i.wvg(0);
        }
        if (wvg().x9kr() > 0) {
            this.f13769h = wvg().x9kr();
        } else {
            this.f13769h = resources.getDimension(R.dimen.detail_recommend_item_width);
        }
        if (com.android.thememanager.basemodule.utils.o1t.m7169g(fn3e())) {
            return;
        }
        C6077k.o1t(this.f13771p);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8574f(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1f
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r1 = 2
            if (r0 != r1) goto L1f
            r0 = 0
            r0 = r4[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 1
            r4 = r4[r1]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L23
        L1f:
            r0 = 9
            r4 = 16
        L23:
            android.widget.ImageView r1 = r3.f13768g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            float r2 = r3.f13769h
            int r2 = (int) r2
            r1.width = r2
            android.widget.ImageView r1 = r3.f13768g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            float r2 = r3.f13769h
            int r2 = (int) r2
            int r2 = r2 * r4
            int r2 = r2 / r0
            r1.height = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.AodRecommendViewHolder.m8574f(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8575l(UIImageWithLink uIImageWithLink, View view) {
        C2451n.toq toqVarM8810y = C2451n.m8797g().m8810y(uIImageWithLink.imageUrl);
        if (uIImageWithLink.link != null) {
            m6706z().d8wk(uIImageWithLink.link.trackId, null);
            toqVarM8810y.toq(uIImageWithLink.link.productType);
        }
        toqVarM8810y.x2(wvg().lvui());
        toqVarM8810y.m8804g(wvg().m8549l());
        toqVarM8810y.f7l8(wvg().n5r1());
        C2451n.m8803y(ki(), ni7(), uIImageWithLink.link, toqVarM8810y);
    }

    public static AodRecommendViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new AodRecommendViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_aod_item, parent, false), adapter);
    }

    private void uv6(UIImageBannerElement item) {
        UIImageWithLink imageBanner = item.getImageBanner();
        if (imageBanner == null) {
            return;
        }
        this.f13772s.setText(C1815m.toq(fn3e(), imageBanner.currentPriceInCent));
        this.f13772s.setVisibility(0);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void o1t(AodRecommendElement item, int position) {
        super.o1t(item, position);
        final UIImageWithLink imageBanner = item.getImageBanner();
        this.f13773y.setVisibility(0);
        UILink uILink = imageBanner.link;
        if (uILink != null) {
            this.f13773y.setText(uILink.title);
        }
        uv6(item);
        m8574f(imageBanner.snapshotAspectRatio);
        ViewGroup.LayoutParams layoutParams = this.f13768g.getLayoutParams();
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), imageBanner.imageUrl, this.f13768g, this.f13770i.m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb())).x9kr(layoutParams.width, layoutParams.height));
        (com.android.thememanager.basemodule.utils.o1t.m7169g(fn3e()) ? this.itemView : this.f13771p).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14404k.m8575l(imageBanner, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        UILink uILink = ((AodRecommendElement) this.f9849q).getImageBanner().link;
        if (uILink != null) {
            arrayList.add(uILink.trackId);
        }
        return arrayList;
    }
}
