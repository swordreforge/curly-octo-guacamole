package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.RankDetailTopImageElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RankDetailTopImageFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class oc extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13558k;

    public oc(qrj elementFactory) {
        this.f13558k = elementFactory;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        String str = card.topBannerImageUrl;
        if (str != null) {
            arrayList.add(new RankDetailTopImageElement(str));
            arrayList.addAll(this.f13558k.mo8509k(card));
        }
        return arrayList;
    }
}
