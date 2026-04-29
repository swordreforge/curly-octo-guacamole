package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.ImageTextBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ImageTextBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class o1t extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        UILink uILink;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(card.imageUrl) && (uILink = card.link) != null) {
            arrayList.add(new ImageTextBannerElement(card.imageUrl, card.title, card.subTitle, uILink, card.trackId));
        }
        return arrayList;
    }
}
