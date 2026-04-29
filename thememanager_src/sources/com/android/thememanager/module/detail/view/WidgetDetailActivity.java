package com.android.thememanager.module.detail.view;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import miuix.appcompat.app.AbstractC6946k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;
import y2.C7776k;

/* JADX INFO: compiled from: WidgetDetailActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetDetailActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: r */
    @InterfaceC7396q
    private final String f13209r = "WidgetDetailActivity";

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, @InterfaceC7395n Intent intent) {
        Fragment fragmentNmn5;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 111 && (fragmentNmn5 = getSupportFragmentManager().nmn5("widget")) != null && (fragmentNmn5 instanceof y9n)) {
            ((y9n) fragmentNmn5).onActivityResult(i2, i3, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@InterfaceC7395n Bundle bundle) {
        super.onCreate(bundle);
        m6711e(bundle);
        com.android.thememanager.util.py.m9954q(getIntent());
        AbstractC6946k abstractC6946kM6709b = m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.mo173v(" ");
        }
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(InterfaceC1357q.f53951v5yj);
            if (stringExtra == null) {
                Log.w(this.f13209r, "widget_suit_id id is null");
                finish();
                return;
            }
            Cdo cdo = new Cdo();
            Bundle bundle2 = new Bundle();
            bundle2.putString("online_id", stringExtra);
            bundle2.putString(y9n.f13388v, getIntent().getStringExtra(y9n.f13388v));
            bundle2.putBoolean(jz5.f13283q, getIntent().getBooleanExtra(jz5.f13283q, false));
            cdo.setArguments(bundle2);
            getSupportFragmentManager().ki().o1t(R.id.content, cdo, "widget").qrj();
        }
        C7776k.m28157y().f7l8(this);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C7776k.m28157y().kja0(this);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    @InterfaceC7396q
    public String yz() {
        return com.android.thememanager.basemodule.analysis.toq.zuh;
    }
}
