package com.android.thememanager.module.detail.view;

import android.os.Bundle;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetListActivity extends AbstractActivityC1717k {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra("uuid");
        if (p029m.zy.toq(stringExtra2)) {
            finish();
            return;
        }
        String string = getString(R.string.theme_detail_widget_title);
        if (m6709b() != null) {
            if (p029m.zy.toq(stringExtra)) {
                m6709b().mo173v(string);
            } else {
                m6709b().mo173v(String.format("%s%s", stringExtra, string));
            }
        }
        if (savedInstanceState == null) {
            androidx.fragment.app.o1t o1tVarKi = getSupportFragmentManager().ki();
            nsb nsbVar = new nsb();
            Bundle bundle = new Bundle();
            bundle.putString("uuid", stringExtra2);
            nsbVar.setArguments(bundle);
            o1tVarKi.m4317z(android.R.id.content, nsbVar);
            o1tVarKi.qrj();
        }
    }
}
