package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.RankDetailTopThreeThemeElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RankDetailTopThreeThemeElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class eqxt extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13545k;

    public eqxt(qrj elementFactory) {
        this.f13545k = elementFactory;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (list != null && list.size() >= 3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(card.products.get(0));
            arrayList2.add(card.products.get(1));
            arrayList2.add(card.products.get(2));
            card.products.removeAll(arrayList2);
            arrayList.add(new RankDetailTopThreeThemeElement(arrayList2, card.title, card.subTitle, card.trackId));
            arrayList.addAll(this.f13545k.mo8509k(card));
        }
        return arrayList;
    }
}
