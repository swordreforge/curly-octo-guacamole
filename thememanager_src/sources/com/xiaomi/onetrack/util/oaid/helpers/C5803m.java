package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5790g;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.m */
/* JADX INFO: loaded from: classes3.dex */
public class C5803m {

    /* JADX INFO: renamed from: d */
    private static final String f32406d = "ZTEDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    String f32407a = "com.mdid.msa";

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<IBinder> f32408b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: c */
    ServiceConnection f32409c = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.ZTEDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32355a.f32408b.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                C5804p.m20342a("ZTEDeviceIDHelper", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: a */
    private void m20338a(String str, Context context) {
        Intent intent = new Intent();
        intent.setClassName(this.f32407a, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Exception e2) {
            C5804p.m20342a(f32406d, e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:33:0x0091). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public String m20339a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(this.f32407a, 0);
        } catch (Exception e2) {
            C5804p.m20342a(f32406d, e2.getMessage());
        }
        String packageName = context.getPackageName();
        m20338a(packageName, context);
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", packageName);
        String strMo20313b = "";
        try {
            try {
            } finally {
                try {
                    context.unbindService(this.f32409c);
                } catch (Exception e3) {
                    C5804p.m20342a(f32406d, e3.getMessage());
                }
            }
        } catch (Exception e4) {
            String message = e4.getMessage();
            C5804p.m20342a(f32406d, message);
            context = message;
        }
        if (context.bindService(intent, this.f32409c, 1)) {
            try {
                IBinder iBinderPoll = this.f32408b.poll(1L, TimeUnit.SECONDS);
                if (iBinderPoll == null) {
                    return "";
                }
                strMo20313b = new InterfaceC5790g.a.C8040a(iBinderPoll).mo20313b();
                context.unbindService(this.f32409c);
                context = context;
            } catch (Exception e6) {
                C5804p.m20342a(f32406d, e6.getMessage());
                context.unbindService(this.f32409c);
                context = context;
            }
        }
        return strMo20313b;
    }
}
