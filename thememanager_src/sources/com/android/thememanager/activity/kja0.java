package com.android.thememanager.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1807g;
import miuix.android.content.C6824k;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: BaseActivity.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class kja0 extends AbstractActivityC1717k implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: f */
    protected int f9135f;

    /* JADX INFO: renamed from: l */
    protected int f9136l;

    /* JADX INFO: renamed from: r */
    protected com.android.thememanager.fu4 f9137r;

    private void g1(Intent intent) {
    }

    private Intent was(Fragment fragment, Intent intent) {
        if (!intent.getBooleanExtra(com.android.thememanager.basemodule.utils.x9kr.f57818toq, false)) {
            com.android.thememanager.fu4 fu4Var = this.f9137r;
            if (fragment instanceof C1582h) {
                fu4Var = ((C1582h) fragment).f9059l;
            }
            com.android.thememanager.util.ch.hb(fu4Var, intent);
        }
        g1(intent);
        zsr0(intent);
        return intent;
    }

    private void zsr0(Intent intent) {
        ComponentName component = intent.getComponent();
        if (intent.getStringExtra(C6824k.e4e) != null || component == null) {
            return;
        }
        if (TextUtils.equals(component.getClassName(), this.f9137r.getDetailActivityClass())) {
            if ("wallpaper".equals(this.f9137r.getResourceCode())) {
                return;
            }
            if (intent.getIntExtra(InterfaceC1357q.f53965y2, 0) == 2) {
                intent.putExtra(C6824k.e4e, getString(R.string.resource_detail_window_title, this.f9137r.getResourceTitle()));
                return;
            } else {
                if (intent.getIntExtra(InterfaceC1357q.f53965y2, 0) == 1) {
                    intent.putExtra(C6824k.e4e, "");
                    return;
                }
                return;
            }
        }
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            intent.putExtra(C6824k.e4e, "");
            return;
        }
        String stringExtra = intent.getStringExtra(InterfaceC1357q.f53866eqxt);
        if (TextUtils.isEmpty(stringExtra)) {
            intent.putExtra(C6824k.e4e, "");
        } else {
            intent.putExtra(C6824k.e4e, stringExtra);
        }
    }

    public com.android.thememanager.fu4 etdu() {
        return this.f9137r;
    }

    protected void i9jn() {
        if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(null, new int[]{android.R.attr.activityCloseEnterAnimation, android.R.attr.activityCloseExitAnimation}, android.R.attr.windowAnimationStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return;
        }
        overridePendingTransition(resourceId, resourceId2);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i2;
        try {
            super.onBackPressed();
        } catch (Exception unused) {
            finish();
        }
        int i3 = this.f9136l;
        if (i3 <= 0 || (i2 = this.f9135f) <= 0) {
            return;
        }
        overridePendingTransition(i3, i2);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int iR8s8 = r8s8();
        if (iR8s8 != 0) {
            setContentView(iR8s8);
        }
        this.f9136l = getIntent().getIntExtra(InterfaceC1357q.f53847bek6, -1);
        this.f9135f = getIntent().getIntExtra(InterfaceC1357q.f53856cv06, -1);
        sok();
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 82) {
            return super.onKeyDown(keyCode, event);
        }
        Intent intent = new Intent();
        if (C1807g.m7081r()) {
            intent.setClassName(this, "com.android.thememanager.activity.PadThemePreferenceActivity");
        } else {
            intent.setClass(this, ThemePreferenceActivity.class);
        }
        startActivity(intent);
        return true;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    public void qkj8(Fragment fragment, Intent[] intents) {
        for (Intent intent : intents) {
            was(fragment, intent);
        }
        if (fragment != null) {
            super.qkj8(fragment, intents);
        } else {
            super.startActivities(intents);
        }
    }

    protected abstract int r8s8();

    protected void sok() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        if (this.f9137r == null) {
            this.f9137r = C2082k.zy().m8001n().toq(getIntent());
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intents) {
        qkj8(null, intents);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (!intent.getBooleanExtra(com.android.thememanager.basemodule.utils.x9kr.f57818toq, false)) {
            com.android.thememanager.util.ch.hb(v0af(), intent);
        }
        g1(intent);
        zsr0(intent);
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        was(fragment, intent);
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    protected com.android.thememanager.fu4 v0af() {
        return this.f9137r;
    }
}
