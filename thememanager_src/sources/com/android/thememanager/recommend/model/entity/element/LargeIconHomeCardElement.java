package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconHomeCardElement extends UIElement {
    private String cardType;
    private List<UIProduct> products;
    private String subjectUuid;
    private String title;
    private String trackId;

    public LargeIconHomeCardElement() {
        super(131);
    }

    public String getCardType() {
        return this.cardType;
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

    public void setCardType(String cardType) {
        this.cardType = cardType;
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
