package com.android.thememanager.util;

import android.content.Intent;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.Resource;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: PadThemeTrialManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class y9n extends r8s8 {

    /* JADX INFO: renamed from: b */
    public static final String f16910b = "restore_local_id";

    /* JADX INFO: renamed from: m */
    public static final String f16911m = "local_id";

    /* JADX INFO: renamed from: o */
    public static final String f16912o = "com.setting.pad.LOCAL_SETTING_FONT";

    public static Intent kja0(String currentlocalId, String restoreLocalId, boolean purchase) {
        Intent intent = new Intent(f16912o);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(335544320);
        intent.putExtra(f16911m, currentlocalId);
        intent.putExtra(f16910b, restoreLocalId);
        if (purchase) {
            intent.putExtra(InterfaceC1357q.f53906lvui, purchase);
        }
        return intent;
    }

    @Override // com.android.thememanager.util.r8s8
    /* JADX INFO: renamed from: s */
    protected void mo9979s(com.android.thememanager.fu4 resContext, String resTitle, String resBuddleLocalId, String resRightPath) {
        m9978p(resRightPath);
        x2(this.f16782k, resTitle, resBuddleLocalId, resContext.getResourceCode());
        Resource resourceLd6 = new com.android.thememanager.controller.x2(resContext).m7690k().ld6();
        Intent intentKja0 = kja0(resBuddleLocalId, (resourceLd6 == null || TextUtils.isEmpty(resourceLd6.getLocalId())) ? "0" : resourceLd6.getLocalId(), true);
        intentKja0.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        this.f16782k.startActivity(intentKja0);
    }

    @Override // com.android.thememanager.util.r8s8
    /* JADX INFO: renamed from: y */
    protected void mo9980y(com.android.thememanager.fu4 resContext, String resTitle, String resBuddleLocalId, String resRightPath) {
        m9978p(resRightPath);
        Resource resourceLd6 = new com.android.thememanager.controller.x2(resContext).m7690k().ld6();
        Intent intentKja0 = kja0(resBuddleLocalId, (resourceLd6 == null || TextUtils.isEmpty(resourceLd6.getLocalId())) ? "0" : resourceLd6.getLocalId(), false);
        intentKja0.putExtra(InterfaceC1357q.f53963x9kr, true);
        intentKja0.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        this.f16782k.startActivity(intentKja0);
    }
}
