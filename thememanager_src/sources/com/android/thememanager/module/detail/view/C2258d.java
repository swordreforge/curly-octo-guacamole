package com.android.thememanager.module.detail.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import miuix.appcompat.app.ki;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.view.d */
/* JADX INFO: compiled from: SystemAodDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2258d extends androidx.fragment.app.zy {
    public static final String bb = "never_show_system_aod_state";
    private static final String bp = "show_checkbox";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private zy f60552ab;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.d$k */
    /* JADX INFO: compiled from: SystemAodDialog.java */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ miuix.appcompat.app.ki f13228k;

        k(final miuix.appcompat.app.ki val$dialog) {
            this.f13228k = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f13228k.t8r()) {
                C2258d.this.g0ad(this.f13228k);
            }
            com.android.thememanager.basemodule.utils.o1t.m7173n(C2258d.this.getActivity(), C2258d.this, 5000);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.d$toq */
    /* JADX INFO: compiled from: SystemAodDialog.java */
    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ miuix.appcompat.app.ki f13230k;

        toq(final miuix.appcompat.app.ki val$dialog) {
            this.f13230k = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f13230k.t8r()) {
                C2258d.this.g0ad(this.f13230k);
            }
            if (C2258d.this.f60552ab != null) {
                C2258d.this.f60552ab.mo8402k();
            }
            C2258d.this.kx3();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.d$zy */
    /* JADX INFO: compiled from: SystemAodDialog.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo8402k();
    }

    public static C2258d el(boolean showCheckbox) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(bp, showCheckbox);
        C2258d c2258d = new C2258d();
        c2258d.setArguments(bundle);
        return c2258d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0ad(miuix.appcompat.app.ki dialog) {
        if (dialog.t8r()) {
            ActivityC0891q activity = getActivity();
            if (activity == null) {
                Log.e("SystemAodDialog", "saveState: getActivity return null");
            } else {
                PreferenceManager.getDefaultSharedPreferences(activity).edit().putBoolean(bb, true).apply();
            }
        }
    }

    public static boolean wt(@zy.lvui Context context) {
        if (C1819o.m7153f()) {
            return (((com.android.thememanager.module.detail.util.zy.m8378n() & 16) == 0 && (com.android.thememanager.module.detail.util.zy.m8378n() & 32) == 0) || PreferenceManager.getDefaultSharedPreferences(context).getBoolean(bb, false)) ? false : true;
        }
        return false;
    }

    public void imd(zy onOperationListener) {
        this.f60552ab = onOperationListener;
    }

    @Override // androidx.fragment.app.zy
    public Dialog nnh(Bundle savedInstanceState) {
        ki.C6947k c6947kM25047s = new ki.C6947k(getActivity()).uv6(getString(R.string.system_aod_dialog_title)).m25050z(getString(R.string.system_aod_dialog_message)).x9kr(getString(R.string.system_aod_dialog_positive_button), null).mcp(android.R.string.cancel, null).m25047s(false);
        if (getArguments() != null && getArguments().getBoolean(bp, false)) {
            c6947kM25047s.m25044p(false, getString(R.string.dialog_show_never));
        }
        return c6947kM25047s.m25037g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 5000) {
            kx3();
            zy zyVar = this.f60552ab;
            if (zyVar != null) {
                zyVar.mo8402k();
            }
        }
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        miuix.appcompat.app.ki kiVar = (miuix.appcompat.app.ki) u38j();
        if (kiVar != null) {
            kiVar.m25027h(-1).setOnClickListener(new k(kiVar));
            kiVar.m25027h(-2).setOnClickListener(new toq(kiVar));
        }
    }
}
