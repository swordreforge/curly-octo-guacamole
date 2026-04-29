package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.widget.TagUIContainer;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class StaggerViewHolder<T extends UIImageBannerElement> extends BaseViewHolder<T> {

    /* JADX INFO: renamed from: g */
    protected int f14262g;

    /* JADX INFO: renamed from: h */
    protected ImageView f14263h;

    /* JADX INFO: renamed from: i */
    protected x2.C1735g f14264i;

    /* JADX INFO: renamed from: p */
    protected ViewGroup f14265p;

    /* JADX INFO: renamed from: r */
    private TagUIContainer f14266r;

    /* JADX INFO: renamed from: s */
    protected View f14267s;

    /* JADX INFO: renamed from: t */
    protected UIImageWithLink f14268t;

    /* JADX INFO: renamed from: y */
    protected float f14269y;

    /* JADX INFO: renamed from: z */
    protected List<String> f14270z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder$k */
    class C2425k implements TagUIContainer.toq {
        C2425k() {
        }

        @Override // com.android.thememanager.recommend.view.widget.TagUIContainer.toq
        /* JADX INFO: renamed from: k */
        public void mo8755k(int position) {
            UILink uILink = new UILink();
            uILink.link = StaggerViewHolder.this.f14270z.get(position);
            uILink.title = StaggerViewHolder.this.f14270z.get(position);
            uILink.type = "SEARCH";
            C2451n.toq qVar = C2451n.m8797g().toq(StaggerViewHolder.this.f14268t.link.productType);
            qVar.m8808q(true);
            qVar.x2(StaggerViewHolder.this.wvg().lvui());
            qVar.m8804g(StaggerViewHolder.this.wvg().m8549l());
            qVar.f7l8(StaggerViewHolder.this.wvg().n5r1());
            C2451n.m8803y(StaggerViewHolder.this.ki(), StaggerViewHolder.this.ni7(), uILink, qVar);
        }
    }

    public StaggerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14262g = 0;
        this.f14270z = new ArrayList();
        if (mcp()) {
            this.f14269y = ki().getResources().getDimension(R.dimen.wallpaper_wallpaper_width_setting);
        } else if (wvg().x9kr() > 0) {
            this.f14269y = wvg().x9kr();
        } else {
            this.f14269y = ki().getResources().getDimension(R.dimen.wallpaper_wallpaper_width);
        }
        ViewGroup viewGroup = (ViewGroup) itemView;
        this.f14265p = viewGroup;
        this.f14263h = (ImageView) viewGroup.findViewById(R.id.image);
        this.f14267s = this.f14265p.findViewById(R.id.image_container);
        this.f14266r = (TagUIContainer) this.f14265p.findViewById(R.id.tag_ui_container);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: ncyb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o1t(T r7, int r8) {
        /*
            r6 = this;
            super.o1t(r7, r8)
            com.android.thememanager.router.recommend.entity.UIImageWithLink r7 = r7.getImageBanner()
            r6.f14268t = r7
            java.util.List<java.lang.String> r7 = r7.tags
            r0 = 0
            if (r7 == 0) goto L27
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L27
            com.android.thememanager.router.recommend.entity.UIImageWithLink r7 = r6.f14268t
            java.util.List<java.lang.String> r7 = r7.tags
            r6.f14270z = r7
            com.android.thememanager.recommend.view.widget.TagUIContainer r7 = r6.f14266r
            r7.setVisibility(r0)
            com.android.thememanager.recommend.view.widget.TagUIContainer r7 = r6.f14266r
            java.util.List<java.lang.String> r1 = r6.f14270z
            r7.toq(r1)
            goto L2e
        L27:
            com.android.thememanager.recommend.view.widget.TagUIContainer r7 = r6.f14266r
            r1 = 8
            r7.setVisibility(r1)
        L2e:
            com.android.thememanager.recommend.view.widget.TagUIContainer r7 = r6.f14266r
            com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder$k r1 = new com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder$k
            r1.<init>()
            r7.setOnTagItemClickListener(r1)
            android.widget.ImageView r7 = r6.f14263h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            com.android.thememanager.router.recommend.entity.UIImageWithLink r1 = r6.f14268t
            java.lang.String r1 = r1.snapshotAspectRatio
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 16
            r4 = 9
            if (r2 != 0) goto L64
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r5 = 2
            if (r2 != r5) goto L64
            r0 = r1[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2 = 1
            r1 = r1[r2]
            int r1 = java.lang.Integer.parseInt(r1)
            goto L66
        L64:
            r1 = r3
            r0 = r4
        L66:
            com.android.thememanager.router.recommend.entity.UIImageWithLink r2 = r6.f14268t
            com.android.thememanager.router.recommend.entity.UILink r2 = r2.link
            java.lang.String r2 = r2.productType
            java.lang.String r5 = "FONT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L77
            if (r0 <= r1) goto L77
            goto L79
        L77:
            r4 = r0
            r3 = r1
        L79:
            float r0 = r6.f14269y
            int r0 = (int) r0
            int r0 = r0 * r3
            int r0 = r0 / r4
            int r1 = r7.height
            if (r0 == r1) goto L89
            r7.height = r0
            android.widget.ImageView r0 = r6.f14263h
            r0.setLayoutParams(r7)
        L89:
            android.widget.ImageView r0 = r6.f14263h
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r1)
            com.android.thememanager.basemodule.imageloader.x2$g r0 = com.android.thememanager.basemodule.imageloader.x2.fn3e()
            r1 = 0
            com.android.thememanager.recommend.view.listview.RecommendListViewAdapter r2 = r6.wvg()
            boolean r2 = r2.ncyb()
            android.graphics.drawable.Drawable r8 = com.android.thememanager.basemodule.imageloader.x2.t8r(r8, r1, r2)
            com.android.thememanager.basemodule.imageloader.x2$g r8 = r0.m6793r(r8)
            float r0 = r6.f14269y
            int r0 = (int) r0
            int r7 = r7.height
            com.android.thememanager.basemodule.imageloader.x2$g r7 = r8.x9kr(r0, r7)
            r8 = 3
            com.android.thememanager.basemodule.imageloader.x2$g r7 = r7.jk(r8)
            r6.f14264i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder.o1t(com.android.thememanager.recommend.model.entity.element.UIImageBannerElement, int):void");
    }
}
