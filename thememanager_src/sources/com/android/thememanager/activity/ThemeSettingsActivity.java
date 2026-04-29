package com.android.thememanager.activity;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.search.ThemeSearchActivity;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.settings.ViewOnClickListenerC2517i;
import miui.app.constants.ThemeManagerConstants;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes.dex */
public class ThemeSettingsActivity extends kja0 implements ThemeManagerConstants, InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: c */
    private p000a.zy f8878c = new C1552k();

    /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeSettingsActivity$k */
    class C1552k implements p000a.zy {
        C1552k() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ThemeSettingsActivity.this, false);
            }
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.kaf;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.analysis.f7l8.InterfaceC1696k
    /* JADX INFO: renamed from: f */
    public String mo6320f() {
        return "settings";
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        i9jn();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        com.android.thememanager.util.py.m9954q(getIntent());
        ThemeSchedulerService.m8899g();
        Intent intent = getIntent();
        intent.putExtra("REQUEST_RESOURCE_CODE", "theme");
        intent.putExtra(InterfaceC1357q.f53959wo, true);
        super.onCreate(savedInstanceState);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.o1t o1tVarKi = supportFragmentManager.ki();
        ViewOnClickListenerC2517i viewOnClickListenerC2517iPnt2 = ViewOnClickListenerC2517i.pnt2(com.android.thememanager.settingssearch.toq.f61048zy.equals(intent.getStringExtra(com.android.thememanager.settingssearch.toq.f15977k)));
        o1tVarKi.m4317z(R.id.content, viewOnClickListenerC2517iPnt2);
        o1tVarKi.qrj();
        supportFragmentManager.a98o();
        viewOnClickListenerC2517iPnt2.nnh(true);
        com.android.thememanager.basemodule.analysis.zy.m6679k().put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.m6653p(com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.f7l8.m6607g()));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        Intent intent = new Intent(this, (Class<?>) ThemeSearchActivity.class);
        Intent intent2 = new Intent();
        intent2.setAction(ThemeResourceProxyTabActivity.bl);
        intent2.setPackage(bf2.toq.toq().getPackageName());
        intent2.putExtra("EXTRA_TAB_ID", "theme");
        startActivities(new Intent[]{intent2, intent});
        return true;
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return 0;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    public boolean t8iq() {
        return true;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected void y2(int newMode) {
        super.y2(newMode);
        if (newMode == 1) {
            com.android.thememanager.basemodule.utils.lvui.m7131s(this, this.f8878c);
        }
    }
}
