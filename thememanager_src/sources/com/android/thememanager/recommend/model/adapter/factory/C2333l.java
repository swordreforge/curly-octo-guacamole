package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.RingtoneRankingElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.router.recommend.entity.UISubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.l */
/* JADX INFO: compiled from: RingtoneRankingElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2333l extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        List<UIProduct> list;
        ArrayList arrayList = new ArrayList();
        int size = card.subjects.size();
        int i2 = 0;
        while (i2 < size) {
            UISubject uISubject = card.subjects.get(i2);
            if (TextUtils.isEmpty(uISubject.subjectTitle) || TextUtils.isEmpty(uISubject.subjectImageUrl) || TextUtils.isEmpty(uISubject.subjectUuid) || (list = uISubject.products) == null || list.size() < 3) {
                return Collections.emptyList();
            }
            arrayList.add(new RingtoneRankingElement(i2 != 0, uISubject.subjectUuid, uISubject.subjectTitle, uISubject.subjectImageUrl, uISubject.products, uISubject.trackId));
            i2++;
        }
        return arrayList;
    }
}
