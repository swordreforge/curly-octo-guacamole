package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.RingtoneSingleElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RingtoneSingleElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class n5r1 extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(card.backImageUrl)) {
            arrayList.add(new RingtoneSingleElement(card.products, card.backImageUrl, card.trackId));
        }
        return arrayList;
    }
}
