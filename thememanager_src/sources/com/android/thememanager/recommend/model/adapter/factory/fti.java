package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: LargeIconProductFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class fti extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card == null || com.android.thememanager.basemodule.utils.y9n.mcp(card.products)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = card.products.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.android.thememanager.t8r(it.next()));
        }
        return arrayList;
    }
}
