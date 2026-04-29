package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.AdBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.k */
/* JADX INFO: compiled from: AdBannerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2332k extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.adInfo != null) {
            arrayList.add(new AdBannerElement(card.getAdInfo(true)));
        }
        return arrayList;
    }
}
