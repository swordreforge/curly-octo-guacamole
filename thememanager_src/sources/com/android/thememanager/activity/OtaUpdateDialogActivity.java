package com.android.thememanager.activity;

import android.os.Bundle;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import ek5k.C6002g;

/* JADX INFO: loaded from: classes.dex */
public class OtaUpdateDialogActivity extends bek6 {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        new com.android.thememanager.util.yz().lvui();
        new com.android.thememanager.util.a98o(this).executeOnExecutor(C6002g.ld6(), new Void[0]);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.hw));
    }
}
