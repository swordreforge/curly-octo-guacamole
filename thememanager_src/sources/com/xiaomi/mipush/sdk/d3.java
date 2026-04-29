package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.yqrt;
import com.xiaomi.push.C5874l;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.e5;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ge;
import com.xiaomi.push.iz;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.kq;
import com.xiaomi.push.m28;
import com.xiaomi.push.nc;
import com.xiaomi.push.oaex;
import com.xiaomi.push.oph;
import com.xiaomi.push.qla;
import com.xiaomi.push.service.wo;
import com.xiaomi.push.w831;
import com.xiaomi.push.wwp;
import com.xiaomi.push.zuf;
import com.xiaomi.push.zxq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d3 {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final ArrayList<C5646k> f73127n7h = new ArrayList<>();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static boolean f73128qrj = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static d3 f73129x2;

    /* JADX INFO: renamed from: k */
    private boolean f31329k;

    /* JADX INFO: renamed from: n */
    private Handler f31330n;

    /* JADX INFO: renamed from: q */
    private Messenger f31332q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f73132toq;

    /* JADX INFO: renamed from: y */
    private long f31334y;

    /* JADX INFO: renamed from: g */
    private List<Message> f31328g = new ArrayList();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f73130f7l8 = false;

    /* JADX INFO: renamed from: s */
    private String f31333s = null;

    /* JADX INFO: renamed from: p */
    private Intent f31331p = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Integer f73131ld6 = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73133zy = null;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.d3$k */
    static class C5646k<T extends oaex<T, ?>> {

        /* JADX INFO: renamed from: k */
        T f31335k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        wwp f73134toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f73135zy;

        C5646k() {
        }
    }

    private d3(Context context) {
        this.f31329k = false;
        this.f31330n = null;
        this.f73132toq = context.getApplicationContext();
        this.f31329k = m19417c();
        f73128qrj = m19418e();
        this.f31330n = new oc(this, Looper.getMainLooper());
        if (nc.m21313p(context)) {
            wo.m21779k(new eqxt(this));
        }
        Intent intentLvui = lvui();
        if (intentLvui != null) {
            x9kr(intentLvui);
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m19417c() {
        try {
            PackageInfo packageInfo = this.f73132toq.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m19418e() {
        if (oc()) {
            try {
                return this.f73132toq.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private void ek5k() {
        try {
            PackageManager packageManager = this.f73132toq.getPackageManager();
            ComponentName componentName = new ComponentName(this.f73132toq, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private void m19419f(Intent intent) {
        com.xiaomi.push.service.a9 a9VarM21550q = com.xiaomi.push.service.a9.m21550q(this.f73132toq);
        int iM21370a = oph.ServiceBootMode.m21370a();
        zuf zufVar = zuf.START;
        int iM21553k = a9VarM21550q.m21553k(iM21370a, zufVar.m22131a());
        int iM19422k = m19422k();
        zuf zufVar2 = zuf.BIND;
        boolean z2 = iM21553k == zufVar2.m22131a() && f73128qrj;
        int iM22131a = z2 ? zufVar2.m22131a() : zufVar.m22131a();
        if (iM22131a != iM19422k) {
            eqxt(iM22131a);
        }
        if (z2) {
            vyq(intent);
        } else {
            x9kr(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fti(String str, dd ddVar, boolean z2, HashMap<String, String> map) {
        erbd erbdVar;
        String strM21617k = str;
        if (C5656l.m19500q(this.f73132toq).t8r() && com.xiaomi.push.oc.zurt(this.f73132toq)) {
            erbd erbdVar2 = new erbd();
            erbdVar2.m20785a(true);
            Intent intentM19427q = m19427q();
            if (TextUtils.isEmpty(str)) {
                strM21617k = com.xiaomi.push.service.gvn7.m21617k();
                erbdVar2.m20782a(strM21617k);
                erbdVar = z2 ? new erbd(strM21617k, true) : null;
                synchronized (o1t.class) {
                    o1t.toq(this.f73132toq).m19535n(strM21617k);
                }
            } else {
                erbdVar2.m20782a(strM21617k);
                erbdVar = z2 ? new erbd(strM21617k, true) : null;
            }
            switch (C5663r.f31426k[ddVar.ordinal()]) {
                case 1:
                    kq kqVar = kq.DisablePushMessage;
                    erbdVar2.m20799c(kqVar.f33227a);
                    erbdVar.m20799c(kqVar.f33227a);
                    if (map != null) {
                        erbdVar2.m20784a(map);
                        erbdVar.m20784a(map);
                    }
                    intentM19427q.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    kq kqVar2 = kq.EnablePushMessage;
                    erbdVar2.m20799c(kqVar2.f33227a);
                    erbdVar.m20799c(kqVar2.f33227a);
                    if (map != null) {
                        erbdVar2.m20784a(map);
                        erbdVar.m20784a(map);
                    }
                    intentM19427q.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    erbdVar2.m20799c(kq.ThirdPartyRegUpdate.f33227a);
                    if (map != null) {
                        erbdVar2.m20784a(map);
                    }
                    break;
            }
            com.xiaomi.channel.commonutils.logger.zy.a9("type:" + ddVar + ", " + strM21617k);
            erbdVar2.m20795b(C5656l.m19500q(this.f73132toq).m19505n());
            erbdVar2.m20803d(this.f73132toq.getPackageName());
            wwp wwpVar = wwp.Notification;
            m19435z(erbdVar2, wwpVar, false, null);
            if (z2) {
                erbdVar.m20795b(C5656l.m19500q(this.f73132toq).m19505n());
                erbdVar.m20803d(this.f73132toq.getPackageName());
                Context context = this.f73132toq;
                byte[] bArrM21397g = qla.m21397g(mcp.toq(context, erbdVar, wwpVar, false, context.getPackageName(), C5656l.m19500q(this.f73132toq).m19505n()));
                if (bArrM21397g != null) {
                    w831.m21956g(this.f73132toq.getPackageName(), this.f73132toq, erbdVar, wwpVar, bArrM21397g.length);
                    intentM19427q.putExtra("mipush_payload", bArrM21397g);
                    intentM19427q.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    intentM19427q.putExtra("mipush_app_id", C5656l.m19500q(this.f73132toq).m19505n());
                    intentM19427q.putExtra("mipush_app_token", C5656l.m19500q(this.f73132toq).kja0());
                    m19419f(intentM19427q);
                }
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 19;
            int iOrdinal = ddVar.ordinal();
            messageObtain.obj = strM21617k;
            messageObtain.arg1 = iOrdinal;
            if (map != null && map.get("third_sync_reason") != null) {
                Bundle bundle = new Bundle();
                bundle.putString("third_sync_reason", map.get("third_sync_reason"));
                messageObtain.setData(bundle);
            }
            this.f31330n.sendMessageDelayed(messageObtain, 5000L);
        }
    }

    private synchronized void hyr(int i2) {
        this.f73132toq.getSharedPreferences("mipush_extra", 0).edit().putInt(C5658n.f31404h, i2).commit();
    }

    /* JADX INFO: renamed from: j */
    private boolean m19421j() {
        String packageName = this.f73132toq.getPackageName();
        return packageName.contains(miuix.core.util.x2.f87403zy) || packageName.contains("xiaomi") || (this.f73132toq.getApplicationInfo().flags & 1) != 0;
    }

    /* JADX INFO: renamed from: k */
    private synchronized int m19422k() {
        return this.f73132toq.getSharedPreferences("mipush_extra", 0).getInt(C5658n.f31404h, -1);
    }

    /* JADX INFO: renamed from: l */
    private Intent m19423l() {
        if (oc()) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("pushChannel app start miui china channel");
            return lrht();
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("pushChannel app start  own channel");
        return nn86();
    }

    private String ld6() {
        String str = this.f31333s;
        if (str != null) {
            return str;
        }
        try {
            if (this.f73132toq.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f31333s = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f31333s = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    private Intent lrht() {
        Intent intent = new Intent();
        String packageName = this.f73132toq.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", ld6());
        intent.putExtra("mipush_app_package", packageName);
        ek5k();
        return intent;
    }

    private Intent lvui() {
        if (!"com.xiaomi.xmsf".equals(this.f73132toq.getPackageName())) {
            return m19423l();
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("pushChannel xmsf create own channel");
        return nn86();
    }

    /* JADX INFO: renamed from: m */
    private void m19424m() {
        this.f31334y = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: n */
    private Message m19425n(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    private Intent nn86() {
        Intent intent = new Intent();
        String packageName = this.f73132toq.getPackageName();
        yz();
        intent.setComponent(new ComponentName(this.f73132toq, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* JADX INFO: renamed from: q */
    private Intent m19427q() {
        return (!oc() || "com.xiaomi.xmsf".equals(this.f73132toq.getPackageName())) ? nn86() : lrht();
    }

    private synchronized void vyq(Intent intent) {
        if (this.f73130f7l8) {
            Message messageM19425n = m19425n(intent);
            if (this.f31328g.size() >= 50) {
                this.f31328g.remove(0);
            }
            this.f31328g.add(messageM19425n);
            return;
        }
        if (this.f31332q == null) {
            this.f73132toq.bindService(intent, new lvui(this), 1);
            this.f73130f7l8 = true;
            this.f31328g.clear();
            this.f31328g.add(m19425n(intent));
        } else {
            try {
                this.f31332q.send(m19425n(intent));
            } catch (RemoteException unused) {
                this.f31332q = null;
                this.f73130f7l8 = false;
            }
        }
    }

    private void x9kr(Intent intent) {
        try {
            if (nc.m21315s()) {
                this.f73132toq.startService(intent);
            } else {
                vyq(intent);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static synchronized d3 m19429y(Context context) {
        if (f73129x2 == null) {
            f73129x2 = new d3(context);
        }
        return f73129x2;
    }

    private void yz() {
        try {
            PackageManager packageManager = this.f73132toq.getPackageManager();
            ComponentName componentName = new ComponentName(this.f73132toq, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    public final void a9(String str, dd ddVar, hyr hyrVar, String str2) {
        o1t.toq(this.f73132toq).m19536q(ddVar, "syncing");
        HashMap<String, String> mapM19565y = uv6.m19565y(this.f73132toq, hyrVar);
        mapM19565y.put("third_sync_reason", str2);
        fti(str, ddVar, false, mapM19565y);
    }

    public void cdj(Context context) {
        if (nc.m21315s()) {
            return;
        }
        wvg wvgVarM19480k = C5653j.m19480k(context);
        if (wvg.HUAWEI.equals(wvgVarM19480k)) {
            a9(null, dd.UPLOAD_HUAWEI_TOKEN, hyr.ASSEMBLE_PUSH_HUAWEI, com.android.thememanager.util.hb.f61276lvui);
        }
        if (wvg.OPPO.equals(wvgVarM19480k)) {
            a9(null, dd.UPLOAD_COS_TOKEN, hyr.ASSEMBLE_PUSH_COS, com.android.thememanager.util.hb.f61276lvui);
        }
        if (wvg.VIVO.equals(wvgVarM19480k)) {
            a9(null, dd.UPLOAD_FTOS_TOKEN, hyr.ASSEMBLE_PUSH_FTOS, com.android.thememanager.util.hb.f61276lvui);
        }
    }

    public final void d3(boolean z2, String str) {
        if (z2) {
            o1t qVar = o1t.toq(this.f73132toq);
            dd ddVar = dd.DISABLE_PUSH;
            qVar.m19536q(ddVar, "syncing");
            o1t.toq(this.f73132toq).m19536q(dd.ENABLE_PUSH, "");
            fti(str, ddVar, true, null);
            return;
        }
        o1t qVar2 = o1t.toq(this.f73132toq);
        dd ddVar2 = dd.ENABLE_PUSH;
        qVar2.m19536q(ddVar2, "syncing");
        o1t.toq(this.f73132toq).m19536q(dd.DISABLE_PUSH, "");
        fti(str, ddVar2, true, null);
    }

    public void dd(int i2) {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73567fti, this.f73132toq.getPackageName());
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73562d3, i2);
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73564eqxt, C5874l.m21150q(this.f73132toq.getPackageName() + i2));
        m19419f(intentM19427q);
    }

    public boolean eqxt(int i2) {
        if (!C5656l.m19500q(this.f73132toq).t8r()) {
            return false;
        }
        hyr(i2);
        erbd erbdVar = new erbd();
        erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
        erbdVar.m20795b(C5656l.m19500q(this.f73132toq).m19505n());
        erbdVar.m20803d(this.f73132toq.getPackageName());
        erbdVar.m20799c(kq.ClientABTest.f33227a);
        HashMap map = new HashMap();
        erbdVar.f32866a = map;
        map.put("boot_mode", i2 + "");
        m19429y(this.f73132toq).m19435z(erbdVar, wwp.Notification, false, null);
        return true;
    }

    public final void fn3e(zxq zxqVar, boolean z2) {
        e5.m20763k(this.f73132toq.getApplicationContext()).f7l8(this.f73132toq.getPackageName(), "E100003", zxqVar.m22144a(), yqrt.ERROR_CODE_DRM_SCHEME_UNSUPPORTED, null);
        this.f31331p = null;
        C5656l.m19500q(this.f73132toq).f31388q = zxqVar.m22144a();
        Intent intentM19427q = m19427q();
        byte[] bArrM21397g = qla.m21397g(mcp.m19524k(this.f73132toq, zxqVar, wwp.Registration));
        if (bArrM21397g == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("register fail, because msgBytes is null.");
            return;
        }
        intentM19427q.setAction("com.xiaomi.mipush.REGISTER_APP");
        intentM19427q.putExtra("mipush_app_id", C5656l.m19500q(this.f73132toq).m19505n());
        intentM19427q.putExtra("mipush_payload", bArrM21397g);
        intentM19427q.putExtra("mipush_session", this.f73133zy);
        intentM19427q.putExtra("mipush_env_chanage", z2);
        intentM19427q.putExtra("mipush_env_type", C5656l.m19500q(this.f73132toq).m19504k());
        if (!com.xiaomi.push.oc.zurt(this.f73132toq) || !ncyb()) {
            this.f31331p = intentM19427q;
        } else {
            m19424m();
            m19419f(intentM19427q);
        }
    }

    public <T extends oaex<T, ?>> void fu4(T t2, wwp wwpVar, boolean z2) {
        C5646k c5646k = new C5646k();
        c5646k.f31335k = t2;
        c5646k.f73134toq = wwpVar;
        c5646k.f73135zy = z2;
        ArrayList<C5646k> arrayList = f73127n7h;
        synchronized (arrayList) {
            arrayList.add(c5646k);
            if (arrayList.size() > 10) {
                arrayList.remove(0);
            }
        }
    }

    public final void gvn7(boolean z2) {
        d3(z2, null);
    }

    /* JADX INFO: renamed from: h */
    void m19430h(int i2, String str) {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.thirdparty");
        intentM19427q.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i2);
        intentM19427q.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        x9kr(intentM19427q);
    }

    public void hb() {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) C5892r.f7l8("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f73132toq.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            com.xiaomi.channel.commonutils.logger.zy.kja0("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73567fti, packageName);
        m19419f(intentM19427q);
    }

    /* JADX INFO: renamed from: i */
    public final void m19431i(kl7m kl7mVar) {
        Intent intentM19427q = m19427q();
        byte[] bArrM21397g = qla.m21397g(kl7mVar);
        if (bArrM21397g == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        intentM19427q.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        intentM19427q.putExtra("mipush_payload", bArrM21397g);
        x9kr(intentM19427q);
    }

    public final <T extends oaex<T, ?>> void jk(T t2, wwp wwpVar, boolean z2, boolean z3, ge geVar, boolean z5, String str, String str2, boolean z6, boolean z7) {
        if (z7 && !C5656l.m19500q(this.f73132toq).zurt()) {
            if (z3) {
                fu4(t2, wwpVar, z2);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.zy.kja0("drop the message before initialization.");
                return;
            }
        }
        m28 qVar = z6 ? mcp.toq(this.f73132toq, t2, wwpVar, z2, str, str2) : mcp.m19523g(this.f73132toq, t2, wwpVar, z2, str, str2);
        if (geVar != null) {
            qVar.m21237a(geVar);
        }
        byte[] bArrM21397g = qla.m21397g(qVar);
        if (bArrM21397g == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("send message fail, because msgBytes is null.");
            return;
        }
        w831.m21956g(this.f73132toq.getPackageName(), this.f73132toq, t2, wwpVar, bArrM21397g.length);
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        intentM19427q.putExtra("mipush_payload", bArrM21397g);
        intentM19427q.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z5);
        m19419f(intentM19427q);
    }

    public void jp0y(String str, String str2) {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73567fti, this.f73132toq.getPackageName());
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73561d2ok, str);
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73575lvui, str2);
        m19419f(intentM19427q);
    }

    void ki(Intent intent) {
        intent.fillIn(m19427q(), 24);
        m19419f(intent);
    }

    void kja0(int i2, int i3) {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73567fti, this.f73132toq.getPackageName());
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73571jp0y, i2);
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73569gvn7, i3);
        m19419f(intentM19427q);
    }

    public final <T extends oaex<T, ?>> void mcp(T t2, wwp wwpVar, boolean z2, boolean z3, ge geVar, boolean z5, String str, String str2, boolean z6) {
        jk(t2, wwpVar, z2, z3, geVar, z5, str, str2, z6, true);
    }

    public void n5r1() {
        if (this.f31331p != null) {
            m19424m();
            m19419f(this.f31331p);
            this.f31331p = null;
        }
    }

    public void n7h(int i2) {
        kja0(i2, 0);
    }

    public boolean ncyb() {
        if (!oc() || !m19421j()) {
            return true;
        }
        if (this.f73131ld6 == null) {
            Integer numValueOf = Integer.valueOf(com.xiaomi.push.service.ncyb.zy(this.f73132toq).m21700k());
            this.f73131ld6 = numValueOf;
            if (numValueOf.intValue() == 0) {
                this.f73132toq.getContentResolver().registerContentObserver(com.xiaomi.push.service.ncyb.zy(this.f73132toq).toq(), false, new d2ok(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f73131ld6.intValue() != 0;
    }

    public final <T extends oaex<T, ?>> void ni7(T t2, wwp wwpVar, ge geVar) {
        m19435z(t2, wwpVar, !wwpVar.equals(wwp.Registration), geVar);
    }

    /* JADX INFO: renamed from: o */
    public void m19432o() {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73567fti, this.f73132toq.getPackageName());
        intentM19427q.putExtra(com.xiaomi.push.service.dd.f73564eqxt, C5874l.m21150q(this.f73132toq.getPackageName()));
        m19419f(intentM19427q);
    }

    public final <T extends oaex<T, ?>> void o1t(T t2, wwp wwpVar, boolean z2, ge geVar, boolean z3) {
        wvg(t2, wwpVar, z2, true, geVar, z3);
    }

    public boolean oc() {
        return this.f31329k && 1 == C5656l.m19500q(this.f73132toq).m19504k();
    }

    public void qrj() {
        x9kr(m19427q());
    }

    /* JADX INFO: renamed from: r */
    public final void m19433r() {
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m19419f(intentM19427q);
    }

    /* JADX INFO: renamed from: t */
    public final <T extends oaex<T, ?>> void m19434t(T t2, wwp wwpVar, boolean z2, boolean z3, ge geVar, boolean z5, String str, String str2) {
        mcp(t2, wwpVar, z2, z3, geVar, z5, str, str2, true);
    }

    public long toq() {
        return this.f31334y;
    }

    public void uv6() {
        ArrayList<C5646k> arrayList = f73127n7h;
        synchronized (arrayList) {
            boolean z2 = Thread.currentThread() == Looper.getMainLooper().getThread();
            for (C5646k c5646k : arrayList) {
                wvg(c5646k.f31335k, c5646k.f73134toq, c5646k.f73135zy, false, null, true);
                if (!z2) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f73127n7h.clear();
        }
    }

    public final <T extends oaex<T, ?>> void wvg(T t2, wwp wwpVar, boolean z2, boolean z3, ge geVar, boolean z5) {
        m19434t(t2, wwpVar, z2, z3, geVar, z5, this.f73132toq.getPackageName(), C5656l.m19500q(this.f73132toq).m19505n());
    }

    /* JADX INFO: renamed from: z */
    public final <T extends oaex<T, ?>> void m19435z(T t2, wwp wwpVar, boolean z2, ge geVar) {
        wvg(t2, wwpVar, z2, true, geVar, true);
    }

    public final void zurt(iz izVar) {
        byte[] bArrM21397g = qla.m21397g(mcp.m19524k(this.f73132toq, izVar, wwp.UnRegistration));
        if (bArrM21397g == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("unregister fail, because msgBytes is null.");
            return;
        }
        Intent intentM19427q = m19427q();
        intentM19427q.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        intentM19427q.putExtra("mipush_app_id", C5656l.m19500q(this.f73132toq).m19505n());
        intentM19427q.putExtra("mipush_payload", bArrM21397g);
        m19419f(intentM19427q);
    }
}
