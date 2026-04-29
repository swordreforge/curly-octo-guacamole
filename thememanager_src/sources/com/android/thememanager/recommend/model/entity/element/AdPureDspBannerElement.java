package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AdPureDspBannerElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AdPureDspBannerElement extends UIElement {

    @InterfaceC7396q
    private final AdInfo adInfo;

    @InterfaceC7396q
    private final UILink link;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPureDspBannerElement(@InterfaceC7396q UILink link, @InterfaceC7396q AdInfo adInfo) {
        super(UIElement.PURE_AD_DSP_BANNER);
        d2ok.m23075h(link, "link");
        d2ok.m23075h(adInfo, "adInfo");
        this.link = link;
        this.adInfo = adInfo;
    }

    @InterfaceC7396q
    public final AdInfo getAdInfo() {
        return this.adInfo;
    }

    @InterfaceC7396q
    public final UILink getLink() {
        return this.link;
    }
}
