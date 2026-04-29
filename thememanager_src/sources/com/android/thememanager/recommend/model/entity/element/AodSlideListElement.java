package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AodSlideListElement extends UIElement {
    private UILink link;
    private int productCount;
    private List<UIProduct> products;
    private String subjectUuid;
    private String title;
    private String trackId;

    public AodSlideListElement() {
        super(110);
    }

    public UILink getLink() {
        return this.link;
    }

    public int getProductCount() {
        return this.productCount;
    }

    public List<UIProduct> getProducts() {
        return this.products;
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

    public void setLink(UILink link) {
        this.link = link;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void setProducts(List<UIProduct> products) {
        this.products = products;
    }

    public void setSubjectUuid(String subjectUuid) {
        this.subjectUuid = subjectUuid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}
