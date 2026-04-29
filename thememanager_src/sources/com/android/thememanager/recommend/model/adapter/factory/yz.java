package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.MarginElement;
import com.android.thememanager.recommend.model.entity.element.TwoVideoWallpaperGroupElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TwoVideoWallpaperElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class yz extends qrj {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f60643toq = 2;

    /* JADX INFO: renamed from: k */
    private boolean f13569k;

    public yz(boolean isFirstCard) {
        this.f13569k = isFirstCard;
    }

    private int toq(List<UIProduct> products) {
        return ((products.size() + 2) - 1) / 2;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        List<UIProduct> listSubList;
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (list != null) {
            int qVar = toq(list);
            if (this.f13569k) {
                arrayList.add(new MarginElement());
            }
            for (int i2 = 0; i2 < qVar; i2++) {
                if (i2 == qVar - 1) {
                    List<UIProduct> list2 = card.products;
                    listSubList = list2.subList(i2 * 2, list2.size());
                } else {
                    listSubList = card.products.subList(i2 * 2, (i2 + 1) * 2);
                }
                arrayList.add(new TwoVideoWallpaperGroupElement(card.products, card.subjectUuid, listSubList));
            }
        }
        return arrayList;
    }
}
