package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredRingtoneSubjectElement extends UIImageBannerElement {
    private List<UIProduct> products;

    public StaggeredRingtoneSubjectElement(UIImageWithLink imageBanner, List<UIProduct> products) {
        super(79, imageBanner);
        this.products = products;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }
}
