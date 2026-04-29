package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends AbstractServiceConnectionC5349q<Integer, ILandingPageService> {

    /* JADX INFO: renamed from: p */
    final /* synthetic */ C5331p f29794p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29795s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    toq(C5331p c5331p, Context context, Class cls, String str) {
        super(context, cls);
        this.f29794p = c5331p;
        this.f29795s = str;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Integer mo18148p(ILandingPageService iLandingPageService) {
        try {
            return Integer.valueOf(iLandingPageService.getPackageInstallationStatus(this.f29795s));
        } catch (Exception e2) {
            Log.e("LandingPageManager", "getPackageInstallationStatus : ", e2);
            return -1;
        }
    }
}
