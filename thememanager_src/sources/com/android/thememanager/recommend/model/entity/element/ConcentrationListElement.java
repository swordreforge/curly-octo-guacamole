package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ConcentrationListElement extends UIElement {
    private UILink link;
    private List<UIProduct> products;
    private String subTitle;
    private String subjectUuid;
    private String title;
    private String trackId;

    public ConcentrationListElement() {
        super(98);
    }

    public UILink getLink() {
        return this.link;
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

    public void setLink(UILink link) {
        this.link = link;
    }

    public void setProducts(List<UIProduct> products) {
        this.products = products;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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
