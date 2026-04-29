package com.android.thememanager.activity;

import android.R;
import android.os.Bundle;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;

/* JADX INFO: loaded from: classes.dex */
public class PrivacySettingsActivity extends AbstractActivityC1717k implements C1781k.f7l8 {
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.fragment.app.o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.m4317z(R.id.content, new yl());
        o1tVarKi.qrj();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        if (agree) {
            return;
        }
        finish();
    }
}
