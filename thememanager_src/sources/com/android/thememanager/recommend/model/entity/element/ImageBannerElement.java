package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;

/* JADX INFO: loaded from: classes2.dex */
public class ImageBannerElement extends UIElement {
    private AdInfo adInfo;
    private String imageUrl;
    private UILink link;

    public ImageBannerElement(AdInfo adInfo) {
        super(10);
        this.adInfo = adInfo;
    }

    public AdInfo getAdInfo() {
        return this.adInfo;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public UILink getLink() {
        return this.link;
    }

    public ImageBannerElement(String imageUrl, UILink link) {
        super(10);
        this.imageUrl = imageUrl;
        this.link = link;
    }
}
