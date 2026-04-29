package com.android.thememanager.miuixcompat;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.C1825s;
import java.lang.ref.WeakReference;
import miuix.appcompat.app.ki;

/* JADX INFO: renamed from: com.android.thememanager.miuixcompat.n */
/* JADX INFO: compiled from: MIUIXCompatApplyDialogTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC2208n extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f60497kja0 = "miuix_warning_resource_id";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f60498n7h = "MIUIXCompat";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f60499f7l8;

    /* JADX INFO: renamed from: g */
    private int f13010g;

    /* JADX INFO: renamed from: k */
    private WeakReference<AbstractActivityC1717k> f13011k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private String f60500ld6;

    /* JADX INFO: renamed from: n */
    private WeakReference<Runnable> f13012n;

    /* JADX INFO: renamed from: p */
    private boolean f13013p;

    /* JADX INFO: renamed from: q */
    private WeakReference<Runnable> f13014q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f60501qrj;

    /* JADX INFO: renamed from: s */
    private boolean f13015s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f60502toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f60503x2;

    /* JADX INFO: renamed from: y */
    private volatile boolean f13016y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Resource f60504zy;

    /* JADX INFO: renamed from: com.android.thememanager.miuixcompat.n$k */
    /* JADX INFO: compiled from: MIUIXCompatApplyDialogTask.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Runnable runnable;
            dialog.cancel();
            if (AsyncTaskC2208n.this.f13014q == null || (runnable = (Runnable) AsyncTaskC2208n.this.f13014q.get()) == null) {
                return;
            }
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.miuixcompat.n$toq */
    /* JADX INFO: compiled from: MIUIXCompatApplyDialogTask.java */
    class toq implements DialogInterface.OnCancelListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialog) {
            Runnable runnable;
            dialog.cancel();
            if (AsyncTaskC2208n.this.f13014q == null || (runnable = (Runnable) AsyncTaskC2208n.this.f13014q.get()) == null) {
                return;
            }
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.miuixcompat.n$zy */
    /* JADX INFO: compiled from: MIUIXCompatApplyDialogTask.java */
    class zy implements DialogInterface.OnCancelListener {
        zy() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialog) {
            Runnable runnable;
            if (AsyncTaskC2208n.this.f13012n == null || (runnable = (Runnable) AsyncTaskC2208n.this.f13012n.get()) == null) {
                return;
            }
            runnable.run();
        }
    }

    public AsyncTaskC2208n(AbstractActivityC1717k activity, int mixFlag, boolean isApplyMix, String code, Resource resource, Runnable applyRunnable, Runnable cancelRunnable) {
        this.f60501qrj = true;
        this.f13011k = new WeakReference<>(activity);
        this.f60502toq = code;
        this.f13010g = mixFlag;
        this.f60499f7l8 = isApplyMix;
        this.f60504zy = resource;
        this.f13014q = new WeakReference<>(applyRunnable);
        this.f13012n = new WeakReference<>(cancelRunnable);
        Resource resource2 = this.f60504zy;
        this.f60500ld6 = resource2 == null ? null : resource2.getOnlineId();
        Resource resource3 = this.f60504zy;
        this.f60503x2 = resource3 != null ? resource3.getLocalId() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m8316g(DialogInterface dialogInterface, int i2) {
        Runnable runnable;
        String str;
        String str2;
        Runnable runnable2;
        if (i2 != -1) {
            if (i2 == -2) {
                dialogInterface.cancel();
                WeakReference<Runnable> weakReference = this.f13012n;
                if (weakReference == null || (runnable = weakReference.get()) == null) {
                    return;
                }
                runnable.run();
                return;
            }
            return;
        }
        dialogInterface.cancel();
        WeakReference<Runnable> weakReference2 = this.f13014q;
        if (weakReference2 != null && (runnable2 = weakReference2.get()) != null) {
            runnable2.run();
        }
        if (((ki) dialogInterface).t8r()) {
            if (this.f13016y) {
                C1824r.m7203y().m7206p(C2206g.f13009y, false).toq();
            } else {
                C1824r.m7203y().m7206p(C2206g.f60483f7l8, false).toq();
            }
        }
        if (C1824r.m7203y().m7207q(C2206g.f13008s, 0) != 1) {
            C1824r.m7203y().ld6(C2206g.f13008s, 1).m7204k();
        }
        String str3 = this.f60500ld6;
        if (str3 == null) {
            str2 = this.f60503x2;
            str = "localId";
        } else {
            str = "onlineId";
            str2 = str3;
        }
        if (str3 == null || this.f13011k.get() == null || this.f13011k.get() == null) {
            return;
        }
        C1825s.f10404q.m7215k(f60497kja0).qrj(str2, str).m7212n(this.f13011k.get());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119 A[RETURN] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.Void... r8) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.miuixcompat.AsyncTaskC2208n.doInBackground(java.lang.Void[]):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String appName) {
        Log.d(f60498n7h, "onPostExecute appName = " + appName + ",mCode = " + this.f60502toq + ",mIsFirstCheck = " + this.f13015s);
        AbstractActivityC1717k abstractActivityC1717k = this.f13011k.get();
        boolean z2 = false;
        if (this.f13015s) {
            if (!this.f13013p || abstractActivityC1717k == null) {
                if (Boolean.valueOf(appName).booleanValue()) {
                    C1824r.m7203y().ld6(C2206g.f13008s, 2).toq();
                    return;
                }
                return;
            }
            int iM7207q = C1824r.m7203y().m7207q(C2206g.f13008s, 0);
            if (!Boolean.valueOf(appName).booleanValue() ? iM7207q == 2 : iM7207q != 1) {
                z2 = true;
            }
            if (z2) {
                new ki.C6947k(abstractActivityC1717k).uv6(abstractActivityC1717k.getString(R.string.incompatible_dialog_title)).m25050z(abstractActivityC1717k.getString(R.string.incompatible_dialog_message)).gvn7(new toq()).x9kr(abstractActivityC1717k.getString(R.string.incompatible_dialog_ok), new k()).hb();
                C1824r.m7203y().ld6(C2206g.f13008s, 1).toq();
                return;
            }
            return;
        }
        if (this.f60501qrj && !p029m.zy.toq(appName) && C1819o.eqxt(abstractActivityC1717k) && (!this.f13016y || appName.equals(C2206g.qrj("theme")) || C1824r.m7203y().zy(C2206g.f13009y, true))) {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.android.thememanager.miuixcompat.zy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f13021k.m8316g(dialogInterface, i2);
                }
            };
            zy zyVar = new zy();
            if (appName.equals(C2206g.qrj("theme"))) {
                new ki.C6947k(abstractActivityC1717k).uv6(abstractActivityC1717k.getString(R.string.incompatible_dialog_title)).m25050z(abstractActivityC1717k.getString(R.string.incompatible_dialog_message)).mcp(R.string.incompatible_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.miuixcompat.q
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.cancel();
                    }
                }).gvn7(zyVar).x9kr(abstractActivityC1717k.getString(R.string.incompatible_dialog_ok), onClickListener).hb();
                return;
            } else {
                new ki.C6947k(abstractActivityC1717k).lrht(R.string.miuix_compat_dialog_update_title).m25050z(abstractActivityC1717k.getString(R.string.miuix_compat_dialog_content, appName)).m25044p(false, abstractActivityC1717k.getString(R.string.miuix_compat_dialog_checkbox)).dd(R.string.miuix_compat_dialog_ok, onClickListener).mcp(R.string.miuix_compat_dialog_cancel, onClickListener).gvn7(zyVar).m25037g().show();
                return;
            }
        }
        WeakReference<Runnable> weakReference = this.f13014q;
        if (weakReference != null) {
            Runnable runnable = weakReference.get();
            Log.d(f60498n7h, "onPostExecute begin apply runnable: " + runnable);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public AsyncTaskC2208n(AbstractActivityC1717k activity, Runnable applyRunnable, boolean isShow) {
        this.f60501qrj = true;
        this.f13011k = new WeakReference<>(activity);
        this.f13014q = new WeakReference<>(applyRunnable);
        this.f13015s = true;
        this.f13013p = isShow;
        this.f60500ld6 = null;
    }
}
