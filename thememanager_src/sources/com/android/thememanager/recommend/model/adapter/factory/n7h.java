package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.FoldUIThemeRecommendElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FoldThemeElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (!com.android.thememanager.basemodule.utils.y9n.mcp(list)) {
            Iterator<UIProduct> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new FoldUIThemeRecommendElement(it.next()));
            }
        }
        return arrayList;
    }
}
