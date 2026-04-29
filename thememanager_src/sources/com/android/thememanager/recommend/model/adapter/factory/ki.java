package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.FourGirdBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FourGirdBannersElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.gridBanners;
        if (list != null && list.size() == 4) {
            arrayList.add(new FourGirdBannerElement(card.gridBanners, card.trackId));
        }
        return arrayList;
    }
}
