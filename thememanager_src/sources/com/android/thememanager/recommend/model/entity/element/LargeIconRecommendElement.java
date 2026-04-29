package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconRecommendElement extends UIElement {
    private String mTrackId;
    private UIImageWithLink mUIImageWithLink;

    public LargeIconRecommendElement(UIImageWithLink product, String trackId) {
        super(132);
        this.mUIImageWithLink = product;
        this.mTrackId = trackId;
    }

    public String getTrackId() {
        return this.mTrackId;
    }

    public UIImageWithLink getUIImageWithLink() {
        return this.mUIImageWithLink;
    }
}
