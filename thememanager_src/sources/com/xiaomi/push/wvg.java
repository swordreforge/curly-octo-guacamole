package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.exoplayer2.C3548p;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
class wvg implements InterfaceC5868i {

    /* JADX INFO: renamed from: g */
    private static boolean f34084g;

    /* JADX INFO: renamed from: k */
    private Context f34085k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ServiceConnection f73719toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile int f73720zy = 0;

    /* JADX INFO: renamed from: q */
    private volatile C5958k f34087q = null;

    /* JADX INFO: renamed from: n */
    private final Object f34086n = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.push.wvg$k */
    class C5958k {

        /* JADX INFO: renamed from: k */
        String f34088k;

        /* JADX INFO: renamed from: q */
        String f34090q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f73721toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f73722zy;

        private C5958k() {
            this.f34088k = null;
            this.f73721toq = null;
            this.f73722zy = null;
            this.f34090q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class toq implements ServiceConnection {
        private toq() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (wvg.this.f34087q != null) {
                return;
            }
            new Thread(new mcp(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zy {
        /* JADX INFO: renamed from: k */
        static String m21980k(IBinder iBinder, String str, String str2, String str3) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public wvg(Context context) {
        this.f34085k = context;
        f7l8();
    }

    private void f7l8() {
        boolean zBindService;
        this.f73719toq = new toq();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            zBindService = this.f34085k.bindService(intent, this.f73719toq, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f73720zy = zBindService ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ld6() {
        try {
            Signature[] signatureArr = this.f34085k.getPackageManager().getPackageInfo(this.f34085k.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m21976p(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z2 = (packageInfo.applicationInfo.flags & 1) != 0;
                f34084g = longVersionCode >= 1;
                if (z2) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private void m21978s(String str) {
        if (this.f73720zy != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f34086n) {
            try {
                com.xiaomi.channel.commonutils.logger.zy.kja0("oppo's " + str + " wait...");
                this.f34086n.wait(C3548p.f65176gcp);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2() {
        ServiceConnection serviceConnection = this.f73719toq;
        if (serviceConnection != null) {
            try {
                this.f34085k.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public boolean mo20573a() {
        return f34084g;
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public String mo20572a() {
        m21978s("getOAID");
        if (this.f34087q == null) {
            return null;
        }
        return this.f34087q.f73721toq;
    }
}
