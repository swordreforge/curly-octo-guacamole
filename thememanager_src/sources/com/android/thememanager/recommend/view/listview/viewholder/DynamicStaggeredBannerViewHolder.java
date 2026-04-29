package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DynamicStaggeredBannerViewHolder extends BaseViewHolder<DynamicStaggeredBannerElement> {

    /* JADX INFO: renamed from: g */
    protected int f13847g;

    /* JADX INFO: renamed from: s */
    private ImageView f13848s;

    /* JADX INFO: renamed from: y */
    protected int f13849y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.DynamicStaggeredBannerViewHolder$k */
    class ViewOnClickListenerC2379k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIImageWithLink f13850k;

        ViewOnClickListenerC2379k(final UIImageWithLink val$uiImageWithLink) {
            this.f13850k = val$uiImageWithLink;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            toqVarM8797g.m8807p(this.f13850k.index);
            toqVarM8797g.toq(this.f13850k.link.productType);
            toqVarM8797g.x2(TextUtils.isEmpty(this.f13850k.link.productType) ? DynamicStaggeredBannerViewHolder.this.wvg().lvui() : com.android.thememanager.v9.zy.toq(this.f13850k.link.productType));
            toqVarM8797g.m8804g(DynamicStaggeredBannerViewHolder.this.wvg().m8549l());
            toqVarM8797g.f7l8(DynamicStaggeredBannerViewHolder.this.wvg().n5r1());
            C2451n.m8803y(DynamicStaggeredBannerViewHolder.this.ki(), DynamicStaggeredBannerViewHolder.this.ni7(), this.f13850k.link, toqVarM8797g);
            if (this.f13850k.link != null) {
                DynamicStaggeredBannerViewHolder.this.m6706z().d8wk(this.f13850k.link.trackId, null);
            }
        }
    }

    public DynamicStaggeredBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13848s = (ImageView) itemView.findViewById(R.id.image);
        C6077k.o1t(itemView);
    }

    /* JADX INFO: renamed from: l */
    private ViewGroup.LayoutParams m8601l(int imageOriginalWidth, int imageOriginalHeight) {
        int iX9kr = wvg().x9kr();
        this.f13847g = iX9kr;
        this.f13849y = (int) (iX9kr * (imageOriginalHeight / imageOriginalWidth));
        ViewGroup.LayoutParams layoutParams = this.f13848s.getLayoutParams();
        layoutParams.height = this.f13849y;
        layoutParams.width = this.f13847g;
        this.f13848s.setLayoutParams(layoutParams);
        return layoutParams;
    }

    public static DynamicStaggeredBannerViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new DynamicStaggeredBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_wallpaper_staggered_item_banner, parent, false), adapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o1t(com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement r7, int r8) {
        /*
            r6 = this;
            super.o1t(r7, r8)
            com.android.thememanager.router.recommend.entity.UIImageWithLink r7 = r7.getImageBanner()
            java.lang.String r0 = r7.snapshotAspectRatio
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L28
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L28
            r1 = 0
            r1 = r0[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            r2 = 1
            r0 = r0[r2]
            int r0 = java.lang.Integer.parseInt(r0)
            goto L2c
        L28:
            r1 = 490(0x1ea, float:6.87E-43)
            r0 = 200(0xc8, float:2.8E-43)
        L2c:
            android.view.ViewGroup$LayoutParams r0 = r6.m8601l(r1, r0)
            androidx.fragment.app.q r1 = r6.ki()
            java.lang.String r2 = r7.imageUrl
            android.widget.ImageView r3 = r6.f13848s
            com.android.thememanager.basemodule.imageloader.x2$g r4 = com.android.thememanager.basemodule.imageloader.x2.fn3e()
            int r5 = r0.width
            int r0 = r0.height
            com.android.thememanager.basemodule.imageloader.x2$g r0 = r4.x9kr(r5, r0)
            r4 = 0
            com.android.thememanager.recommend.view.listview.RecommendListViewAdapter r5 = r6.wvg()
            boolean r5 = r5.ncyb()
            android.graphics.drawable.Drawable r8 = com.android.thememanager.basemodule.imageloader.x2.t8r(r8, r4, r5)
            com.android.thememanager.basemodule.imageloader.x2$g r8 = r0.m6793r(r8)
            com.android.thememanager.basemodule.imageloader.x2.m6782y(r1, r2, r3, r8)
            android.view.View r8 = r6.itemView
            com.android.thememanager.recommend.view.listview.viewholder.DynamicStaggeredBannerViewHolder$k r0 = new com.android.thememanager.recommend.view.listview.viewholder.DynamicStaggeredBannerViewHolder$k
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            android.widget.ImageView r8 = r6.f13848s
            com.android.thememanager.router.recommend.entity.UILink r7 = r7.link
            java.lang.String r7 = r7.title
            com.android.thememanager.basemodule.utils.C1812k.toq(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.DynamicStaggeredBannerViewHolder.o1t(com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((DynamicStaggeredBannerElement) this.f9849q).getImageBanner() == null || ((DynamicStaggeredBannerElement) this.f9849q).getImageBanner().link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((DynamicStaggeredBannerElement) this.f9849q).getImageBanner().link.trackId);
        return arrayList;
    }
}
