package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPage.q */
/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5332q extends AbstractServiceConnectionC5349q<Void, ILandingPageService> {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C5331p f29788h;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ Bundle f29789p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29790s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5332q(C5331p c5331p, Context context, Class cls, String str, Bundle bundle) {
        super(context, cls);
        this.f29788h = c5331p;
        this.f29790s = str;
        this.f29789p = bundle;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(ILandingPageService iLandingPageService) {
        try {
            iLandingPageService.startDownload(this.f29790s, this.f29789p);
            return null;
        } catch (Exception e2) {
            Log.e("LandingPageManager", "startDownload : ", e2);
            return null;
        }
    }
}
