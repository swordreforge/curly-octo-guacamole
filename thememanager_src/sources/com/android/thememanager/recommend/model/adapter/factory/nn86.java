package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.RankListThemeElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ThemeProductsElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class nn86 extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        List<UIProduct> list;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(card.title) && !TextUtils.isEmpty(card.pageUuid) && (list = card.products) != null && list.size() > 0) {
            arrayList.add(new RankListThemeElement(card.title, card.subTitle, card.pageUuid, card.subjectUuid, card.products, card.imageUrl, card.trackId));
        }
        return arrayList;
    }
}
