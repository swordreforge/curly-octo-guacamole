package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.ImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSingleImageViewHolder extends BaseAdViewHolder<ImageBannerElement> {

    /* JADX INFO: renamed from: s */
    private ImageView f14057s;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSingleImageViewHolder$k */
    class ViewOnClickListenerC2402k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ImageBannerElement f14058k;

        ViewOnClickListenerC2402k(final ImageBannerElement val$item) {
            this.f14058k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            if (this.f14058k.getLink() != null) {
                toqVarM8797g.toq(this.f14058k.getLink().productType);
                ElementSingleImageViewHolder.this.m6706z().d8wk(this.f14058k.getLink().trackId, null);
            }
            toqVarM8797g.x2(ElementSingleImageViewHolder.this.wvg().lvui());
            toqVarM8797g.m8804g(ElementSingleImageViewHolder.this.wvg().m8549l());
            toqVarM8797g.f7l8(ElementSingleImageViewHolder.this.wvg().n5r1());
            C2451n.m8803y(ElementSingleImageViewHolder.this.ki(), ElementSingleImageViewHolder.this.ni7(), this.f14058k.getLink(), toqVarM8797g);
        }
    }

    public ElementSingleImageViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14057s = imageView;
        C6077k.o1t(imageView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementSingleImageViewHolder m8672l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSingleImageViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_image, parent, false), adapter);
    }

    private void n5r1(final ImageBannerElement item, int position) {
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), item.getImageUrl(), this.f14057s, com.android.thememanager.basemodule.imageloader.x2.fn3e().wvg(0).m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb())));
        if (item.getLink() != null && item.getLink().title != null) {
            C1812k.toq(this.f14057s, item.getLink().title);
        }
        this.f14057s.setOnClickListener(new ViewOnClickListenerC2402k(item));
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(final ImageBannerElement item, int position) {
        super.o1t(item, position);
        this.f13786g = item.getAdInfo();
        if (C1653q.m6530s(ki(), this.f13786g, this.f13787y, this.f14057s, 0, null, null, null, new Map[0])) {
            return;
        }
        n5r1(item, position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((ImageBannerElement) this.f9849q).getLink() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ImageBannerElement) this.f9849q).getLink().trackId);
        return arrayList;
    }
}
