package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.BigImageBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.g */
/* JADX INFO: compiled from: BigImageBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2328g extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        UILink uILink;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(card.imageUrl) && (uILink = card.link) != null) {
            arrayList.add(new BigImageBannerElement(card.imageUrl, uILink, card.getAdInfo()));
        }
        return arrayList;
    }
}
