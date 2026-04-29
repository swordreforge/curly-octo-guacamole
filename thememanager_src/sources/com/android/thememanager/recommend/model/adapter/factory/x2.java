package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.DividerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DividerItemElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13567k;

    public x2(qrj elementFactory) {
        this.f13567k = elementFactory;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIElement> listMo8509k = this.f13567k.mo8509k(card);
        if (!listMo8509k.isEmpty()) {
            arrayList.addAll(listMo8509k);
            arrayList.add(new DividerElement());
        }
        return arrayList;
    }
}
