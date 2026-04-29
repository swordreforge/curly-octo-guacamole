package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5789f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5801k {

    /* JADX INFO: renamed from: c */
    private static final String f32402c = "SamsungDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<IBinder> f32403a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b */
    ServiceConnection f32404b = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.SamsungDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32354a.f32403a.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                C5804p.m20342a("SamsungDeviceIDHelper", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:32:0x006d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public String m20336a(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        String strMo20310a = "";
        if (context.bindService(intent, this.f32404b, 1)) {
            try {
                try {
                    try {
                        IBinder iBinderPoll = this.f32403a.poll(1L, TimeUnit.SECONDS);
                        if (iBinderPoll == null) {
                            return "";
                        }
                        strMo20310a = new InterfaceC5789f.a(iBinderPoll).mo20310a();
                        context.unbindService(this.f32404b);
                    } catch (Exception e2) {
                        C5804p.m20342a(f32402c, e2.getMessage());
                        context.unbindService(this.f32404b);
                    }
                } catch (Exception e3) {
                    C5804p.m20342a(f32402c, e3.getMessage());
                }
            } finally {
                try {
                    context.unbindService(this.f32404b);
                } catch (Exception e4) {
                    C5804p.m20342a(f32402c, e4.getMessage());
                }
            }
        }
        return strMo20310a;
    }
}
