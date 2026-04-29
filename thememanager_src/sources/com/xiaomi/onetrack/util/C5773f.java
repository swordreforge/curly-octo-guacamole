package com.xiaomi.onetrack.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.onetrack.p017f.C5756a;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.f */
/* JADX INFO: loaded from: classes3.dex */
class C5773f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5771d f32304a;

    C5773f(C5771d c5771d) {
        this.f32304a = c5771d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("host");
            String stringExtra2 = intent.getStringExtra("packagename");
            String stringExtra3 = intent.getStringExtra("projectId");
            String stringExtra4 = intent.getStringExtra("user");
            boolean booleanExtra = intent.getBooleanExtra("logon", false);
            boolean booleanExtra2 = intent.getBooleanExtra("quickuploadon", false);
            String strM20058e = C5756a.m20058e();
            if (!TextUtils.isEmpty(stringExtra2) && !"".equals(stringExtra2) && strM20058e.equals(stringExtra2)) {
                C5804p.f32410a = booleanExtra;
                C5804p.f32411b = booleanExtra2;
                if (booleanExtra2 && this.f32304a.m20249a(stringExtra)) {
                    this.f32304a.m20248a(stringExtra, stringExtra3, stringExtra4);
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b(C5771d.f32291a, e2.getMessage());
        }
    }
}
