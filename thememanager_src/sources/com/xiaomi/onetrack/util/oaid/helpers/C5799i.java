package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5787d;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5799i {

    /* JADX INFO: renamed from: d */
    private static final String f32392d = "OnePlusDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    InterfaceC5787d f32393a;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<IBinder> f32394b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: c */
    ServiceConnection f32395c = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.OnePlusDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32352a.f32394b.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                C5804p.m20342a("OnePlusDeviceIDHelper", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f32352a.f32393a = null;
        }
    };

    /* JADX INFO: renamed from: e */
    private String f32396e;

    /* JADX INFO: renamed from: b */
    private boolean m20331b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (packageInfo == null) {
                return false;
            }
            return ((long) packageInfo.versionCode) >= 1;
        } catch (Exception e2) {
            C5804p.m20342a(f32392d, e2.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m20332a(Context context) {
        String strM20330a;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        strM20330a = "";
        if (context.bindService(intent, this.f32395c, 1)) {
            try {
                try {
                    try {
                        IBinder iBinderPoll = this.f32394b.poll(1L, TimeUnit.SECONDS);
                        if (iBinderPoll == null) {
                            return "";
                        }
                        InterfaceC5787d interfaceC5787dM20306a = InterfaceC5787d.a.m20306a(iBinderPoll);
                        this.f32393a = interfaceC5787dM20306a;
                        strM20330a = interfaceC5787dM20306a != null ? m20330a("OUID", context) : "";
                        context.unbindService(this.f32395c);
                    } catch (Exception e2) {
                        C5804p.m20342a(f32392d, e2.getMessage());
                        context.unbindService(this.f32395c);
                    }
                } catch (Exception e3) {
                    C5804p.m20342a(f32392d, e3.getMessage());
                }
            } finally {
                try {
                    context.unbindService(this.f32395c);
                } catch (Exception e4) {
                    C5804p.m20342a(f32392d, e4.getMessage());
                }
            }
        }
        return strM20330a;
    }

    /* JADX INFO: renamed from: a */
    private String m20330a(String str, Context context) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (this.f32396e == null) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e2) {
                C5804p.m20342a(f32392d, e2.getMessage());
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : bArrDigest) {
                            sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (Exception e3) {
                    C5804p.m20342a(f32392d, e3.getMessage());
                }
            }
            this.f32396e = string;
        }
        return ((InterfaceC5787d.a.C8038a) this.f32393a).m20307a(packageName, this.f32396e, str);
    }
}
