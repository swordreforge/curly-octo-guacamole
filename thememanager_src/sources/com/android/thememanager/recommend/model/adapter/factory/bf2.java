package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.WallpaperSettingElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;
import yz.C7794k;

/* JADX INFO: compiled from: WallpaperSettingElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class bf2 extends qrj {

    /* JADX INFO: renamed from: k */
    private static final int f13541k = 200;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f60629toq = 868;

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        UILink uILink;
        ArrayList arrayList = new ArrayList();
        List<UIImageWithLink> list = card.recommends;
        if (list != null) {
            for (UIImageWithLink uIImageWithLink : list) {
                WallpaperSettingElement wallpaperSettingElement = null;
                int i2 = uIImageWithLink.imgHeight;
                if (i2 == 200) {
                    C7794k.f7l8("height 200 ?? ");
                } else if (i2 == 868 && (uILink = uIImageWithLink.link) != null && ("WALLPAPER".equals(uILink.productType) || "AOD".equals(uILink.productType))) {
                    wallpaperSettingElement = new WallpaperSettingElement(88, uIImageWithLink);
                }
                if (wallpaperSettingElement != null) {
                    arrayList.add(wallpaperSettingElement);
                }
            }
        }
        return arrayList;
    }
}
