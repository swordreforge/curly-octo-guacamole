package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperProductsElement extends UIElement {
    private String imageUrl;
    private String pageUuid;
    private List<UIProduct> products;
    private String subTitle;
    private String subjectUuid;
    private String title;
    private String trackId;

    public WallpaperProductsElement(int cardType, String title, String subTitle, String pageUuid, String subjectUuid, List<UIProduct> products, String imageUrl, String trackId) {
        super(cardType);
        this.title = title;
        this.subTitle = subTitle;
        this.pageUuid = pageUuid;
        this.products = products;
        this.subjectUuid = subjectUuid;
        this.imageUrl = imageUrl;
        this.trackId = trackId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPageUuid() {
        return this.pageUuid;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackId() {
        return this.trackId;
    }
}
