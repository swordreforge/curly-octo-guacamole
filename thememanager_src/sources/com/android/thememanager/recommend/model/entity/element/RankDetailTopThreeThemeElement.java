package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RankDetailTopThreeThemeElement extends UIElement {
    private List<UIProduct> products;
    private String subTitle;
    private String title;
    private String trackId;

    public RankDetailTopThreeThemeElement(List<UIProduct> products, String title, String subTitle, String trackId) {
        super(36);
        this.products = products;
        this.title = title;
        this.subTitle = subTitle;
        this.trackId = trackId;
    }

    public List<UIProduct> getProducts() {
        return this.products;
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
