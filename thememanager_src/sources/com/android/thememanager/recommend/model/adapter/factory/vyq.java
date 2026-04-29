package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.recommend.model.entity.element.DynamicStaggeredBannerElement;
import com.android.thememanager.recommend.model.entity.element.IconRecommendElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredAdElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredFontCategoryElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredFontSubjectElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredRingtoneSubjectElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredThemeCategoryElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredVideoAdElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredVideoWallpaperCategoryElement;
import com.android.thememanager.recommend.model.entity.element.StaggeredWallpaperCategoryElement;
import com.android.thememanager.recommend.model.entity.element.WidgetSuitElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: StaggeredMixinElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class vyq extends qrj {

    /* JADX INFO: renamed from: k */
    public static final int f13565k = 200;

    /* JADX INFO: renamed from: q */
    public static final int f13566q = -2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f60641toq = 868;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60642zy = -1;

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        UIImageWithLink uIImageWithLink = card.topImage;
        if (uIImageWithLink != null) {
            arrayList.add(new DynamicStaggeredBannerElement(uIImageWithLink));
        }
        List<UIImageWithLink> list = card.recommends;
        if (list != null) {
            for (UIImageWithLink uIImageWithLink2 : list) {
                UIElement widgetSuitElement = null;
                AdInfo adInfo = uIImageWithLink2.getAdInfo(true);
                if (adInfo != null) {
                    widgetSuitElement = adInfo.isVideoAd() ? new StaggeredVideoAdElement(uIImageWithLink2) : new StaggeredAdElement(uIImageWithLink2);
                } else {
                    int i2 = uIImageWithLink2.imgHeight;
                    if (i2 == 200) {
                        widgetSuitElement = new DynamicStaggeredBannerElement(uIImageWithLink2);
                    } else if (i2 == 868) {
                        UILink uILink = uIImageWithLink2.link;
                        if (uILink != null) {
                            String str = uILink.type;
                            str.hashCode();
                            switch (str) {
                                case "EXTERNAL_HREF":
                                case "HREF":
                                case "NONE":
                                case "UI_PAGE":
                                    widgetSuitElement = new DynamicStaggeredBannerElement(uIImageWithLink2);
                                    break;
                                case "SUBJECT":
                                    if (!"WALLPAPER".equals(uILink.productType)) {
                                        if ("THEME".equals(uILink.productType) || "VIDEO_WALLPAPER".equals(uILink.productType) || "WIDGET_SUIT".equals(uILink.productType)) {
                                            widgetSuitElement = new DynamicStaggeredBannerElement(uIImageWithLink2);
                                        }
                                        break;
                                    } else {
                                        widgetSuitElement = new StaggeredWallpaperCategoryElement(uIImageWithLink2);
                                        break;
                                    }
                                    break;
                                case "PRODUCT_DETAIL":
                                    if (!"THEME".equals(uILink.productType)) {
                                        if ("FONT".equals(uILink.productType)) {
                                            widgetSuitElement = new StaggeredFontCategoryElement(uIImageWithLink2);
                                        } else if (InterfaceC1789q.e1v.equals(uILink.productType)) {
                                            widgetSuitElement = new IconRecommendElement(uIImageWithLink2);
                                        } else if ("VIDEO_WALLPAPER".equals(uILink.productType) && com.android.thememanager.basemodule.utils.qrj.m7199q(qrj.toq.VIDEO_WALLPAPER)) {
                                            widgetSuitElement = new StaggeredVideoWallpaperCategoryElement(uIImageWithLink2);
                                        }
                                        break;
                                    } else {
                                        widgetSuitElement = new StaggeredThemeCategoryElement(uIImageWithLink2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else if (i2 == -1) {
                        UILink uILink2 = uIImageWithLink2.link;
                        if (uILink2 != null) {
                            String str2 = uILink2.type;
                            str2.hashCode();
                            if (str2.equals("SUBJECT")) {
                                if ("RINGTONE".equals(uILink2.productType)) {
                                    widgetSuitElement = new StaggeredRingtoneSubjectElement(uIImageWithLink2, uIImageWithLink2.products);
                                } else if ("FONT".equals(uILink2.productType)) {
                                    widgetSuitElement = new StaggeredFontSubjectElement(uIImageWithLink2, uIImageWithLink2.products);
                                }
                            }
                        }
                    } else if (i2 == -2) {
                        widgetSuitElement = new WidgetSuitElement(uIImageWithLink2);
                    }
                }
                if (widgetSuitElement != null) {
                    arrayList.add(widgetSuitElement);
                }
            }
        }
        return arrayList;
    }
}
