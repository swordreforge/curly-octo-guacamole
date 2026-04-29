package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.recommend.model.entity.element.HomepageSlideAdCardElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: HomepageSlideAdCardElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class fn3e extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        HomepageSlideAdCardElement homepageSlideAdCardElement = new HomepageSlideAdCardElement();
        List<AdInfo> adInfos = card.getAdInfos(true);
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(adInfos) && adInfos.size() > 1) {
            homepageSlideAdCardElement.setTitle(card.title);
            UILink uILink = card.link;
            if (uILink != null) {
                homepageSlideAdCardElement.setAdTagId(uILink.adTagId);
            }
            homepageSlideAdCardElement.setTrackId(card.trackId);
            homepageSlideAdCardElement.setAdInfos(adInfos);
            arrayList.add(homepageSlideAdCardElement);
        }
        return arrayList;
    }
}
