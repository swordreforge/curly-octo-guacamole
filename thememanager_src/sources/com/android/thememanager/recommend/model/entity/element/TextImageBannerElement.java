package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;

/* JADX INFO: loaded from: classes2.dex */
public class TextImageBannerElement extends UIElement {
    private String imageUrl;
    private UILink link;
    private int position;
    private String title;

    public TextImageBannerElement(String imageUrl, UILink link, String title) {
        super(8);
        this.imageUrl = imageUrl;
        this.link = link;
        this.title = title;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public UILink getLink() {
        return this.link;
    }

    public String getTitle() {
        return this.title;
    }
}
