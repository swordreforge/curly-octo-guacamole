package com.miui.systemAdSolution.miuiHome;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.miuiHome.k */
/* JADX INFO: compiled from: MiuiHomeDownloadActivateManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5347k extends AbstractServiceConnectionC5349q<Integer, IMiuiHomeDownloadActivateService> {

    /* JADX INFO: renamed from: s */
    final /* synthetic */ zy f29856s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5347k(zy zyVar, Context context, Class cls) {
        super(context, cls);
        this.f29856s = zyVar;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Integer mo18148p(IMiuiHomeDownloadActivateService iMiuiHomeDownloadActivateService) {
        try {
            return Integer.valueOf(iMiuiHomeDownloadActivateService.getServiceVersion());
        } catch (Exception e2) {
            Log.e("", "MiuiHomeDownloadActivateManagergetServiceVersion : ", e2);
            return -1;
        }
    }
}
