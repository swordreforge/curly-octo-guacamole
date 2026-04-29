package com.miui.unifiedAdSdk;

import android.util.Log;
import com.miui.systemAdSolution.changeSkin.IChangeSkinService;
import com.miui.systemAdSolution.common.EnumPracle;
import com.miui.unifiedAdSdk.f7l8;
import com.xiaomi.ad.entity.unified.EnumC5594k;

/* JADX INFO: renamed from: com.miui.unifiedAdSdk.k */
/* JADX INFO: compiled from: ExeCommandUtil.java */
/* JADX INFO: loaded from: classes3.dex */
final class C5352k extends f7l8.AbstractRunnableC5350k<String, String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5352k(f7l8 f7l8Var, String str) {
        super(str);
        f7l8Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.miui.unifiedAdSdk.f7l8.AbstractRunnableC5350k
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public void zy(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.miui.unifiedAdSdk.f7l8.AbstractRunnableC5350k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String toq(IChangeSkinService iChangeSkinService, String str) {
        EnumPracle enumPracle = new EnumPracle(EnumC5594k.SET_RECOMMAND_AD_SWITCH_STATE);
        Log.d(f7l8.f72510f7l8, "exe command.the command type is " + ((EnumC5594k) enumPracle.getValue()).name() + ";the arags is " + str);
        return iChangeSkinService.exec(enumPracle, str);
    }
}
