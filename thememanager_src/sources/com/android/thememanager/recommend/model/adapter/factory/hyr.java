package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.RingtoneSubjectListElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RingtoneSubjectListElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class hyr extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (list != null && list.size() == 3) {
            arrayList.add(new RingtoneSubjectListElement(card.products, card.backImageUrl));
        }
        return arrayList;
    }
}
