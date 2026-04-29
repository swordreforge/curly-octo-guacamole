package com.android.thememanager.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.ScreenShotReportManager;
import ek5k.C6002g;
import i1.C6077k;
import miuix.appcompat.app.ki;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends kja0 {

    /* JADX INFO: renamed from: c */
    private miuix.appcompat.app.ki f8773c;

    /* JADX INFO: renamed from: e */
    private p000a.zy f8774e = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.activity.ComponentActivity$k */
    class ViewOnClickListenerC1543k implements View.OnClickListener {
        ViewOnClickListenerC1543k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ComponentActivity componentActivity = ComponentActivity.this;
            if (com.android.thememanager.basemodule.utils.lvui.m7131s(componentActivity, componentActivity.f8774e)) {
                return;
            }
            ComponentActivity.this.bwp();
        }
    }

    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            ComponentActivity.this.bwp();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ComponentActivity.this, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bwp() {
        if (this.f8773c == null) {
            this.f8773c = new ki.C6947k(this).m25050z(getString(R.string.backup_theme_dialog_message)).mcp(android.R.string.cancel, null).dd(R.string.backup_theme_dialog_ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.y9n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9399k.yqrt(dialogInterface, i2);
                }
            }).m25037g();
        }
        if (this.f8773c.isShowing()) {
            return;
        }
        this.f8773c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yqrt(DialogInterface dialogInterface, int i2) {
        new com.android.thememanager.util.ki(this).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.hi;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(R.id.back_up_component);
        C6077k.m22369i(viewFindViewById);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1543k());
        getLifecycle().mo4451k(new ScreenShotReportManager(this, com.android.thememanager.basemodule.analysis.toq.hi, null));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        miuix.appcompat.app.ki kiVar = this.f8773c;
        if (kiVar == null || !kiVar.isShowing()) {
            return;
        }
        this.f8773c.dismiss();
        this.f8773c = null;
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.component_layout;
    }
}
