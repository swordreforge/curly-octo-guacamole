package com.android.thememanager.v10.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.settings.WallpaperSettingsActivity;
import com.android.thememanager.util.gc3c;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSettingStaggerHolder extends BaseViewHolder<UIImageBannerElement> {

    /* JADX INFO: renamed from: g */
    private final ImageView f16982g;

    /* JADX INFO: renamed from: y */
    private final x2.C1735g f16983y;

    WallpaperSettingStaggerHolder(View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        this.f16982g = imageView;
        this.f16983y = x2.fn3e().jk(0);
        C6077k.o1t(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m10122l(UIImageWithLink uIImageWithLink, UIImageBannerElement uIImageBannerElement, UIImageWithLink uIImageWithLink2, View view) {
        com.android.thememanager.basemodule.base.toq toqVar = (com.android.thememanager.basemodule.base.toq) this.f9847k.fu4();
        AbstractActivityC1717k abstractActivityC1717k = (AbstractActivityC1717k) this.f9847k.ki();
        if ("PRODUCT_DETAIL".equals(uIImageWithLink.link.type)) {
            ((WallpaperSettingsActivity) ki()).h7am(uIImageBannerElement);
            kja0.f7l8(abstractActivityC1717k.yz(), uIImageWithLink2.link.trackId, null);
            C1708s.f7l8().ld6().ni7(C1706p.kja0(abstractActivityC1717k.mo6345a(), uIImageWithLink2.link.trackId, ""));
            return;
        }
        C2451n.toq toqVarM8797g = C2451n.m8797g();
        toqVarM8797g.m8807p(uIImageWithLink.index);
        toqVarM8797g.m8810y(uIImageWithLink.imageUrl);
        toqVarM8797g.toq(uIImageWithLink.link.productType);
        C2451n.m8803y(ki(), toqVar, uIImageWithLink.link, toqVarM8797g);
        UILink uILink = uIImageWithLink.link;
        if (uILink != null) {
            if (toqVar != null) {
                toqVar.d8wk(uILink.trackId, null);
            } else if (abstractActivityC1717k != null) {
                kja0.f7l8(abstractActivityC1717k.mo6345a(), uIImageWithLink.link.trackId, null);
                C1708s.f7l8().ld6().ni7(C1706p.kja0(abstractActivityC1717k.mo6345a(), uIImageWithLink.link.trackId, ""));
            }
        }
    }

    public static WallpaperSettingStaggerHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WallpaperSettingStaggerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_setting_stagger_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(final UIImageBannerElement item, int position) {
        super.o1t(item, position);
        final UIImageWithLink imageBanner = item.getImageBanner();
        if (imageBanner == null) {
            return;
        }
        x2.m6782y(ki(), imageBanner.imageUrl, this.f16982g, this.f16983y.gvn7(gc3c.m9776g(position)));
        this.f16982g.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.v10.viewholder.zy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16988k.m10122l(imageBanner, item, imageBanner, view);
            }
        });
        C1812k.toq(this.f16982g, imageBanner.link.title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        UIImageWithLink imageBanner = ((UIImageBannerElement) this.f9849q).getImageBanner();
        if (imageBanner == null || imageBanner.link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageBanner.link.trackId);
        return arrayList;
    }
}
