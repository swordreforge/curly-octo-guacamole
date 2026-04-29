package com.android.thememanager.basemodule.analysis;

import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y9n.C7780k;
import y9n.C7783y;
import y9n.InterfaceC7779g;
import y9n.InterfaceC7781n;
import y9n.InterfaceC7782q;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s */
/* JADX INFO: compiled from: Stats.java */
/* JADX INFO: loaded from: classes.dex */
public class C1708s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f57485f7l8 = 4000;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static InterfaceC7781n f57486ld6 = null;

    /* JADX INFO: renamed from: p */
    public static final int f9748p = 4003;

    /* JADX INFO: renamed from: s */
    public static final int f9749s = 4002;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static volatile C1708s f57487x2 = null;

    /* JADX INFO: renamed from: y */
    public static final int f9750y = 4001;

    /* JADX INFO: renamed from: k */
    private List<InterfaceC7779g> f9752k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private toq f57488toq = new toq(4000);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private toq f57489zy = new toq(4001);

    /* JADX INFO: renamed from: q */
    private toq f9754q = new toq(4002);

    /* JADX INFO: renamed from: n */
    private toq f9753n = new toq(4003);

    /* JADX INFO: renamed from: g */
    private ThreadPoolExecutor f9751g = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k());

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$k */
    /* JADX INFO: compiled from: Stats.java */
    class k implements ThreadFactory {
        k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            return new Thread(r2, "stats task");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq */
    /* JADX INFO: compiled from: Stats.java */
    public class toq implements InterfaceC7779g, InterfaceC7782q {

        /* JADX INFO: renamed from: z */
        private int f9756z;

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$cdj */
        /* JADX INFO: compiled from: Stats.java */
        class cdj implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9757k;

            cdj(final AdInfo val$adInfo) {
                this.f9757k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.mo6674s(this.f9757k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$f7l8 */
        /* JADX INFO: compiled from: Stats.java */
        class f7l8 implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9759k;

            f7l8(final AdInfo val$adInfo) {
                this.f9759k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.x2(this.f9759k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$g */
        /* JADX INFO: compiled from: Stats.java */
        class g implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9761k;

            g(final AdInfo val$adInfo) {
                this.f9761k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.mo6676y(this.f9761k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$h */
        /* JADX INFO: compiled from: Stats.java */
        class h implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9763k;

            h(final AdInfo val$adInfo) {
                this.f9763k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.lvui(this.f9763k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$k */
        /* JADX INFO: compiled from: Stats.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9765k;

            k(final AdInfo val$adInfo) {
                this.f9765k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.mo6672q(this.f9765k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$ki */
        /* JADX INFO: compiled from: Stats.java */
        class ki implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9767k;

            ki(final AdInfo val$adInfo) {
                this.f9767k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.a9(this.f9767k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$kja0 */
        /* JADX INFO: compiled from: Stats.java */
        class kja0 implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9769k;

            kja0(final AdInfo val$adInfo) {
                this.f9769k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.mo6666g(this.f9769k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$ld6 */
        /* JADX INFO: compiled from: Stats.java */
        class ld6 implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9771k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ boolean f9773q;

            ld6(final AdInfo val$adInfo, final boolean val$reportToAdDataDepartment) {
                this.f9771k = val$adInfo;
                this.f9773q = val$reportToAdDataDepartment;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.qrj(this.f9771k, this.f9773q);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$n */
        /* JADX INFO: compiled from: Stats.java */
        class n implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9774k;

            n(final AdInfo val$adInfo) {
                this.f9774k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.toq(this.f9774k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$n7h */
        /* JADX INFO: compiled from: Stats.java */
        class n7h implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9776k;

            n7h(final AdInfo val$adInfo) {
                this.f9776k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.jp0y(this.f9776k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$p */
        /* JADX INFO: compiled from: Stats.java */
        class p implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f9778k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ AdInfo f9780q;

            p(final String val$event, final AdInfo val$adInfo) {
                this.f9778k = val$event;
                this.f9780q = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.kja0(this.f9778k, this.f9780q);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$q */
        /* JADX INFO: compiled from: Stats.java */
        class q implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9781k;

            q(final AdInfo val$adInfo) {
                this.f9781k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.ki(this.f9781k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$qrj */
        /* JADX INFO: compiled from: Stats.java */
        class qrj implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9783k;

            qrj(final AdInfo val$adInfo) {
                this.f9783k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.zy(this.f9783k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$s */
        /* JADX INFO: compiled from: Stats.java */
        class s implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9785k;

            s(final AdInfo val$adInfo) {
                this.f9785k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.oc(this.f9785k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Stats.java */
        class RunnableC7906toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9787k;

            RunnableC7906toq(final AdInfo val$adInfo) {
                this.f9787k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.f7l8(this.f9787k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$x2 */
        /* JADX INFO: compiled from: Stats.java */
        class x2 implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Map f9789g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9790k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ boolean f9791n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Map f9792q;

            x2(final AdInfo val$adInfo, final Map val$extra, final boolean val$reportToAdDataDepartment, final Map val$extraToAdDataDepartment) {
                this.f9790k = val$adInfo;
                this.f9792q = val$extra;
                this.f9791n = val$reportToAdDataDepartment;
                this.f9789g = val$extraToAdDataDepartment;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.t8r(this.f9790k, this.f9792q, this.f9791n, this.f9789g);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$y */
        /* JADX INFO: compiled from: Stats.java */
        class y implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9794k;

            y(final AdInfo val$adInfo) {
                this.f9794k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.mo6668i(this.f9794k);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.s$toq$zy */
        /* JADX INFO: compiled from: Stats.java */
        class zy implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AdInfo f9796k;

            zy(final AdInfo val$adInfo) {
                this.f9796k = val$adInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.m6665l()) {
                    for (InterfaceC7779g interfaceC7779g : C1708s.this.f9752k) {
                        toq toqVar = toq.this;
                        if (!C1708s.this.m6661p(toqVar.f9756z, interfaceC7779g)) {
                            interfaceC7779g.mo6670n(this.f9796k);
                        }
                    }
                }
            }
        }

        public toq(int flag) {
            this.f9756z = flag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public boolean m6665l() {
            return this.f9756z != 4003 && C1708s.this.m6658g() && com.android.thememanager.basemodule.privacy.x2.zy() && !C1688q.cdj().jk();
        }

        @Override // y9n.toq
        public void a9(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new ki(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        public void cdj(Map<String, Object> params) {
            n5r1("T_EXPOSE", params);
        }

        @Override // y9n.InterfaceC7779g
        public void d2ok(Map<String, Object> params) {
            n5r1("BUY_SUCCESS", params);
        }

        @Override // y9n.InterfaceC7779g
        public void d3(Map<String, Object> params) {
            n5r1("SWIPE", params);
        }

        @Override // y9n.InterfaceC7779g
        public void dd(Map<String, Object> params) {
            n5r1("DOWNLOAD", params);
        }

        @Override // y9n.InterfaceC7779g
        public void eqxt(Map<String, Object> params) {
            n5r1("LIKE", params);
        }

        @Override // y9n.toq
        public void f7l8(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new RunnableC7906toq(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        public void fn3e(Map<String, Object> params) {
            n5r1("REDEEM", params);
        }

        @Override // y9n.toq
        public void fti(AdInfo adInfo) {
            qrj(adInfo, false);
        }

        @Override // y9n.InterfaceC7779g
        public void fu4(Map<String, Object> params) {
            n5r1("AUTHOR_WORK", params);
        }

        @Override // y9n.toq
        /* JADX INFO: renamed from: g */
        public void mo6666g(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new kja0(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        public void gvn7(Map<String, Object> params) {
            n5r1("COMMUNITY", params);
        }

        @Override // y9n.InterfaceC7779g
        /* JADX INFO: renamed from: h */
        public void mo6667h(Map<String, Object> params) {
            n5r1(InterfaceC7782q.f100601fu4, params);
        }

        public void hyr(C1697g params) {
            y9n.f7l8.m28163n(params);
        }

        @Override // y9n.toq
        /* JADX INFO: renamed from: i */
        public void mo6668i(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new y(adInfo));
        }

        @Override // y9n.toq
        public void jk(AdInfo adInfo, Map<String, String> extra) {
            t8r(adInfo, extra, false, null);
        }

        @Override // y9n.toq
        public void jp0y(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new n7h(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        /* JADX INFO: renamed from: k */
        public void mo6669k(Map<String, Object> params) {
            n5r1("DIS_ATTENTION", params);
        }

        @Override // y9n.toq
        public void ki(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new q(adInfo));
        }

        @Override // y9n.toq
        public void kja0(String event, AdInfo adInfo) {
            C1708s.this.f9751g.execute(new p(event, adInfo));
        }

        @Override // y9n.InterfaceC7779g
        public void ld6(Map<String, Object> params) {
            n5r1("DIS_LIKE", params);
        }

        @Override // y9n.toq
        public void lvui(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new h(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        public void mcp(Map<String, Object> params) {
            n5r1("COMMENT", params);
        }

        @Override // y9n.toq
        /* JADX INFO: renamed from: n */
        public void mo6670n(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new zy(adInfo));
        }

        public void n5r1(String eventName, Map<String, Object> params) {
            y9n.f7l8.m28164q(eventName, params);
        }

        @Override // y9n.InterfaceC7779g
        public void n7h(Map<String, Object> params) {
            n5r1("TRIAL", params);
        }

        @Override // y9n.InterfaceC7779g
        public void ni7(Map<String, Object> params) {
            n5r1("T_CLICK", params);
        }

        @Override // y9n.InterfaceC7779g
        public void o1t(Map<String, Object> params) {
            n5r1("SHARE", params);
        }

        @Override // y9n.toq
        public void oc(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new s(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        /* JADX INFO: renamed from: p */
        public void mo6671p(Map<String, Object> params) {
            n5r1("BUY", params);
        }

        @Override // y9n.toq
        /* JADX INFO: renamed from: q */
        public void mo6672q(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new k(adInfo));
        }

        @Override // y9n.toq
        public void qrj(AdInfo adInfo, boolean reportToAdDataDepartment) {
            C1708s.this.f9751g.execute(new ld6(adInfo, reportToAdDataDepartment));
        }

        @Override // y9n.InterfaceC7779g
        /* JADX INFO: renamed from: r */
        public void mo6673r(Map<String, Object> params) {
            n5r1("ATTENTION", params);
        }

        @Override // y9n.toq
        /* JADX INFO: renamed from: s */
        public void mo6674s(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new cdj(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        /* JADX INFO: renamed from: t */
        public void mo6675t(Map<String, Object> params) {
            n5r1("FAVOURITE", params);
        }

        @Override // y9n.toq
        public void t8r(AdInfo adInfo, Map<String, String> extra, boolean reportToAdDataDepartment, Map<String, String> extraToAdDataDepartment) {
            C1708s.this.f9751g.execute(new x2(adInfo, extra, reportToAdDataDepartment, extraToAdDataDepartment));
        }

        @Override // y9n.toq
        public void toq(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new n(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        public void wvg(Map<String, Object> params) {
            n5r1("SEARCH", params);
        }

        @Override // y9n.toq
        public void x2(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new f7l8(adInfo));
        }

        @Override // y9n.toq
        /* JADX INFO: renamed from: y */
        public void mo6676y(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new g(adInfo));
        }

        @Override // y9n.InterfaceC7779g
        /* JADX INFO: renamed from: z */
        public void mo6677z(Map<String, Object> params) {
            n5r1("DIS_FAVOURITE", params);
        }

        @Override // y9n.InterfaceC7779g
        public void zurt(Map<String, Object> params) {
            n5r1("APPLY", params);
        }

        @Override // y9n.toq
        public void zy(AdInfo adInfo) {
            C1708s.this.f9751g.execute(new qrj(adInfo));
        }
    }

    private C1708s() {
        this.f9752k.add(new C7783y());
        this.f9752k.add(new C7780k());
    }

    public static C1708s f7l8() {
        if (f57487x2 == null) {
            synchronized (C1708s.class) {
                if (f57487x2 == null) {
                    f57487x2 = new C1708s();
                }
            }
        }
        return f57487x2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m6658g() {
        InterfaceC7781n interfaceC7781n = f57486ld6;
        if (interfaceC7781n != null) {
            return interfaceC7781n.mo8215k();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public boolean m6661p(int flag, InterfaceC7779g plugin) {
        return (flag == 4000 || (flag == 4002 && (plugin instanceof C7783y)) || (flag == 4001 && (plugin instanceof C7780k))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6663s() {
        y9n.f7l8.m28162k(f57486ld6);
    }

    public toq ld6() {
        return x2(4000);
    }

    public toq x2(int selectFlag) {
        if (!m6658g()) {
            return this.f9753n;
        }
        switch (selectFlag) {
            case 4000:
                return this.f57488toq;
            case 4001:
                return this.f57489zy;
            case 4002:
                return this.f9754q;
            default:
                return this.f9753n;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m6664y(InterfaceC7781n provider) {
        f57486ld6 = provider;
        this.f9751g.execute(new Runnable() { // from class: com.android.thememanager.basemodule.analysis.y
            @Override // java.lang.Runnable
            public final void run() {
                C1708s.m6663s();
            }
        });
    }
}
