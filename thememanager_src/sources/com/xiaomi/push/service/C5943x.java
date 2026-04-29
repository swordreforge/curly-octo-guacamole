package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.push.kbj;
import com.xiaomi.push.o5;
import com.xiaomi.push.service.XMPushService.C5902q;
import com.xiaomi.push.service.XMPushService.qrj;
import com.xiaomi.push.xtb7;

/* JADX INFO: renamed from: com.xiaomi.push.service.x */
/* JADX INFO: loaded from: classes3.dex */
class C5943x implements kbj {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ XMPushService f33929k;

    C5943x(XMPushService xMPushService) {
        this.f33929k = xMPushService;
    }

    @Override // com.xiaomi.push.kbj
    /* JADX INFO: renamed from: k */
    public void mo20972k(xtb7 xtb7Var) {
        XMPushService xMPushService = this.f33929k;
        xMPushService.m21530a(xMPushService.new qrj(xtb7Var));
    }

    @Override // com.xiaomi.push.kbj
    public void toq(o5 o5Var) {
        if (vq.m21773k(o5Var)) {
            C5914f.m21604k().m21607q(o5Var.jk(), SystemClock.elapsedRealtime(), this.f33929k.m21522a());
        }
        XMPushService xMPushService = this.f33929k;
        xMPushService.m21530a(xMPushService.new C5902q(o5Var));
    }
}
