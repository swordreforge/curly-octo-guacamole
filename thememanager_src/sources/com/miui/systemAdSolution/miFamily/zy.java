package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
class zy extends AbstractServiceConnectionC5349q<String, IMiFamilyService> {

    /* JADX INFO: renamed from: s */
    final /* synthetic */ C5346y f29855s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zy(C5346y c5346y, Context context, Class cls) {
        super(context, cls);
        this.f29855s = c5346y;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public String mo18148p(IMiFamilyService iMiFamilyService) {
        try {
            return iMiFamilyService.getMiFamilyLogoPath();
        } catch (Exception e2) {
            Log.e("MiFamilyManager", "getMiFamilyLogoPath : ", e2);
            return null;
        }
    }
}
