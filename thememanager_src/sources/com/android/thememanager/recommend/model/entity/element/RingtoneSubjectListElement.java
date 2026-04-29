package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RingtoneSubjectListElement extends UIElement {
    private String backImageUrl;
    private List<UIProduct> products;

    public RingtoneSubjectListElement(List<UIProduct> products, String backImageUrl) {
        super(20);
        this.products = products;
        this.backImageUrl = backImageUrl;
    }

    public String getBackImageUrl() {
        return this.backImageUrl;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }
}
