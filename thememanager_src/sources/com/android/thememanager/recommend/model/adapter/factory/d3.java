package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.RankDetailRingtoneElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RankDetailRingtoneFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class d3 extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.products != null) {
            for (int i2 = 0; i2 < card.products.size(); i2++) {
                arrayList.add(new RankDetailRingtoneElement(card.products.get(i2), true, card.expLayer, card.eids, card.cardUuid));
            }
        }
        return arrayList;
    }
}
