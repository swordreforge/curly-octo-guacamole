package com.android.thememanager.activity;

import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import miuix.appcompat.app.ki;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: BaseResourceTrialDialogActivity.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ki extends bek6 implements InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private String f9126g;

    /* JADX INFO: renamed from: k */
    private com.android.thememanager.util.r8s8 f9127k;

    /* JADX INFO: renamed from: n */
    private String f9128n;

    /* JADX INFO: renamed from: p */
    private miuix.appcompat.app.ki f9129p;

    /* JADX INFO: renamed from: q */
    private com.android.thememanager.fu4 f9130q;

    /* JADX INFO: renamed from: s */
    private boolean f9131s;

    /* JADX INFO: renamed from: y */
    private String f9132y;

    /* JADX INFO: renamed from: com.android.thememanager.activity.ki$k */
    /* JADX INFO: compiled from: BaseResourceTrialDialogActivity.java */
    class DialogInterfaceOnClickListenerC1594k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1594k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ki.this.m6427m();
        }
    }

    /* JADX INFO: compiled from: BaseResourceTrialDialogActivity.java */
    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            if (com.android.thememanager.basemodule.utils.lvui.a9(bf2.toq.toq())) {
                com.android.thememanager.basemodule.utils.lvui.m7124i(ki.this);
                ki.this.m6427m();
                return;
            }
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ue);
            arrayMapZy.put("resourceType", ki.this.f9130q.getResourceCode());
            C1708s.f7l8().ld6().ni7(arrayMapZy);
            ki.this.yz();
            ki.this.f9131s = true;
            ki.this.finish();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6424b() {
        this.f9127k.zy(this.f9130q, this.f9128n, this.f9126g, this.f9132y, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m6427m() {
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.m4ll);
        arrayMapZy.put("resourceType", this.f9130q.getResourceCode());
        C1708s.f7l8().ld6().ni7(arrayMapZy);
        m6424b();
        this.f9131s = true;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yz() {
        this.f9127k.zy(this.f9130q, this.f9128n, this.f9126g, this.f9132y, true);
    }

    protected abstract com.android.thememanager.util.r8s8 ek5k();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f9127k = ek5k();
        Intent intent = getIntent();
        this.f9130q = C2082k.zy().m8001n().toq(intent);
        this.f9128n = intent.getStringExtra(InterfaceC1357q.f53909m4);
        this.f9126g = intent.getStringExtra(InterfaceC1357q.f53950v0af);
        this.f9132y = intent.getStringExtra(InterfaceC1357q.f53867etdu);
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(this, 2131951635).lrht(R.string.resource_trial_end_title).m25050z(getString(R.string.resource_trial_end_message, this.f9128n)).dd("fonts".equals(this.f9130q.getResourceCode()) ? R.string.font_trial_end_purchase : R.string.resource_trial_end_purchase, new toq()).mcp(R.string.resource_trial_end_restore, new DialogInterfaceOnClickListenerC1594k()).m25047s(false).m25037g();
        this.f9129p = kiVarM25037g;
        kiVarM25037g.show();
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        miuix.appcompat.app.ki kiVar = this.f9129p;
        if (kiVar != null && kiVar.isShowing()) {
            this.f9129p.n7h();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f9131s || ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked()) {
            return;
        }
        m6424b();
        finish();
    }
}
