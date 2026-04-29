package com.market.sdk.silentupdate;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.market.sdk.C4979n;
import com.market.sdk.a9;
import com.market.sdk.silentupdate.C4995q;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5014q;
import com.market.sdk.utils.C5019y;
import com.xiaomi.market.IAppDownloadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SilentUpdater.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f68940a9 = 4;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f68941cdj = "com.xiaomi.discover";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f68942d2ok = -4;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f68943d3 = -1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f68944dd = 1;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f68945eqxt = -3;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f68946fn3e = -1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f68947fti = 5;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f68948fu4 = -4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f68949gvn7 = 0;

    /* JADX INFO: renamed from: h */
    private static final String f28144h = "com.xiaomi.market.service.AppDownloadService";

    /* JADX INFO: renamed from: i */
    private static final String f28145i = "selfupdatesdk_";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f68950jk = 3;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f68951jp0y = 19;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f68952ki = "com.xiaomi.mipicks";

    /* JADX INFO: renamed from: l */
    private static final int f28146l = 4;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f68953lvui = -5;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f68954mcp = 2;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f68955ncyb = 3;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f68956ni7 = -3;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f68957o1t = -6;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f68958oc = -2;

    /* JADX INFO: renamed from: r */
    public static final int f28147r = -100;

    /* JADX INFO: renamed from: t */
    public static final int f28148t = 1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f68959t8r = "com.xiaomi.market";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f68960wvg = -7;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f68961x9kr = 2;

    /* JADX INFO: renamed from: z */
    public static final int f28149z = -5;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f68962zurt = -2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f68963f7l8;

    /* JADX INFO: renamed from: g */
    private Bundle f28150g;

    /* JADX INFO: renamed from: k */
    private String f28151k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final C4995q.k f68964kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private IAppDownloadManager f68965ld6;

    /* JADX INFO: renamed from: n */
    private InterfaceC4998n f28152n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final ServiceConnection f68966n7h;

    /* JADX INFO: renamed from: p */
    private boolean f28153p;

    /* JADX INFO: renamed from: q */
    private int f28154q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private IBinder.DeathRecipient f68967qrj;

    /* JADX INFO: renamed from: s */
    private boolean f28155s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f68968toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private List<Integer> f68969x2;

    /* JADX INFO: renamed from: y */
    private boolean f28156y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f68970zy;

    /* JADX INFO: renamed from: com.market.sdk.silentupdate.zy$k */
    /* JADX INFO: compiled from: SilentUpdater.java */
    class C4997k implements IBinder.DeathRecipient {
        C4997k() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            zy.this.f68965ld6 = null;
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.silentupdate.zy$n */
    /* JADX INFO: compiled from: SilentUpdater.java */
    public interface InterfaceC4998n {
        /* JADX INFO: renamed from: k */
        void m17392k(int i2, int i3);

        void onStatusChanged(int i2);

        void toq(int i2);

        void zy(int i2);
    }

    /* JADX INFO: renamed from: com.market.sdk.silentupdate.zy$q */
    /* JADX INFO: compiled from: SilentUpdater.java */
    private static class C4999q {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        static final /* synthetic */ boolean f68971ld6 = false;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f68972f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f28158g;

        /* JADX INFO: renamed from: k */
        private String f28159k;

        /* JADX INFO: renamed from: n */
        private boolean f28160n;

        /* JADX INFO: renamed from: p */
        private InterfaceC4998n f28161p;

        /* JADX INFO: renamed from: q */
        private int f28162q = -1;

        /* JADX INFO: renamed from: s */
        private Bundle f28163s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f68973toq;

        /* JADX INFO: renamed from: y */
        private boolean f28164y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f68974zy;

        public C4999q f7l8(boolean z2) {
            this.f68972f7l8 = z2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C4999q m17393g(boolean z2) {
            this.f28160n = z2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public zy m17394k() {
            zy zyVar = new zy(null);
            zyVar.f68968toq = this.f68973toq;
            zyVar.f68970zy = this.f68974zy;
            zyVar.f28154q = this.f28162q;
            if (TextUtils.isEmpty(this.f28159k)) {
                if (C5014q.ni7()) {
                    this.f28159k = zy.fti("com.xiaomi.mipicks", -1) ? "com.xiaomi.mipicks" : "com.xiaomi.discover";
                } else {
                    this.f28159k = "com.xiaomi.market";
                }
            }
            zyVar.f28151k = this.f28159k;
            zyVar.f28152n = this.f28161p;
            zyVar.f28150g = this.f28163s;
            zyVar.f68963f7l8 = this.f28160n;
            zyVar.f28156y = this.f28158g;
            zyVar.f28155s = this.f68972f7l8;
            zyVar.f28153p = this.f28164y;
            return zyVar;
        }

        public C4999q ld6(boolean z2) {
            this.f28158g = z2;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C4999q m17395n(Bundle bundle) {
            this.f28163s = new Bundle(bundle);
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C4999q m17396p(int i2) {
            this.f28162q = i2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C4999q m17397q(InterfaceC4998n interfaceC4998n) {
            this.f28161p = interfaceC4998n;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C4999q m17398s(String str) {
            this.f28159k = str;
            return this;
        }

        public C4999q toq(String str) {
            this.f68973toq = str;
            return this;
        }

        public zy x2() throws C4994k {
            zy zyVarM17394k = m17394k();
            zyVarM17394k.d2ok();
            return zyVarM17394k;
        }

        /* JADX INFO: renamed from: y */
        public C4999q m17399y(boolean z2) {
            this.f28164y = z2;
            return this;
        }

        public C4999q zy(String str) {
            this.f68974zy = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: SilentUpdater.java */
    class toq implements ServiceConnection {
        toq() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zy.this.f68965ld6 = IAppDownloadManager.Stub.asInterface(iBinder);
            try {
                zy.this.f68965ld6.asBinder().linkToDeath(zy.this.f68967qrj, 0);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
            C4995q.m17375k().toq(zy.this.f68964kja0);
            zy.this.gvn7();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IAppDownloadManager iAppDownloadManager = zy.this.f68965ld6;
            if (iAppDownloadManager != null) {
                iAppDownloadManager.asBinder().unlinkToDeath(zy.this.f68967qrj, 0);
            }
            zy.this.f68965ld6 = null;
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.silentupdate.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SilentUpdater.java */
    class C8022zy implements C4995q.k {

        /* JADX INFO: renamed from: k */
        private int f28166k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68975toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f68976zy = -1;

        C8022zy() {
        }

        @Override // com.market.sdk.silentupdate.C4995q.k
        public void onResult(Bundle bundle) {
            if (zy.this.f28152n == null || bundle == null) {
                return;
            }
            int i2 = bundle.getInt("errorCode");
            if (this.f28166k != i2) {
                this.f28166k = i2;
                if (i2 < 0 || i2 == 4) {
                    C4995q.m17375k().zy();
                    zy.this.eqxt();
                }
                if (i2 < 0) {
                    zy.this.f28152n.m17392k(i2, bundle.getInt("reason"));
                } else {
                    zy.this.f28152n.toq(this.f28166k);
                }
            }
            if (i2 == 5) {
                int i3 = bundle.getInt("status");
                int i4 = bundle.getInt("progress");
                if (this.f68975toq != i3) {
                    zy.this.f28152n.onStatusChanged(i3);
                    this.f68975toq = i3;
                }
                if (this.f68976zy != i4) {
                    zy.this.f28152n.zy(i4);
                    this.f68976zy = i4;
                }
            }
        }
    }

    /* synthetic */ zy(C4997k c4997k) {
        this();
    }

    public static boolean a9(String str) {
        return TextUtils.isEmpty(str) ? jk() : fti(str, -1);
    }

    private synchronized void d3(int i2) {
        Iterator<Integer> it = this.f68969x2.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == i2) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt() {
        IAppDownloadManager iAppDownloadManager = this.f68965ld6;
        if (iAppDownloadManager != null) {
            try {
                iAppDownloadManager.asBinder().unlinkToDeath(this.f68967qrj, 0);
                C5010k.toq().unbindService(this.f68966n7h);
                this.f68965ld6 = null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private synchronized void fn3e(int i2) throws C4994k {
        this.f68969x2.add(Integer.valueOf(i2));
        if (this.f68965ld6 == null) {
            t8r();
        } else {
            gvn7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fti(String str, int i2) {
        if (i2 > 0) {
            try {
                if (C5010k.zy().getPackageInfo(str, 0).versionCode < i2) {
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        Intent intent = new Intent(f28144h);
        intent.setPackage(str);
        List<ResolveInfo> listQueryIntentServices = C5010k.zy().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            return listQueryIntentServices.get(0).serviceInfo.isEnabled();
        }
        return false;
    }

    private void fu4() {
        try {
            this.f68965ld6.pause(C5010k.toq().getPackageName(), C5010k.toq().getPackageName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void gvn7() {
        Iterator it = new ArrayList(this.f68969x2).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue == 1) {
                o1t();
            } else if (iIntValue == 2) {
                fu4();
            } else if (iIntValue == 3) {
                m17390z();
            } else if (iIntValue == 4) {
                ni7();
            }
        }
        this.f68969x2.clear();
    }

    public static boolean jk() {
        return C5014q.ni7() ? fti("com.xiaomi.mipicks", -1) || fti("com.xiaomi.discover", -1) : fti("com.xiaomi.market", -1);
    }

    public static boolean mcp() {
        return m17388t();
    }

    private void ni7() {
        try {
            this.f68965ld6.cancel(C5010k.toq().getPackageName(), C5010k.toq().getPackageName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void o1t() {
        Context qVar = C5010k.toq();
        String strZy = com.market.sdk.silentupdate.toq.zy();
        String str = f28145i + qVar.getPackageName();
        try {
            String strM17378q = com.market.sdk.silentupdate.toq.m17378q(strZy, this.f68968toq, qVar.getPackageName(), str, this.f68970zy);
            Bundle bundle = new Bundle();
            bundle.putString("packageName", qVar.getPackageName());
            bundle.putString(C4979n.f28086q, qVar.getPackageName());
            bundle.putString("ref", str);
            bundle.putString("nonce", strZy);
            bundle.putString("appSignature", strM17378q);
            bundle.putString("appClientId", this.f68968toq);
            bundle.putInt("ext_targetVersionCode", this.f28154q);
            bundle.putBoolean("show_cta", this.f28153p);
            bundle.putInt(C5019y.f28244l, a9.ld6().ordinal());
            if (this.f68963f7l8) {
                bundle.putBoolean("marketClientControlParam_force_update", true);
            }
            if (this.f28155s) {
                bundle.putBoolean("marketClientControlParam_hide_download", true);
            }
            if (this.f28156y) {
                bundle.putBoolean("marketClientControlParam_download_wifi_only", true);
            }
            if (this.f28150g != null) {
                Iterator<String> it = bundle.keySet().iterator();
                while (it.hasNext()) {
                    this.f28150g.remove(it.next());
                }
                bundle.putAll(this.f28150g);
            }
            this.f68965ld6.download(bundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m17388t() {
        return C5014q.ni7() ? fti("com.xiaomi.mipicks", 1914114) || fti("com.xiaomi.discover", 1914114) : fti("com.xiaomi.market", 1914114);
    }

    private void t8r() throws C4994k {
        if (!a9(this.f28151k)) {
            throw new C4994k("SilentUpdate check failed，This operation is not supported");
        }
        Intent intent = new Intent(f28144h);
        intent.setPackage(this.f28151k);
        C5010k.toq().bindService(intent, this.f68966n7h, 1);
    }

    public static boolean wvg() {
        return m17388t();
    }

    /* JADX INFO: renamed from: z */
    private void m17390z() {
        try {
            this.f68965ld6.resume(C5010k.toq().getPackageName(), C5010k.toq().getPackageName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void d2ok() throws C4994k {
        fn3e(1);
    }

    /* JADX INFO: renamed from: i */
    public void m17391i() throws C4994k {
        d3(1);
        d3(2);
        d3(3);
        fn3e(4);
    }

    public void jp0y() throws C4994k {
        fn3e(2);
    }

    public void oc() throws C4994k {
        fn3e(3);
    }

    public void zurt() throws C4994k {
        this.f68963f7l8 = true;
        d2ok();
    }

    private zy() {
        this.f68969x2 = new ArrayList();
        this.f68967qrj = new C4997k();
        this.f68966n7h = new toq();
        this.f68964kja0 = new C8022zy();
    }
}
