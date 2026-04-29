package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ThreeThemeGroupElement extends UIElement {
    private boolean isShowDivider;
    private List<UIProduct> originProducts;
    private List<UIProduct> products;
    private String subjectUuid;

    public ThreeThemeGroupElement(boolean isShowDivider, List<UIProduct> originProducts, String subjectUuid, List<UIProduct> products) {
        super(5);
        this.isShowDivider = isShowDivider;
        this.originProducts = originProducts;
        this.subjectUuid = subjectUuid;
        this.products = products;
    }

    public List<UIProduct> getOriginProducts() {
        return this.originProducts;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }

    public boolean isShowDivider() {
        return this.isShowDivider;
    }
}
