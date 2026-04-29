package com.android.thememanager.settings;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import com.android.thememanager.R;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.superwallpaper.activity.UnitySuperWallpaperDetailActivity;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.uc;
import java.util.List;
import miuix.android.content.C6824k;
import miuix.appcompat.app.AbstractC6946k;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeAndWallpaperSettingActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: l */
    public static final int f14936l = 3;

    /* JADX INFO: renamed from: r */
    private Button f14937r;

    private void g1() {
        Intent intent = getIntent();
        if (intent == null || !C2656k.f15718s.equals(intent.getStringExtra("from"))) {
            return;
        }
        String stringExtra = intent.getStringExtra("package_name");
        String stringExtra2 = intent.getStringExtra(C2656k.f60937x2);
        String stringExtra3 = intent.getStringExtra("id");
        if ((TextUtils.isEmpty(stringExtra) ? false : zsr0(stringExtra, stringExtra3)) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        zsr0(stringExtra2, stringExtra3);
    }

    private void was() {
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        if (appCompatActionBar == null) {
            return;
        }
        appCompatActionBar.xwq3(R.string.wallpaper_settings_page_title);
    }

    private boolean zsr0(String packageName, String id) {
        Bundle bundle;
        Intent intent = new Intent("miui.service.wallpaper.SuperWallpaperService");
        intent.setPackage(packageName);
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(intent, 128);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0 || (bundle = listQueryIntentServices.get(0).serviceInfo.metaData) == null || !TextUtils.equals(bundle.getString("id"), id)) {
            return false;
        }
        UnitySuperWallpaperDetailActivity.r25n(this, bundle, packageName, 1);
        return true;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            finish();
            return;
        }
        if (resultCode == 114) {
            setResult(114, data);
            finish();
            return;
        }
        if (requestCode != 102 || data == null) {
            return;
        }
        if (getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false)) {
            com.android.thememanager.x2.f17856k.m10531k().mo8413q(data, this);
            return;
        }
        if (data.getType() != null && data.getType().startsWith("video")) {
            com.android.thememanager.v9.f7l8.fn3e(this, data.getDataString());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WallpaperDetailActivity.class);
        intent.setAction(uc.f16827n);
        intent.setData(data.getData());
        intent.putExtra(C6824k.e4e, "");
        startActivity(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-1025) & (-257));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if ("com.miui.aod".equals(getCallingPackage()) && getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) && getIntent().getIntExtra(com.android.thememanager.f7l8.f11607n, -1) == 0) {
            gc3c.ni7(this);
        }
        m6711e(savedInstanceState);
        C1802c.m7008k(getIntent());
        super.onCreate(savedInstanceState);
        was();
        com.android.thememanager.basemodule.utils.o1t.wvg(m6709b(), mo6344m());
        g1();
        this.f9864s = com.android.thememanager.basemodule.analysis.toq.nr0;
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.m6653p(this.f9864s, com.android.thememanager.basemodule.analysis.f7l8.m6607g()));
        if (savedInstanceState == null) {
            getSupportFragmentManager().ki().m4317z(android.R.id.content, new kja0()).qrj();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        if ("com.miui.aod".equals(getCallingPackage()) && getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) && !y9n.jk()) {
            finish();
        }
    }
}
