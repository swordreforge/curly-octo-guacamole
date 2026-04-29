package com.android.thememanager.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.mine.local.view.fragment.LocalIconFragment;

/* JADX INFO: loaded from: classes.dex */
public class ThemeGateActivity extends kja0 implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: b */
    private static final String f8871b = "componentLocal";

    /* JADX INFO: renamed from: c */
    private static final String f8872c = "ThemeGateActivity";

    /* JADX INFO: renamed from: e */
    private static final String f8873e = "theme";

    /* JADX INFO: renamed from: j */
    private static final String f8874j = "/transfer";

    /* JADX INFO: renamed from: m */
    private static final String f8875m = "custom";

    /* JADX INFO: renamed from: o */
    private static final String f8876o = "path";

    private static class toq {

        /* JADX INFO: renamed from: k */
        public String f8877k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f57277toq;

        private toq() {
        }
    }

    private static toq cfr(Intent intent) {
        Uri data;
        toq toqVar = new toq();
        if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null && "theme".equals(data.getScheme()) && f8874j.equals(data.getPath())) {
            toqVar.f8877k = data.getQueryParameter("path");
            toqVar.f57277toq = data.getQueryParameter("category");
        }
        return toqVar;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toq toqVarCfr = cfr(getIntent());
        if (!TextUtils.isEmpty(toqVarCfr.f8877k) && !TextUtils.isEmpty(toqVarCfr.f57277toq)) {
            String str = toqVarCfr.f8877k;
            str.hashCode();
            if (str.equals(f8871b)) {
                String str2 = toqVarCfr.f57277toq;
                String strM5744q = p001b.toq.m5744q(str2);
                if (!TextUtils.isEmpty(strM5744q)) {
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("content", toqVarCfr.f8877k);
                    arrayMap.put("category", str2);
                    C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.mla, C1706p.ki(arrayMap));
                    Intent intent = new Intent();
                    com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(strM5744q);
                    intent.putExtra("REQUEST_RESOURCE_CODE", fu4VarM10535g.getResourceCode());
                    intent.setClassName(fu4VarM10535g.getTabActivityPackage(), fu4VarM10535g.getTabActivityClass());
                    Uri data = getIntent().getData();
                    if (data != null) {
                        if (data.getBooleanQueryParameter(f8875m, false)) {
                            intent.putExtra("category_type", 0);
                        }
                        if (data.getBooleanQueryParameter(LocalIconFragment.an, false)) {
                            intent.putExtra(LocalIconFragment.an, true);
                        }
                    }
                    String strM7242q = com.android.thememanager.basemodule.utils.x9kr.m7242q(getIntent(), com.android.thememanager.basemodule.utils.x9kr.f10438g, getIntent().getData(), null);
                    if (!TextUtils.isEmpty(strM7242q)) {
                        com.android.thememanager.basemodule.analysis.f7l8.toq(intent, strM7242q);
                    }
                    startActivity(intent);
                    finish();
                    return;
                }
            } else {
                Log.e(f8872c, "Transfer fail " + toqVarCfr.f8877k);
            }
        }
        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.tips_theme_gate_transfer_fail, 0);
        finish();
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return 0;
    }
}
