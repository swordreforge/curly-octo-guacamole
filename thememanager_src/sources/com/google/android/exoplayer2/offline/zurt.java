package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.exoplayer2.offline.t8r;
import com.google.android.exoplayer2.scheduler.InterfaceC3560n;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;
import zy.nn86;

/* JADX INFO: compiled from: DownloadService.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zurt extends Service {

    /* JADX INFO: renamed from: a */
    public static final String f21039a = "content_id";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final HashMap<Class<? extends zurt>, toq> f65086ab = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static final String f21040b = "download_request";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f65087bo = "foreground";

    /* JADX INFO: renamed from: c */
    public static final String f21041c = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";

    /* JADX INFO: renamed from: d */
    public static final long f21042d = 1000;

    /* JADX INFO: renamed from: e */
    public static final String f21043e = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";

    /* JADX INFO: renamed from: f */
    public static final String f21044f = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";

    /* JADX INFO: renamed from: j */
    public static final String f21045j = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";

    /* JADX INFO: renamed from: l */
    public static final String f21046l = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";

    /* JADX INFO: renamed from: m */
    public static final String f21047m = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";

    /* JADX INFO: renamed from: o */
    public static final String f21048o = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";

    /* JADX INFO: renamed from: r */
    private static final String f21049r = "com.google.android.exoplayer.downloadService.action.RESTART";

    /* JADX INFO: renamed from: t */
    public static final String f21050t = "com.google.android.exoplayer.downloadService.action.INIT";

    /* JADX INFO: renamed from: u */
    public static final String f21051u = "requirements";

    /* JADX INFO: renamed from: v */
    public static final int f21052v = 0;

    /* JADX INFO: renamed from: w */
    private static final String f21053w = "DownloadService";

    /* JADX INFO: renamed from: x */
    public static final String f21054x = "stop_reason";

    /* JADX INFO: renamed from: g */
    @nn86
    private final int f21055g;

    /* JADX INFO: renamed from: h */
    private boolean f21056h;

    /* JADX INFO: renamed from: i */
    private boolean f21057i;

    /* JADX INFO: renamed from: k */
    @dd
    private final zy f21058k;

    /* JADX INFO: renamed from: n */
    @nn86
    private final int f21059n;

    /* JADX INFO: renamed from: p */
    private boolean f21060p;

    /* JADX INFO: renamed from: q */
    @dd
    private final String f21061q;

    /* JADX INFO: renamed from: s */
    private int f21062s;

    /* JADX INFO: renamed from: y */
    private toq f21063y;

    /* JADX INFO: renamed from: z */
    private boolean f21064z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DownloadService.java */
    static final class toq implements t8r.InterfaceC3542q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private Requirements f65088f7l8;

        /* JADX INFO: renamed from: g */
        @dd
        private zurt f21065g;

        /* JADX INFO: renamed from: k */
        private final Context f21066k;

        /* JADX INFO: renamed from: n */
        private final Class<? extends zurt> f21067n;

        /* JADX INFO: renamed from: q */
        @dd
        private final InterfaceC3560n f21068q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final t8r f65089toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f65090zy;

        /* JADX INFO: renamed from: h */
        private boolean m12466h() {
            zurt zurtVar = this.f21065g;
            return zurtVar == null || zurtVar.ni7();
        }

        private boolean kja0(Requirements requirements) {
            return !lrht.zy(this.f65088f7l8, requirements);
        }

        @RequiresNonNull({"scheduler"})
        private void ld6() {
            Requirements requirements = new Requirements(0);
            if (kja0(requirements)) {
                this.f21068q.cancel();
                this.f65088f7l8 = requirements;
            }
        }

        private void n7h() {
            if (this.f65090zy) {
                try {
                    lrht.uc(this.f21066k, zurt.t8r(this.f21066k, this.f21067n, zurt.f21049r));
                    return;
                } catch (IllegalStateException unused) {
                    com.google.android.exoplayer2.util.ni7.qrj(zurt.f21053w, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.f21066k.startService(zurt.t8r(this.f21066k, this.f21067n, zurt.f21050t));
            } catch (IllegalStateException unused2) {
                com.google.android.exoplayer2.util.ni7.qrj(zurt.f21053w, "Failed to restart (process is idle)");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void qrj(zurt zurtVar) {
            zurtVar.wvg(this.f65089toq.f7l8());
        }

        public boolean cdj() {
            boolean zCdj = this.f65089toq.cdj();
            if (this.f21068q == null) {
                return !zCdj;
            }
            if (!zCdj) {
                ld6();
                return true;
            }
            Requirements requirementsQrj = this.f65089toq.qrj();
            if (!this.f21068q.toq(requirementsQrj).equals(requirementsQrj)) {
                ld6();
                return false;
            }
            if (!kja0(requirementsQrj)) {
                return true;
            }
            if (this.f21068q.mo12536k(requirementsQrj, this.f21066k.getPackageName(), zurt.f21049r)) {
                this.f65088f7l8 = requirementsQrj;
                return true;
            }
            com.google.android.exoplayer2.util.ni7.qrj(zurt.f21053w, "Failed to schedule restart");
            ld6();
            return false;
        }

        @Override // com.google.android.exoplayer2.offline.t8r.InterfaceC3542q
        public void f7l8(t8r t8rVar) {
            zurt zurtVar = this.f21065g;
            if (zurtVar != null) {
                zurtVar.wvg(t8rVar.f7l8());
            }
        }

        @Override // com.google.android.exoplayer2.offline.t8r.InterfaceC3542q
        /* JADX INFO: renamed from: g */
        public final void mo12436g(t8r t8rVar) {
            zurt zurtVar = this.f21065g;
            if (zurtVar != null) {
                zurtVar.m12463t();
            }
        }

        @Override // com.google.android.exoplayer2.offline.t8r.InterfaceC3542q
        /* JADX INFO: renamed from: k */
        public void mo12437k(t8r t8rVar, boolean z2) {
            if (z2 || t8rVar.m12428s() || !m12466h()) {
                return;
            }
            List<C3531n> listF7l8 = t8rVar.f7l8();
            for (int i2 = 0; i2 < listF7l8.size(); i2++) {
                if (listF7l8.get(i2).f65039toq == 0) {
                    n7h();
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.offline.t8r.InterfaceC3542q
        /* JADX INFO: renamed from: n */
        public void mo12438n(t8r t8rVar, Requirements requirements, int i2) {
            cdj();
        }

        /* JADX INFO: renamed from: p */
        public void m12469p(final zurt zurtVar) {
            C3844k.m13633s(this.f21065g == null);
            this.f21065g = zurtVar;
            if (this.f65089toq.m12424h()) {
                lrht.wvg().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.exoplayer2.offline.ni7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21001k.qrj(zurtVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.offline.t8r.InterfaceC3542q
        public void toq(t8r t8rVar, C3531n c3531n, @dd Exception exc) {
            zurt zurtVar = this.f21065g;
            if (zurtVar != null) {
                zurtVar.m12465z(c3531n);
            }
            if (m12466h() && zurt.fu4(c3531n.f65039toq)) {
                com.google.android.exoplayer2.util.ni7.qrj(zurt.f21053w, "DownloadService wasn't running. Restarting.");
                n7h();
            }
        }

        public void x2(zurt zurtVar) {
            C3844k.m13633s(this.f21065g == zurtVar);
            this.f21065g = null;
        }

        @Override // com.google.android.exoplayer2.offline.t8r.InterfaceC3542q
        public void zy(t8r t8rVar, C3531n c3531n) {
            zurt zurtVar = this.f21065g;
            if (zurtVar != null) {
                zurtVar.o1t();
            }
        }

        private toq(Context context, t8r t8rVar, boolean z2, @dd InterfaceC3560n interfaceC3560n, Class<? extends zurt> cls) {
            this.f21066k = context;
            this.f65089toq = t8rVar;
            this.f65090zy = z2;
            this.f21068q = interfaceC3560n;
            this.f21067n = cls;
            t8rVar.m12425n(this);
            cdj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DownloadService.java */
    final class zy {

        /* JADX INFO: renamed from: k */
        private final int f21070k;

        /* JADX INFO: renamed from: n */
        private boolean f21071n;

        /* JADX INFO: renamed from: q */
        private boolean f21072q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f65091toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Handler f65092zy = new Handler(Looper.getMainLooper());

        public zy(int i2, long j2) {
            this.f21070k = i2;
            this.f65091toq = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m12470g() {
            t8r t8rVar = ((toq) C3844k.f7l8(zurt.this.f21063y)).f65089toq;
            Notification notificationKi = zurt.this.ki(t8rVar.f7l8(), t8rVar.x2());
            if (this.f21071n) {
                ((NotificationManager) zurt.this.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle)).notify(this.f21070k, notificationKi);
            } else {
                zurt.this.startForeground(this.f21070k, notificationKi);
                this.f21071n = true;
            }
            if (this.f21072q) {
                this.f65092zy.removeCallbacksAndMessages(null);
                this.f65092zy.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.offline.fu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20955k.m12470g();
                    }
                }, this.f65091toq);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m12472n() {
            this.f21072q = false;
            this.f65092zy.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: renamed from: q */
        public void m12473q() {
            this.f21072q = true;
            m12470g();
        }

        public void toq() {
            if (this.f21071n) {
                m12470g();
            }
        }

        public void zy() {
            if (this.f21071n) {
                return;
            }
            m12470g();
        }
    }

    protected zurt(int i2) {
        this(i2, 1000L);
    }

    public static void a9(Context context, Class<? extends zurt> cls, boolean z2) {
        lvui(context, ld6(context, cls, z2), z2);
    }

    public static void d2ok(Context context, Class<? extends zurt> cls) {
        lrht.uc(context, m12457i(context, cls, f21050t, true));
    }

    public static void d3(Context context, Class<? extends zurt> cls, Requirements requirements, boolean z2) {
        lvui(context, kja0(context, cls, requirements, z2), z2);
    }

    public static void eqxt(Context context, Class<? extends zurt> cls) {
        context.startService(t8r(context, cls, f21050t));
    }

    public static void fti(Context context, Class<? extends zurt> cls, boolean z2) {
        lvui(context, x2(context, cls, z2), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fu4(int i2) {
        return i2 == 2 || i2 == 5 || i2 == 7;
    }

    public static void gvn7(Context context, Class<? extends zurt> cls, boolean z2) {
        lvui(context, n7h(context, cls, z2), z2);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m12456h(Context context, Class<? extends zurt> cls, @dd String str, int i2, boolean z2) {
        return m12457i(context, cls, f21048o, z2).putExtra(f21039a, str).putExtra(f21054x, i2);
    }

    /* JADX INFO: renamed from: i */
    private static Intent m12457i(Context context, Class<? extends zurt> cls, String str, boolean z2) {
        return t8r(context, cls, str).putExtra(f65087bo, z2);
    }

    public static void jk(Context context, Class<? extends zurt> cls, DownloadRequest downloadRequest, boolean z2) {
        lvui(context, m12460p(context, cls, downloadRequest, z2), z2);
    }

    public static void jp0y(Context context, Class<? extends zurt> cls, String str, boolean z2) {
        lvui(context, qrj(context, cls, str, z2), z2);
    }

    public static Intent kja0(Context context, Class<? extends zurt> cls, Requirements requirements, boolean z2) {
        return m12457i(context, cls, f21047m, z2).putExtra(f21051u, requirements);
    }

    public static Intent ld6(Context context, Class<? extends zurt> cls, boolean z2) {
        return m12457i(context, cls, f21045j, z2);
    }

    private static void lvui(Context context, Intent intent, boolean z2) {
        if (z2) {
            lrht.uc(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static void mcp(Context context, Class<? extends zurt> cls, DownloadRequest downloadRequest, int i2, boolean z2) {
        lvui(context, m12462s(context, cls, downloadRequest, i2, z2), z2);
    }

    public static Intent n7h(Context context, Class<? extends zurt> cls, boolean z2) {
        return m12457i(context, cls, f21043e, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ni7() {
        return this.f21057i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1t() {
        zy zyVar = this.f21058k;
        if (zyVar != null) {
            zyVar.toq();
        }
    }

    public static void oc(Context context, Class<? extends zurt> cls, @dd String str, int i2, boolean z2) {
        lvui(context, m12456h(context, cls, str, i2, z2), z2);
    }

    /* JADX INFO: renamed from: p */
    public static Intent m12460p(Context context, Class<? extends zurt> cls, DownloadRequest downloadRequest, boolean z2) {
        return m12462s(context, cls, downloadRequest, 0, z2);
    }

    public static Intent qrj(Context context, Class<? extends zurt> cls, String str, boolean z2) {
        return m12457i(context, cls, f21044f, z2).putExtra(f21039a, str);
    }

    /* JADX INFO: renamed from: s */
    public static Intent m12462s(Context context, Class<? extends zurt> cls, DownloadRequest downloadRequest, int i2, boolean z2) {
        return m12457i(context, cls, f21046l, z2).putExtra(f21040b, downloadRequest).putExtra(f21054x, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m12463t() {
        zy zyVar = this.f21058k;
        if (zyVar != null) {
            zyVar.m12472n();
        }
        if (((toq) C3844k.f7l8(this.f21063y)).cdj()) {
            if (lrht.f23230k >= 28 || !this.f21056h) {
                this.f21057i |= stopSelfResult(this.f21062s);
            } else {
                stopSelf();
                this.f21057i = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent t8r(Context context, Class<? extends zurt> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wvg(List<C3531n> list) {
        if (this.f21058k != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (fu4(list.get(i2).f65039toq)) {
                    this.f21058k.m12473q();
                    return;
                }
            }
        }
    }

    public static Intent x2(Context context, Class<? extends zurt> cls, boolean z2) {
        return m12457i(context, cls, f21041c, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m12465z(C3531n c3531n) {
        if (this.f21058k != null) {
            if (fu4(c3531n.f65039toq)) {
                this.f21058k.m12473q();
            } else {
                this.f21058k.toq();
            }
        }
    }

    protected abstract t8r cdj();

    @dd
    protected abstract InterfaceC3560n fn3e();

    protected abstract Notification ki(List<C3531n> list, int i2);

    @Override // android.app.Service
    @dd
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f21061q;
        if (str != null) {
            com.google.android.exoplayer2.util.fti.m13582k(this, str, this.f21059n, this.f21055g, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends zurt>, toq> map = f65086ab;
        toq toqVar = map.get(cls);
        if (toqVar == null) {
            boolean z2 = this.f21058k != null;
            InterfaceC3560n interfaceC3560nFn3e = (z2 && (lrht.f23230k < 31)) ? fn3e() : null;
            t8r t8rVarCdj = cdj();
            t8rVarCdj.mcp();
            toqVar = new toq(getApplicationContext(), t8rVarCdj, z2, interfaceC3560nFn3e, cls);
            map.put((Class<? extends zurt>) cls, toqVar);
        }
        this.f21063y = toqVar;
        toqVar.m12469p(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f21064z = true;
        ((toq) C3844k.f7l8(this.f21063y)).x2(this);
        zy zyVar = this.f21058k;
        if (zyVar != null) {
            zyVar.m12472n();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@dd Intent intent, int i2, int i3) {
        String action;
        String stringExtra;
        t8r t8rVar;
        zy zyVar;
        this.f21062s = i3;
        this.f21056h = false;
        action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(f21039a);
            this.f21060p |= intent.getBooleanExtra(f65087bo, false) || f21049r.equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = f21050t;
        }
        t8rVar = ((toq) C3844k.f7l8(this.f21063y)).f65089toq;
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) C3844k.f7l8(intent)).getParcelableExtra(f21040b);
                if (downloadRequest != null) {
                    t8rVar.m12427q(downloadRequest, intent.getIntExtra(f21054x, 0));
                    break;
                } else {
                    com.google.android.exoplayer2.util.ni7.m13702q(f21053w, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                t8rVar.mcp();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                t8rVar.o1t();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) C3844k.f7l8(intent)).getParcelableExtra(f21051u);
                if (requirements != null) {
                    t8rVar.jp0y(requirements);
                    break;
                } else {
                    com.google.android.exoplayer2.util.ni7.m13702q(f21053w, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                t8rVar.fu4();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) C3844k.f7l8(intent)).hasExtra(f21054x)) {
                    com.google.android.exoplayer2.util.ni7.m13702q(f21053w, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    t8rVar.gvn7(stringExtra, intent.getIntExtra(f21054x, 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    t8rVar.wvg(stringExtra);
                    break;
                } else {
                    com.google.android.exoplayer2.util.ni7.m13702q(f21053w, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                com.google.android.exoplayer2.util.ni7.m13702q(f21053w, action.length() != 0 ? "Ignored unrecognized action: ".concat(action) : new String("Ignored unrecognized action: "));
                break;
        }
        if (lrht.f23230k >= 26 && this.f21060p && (zyVar = this.f21058k) != null) {
            zyVar.zy();
        }
        this.f21057i = false;
        if (t8rVar.kja0()) {
            m12463t();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f21056h = true;
    }

    protected final void zurt() {
        zy zyVar = this.f21058k;
        if (zyVar == null || this.f21064z) {
            return;
        }
        zyVar.toq();
    }

    protected zurt(int i2, long j2) {
        this(i2, j2, null, 0, 0);
    }

    @Deprecated
    protected zurt(int i2, long j2, @dd String str, @nn86 int i3) {
        this(i2, j2, str, i3, 0);
    }

    protected zurt(int i2, long j2, @dd String str, @nn86 int i3, @nn86 int i4) {
        if (i2 == 0) {
            this.f21058k = null;
            this.f21061q = null;
            this.f21059n = 0;
            this.f21055g = 0;
            return;
        }
        this.f21058k = new zy(i2, j2);
        this.f21061q = str;
        this.f21059n = i3;
        this.f21055g = i4;
    }
}
