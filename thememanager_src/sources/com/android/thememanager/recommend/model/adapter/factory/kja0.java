package com.android.thememanager.recommend.model.adapter.factory;

import android.util.Log;
import com.android.thememanager.ad.AdUtils;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.recommend.model.entity.element.NormalFontAdElement;
import com.android.thememanager.recommend.model.entity.element.NormalFontElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.util.C2755a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FontNormalListFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 extends qrj {

    /* JADX INFO: renamed from: k */
    private boolean f13552k;

    public kja0() {
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.products != null) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < card.products.size()) {
                UIProduct uIProduct = card.products.get(i2);
                if (uIProduct.adInfo == null) {
                    i3++;
                    arrayList.add(new NormalFontElement(card.products.get(i2), i2 != 0 || this.f13552k, i3, this.f13552k));
                } else if (!p029m.zy.m24738k(card.adEid, AdUtils.f9438g) || C1792n.a9()) {
                    arrayList.add(new NormalFontAdElement(uIProduct.getAdInfo(), card.adEid));
                } else {
                    Log.d(C2755a.f16307g, "FontNormalListFactory: font ad file not exist");
                }
                i2++;
            }
        }
        return arrayList;
    }

    public kja0(boolean isEndlessList) {
        this.f13552k = isEndlessList;
    }
}
