package com.miui.systemAdSolution.miuiHome;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: compiled from: MiuiHomeDownloadActivateManager.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends AbstractServiceConnectionC5349q<Boolean, IMiuiHomeDownloadActivateService> {

    /* JADX INFO: renamed from: s */
    final /* synthetic */ zy f29857s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    toq(zy zyVar, Context context, Class cls) {
        super(context, cls);
        this.f29857s = zyVar;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Boolean mo18148p(IMiuiHomeDownloadActivateService iMiuiHomeDownloadActivateService) {
        try {
            return Boolean.valueOf(iMiuiHomeDownloadActivateService.showDownloadNotification());
        } catch (Exception e2) {
            Log.e("", "MiuiHomeDownloadActivateManagershowDownloadNotification : ", e2);
            return Boolean.FALSE;
        }
    }
}
