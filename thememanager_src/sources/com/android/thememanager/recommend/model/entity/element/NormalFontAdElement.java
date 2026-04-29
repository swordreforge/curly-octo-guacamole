package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public class NormalFontAdElement extends UIElement {
    private String mAdEid;
    private AdInfo mAdInfo;

    public NormalFontAdElement(AdInfo adInfo, String adEid) {
        super(120);
        this.mAdInfo = adInfo;
        this.mAdEid = adEid;
    }

    public String getAdEid() {
        return this.mAdEid;
    }

    public AdInfo getAdInfo() {
        return this.mAdInfo;
    }
}
