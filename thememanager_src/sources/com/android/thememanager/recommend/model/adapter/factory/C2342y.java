package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.ConcentrationListElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.y */
/* JADX INFO: compiled from: ConcentrationListFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2342y extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        ConcentrationListElement concentrationListElement = new ConcentrationListElement();
        concentrationListElement.setTitle(card.title);
        concentrationListElement.setSubTitle(card.subTitle);
        concentrationListElement.setLink(card.link);
        concentrationListElement.setProducts(card.products);
        concentrationListElement.setSubjectUuid(card.subjectUuid);
        concentrationListElement.setTrackId(card.trackId);
        arrayList.add(concentrationListElement);
        return arrayList;
    }
}
