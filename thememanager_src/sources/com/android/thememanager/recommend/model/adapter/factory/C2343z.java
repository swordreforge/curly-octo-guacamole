package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.recommend.model.entity.element.ImageBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.z */
/* JADX INFO: compiled from: ImageBannerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2343z extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        UILink uILink;
        ArrayList arrayList = new ArrayList();
        AdInfo adInfo = card.getAdInfo(true);
        if (adInfo != null) {
            arrayList.add(new ImageBannerElement(adInfo));
        } else if (!TextUtils.isEmpty(card.imageUrl) && (uILink = card.link) != null) {
            arrayList.add(new ImageBannerElement(card.imageUrl, uILink));
        }
        return arrayList;
    }
}
