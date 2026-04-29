package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.ThreeWallpaperGroupElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.j */
/* JADX INFO: compiled from: ThreeWallpaperGroupElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2331j extends qrj {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60634zy = 3;

    /* JADX INFO: renamed from: k */
    private boolean f13551k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f60635toq;

    public C2331j(boolean isFirstCard, boolean isEndlessList) {
        this.f13551k = isEndlessList;
        this.f60635toq = isFirstCard;
    }

    private int toq(List<UIProduct> products) {
        return ((products.size() + 3) - 1) / 3;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        List<UIProduct> listSubList;
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (list != null && (this.f13551k || list.size() % 3 == 0)) {
            int qVar = toq(card.products);
            int i2 = 0;
            while (i2 < qVar) {
                boolean z2 = this.f13551k || i2 != 0;
                if (i2 == qVar - 1) {
                    List<UIProduct> list2 = card.products;
                    listSubList = list2.subList(i2 * 3, list2.size());
                } else {
                    listSubList = card.products.subList(i2 * 3, (i2 + 1) * 3);
                }
                arrayList.add(new ThreeWallpaperGroupElement(z2, card.products, card.subjectUuid, listSubList));
                i2++;
            }
        }
        return arrayList;
    }
}
