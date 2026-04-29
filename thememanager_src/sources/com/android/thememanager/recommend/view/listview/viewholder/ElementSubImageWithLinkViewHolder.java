package com.android.thememanager.recommend.view.listview.viewholder;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSubImageWithLinkViewHolder extends BaseViewHolder<UIImageWithLink> {

    /* JADX INFO: renamed from: s */
    private static final String f14060s = "ElementSubImageWithLinkViewHolder";

    /* JADX INFO: renamed from: g */
    private ImageView f14061g;

    /* JADX INFO: renamed from: y */
    private int f14062y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSubImageWithLinkViewHolder$k */
    class ViewOnClickListenerC2403k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIImageWithLink f14063k;

        ViewOnClickListenerC2403k(final UIImageWithLink val$resource) {
            this.f14063k = val$resource;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            UILink uILink;
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            UILink uILink2 = this.f14063k.link;
            if (uILink2 != null) {
                toqVarM8797g.toq(uILink2.productType);
                ElementSubImageWithLinkViewHolder.this.m6706z().d8wk(this.f14063k.link.trackId, null);
            }
            toqVarM8797g.x2(ElementSubImageWithLinkViewHolder.this.wvg().lvui());
            toqVarM8797g.m8804g(ElementSubImageWithLinkViewHolder.this.wvg().m8549l());
            toqVarM8797g.f7l8(ElementSubImageWithLinkViewHolder.this.wvg().n5r1());
            UIImageWithLink uIImageWithLink = this.f14063k;
            if (uIImageWithLink == null || (uILink = uIImageWithLink.link) == null) {
                Log.w(ElementSubImageWithLinkViewHolder.f14060s, "could not fill field: productId, because the link field in UILink is empty.");
            } else {
                toqVarM8797g.ld6(uILink.link);
            }
            C2451n.m8803y(ElementSubImageWithLinkViewHolder.this.ki(), ElementSubImageWithLinkViewHolder.this.ni7(), this.f14063k.link, toqVarM8797g);
        }
    }

    public ElementSubImageWithLinkViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14061g = (ImageView) itemView;
        this.f14062y = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_recommend_three_img_radius);
        C6077k.o1t(this.f14061g);
    }

    private void n5r1(UIImageWithLink resource, int position) {
        if (this.f14061g == null) {
            return;
        }
        com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), resource.imageUrl, this.f14061g, com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f14062y, wvg().ncyb()), this.f14062y);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(final UIImageWithLink resource, int position) {
        super.o1t(resource, position);
        n5r1(resource, position);
        this.f14061g.setOnClickListener(new ViewOnClickListenerC2403k(resource));
        C1812k.toq(this.f14061g, resource.link.title);
    }
}
