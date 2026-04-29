package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.HomePageHybridMarqueeCardElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: HomePageHybridMarqueeCardFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card == null || com.android.thememanager.basemodule.utils.y9n.mcp(card.products)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HomePageHybridMarqueeCardElement homePageHybridMarqueeCardElement = new HomePageHybridMarqueeCardElement();
        homePageHybridMarqueeCardElement.setTitle(card.title);
        homePageHybridMarqueeCardElement.setTitlePic(card.titlePic);
        homePageHybridMarqueeCardElement.setDarkTitlePic(card.darkTitlePic);
        homePageHybridMarqueeCardElement.setSubtitle(card.subTitle);
        homePageHybridMarqueeCardElement.setGuide(card.guide);
        homePageHybridMarqueeCardElement.setSubjectUuid(card.subjectUuid);
        homePageHybridMarqueeCardElement.setTrackId(card.trackId);
        homePageHybridMarqueeCardElement.setProducts(card.products);
        arrayList.add(homePageHybridMarqueeCardElement);
        return arrayList;
    }
}
