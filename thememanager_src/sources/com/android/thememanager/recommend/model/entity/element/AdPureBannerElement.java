package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;

/* JADX INFO: loaded from: classes2.dex */
public class AdPureBannerElement extends UIElement {
    public final AdInfo adInfo;
    public final UILink link;

    public AdPureBannerElement(UILink link, AdInfo adInfo) {
        super(74);
        this.link = link;
        this.adInfo = adInfo;
    }
}
