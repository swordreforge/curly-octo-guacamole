package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5786c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.e */
/* JADX INFO: loaded from: classes3.dex */
public class C5795e {

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<IBinder> f32382a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b */
    ServiceConnection f32383b = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.LenovoDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32351a.f32382a.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: a */
    public String m20325a(Context context) {
        context.getPackageName();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        String strMo20302a = "";
        if (context.bindService(intent, this.f32383b, 1)) {
            try {
                try {
                    IBinder iBinderPoll = this.f32382a.poll(1L, TimeUnit.SECONDS);
                    if (iBinderPoll == null) {
                        return "";
                    }
                    strMo20302a = new InterfaceC5786c.a.C8037a(iBinderPoll).mo20302a();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    context.unbindService(this.f32383b);
                } catch (Exception unused) {
                }
            } finally {
                try {
                    context.unbindService(this.f32383b);
                } catch (Exception unused2) {
                }
            }
        }
        return strMo20302a;
    }
}
