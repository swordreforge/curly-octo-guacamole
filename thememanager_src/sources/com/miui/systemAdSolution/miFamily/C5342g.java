package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.miFamily.g */
/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5342g extends AbstractServiceConnectionC5349q<Void, IMiFamilyService> {

    /* JADX INFO: renamed from: p */
    final /* synthetic */ C5346y f29845p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29846s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5342g(C5346y c5346y, Context context, Class cls, String str) {
        super(context, cls);
        this.f29845p = c5346y;
        this.f29846s = str;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(IMiFamilyService iMiFamilyService) {
        try {
            iMiFamilyService.trackView(this.f29846s);
            return null;
        } catch (Exception e2) {
            Log.e("MiFamilyManager", "trackView : ", e2);
            return null;
        }
    }
}
