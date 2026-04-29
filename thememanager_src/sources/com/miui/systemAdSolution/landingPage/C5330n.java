package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPage.n */
/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5330n extends AbstractServiceConnectionC5349q<Boolean, ILandingPageService> {

    /* JADX INFO: renamed from: p */
    final /* synthetic */ C5331p f29785p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29786s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5330n(C5331p c5331p, Context context, Class cls, String str) {
        super(context, cls);
        this.f29785p = c5331p;
        this.f29786s = str;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Boolean mo18148p(ILandingPageService iLandingPageService) {
        try {
            iLandingPageService.cancleDownload(this.f29786s);
        } catch (Exception e2) {
            Log.e("LandingPageManager", "cancelDownload : ", e2);
        }
        return Boolean.FALSE;
    }
}
