package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.recommend.model.entity.element.AdPureBannerElement;
import com.android.thememanager.recommend.model.entity.element.AdPureDspBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PureAdBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class jp0y extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        AdInfo adInfo = card.getAdInfo(true);
        if (card.link != null && adInfo != null) {
            arrayList.add(C1653q.m6525h(adInfo.dspName) ? new AdPureDspBannerElement(card.link, adInfo) : new AdPureBannerElement(card.link, adInfo));
        }
        return arrayList;
    }
}
