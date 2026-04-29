package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.RankDetailTopThreeWallpaperElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RankDetailTopThreeWallpaperElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class d2ok extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13542k;

    public d2ok(qrj elementFactory) {
        this.f13542k = elementFactory;
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
            arrayList.add(new RankDetailTopThreeWallpaperElement(arrayList2, card.title, card.subTitle, card.trackId));
            arrayList.addAll(this.f13542k.mo8509k(card));
        }
        return arrayList;
    }
}
