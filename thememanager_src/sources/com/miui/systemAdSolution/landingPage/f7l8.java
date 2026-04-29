package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class f7l8 extends AbstractServiceConnectionC5349q<Integer, ILandingPageService> {

    /* JADX INFO: renamed from: s */
    final /* synthetic */ C5331p f29778s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f7l8(C5331p c5331p, Context context, Class cls) {
        super(context, cls);
        this.f29778s = c5331p;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Integer mo18148p(ILandingPageService iLandingPageService) {
        try {
            return Integer.valueOf(iLandingPageService.getServiceVersion());
        } catch (Exception e2) {
            Log.e("LandingPageManager", "getServiceVersion : ", e2);
            return -1;
        }
    }
}
