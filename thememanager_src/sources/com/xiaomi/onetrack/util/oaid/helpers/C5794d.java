package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5785b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.d */
/* JADX INFO: loaded from: classes3.dex */
public class C5794d {

    /* JADX INFO: renamed from: c */
    private static final String f32379c = "HWDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<IBinder> f32380a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b */
    ServiceConnection f32381b = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.HWDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32350a.f32380a.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                C5804p.m20342a("HWDeviceIDHelper", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:32:0x006d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public String m20324a(Context context) {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        String strMo20300a = "";
        if (context.bindService(intent, this.f32381b, 1)) {
            try {
                try {
                    try {
                        IBinder iBinderPoll = this.f32380a.poll(1L, TimeUnit.SECONDS);
                        if (iBinderPoll == null) {
                            return "";
                        }
                        strMo20300a = new InterfaceC5785b.a(iBinderPoll).mo20300a();
                        context.unbindService(this.f32381b);
                    } catch (Exception e2) {
                        C5804p.m20342a(f32379c, e2.getMessage());
                        context.unbindService(this.f32381b);
                    }
                } catch (Exception e3) {
                    C5804p.m20342a(f32379c, e3.getMessage());
                }
            } finally {
                try {
                    context.unbindService(this.f32381b);
                } catch (Exception e4) {
                    C5804p.m20342a(f32379c, e4.getMessage());
                }
            }
        }
        return strMo20300a;
    }
}
