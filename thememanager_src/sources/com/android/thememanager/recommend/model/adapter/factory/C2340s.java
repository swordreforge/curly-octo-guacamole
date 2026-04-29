package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.ConcentrationRecommendElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.s */
/* JADX INFO: compiled from: ConcentrationRecommendFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2340s extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        ConcentrationRecommendElement concentrationRecommendElement = new ConcentrationRecommendElement();
        concentrationRecommendElement.setTitle(card.title);
        concentrationRecommendElement.setSubTitle(card.subTitle);
        concentrationRecommendElement.setLink(card.link);
        concentrationRecommendElement.setProducts(card.products);
        concentrationRecommendElement.setSubjectUuid(card.subjectUuid);
        concentrationRecommendElement.setTrackId(card.trackId);
        arrayList.add(concentrationRecommendElement);
        return arrayList;
    }
}
