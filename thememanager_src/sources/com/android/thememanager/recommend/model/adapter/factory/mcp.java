package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.LargeIconRecommendElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: LargeIconElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class mcp extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        String str = card.trackId;
        List<UIImageWithLink> list = card.recommends;
        if (!com.android.thememanager.basemodule.utils.y9n.mcp(list)) {
            Iterator<UIImageWithLink> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new LargeIconRecommendElement(it.next(), str));
            }
        }
        return arrayList;
    }
}
