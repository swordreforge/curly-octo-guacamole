package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.TopImageBannerElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.m */
/* JADX INFO: compiled from: TopImageBannerElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2334m extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13554k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60636toq;

    public C2334m(qrj elementFactory, int verify) {
        this.f13554k = elementFactory;
        this.f60636toq = verify;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.isAuthorized(this.f60636toq)) {
            arrayList.add(new TopImageBannerElement(16, card.topBannerImageUrl, card.subjectUuid, card.title, card.trackId));
            arrayList.addAll(this.f13554k.mo8509k(card));
        }
        return arrayList;
    }
}
