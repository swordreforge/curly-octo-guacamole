package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.TopTitleElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TopTitleElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class ek5k extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13544k;

    public ek5k(qrj factory) {
        this.f13544k = factory;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIElement> listMo8509k = this.f13544k.mo8509k(card);
        if (!TextUtils.isEmpty(card.title) && !TextUtils.isEmpty(card.subTitle)) {
            arrayList.add(new TopTitleElement(card.title, card.subTitle, card.subjectUuid, card.trackId, card.pageUuid, card.link));
        }
        if (!listMo8509k.isEmpty()) {
            arrayList.addAll(listMo8509k);
        }
        return arrayList;
    }
}
