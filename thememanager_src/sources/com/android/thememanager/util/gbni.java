package com.android.thememanager.util;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.controller.local.C1905h;
import com.android.thememanager.controller.local.C1909n;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.service.ThemeSchedulerService;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ThemeImportManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class gbni implements InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: a */
    private static final String f16480a = "ACTION_DOWNLOAD_CLICK_NOTIFICATION";

    /* JADX INFO: renamed from: b */
    private static final String f16481b = "ACTION_DOWNLOAD_CLEAR_NOTIFICATION";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f61245bo = "com.android.thememanager.NotificationClick";

    /* JADX INFO: renamed from: c */
    public static final String f16482c = "extra_import_current_bytes";

    /* JADX INFO: renamed from: e */
    public static final String f16483e = "extra_import_total_bytes";

    /* JADX INFO: renamed from: f */
    public static final String f16484f = "extra_resource";

    /* JADX INFO: renamed from: j */
    private static final String f16485j = "ThemeImportManager";

    /* JADX INFO: renamed from: l */
    public static final String f16486l = "action_resource_import_udpate";

    /* JADX INFO: renamed from: m */
    private static final String f16487m = "ACTION_DELTA_UPDATE_CLICK_NOTIFICATION";

    /* JADX INFO: renamed from: o */
    private static final String f16488o = "ACTION_DELTA_UPDATE_CLEAR_NOTIFICATION";

    /* JADX INFO: renamed from: r */
    public static final String f16489r = "action_resource_import_start";

    /* JADX INFO: renamed from: t */
    public static final String f16490t = "action_resource_import_fail";

    /* JADX INFO: renamed from: u */
    private static final String f16491u = "downloadNotification";

    /* JADX INFO: renamed from: x */
    private static int f16492x = 0;

    /* JADX INFO: renamed from: z */
    public static final String f16493z = "action_resource_import_complete";

    /* JADX INFO: renamed from: n */
    private androidx.lifecycle.fti<ThemeStatus> f16498n;

    /* JADX INFO: renamed from: p */
    private volatile boolean f16499p;

    /* JADX INFO: renamed from: g */
    private Map<String, Integer> f16494g = new HashMap();

    /* JADX INFO: renamed from: y */
    private BroadcastReceiver f16502y = new C2779k();

    /* JADX INFO: renamed from: s */
    private List<zy> f16501s = new ArrayList();

    /* JADX INFO: renamed from: h */
    private Object f16495h = new Object();

    /* JADX INFO: renamed from: i */
    private Map<String, WeakReference<com.android.thememanager.controller.x2>> f16496i = new HashMap();

    /* JADX INFO: renamed from: k */
    protected Context f16497k = C2082k.zy().toq();

    /* JADX INFO: renamed from: q */
    protected Handler f16500q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.android.thememanager.util.gbni$k */
    /* JADX INFO: compiled from: ThemeImportManager.java */
    class C2779k extends BroadcastReceiver {
        C2779k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().startsWith(gbni.f16488o)) {
                C1905h.f10870h = 0;
                C1905h.f10871i = 0;
            } else if (intent.getAction().startsWith(gbni.f16481b)) {
                int unused = gbni.f16492x = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.util.gbni$n */
    /* JADX INFO: compiled from: ThemeImportManager.java */
    class AsyncTaskC2780n extends AsyncTask<Void, Void, Void> {
        private AsyncTaskC2780n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public /* synthetic */ void m9774n() {
            gbni.this.f16498n.cdj(null);
        }

        /* JADX INFO: renamed from: q */
        private C2781q m9775q(zy job) {
            Runnable runnable;
            gbni.this.m9772z(job.f61247toq);
            C2781q c2781q = new C2781q(null);
            try {
                try {
                    gbni.this.eqxt(job.f61247toq.getOnlineId(), 48);
                    if (C1807g.lvui()) {
                        toq(job);
                    }
                    String strFti = gbni.this.m9764i(job.f16509k).fti(job.f61247toq);
                    c2781q.f61246toq = strFti;
                    gbni gbniVar = gbni.this;
                    gbniVar.fti(gbniVar.f16497k, job.f61247toq, job.f16509k, strFti);
                    c2781q.f16505k = true;
                    gbni.this.eqxt(job.f61247toq.getOnlineId(), 50);
                    gbni.this.f16494g.remove(job.f61247toq.getOnlineId());
                    runnable = new Runnable() { // from class: com.android.thememanager.util.zsr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f16936k.m9774n();
                        }
                    };
                } catch (C1909n e2) {
                    c2781q.f61246toq = e2.getMessage();
                    int iIntValue = gbni.this.f16494g.containsKey(job.f61247toq.getOnlineId()) ? ((Integer) gbni.this.f16494g.get(job.f61247toq.getOnlineId())).intValue() : 0;
                    if (e2.getErrorType() != C1909n.k.PATCH) {
                        gbni.this.eqxt(job.f61247toq.getOnlineId(), 49);
                        gbni gbniVar2 = gbni.this;
                        Context context = gbniVar2.f16497k;
                        gbniVar2.d3(context, job.f61247toq, context.getString(R.string.resource_import_failed));
                    } else if (iIntValue < 1) {
                        gbni gbniVar3 = gbni.this;
                        Context context2 = gbniVar3.f16497k;
                        gbniVar3.d3(context2, job.f61247toq, context2.getString(R.string.resource_delta_update_failed));
                        job.f61247toq.setOnlinePath(null);
                        com.android.thememanager.o1t o1tVarM8000g = C2082k.zy().m8000g();
                        zy.C1711k c1711k = new zy.C1711k();
                        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.qv3;
                        c1711k.f57497zy = "";
                        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
                        o1tVarM8000g.m8434n(job.f61247toq, job.f16509k, c1711k);
                        gbni.this.f16494g.put(job.f61247toq.getOnlineId(), Integer.valueOf(iIntValue + 1));
                    } else {
                        gbni.this.eqxt(job.f61247toq.getOnlineId(), 49);
                        gbni gbniVar4 = gbni.this;
                        Context context3 = gbniVar4.f16497k;
                        gbniVar4.d3(context3, job.f61247toq, context3.getString(R.string.resource_import_failed));
                        ArrayMap arrayMap = new ArrayMap();
                        arrayMap.put("id", job.f61247toq.getOnlineId());
                        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.jglj, arrayMap);
                        Log.d(gbni.f16485j, "import retryCount not match, id = " + job.f61247toq.getOnlineId());
                    }
                    runnable = new Runnable() { // from class: com.android.thememanager.util.zsr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f16936k.m9774n();
                        }
                    };
                }
                C6002g.fn3e(runnable);
                return c2781q;
            } catch (Throwable th) {
                C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.util.zsr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16936k.m9774n();
                    }
                });
                throw th;
            }
        }

        private void toq(zy job) {
            com.android.thememanager.fu4 fu4Var = job.f16509k;
            if (fu4Var == null || !"fonts".equalsIgnoreCase(fu4Var.getResourceCode())) {
                return;
            }
            try {
                job.f61247toq.setProductBought(com.android.thememanager.controller.online.ld6.m7579y("FONT", job.f61247toq.getOnlineId()).get(job.f61247toq.getOnlineId()).booleanValue());
                job.f61247toq.setCheckBoughtStatus(true);
            } catch (Exception unused) {
                Log.e(gbni.f16485j, "doJob error while check fonts bought status.");
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            boolean z2;
            if (gbni.this.f16499p) {
                z2 = false;
            } else {
                synchronized (gbni.this.f16495h) {
                    z2 = true;
                    if (gbni.this.f16499p) {
                        z2 = false;
                    } else {
                        gbni.this.f16499p = true;
                    }
                }
            }
            if (!z2) {
                cancel(false);
            }
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            zy zyVar;
            while (true) {
                synchronized (gbni.this.f16501s) {
                    if (gbni.this.f16501s.isEmpty()) {
                        synchronized (gbni.this.f16495h) {
                            gbni.this.f16499p = false;
                        }
                        return null;
                    }
                    zyVar = (zy) gbni.this.f16501s.get(0);
                }
                C2781q c2781qM9775q = m9775q(zyVar);
                synchronized (gbni.this.f16501s) {
                    gbni.this.f16501s.remove(zyVar);
                }
                if (c2781qM9775q.f16505k) {
                    if (ch.hyr(zyVar.f61247toq.getLocalId())) {
                        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
                        editorEdit.putBoolean(ch.f16371g, true);
                        editorEdit.apply();
                    }
                    gbni.this.o1t(zyVar.f61247toq, c2781qM9775q.f61246toq);
                } else {
                    gbni.this.fu4(zyVar.f61247toq, c2781qM9775q.f61246toq);
                }
            }
        }

        /* synthetic */ AsyncTaskC2780n(gbni gbniVar, C2779k c2779k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.gbni$q */
    /* JADX INFO: compiled from: ThemeImportManager.java */
    private static class C2781q {

        /* JADX INFO: renamed from: k */
        boolean f16505k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f61246toq;

        private C2781q() {
        }

        /* synthetic */ C2781q(C2779k c2779k) {
            this();
        }
    }

    /* JADX INFO: compiled from: ThemeImportManager.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f16506k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f16508q;

        toq(final Resource val$resource, final String val$message) {
            this.f16506k = val$resource;
            this.f16508q = val$message;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.thememanager.basemodule.utils.nn86.toq((TextUtils.isEmpty(this.f16506k.getTitle()) ? this.f16506k.getTitle() : this.f16506k.getDownloadPath()) + ": " + this.f16508q, 0);
        }
    }

    /* JADX INFO: compiled from: ThemeImportManager.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        com.android.thememanager.fu4 f16509k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Resource f61247toq;

        public zy(com.android.thememanager.fu4 resContext, Resource resource) {
            this.f16509k = resContext;
            this.f61247toq = resource;
        }
    }

    public gbni() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f16488o);
        intentFilter.addAction(f16481b);
        this.f16497k.registerReceiver(this.f16502y, intentFilter);
        this.f16498n = new androidx.lifecycle.fti<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a9(String str, int i2) {
        ThemeStatus themeStatusM4388g = this.f16498n.m4388g();
        if (themeStatusM4388g == null) {
            themeStatusM4388g = new ThemeStatus(str);
            themeStatusM4388g.status = 48;
        }
        themeStatusM4388g.status = i2;
        this.f16498n.cdj(themeStatusM4388g);
    }

    private void d2ok() {
        new AsyncTaskC2780n(this, null).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt(final String taskId, final int status) {
        C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.util.was
            @Override // java.lang.Runnable
            public final void run() {
                this.f16869k.a9(taskId, status);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    private Intent m9763h(Intent intent, Context context, String resCode, String resourceId) {
        if ("icons".equals(resCode)) {
            return lvui(resCode, true);
        }
        if (resourceId != null) {
            Intent intent2 = new Intent(intent.getAction());
            intent2.addCategory("android.intent.category.DEFAULT");
            intent2.setData(Uri.parse(InterfaceC1357q.f53972zkd + resourceId));
            return intent2;
        }
        if (resCode == null || resCode.length() <= 0) {
            return null;
        }
        if ("fonts".equals(resCode)) {
            return lvui(resCode, true);
        }
        Intent intent3 = new Intent(f61245bo);
        intent3.putExtra("resource_code", "theme");
        return miui.settings.splitlib.zy.m24752k(context, intent3, bf2.toq.toq().getString(R.string.personalize_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public C1905h m9764i(com.android.thememanager.fu4 resContext) {
        C1905h c1905hN7h = n7h(resContext);
        c1905hN7h.ncyb(ni7(resContext));
        return c1905hN7h;
    }

    private Intent ki(String resCode, String resourceId) {
        if (resourceId == null) {
            if (resCode == null || resCode.length() <= 0) {
                return null;
            }
            return RecommendItemResolver.getForwardLocalIntent(C2082k.zy().m8001n().m10535g(resCode));
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse(InterfaceC1357q.f53972zkd + resourceId));
        return intent;
    }

    public static void kja0(Intent intent) {
        String stringExtra = intent.getStringExtra(f16491u);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if (stringExtra.startsWith(f16487m)) {
            C1905h.f10870h = 0;
            C1905h.f10871i = 0;
        } else if (stringExtra.startsWith(f16480a)) {
            f16492x = 0;
        }
    }

    public static void ld6(Intent sourceIntent, Intent retIntent) {
        retIntent.putExtra(f16491u, sourceIntent.getAction());
    }

    private Intent lvui(String resCode, boolean isSplitScreen) {
        if (TextUtils.isEmpty(resCode)) {
            return null;
        }
        Uri uri = Uri.parse(InterfaceC1357q.f53843b3e + resCode);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addCategory("android.intent.category.DEFAULT");
        Context qVar = bf2.toq.toq();
        if (bf2.toq.toq().getPackageManager().queryIntentActivities(intent, 0).size() >= 1) {
            return isSplitScreen ? miui.settings.splitlib.zy.m24752k(qVar, intent, bf2.toq.toq().getString(R.string.personalize_title)) : intent;
        }
        Log.d(f16485j, "stepToLargeDeviceLocalView: activity not find: " + uri.getPath());
        return null;
    }

    private com.android.thememanager.controller.x2 ni7(com.android.thememanager.fu4 resContext) {
        String resourceCode = resContext.getResourceCode();
        com.android.thememanager.controller.x2 x2Var = this.f16496i.get(resourceCode) != null ? this.f16496i.get(resourceCode).get() : null;
        if (x2Var != null) {
            return x2Var;
        }
        com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(resContext);
        this.f16496i.put(resourceCode, new WeakReference<>(x2VarLd6));
        return x2VarLd6;
    }

    private void oc(Context context, String localId, String title) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268468224);
        intent.setData(Uri.parse(InterfaceC1357q.f53972zkd + localId));
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 1275068416);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(R.drawable.notification_small_icon).setContentTitle(context.getString(R.string.theme_current_using_has_update)).setContentText(context.getString(R.string.theme_name, title)).setContentIntent(activity).setAutoCancel(true);
        com.android.thememanager.basemodule.utils.jk.m7104n(context, 17185, builder);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t8r(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "ThemeImportManager"
            if (r0 != 0) goto La4
            android.content.Context r0 = r8.f16497k
            java.lang.String r2 = "download"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.DownloadManager r0 = (android.app.DownloadManager) r0
            if (r0 != 0) goto L15
            return
        L15:
            android.app.DownloadManager$Query r2 = new android.app.DownloadManager$Query
            r2.<init>()
            r3 = 8
            r2.setFilterByStatus(r3)
            r3 = -1
            android.database.Cursor r2 = r0.query(r2)     // Catch: java.lang.Exception -> L7a
            if (r2 == 0) goto L71
            boolean r5 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L71
        L2d:
            java.lang.String r5 = "local_uri"
            int r5 = r2.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L67
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L3e
            goto L60
        L3e:
            java.lang.String r6 = "file://"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L4b
            r6 = 7
            java.lang.String r5 = r5.substring(r6)     // Catch: java.lang.Throwable -> L67
        L4b:
            java.lang.String r5 = android.net.Uri.decode(r5)     // Catch: java.lang.Throwable -> L67
            boolean r5 = android.text.TextUtils.equals(r9, r5)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L60
            java.lang.String r5 = "_id"
            int r5 = r2.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L67
            long r5 = r2.getLong(r5)     // Catch: java.lang.Throwable -> L67
            goto L72
        L60:
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L2d
            goto L71
        L67:
            r5 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r2 = move-exception
            r5.addSuppressed(r2)     // Catch: java.lang.Exception -> L7a
        L70:
            throw r5     // Catch: java.lang.Exception -> L7a
        L71:
            r5 = r3
        L72:
            if (r2 == 0) goto L81
            r2.close()     // Catch: java.lang.Exception -> L78
            goto L81
        L78:
            r2 = move-exception
            goto L7c
        L7a:
            r2 = move-exception
            r5 = r3
        L7c:
            java.lang.String r7 = "query download id fail. "
            android.util.Log.e(r1, r7, r2)
        L81:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L8f
            r9 = 1
            long[] r9 = new long[r9]
            r1 = 0
            r9[r1] = r5
            r0.remove(r9)
            goto La9
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "can not find id for path : "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.w(r1, r9)
            goto La9
        La4:
            java.lang.String r9 = "can not deleteDownloadRecord, path empty. "
            android.util.Log.w(r1, r9)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.gbni.t8r(java.lang.String):void");
    }

    public Intent cdj(Intent intent) {
        String stringExtra = intent.getStringExtra("REQUEST_RESOURCE_CODE");
        String stringExtra2 = intent.getStringExtra("extra_resource");
        Intent intentM9763h = C1807g.m7081r() ? m9763h(intent, bf2.toq.toq(), stringExtra, stringExtra2) : ki(stringExtra, stringExtra2);
        if (intentM9763h == null) {
            return null;
        }
        intentM9763h.putExtra("REQUEST_RESOURCE_CODE", stringExtra);
        intentM9763h.setFlags(268468224);
        ld6(intent, intentM9763h);
        return intentM9763h;
    }

    protected void d3(final Context context, final Resource resource, final String message) {
        this.f16500q.post(new toq(resource, message));
    }

    protected int fn3e(Context context) {
        return g1.m9756t();
    }

    protected void fti(Context context, Resource resource, com.android.thememanager.fu4 resContext, String message) {
        if (TextUtils.isEmpty(message)) {
            if (x2(context, resource, resContext)) {
                jp0y(context, resource, resContext);
            }
        } else if (qrj(context, resource, resContext)) {
            gvn7(context, resource, resContext, message);
        }
    }

    protected void fu4(Resource resource, String message) {
        Intent intent = new Intent();
        intent.putExtra("extra_resource", resource);
        intent.setAction("action_resource_import_fail");
        this.f16497k.sendBroadcast(intent);
    }

    protected void gvn7(Context context, Resource resource, com.android.thememanager.fu4 resContext, String message) {
        Notification.Builder autoCancel = new Notification.Builder(context).setSmallIcon(fn3e(context)).setContentTitle(context.getString(R.string.resource_delta_update_successful)).setContentText(message).setAutoCancel(true);
        autoCancel.setDeleteIntent(PendingIntent.getBroadcast(context, 1, new Intent(f16488o), 201326592));
        Intent intent = new Intent(f16487m);
        intent.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        Intent intentCdj = cdj(intent);
        if (intentCdj != null) {
            autoCancel.setContentIntent(PendingIntent.getActivity(context, 1, intentCdj, 201326592));
        }
        com.android.thememanager.basemodule.utils.jk.m7104n(context, 1, autoCancel);
    }

    public boolean jk(Resource resource) {
        String assemblyId = resource.getAssemblyId();
        String downloadPath = resource.getDownloadPath();
        if (downloadPath != null) {
            synchronized (this.f16501s) {
                Iterator<zy> it = this.f16501s.iterator();
                while (it.hasNext()) {
                    if (downloadPath.equals(it.next().f61247toq.getDownloadPath())) {
                        return true;
                    }
                }
            }
        }
        if (assemblyId == null) {
            return false;
        }
        synchronized (this.f16501s) {
            Iterator<zy> it2 = this.f16501s.iterator();
            while (it2.hasNext()) {
                if (assemblyId.equals(it2.next().f61247toq.getAssemblyId())) {
                    return true;
                }
            }
            return false;
        }
    }

    protected void jp0y(Context context, Resource resource, com.android.thememanager.fu4 resContext) {
        String quantityString;
        int i2 = f16492x + 1;
        f16492x = i2;
        if (i2 == 1) {
            float dimension = context.getResources().getDimension(R.dimen.notification_download_theme_title_width);
            String title = resource.getTitle();
            int iBreakText = new Paint().breakText(title, true, dimension, null);
            if (title.length() > iBreakText) {
                title = title.substring(0, iBreakText) + "..";
            }
            quantityString = context.getString(R.string.resource_download_notification_title_one, title);
        } else {
            Resources resources = context.getResources();
            int i3 = f16492x;
            quantityString = resources.getQuantityString(R.plurals.resource_download_notification_title_many, i3, Integer.valueOf(i3));
        }
        Notification.Builder autoCancel = new Notification.Builder(context).setSmallIcon(fn3e(context)).setContentTitle(quantityString).setContentText(context.getString(R.string.resource_tab_to_view)).setAutoCancel(true);
        autoCancel.setDeleteIntent(PendingIntent.getBroadcast(context, 1, new Intent(f16481b), 201326592));
        Intent intent = new Intent(f16480a);
        if (f16492x == 1) {
            intent.putExtra("extra_resource", resource.getLocalId());
        }
        intent.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        Intent intentCdj = cdj(intent);
        if (intentCdj != null) {
            autoCancel.setContentIntent(PendingIntent.getActivity(context, 1, intentCdj, 201326592));
        }
        com.android.thememanager.basemodule.utils.jk.m7104n(context, 3, autoCancel);
    }

    public boolean mcp() {
        return this.f16499p;
    }

    protected C1905h n7h(com.android.thememanager.fu4 resContext) {
        return new C1905h(resContext);
    }

    protected void o1t(Resource resource, String message) {
        String strM9744h;
        Intent intent = new Intent();
        intent.putExtra("extra_resource", resource);
        intent.setAction("action_resource_import_complete");
        this.f16497k.sendBroadcast(intent);
        if (PreferenceManager.getDefaultSharedPreferences(this.f16497k).getBoolean(zkd.f16922n, true) && (strM9744h = g1.m9744h(null)) != null && strM9744h.equals(resource.getLocalId())) {
            if (((PowerManager) this.f16497k.getSystemService("power")).isScreenOn()) {
                ThemeSchedulerService.cdj();
            } else {
                Log.d(f16485j, "IdleUpdateThemeTask:import completion and apply");
                com.android.thememanager.v9.f7l8.n7h(this.f16497k, strM9744h, true);
            }
        }
        String strM9744h2 = g1.m9744h(null);
        String localId = resource.getParentResources().size() != 0 ? resource.getParentResources().get(0).getLocalId() : resource.getLocalId();
        if (strM9744h2 != null && strM9744h2.equals(localId)) {
            oc(this.f16497k, localId, resource.getTitle());
        }
        t8r(resource.getDownloadPath());
    }

    protected boolean qrj(Context context, Resource resource, com.android.thememanager.fu4 resContext) {
        return resContext.getResourceFormat() == 1;
    }

    /* JADX INFO: renamed from: t */
    public void m9771t(com.android.thememanager.fu4 resContext, Resource resource) {
        synchronized (this.f16501s) {
            boolean z2 = false;
            Iterator<zy> it = this.f16501s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (resource.getDownloadPath().equals(it.next().f61247toq.getDownloadPath())) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                this.f16501s.add(new zy(resContext, resource));
            }
        }
        d2ok();
    }

    protected void wvg(Resource resource) {
    }

    protected boolean x2(Context context, Resource resource, com.android.thememanager.fu4 resContext) {
        if (TextUtils.isEmpty(resource.getOnlineId())) {
            return false;
        }
        return "theme".equals(resContext.getResourceCode()) || C1792n.fti(resContext.getResourceCode()) || C1792n.fu4(resContext.getResourceCode()) || C1792n.eqxt(resContext.getResourceCode()) || C1792n.lvui(resContext.getResourceCode());
    }

    /* JADX INFO: renamed from: z */
    protected void m9772z(Resource resource) {
        Intent intent = new Intent();
        intent.putExtra("extra_resource", resource);
        intent.setAction("action_resource_import_start");
        this.f16497k.sendBroadcast(intent);
    }

    @zy.lvui
    public androidx.lifecycle.fti<ThemeStatus> zurt() {
        return this.f16498n;
    }
}
