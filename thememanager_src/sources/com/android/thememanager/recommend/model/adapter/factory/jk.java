package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.LargeIconHomeCardElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LargeIconHomeCardFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class jk extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LargeIconHomeCardElement largeIconHomeCardElement = new LargeIconHomeCardElement();
        largeIconHomeCardElement.setTitle(card.title);
        largeIconHomeCardElement.setTrackId(card.trackId);
        largeIconHomeCardElement.setProducts(card.products);
        largeIconHomeCardElement.setSubjectUuid(card.subjectUuid);
        largeIconHomeCardElement.setCardType(card.cardType);
        arrayList.add(largeIconHomeCardElement);
        return arrayList;
    }
}
