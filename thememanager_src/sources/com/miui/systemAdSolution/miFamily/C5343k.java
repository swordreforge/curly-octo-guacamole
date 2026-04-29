package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.miFamily.k */
/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5343k extends AbstractServiceConnectionC5349q<Boolean, IMiFamilyService> {

    /* JADX INFO: renamed from: s */
    final /* synthetic */ C5346y f29847s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5343k(C5346y c5346y, Context context, Class cls) {
        super(context, cls);
        this.f29847s = c5346y;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Boolean mo18148p(IMiFamilyService iMiFamilyService) {
        try {
            return Boolean.valueOf(iMiFamilyService.showMiFamily());
        } catch (Exception e2) {
            Log.e("MiFamilyManager", "showMiFamily : ", e2);
            return Boolean.FALSE;
        }
    }
}
