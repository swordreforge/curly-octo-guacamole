package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement;
import com.android.thememanager.recommend.model.entity.element.IconRecommendElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: IconRecommendElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class ni7 extends qrj {

    /* JADX INFO: renamed from: n */
    private static final int f13555n = 868;

    /* JADX INFO: renamed from: q */
    private static final int f13556q = 200;

    /* JADX INFO: renamed from: k */
    private boolean f13557k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60637toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60638zy;

    public ni7(int size, boolean hasMore, int position) {
        this.f60638zy = size;
        this.f13557k = hasMore;
        this.f60637toq = position;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(card.recommends)) {
            for (UIImageWithLink uIImageWithLink : card.recommends) {
                arrayList.add(uIImageWithLink.imgHeight == 200 ? new DynamicStaggeredBannerElement(uIImageWithLink) : new IconRecommendElement(uIImageWithLink));
            }
        }
        return arrayList;
    }
}
