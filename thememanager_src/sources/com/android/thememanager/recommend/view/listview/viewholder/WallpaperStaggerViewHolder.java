package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.StaggeredWallpaperCategoryElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperStaggerViewHolder extends StaggerViewHolder<StaggeredWallpaperCategoryElement> {

    /* JADX INFO: renamed from: f */
    private TextView f14334f;

    /* JADX INFO: renamed from: l */
    private TextView f14335l;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WallpaperStaggerViewHolder$k */
    class ViewOnClickListenerC2434k implements View.OnClickListener {
        ViewOnClickListenerC2434k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            toqVarM8797g.m8807p(WallpaperStaggerViewHolder.this.f14268t.index);
            toqVarM8797g.m8810y(WallpaperStaggerViewHolder.this.f14268t.imageUrl);
            UILink uILink = WallpaperStaggerViewHolder.this.f14268t.link;
            if (uILink != null) {
                toqVarM8797g.toq(uILink.productType);
                WallpaperStaggerViewHolder.this.m6706z().d8wk(WallpaperStaggerViewHolder.this.f14268t.link.trackId, null);
            }
            toqVarM8797g.x2(WallpaperStaggerViewHolder.this.wvg().lvui());
            toqVarM8797g.m8804g(WallpaperStaggerViewHolder.this.wvg().m8549l());
            toqVarM8797g.f7l8(WallpaperStaggerViewHolder.this.wvg().n5r1());
            C2451n.m8803y(WallpaperStaggerViewHolder.this.ki(), WallpaperStaggerViewHolder.this.ni7(), WallpaperStaggerViewHolder.this.f14268t.link, toqVarM8797g);
        }
    }

    public WallpaperStaggerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14335l = (TextView) this.f14265p.findViewById(R.id.title);
        this.f14334f = (TextView) this.f14265p.findViewById(R.id.numbers);
        C6077k.o1t(this.f14267s);
    }

    public static WallpaperStaggerViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WallpaperStaggerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_wallpaper_staggered_item_category, parent, false), adapter);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(StaggeredWallpaperCategoryElement item, final int position) {
        super.o1t(item, position);
        if (TextUtils.isEmpty(this.f14268t.title)) {
            this.f14335l.setVisibility(4);
            this.f14334f.setVisibility(4);
        } else {
            this.f14335l.setVisibility(0);
            this.f14334f.setVisibility(0);
            this.f14335l.setText(this.f14268t.title);
            C1812k.toq(this.f14263h, this.f14268t.title);
            TextView textView = this.f14334f;
            Resources resources = ki().getResources();
            int i2 = this.f14268t.productCount;
            textView.setText(resources.getQuantityString(R.plurals.wallpaper_quantity, i2, Integer.valueOf(i2)));
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), this.f14268t.imageUrl, this.f14263h, this.f14264i);
        C1812k.toq(this.f14263h, this.f14268t.title);
        this.f14267s.setOnClickListener(new ViewOnClickListenerC2434k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((StaggeredWallpaperCategoryElement) this.f9849q).getImageBanner().link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((StaggeredWallpaperCategoryElement) this.f9849q).getImageBanner().link.trackId);
        return arrayList;
    }
}
