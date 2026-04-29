package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.SettingStaggerLocalBannerGroupElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIDrawableWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class SettingStaggerLocalBannerGroupViewHolder extends BaseViewHolder<SettingStaggerLocalBannerGroupElement> {

    /* JADX INFO: renamed from: g */
    private LinearLayout f14259g;

    /* JADX INFO: renamed from: s */
    private int f14260s;

    /* JADX INFO: renamed from: y */
    private int f14261y;

    public SettingStaggerLocalBannerGroupViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14259g = (LinearLayout) itemView.findViewById(R.id.container);
        Resources resources = itemView.getResources();
        this.f14261y = resources.getDimensionPixelSize(R.dimen.setting_stagger_local_banner_height);
        this.f14260s = resources.getDimensionPixelSize(R.dimen.setting_stagger_local_banner_gap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8753l(UIDrawableWithLink uIDrawableWithLink, View view) {
        C2451n.toq toqVarM8797g = C2451n.m8797g();
        toqVarM8797g.toq(uIDrawableWithLink.link.productType);
        toqVarM8797g.x2(wvg().lvui());
        toqVarM8797g.m8804g(wvg().m8549l());
        toqVarM8797g.f7l8(wvg().n5r1());
        C2451n.m8803y(ki(), ni7(), uIDrawableWithLink.link, toqVarM8797g);
        if (uIDrawableWithLink.link != null) {
            m6706z().d8wk(uIDrawableWithLink.link.trackId, null);
        }
    }

    public static SettingStaggerLocalBannerGroupViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new SettingStaggerLocalBannerGroupViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_setting_stagger_local_banner_group, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(SettingStaggerLocalBannerGroupElement item, int position) {
        super.o1t(item, position);
        if (com.android.thememanager.basemodule.utils.kja0.qrj(item.mBanners)) {
            return;
        }
        this.f14259g.removeAllViews();
        for (int i2 = 0; i2 < item.mBanners.size(); i2++) {
            final UIDrawableWithLink uIDrawableWithLink = item.mBanners.get(i2);
            View viewInflate = LayoutInflater.from(fn3e()).inflate(R.layout.rc_setting_stagger_local_banner, (ViewGroup) this.f14259g, false);
            C6077k.o1t(viewInflate);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), Integer.valueOf(uIDrawableWithLink.drawable), (ImageView) viewInflate.findViewById(R.id.image), null);
            ((TextView) viewInflate.findViewById(android.R.id.title)).setText(uIDrawableWithLink.title);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f14261y);
            if (i2 != 0) {
                layoutParams.topMargin = this.f14260s;
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.gvn7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14370k.m8753l(uIDrawableWithLink, view);
                }
            });
            this.f14259g.addView(viewInflate, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < ((SettingStaggerLocalBannerGroupElement) this.f9849q).mBanners.size(); i2++) {
            UILink uILink = ((SettingStaggerLocalBannerGroupElement) this.f9849q).mBanners.get(i2).link;
            if (uILink != null) {
                arrayList.add(uILink.trackId);
            }
        }
        return arrayList;
    }
}
