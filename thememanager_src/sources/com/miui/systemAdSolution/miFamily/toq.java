package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends AbstractServiceConnectionC5349q<String, IMiFamilyService> {

    /* JADX INFO: renamed from: p */
    final /* synthetic */ C5346y f29850p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29851s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    toq(C5346y c5346y, Context context, Class cls, String str) {
        super(context, cls);
        this.f29850p = c5346y;
        this.f29851s = str;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public String mo18148p(IMiFamilyService iMiFamilyService) {
        try {
            return iMiFamilyService.getMiFamilyUrl(this.f29851s);
        } catch (Exception e2) {
            Log.e("MiFamilyManager", "getMiFamilyUrl : ", e2);
            return null;
        }
    }
}
