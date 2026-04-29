package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public class NormalRingtoneAdElement extends UIElement {
    private AdInfo mAdInfo;

    public NormalRingtoneAdElement(AdInfo adInfo) {
        super(84);
        this.mAdInfo = adInfo;
    }

    public AdInfo getAdInfo() {
        return this.mAdInfo;
    }
}
