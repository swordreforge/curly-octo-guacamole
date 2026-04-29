package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.WallpaperProductsElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WallpaperBannerListBottomElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class y9n extends qrj {

    /* JADX INFO: renamed from: k */
    private final int f13568k;

    public y9n(int verify) {
        this.f13568k = verify;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.isAuthorized(this.f13568k)) {
            arrayList.add(new WallpaperProductsElement(17, card.title, card.subTitle, card.pageUuid, card.subjectUuid, card.products, card.imageUrl, card.trackId));
        }
        return arrayList;
    }
}
