package com.android.thememanager.share;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;

/* JADX INFO: compiled from: PackageMonitor.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zy extends BroadcastReceiver {

    /* JADX INFO: renamed from: h */
    public static final int f16091h = 3;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f61139kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final IntentFilter f61140ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f61141n7h = 1;

    /* JADX INFO: renamed from: p */
    static final IntentFilter f16092p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f61142qrj = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final IntentFilter f61143x2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    int f61144f7l8;

    /* JADX INFO: renamed from: g */
    String[] f16093g;

    /* JADX INFO: renamed from: n */
    String[] f16095n;

    /* JADX INFO: renamed from: q */
    String[] f16096q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    Context f61145toq;

    /* JADX INFO: renamed from: y */
    boolean f16098y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    Handler f61146zy;

    /* JADX INFO: renamed from: k */
    final HashSet<String> f16094k = new HashSet<>();

    /* JADX INFO: renamed from: s */
    String[] f16097s = new String[1];

    static {
        IntentFilter intentFilter = new IntentFilter();
        f16092p = intentFilter;
        IntentFilter intentFilter2 = new IntentFilter();
        f61140ld6 = intentFilter2;
        IntentFilter intentFilter3 = new IntentFilter();
        f61143x2 = intentFilter3;
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addAction("android.intent.action.UID_REMOVED");
        intentFilter.addDataScheme("package");
        intentFilter2.addAction("android.intent.action.UID_REMOVED");
        intentFilter3.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter3.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
    }

    public void cdj(String packageName, int reason) {
    }

    public int f7l8(String packageName) {
        String[] strArr = this.f16096q;
        if (strArr == null) {
            return 0;
        }
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (packageName.equals(this.f16096q[length])) {
                return this.f61144f7l8;
            }
        }
        return 0;
    }

    public void fn3e(String packageName, int uid) {
    }

    public void fu4(String[] packages) {
    }

    /* JADX INFO: renamed from: g */
    public int m9479g(String packageName) {
        String[] strArr = this.f16095n;
        if (strArr == null) {
            return 0;
        }
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (packageName.equals(this.f16095n[length])) {
                return this.f61144f7l8;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m9480h(String packageName, int uid, String[] components) {
        if (components != null) {
            for (String str : components) {
                if (packageName.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m9481i(String packageName, int uid) {
    }

    /* JADX INFO: renamed from: k */
    public boolean m9482k() {
        return this.f16095n != null;
    }

    public void ki(String packageName) {
    }

    public void kja0(String packageName, int reason) {
    }

    public void ld6() {
    }

    /* JADX INFO: renamed from: n */
    public Handler m9483n() {
        return this.f61146zy;
    }

    public void n7h(String packageName, int uid) {
    }

    public void ni7(String[] packages) {
    }

    public void o1t(int uid) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m9484p();
        this.f16095n = null;
        this.f16096q = null;
        int i2 = 0;
        this.f16098y = false;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            String strM9485q = m9485q(intent);
            int intExtra = intent.getIntExtra("android.intent.extra.UID", 0);
            this.f16098y = true;
            if (strM9485q != null) {
                String[] strArr = this.f16097s;
                this.f16095n = strArr;
                strArr[0] = strM9485q;
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    this.f16093g = this.f16097s;
                    this.f61144f7l8 = 1;
                    fn3e(strM9485q, intExtra);
                    ki(strM9485q);
                } else {
                    this.f61144f7l8 = 3;
                    n7h(strM9485q, intExtra);
                }
                kja0(strM9485q, this.f61144f7l8);
                if (this.f61144f7l8 == 1) {
                    synchronized (this.f16094k) {
                        this.f16094k.remove(strM9485q);
                    }
                }
            }
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            String strM9485q2 = m9485q(intent);
            int intExtra2 = intent.getIntExtra("android.intent.extra.UID", 0);
            if (strM9485q2 != null) {
                String[] strArr2 = this.f16097s;
                this.f16096q = strArr2;
                strArr2[0] = strM9485q2;
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    this.f61144f7l8 = 1;
                    synchronized (this.f16094k) {
                    }
                    zurt(strM9485q2, intExtra2);
                } else {
                    this.f61144f7l8 = 3;
                    this.f16098y = true;
                    t8r(strM9485q2, intExtra2);
                }
                cdj(strM9485q2, this.f61144f7l8);
            }
        } else if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
            String strM9485q3 = m9485q(intent);
            int intExtra3 = intent.getIntExtra("android.intent.extra.UID", 0);
            String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_component_name_list");
            if (strM9485q3 != null) {
                String[] strArr3 = this.f16097s;
                this.f16093g = strArr3;
                strArr3[0] = strM9485q3;
                this.f61144f7l8 = 3;
                if (m9480h(strM9485q3, intExtra3, stringArrayExtra)) {
                    this.f16098y = true;
                }
                ki(strM9485q3);
            }
        } else {
            if ("android.intent.action.PACKAGE_RESTARTED".equals(action)) {
                String[] strArr4 = {m9485q(intent)};
                this.f16096q = strArr4;
                this.f61144f7l8 = 2;
                x2(intent, strArr4, intent.getIntExtra("android.intent.extra.UID", 0), true);
            } else if ("android.intent.action.UID_REMOVED".equals(action)) {
                o1t(intent.getIntExtra("android.intent.extra.UID", 0));
            } else if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
                String[] stringArrayExtra2 = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
                this.f16095n = stringArrayExtra2;
                this.f61144f7l8 = intent.getBooleanExtra("android.intent.extra.REPLACING", false) ? 1 : 2;
                this.f16098y = true;
                if (stringArrayExtra2 != null) {
                    ni7(stringArrayExtra2);
                    while (i2 < stringArrayExtra2.length) {
                        kja0(stringArrayExtra2[i2], this.f61144f7l8);
                        i2++;
                    }
                }
            } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
                String[] stringArrayExtra3 = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
                this.f16096q = stringArrayExtra3;
                this.f61144f7l8 = intent.getBooleanExtra("android.intent.extra.REPLACING", false) ? 1 : 2;
                this.f16098y = true;
                if (stringArrayExtra3 != null) {
                    fu4(stringArrayExtra3);
                    while (i2 < stringArrayExtra3.length) {
                        cdj(stringArrayExtra3[i2], this.f61144f7l8);
                        i2++;
                    }
                }
            }
        }
        if (this.f16098y) {
            mo9408z();
        }
        ld6();
    }

    /* JADX INFO: renamed from: p */
    public void m9484p() {
    }

    /* JADX INFO: renamed from: q */
    String m9485q(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    public void qrj(Intent intent, int userHandle) {
    }

    /* JADX INFO: renamed from: s */
    boolean m9486s(String packageName) {
        boolean zContains;
        synchronized (this.f16094k) {
            zContains = this.f16094k.contains(packageName);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: t */
    public void m9487t() {
        Context context = this.f61145toq;
        if (context == null) {
            throw new IllegalStateException("Not registered");
        }
        context.unregisterReceiver(this);
        this.f61145toq = null;
    }

    public void t8r(String packageName, int uid) {
    }

    public boolean toq() {
        return this.f16096q != null;
    }

    public void wvg(Context context, Looper thread, boolean externalStorage) {
        if (this.f61145toq != null) {
            throw new IllegalStateException("Already registered");
        }
        this.f61145toq = context;
        Handler handler = new Handler(thread);
        this.f61146zy = handler;
        context.registerReceiver(this, f16092p, null, handler);
        context.registerReceiver(this, f61140ld6, null, this.f61146zy);
        if (externalStorage) {
            context.registerReceiver(this, f61143x2, null, this.f61146zy);
        }
    }

    public boolean x2(Intent intent, String[] packages, int uid, boolean doit) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m9488y(String packageName) {
        String[] strArr = this.f16093g;
        if (strArr == null) {
            return false;
        }
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (packageName.equals(this.f16093g[length])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public void mo9408z() {
    }

    public void zurt(String packageName, int uid) {
    }

    public boolean zy() {
        return this.f16098y;
    }
}
