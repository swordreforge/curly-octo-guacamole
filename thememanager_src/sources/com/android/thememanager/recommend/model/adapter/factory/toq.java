package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.AodProductElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AodEndlessListFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends qrj {

    /* JADX INFO: renamed from: k */
    private final int f13564k;

    public toq(int type) {
        this.f13564k = type;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(card.products)) {
            Iterator<UIProduct> it = card.products.iterator();
            while (it.hasNext()) {
                arrayList.add(new AodProductElement(this.f13564k, it.next()));
            }
        }
        return arrayList;
    }
}
