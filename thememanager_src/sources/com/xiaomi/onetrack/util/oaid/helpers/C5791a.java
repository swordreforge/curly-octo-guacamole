package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5784a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5791a {

    /* JADX INFO: renamed from: c */
    private static final String f32356c = "ASUSDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<IBinder> f32357a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b */
    ServiceConnection f32358b = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.ASUSDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32349a.f32357a.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                C5804p.m20342a("ASUSDeviceIDHelper", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:28:0x0077). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public String m20315a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        String strMo20299a = "";
        try {
        } catch (Exception e2) {
            C5804p.m20342a(f32356c, e2.getMessage());
        }
        if (context.bindService(intent, this.f32358b, 1)) {
            try {
                try {
                    IBinder iBinderPoll = this.f32357a.poll(1L, TimeUnit.SECONDS);
                    if (iBinderPoll == null) {
                        return "";
                    }
                    strMo20299a = new InterfaceC5784a.a(iBinderPoll).mo20299a();
                    context.unbindService(this.f32358b);
                } catch (Exception e3) {
                    C5804p.m20342a(f32356c, e3.getMessage());
                    context.unbindService(this.f32358b);
                }
            } finally {
                try {
                    context.unbindService(this.f32358b);
                } catch (Exception e4) {
                    C5804p.m20342a(f32356c, e4.getMessage());
                }
            }
        }
        return strMo20299a;
    }
}
