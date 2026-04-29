package com.xiaomi.push.service;

import com.xiaomi.push.kl7m;
import com.xiaomi.push.ula6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r8s8 implements ula6 {

    /* JADX INFO: renamed from: k */
    private final XMPushService f33889k;

    public r8s8(XMPushService xMPushService) {
        this.f33889k = xMPushService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public String m21746q(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f33889k.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.ula6
    /* JADX INFO: renamed from: k */
    public void mo21747k(List<kl7m> list, String str, String str2) {
        this.f33889k.m21530a(new m4(this, 4, str, list, str2));
    }
}
