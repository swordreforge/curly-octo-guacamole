package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public class RankDetailTopImageElement extends UIElement {
    private String topBannerImageUrl;

    public RankDetailTopImageElement(String topBannerImageUrl) {
        super(38);
        this.topBannerImageUrl = topBannerImageUrl;
    }

    public String getTopBannerImageUrl() {
        return this.topBannerImageUrl;
    }
}
