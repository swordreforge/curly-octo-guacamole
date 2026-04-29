package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.NormalRingtoneAdElement;
import com.android.thememanager.recommend.model.entity.element.NormalSecondRingtoneElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RingtoneEndlessListFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class dd extends qrj {

    /* JADX INFO: renamed from: k */
    private boolean f13543k;

    public dd(boolean isFirstCard) {
        this.f13543k = isFirstCard;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.products != null) {
            int i2 = 0;
            while (i2 < card.products.size()) {
                UIProduct uIProduct = card.products.get(i2);
                if (uIProduct.adInfo != null) {
                    arrayList.add(new NormalRingtoneAdElement(uIProduct.getAdInfo()));
                } else {
                    arrayList.add(new NormalSecondRingtoneElement(card.products.get(i2), false, this.f13543k && i2 == 0));
                }
                i2++;
            }
        }
        return arrayList;
    }
}
