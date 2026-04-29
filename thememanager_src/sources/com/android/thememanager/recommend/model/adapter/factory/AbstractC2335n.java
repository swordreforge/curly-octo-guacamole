package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.UITopBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.n */
/* JADX INFO: compiled from: BaseTopImageBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2335n extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(card.topBannerImageUrl)) {
            arrayList.add(zy(card.topBannerImageUrl, card.subjectUuid, card.title, card.trackId));
            arrayList.addAll(toq().mo8509k(card));
        }
        return arrayList;
    }

    protected abstract qrj toq();

    protected abstract UITopBannerElement zy(String topBannerImageUrl, String subjectUuid, String title, String trackId);
}
