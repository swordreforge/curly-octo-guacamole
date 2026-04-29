package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.wwp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5652i {

    /* JADX INFO: renamed from: k */
    public static final String f31371k = "com.xiaomi.xmpushsdk.tinydataPending.appId";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f73144toq = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f73145zy = "com.xiaomi.xmpushsdk.tinydataPending.channel";

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.i$k */
    public static class k {

        /* JADX INFO: renamed from: g */
        private static volatile k f31372g;

        /* JADX INFO: renamed from: k */
        private Context f31373k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73146toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Boolean f73147zy;

        /* JADX INFO: renamed from: q */
        private C8036k f31375q = new C8036k();

        /* JADX INFO: renamed from: n */
        private final ArrayList<kl7m> f31374n = new ArrayList<>();

        /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.i$k$k, reason: collision with other inner class name */
        public class C8036k {

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private ScheduledFuture<?> f73149zy;

            /* JADX INFO: renamed from: k */
            private ScheduledThreadPoolExecutor f31376k = new ScheduledThreadPoolExecutor(1);

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public final ArrayList<kl7m> f73148toq = new ArrayList<>();

            /* JADX INFO: renamed from: q */
            private final Runnable f31378q = new zp(this);

            public C8036k() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: g */
            public void m19475g() {
                kl7m kl7mVarRemove = this.f73148toq.remove(0);
                for (erbd erbdVar : com.xiaomi.push.service.ek5k.zy(Arrays.asList(kl7mVarRemove), k.this.f31373k.getPackageName(), C5656l.m19500q(k.this.f31373k).m19505n(), 30720)) {
                    com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + kl7mVarRemove.m21127d());
                    d3.m19429y(k.this.f31373k).m19435z(erbdVar, wwp.Notification, true, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zy() {
                if (this.f73149zy == null) {
                    this.f73149zy = this.f31376k.scheduleAtFixedRate(this.f31378q, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            /* JADX INFO: renamed from: n */
            public void m19478n(kl7m kl7mVar) {
                this.f31376k.execute(new RunnableC5639a(this, kl7mVar));
            }
        }

        private boolean f7l8(Context context) {
            if (!d3.m19429y(context).oc()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                if (packageInfo == null) {
                    return false;
                }
                return packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        private boolean ld6(kl7m kl7mVar) {
            if (com.xiaomi.push.service.ek5k.m21579n(kl7mVar, false)) {
                return false;
            }
            if (!this.f73147zy.booleanValue()) {
                this.f31375q.m19478n(kl7mVar);
                return true;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + kl7mVar.m21127d());
            d3.m19429y(this.f31373k).m19431i(kl7mVar);
            return true;
        }

        /* JADX INFO: renamed from: p */
        private boolean m19469p(Context context) {
            return C5656l.m19500q(context).m19505n() == null && !f7l8(this.f31373k);
        }

        /* JADX INFO: renamed from: q */
        private void m19470q(kl7m kl7mVar) {
            synchronized (this.f31374n) {
                if (!this.f31374n.contains(kl7mVar)) {
                    this.f31374n.add(kl7mVar);
                    if (this.f31374n.size() > 100) {
                        this.f31374n.remove(0);
                    }
                }
            }
        }

        public static k toq() {
            if (f31372g == null) {
                synchronized (k.class) {
                    if (f31372g == null) {
                        f31372g = new k();
                    }
                }
            }
            return f31372g;
        }

        /* JADX INFO: renamed from: g */
        public boolean m19471g() {
            return this.f31373k != null;
        }

        /* JADX INFO: renamed from: n */
        public synchronized void m19472n(String str) {
            if (TextUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
            } else {
                this.f73146toq = str;
                m19473s(C5652i.f73145zy);
            }
        }

        /* JADX INFO: renamed from: s */
        public void m19473s(String str) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f31374n) {
                arrayList.addAll(this.f31374n);
                this.f31374n.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m19474y((kl7m) it.next());
            }
        }

        /* JADX INFO: renamed from: y */
        public synchronized boolean m19474y(kl7m kl7mVar) {
            if (kl7mVar == null) {
                return false;
            }
            if (com.xiaomi.push.service.ek5k.m21579n(kl7mVar, true)) {
                return false;
            }
            boolean z2 = TextUtils.isEmpty(kl7mVar.m21110a()) && TextUtils.isEmpty(this.f73146toq);
            boolean z3 = !m19471g();
            Context context = this.f31373k;
            boolean z5 = context == null || m19469p(context);
            if (!z3 && !z2 && !z5) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient Send item immediately." + kl7mVar.m21127d());
                if (TextUtils.isEmpty(kl7mVar.m21127d())) {
                    kl7mVar.m21132f(com.xiaomi.push.service.gvn7.m21617k());
                }
                if (TextUtils.isEmpty(kl7mVar.m21110a())) {
                    kl7mVar.m21107a(this.f73146toq);
                }
                if (TextUtils.isEmpty(kl7mVar.m21123c())) {
                    kl7mVar.m21129e(this.f31373k.getPackageName());
                }
                if (kl7mVar.m21105a() <= 0) {
                    kl7mVar.m21117b(System.currentTimeMillis());
                }
                return ld6(kl7mVar);
            }
            if (z2) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient Pending " + kl7mVar.m21119b() + " reason is " + C5652i.f73145zy);
            } else if (z3) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient Pending " + kl7mVar.m21119b() + " reason is " + C5652i.f73144toq);
            } else if (z5) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient Pending " + kl7mVar.m21119b() + " reason is " + C5652i.f31371k);
            }
            m19470q(kl7mVar);
            return true;
        }

        public void zy(Context context) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f31373k = context;
            this.f73147zy = Boolean.valueOf(f7l8(context));
            m19473s(C5652i.f73144toq);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m19466k(Context context, String str) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        k.toq().zy(context);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            k.toq().m19472n(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19467q(String str, String str2, long j2, String str3) {
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d(str);
        kl7mVar.m21122c(str2);
        kl7mVar.m21106a(j2);
        kl7mVar.m21118b(str3);
        return k.toq().m19474y(kl7mVar);
    }

    public static boolean toq(Context context, kl7m kl7mVar) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("MiTinyDataClient.upload " + kl7mVar.m21127d());
        if (!k.toq().m19471g()) {
            k.toq().zy(context);
        }
        return k.toq().m19474y(kl7mVar);
    }

    public static boolean zy(Context context, String str, String str2, long j2, String str3) {
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d(str);
        kl7mVar.m21122c(str2);
        kl7mVar.m21106a(j2);
        kl7mVar.m21118b(str3);
        kl7mVar.m21109a(true);
        kl7mVar.m21107a("push_sdk_channel");
        return toq(context, kl7mVar);
    }
}
