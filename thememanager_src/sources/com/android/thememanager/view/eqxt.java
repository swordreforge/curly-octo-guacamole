package com.android.thememanager.view;

import android.content.DialogInterface;
import android.os.AsyncTask;
import com.android.thememanager.R;
import com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s;
import com.android.thememanager.wallpaper.C2951n;
import java.lang.ref.WeakReference;
import miuix.appcompat.app.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RestoreDefaultLockTask.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class eqxt extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private WeakReference<AbstractViewOnClickListenerC2725s> f17514k;

    public eqxt(@InterfaceC7396q AbstractViewOnClickListenerC2725s activity) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        this.f17514k = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m10341q(AbstractViewOnClickListenerC2725s activity, DialogInterface dialog, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "$activity");
        kotlin.jvm.internal.d2ok.m23075h(dialog, "dialog");
        if (i2 == -2) {
            dialog.dismiss();
        } else {
            if (i2 != -1) {
                return;
            }
            activity.bz2();
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        zy(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    @InterfaceC7396q
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(@InterfaceC7396q Void... params) {
        kotlin.jvm.internal.d2ok.m23075h(params, "params");
        return Boolean.valueOf(!C2951n.fn3e().d2ok());
    }

    protected void zy(boolean z2) {
        final AbstractViewOnClickListenerC2725s abstractViewOnClickListenerC2725s;
        super.onPostExecute(Boolean.valueOf(z2));
        WeakReference<AbstractViewOnClickListenerC2725s> weakReference = this.f17514k;
        if (weakReference == null || (abstractViewOnClickListenerC2725s = weakReference.get()) == null) {
            return;
        }
        if (!z2) {
            abstractViewOnClickListenerC2725s.bz2();
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.android.thememanager.view.oc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                eqxt.m10341q(abstractViewOnClickListenerC2725s, dialogInterface, i2);
            }
        };
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(abstractViewOnClickListenerC2725s).m25050z(abstractViewOnClickListenerC2725s.getString(R.string.restore_default_lock_style_apply_superwallpaper)).m25047s(false).dd(R.string.miuix_compat_dialog_ok, onClickListener).mcp(R.string.miuix_compat_dialog_cancel, onClickListener).m25037g();
        kotlin.jvm.internal.d2ok.kja0(kiVarM25037g, "create(...)");
        kiVarM25037g.show();
    }
}
