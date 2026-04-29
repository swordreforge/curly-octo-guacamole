package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;

/* JADX INFO: loaded from: classes2.dex */
public class ImageTextBannerElement extends UIElement {
    private String imageUrl;
    private UILink link;
    private String subTitle;
    private String title;
    private String trackId;

    public ImageTextBannerElement(String imageUrl, String title, String subTitle, UILink link, String trackId) {
        super(26);
        this.imageUrl = imageUrl;
        this.title = title;
        this.subTitle = subTitle;
        this.link = link;
        this.trackId = trackId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public UILink getLink() {
        return this.link;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackId() {
        return this.trackId;
    }
}
