package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class zy extends AbstractServiceConnectionC5349q<Void, ILandingPageService> {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C5331p f29798h;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ Bundle f29799p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29800s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zy(C5331p c5331p, Context context, Class cls, String str, Bundle bundle) {
        super(context, cls);
        this.f29798h = c5331p;
        this.f29800s = str;
        this.f29799p = bundle;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(ILandingPageService iLandingPageService) {
        try {
            iLandingPageService.showAppDetailCard(this.f29800s, this.f29799p);
            return null;
        } catch (Exception e2) {
            Log.e("LandingPageManager", "showAppDetailCard : ", e2);
            return null;
        }
    }
}
