package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UIImageBannerElement extends UIElement {
    private UIImageWithLink imageBanner;

    protected UIImageBannerElement(int cardType, UIImageWithLink imageBanner) {
        super(cardType);
        this.imageBanner = imageBanner;
    }

    public UIImageWithLink getImageBanner() {
        return this.imageBanner;
    }
}
