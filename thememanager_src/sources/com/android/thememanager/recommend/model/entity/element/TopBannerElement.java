package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TopBannerElement extends UIElement {
    private List<UIImageWithLink> banners;

    public TopBannerElement(List<UIImageWithLink> banners) {
        super(1);
        this.banners = banners;
    }

    public List<UIImageWithLink> getBanners() {
        return this.banners;
    }
}
