package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class kt06 implements XMPushService.n7h {

    /* JADX INFO: renamed from: q */
    private static boolean f33231q = false;

    /* JADX INFO: renamed from: k */
    private Context f33232k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f73400toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73401zy;

    public kt06(Context context) {
        this.f33232k = context;
    }

    /* JADX INFO: renamed from: k */
    private String m21142k(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f33232k.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    /* JADX INFO: renamed from: n */
    private boolean m21143n(ula6 ula6Var) {
        if (!oc.zurt(this.f33232k) || ula6Var == null || TextUtils.isEmpty(m21142k(this.f33232k.getPackageName())) || !new File(this.f33232k.getFilesDir(), "tiny_data.data").exists() || f33231q) {
            return false;
        }
        return !com.xiaomi.push.service.a9.m21550q(this.f33232k).qrj(oph.ScreenOnOrChargingTinyDataUploadSwitch.m21370a(), false) || m8.ld6(this.f33232k) || m8.cdj(this.f33232k);
    }

    /* JADX INFO: renamed from: q */
    private boolean m21144q() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f33232k.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f73401zy);
    }

    private void toq(Context context) {
        this.f73400toq = com.xiaomi.push.service.a9.m21550q(context).qrj(oph.TinyDataUploadSwitch.m21370a(), true);
        int iM21553k = com.xiaomi.push.service.a9.m21550q(context).m21553k(oph.TinyDataUploadFrequency.m21370a(), 7200);
        this.f73401zy = iM21553k;
        this.f73401zy = Math.max(60, iM21553k);
    }

    public static void zy(boolean z2) {
        f33231q = z2;
    }

    @Override // com.xiaomi.push.service.XMPushService.n7h
    /* JADX INFO: renamed from: a */
    public void mo21145a() {
        toq(this.f33232k);
        if (this.f73400toq && m21144q()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            ula6 qVar = uo.m21870k(this.f33232k).toq();
            if (m21143n(qVar)) {
                f33231q = true;
                d1ts.toq(this.f33232k, qVar);
            } else {
                com.xiaomi.channel.commonutils.logger.zy.kja0("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }
}
