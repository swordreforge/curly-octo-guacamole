package com.android.thememanager.author;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.author.fragment.C1667s;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: AuthorDetailActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthorDetailActivity extends ThemeTabActivity {
    @Override // com.android.thememanager.activity.ThemeTabActivity
    protected void n2t(@InterfaceC7395n Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String stringExtra = getIntent().getStringExtra(C1667s.f57400toq);
        String stringExtra2 = getIntent().getStringExtra("designerMiId");
        String stringExtra3 = getIntent().getStringExtra("designerId");
        int intExtra = getIntent().getIntExtra(C1669k.f57403toq, -1);
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString(C1667s.f57400toq, stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString("designerMiId", stringExtra2);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("designerId", stringExtra3);
        }
        if (intExtra != -1) {
            bundle.putInt(C1669k.f57403toq, intExtra);
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        m6709b().mcp();
    }

    @Override // com.android.thememanager.activity.t8r
    public void uj2j(@InterfaceC7395n View.OnClickListener onClickListener, int i2, int i3) {
    }
}
