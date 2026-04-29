package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
class f7l8 extends AbstractServiceConnectionC5349q<Void, IMiFamilyService> {

    /* JADX INFO: renamed from: p */
    final /* synthetic */ C5346y f29843p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29844s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f7l8(C5346y c5346y, Context context, Class cls, String str) {
        super(context, cls);
        this.f29843p = c5346y;
        this.f29844s = str;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(IMiFamilyService iMiFamilyService) {
        try {
            iMiFamilyService.trackClick(this.f29844s);
            return null;
        } catch (Exception e2) {
            Log.e("MiFamilyManager", "trackClick : ", e2);
            return null;
        }
    }
}
