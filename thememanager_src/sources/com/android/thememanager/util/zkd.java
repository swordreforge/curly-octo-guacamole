package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.service.ThemeSchedulerService;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import miui.app.constants.ThemeManagerConstants;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: UpdateUsingThemeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class zkd implements ThemeManagerConstants, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private static final String f16920g = "update_dialog_theme_hash";

    /* JADX INFO: renamed from: k */
    private static final String f16921k = "UpdateUsingThemeHelper";

    /* JADX INFO: renamed from: n */
    public static final String f16922n = "update_using_theme_automatically";

    /* JADX INFO: renamed from: q */
    public static final String f16923q = "IdleUpdateThemeTask:";

    /* JADX INFO: renamed from: y */
    private static toq f16924y;

    /* JADX INFO: renamed from: com.android.thememanager.util.zkd$k */
    /* JADX INFO: compiled from: UpdateUsingThemeHelper.java */
    class C2824k extends Thread {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f16925k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.android.thememanager.fu4 f16926q;

        C2824k(final Resource val$resource, final com.android.thememanager.fu4 val$resContext) {
            this.f16925k = val$resource;
            this.f16926q = val$resContext;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            zy.C1711k c1711k = new zy.C1711k();
            com.android.thememanager.o1t o1tVarM8000g = C2082k.zy().m8000g();
            c1711k.f9808n = true;
            c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.jute;
            c1711k.f57497zy = "";
            c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
            if (o1tVarM8000g.n7h(this.f16925k)) {
                return;
            }
            o1tVarM8000g.m8431g(this.f16925k, this.f16926q, c1711k, false);
        }
    }

    /* JADX INFO: compiled from: UpdateUsingThemeHelper.java */
    public static class toq extends AsyncTask<Void, Void, Resource> {

        /* JADX INFO: renamed from: g */
        private boolean f16927g;

        /* JADX INFO: renamed from: k */
        private WeakReference<Context> f16928k;

        /* JADX INFO: renamed from: n */
        private String f16929n;

        /* JADX INFO: renamed from: q */
        private String f16930q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.android.thememanager.fu4 f61441toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private com.android.thememanager.controller.ld6 f61442zy;

        /* JADX INFO: renamed from: com.android.thememanager.util.zkd$toq$k */
        /* JADX INFO: compiled from: UpdateUsingThemeHelper.java */
        class DialogInterfaceOnClickListenerC2825k implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Context f16931k;

            DialogInterfaceOnClickListenerC2825k(final Context val$context) {
                this.f16931k = val$context;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                toq.this.m10100n(dialog, this.f16931k);
                C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.sa));
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.util.zkd$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UpdateUsingThemeHelper.java */
        class DialogInterfaceOnClickListenerC7940toq implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Context f16933k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Resource f16935q;

            DialogInterfaceOnClickListenerC7940toq(final Context val$context, final Resource val$result) {
                this.f16933k = val$context;
                this.f16935q = val$result;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                toq.this.m10100n(dialog, this.f16933k);
                zkd.toq(toq.this.f61441toq, this.f16935q);
                C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.xrg));
            }
        }

        public toq(Context context, com.android.thememanager.fu4 resContext, String localId, String usingThemeHash, boolean isIdleUpdate) {
            this.f16927g = false;
            this.f16928k = new WeakReference<>(context);
            this.f61441toq = resContext;
            this.f16930q = localId;
            this.f16929n = usingThemeHash;
            this.f16927g = isIdleUpdate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m10100n(DialogInterface dialog, Context context) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            editorEdit.putBoolean(zkd.f16922n, ((miuix.appcompat.app.ki) dialog).t8r());
            editorEdit.apply();
            g1.qkj8(zkd.f16920g, this.f16929n);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(final Resource result) {
            super.onPostExecute(result);
            Context context = this.f16928k.get();
            if (context == null || result == null) {
                if (this.f16927g) {
                    Log.d(zkd.f16921k, "IdleUpdateThemeTask:failure for other reasons");
                    ThemeSchedulerService.cdj();
                    return;
                }
                return;
            }
            String hash = result.getHash();
            if (this.f61442zy.mcp(result)) {
                if (this.f16927g) {
                    Log.d(zkd.f16921k, "IdleUpdateThemeTask:update");
                    zkd.toq(this.f61441toq, result);
                    return;
                } else {
                    if (!(context instanceof Activity) || gc3c.cdj((Activity) context)) {
                        new ki.C6947k(context).lrht(R.string.theme_batch_update_dlg_title).fu4(R.string.using_theme_has_update_tips).m25047s(false).m25044p(true, context.getString(R.string.automatically_update_using_theme_tips)).dd(R.string.update_immediately, new DialogInterfaceOnClickListenerC7940toq(context, result)).mcp(android.R.string.cancel, new DialogInterfaceOnClickListenerC2825k(context)).m25037g().show();
                        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.xzk6, null, ""));
                        return;
                    }
                    return;
                }
            }
            if (this.f16927g) {
                if (TextUtils.isEmpty(this.f16929n) || this.f16929n.equals(hash)) {
                    Log.d(zkd.f16921k, "IdleUpdateThemeTask:no need to be update");
                    ThemeSchedulerService.cdj();
                } else {
                    Log.d(zkd.f16921k, "IdleUpdateThemeTask:apply");
                    com.android.thememanager.v9.f7l8.n7h(context, this.f16930q, true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Resource doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            com.android.thememanager.controller.ld6 ld6VarM7690k = C2082k.zy().m8001n().ld6(this.f61441toq).m7690k();
            this.f61442zy = ld6VarM7690k;
            ld6VarM7690k.cdj(false, false);
            return this.f61442zy.qrj(this.f16930q);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m10095g() {
        ThemeApplication qVar = C2082k.zy().toq();
        com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g("theme");
        m10097n(qVar, fu4VarM10535g, com.android.thememanager.basemodule.utils.vyq.fn3e(fu4VarM10535g.getResourceCode()), true);
    }

    /* JADX INFO: renamed from: n */
    private static void m10097n(Context activity, com.android.thememanager.fu4 resContext, String usingThemeHash, boolean isIdleUpdate) {
        toq toqVar = new toq(activity, resContext, g1.m9744h(null), usingThemeHash, isIdleUpdate);
        f16924y = toqVar;
        toqVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: q */
    public static void m10098q(final Activity activity, final com.android.thememanager.fu4 resContext) {
        if (!g1.x2(f16922n, true) && C1915g.m7551q() == C1915g.k.WIFI && zy()) {
            String strD3 = g1.d3(f16920g, null);
            String strFn3e = com.android.thememanager.basemodule.utils.vyq.fn3e("theme");
            if (strFn3e == null || strFn3e.equals(strD3)) {
                return;
            }
            toq toqVar = f16924y;
            if (toqVar == null || toqVar.getStatus() == AsyncTask.Status.FINISHED) {
                m10097n(activity, resContext, strFn3e, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toq(final com.android.thememanager.fu4 resContext, final Resource resource) {
        new C2824k(resource, resContext).start();
    }

    public static boolean zy() {
        String strM9744h = g1.m9744h(null);
        r8s8 r8s8VarM8003s = C2082k.zy().m8003s();
        if (TextUtils.isEmpty(strM9744h) || strM9744h.equals(r8s8VarM8003s.m9976g())) {
            return false;
        }
        String strNi7 = com.android.thememanager.basemodule.utils.vyq.ni7("theme");
        return (TextUtils.isEmpty(strNi7) || ch.vyq(strNi7) || ch.n5r1(strNi7)) ? false : true;
    }
}
