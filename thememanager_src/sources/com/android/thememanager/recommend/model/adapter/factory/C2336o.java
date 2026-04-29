package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.IconGroupEmptyElement;
import com.android.thememanager.recommend.model.entity.element.IconGroupsElement;
import com.android.thememanager.recommend.model.entity.element.TopBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIIcon;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.o */
/* JADX INFO: compiled from: TopBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2336o extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.loopImages;
        if (list != null && !list.isEmpty()) {
            arrayList.add(new TopBannerElement(card.loopImages));
        }
        List<List<UIIcon>> list2 = card.iconGroups;
        if (list2 == null || list2.isEmpty()) {
            arrayList.add(new IconGroupEmptyElement());
        } else {
            arrayList.add(new IconGroupsElement(card.iconGroups));
        }
        return arrayList;
    }
}
