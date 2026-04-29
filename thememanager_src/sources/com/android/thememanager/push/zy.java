package com.android.thememanager.push;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.push.InterfaceC2316n;
import java.util.List;

/* JADX INFO: compiled from: ThemePushActionApp.java */
/* JADX INFO: loaded from: classes2.dex */
class zy extends C2315k {

    /* JADX INFO: renamed from: q */
    private Intent f13523q;

    protected zy(C2319y pushMsg) {
        super(pushMsg);
        this.f13523q = null;
    }

    @Override // com.android.thememanager.push.C2315k
    /* JADX INFO: renamed from: q */
    protected Intent mo8469q() {
        return this.f13523q;
    }

    @Override // com.android.thememanager.push.C2315k
    protected void qrj() {
        if (InterfaceC2316n.toq.f13517n.equals(this.f60608toq.f60622x2.get(InterfaceC2316n.zy.f13518k))) {
            try {
                Intent intentZy = x9kr.zy(this.f60608toq.f60622x2.get(InterfaceC2316n.toq.f13516g));
                List<ResolveInfo> listQueryIntentActivities = this.f13498k.getPackageManager().queryIntentActivities(intentZy, 0);
                if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                    return;
                }
                intentZy.addFlags(268435456);
                this.f13523q = intentZy;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
