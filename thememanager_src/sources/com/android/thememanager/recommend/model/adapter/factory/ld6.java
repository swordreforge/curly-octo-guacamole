package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.DetailRecommendTitleElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DetailRecommendTitleFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13553k;

    public ld6(qrj elementFactory) {
        this.f13553k = elementFactory;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DetailRecommendTitleElement(null));
        arrayList.addAll(this.f13553k.mo8509k(card));
        return arrayList;
    }
}
