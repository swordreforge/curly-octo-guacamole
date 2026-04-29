package com.xiaomi.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.analytics.PolicyConfiguration;
import com.xiaomi.analytics.internal.C5606q;
import com.xiaomi.analytics.internal.util.C5608g;
import com.xiaomi.analytics.internal.util.C5609k;
import com.xiaomi.analytics.internal.util.C5610n;
import com.xiaomi.analytics.internal.util.C5612q;
import com.xiaomi.analytics.internal.util.n7h;
import com.xiaomi.analytics.internal.util.qrj;
import com.xiaomi.analytics.internal.v1.InterfaceC5615k;
import java.io.File;

/* JADX INFO: compiled from: SdkManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f73077fn3e = "analytics.apk";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f73078fu4 = "analytics_asset.apk";

    /* JADX INFO: renamed from: i */
    private static final String f31235i = "analytics";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static Object f73079jk = null;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static volatile zy f73080mcp = null;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f73081ni7 = "/asset_lib/";

    /* JADX INFO: renamed from: t */
    private static final String f31236t = "2.7.3";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f73083t8r = "SdkManager";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f73084wvg = 28;

    /* JADX INFO: renamed from: z */
    private static final String f31237z = "pld";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f73085zurt = "/lib/";

    /* JADX INFO: renamed from: k */
    private Context f31240k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Handler f73090ld6;

    /* JADX INFO: renamed from: n */
    private InterfaceC5617g f31241n;

    /* JADX INFO: renamed from: p */
    private long f31242p;

    /* JADX INFO: renamed from: q */
    private com.xiaomi.analytics.internal.v1.zy f31243q;

    /* JADX INFO: renamed from: s */
    private boolean f31244s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC5615k f73093toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private HandlerThread f73094x2;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f73082o1t = n7h.f31205g * 30;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static boolean f73076a9 = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private PolicyConfiguration f73095zy = null;

    /* JADX INFO: renamed from: g */
    private long f31238g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile boolean f73087f7l8 = false;

    /* JADX INFO: renamed from: y */
    private boolean f31245y = false;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private InterfaceC5615k f73092qrj = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private Runnable f73091n7h = new RunnableC5618k();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private Runnable f73089kja0 = new toq();

    /* JADX INFO: renamed from: h */
    private C5606q.q f31239h = new C8035zy();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private BroadcastReceiver f73086cdj = new C5620q();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Runnable f73088ki = new RunnableC5619n();

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.zy$g */
    /* JADX INFO: compiled from: SdkManager.java */
    public interface InterfaceC5617g {
        void onSdkCorePrepared(InterfaceC5615k interfaceC5615k);
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.zy$k */
    /* JADX INFO: compiled from: SdkManager.java */
    class RunnableC5618k implements Runnable {
        RunnableC5618k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (zy.this.f73093toq == null || C5606q.ki(zy.this.f31240k).fn3e()) {
                    C5606q.ki(zy.this.f31240k).m19232h(new File(zy.this.d3()).getAbsolutePath());
                }
            } catch (Exception e2) {
                Log.w(C5609k.m19240k(zy.f73083t8r), "mUpdateChecker exception", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.zy$n */
    /* JADX INFO: compiled from: SdkManager.java */
    class RunnableC5619n implements Runnable {
        RunnableC5619n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (zy.f73080mcp) {
                    if (!zy.this.x9kr() || zy.this.f73092qrj == null) {
                        C5609k.toq(zy.f73083t8r, "skip init dex");
                    } else {
                        zy.this.f73092qrj.init();
                        zy.this.f73092qrj = null;
                        zy.this.f31240k.unregisterReceiver(zy.this.f73086cdj);
                        C5609k.toq(zy.f73083t8r, "pending dex init executed, unregister and clear pending");
                    }
                }
            } catch (Exception e2) {
                C5609k.m19241n(zy.f73083t8r, "dexInitTask", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.zy$q */
    /* JADX INFO: compiled from: SdkManager.java */
    class C5620q extends BroadcastReceiver {
        C5620q() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    zy.this.f31242p = System.currentTimeMillis();
                    zy.this.f31244s = true;
                    if (zy.this.f73092qrj != null) {
                        zy.this.lrht(r4.gvn7());
                    } else {
                        zy.this.f31240k.unregisterReceiver(zy.this.f73086cdj);
                        C5609k.toq(zy.f73083t8r, "pending dex is null, unregister");
                    }
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    zy.this.f31244s = false;
                }
                C5609k.toq(zy.f73083t8r, "screen off : " + zy.this.f31244s);
            } catch (Exception e2) {
                C5609k.zy(zy.f73083t8r, "mScreenReceiver onReceive e", e2);
            }
        }
    }

    /* JADX INFO: compiled from: SdkManager.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                } catch (Exception e2) {
                    Log.w(C5609k.m19240k(zy.f73083t8r), "heavy work exception", e2);
                }
                synchronized (zy.f73079jk) {
                    zy.this.uv6();
                    InterfaceC5615k interfaceC5615k = null;
                    if (!zy.this.f31245y || zy.f73076a9) {
                        zy.this.hyr();
                        interfaceC5615k = zy.this.f31243q;
                        if (interfaceC5615k != null) {
                            interfaceC5615k.init();
                        }
                    }
                    if (interfaceC5615k != null) {
                        C5609k.toq(zy.f73083t8r, "sys version = " + interfaceC5615k.getVersion());
                    }
                    if (zy.f73076a9) {
                        C5609k.toq(zy.f73083t8r, "use system analytics only, so don't load asset/local analytics.apk");
                        zy.this.f73093toq = interfaceC5615k;
                        zy zyVar = zy.this;
                        zyVar.m19275f(zyVar.f73093toq);
                        return;
                    }
                    InterfaceC5615k interfaceC5615kNcyb = zy.this.ncyb();
                    StringBuilder sb = new StringBuilder();
                    sb.append("assets analytics null ");
                    sb.append(interfaceC5615kNcyb == null);
                    C5609k.toq(zy.f73083t8r, sb.toString());
                    InterfaceC5615k interfaceC5615kN5r1 = zy.this.n5r1();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("local analytics null ");
                    sb2.append(interfaceC5615kN5r1 == null);
                    C5609k.toq(zy.f73083t8r, sb2.toString());
                    if (interfaceC5615kNcyb == null || (interfaceC5615kN5r1 != null && interfaceC5615kN5r1.getVersion().compareTo(interfaceC5615kNcyb.getVersion()) > 0)) {
                        C5609k.toq(zy.f73083t8r, "use local analytics.");
                        interfaceC5615kNcyb = interfaceC5615kN5r1;
                    } else {
                        C5609k.toq(zy.f73083t8r, "use assets analytics.");
                    }
                    if (interfaceC5615k == null || (interfaceC5615kNcyb != null && interfaceC5615kNcyb.getVersion().compareTo(interfaceC5615k.getVersion()) > 0)) {
                        C5609k.toq(zy.f73083t8r, "use dex analytics.");
                        if (interfaceC5615kNcyb != null) {
                            interfaceC5615kNcyb.init();
                        }
                        zy.this.m19274e(true);
                        interfaceC5615k = interfaceC5615kNcyb;
                    } else {
                        C5609k.toq(zy.f73083t8r, "use sys analytics.");
                        zy.this.f73092qrj = interfaceC5615kNcyb;
                        zy.this.m19280l();
                    }
                    if (interfaceC5615k != null && interfaceC5615k.getVersion().compareTo(C5604k.f73034toq) >= 0) {
                        zy.this.f73093toq = interfaceC5615k;
                    }
                    zy.this.m19287t();
                    zy zyVar2 = zy.this;
                    zyVar2.m19275f(zyVar2.f73093toq);
                }
            } finally {
                zy.this.f73087f7l8 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SdkManager.java */
    class C8035zy implements C5606q.q {
        C8035zy() {
        }

        @Override // com.xiaomi.analytics.internal.C5606q.q
        /* JADX INFO: renamed from: k */
        public void mo19234k(String str, boolean z2) throws Throwable {
            if (zy.this.f73093toq != null) {
                if (!z2 || com.xiaomi.analytics.internal.util.toq.m19256q(zy.this.f31240k)) {
                    return;
                }
                Process.killProcess(Process.myPid());
                return;
            }
            C5609k.toq(zy.f73083t8r, "download finished, use new analytics.");
            InterfaceC5615k interfaceC5615kN5r1 = zy.this.n5r1();
            if (interfaceC5615kN5r1 != null) {
                interfaceC5615kN5r1.init();
            }
            zy.this.f73093toq = interfaceC5615kN5r1;
            zy zyVar = zy.this;
            zyVar.m19275f(zyVar.f73093toq);
        }
    }

    private zy(Context context) {
        this.f31240k = com.xiaomi.analytics.internal.util.toq.m19255k(context);
        f73079jk = "connectivity";
        HandlerThread handlerThread = new HandlerThread("api-sdkmgr", 10);
        this.f73094x2 = handlerThread;
        handlerThread.start();
        this.f73090ld6 = new Handler(this.f73094x2.getLooper());
        this.f31243q = new com.xiaomi.analytics.internal.v1.zy(this.f31240k);
        C5606q.ki(this.f31240k).m19233z(this.f31239h);
        qrj.f31215q.execute(this.f73089kja0);
    }

    private String a9() {
        return oc() + f73081ni7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d3() {
        return oc() + "/" + f73077fn3e;
    }

    private boolean dd(File file) {
        return C5610n.toq(com.xiaomi.analytics.internal.util.toq.toq(this.f31240k, file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m19274e(boolean z2) {
        try {
            this.f31240k.getSharedPreferences(C5604k.f31168n, 0).edit().putBoolean(f31237z, z2).apply();
        } catch (Exception e2) {
            Log.w(C5609k.m19240k(f73083t8r), "savePreviousLoadDex exception", e2);
        }
    }

    private String eqxt() {
        return oc() + f73085zurt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m19275f(InterfaceC5615k interfaceC5615k) {
        this.f73093toq = interfaceC5615k;
        if (interfaceC5615k != null) {
            if (this.f31241n != null) {
                interfaceC5615k.setDebugOn(C5609k.f31199k);
                C5609k.toq(f73083t8r, "Analytics module loaded, version is " + this.f73093toq.getVersion());
                this.f31241n.onSdkCorePrepared(this.f73093toq);
            }
            PolicyConfiguration policyConfiguration = this.f73095zy;
            if (policyConfiguration != null) {
                policyConfiguration.apply(this.f73093toq);
            }
        }
    }

    public static synchronized zy fti(Context context) {
        if (f73080mcp == null) {
            f73080mcp = new zy(context);
        }
        return f73080mcp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int gvn7() {
        if (C5609k.f31199k) {
            return 10000;
        }
        return f73082o1t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5615k hyr() {
        if (this.f31243q.n7h()) {
            this.f31243q.cdj();
        }
        return this.f31243q;
    }

    private String jk() {
        return oc() + "/" + f73078fu4;
    }

    private boolean jp0y() {
        try {
            return this.f31240k.getSharedPreferences(C5604k.f31168n, 0).getBoolean(f31237z, true);
        } catch (Exception e2) {
            Log.w(C5609k.m19240k(f73083t8r), "getPreviousLoadDex exception", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m19280l() {
        if (jp0y()) {
            vyq();
        } else {
            this.f73092qrj = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lrht(long j2) {
        this.f73090ld6.removeCallbacks(this.f73088ki);
        this.f73090ld6.postDelayed(this.f73088ki, j2);
        C5609k.toq(f73083t8r, "post dex init task");
    }

    private boolean lvui() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5615k n5r1() throws Throwable {
        try {
            File file = new File(d3());
            if (file.exists()) {
                if (lvui() && !m19285r(d3())) {
                    C5609k.toq(f73083t8r, "Not suitable for Android P, so delete it");
                    file.delete();
                    return null;
                }
                com.xiaomi.analytics.internal.util.zy.m19263k(this.f31240k, file.getAbsolutePath(), eqxt());
                if (dd(file)) {
                    return new com.xiaomi.analytics.internal.v1.toq(this.f31240k, file.getAbsolutePath(), eqxt());
                }
                C5609k.toq(f73083t8r, "return as local apk signature error");
                return null;
            }
        } catch (Exception e2) {
            Log.w(C5609k.m19240k(f73083t8r), "loadLocalAnalytics exception", e2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5615k ncyb() throws Throwable {
        try {
            String[] list = this.f31240k.getAssets().list("");
            if (list != null) {
                for (int i2 = 0; i2 < list.length; i2++) {
                    if (!TextUtils.isEmpty(list[i2]) && list[i2].startsWith("analytics_core")) {
                        C5612q.m19253k(this.f31240k, list[i2], jk());
                        File file = new File(jk());
                        if (file.exists()) {
                            if (lvui() && !m19285r(jk())) {
                                C5609k.toq(f73083t8r, "Not suitable for Android P, so delete it");
                                file.delete();
                                return null;
                            }
                            com.xiaomi.analytics.internal.util.zy.m19263k(this.f31240k, jk(), a9());
                            if (dd(file)) {
                                return new com.xiaomi.analytics.internal.v1.toq(this.f31240k, jk(), a9());
                            }
                            C5609k.toq(f73083t8r, "return as asset apk signature error");
                            return null;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Log.w(C5609k.m19240k(f73083t8r), "loadAssetAnalytics exception", e2);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m19282o() {
        f73076a9 = true;
    }

    private String oc() {
        return this.f31240k.getDir("analytics", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: r */
    private boolean m19285r(String str) {
        try {
            String str2 = this.f31240k.getPackageManager().getPackageArchiveInfo(str, 1).versionName;
            C5609k.toq(f73083t8r, "" + str + " verName: " + str2);
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            return new C5605n(str2).compareTo(new C5605n(f31236t)) >= 0;
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f73083t8r), "isApkSuitableForAndroidPOrAbove exception: ", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public synchronized void m19287t() {
        if (System.currentTimeMillis() - this.f31238g > n7h.f31208q) {
            this.f31238g = System.currentTimeMillis();
            qrj.f31215q.execute(this.f73091n7h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uv6() {
        File file = new File(eqxt());
        if (file.exists()) {
            C5608g.m19237k(file);
        } else {
            file.mkdirs();
        }
        File file2 = new File(a9());
        if (file2.exists()) {
            C5608g.m19237k(file2);
        } else {
            file2.mkdirs();
        }
    }

    private void vyq() {
        C5609k.toq(f73083t8r, "register screen receiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f31240k.registerReceiver(this.f73086cdj, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x9kr() {
        return this.f31244s && n7h.m19251k(this.f31242p, (long) gvn7());
    }

    /* JADX INFO: renamed from: c */
    public void m19290c() {
        if (this.f73087f7l8) {
            m19287t();
        }
    }

    public C5605n d2ok() {
        return mcp() != null ? mcp().getVersion() : new C5605n(C5604k.f73035zy);
    }

    public void hb(InterfaceC5617g interfaceC5617g) {
        this.f31241n = interfaceC5617g;
    }

    /* JADX INFO: renamed from: j */
    public void m19291j(PolicyConfiguration policyConfiguration) {
        this.f73095zy = policyConfiguration;
        InterfaceC5615k interfaceC5615k = this.f73093toq;
        if (interfaceC5615k == null || policyConfiguration == null) {
            return;
        }
        policyConfiguration.apply(interfaceC5615k);
    }

    public InterfaceC5615k mcp() {
        return this.f73093toq;
    }

    public void nn86(boolean z2) {
        this.f31245y = z2;
    }
}
