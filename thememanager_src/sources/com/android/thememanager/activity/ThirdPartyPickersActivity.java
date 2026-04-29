package com.android.thememanager.activity;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import miui.app.constants.ThemeManagerConstants;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPartyPickersActivity extends bek6 implements ThemeManagerConstants {

    /* JADX INFO: renamed from: g */
    public static final String f8899g = "extra_requeset_code";

    /* JADX INFO: renamed from: n */
    public static final String f8900n = "extra_is_from_settings";

    /* JADX INFO: renamed from: q */
    public static final String f8901q = "extra_resource_code";

    /* JADX INFO: renamed from: k */
    private boolean f8902k;

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f8902k || com.android.thememanager.basemodule.utils.o1t.n7h()) {
            return;
        }
        overridePendingTransition(R.anim.fade_in, com.android.thememanager.R.anim.push_down_out);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            Log.e("ThirdPartyPickersActivity", "onCreate: intent is null!");
            return;
        }
        this.f8902k = intent.getBooleanExtra(f8900n, false);
        intent.getStringExtra("android.intent.extra.ringtone.TITLE");
        String stringExtra = intent.getStringExtra(f8901q);
        if (stringExtra == null) {
            finish();
            return;
        }
        if (stringExtra.equals("ringtone")) {
            getAppCompatActionBar().xwq3(com.android.thememanager.R.string.resource_title_select_ringtone);
        } else {
            int iKja0 = p001b.toq.kja0(stringExtra);
            if (iKja0 != 0) {
                getAppCompatActionBar().mo173v(getString(com.android.thememanager.R.string.third_party_pickers_activity_title, getString(iKja0)));
            }
        }
        if (savedInstanceState == null) {
            androidx.fragment.app.o1t o1tVarKi = getSupportFragmentManager().ki();
            o1tVarKi.m4317z(R.id.content, new lw());
            o1tVarKi.qrj();
        }
    }
}
