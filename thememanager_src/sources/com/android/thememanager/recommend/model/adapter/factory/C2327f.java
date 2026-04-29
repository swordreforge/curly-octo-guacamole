package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.RingtoneTopBannerElement;
import com.android.thememanager.recommend.model.entity.element.UITopBannerElement;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.f */
/* JADX INFO: compiled from: RingtoneTopImageBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2327f extends AbstractC2335n {
    @Override // com.android.thememanager.recommend.model.adapter.factory.AbstractC2335n
    protected qrj toq() {
        return new x9kr();
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.AbstractC2335n
    protected UITopBannerElement zy(String topBannerImageUrl, String subjectUuid, String title, String trackId) {
        return new RingtoneTopBannerElement(topBannerImageUrl, subjectUuid, title, trackId);
    }
}
