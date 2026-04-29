package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class IconChosenElement extends UIElement {
    private boolean hasMoreOtherCard;
    private boolean isFirstCard;
    private boolean isLastCard;
    private UILink link;
    private int productCount;
    private List<UIProduct> products;
    private boolean showPrice;
    private String subjectUuid;
    private String title;
    private String trackId;

    public IconChosenElement() {
        super(114);
    }

    public UILink getLink() {
        return this.link;
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

    public int getTotalCount() {
        return this.productCount;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public boolean isFirstCard() {
        return this.isFirstCard;
    }

    public boolean isHasMoreOtherCard() {
        return this.hasMoreOtherCard;
    }

    public boolean isLastCard() {
        return this.isLastCard;
    }

    public boolean isShowPrice() {
        return this.showPrice;
    }

    public void setFirstCard(boolean isFirstCard) {
        this.isFirstCard = isFirstCard;
    }

    public void setHasMoreOtherCard(boolean hasOtherCard) {
        this.hasMoreOtherCard = hasOtherCard;
    }

    public void setLastCard(boolean isLastCard) {
        this.isLastCard = isLastCard;
    }

    public void setLink(UILink link) {
        this.link = link;
    }

    public void setProducts(List<UIProduct> products) {
        this.products = products;
    }

    public void setShowPrice(boolean isShowPrice) {
        this.showPrice = isShowPrice;
    }

    public void setSubjectUuid(String subjectUuid) {
        this.subjectUuid = subjectUuid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalCount(int productCount) {
        this.productCount = productCount;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}
