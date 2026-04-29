package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.AodSlideListElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.q */
/* JADX INFO: compiled from: AodSlideListFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2338q extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        AodSlideListElement aodSlideListElement = new AodSlideListElement();
        aodSlideListElement.setTitle(card.title);
        aodSlideListElement.setLink(card.link);
        aodSlideListElement.setProducts(card.products);
        aodSlideListElement.setProductCount(card.productCount);
        aodSlideListElement.setSubjectUuid(card.subjectUuid);
        aodSlideListElement.setTrackId(card.trackId);
        arrayList.add(aodSlideListElement);
        return arrayList;
    }
}
