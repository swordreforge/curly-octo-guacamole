package com.android.thememanager.recommend.model.adapter.factory;

import android.util.Log;
import com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement;
import com.android.thememanager.recommend.model.entity.element.WidgetSuitElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WidgetSuitElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class zp extends qrj {

    /* JADX INFO: renamed from: k */
    private static final String f13570k = "WidgetStaggerElementFactory";

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.recommends;
        if (list != null && !list.isEmpty()) {
            for (UIImageWithLink uIImageWithLink : card.recommends) {
                if (uIImageWithLink == null) {
                    Log.w(f13570k, "can't generate WidgetElement:  imageWithLink == null");
                } else {
                    int i2 = uIImageWithLink.imgHeight;
                    if (i2 == -2) {
                        arrayList.add(new WidgetSuitElement(uIImageWithLink));
                    } else if (i2 == 200 || i2 == 868) {
                        arrayList.add(new DynamicStaggeredBannerElement(uIImageWithLink));
                    } else {
                        Log.e(f13570k, "imgHeight is not supported: " + i2);
                    }
                }
            }
        }
        return arrayList;
    }
}
