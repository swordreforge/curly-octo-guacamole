package com.theme.loopwallpaper.activity;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.o1t;
import com.android.thememanager.activity.cdj;
import com.theme.loopwallpaper.fragment.C5440k;

/* JADX INFO: loaded from: classes3.dex */
public class WallpaperLoopMoreSettingActivity extends cdj {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.activity.cdj, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.m4317z(R.id.content, new C5440k());
        o1tVarKi.qrj();
    }
}
