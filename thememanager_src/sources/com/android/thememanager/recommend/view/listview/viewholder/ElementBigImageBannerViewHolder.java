package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.BigImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementBigImageBannerViewHolder extends BaseAdViewHolder<BigImageBannerElement> {

    /* JADX INFO: renamed from: s */
    private ImageView f13853s;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementBigImageBannerViewHolder$k */
    class ViewOnClickListenerC2380k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ BigImageBannerElement f13854k;

        ViewOnClickListenerC2380k(final BigImageBannerElement val$item) {
            this.f13854k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f13854k.getLink() != null) {
                C2451n.toq toqVarM8797g = C2451n.m8797g();
                toqVarM8797g.toq(this.f13854k.getLink().productType);
                ElementBigImageBannerViewHolder.this.m6706z().d8wk(this.f13854k.getLink().trackId, null);
                toqVarM8797g.x2(ElementBigImageBannerViewHolder.this.wvg().lvui());
                toqVarM8797g.m8804g(ElementBigImageBannerViewHolder.this.wvg().m8549l());
                toqVarM8797g.f7l8(ElementBigImageBannerViewHolder.this.wvg().n5r1());
                C2451n.m8803y(ElementBigImageBannerViewHolder.this.ki(), ElementBigImageBannerViewHolder.this.ni7(), this.f13854k.getLink(), toqVarM8797g);
            }
        }
    }

    public ElementBigImageBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f13853s = imageView;
        C6077k.fn3e(itemView, imageView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementBigImageBannerViewHolder m8604l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementBigImageBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_big_image, parent, false), adapter);
    }

    private void n5r1(final BigImageBannerElement item, int position) {
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), item.getImageUrl(), this.f13853s, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(com.android.thememanager.basemodule.imageloader.x2.n7h(position)));
        if (item.getLink() != null && item.getLink().title != null) {
            C1812k.toq(this.f13853s, item.getLink().title);
        }
        this.f13853s.setOnClickListener(new ViewOnClickListenerC2380k(item));
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(final BigImageBannerElement item, int position) {
        super.o1t(item, position);
        this.f13786g = item.getAdInfo();
        if (C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f13853s, 0, null, null, null, new Map[0])) {
            return;
        }
        n5r1(item, position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((BigImageBannerElement) this.f9849q).getLink() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((BigImageBannerElement) this.f9849q).getLink().trackId);
        return arrayList;
    }
}
