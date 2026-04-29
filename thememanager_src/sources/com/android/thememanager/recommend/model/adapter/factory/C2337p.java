package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.recommend.model.entity.element.DetailRecommendElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredVideoAdElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.p */
/* JADX INFO: compiled from: DetailRecommendFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2337p extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(card.recommends)) {
            for (UIImageWithLink uIImageWithLink : card.recommends) {
                AdInfo adInfo = uIImageWithLink.getAdInfo(true);
                arrayList.add((adInfo == null || !adInfo.isVideoAd()) ? new DetailRecommendElement(uIImageWithLink) : new StaggeredVideoAdElement(uIImageWithLink));
            }
        }
        return arrayList;
    }
}
