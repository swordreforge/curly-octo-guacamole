package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.exoplayer2.C3548p;

/* JADX INFO: loaded from: classes3.dex */
class cdj implements InterfaceC5868i {

    /* JADX INFO: renamed from: y */
    private static boolean f32768y;

    /* JADX INFO: renamed from: k */
    private Context f32770k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ServiceConnection f73290toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile int f73291zy = 0;

    /* JADX INFO: renamed from: q */
    private volatile String f32772q = null;

    /* JADX INFO: renamed from: n */
    private volatile boolean f32771n = false;

    /* JADX INFO: renamed from: g */
    private volatile String f32769g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Object f73289f7l8 = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.push.cdj$k */
    class ServiceConnectionC5854k implements ServiceConnection {
        private ServiceConnectionC5854k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new t8r(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class toq {
        /* JADX INFO: renamed from: k */
        static String m20688k(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        static boolean toq(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public cdj(Context context) {
        this.f32770k = context;
        m20685q();
    }

    public static boolean f7l8(Context context) {
        boolean z2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z2 = (packageInfo.applicationInfo.flags & 1) != 0;
            f32768y = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z2;
    }

    /* JADX INFO: renamed from: g */
    private void m20682g(String str) {
        if (this.f73291zy != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f73289f7l8) {
            try {
                com.xiaomi.channel.commonutils.logger.zy.kja0("huawei's " + str + " wait...");
                this.f73289f7l8.wait(C3548p.f65176gcp);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m20685q() {
        boolean zBindService;
        this.f73290toq = new ServiceConnectionC5854k();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            zBindService = this.f32770k.bindService(intent, this.f73290toq, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f73291zy = zBindService ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m20686s() {
        ServiceConnection serviceConnection = this.f73290toq;
        if (serviceConnection != null) {
            try {
                this.f32770k.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public boolean mo20573a() {
        return f32768y;
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public String mo20572a() {
        m20682g("getOAID");
        return this.f32772q;
    }
}
