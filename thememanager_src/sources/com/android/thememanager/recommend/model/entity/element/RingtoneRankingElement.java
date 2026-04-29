package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RingtoneRankingElement extends UIElement {
    private boolean isShowDivider;
    private List<UIProduct> products;
    private String subjectImageUrl;
    private String subjectTitle;
    private String subjectUuid;
    private String trackId;

    public RingtoneRankingElement(boolean isShowDivider, String subjectUuid, String subjectTitle, String subjectImageUrl, List<UIProduct> products, String trackId) {
        super(21);
        this.isShowDivider = isShowDivider;
        this.subjectUuid = subjectUuid;
        this.subjectTitle = subjectTitle;
        this.subjectImageUrl = subjectImageUrl;
        this.products = products;
        this.trackId = trackId;
    }

    public List<UIProduct> getProducts() {
        return this.products;
    }

    public String getSubjectImageUrl() {
        return this.subjectImageUrl;
    }

    public String getSubjectTitle() {
        return this.subjectTitle;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public boolean isShowDivider() {
        return this.isShowDivider;
    }
}
