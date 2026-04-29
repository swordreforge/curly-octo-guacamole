package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.FourGridBannerListGroupElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FourBannersListElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.banners;
        if (list != null && !list.isEmpty()) {
            arrayList.add(new FourGridBannerListGroupElement(card.banners, card.trackId));
        }
        return arrayList;
    }
}
