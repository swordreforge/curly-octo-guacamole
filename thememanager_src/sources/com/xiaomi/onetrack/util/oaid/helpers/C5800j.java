package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5788e;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.j */
/* JADX INFO: loaded from: classes3.dex */
public class C5800j {

    /* JADX INFO: renamed from: d */
    private static final String f32397d = "OppoDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    InterfaceC5788e f32398a;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<IBinder> f32399b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: c */
    ServiceConnection f32400c = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.OppoDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f32353a.f32399b.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                C5804p.m20342a("OppoDeviceIDHelper", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f32353a.f32398a = null;
        }
    };

    /* JADX INFO: renamed from: e */
    private String f32401e;

    /* JADX INFO: renamed from: b */
    private boolean m20334b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (packageInfo == null) {
                return false;
            }
            return ((long) packageInfo.versionCode) >= 1;
        } catch (Exception e2) {
            C5804p.m20342a(f32397d, e2.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m20335a(Context context) {
        String strM20333a;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        strM20333a = "";
        if (context.bindService(intent, this.f32400c, 1)) {
            try {
                try {
                    try {
                        IBinder iBinderPoll = this.f32399b.poll(1L, TimeUnit.SECONDS);
                        if (iBinderPoll == null) {
                            return "";
                        }
                        InterfaceC5788e interfaceC5788eM20308a = InterfaceC5788e.a.m20308a(iBinderPoll);
                        this.f32398a = interfaceC5788eM20308a;
                        strM20333a = interfaceC5788eM20308a != null ? m20333a("OUID", context) : "";
                        context.unbindService(this.f32400c);
                    } catch (Exception e2) {
                        C5804p.m20342a(f32397d, e2.getMessage());
                        context.unbindService(this.f32400c);
                    }
                } catch (Exception e3) {
                    C5804p.m20342a(f32397d, e3.getMessage());
                }
            } finally {
                try {
                    context.unbindService(this.f32400c);
                } catch (Exception e4) {
                    C5804p.m20342a(f32397d, e4.getMessage());
                }
            }
        }
        return strM20333a;
    }

    /* JADX INFO: renamed from: a */
    private String m20333a(String str, Context context) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (this.f32401e == null) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e2) {
                e2.printStackTrace();
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
                    e3.printStackTrace();
                }
            }
            this.f32401e = string;
        }
        return ((InterfaceC5788e.a.C8039a) this.f32398a).m20309a(packageName, this.f32401e, str);
    }
}
