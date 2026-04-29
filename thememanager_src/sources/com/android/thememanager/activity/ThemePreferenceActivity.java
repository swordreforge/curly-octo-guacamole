package com.android.thememanager.activity;

import android.R;
import android.os.Bundle;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes.dex */
public class ThemePreferenceActivity extends cdj implements com.android.thememanager.basemodule.analysis.toq, InterfaceC1357q {
    @Override // com.android.thememanager.activity.cdj, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.fragment.app.o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.m4317z(R.id.content, new e5());
        o1tVarKi.qrj();
    }
}
