package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.ClassListDividerElement;
import com.android.thememanager.recommend.model.entity.element.FontWallpaperClassListItemElement;
import com.android.thememanager.recommend.model.entity.element.MarginElement;
import com.android.thememanager.recommend.model.entity.element.WallpaperClassListItemElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.b */
/* JADX INFO: compiled from: WallpaperClassGirdBannersElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2324b extends qrj {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f60627toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60628zy = 3;

    /* JADX INFO: renamed from: k */
    private boolean f13540k;

    public C2324b(boolean isFirstCard) {
        this.f13540k = isFirstCard;
    }

    private int toq(List<UIImageWithLink> banners, int elementLimit) {
        return ((banners.size() + elementLimit) - 1) / elementLimit;
    }

    private void zy(UICard card, List<UIElement> elementList, int elementLimit) {
        List<UIImageWithLink> listSubList;
        boolean z2;
        int qVar = toq(card.gridBanners, elementLimit);
        for (int i2 = 0; i2 < qVar; i2++) {
            if (i2 == qVar - 1) {
                List<UIImageWithLink> list = card.gridBanners;
                listSubList = list.subList(i2 * elementLimit, list.size());
                z2 = true;
            } else {
                listSubList = card.gridBanners.subList(i2 * elementLimit, (i2 + 1) * elementLimit);
                z2 = false;
            }
            if ("FONT".equals(card.gridBanners.get(0).link.productType)) {
                elementList.add(new FontWallpaperClassListItemElement(card.subjectUuid, listSubList, z2));
            } else {
                elementList.add(new WallpaperClassListItemElement(card.subjectUuid, listSubList, z2, this.f13540k));
            }
        }
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.gridBanners;
        if (list != null && list.size() > 0) {
            if (this.f13540k) {
                arrayList.add(new MarginElement());
            } else {
                arrayList.add(new ClassListDividerElement(card.subTitle));
            }
            if ("FONT".equals(card.gridBanners.get(0).link.productType)) {
                zy(card, arrayList, 3);
            } else {
                zy(card, arrayList, 2);
            }
        }
        return arrayList;
    }
}
