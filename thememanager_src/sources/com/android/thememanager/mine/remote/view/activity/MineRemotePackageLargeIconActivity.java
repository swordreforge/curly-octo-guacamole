package com.android.thememanager.mine.remote.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.mine.remote.view.fragment.C2189q;
import com.android.thememanager.mine.remote.widget.C2197k;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MineRemotePackageLargeIconActivity extends MineResourceTabActivity {

    /* JADX INFO: renamed from: d */
    public static final String f12838d = "single_largeicon_package";

    public static Intent sok(Context context, String resCode) {
        if (!"largeicons".equals(resCode)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MineRemotePackageLargeIconActivity.class);
        intent.putExtra("REQUEST_RESOURCE_CODE", resCode);
        return intent;
    }

    @Override // com.android.thememanager.mine.remote.view.activity.MineResourceTabActivity, com.android.thememanager.mine.remote.view.activity.zy
    protected void etdu() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("REQUEST_RESOURCE_CODE");
        if ("largeicons".equals(stringExtra)) {
            String stringExtra2 = intent.getStringExtra(f12838d);
            if (!p029m.zy.toq(stringExtra2)) {
                Bundle bundleYp31 = com.android.thememanager.mine.remote.view.fragment.zy.yp31(stringExtra, p001b.toq.f7221t);
                bundleYp31.putString(f12838d, stringExtra2);
                zsr0(MineResourceTabActivity.f60460bo, getString(R.string.mine_tab_title_purchase), C2189q.class, bundleYp31);
                return;
            }
        }
        super.etdu();
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        int i2 = 0;
        if (C2197k.m8288g(bf2.toq.toq(), C2197k.f12943s, "largeicons")) {
            List<Fragment> listFnq8 = getSupportFragmentManager().fnq8();
            if (listFnq8.size() > 0 && (listFnq8.get(0) instanceof C2189q) && ((C2189q) listFnq8.get(0)).z617()) {
                i2 = -1;
            }
        }
        setResult(i2);
        super.finish();
    }

    @Override // com.android.thememanager.mine.remote.view.activity.MineResourceTabActivity, com.android.thememanager.mine.remote.view.activity.zy, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wo();
    }
}
