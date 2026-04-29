package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPage.s */
/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5333s extends AbstractServiceConnectionC5349q<Void, ILandingPageService> {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C5331p f29791h;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ ILandingPageListener f29792p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5333s(C5331p c5331p, Context context, Class cls, String str, ILandingPageListener iLandingPageListener) {
        super(context, cls);
        this.f29791h = c5331p;
        this.f29793s = str;
        this.f29792p = iLandingPageListener;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(ILandingPageService iLandingPageService) {
        try {
            iLandingPageService.unregisterListener(this.f29793s, this.f29792p);
            return null;
        } catch (Exception e2) {
            Log.e("LandingPageManager", "unregisterListener : ", e2);
            return null;
        }
    }
}
