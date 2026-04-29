package com.android.thememanager.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.lifecycle.C0924e;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.t8r;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes.dex */
public class ThemeWebActivity extends ek5k {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private AsyncTaskC1556k f57280ab;
    private C1561b bb;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeWebActivity$k */
    static class AsyncTaskC1556k extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f57281ld6 = 3;

        /* JADX INFO: renamed from: p */
        private static final int f8890p = 2;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f57282qrj = 6;

        /* JADX INFO: renamed from: s */
        private static final int f8891s = 1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f57283x2 = 5;

        /* JADX INFO: renamed from: y */
        private static final int f8892y = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private androidx.lifecycle.lrht f57284f7l8;

        /* JADX INFO: renamed from: g */
        private int f8893g;

        /* JADX INFO: renamed from: k */
        private WeakReference<ThemeWebActivity> f8894k;

        /* JADX INFO: renamed from: n */
        private final Object f8895n = new Object();

        /* JADX INFO: renamed from: q */
        private com.android.thememanager.controller.online.t8r f8896q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57285toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private miuix.appcompat.app.dd f57286zy;

        /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeWebActivity$k$k */
        class k implements t8r.f7l8 {
            k() {
            }

            @Override // com.android.thememanager.controller.online.t8r.f7l8
            /* JADX INFO: renamed from: q */
            public void mo6370q(int errorType, int errorCode, String errorMsg) {
                ThemeWebActivity themeWebActivity = (ThemeWebActivity) AsyncTaskC1556k.this.f8894k.get();
                if (themeWebActivity == null || themeWebActivity.isFinishing()) {
                    return;
                }
                AsyncTaskC1556k.this.f8893g = 2;
                synchronized (AsyncTaskC1556k.this.f8895n) {
                    AsyncTaskC1556k.this.f8895n.notify();
                }
                com.android.thememanager.controller.online.t8r.n7h(themeWebActivity, errorType, errorCode, errorMsg);
            }

            @Override // com.android.thememanager.controller.online.t8r.f7l8
            public void toq() {
                AsyncTaskC1556k.this.f8893g = 3;
                synchronized (AsyncTaskC1556k.this.f8895n) {
                    AsyncTaskC1556k.this.f8895n.notify();
                }
            }

            @Override // com.android.thememanager.controller.online.t8r.f7l8
            public void zy(t8r.EnumC1938y step) {
                ThemeWebActivity themeWebActivity = (ThemeWebActivity) AsyncTaskC1556k.this.f8894k.get();
                if (themeWebActivity == null || themeWebActivity.isFinishing()) {
                    return;
                }
                AsyncTaskC1556k.this.f57286zy.n5r1(themeWebActivity.getString(com.android.thememanager.controller.online.t8r.kja0(step)));
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeWebActivity$k$toq */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AsyncTaskC1556k.this.f8896q.fu4(AsyncTaskC1556k.this.f57285toq, "theme", t8r.EnumC1934g.SINGLE);
            }
        }

        public AsyncTaskC1556k(ThemeWebActivity activity, String onlineId) {
            this.f8894k = new WeakReference<>(activity);
            this.f57285toq = onlineId;
            this.f57284f7l8 = activity.bb;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ void m6367s(DialogInterface dialogInterface) {
            cancel(false);
            dialogInterface.dismiss();
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            com.android.thememanager.controller.online.t8r t8rVar;
            ThemeWebActivity themeWebActivity = this.f8894k.get();
            if (com.android.thememanager.util.gc3c.cdj(themeWebActivity) && (t8rVar = this.f8896q) != null && t8rVar.m7627s()) {
                this.f8893g = 1;
                themeWebActivity.f57280ab = null;
                synchronized (this.f8895n) {
                    this.f8895n.notify();
                }
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            ThemeWebActivity themeWebActivity = this.f8894k.get();
            if (com.android.thememanager.util.gc3c.cdj(themeWebActivity)) {
                this.f8896q = new com.android.thememanager.controller.online.t8r(themeWebActivity, new k(), this.f57284f7l8);
                miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(themeWebActivity);
                this.f57286zy = ddVar;
                ddVar.m24877x(true);
                this.f57286zy.n5r1(themeWebActivity.getString(R.string.loading));
                this.f57286zy.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.android.thememanager.activity.a5id
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.f8916k.m6367s(dialogInterface);
                    }
                });
                this.f57286zy.show();
                this.f8893g = 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer realResult) {
            ThemeWebActivity themeWebActivity = this.f8894k.get();
            if (com.android.thememanager.util.gc3c.cdj(themeWebActivity)) {
                this.f57286zy.dismiss();
                if (realResult.intValue() == 6) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_has_been_downloaded, 0);
                    themeWebActivity.vep5();
                } else if (realResult.intValue() == 5) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_downloading, 0);
                    themeWebActivity.vep5();
                }
                themeWebActivity.f57280ab = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            Resource resourcePc = ThemeWebActivity.pc(this.f57285toq);
            if (resourcePc != null && resourcePc.getProductId() != null) {
                com.android.thememanager.fu4 fu4VarNsb = ThemeWebActivity.nsb(resourcePc);
                com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(fu4VarNsb);
                x2VarLd6.m7690k().kja0();
                if (x2VarLd6.m7690k().mo7478t(resourcePc)) {
                    this.f8893g = 6;
                } else {
                    ThemeWebActivity themeWebActivity = this.f8894k.get();
                    if (com.android.thememanager.util.gc3c.cdj(themeWebActivity)) {
                        themeWebActivity.runOnUiThread(new toq());
                    }
                    try {
                        if (this.f8893g == 0) {
                            synchronized (this.f8895n) {
                                if (this.f8893g == 0) {
                                    this.f8895n.wait();
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                    if (this.f8893g == 3) {
                        com.android.thememanager.o1t o1tVarM8000g = C2082k.zy().m8000g();
                        if (!o1tVarM8000g.n7h(resourcePc)) {
                            zy.C1711k c1711k = new zy.C1711k();
                            c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.qy;
                            c1711k.f57497zy = "";
                            c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
                            o1tVarM8000g.m8434n(resourcePc, fu4VarNsb, c1711k);
                        }
                        this.f8893g = 5;
                    }
                }
            }
            return Integer.valueOf(this.f8893g);
        }
    }

    private void ebn(String resOnlineId) {
        if (this.f57280ab == null) {
            AsyncTaskC1556k asyncTaskC1556k = new AsyncTaskC1556k(this, resOnlineId);
            this.f57280ab = asyncTaskC1556k;
            asyncTaskC1556k.executeOnExecutor(C6002g.n7h(), new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.android.thememanager.fu4 nsb(Resource resource) {
        return C2082k.zy().m8001n().f7l8(resource.getCategory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Resource pc(String onlineId) {
        C2965z c2965zM8001n = C2082k.zy().m8001n();
        return c2965zM8001n.ld6(c2965zM8001n.m10536k()).m7690k().t8r(onlineId);
    }

    @Override // com.android.thememanager.activity.ek5k
    protected com.android.thememanager.controller.online.zurt bz2(Uri uri) {
        com.android.thememanager.controller.online.zurt zurtVarBz2 = super.bz2(uri);
        if (uri == this.f9037o && (getIntent().getLongExtra(InterfaceC1357q.f53842a98o, 0L) & 2) != 0) {
            zurtVarBz2.addRequestFlag(1);
        }
        return zurtVarBz2;
    }

    @Override // com.android.thememanager.activity.ek5k
    protected boolean mbx(Uri uri, String originUrl) {
        if (("zhuti.xiaomi.com".equals(uri.getHost()) || InterfaceC1925p.gdzl.equals(uri.getHost())) && uri.getPath() != null) {
            if (uri.getPath().matches(InterfaceC1925p.mm)) {
                if (uri.getBooleanQueryParameter(InterfaceC1925p.bd84, false)) {
                    Matcher matcher = Pattern.compile(InterfaceC1925p.q3).matcher(uri.getPath());
                    matcher.find();
                    ebn(matcher.group());
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", uri));
                }
                return true;
            }
            if (uri.getPath().startsWith(InterfaceC1357q.f53894jz5)) {
                startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            }
        }
        return super.mbx(uri, originUrl);
    }

    @Override // com.android.thememanager.activity.ek5k, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        com.android.thememanager.util.py.m9954q(getIntent());
        super.onCreate(savedInstanceState);
        this.bb = (C1561b) new C0924e(this).m4420k(C1561b.class);
    }

    @Override // com.android.thememanager.activity.ek5k
    protected String uj2j() {
        return getIntent().getStringExtra(InterfaceC1357q.f53866eqxt);
    }
}
