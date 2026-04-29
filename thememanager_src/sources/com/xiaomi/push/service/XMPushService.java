package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3548p;
import com.xiaomi.clientreport.data.C5623k;
import com.xiaomi.mipush.sdk.C5650g;
import com.xiaomi.push.C5866h;
import com.xiaomi.push.C5874l;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.bih;
import com.xiaomi.push.bqie;
import com.xiaomi.push.brv;
import com.xiaomi.push.e5;
import com.xiaomi.push.ga;
import com.xiaomi.push.gb;
import com.xiaomi.push.h7am;
import com.xiaomi.push.imd;
import com.xiaomi.push.kbj;
import com.xiaomi.push.kiv;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.kt06;
import com.xiaomi.push.ktq;
import com.xiaomi.push.m28;
import com.xiaomi.push.m8;
import com.xiaomi.push.nc;
import com.xiaomi.push.o5;
import com.xiaomi.push.oki;
import com.xiaomi.push.oph;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.pnt2;
import com.xiaomi.push.qla;
import com.xiaomi.push.sb;
import com.xiaomi.push.service.C5914f;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.service.i9jn;
import com.xiaomi.push.tww7;
import com.xiaomi.push.uf;
import com.xiaomi.push.uo;
import com.xiaomi.push.verb;
import com.xiaomi.push.vwb;
import com.xiaomi.push.wu;
import com.xiaomi.push.wwp;
import com.xiaomi.push.xblq;
import com.xiaomi.push.xouc;
import com.xiaomi.push.xtb7;
import com.xiaomi.push.yqrt;
import com.xiaomi.push.z4j7;
import com.xiaomi.push.zff0;
import com.xiaomi.push.zxq;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class XMPushService extends Service implements tww7 {

    /* JADX INFO: renamed from: b */
    private static boolean f33658b = false;

    /* JADX INFO: renamed from: a */
    private ContentObserver f33661a;

    /* JADX INFO: renamed from: a */
    private bqie f33663a;

    /* JADX INFO: renamed from: a */
    private imd f33664a;

    /* JADX INFO: renamed from: a */
    private C5896g f33666a;

    /* JADX INFO: renamed from: a */
    private C5898i f33667a;

    /* JADX INFO: renamed from: a */
    private C5899k f33668a;

    /* JADX INFO: renamed from: a */
    private ki f33669a;

    /* JADX INFO: renamed from: a */
    private ld6 f33670a;

    /* JADX INFO: renamed from: a */
    private d8wk f33672a;

    /* JADX INFO: renamed from: a */
    private hyr f33673a;

    /* JADX INFO: renamed from: a */
    private zff0 f33675a;

    /* JADX INFO: renamed from: a */
    private Object f33677a;

    /* JADX INFO: renamed from: a */
    private boolean f33680a = false;

    /* JADX INFO: renamed from: a */
    private int f33659a = 0;

    /* JADX INFO: renamed from: b */
    private int f33681b = 0;

    /* JADX INFO: renamed from: a */
    private long f33660a = 0;

    /* JADX INFO: renamed from: a */
    protected Class f33676a = XMJobService.class;

    /* JADX INFO: renamed from: c */
    private int f33682c = -1;

    /* JADX INFO: renamed from: a */
    private d3 f33671a = null;

    /* JADX INFO: renamed from: a */
    private i9jn f33674a = null;

    /* JADX INFO: renamed from: a */
    Messenger f33662a = null;

    /* JADX INFO: renamed from: a */
    private Collection<InterfaceC5917i> f33679a = Collections.synchronizedCollection(new ArrayList());

    /* JADX INFO: renamed from: a */
    private ArrayList<n7h> f33678a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private kbj f33665a = new C5943x(this);

    class cdj extends AbstractC5901p {
        cdj() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.m21527a(11, (Exception) null);
            if (XMPushService.this.m21538a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m21492a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m21512f();
                }
            }
        }
    }

    public class f7l8 extends AbstractC5901p {

        /* JADX INFO: renamed from: n */
        public Exception f33685n;

        /* JADX INFO: renamed from: q */
        public int f33686q;

        f7l8(int i2, Exception exc) {
            super(2);
            this.f33686q = i2;
            this.f33685n = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.m21527a(this.f33686q, this.f33685n);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$g */
    class C5896g extends BroadcastReceiver {
        C5896g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.push.oc.ki();
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$h */
    class C5897h extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        eqxt.toq f33689q;

        public C5897h(eqxt.toq toqVar) {
            super(4);
            this.f33689q = toqVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "rebind the client. " + this.f33689q.f33766y;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            try {
                this.f33689q.ld6(eqxt.zy.unbind, 1, 16, null, null);
                imd imdVar = XMPushService.this.f33664a;
                eqxt.toq toqVar = this.f33689q;
                imdVar.kja0(toqVar.f33766y, toqVar.f73603toq);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.m21531a(xMPushService.new toq(this.f33689q), 300L);
            } catch (ovdh e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                XMPushService.this.m21527a(10, e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$i */
    class C5898i extends BroadcastReceiver {
        C5898i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f33680a) {
                XMPushService.this.f33680a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    class ki extends BroadcastReceiver {
        ki() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    class kja0 extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        boolean f33694q;

        public kja0(boolean z2) {
            super(4);
            this.f33694q = z2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            if (XMPushService.this.m21544c()) {
                try {
                    if (!this.f33694q) {
                        bih.m20651k();
                    }
                    XMPushService.this.f33664a.wvg(this.f33694q);
                } catch (ovdh e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                    XMPushService.this.m21527a(10, e2);
                }
            }
        }
    }

    class ld6 extends BroadcastReceiver {
        ld6() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] hold short heartbeat, " + nc.m21312n(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$n */
    public class C5900n extends AbstractC5901p {
        C5900n() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            if (XMPushService.this.m21538a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m21492a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m21512f();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("should not connect. quit the job.");
        }
    }

    public interface n7h {
        /* JADX INFO: renamed from: a */
        void mo21145a();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$p */
    public static abstract class AbstractC5901p extends i9jn.toq {
        public AbstractC5901p(int i2) {
            super(i2);
        }

        /* JADX INFO: renamed from: k */
        public abstract String mo21141k();

        @Override // java.lang.Runnable
        public void run() {
            int i2 = this.f33805k;
            if (i2 != 4 && i2 != 8) {
                com.xiaomi.channel.commonutils.logger.zy.m19293h(com.xiaomi.channel.commonutils.logger.toq.f31251k, mo21141k());
            }
            toq();
        }

        public abstract void toq();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$q */
    class C5902q extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        private o5 f33698q;

        public C5902q(o5 o5Var) {
            super(8);
            this.f33698q = o5Var;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.f33671a.m21567k(this.f33698q);
            if (vq.m21773k(this.f33698q)) {
                XMPushService.this.m21531a(new C5914f.k(), C3548p.f65211lw);
            }
        }
    }

    class qrj extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        private xtb7 f33700q;

        public qrj(xtb7 xtb7Var) {
            super(8);
            this.f33700q = xtb7Var;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.f33671a.zy(this.f33700q);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$s */
    class C5903s extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        private Intent f33702q;

        public C5903s(Intent intent) {
            super(15);
            this.f33702q = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "Handle intent action = " + this.f33702q.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.m21509d(this.f33702q);
        }
    }

    class t8r extends AbstractC5901p {

        /* JADX INFO: renamed from: g */
        String f33703g;

        /* JADX INFO: renamed from: n */
        int f33704n;

        /* JADX INFO: renamed from: q */
        eqxt.toq f33705q;

        /* JADX INFO: renamed from: y */
        String f33707y;

        public t8r(eqxt.toq toqVar, int i2, String str, String str2) {
            super(9);
            this.f33705q = toqVar;
            this.f33704n = i2;
            this.f33703g = str;
            this.f33707y = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "unbind the channel. " + this.f33705q.f33766y;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            if (this.f33705q.f73601qrj != eqxt.zy.unbind && XMPushService.this.f33664a != null) {
                try {
                    imd imdVar = XMPushService.this.f33664a;
                    eqxt.toq toqVar = this.f33705q;
                    imdVar.kja0(toqVar.f33766y, toqVar.f73603toq);
                } catch (ovdh e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                    XMPushService.this.m21527a(10, e2);
                }
            }
            this.f33705q.ld6(eqxt.zy.unbind, this.f33704n, 0, this.f33707y, this.f33703g);
        }
    }

    class toq extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        eqxt.toq f33709q;

        public toq(eqxt.toq toqVar) {
            super(9);
            this.f33709q = toqVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "bind the client. " + this.f33709q.f33766y;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            try {
                if (XMPushService.this.m21544c()) {
                    eqxt eqxtVarZy = eqxt.zy();
                    eqxt.toq toqVar = this.f33709q;
                    eqxt.toq qVar = eqxtVarZy.toq(toqVar.f33766y, toqVar.f73603toq);
                    if (qVar == null) {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("ignore bind because the channel " + this.f33709q.f33766y + " is removed ");
                    } else if (qVar.f73601qrj == eqxt.zy.unbind) {
                        qVar.ld6(eqxt.zy.binding, 0, 0, null, null);
                        XMPushService.this.f33664a.qrj(qVar);
                        bih.m20650g(XMPushService.this, qVar);
                    } else {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("trying duplicate bind, ingore! " + qVar.f73601qrj);
                    }
                } else {
                    com.xiaomi.channel.commonutils.logger.zy.jk("trying bind while the connection is not created, quit!");
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("Meet error when trying to bind. " + e2);
                XMPushService.this.m21527a(10, e2);
            } catch (Throwable unused) {
            }
        }
    }

    class x2 extends AbstractC5901p {
        public x2() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.f33674a.toq();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$y */
    class C5904y extends AbstractC5901p {
        C5904y() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            XMPushService.this.m21503c();
        }
    }

    static class zy extends AbstractC5901p {

        /* JADX INFO: renamed from: q */
        private final eqxt.toq f33712q;

        public zy(eqxt.toq toqVar) {
            super(12);
            this.f33712q = toqVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof zy) {
                return TextUtils.equals(((zy) obj).f33712q.f33766y, this.f33712q.f33766y);
            }
            return false;
        }

        public int hashCode() {
            return this.f33712q.f33766y.hashCode();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "bind time out. chid=" + this.f33712q.f33766y;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            this.f33712q.ld6(eqxt.zy.unbind, 1, 21, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m21508d() {
        com.xiaomi.push.lvui lvuiVarM21359n = com.xiaomi.push.oc.m21359n();
        py.zy(getApplicationContext()).m21728g(lvuiVarM21359n);
        if (lvuiVarM21359n != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append("[type: " + lvuiVarM21359n.m21211n() + "[" + lvuiVarM21359n.m21213y() + "], state: " + lvuiVarM21359n.zy() + "/" + lvuiVarM21359n.toq());
            com.xiaomi.channel.commonutils.logger.zy.m19293h("XMPushService", sb.toString());
            NetworkInfo.State stateZy = lvuiVarM21359n.zy();
            if (stateZy == NetworkInfo.State.SUSPENDED || stateZy == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.zy.m19293h("XMPushService", "network changed, no active network");
        }
        if (kiv.m21079n() != null) {
            kiv.m21079n().toq();
        }
        z4j7.m22071y(this);
        this.f33675a.a9();
        if (com.xiaomi.push.oc.zurt(this)) {
            if (m21544c() && m21513f()) {
                m21501b(false);
            }
            if (!m21544c() && !m21545d()) {
                this.f33674a.zy(1);
                m21530a(new C5900n());
            }
            h7am.toq(this).m20952q();
        } else {
            m21530a(new f7l8(2, null));
        }
        m21510e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m21510e() {
        if (!m21538a()) {
            oki.m21367k();
        } else {
            if (oki.m21368n()) {
                return;
            }
            oki.m21369q(true);
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m21513f() {
        if (SystemClock.elapsedRealtime() - this.f33660a < 30000) {
            return false;
        }
        return com.xiaomi.push.oc.fu4(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m21515g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* JADX INFO: renamed from: h */
    private void m21516h() {
    }

    /* JADX INFO: renamed from: h */
    private boolean m21517h() {
        boolean zEquals;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("current sdk expect region is cn");
            zEquals = brv.China.name().equals(C5926m.m21688k(getApplicationContext()).toq());
        } else {
            zEquals = !sok.m21751k(this).m21753n(packageName);
        }
        if (!zEquals) {
            com.xiaomi.channel.commonutils.logger.zy.ki("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(zEquals), ", package=", packageName, ", region=", C5926m.m21688k(getApplicationContext()).toq());
        }
        return zEquals;
    }

    /* JADX INFO: renamed from: i */
    private boolean m21519i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && m21520j() && !m8.cdj(this) && !m8.ld6(getApplicationContext());
    }

    /* JADX INFO: renamed from: j */
    private boolean m21520j() {
        int iIntValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i2 = this.f33659a;
        int i3 = this.f33681b;
        if (i2 > i3) {
            if (iIntValue >= i2 || iIntValue < i3) {
                return true;
            }
        } else if (i2 < i3 && iIntValue >= i2 && iIntValue < i3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private boolean m21521k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return a9.m21550q(this).qrj(oph.ForegroundServiceSwitch.m21370a(), false);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f33662a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] strArrSplit;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.zy.x2(getApplicationContext());
        wu.m21968n(this);
        v0af qVar = etdu.toq(this);
        if (qVar != null) {
            xouc.toq(qVar.f73671f7l8);
        }
        C5943x c5943x = null;
        if (nc.m21313p(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f33668a = new C5899k(this, c5943x);
            verb.m21902q(this, this.f33668a, new IntentFilter(dd.f73560cdj), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            f33658b = true;
            handler.post(new bo(this));
        }
        this.f33662a = new Messenger(new y2(this));
        x9kr.m21798q(this);
        c8jq c8jqVar = new c8jq(this, null, 5222, "xiaomi.com", null);
        this.f33663a = c8jqVar;
        c8jqVar.m20663y(true);
        this.f33675a = new zff0(this, this.f33663a);
        this.f33672a = m21524a();
        oki.toq(this);
        this.f33675a.m20985s(this);
        this.f33671a = new d3(this);
        this.f33673a = new hyr(this);
        new g1().toq();
        kiv.m21078g().m21082p(this);
        this.f33674a = new i9jn("Connection Controller Thread");
        eqxt eqxtVarZy = eqxt.zy();
        eqxtVarZy.kja0();
        eqxtVarZy.ld6(new gyi(this));
        if (m21521k()) {
            m21516h();
        }
        uo.m21870k(this).m21872q(new r8s8(this), "UPLOADER_PUSH_CHANNEL");
        m21529a(new kt06(this));
        m21529a(new C5905a(this));
        if (nc.m21313p(this)) {
            m21529a(new oc());
            if (m8.m21278p()) {
                m21529a(new dr(this));
            }
        }
        m21530a(new C5904y());
        this.f33679a.add(C5921j.zy(this));
        if (m21517h()) {
            this.f33666a = new C5896g();
            verb.zy(this, this.f33666a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
            this.f33677a = com.xiaomi.push.oc.m21362s(this);
        }
        if (nc.m21313p(getApplicationContext())) {
            this.f33667a = new C5898i();
            verb.m21902q(this, this.f33667a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            ld6 ld6Var = new ld6();
            this.f33670a = ld6Var;
            verb.m21902q(this, ld6Var, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f33661a = new xwq3(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f33661a);
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.zy.jk("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] iArrM21497a = m21497a();
            if (iArrM21497a != null) {
                this.f33669a = new ki();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                verb.zy(this, this.f33669a, intentFilter, null, null);
                this.f33659a = iArrM21497a[0];
                this.f33681b = iArrM21497a[1];
                com.xiaomi.channel.commonutils.logger.zy.kja0("falldown initialized: " + this.f33659a + "," + this.f33681b);
            }
        }
        com.xiaomi.push.ltg8.m21205q(this, this.f33675a);
        yqrt.toq(this, this.f33675a);
        String str = "";
        if (qVar != null) {
            try {
                if (!TextUtils.isEmpty(qVar.f33918k) && (strArrSplit = qVar.f33918k.split("@")) != null && strArrSplit.length > 0) {
                    str = strArrSplit[0];
                }
            } catch (Exception unused) {
            }
        }
        ktq.m21146k(this);
        com.xiaomi.channel.commonutils.logger.zy.a9("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + uf.toq(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C5896g c5896g = this.f33666a;
        if (c5896g != null) {
            m21486a(c5896g);
            this.f33666a = null;
        }
        Object obj = this.f33677a;
        if (obj != null) {
            com.xiaomi.push.oc.t8r(this, obj);
            this.f33677a = null;
        }
        C5898i c5898i = this.f33667a;
        if (c5898i != null) {
            m21486a(c5898i);
            this.f33667a = null;
        }
        ld6 ld6Var = this.f33670a;
        if (ld6Var != null) {
            m21486a(ld6Var);
            this.f33670a = null;
        }
        ki kiVar = this.f33669a;
        if (kiVar != null) {
            m21486a(kiVar);
            this.f33669a = null;
        }
        C5899k c5899k = this.f33668a;
        if (c5899k != null) {
            m21486a(c5899k);
            this.f33668a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f33661a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f33661a);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.zy.jk("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f33679a.clear();
        this.f33674a.m21625p();
        m21530a(new lv5(this, 2));
        m21530a(new x2());
        eqxt.zy().kja0();
        eqxt.zy().m21585p(this, 15);
        eqxt.zy().m21587y();
        this.f33675a.fu4(this);
        nn86.m21710g().m21717s();
        oki.m21367k();
        m21518i();
        com.xiaomi.push.ltg8.m21206s(this, this.f33675a);
        yqrt.m22057g(this, this.f33675a);
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.zy.kja0("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(dd.f73588zurt);
                String stringExtra2 = intent.getStringExtra(dd.f73567fti);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    com.xiaomi.channel.commonutils.logger.zy.m19293h("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, nc.m21312n(intent)));
                } else {
                    com.xiaomi.channel.commonutils.logger.zy.m19293h("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3));
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.zy.jk("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f33674a.f7l8()) {
                    com.xiaomi.channel.commonutils.logger.zy.jk("ERROR, the job controller is blocked.");
                    eqxt.zy().m21585p(this, 14);
                    stopSelf();
                } else {
                    m21530a(new C5903s(intent));
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                m21530a(new C5903s(intent));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("[Prefs] spend " + jCurrentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 1;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMPushService$k */
    private class C5899k extends BroadcastReceiver {

        /* JADX INFO: renamed from: k */
        private final Object f33691k;

        private C5899k() {
            this.f33691k = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public void m21546k() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.zy.jk("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f33691k) {
                try {
                    this.f33691k.notifyAll();
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] notify lock. " + e2);
                }
            }
        }

        private void toq(long j2) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.zy.jk("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f33691k) {
                try {
                    this.f33691k.wait(j2);
                } catch (InterruptedException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] interrupt from waiting state. " + e2);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.zy.m19300t("[Alarm] heartbeat alarm has been triggered.");
            if (!dd.f73560cdj.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] cancel the old ping timer");
                oki.m21367k();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    C5922k.zurt(context).oc(intent2);
                    toq(C3548p.f65176gcp);
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        /* synthetic */ C5899k(XMPushService xMPushService, C5943x c5943x) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(1:5)|6|(2:12|(3:14|(1:16)(1:17)|18)(10:19|20|(1:22)|23|(1:25)|36|26|(1:28)|32|(2:34|35)(1:38)))(1:10)|11|20|(0)|23|(0)|36|26|(0)|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        com.xiaomi.channel.commonutils.logger.zy.t8r(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de A[Catch: Exception -> 0x00e4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e4, blocks: (B:26:0x00d8, B:28:0x00de), top: B:36:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m21503c() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.m21503c():void");
    }

    /* JADX INFO: renamed from: b */
    private String m21498b() {
        String strM21485a;
        C5866h.m20945k();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i2 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            ncyb ncybVarZy = ncyb.zy(this);
            String strM21485a2 = null;
            while (true) {
                if (!TextUtils.isEmpty(strM21485a2) && ncybVarZy.m21700k() != 0) {
                    strM21485a = m21485a();
                    break;
                }
                if (TextUtils.isEmpty(strM21485a2)) {
                    strM21485a2 = m21485a();
                }
                try {
                    synchronized (obj) {
                        if (i2 < 30) {
                            obj.wait(1000L);
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i2++;
            }
        } else {
            strM21485a = "CN";
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("wait coutrycode :" + strM21485a + " cost = " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " , count = " + i2);
        return strM21485a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m21512f() {
        imd imdVar = this.f33664a;
        if (imdVar != null && imdVar.m20986t()) {
            com.xiaomi.channel.commonutils.logger.zy.jk("try to connect while connecting.");
            return;
        }
        imd imdVar2 = this.f33664a;
        if (imdVar2 != null && imdVar2.jk()) {
            com.xiaomi.channel.commonutils.logger.zy.jk("try to connect while is connected.");
            return;
        }
        this.f33663a.kja0(com.xiaomi.push.oc.m21360p(this));
        m21514g();
        if (this.f33664a == null) {
            eqxt.zy().m21586s(this);
            m21507c(false);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m21514g() {
        try {
            this.f33675a.ld6(this.f33665a, new t8iq(this));
            this.f33675a.m20665l();
            this.f33664a = this.f33675a;
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("fail to create Slim connection", e2);
            this.f33675a.zurt(3, e2);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m21518i() {
        synchronized (this.f33678a) {
            this.f33678a.clear();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21511e() {
        return f33658b;
    }

    /* JADX INFO: renamed from: a */
    public int m21522a() {
        if (this.f33682c < 0) {
            this.f33682c = uf.toq(this, "com.xiaomi.xmsf");
        }
        return this.f33682c;
    }

    /* JADX INFO: renamed from: a */
    private int[] m21497a() {
        String[] strArrSplit;
        String strM21552g = a9.m21550q(getApplicationContext()).m21552g(oph.FallDownTimeRange.m21370a(), "");
        if (!TextUtils.isEmpty(strM21552g) && (strArrSplit = strM21552g.split(",")) != null && strArrSplit.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(strArrSplit[0]).intValue();
                int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
                iArr[1] = iIntValue;
                int i2 = iArr[0];
                if (i2 >= 0 && i2 <= 23 && iIntValue >= 0 && iIntValue <= 23 && i2 != iIntValue) {
                    return iArr;
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m21501b(boolean z2) {
        this.f33660a = SystemClock.elapsedRealtime();
        if (!m21544c()) {
            m21535a(true);
        } else if (com.xiaomi.push.oc.zurt(this)) {
            m21505c(new kja0(z2));
        } else {
            m21505c(new f7l8(17, null));
            m21535a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    private String m21485a() {
        String strF7l8 = nc.f7l8("ro.miui.region");
        return TextUtils.isEmpty(strF7l8) ? nc.f7l8("ro.product.locale.region") : strF7l8;
    }

    /* JADX INFO: renamed from: b */
    private void m21499b(Intent intent) {
        long j2;
        String stringExtra = intent.getStringExtra(dd.f73567fti);
        String stringExtra2 = intent.getStringExtra(dd.f73581oc);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        eqxt eqxtVarZy = eqxt.zy();
        o5 o5VarZy = null;
        if (bundleExtra != null) {
            pnt2 pnt2Var = (pnt2) m21484a(new pnt2(bundleExtra), stringExtra, stringExtra2);
            if (pnt2Var == null) {
                return;
            } else {
                o5VarZy = o5.zy(pnt2Var, eqxtVarZy.toq(pnt2Var.qrj(), pnt2Var.cdj()).f33765s);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j2 = Long.parseLong(intent.getStringExtra(dd.f73583t8r));
                } catch (NumberFormatException unused) {
                    j2 = 0;
                }
                String stringExtra3 = intent.getStringExtra(dd.f33743i);
                String stringExtra4 = intent.getStringExtra(dd.f73566fn3e);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                eqxt.toq qVar = eqxtVarZy.toq(stringExtra5, String.valueOf(j2));
                if (qVar != null) {
                    o5 o5Var = new o5();
                    try {
                        o5Var.m21353y(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    o5Var.x2("SECMSG", null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    o5Var.m21350p(j2, stringExtra3, stringExtra4);
                    o5Var.ld6(intent.getStringExtra("ext_pkt_id"));
                    o5Var.n7h(byteArrayExtra, qVar.f33765s);
                    com.xiaomi.channel.commonutils.logger.zy.kja0("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    o5VarZy = o5Var;
                }
            }
        }
        if (o5VarZy != null) {
            m21505c(new vyq(this, o5VarZy));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m21490a(String str) {
        if (brv.China.name().equals(str)) {
            com.xiaomi.push.tfm.n7h("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            com.xiaomi.push.tfm.n7h("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            com.xiaomi.push.tfm.n7h("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            com.xiaomi.push.tfm.n7h("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            com.xiaomi.push.tfm.n7h("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            com.xiaomi.push.tfm.n7h("resolver.msg.xiaomi.net", "111.13.142.153:443");
            com.xiaomi.push.tfm.n7h("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m21509d(Intent intent) {
        int i2;
        String strM21150q;
        SharedPreferences sharedPreferences;
        eqxt eqxtVarZy = eqxt.zy();
        boolean z2 = true;
        int i3 = 0;
        if (!dd.f33748q.equalsIgnoreCase(intent.getAction()) && !dd.f33747p.equalsIgnoreCase(intent.getAction())) {
            if (dd.f33750s.equalsIgnoreCase(intent.getAction())) {
                String stringExtra = intent.getStringExtra(dd.f73567fti);
                String stringExtra2 = intent.getStringExtra(dd.f73588zurt);
                String stringExtra3 = intent.getStringExtra(dd.f73583t8r);
                com.xiaomi.channel.commonutils.logger.zy.kja0("Service called close channel chid = " + stringExtra2 + " res = " + eqxt.toq.m21589n(stringExtra3));
                if (TextUtils.isEmpty(stringExtra2)) {
                    Iterator<String> it = eqxtVarZy.f7l8(stringExtra).iterator();
                    while (it.hasNext()) {
                        m21491a(it.next(), 2);
                    }
                    return;
                } else if (TextUtils.isEmpty(stringExtra3)) {
                    m21491a(stringExtra2, 2);
                    return;
                } else {
                    m21533a(stringExtra2, stringExtra3, 2, null, null);
                    return;
                }
            }
            if (dd.f33746n.equalsIgnoreCase(intent.getAction())) {
                m21499b(intent);
                return;
            }
            if (dd.f73565f7l8.equalsIgnoreCase(intent.getAction())) {
                m21504c(intent);
                return;
            }
            if (dd.f33741g.equalsIgnoreCase(intent.getAction())) {
                xtb7 xtb7VarM21484a = m21484a(new xblq(intent.getBundleExtra("ext_packet")), intent.getStringExtra(dd.f73567fti), intent.getStringExtra(dd.f73581oc));
                if (xtb7VarM21484a != null) {
                    m21505c(new vyq(this, o5.zy(xtb7VarM21484a, eqxtVarZy.toq(xtb7VarM21484a.qrj(), xtb7VarM21484a.cdj()).f33765s)));
                    return;
                }
                return;
            }
            if (dd.f33752y.equalsIgnoreCase(intent.getAction())) {
                xtb7 xtb7VarM21484a2 = m21484a(new vwb(intent.getBundleExtra("ext_packet")), intent.getStringExtra(dd.f73567fti), intent.getStringExtra(dd.f73581oc));
                if (xtb7VarM21484a2 != null) {
                    m21505c(new vyq(this, o5.zy(xtb7VarM21484a2, eqxtVarZy.toq(xtb7VarM21484a2.qrj(), xtb7VarM21484a2.cdj()).f33765s)));
                    return;
                }
                return;
            }
            if (dd.f73574ld6.equals(intent.getAction())) {
                String stringExtra4 = intent.getStringExtra(dd.f73588zurt);
                String stringExtra5 = intent.getStringExtra(dd.f73583t8r);
                if (stringExtra4 != null) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("request reset connection from chid = " + stringExtra4);
                    eqxt.toq qVar = eqxt.zy().toq(stringExtra4, stringExtra5);
                    if (qVar != null && qVar.f33765s.equals(intent.getStringExtra(dd.f33751t)) && qVar.f73601qrj == eqxt.zy.binded) {
                        imd imdVarM21523a = m21523a();
                        if (imdVarM21523a == null || !imdVarM21523a.ki(SystemClock.elapsedRealtime() - C3548p.f65211lw)) {
                            m21505c(new cdj());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String string = null;
            qVar = null;
            eqxt.toq qVar2 = null;
            string = null;
            if (dd.f73586x2.equals(intent.getAction())) {
                String stringExtra6 = intent.getStringExtra(dd.f73567fti);
                List<String> listF7l8 = eqxtVarZy.f7l8(stringExtra6);
                if (listF7l8.isEmpty()) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("open channel should be called first before update info, pkg=" + stringExtra6);
                    return;
                }
                String stringExtra7 = intent.getStringExtra(dd.f73588zurt);
                String stringExtra8 = intent.getStringExtra(dd.f73583t8r);
                if (TextUtils.isEmpty(stringExtra7)) {
                    stringExtra7 = listF7l8.get(0);
                }
                if (TextUtils.isEmpty(stringExtra8)) {
                    Collection<eqxt.toq> collectionM21582g = eqxtVarZy.m21582g(stringExtra7);
                    if (collectionM21582g != null && !collectionM21582g.isEmpty()) {
                        qVar2 = collectionM21582g.iterator().next();
                    }
                } else {
                    qVar2 = eqxtVarZy.toq(stringExtra7, stringExtra8);
                }
                if (qVar2 != null) {
                    if (intent.hasExtra(dd.f73570jk)) {
                        qVar2.f33758g = intent.getStringExtra(dd.f73570jk);
                    }
                    if (intent.hasExtra(dd.f73559a9)) {
                        qVar2.f73595f7l8 = intent.getStringExtra(dd.f73559a9);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) && !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
                    if (ncyb.zy(getApplicationContext()).m21701q() && ncyb.zy(getApplicationContext()).m21700k() == 0) {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("register without being provisioned. " + intent.getStringExtra("mipush_app_package"));
                        return;
                    }
                    byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
                    String stringExtra9 = intent.getStringExtra("mipush_app_package");
                    boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
                    int intExtra = intent.getIntExtra("mipush_env_type", 1);
                    sok.m21751k(this).m21757y(stringExtra9);
                    if (booleanExtra && !"com.xiaomi.xmsf".equals(getPackageName())) {
                        m21505c(new ch(this, 14, intExtra, stringExtra9, byteArrayExtra));
                        return;
                    } else {
                        m21536a(byteArrayExtra, stringExtra9);
                        return;
                    }
                }
                if (!"com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) && !"com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                    if (AbstractC5924l.f33837k.equals(intent.getAction())) {
                        String stringExtra10 = intent.getStringExtra("uninstall_pkg_name");
                        if (stringExtra10 == null || TextUtils.isEmpty(stringExtra10.trim())) {
                            return;
                        }
                        try {
                            PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra10, 0);
                            if (packageInfo == null || packageInfo.applicationInfo == null || !m8.x2(this, packageInfo.packageName)) {
                                z2 = false;
                            } else {
                                com.xiaomi.channel.commonutils.logger.zy.kja0("dual space's app uninstalled " + stringExtra10);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if ("com.xiaomi.channel".equals(stringExtra10) && !eqxt.zy().m21582g("1").isEmpty() && z2) {
                            m21491a("1", 0);
                            com.xiaomi.channel.commonutils.logger.zy.kja0("close the miliao channel as the app is uninstalled.");
                            return;
                        }
                        SharedPreferences sharedPreferences2 = getSharedPreferences("pref_registered_pkg_names", 0);
                        String string2 = sharedPreferences2.getString(stringExtra10, null);
                        if (TextUtils.isEmpty(string2) || !z2) {
                            return;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                        editorEdit.remove(stringExtra10);
                        editorEdit.commit();
                        if (com.xiaomi.push.service.kja0.m21663f(this, stringExtra10)) {
                            com.xiaomi.push.service.kja0.vyq(this, stringExtra10);
                        }
                        com.xiaomi.push.service.kja0.fu4(this, stringExtra10);
                        zurt.m21812g(getApplicationContext(), stringExtra10);
                        if (!m21544c() || string2 == null) {
                            return;
                        }
                        try {
                            com.xiaomi.push.service.x2.m21796s(this, com.xiaomi.push.service.x2.zy(stringExtra10, string2));
                            com.xiaomi.channel.commonutils.logger.zy.kja0("uninstall " + stringExtra10 + " msg sent");
                            return;
                        } catch (ovdh e2) {
                            com.xiaomi.channel.commonutils.logger.zy.jk("Fail to send Message: " + e2.getMessage());
                            m21527a(10, e2);
                            return;
                        }
                    }
                    if (AbstractC5924l.f73636toq.equals(intent.getAction())) {
                        String stringExtra11 = intent.getStringExtra("data_cleared_pkg_name");
                        if (TextUtils.isEmpty(stringExtra11)) {
                            return;
                        }
                        try {
                            sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
                            if (sharedPreferences != null) {
                                try {
                                    string = sharedPreferences.getString(stringExtra11, null);
                                } catch (Throwable th) {
                                    th = th;
                                    com.xiaomi.channel.commonutils.logger.zy.kja0("Fail to get sp or appId : " + th);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sharedPreferences = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            editorEdit2.remove(stringExtra11);
                            editorEdit2.commit();
                            if (com.xiaomi.push.service.kja0.m21663f(this, stringExtra11)) {
                                com.xiaomi.push.service.kja0.vyq(this, stringExtra11);
                            }
                            com.xiaomi.push.service.kja0.fu4(this, stringExtra11);
                            m21534a(stringExtra11, qla.m21397g(com.xiaomi.push.service.x2.qrj(stringExtra11, string)), true);
                        }
                        zurt.m21812g(this, stringExtra11);
                        if (nc.m21313p(getApplicationContext())) {
                            com.xiaomi.push.service.ld6.m21680n(stringExtra11);
                            return;
                        }
                        return;
                    }
                    if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
                        String stringExtra12 = intent.getStringExtra(dd.f73567fti);
                        int intExtra2 = intent.getIntExtra(dd.f73571jp0y, -2);
                        if (TextUtils.isEmpty(stringExtra12)) {
                            return;
                        }
                        if (intExtra2 >= -1) {
                            com.xiaomi.push.service.kja0.o1t(this, stringExtra12, intExtra2, intent.getIntExtra(dd.f73569gvn7, -1));
                            return;
                        } else {
                            com.xiaomi.push.service.kja0.m21674t(this, stringExtra12, intent.getStringExtra(dd.f73561d2ok), intent.getStringExtra(dd.f73575lvui));
                            return;
                        }
                    }
                    if ("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION".equals(intent.getAction())) {
                        String stringExtra13 = intent.getStringExtra(dd.f73567fti);
                        if (TextUtils.isEmpty(stringExtra13)) {
                            return;
                        }
                        com.xiaomi.push.service.kja0.m21668l(this, stringExtra13);
                        return;
                    }
                    if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
                        String stringExtra14 = intent.getStringExtra(dd.f73567fti);
                        String stringExtra15 = intent.getStringExtra(dd.f73564eqxt);
                        if (intent.hasExtra(dd.f73562d3)) {
                            int intExtra3 = intent.getIntExtra(dd.f73562d3, 0);
                            strM21150q = C5874l.m21150q(stringExtra14 + intExtra3);
                            z2 = false;
                            i3 = intExtra3;
                        } else {
                            strM21150q = C5874l.m21150q(stringExtra14);
                        }
                        if (TextUtils.isEmpty(stringExtra14) || !TextUtils.equals(stringExtra15, strM21150q)) {
                            com.xiaomi.channel.commonutils.logger.zy.jk("invalid notification for " + stringExtra14);
                            return;
                        }
                        if (z2) {
                            com.xiaomi.push.service.kja0.vyq(this, stringExtra14);
                            return;
                        } else {
                            com.xiaomi.push.service.kja0.n5r1(this, stringExtra14, i3);
                            return;
                        }
                    }
                    if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
                        String stringExtra16 = intent.getStringExtra("mipush_app_package");
                        if (!TextUtils.isEmpty(stringExtra16)) {
                            sok.m21751k(this).m21755q(stringExtra16);
                        }
                        if ("com.xiaomi.xmsf".equals(getPackageName())) {
                            return;
                        }
                        m21527a(19, (Exception) null);
                        m21510e();
                        stopSelf();
                        return;
                    }
                    if (!"com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) && !"com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                            String stringExtra17 = intent.getStringExtra("mipush_app_package");
                            byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                            kl7m kl7mVar = new kl7m();
                            try {
                                qla.m21399n(kl7mVar, byteArrayExtra2);
                                uo.m21870k(this).m21871n(kl7mVar, stringExtra17);
                                return;
                            } catch (sb e3) {
                                com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                                return;
                            }
                        }
                        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
                            com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] Service called on timer");
                            if (m21519i()) {
                                if (oki.m21368n()) {
                                    com.xiaomi.channel.commonutils.logger.zy.kja0("enter falldown mode, stop alarm");
                                    oki.m21367k();
                                }
                            } else {
                                oki.m21369q(false);
                                if (m21513f()) {
                                    m21501b(false);
                                }
                            }
                            C5899k c5899k = this.f33668a;
                            if (c5899k != null) {
                                c5899k.m21546k();
                                return;
                            }
                            return;
                        }
                        if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                            com.xiaomi.channel.commonutils.logger.zy.kja0("Service called on check alive.");
                            if (m21513f()) {
                                m21501b(false);
                                return;
                            }
                            return;
                        }
                        if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
                            com.xiaomi.channel.commonutils.logger.zy.kja0("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
                            oki.zy(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
                            return;
                        }
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            m21508d();
                            return;
                        }
                        if ("miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                            m21487a(intent);
                            return;
                        }
                        if ("com.xiaomi.xmsf.USE_INTELLIGENT_HB".equals(intent.getAction())) {
                            if (intent.getExtras() == null || (i2 = intent.getExtras().getInt("effectivePeriod", 0)) <= 0 || i2 > 604800) {
                                return;
                            }
                            py.zy(getApplicationContext()).m21729n(i2);
                            return;
                        }
                        if ("action_cr_config".equals(intent.getAction())) {
                            boolean booleanExtra2 = intent.getBooleanExtra("action_cr_event_switch", false);
                            long longExtra = intent.getLongExtra("action_cr_event_frequency", 86400L);
                            boolean booleanExtra3 = intent.getBooleanExtra("action_cr_perf_switch", false);
                            long longExtra2 = intent.getLongExtra("action_cr_perf_frequency", 86400L);
                            boolean booleanExtra4 = intent.getBooleanExtra("action_cr_event_en", true);
                            long longExtra3 = intent.getLongExtra("action_cr_max_file_size", 1048576L);
                            C5623k c5623kM19314y = C5623k.toq().x2(booleanExtra2).ld6(longExtra).kja0(booleanExtra3).n7h(longExtra2).m19313s(com.xiaomi.push.ek5k.toq(getApplicationContext())).m19312p(booleanExtra4).qrj(longExtra3).m19314y(getApplicationContext());
                            if ("com.xiaomi.xmsf".equals(getPackageName()) || longExtra <= 0 || longExtra2 <= 0 || longExtra3 <= 0) {
                                return;
                            }
                            ga.x2(getApplicationContext(), c5623kM19314y);
                            return;
                        }
                        if (dd.f73577n7h.equals(intent.getAction())) {
                            zsr0.toq(getApplicationContext(), intent);
                            return;
                        } else {
                            if (dd.f73573kja0.equals(intent.getAction())) {
                                String stringExtra18 = intent.getStringExtra("ext_downward_pkt_id");
                                if (TextUtils.isEmpty(stringExtra18)) {
                                    return;
                                }
                                C5914f.m21604k().m21606g(stringExtra18, intent.getLongExtra("ext_app_receive_time", 0L));
                                return;
                            }
                            return;
                        }
                    }
                    String stringExtra19 = intent.getStringExtra("mipush_app_package");
                    byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                    String stringExtra20 = intent.getStringExtra("mipush_app_id");
                    String stringExtra21 = intent.getStringExtra("mipush_app_token");
                    if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        sok.m21751k(this).m21752g(stringExtra19);
                    }
                    if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        sok.m21751k(this).m21756s(stringExtra19);
                        sok.m21751k(this).m21754p(stringExtra19);
                    }
                    if (byteArrayExtra3 == null) {
                        w831.toq(this, stringExtra19, byteArrayExtra3, C5650g.f31360n, "null payload");
                        return;
                    }
                    w831.m21774g(stringExtra19, byteArrayExtra3);
                    m21530a(new cfr(this, stringExtra19, stringExtra20, stringExtra21, byteArrayExtra3));
                    if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        if (this.f33666a == null) {
                            this.f33666a = new C5896g();
                            verb.zy(this, this.f33666a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
                        }
                        if (this.f33677a == null) {
                            this.f33677a = com.xiaomi.push.oc.m21362s(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra22 = intent.getStringExtra("mipush_app_package");
                byte[] byteArrayExtra4 = intent.getByteArrayExtra("mipush_payload");
                boolean booleanExtra5 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                if (gbni.toq(byteArrayExtra4, stringExtra22)) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("duplicate msg from: " + String.valueOf(stringExtra22));
                    return;
                }
                if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                    sok.m21751k(this).toq(stringExtra22);
                    if (nc.m21313p(getApplicationContext())) {
                        com.xiaomi.push.service.ld6.m21680n(stringExtra22);
                    }
                }
                m21534a(stringExtra22, byteArrayExtra4, booleanExtra5);
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                if (m21519i()) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.zy.kja0("exit falldown mode, activate alarm.");
                m21510e();
                if (m21544c() || m21545d()) {
                    return;
                }
                m21535a(true);
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && m21519i() && oki.m21368n()) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("enter falldown mode, stop alarm.");
                oki.m21367k();
                return;
            }
            return;
        }
        String stringExtra23 = intent.getStringExtra(dd.f73588zurt);
        if (TextUtils.isEmpty(intent.getStringExtra(dd.f33751t))) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("security is empty. ignore.");
            return;
        }
        if (!TextUtils.isEmpty(stringExtra23)) {
            boolean zM21496a = m21496a(stringExtra23, intent);
            eqxt.toq toqVarM21482a = m21482a(stringExtra23, intent);
            if (!com.xiaomi.push.oc.ni7(this)) {
                this.f33672a.m21575y(this, toqVarM21482a, false, 2, null);
                return;
            }
            if (m21544c()) {
                eqxt.zy zyVar = toqVarM21482a.f73601qrj;
                if (zyVar == eqxt.zy.unbind) {
                    m21505c(new toq(toqVarM21482a));
                    return;
                }
                if (zM21496a) {
                    m21505c(new C5897h(toqVarM21482a));
                    return;
                } else if (zyVar == eqxt.zy.binding) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("the client is binding. %1$s %2$s.", toqVarM21482a.f33766y, eqxt.toq.m21589n(toqVarM21482a.f73603toq)));
                    return;
                } else {
                    if (zyVar == eqxt.zy.binded) {
                        this.f33672a.m21575y(this, toqVarM21482a, true, 0, null);
                        return;
                    }
                    return;
                }
            }
            m21535a(true);
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.jk("channel id is empty, do nothing!");
    }

    /* JADX INFO: renamed from: c */
    private void m21504c(Intent intent) {
        String stringExtra = intent.getStringExtra(dd.f73567fti);
        String stringExtra2 = intent.getStringExtra(dd.f73581oc);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        pnt2[] pnt2VarArr = new pnt2[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            pnt2 pnt2Var = new pnt2((Bundle) parcelableArrayExtra[i2]);
            pnt2VarArr[i2] = pnt2Var;
            pnt2 pnt2Var2 = (pnt2) m21484a(pnt2Var, stringExtra, stringExtra2);
            pnt2VarArr[i2] = pnt2Var2;
            if (pnt2Var2 == null) {
                return;
            }
        }
        eqxt eqxtVarZy = eqxt.zy();
        o5[] o5VarArr = new o5[length];
        for (int i3 = 0; i3 < length; i3++) {
            pnt2 pnt2Var3 = pnt2VarArr[i3];
            o5VarArr[i3] = o5.zy(pnt2Var3, eqxtVarZy.toq(pnt2Var3.qrj(), pnt2Var3.cdj()).f33765s);
        }
        m21505c(new C5909d(this, o5VarArr));
    }

    /* JADX INFO: renamed from: a */
    private void m21487a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("digest");
        py.zy(getApplicationContext()).f7l8(string);
        com.xiaomi.push.ltg8.m21203n(this, string);
    }

    /* JADX INFO: renamed from: a */
    void m21525a() {
        if (SystemClock.elapsedRealtime() - this.f33660a >= gb.m20893k() && com.xiaomi.push.oc.fu4(this)) {
            m21501b(true);
        }
    }

    /* JADX INFO: renamed from: a */
    void m21534a(String str, byte[] bArr, boolean z2) {
        Collection<eqxt.toq> collectionM21582g = eqxt.zy().m21582g("5");
        if (collectionM21582g.isEmpty()) {
            if (z2) {
                w831.m21774g(str, bArr);
            }
        } else if (collectionM21582g.iterator().next().f73601qrj == eqxt.zy.binded) {
            m21530a(new nmn5(this, 4, str, bArr));
        } else if (z2) {
            w831.m21774g(str, bArr);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m21505c(AbstractC5901p abstractC5901p) {
        this.f33674a.m21624n(abstractC5901p);
    }

    /* JADX INFO: renamed from: c */
    private void m21507c(boolean z2) {
        try {
            if (wu.m21966g()) {
                if (z2) {
                    if (nc.m21313p(this)) {
                        Intent intent = new Intent("miui.intent.action.NETWORK_CONNECTED");
                        intent.addFlags(1073741824);
                        sendBroadcast(intent);
                    }
                    for (InterfaceC5917i interfaceC5917i : (InterfaceC5917i[]) this.f33679a.toArray(new InterfaceC5917i[0])) {
                        interfaceC5917i.mo21619a();
                    }
                    return;
                }
                if (nc.m21313p(this)) {
                    Intent intent2 = new Intent("miui.intent.action.NETWORK_BLOCKED");
                    intent2.addFlags(1073741824);
                    sendBroadcast(intent2);
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21536a(byte[] bArr, String str) {
        if (bArr == null) {
            w831.toq(this, str, bArr, C5650g.f31360n, "null payload");
            com.xiaomi.channel.commonutils.logger.zy.kja0("register request without payload");
            return;
        }
        m28 m28Var = new m28();
        try {
            qla.m21399n(m28Var, bArr);
            if (m28Var.f33388a == wwp.Registration) {
                zxq zxqVar = new zxq();
                try {
                    qla.m21399n(zxqVar, m28Var.m21248a());
                    m21530a(new cfr(this, m28Var.m21251b(), zxqVar.m22151b(), zxqVar.m22156c(), bArr));
                    e5.m20763k(getApplicationContext()).f7l8(m28Var.m21251b(), "E100003", zxqVar.m22144a(), 6002, null);
                } catch (sb e2) {
                    com.xiaomi.channel.commonutils.logger.zy.jk("app register error. " + e2);
                    w831.toq(this, str, bArr, C5650g.f31360n, " data action error.");
                }
            } else {
                w831.toq(this, str, bArr, C5650g.f31360n, " registration action required.");
                com.xiaomi.channel.commonutils.logger.zy.kja0("register request with invalid payload");
            }
        } catch (sb e3) {
            com.xiaomi.channel.commonutils.logger.zy.jk("app register fail. " + e3);
            w831.toq(this, str, bArr, C5650g.f31360n, " data container error.");
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m21543b() {
        try {
            Class<?> clsZy = wu.zy(this, "miui.os.Build");
            Field field = clsZy.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = clsZy.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = clsZy.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public d8wk m21540b() {
        return this.f33672a;
    }

    /* JADX INFO: renamed from: b */
    public void m21542b(AbstractC5901p abstractC5901p) {
        this.f33674a.m21626q(abstractC5901p.f33805k, abstractC5901p);
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: b */
    public void mo20692b(imd imdVar) {
        kiv.m21079n().mo20692b(imdVar);
        m21507c(true);
        this.f33673a.toq();
        if (!oki.m21368n() && !m21519i()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("reconnection successful, reactivate alarm.");
            oki.m21369q(true);
        }
        Iterator<eqxt.toq> it = eqxt.zy().m21584n().iterator();
        while (it.hasNext()) {
            m21530a(new toq(it.next()));
        }
        if (this.f33680a || !nc.m21313p(getApplicationContext())) {
            return;
        }
        C5889p.toq(getApplicationContext()).f7l8(new RunnableC5940u(this));
    }

    /* JADX INFO: renamed from: c */
    public boolean m21544c() {
        imd imdVar = this.f33664a;
        return imdVar != null && imdVar.jk();
    }

    /* JADX INFO: renamed from: b */
    void m21541b() {
        py.zy(getApplicationContext()).fn3e();
        Iterator it = new ArrayList(this.f33678a).iterator();
        while (it.hasNext()) {
            ((n7h) it.next()).mo21145a();
        }
    }

    /* JADX INFO: renamed from: a */
    private xtb7 m21484a(xtb7 xtb7Var, String str, String str2) {
        eqxt eqxtVarZy = eqxt.zy();
        List<String> listF7l8 = eqxtVarZy.f7l8(str);
        if (listF7l8.isEmpty()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        xtb7Var.zurt(str);
        String strQrj = xtb7Var.qrj();
        if (TextUtils.isEmpty(strQrj)) {
            strQrj = listF7l8.get(0);
            xtb7Var.m22026h(strQrj);
        }
        eqxt.toq qVar = eqxtVarZy.toq(strQrj, xtb7Var.cdj());
        if (!m21544c()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("drop a packet as the channel is not connected, chid=" + strQrj);
            return null;
        }
        if (qVar != null && qVar.f73601qrj == eqxt.zy.binded) {
            if (TextUtils.equals(str2, qVar.f33763p)) {
                return xtb7Var;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("invalid session. " + str2);
            return null;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("drop a packet as the channel is not opened, chid=" + strQrj);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private boolean m21496a(String str, Intent intent) {
        eqxt.toq qVar = eqxt.zy().toq(str, intent.getStringExtra(dd.f73583t8r));
        boolean z2 = false;
        if (qVar != null && str != null) {
            String stringExtra = intent.getStringExtra(dd.f73581oc);
            String stringExtra2 = intent.getStringExtra(dd.f33751t);
            if (!TextUtils.isEmpty(qVar.f33763p) && !TextUtils.equals(stringExtra, qVar.f33763p)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("session changed. old session=" + qVar.f33763p + ", new session=" + stringExtra + " chid = " + str);
                z2 = true;
            }
            if (!stringExtra2.equals(qVar.f33765s)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("security changed. chid = " + str + " sechash = " + C5874l.toq(stringExtra2));
                return true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    private eqxt.toq m21482a(String str, Intent intent) {
        eqxt.toq qVar = eqxt.zy().toq(str, intent.getStringExtra(dd.f73583t8r));
        if (qVar == null) {
            qVar = new eqxt.toq(this);
        }
        qVar.f33766y = intent.getStringExtra(dd.f73588zurt);
        qVar.f73603toq = intent.getStringExtra(dd.f73583t8r);
        qVar.f73606zy = intent.getStringExtra(dd.f73580o1t);
        qVar.f33761k = intent.getStringExtra(dd.f73567fti);
        qVar.f33758g = intent.getStringExtra(dd.f73570jk);
        qVar.f73595f7l8 = intent.getStringExtra(dd.f73559a9);
        qVar.f33762n = intent.getBooleanExtra(dd.f73576mcp, false);
        qVar.f33765s = intent.getStringExtra(dd.f33751t);
        qVar.f33763p = intent.getStringExtra(dd.f73581oc);
        qVar.f33764q = intent.getStringExtra(dd.f73585wvg);
        qVar.f73599ld6 = this.f33672a;
        qVar.m21595y((Messenger) intent.getParcelableExtra(dd.f33749r));
        qVar.f73604x2 = getApplicationContext();
        eqxt.zy().x2(qVar);
        return qVar;
    }

    /* JADX INFO: renamed from: a */
    public void m21533a(String str, String str2, int i2, String str3, String str4) {
        eqxt.toq qVar = eqxt.zy().toq(str, str2);
        if (qVar != null) {
            m21530a(new t8r(qVar, i2, str4, str3));
        }
        eqxt.zy().n7h(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m21491a(String str, int i2) {
        Collection<eqxt.toq> collectionM21582g = eqxt.zy().m21582g(str);
        if (collectionM21582g != null) {
            for (eqxt.toq toqVar : collectionM21582g) {
                if (toqVar != null) {
                    m21530a(new t8r(toqVar, i2, null, null));
                }
            }
        }
        eqxt.zy().qrj(str);
    }

    /* JADX INFO: renamed from: a */
    public void m21530a(AbstractC5901p abstractC5901p) {
        m21531a(abstractC5901p, 0L);
    }

    /* JADX INFO: renamed from: a */
    public void m21531a(AbstractC5901p abstractC5901p, long j2) {
        try {
            this.f33674a.m21623g(abstractC5901p, j2);
        } catch (IllegalStateException e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("can't execute job err = " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m21486a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21528a(o5 o5Var) throws ovdh {
        imd imdVar = this.f33664a;
        if (imdVar != null) {
            imdVar.ni7(o5Var);
            return;
        }
        throw new ovdh("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public void m21537a(o5[] o5VarArr) throws ovdh {
        imd imdVar = this.f33664a;
        if (imdVar != null) {
            imdVar.mo20664h(o5VarArr);
            return;
        }
        throw new ovdh("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public void m21535a(boolean z2) {
        this.f33673a.zy(z2);
    }

    /* JADX INFO: renamed from: a */
    public void m21532a(eqxt.toq toqVar) {
        if (toqVar != null) {
            long jM21592k = toqVar.m21592k();
            com.xiaomi.channel.commonutils.logger.zy.kja0("schedule rebind job in " + (jM21592k / 1000));
            m21531a(new toq(toqVar), jM21592k);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21527a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        imd imdVar = this.f33664a;
        sb.append(imdVar == null ? null : Integer.valueOf(imdVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.zy.kja0(sb.toString());
        imd imdVar2 = this.f33664a;
        if (imdVar2 != null) {
            imdVar2.zurt(i2, exc);
            this.f33664a = null;
        }
        m21526a(7);
        m21526a(4);
        eqxt.zy().m21585p(this, i2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21538a() {
        boolean zZurt = com.xiaomi.push.oc.zurt(this);
        boolean z2 = eqxt.zy().m21583k() > 0;
        boolean z3 = !m21543b();
        boolean zM21517h = m21517h();
        boolean z5 = !m21515g();
        boolean z6 = zZurt && z2 && z3 && zM21517h && z5;
        if (!z6) {
            com.xiaomi.channel.commonutils.logger.zy.a9(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(zZurt), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(zM21517h), Boolean.valueOf(z5)));
        }
        return z6;
    }

    /* JADX INFO: renamed from: a */
    public d8wk m21524a() {
        return new d8wk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m21492a(Context context) {
        try {
            C5866h.m20945k();
            for (int i2 = 100; i2 > 0; i2--) {
                if (com.xiaomi.push.oc.ni7(context)) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public imd m21523a() {
        return this.f33664a;
    }

    /* JADX INFO: renamed from: a */
    public void m21526a(int i2) {
        this.f33674a.zy(i2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21539a(int i2) {
        return this.f33674a.m21627y(i2);
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20689a(imd imdVar) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("begin to connect...");
        kiv.m21079n().mo20689a(imdVar);
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20690a(imd imdVar, int i2, Exception exc) {
        kiv.m21079n().mo20690a(imdVar, i2, exc);
        if (m21519i()) {
            return;
        }
        m21535a(false);
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20691a(imd imdVar, Exception exc) {
        kiv.m21079n().mo20691a(imdVar, exc);
        m21507c(false);
        if (m21519i()) {
            return;
        }
        m21535a(false);
    }

    /* JADX INFO: renamed from: a */
    public void m21529a(n7h n7hVar) {
        synchronized (this.f33678a) {
            this.f33678a.add(n7hVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m21545d() {
        imd imdVar = this.f33664a;
        return imdVar != null && imdVar.m20986t();
    }
}
