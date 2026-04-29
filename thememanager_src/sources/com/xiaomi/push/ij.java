package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class ij {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile ij f73364zy;

    /* JADX INFO: renamed from: k */
    private Context f33023k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC5869k f73365toq;

    /* JADX INFO: renamed from: com.xiaomi.push.ij$k */
    public interface InterfaceC5869k {
        /* JADX INFO: renamed from: a */
        void m20978a();
    }

    private ij(Context context) {
        this.f33023k = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        InterfaceC5869k interfaceC5869k;
        C5889p qVar = C5889p.toq(this.f33023k);
        com.xiaomi.push.service.a9 a9VarM21550q = com.xiaomi.push.service.a9.m21550q(this.f33023k);
        SharedPreferences sharedPreferences = this.f33023k.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = sharedPreferences.getLong("first_try_ts", jCurrentTimeMillis);
        if (j2 == jCurrentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", jCurrentTimeMillis).commit();
        }
        if (Math.abs(jCurrentTimeMillis - j2) < 172800000) {
            return;
        }
        m20976n(a9VarM21550q, qVar, false);
        if (a9VarM21550q.qrj(oph.StorageCollectionSwitch.m21370a(), true)) {
            int iM20975k = m20975k(a9VarM21550q.m21553k(oph.StorageCollectionFrequency.m21370a(), 86400));
            qVar.ld6(new n2t(this.f33023k, iM20975k), iM20975k, 0);
        }
        if (nc.m21313p(this.f33023k) && (interfaceC5869k = this.f73365toq) != null) {
            interfaceC5869k.m20978a();
        }
        if (a9VarM21550q.qrj(oph.ActivityTSSwitch.m21370a(), false)) {
            m20974g();
        }
        m20976n(a9VarM21550q, qVar, true);
    }

    /* JADX INFO: renamed from: g */
    private boolean m20974g() {
        try {
            Context context = this.f33023k;
            (context instanceof Application ? (Application) context : (Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new wx16(this.f33023k, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m20975k(int i2) {
        return Math.max(60, i2);
    }

    /* JADX INFO: renamed from: n */
    private void m20976n(com.xiaomi.push.service.a9 a9Var, C5889p c5889p, boolean z2) {
        if (a9Var.qrj(oph.UploadSwitch.m21370a(), true)) {
            pjz9 pjz9Var = new pjz9(this.f33023k);
            if (z2) {
                c5889p.m21376p(pjz9Var, m20975k(a9Var.m21553k(oph.UploadFrequency.m21370a(), 86400)));
            } else {
                c5889p.m21377s(pjz9Var);
            }
        }
    }

    public static ij toq(Context context) {
        if (f73364zy == null) {
            synchronized (ij.class) {
                if (f73364zy == null) {
                    f73364zy = new ij(context);
                }
            }
        }
        return f73364zy;
    }

    public void zy() {
        C5889p.toq(this.f33023k).f7l8(new nsb(this));
    }
}
