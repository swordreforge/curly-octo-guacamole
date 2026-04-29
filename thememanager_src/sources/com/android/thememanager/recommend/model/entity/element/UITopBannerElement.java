package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UITopBannerElement extends UIElement {
    private String subjectUuid;
    private String title;
    private String topBannerImageUrl;
    private String trackId;

    public UITopBannerElement(int cardType, String topBannerImageUrl, String subjectUuid, String title, String trackId) {
        super(cardType);
        this.topBannerImageUrl = topBannerImageUrl;
        this.subjectUuid = subjectUuid;
        this.title = title;
        this.trackId = trackId;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopBannerImageUrl() {
        return this.topBannerImageUrl;
    }

    public String getTrackId() {
        return this.trackId;
    }
}
