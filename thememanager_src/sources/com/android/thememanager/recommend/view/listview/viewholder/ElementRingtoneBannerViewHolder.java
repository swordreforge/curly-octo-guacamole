package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.RingtoneTopBannerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRingtoneBannerViewHolder extends BaseViewHolder<RingtoneTopBannerElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f13984g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRingtoneBannerViewHolder$k */
    class ViewOnClickListenerC2394k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RingtoneTopBannerElement f13985k;

        ViewOnClickListenerC2394k(final RingtoneTopBannerElement val$element) {
            this.f13985k = val$element;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ElementRingtoneBannerViewHolder.this.jk(this.f13985k.getSubjectUuid(), this.f13985k.getTitle());
            ElementRingtoneBannerViewHolder.this.m6706z().d8wk(this.f13985k.getTrackId(), null);
        }
    }

    public ElementRingtoneBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13984g = (ImageView) itemView.findViewById(R.id.top_image);
        C6077k.a9(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementRingtoneBannerViewHolder m8642l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRingtoneBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_ringtone_banner, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final RingtoneTopBannerElement element, int position) {
        super.o1t(element, position);
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), element.getTopBannerImageUrl(), this.f13984g, com.android.thememanager.basemodule.imageloader.x2.fn3e().wvg(0).m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb())));
        this.itemView.setOnClickListener(new ViewOnClickListenerC2394k(element));
        C1812k.toq(this.itemView, element.getTitle());
    }
}
