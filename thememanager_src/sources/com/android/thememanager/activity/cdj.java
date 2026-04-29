package com.android.thememanager.activity;

import android.os.Bundle;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: compiled from: BasePreferenceActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj extends bek6 {
    /* JADX INFO: renamed from: e */
    protected int mo6354e() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C1819o.nn86(this);
        com.android.thememanager.basemodule.utils.o1t.wvg(getAppCompatActionBar(), mo6354e());
        com.android.thememanager.basemodule.utils.o1t.fti(this, true);
    }
}
