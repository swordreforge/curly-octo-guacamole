package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;

/* JADX INFO: loaded from: classes2.dex */
public class AodProductElement extends UIElement {
    private final UIProduct product;

    public AodProductElement(int itemType, UIProduct pro) {
        super(itemType);
        this.product = pro;
    }

    public UIProduct getProduct() {
        return this.product;
    }
}
