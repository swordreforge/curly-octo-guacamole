package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.SearchHotElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SearchHintHotElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class lrht extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(card.content)) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : card.content.split(";")) {
                arrayList2.add(str);
            }
            arrayList.add(new SearchHotElement(117, arrayList2));
        }
        return arrayList;
    }
}
