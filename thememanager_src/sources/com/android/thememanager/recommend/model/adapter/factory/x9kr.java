package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.NormalRingtoneAdElement;
import com.android.thememanager.recommend.model.entity.element.NormalRingtoneElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RingtoneNormalListFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class x9kr extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.products != null) {
            for (int i2 = 0; i2 < card.products.size(); i2++) {
                UIProduct uIProduct = card.products.get(i2);
                if (uIProduct.adInfo != null) {
                    arrayList.add(new NormalRingtoneAdElement(uIProduct.getAdInfo()));
                } else {
                    arrayList.add(new NormalRingtoneElement(card.products.get(i2), false, card.expLayer, card.eids, card.cardUuid));
                }
            }
        }
        return arrayList;
    }
}
