package com.android.thememanager;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.util.ArraySet;
import android.util.Log;
import android.webkit.WebView;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.C1742y;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.UserAgreementVersionManager;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1804f;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1826t;
import com.android.thememanager.basemodule.utils.ch;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.settings.personalize.C2567p;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.util.gbni;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.i1;
import com.android.thememanager.util.r8s8;
import com.android.thememanager.wallpaper.C2951n;
import ek5k.C6002g;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miui.os.Build;
import miuix.appcompat.app.ki;
import miuix.autodensity.AutoDensityConfig;
import miuix.autodensity.InterfaceC7074y;

/* JADX INFO: loaded from: classes.dex */
public class ThemeApplication extends miuix.app.zy implements com.android.thememanager.basemodule.analysis.toq, InterfaceC7074y {

    /* JADX INFO: renamed from: y */
    private final Configuration f8695y = new Configuration();

    /* JADX INFO: renamed from: com.android.thememanager.ThemeApplication$k */
    class RunnableC1531k implements Runnable {
        RunnableC1531k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ThemeApplication qVar = C2082k.zy().toq();
            C1688q.cdj().d2ok(ThemeApplication.this.getApplicationContext());
            C2656k.m9241k();
            com.android.thememanager.controller.online.ld6.m4(qVar);
            ThemeApplication.this.jk();
            com.android.thememanager.util.toq.zy();
            com.android.thememanager.util.toq.m10013p(qVar);
            if (!Build.IS_TABLET) {
                ThemeSchedulerService.n7h();
            }
            com.android.thememanager.basemodule.utils.o1t.t8r();
            C1804f.toq();
            if (Build.IS_TABLET) {
                return;
            }
            com.theme.loopwallpaper.controller.toq.n7h();
            if (com.theme.loopwallpaper.controller.toq.kja0()) {
                ThemeSchedulerService.zurt(null, true);
            }
        }
    }

    class toq extends BroadcastReceiver {
        toq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            y9n.x9kr("ExternalStorageChangeReceiver!" + intent.getAction());
        }
    }

    public ThemeApplication() {
        bf2.toq.m5816y(this);
        C2082k.zy().x2(this);
    }

    private static void a9(Context context) {
        toq toqVar = new toq();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        context.registerReceiver(toqVar, intentFilter);
    }

    private void fn3e() {
        C2082k.zy().x2(this);
        C2082k.zy().m8000g();
        C2082k.zy().m8004y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fu4(List list) {
        C1807g.lrht(this);
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            Log.e("ThemeApplication", "executePreloadTask thread sleep exception !");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jk() {
        C2082k.zy().m8001n();
        C2082k.zy().f7l8();
        C2082k.zy().m8003s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void mcp() {
        Activity activityM10533k = C2964y.toq().m10533k();
        if (activityM10533k == null || activityM10533k.isFinishing()) {
            y9n.x9kr("primary storage migration . app in bg. ");
        } else {
            new ki.C6947k(activityM10533k).lrht(R.string.resource_hint).fu4(R.string.storage_migration_exit_msg).m25047s(false).dd(R.string.i_know, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.jp0y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    y9n.x9kr("primary storage migration . user confirm!");
                }
            }).m25037g().show();
        }
    }

    private boolean ni7(String curProcessName) {
        return InterfaceC1789q.oct.equals(curProcessName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1t() {
        C1688q.m6585t(this);
        C6077k.oc(C1807g.mcp());
        C1819o.d2ok(this);
        com.android.thememanager.basemodule.ad.zy.zy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wvg() {
        i1.m9820n(this);
        x2();
        com.android.thememanager.basemodule.utils.cdj.cdj();
        C1826t.m7216g();
        if (C1781k.toq(bf2.toq.toq()) && com.android.thememanager.basemodule.privacy.x2.zy()) {
            new UserAgreementVersionManager();
            UserAgreementVersionManager.m6900s();
        }
    }

    private void x2() {
        final List<Runnable> listQrj = qrj();
        if (listQrj.isEmpty()) {
            return;
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.android.thememanager.d2ok
            @Override // java.lang.Runnable
            public final void run() {
                this.f11120k.fu4(listQrj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m6311z() {
        C1807g.m7075i();
        C1807g.qrj();
        if (com.android.thememanager.basemodule.utils.fn3e.zy()) {
            com.android.thememanager.basemodule.utils.fn3e.m7062k();
        } else {
            com.android.thememanager.basemodule.utils.fn3e.m7061g(this);
        }
    }

    private boolean zurt(String curProcessName) {
        return InterfaceC1789q.ada.equals(curProcessName) || InterfaceC1789q.yc.equals(curProcessName);
    }

    protected gbni cdj() {
        return new gbni();
    }

    /* JADX INFO: renamed from: h */
    protected o1t m6312h() {
        return com.android.thememanager.maml.widget.qrj.wvg();
    }

    /* JADX INFO: renamed from: i */
    public boolean m6313i() {
        return com.android.thememanager.util.toq.m10010g(this);
    }

    protected C2322r ki() {
        return new C2322r();
    }

    protected C2965z kja0() {
        return new C2965z();
    }

    protected com.android.thememanager.util.y9n n7h() {
        return new com.android.thememanager.util.y9n();
    }

    @Override // miuix.app.zy, android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@zy.lvui Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int iUpdateFrom = this.f8695y.updateFrom(newConfig);
        if ((iUpdateFrom & 1024) != 0) {
            gc3c.fn3e();
        }
        Log.i("ThemeApplication", "onConfigChanged 0x" + Integer.toHexString(iUpdateFrom));
    }

    @Override // miuix.app.zy, android.app.Application
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28 && !"com.android.thememanager".equals(Application.getProcessName())) {
            WebView.disableWebView();
        }
        String strKi = y9n.ki(this, Process.myPid());
        if (zurt(strKi)) {
            return;
        }
        C6002g.m22247s(new Runnable() { // from class: com.android.thememanager.gvn7
            @Override // java.lang.Runnable
            public final void run() {
                this.f12003k.o1t();
            }
        });
        if (com.android.thememanager.basemodule.privacy.x2.zy()) {
            C1708s.f7l8().m6664y(new mcp());
        }
        if (ni7(strKi)) {
            return;
        }
        AutoDensityConfig.init(this);
        AutoDensityConfig.setUpdateSystemRes(false);
        C6002g.m22247s(new Runnable() { // from class: com.android.thememanager.d3
            @Override // java.lang.Runnable
            public final void run() {
                this.f11122k.wvg();
            }
        });
        fn3e();
        registerActivityLifecycleCallbacks(C2964y.toq());
        com.android.thememanager.push.f7l8.m8456g().x2(this);
        this.f8695y.updateFrom(getResources().getConfiguration());
        if (i2 <= 28) {
            new ArraySet(8);
        }
        if (y9n.toq(30) && y9n.m7251n(32)) {
            com.android.thememanager.basemodule.resource.qrj.n7h(new Runnable() { // from class: com.android.thememanager.oc
                @Override // java.lang.Runnable
                public final void run() {
                    ThemeApplication.mcp();
                }
            });
        }
        ch.ld6();
        ch.m7023n();
        com.android.thememanager.util.ch.lvui(false);
        C2951n.fn3e();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        C1742y.toq(this).onTrimMemory(level);
        if (level == 20) {
            com.bumptech.glide.zy.m11283n(this).zy();
            if (C1807g.m7081r()) {
                C2567p.n7h().m9077y();
            }
            C2964y.toq().m10534q();
        }
    }

    protected List<Runnable> qrj() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RunnableC1531k());
        arrayList.add(new Runnable() { // from class: com.android.thememanager.eqxt
            @Override // java.lang.Runnable
            public final void run() {
                this.f11602k.m6311z();
            }
        });
        return arrayList;
    }

    @Override // miuix.autodensity.InterfaceC7074y
    public boolean shouldAdaptAutoDensity() {
        return false;
    }

    protected r8s8 t8r() {
        return new r8s8();
    }
}
