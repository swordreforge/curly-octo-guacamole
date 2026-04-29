package com.android.thememanager.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;

/* JADX INFO: loaded from: classes.dex */
public class TransparentActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: com.android.thememanager.activity.TransparentActivity$k */
    class C1557k implements C1781k.g {
        C1557k() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            TransparentActivity.this.setResult(com.android.thememanager.basemodule.privacy.x2.m6914n());
            TransparentActivity.this.finish();
        }
    }

    private void g1(Intent intent) {
        if (intent.getIntExtra(p001b.f7l8.iz, -1) != 1) {
            finish();
        } else {
            m6715x().m6909i(this, new C1557k());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g1(getIntent());
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 0) {
            finish();
        }
        return super.onTouchEvent(event);
    }
}
