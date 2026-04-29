package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.TopImageBannerElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementWallpaperBannerListTopViewHolder extends BaseViewHolder<TopImageBannerElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f14106g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementWallpaperBannerListTopViewHolder$k */
    class ViewOnClickListenerC2410k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ TopImageBannerElement f14107k;

        ViewOnClickListenerC2410k(final TopImageBannerElement val$item) {
            this.f14107k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ElementWallpaperBannerListTopViewHolder.this.jk(this.f14107k.getSubjectUuid(), this.f14107k.getTitle());
            ElementWallpaperBannerListTopViewHolder.this.m6706z().d8wk(this.f14107k.getTrackId(), null);
        }
    }

    public ElementWallpaperBannerListTopViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14106g = (ImageView) itemView.findViewById(R.id.top_banner);
    }

    /* JADX INFO: renamed from: l */
    public static ElementWallpaperBannerListTopViewHolder m8697l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementWallpaperBannerListTopViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_wallpaper_banner_list_top, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(TopImageBannerElement item, int position) {
        super.o1t(item, position);
        this.f14106g.setOnClickListener(new ViewOnClickListenerC2410k(item));
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), item.getTopBannerImageUrl(), this.f14106g, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((TopImageBannerElement) this.f9849q).getTrackId());
        return arrayList;
    }
}
