package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.HomePageHybridSixGridCardElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.i */
/* JADX INFO: compiled from: HomePageHybridSixGridCardFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2330i extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card == null || com.android.thememanager.basemodule.utils.y9n.mcp(card.products)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HomePageHybridSixGridCardElement homePageHybridSixGridCardElement = new HomePageHybridSixGridCardElement();
        homePageHybridSixGridCardElement.setTitle(card.title);
        homePageHybridSixGridCardElement.setTitlePic(card.titlePic);
        homePageHybridSixGridCardElement.setDarkTitlePic(card.darkTitlePic);
        homePageHybridSixGridCardElement.setSubtitle(card.subTitle);
        homePageHybridSixGridCardElement.setGuide(card.guide);
        homePageHybridSixGridCardElement.setSubjectUuid(card.subjectUuid);
        homePageHybridSixGridCardElement.setTrackId(card.trackId);
        homePageHybridSixGridCardElement.setProducts(card.products);
        arrayList.add(homePageHybridSixGridCardElement);
        return arrayList;
    }
}
