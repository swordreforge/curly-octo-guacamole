package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.RankDetailTopImageElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRankDetailTopImageViewHolder extends BaseAdViewHolder<RankDetailTopImageElement> {

    /* JADX INFO: renamed from: p */
    private int f13937p;

    /* JADX INFO: renamed from: s */
    private ImageView f13938s;

    public ElementRankDetailTopImageViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13938s = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f13937p = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
    }

    public static ElementRankDetailTopImageViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRankDetailTopImageViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_rank_detail_top_image, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(final RankDetailTopImageElement item, int position) {
        super.o1t(item, position);
        com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), item.getTopBannerImageUrl(), this.f13938s, com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13937p, wvg().ncyb()), this.f13937p);
    }
}
