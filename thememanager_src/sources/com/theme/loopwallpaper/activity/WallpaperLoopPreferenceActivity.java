package com.theme.loopwallpaper.activity;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.o1t;
import com.android.thememanager.activity.cdj;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.InterfaceC2950k;
import com.theme.loopwallpaper.fragment.C5441q;

/* JADX INFO: loaded from: classes3.dex */
public class WallpaperLoopPreferenceActivity extends cdj implements InterfaceC2950k {
    @Override // com.android.thememanager.wallpaper.InterfaceC2950k
    /* JADX INFO: renamed from: g */
    public void mo6375g() {
        recreate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.activity.cdj, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C2949g c2949g = C2949g.f17747k;
        if (c2949g.ld6()) {
            getWindow().setColorMode(1);
        }
        c2949g.m10467q(this);
        o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.m4317z(R.id.content, new C5441q());
        o1tVarKi.qrj();
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C2949g.f17747k.m10468s(this);
    }
}
