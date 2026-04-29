package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.LargeIconHotAppCardElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LargeIconHotAppCardFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class a9 extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card == null || com.android.thememanager.basemodule.utils.y9n.mcp(card.gridBanners)) {
            return null;
        }
        String str = card.title;
        List<UIImageWithLink> list = card.gridBanners;
        UILink uILink = card.link;
        LargeIconHotAppCardElement largeIconHotAppCardElement = new LargeIconHotAppCardElement(str, list, uILink != null ? uILink.link : null, uILink != null ? uILink.trackId : null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(largeIconHotAppCardElement);
        return arrayList;
    }
}
