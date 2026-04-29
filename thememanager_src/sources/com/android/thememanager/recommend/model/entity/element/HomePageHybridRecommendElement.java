package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HomePageHybridRecommendElement extends UIElement {
    protected String darkTitlePic;
    protected String guide;
    protected List<UIProduct> products;
    protected String subjectUuid;
    protected String subtitle;
    protected String title;
    protected String titlePic;
    protected String trackId;

    protected HomePageHybridRecommendElement(int cardType) {
        super(cardType);
    }

    public String getDarkTitlePic() {
        return this.darkTitlePic;
    }

    public String getGuide() {
        return this.guide;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitlePic() {
        return this.titlePic;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public void setDarkTitlePic(String darkTitlePic) {
        this.darkTitlePic = darkTitlePic;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public void setProducts(List<UIProduct> products) {
        this.products = products;
    }

    public void setSubjectUuid(String subjectUuid) {
        this.subjectUuid = subjectUuid;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}
