package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RingtoneSingleElement extends UIElement {
    private String backImageUrl;
    private List<UIProduct> products;
    private String trackId;

    public RingtoneSingleElement(List<UIProduct> products, String backImageUrl, String trackId) {
        super(22);
        this.products = products;
        this.backImageUrl = backImageUrl;
        this.trackId = trackId;
    }

    public String getBackImageUrl() {
        return this.backImageUrl;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }

    public String getTrackId() {
        return this.trackId;
    }
}
