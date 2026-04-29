package com.android.thememanager.basemodule.account;

import android.content.Intent;
import android.os.Bundle;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.account.toq;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.x2;
import miuix.appcompat.app.ki;
import p000a.InterfaceC0000k;

/* JADX INFO: loaded from: classes.dex */
public class LoginDialogActivity extends AbstractActivityC1717k implements toq.InterfaceC1689k {

    /* JADX INFO: renamed from: l */
    public static final int f9633l = 2;

    /* JADX INFO: renamed from: r */
    private ki f9634r;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.LoginDialogActivity$k */
    class C1684k implements InterfaceC0000k {
        C1684k() {
        }

        @Override // p000a.InterfaceC0000k
        public void onCancel() {
            LoginDialogActivity.this.setResult(0);
            LoginDialogActivity.this.finish();
        }

        @Override // p000a.toq
        public void onSuccess() {
            LoginDialogActivity.this.setResult(1);
            LoginDialogActivity.this.finish();
        }
    }

    class toq implements C1688q.n {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            LoginDialogActivity.this.setResult(2);
            LoginDialogActivity.this.finish();
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            C1688q.cdj().m6587p();
            LoginDialogActivity.this.setResult(-1);
            LoginDialogActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void was(boolean z2) {
        if (z2) {
            setResult(1);
        } else {
            setResult(0);
        }
        finish();
    }

    private void zsr0() {
        C1688q.cdj().fti(this, new toq());
    }

    @Override // com.android.thememanager.basemodule.account.toq.InterfaceC1689k
    public void hyr(C1685g info) {
        if (info == null || info.f9637k == null) {
            zsr0();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 5001) {
            setResult(resultCode);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ("miui.thememanager.SHOW_CTA".equals(getIntent().getAction())) {
            if (m6715x().m6911q(this, null, null, true)) {
                return;
            }
            setResult(1);
            finish();
            return;
        }
        if (!"miui.thememanager.ALL_CTA_AND_NETWORK".equals(getIntent().getAction())) {
            if ("miui.thememanager.Login".equals(getIntent().getAction())) {
                zsr0();
            }
        } else {
            if (m6715x().m6911q(this, null, null, true)) {
                return;
            }
            if (x2.f7l8()) {
                x2.m6916q(this, new C1684k());
            } else if (!x2.zy()) {
                m6715x().m6909i(this, new C1781k.g() { // from class: com.android.thememanager.basemodule.account.k
                    @Override // com.android.thememanager.basemodule.privacy.C1781k.g
                    /* JADX INFO: renamed from: k */
                    public final void mo6371k(boolean z2) {
                        this.f9640k.was(z2);
                    }
                });
            } else {
                setResult(1);
                finish();
            }
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ki kiVar = this.f9634r;
        if (kiVar != null) {
            kiVar.dismiss();
        }
        this.f9634r = null;
    }
}
