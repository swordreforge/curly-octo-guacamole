package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public class AdBannerElement extends UIElement {
    private AdInfo adInfo;

    public AdBannerElement(AdInfo adInfo) {
        super(0);
        this.adInfo = adInfo;
    }

    public AdInfo getAdInfo() {
        return this.adInfo;
    }
}
