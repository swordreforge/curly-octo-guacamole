package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.LargeIconAllPackageCategoryElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: LargeIconAllCategoryFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class wvg extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        if (card != null && card.gridBanners != null) {
            ArrayList arrayList = new ArrayList();
            List<UIImageWithLink> list = card.gridBanners;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<UIImageWithLink> it = list.iterator();
                while (it.hasNext()) {
                    UILink uILink = it.next().link;
                    if (uILink != null) {
                        arrayList2.add(uILink);
                    }
                }
                arrayList.add(new LargeIconAllPackageCategoryElement(arrayList2));
                return arrayList;
            }
        }
        return null;
    }
}
