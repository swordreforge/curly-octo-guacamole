package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GirdBannerElement extends UIElement {
    private List<UIImageWithLink> banners;
    private String trackId;

    public GirdBannerElement(int cardType, List<UIImageWithLink> banners, String trackId) {
        super(cardType);
        this.banners = banners;
        this.trackId = trackId;
    }

    public List<UIImageWithLink> getBanners() {
        return this.banners;
    }

    public String getTrackId() {
        return this.trackId;
    }
}
