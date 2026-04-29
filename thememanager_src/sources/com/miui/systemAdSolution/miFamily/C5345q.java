package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.miFamily.q */
/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5345q extends AbstractServiceConnectionC5349q<String, IMiFamilyService> {

    /* JADX INFO: renamed from: s */
    final /* synthetic */ C5346y f29849s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5345q(C5346y c5346y, Context context, Class cls) {
        super(context, cls);
        this.f29849s = c5346y;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public String mo18148p(IMiFamilyService iMiFamilyService) {
        try {
            return iMiFamilyService.getMiFamilyTitle();
        } catch (Exception e2) {
            Log.e("MiFamilyManager", "getMiFamilyTitle : ", e2);
            return null;
        }
    }
}
