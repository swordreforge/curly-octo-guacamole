package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.WallpaperSixGirdBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WallpaperSixGirdBannersElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class i1 extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.gridBanners;
        if (list != null && list.size() == 6) {
            arrayList.add(new WallpaperSixGirdBannerElement(card.gridBanners, card.trackId));
        }
        return arrayList;
    }
}
