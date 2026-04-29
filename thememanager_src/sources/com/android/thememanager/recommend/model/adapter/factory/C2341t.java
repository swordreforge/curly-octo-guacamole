package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.LargeIconAllTwoCardElement;
import com.android.thememanager.recommend.model.entity.element.LargeIconFourItemCardTitleElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.t */
/* JADX INFO: compiled from: LargeIconAllDataFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2341t extends qrj {

    /* JADX INFO: renamed from: k */
    private static final int f13563k = 2;

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card == null || card.products == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LargeIconFourItemCardTitleElement(card.productCount, card.link, card.trackId));
        List<UIProduct> list = card.products;
        if (!com.android.thememanager.basemodule.utils.y9n.mcp(list)) {
            int size = list.size();
            int i2 = 1;
            int i3 = ((size + 2) - 1) / 2;
            while (i2 <= i3) {
                arrayList.add(new LargeIconAllTwoCardElement(new ArrayList(list), (i2 - 1) * 2, i2 == i3 ? size : i2 * 2, i2));
                i2++;
            }
        }
        return arrayList;
    }
}
