package com.android.thememanager.activity;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;

/* JADX INFO: loaded from: classes.dex */
public class PrivacyThemeBaseActivity extends AbstractActivityC1717k implements RestoreHomeIconHelper.toq {

    /* JADX INFO: renamed from: c */
    public static final String f8811c = "key_privacy_fragment_type";

    /* JADX INFO: renamed from: e */
    public static final String f8812e = "privacy_fragment_type_notify";

    /* JADX INFO: renamed from: f */
    public static final String f8813f = "value_preference_revoke_agreement";

    /* JADX INFO: renamed from: j */
    public static final String f8814j = "privacy_fragment_type_warning";

    /* JADX INFO: renamed from: l */
    public static final String f8815l = "value_preference_logoff_service";

    /* JADX INFO: renamed from: r */
    public static final String f8816r = "key_preference_type";

    private void g1(Bundle savedInstanceState) {
        com.android.thememanager.basemodule.base.toq jbhVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String stringExtra = getIntent().getStringExtra(f8816r);
        String stringExtra2 = getIntent().getStringExtra(f8811c);
        Bundle bundle = new Bundle();
        bundle.putString(f8816r, stringExtra);
        if (savedInstanceState == null) {
            jbhVar = f8812e.equals(stringExtra2) ? new jbh() : new ebn();
            androidx.fragment.app.o1t o1tVarKi = supportFragmentManager.ki();
            o1tVarKi.m4317z(R.id.content, jbhVar);
            o1tVarKi.qrj();
        } else {
            Fragment fragmentCh = supportFragmentManager.ch(R.id.content);
            jbhVar = fragmentCh instanceof com.android.thememanager.basemodule.base.toq ? (com.android.thememanager.basemodule.base.toq) fragmentCh : null;
        }
        if (jbhVar != null) {
            jbhVar.setArguments(bundle);
        }
    }

    private void was() {
        if (f8813f.equals(getIntent().getStringExtra(f8816r))) {
            mo6478v(getApplication().getString(com.android.thememanager.R.string.privacy_revoke_agree_content));
        } else {
            mo6478v(getApplication().getString(com.android.thememanager.R.string.privacy_phone_logoff_service_content));
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g1(savedInstanceState);
        was();
    }
}
