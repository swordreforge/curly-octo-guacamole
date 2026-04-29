package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;

/* JADX INFO: loaded from: classes2.dex */
public class FoldUIThemeRecommendElement extends UIElement {
    private UIProduct product;

    public FoldUIThemeRecommendElement(UIProduct product) {
        super(119);
        this.product = product;
    }

    public UIProduct getProduct() {
        return this.product;
    }
}
