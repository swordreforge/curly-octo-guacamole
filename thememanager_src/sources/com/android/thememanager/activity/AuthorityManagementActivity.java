package com.android.thememanager.activity;

import android.os.Bundle;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1807g;

/* JADX INFO: loaded from: classes.dex */
public class AuthorityManagementActivity extends AbstractActivityC1717k {
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return (C1807g.zurt() && C1807g.m7083t(this)) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mo6478v(getResources().getString(R.string.privacy_permission_management_description));
        androidx.fragment.app.o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.m4317z(android.R.id.content, new n7h());
        o1tVarKi.qrj();
    }
}
