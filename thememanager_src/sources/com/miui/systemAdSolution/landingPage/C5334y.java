package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPage.y */
/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5334y extends AbstractServiceConnectionC5349q<Long, ILandingPageService> {

    /* JADX INFO: renamed from: p */
    final /* synthetic */ C5331p f29796p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29797s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5334y(C5331p c5331p, Context context, Class cls, String str) {
        super(context, cls);
        this.f29796p = c5331p;
        this.f29797s = str;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Long mo18148p(ILandingPageService iLandingPageService) {
        try {
            return Long.valueOf(iLandingPageService.getDownloadId(this.f29797s));
        } catch (Exception e2) {
            Log.e("LandingPageManager", "getDownloadId : ", e2);
            return null;
        }
    }
}
