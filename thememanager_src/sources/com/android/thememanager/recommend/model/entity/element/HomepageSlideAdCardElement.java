package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HomepageSlideAdCardElement extends UIElement {
    private List<AdInfo> adInfos;
    private String tagId;
    private String title;
    private String trackId;

    public HomepageSlideAdCardElement() {
        super(UIElement.HOMEPAGE_SILDE_AD_CARD);
    }

    public AdInfo getAdInfo(int index) {
        return this.adInfos.get(index);
    }

    public List<AdInfo> getAdInfos() {
        return this.adInfos;
    }

    public String getAdTagId() {
        return this.tagId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public void setAdInfos(List<AdInfo> adInfos) {
        this.adInfos = adInfos;
    }

    public void setAdTagId(String tagId) {
        this.tagId = tagId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}
