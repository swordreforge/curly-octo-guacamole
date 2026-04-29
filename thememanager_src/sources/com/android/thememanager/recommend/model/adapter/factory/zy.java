package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.AodRecommendElement;
import com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AodRecommendFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends qrj {

    /* JADX INFO: renamed from: k */
    private static final int f13573k = 200;

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        UIImageWithLink uIImageWithLink = card.topImage;
        if (uIImageWithLink != null) {
            arrayList.add(new DynamicStaggeredBannerElement(uIImageWithLink));
        }
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(card.recommends)) {
            for (UIImageWithLink uIImageWithLink2 : card.recommends) {
                arrayList.add(uIImageWithLink2.imgHeight == 200 ? new DynamicStaggeredBannerElement(uIImageWithLink2) : new AodRecommendElement(uIImageWithLink2));
            }
        }
        return arrayList;
    }
}
