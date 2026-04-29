package com.android.thememanager.module.detail.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import androidx.lifecycle.C0924e;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.controller.online.t8r;
import com.miui.maml.widget.edit.MamlDownloadStatusKt;
import mub.InterfaceC7395n;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: WidgetPurchaseActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetPurchaseActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: r */
    private com.android.thememanager.module.detail.presenter.ki f13210r;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.WidgetPurchaseActivity$k */
    /* JADX INFO: compiled from: WidgetPurchaseActivity.kt */
    public static final class C2254k implements t8r.f7l8 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f60548toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ ArrayMap<String, Object> f60549zy;

        C2254k(String str, ArrayMap<String, Object> arrayMap) {
            this.f60548toq = str;
            this.f60549zy = arrayMap;
        }

        @Override // com.android.thememanager.controller.online.t8r.f7l8
        /* JADX INFO: renamed from: q */
        public void mo6370q(int i2, int i3, @InterfaceC7395n String str) {
            Intent intent = new Intent();
            intent.putExtra("errorType", i2);
            intent.putExtra("errorCode", i3);
            if (str != null) {
                intent.putExtra(MamlDownloadStatusKt.EXTRA_ERROR_MSG, str);
            }
            WidgetPurchaseActivity.this.setResult(2, intent);
            WidgetPurchaseActivity.this.finish();
        }

        @Override // com.android.thememanager.controller.online.t8r.f7l8
        public void toq() {
            WidgetPurchaseActivity.this.setResult(-1);
            C1708s.f7l8().ld6().d2ok(C1706p.n7h("", this.f60548toq, this.f60549zy));
            WidgetPurchaseActivity.this.finish();
        }
    }

    public final void g1() {
        String stringExtra = getIntent().getStringExtra("widget_id");
        boolean booleanExtra = getIntent().getBooleanExtra("auto_buy", false);
        String stringExtra2 = getIntent().getStringExtra(InterfaceC1357q.f53923nnh);
        if (!booleanExtra || stringExtra == null) {
            Log.w("WidgetPurchaseActivity", "onCreate auto_buy:" + booleanExtra + ",suit_id:" + stringExtra);
            finish();
            return;
        }
        if (com.android.thememanager.basemodule.utils.o1t.fu4()) {
            setResult(-64);
            return;
        }
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        kotlin.jvm.internal.d2ok.qrj(arrayMapM6679k);
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.dxr2, stringExtra2);
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.ip4r, com.android.thememanager.basemodule.analysis.toq.rka);
        C2254k c2254k = new C2254k(stringExtra, arrayMapM6679k);
        com.android.thememanager.module.detail.presenter.ki kiVar = this.f13210r;
        if (kiVar == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
            kiVar = null;
        }
        new com.android.thememanager.controller.online.t8r(this, c2254k, kiVar).fu4(stringExtra, "widget", t8r.EnumC1934g.SINGLE);
        C1708s.f7l8().ld6().mo6671p(C1706p.n7h("", stringExtra, arrayMapM6679k));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, @InterfaceC7395n Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 111) {
            if (i3 != -1) {
                setResult(2);
                finish();
                return;
            }
            com.android.thememanager.module.detail.presenter.ki kiVar = this.f13210r;
            if (kiVar == null) {
                kotlin.jvm.internal.d2ok.n5r1("mViewModel");
                kiVar = null;
            }
            kiVar.bek6(intent != null ? intent.getStringExtra("result") : null);
            g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@InterfaceC7395n Bundle bundle) {
        super.onCreate(bundle);
        m6711e(bundle);
        this.f13210r = (com.android.thememanager.module.detail.presenter.ki) new C0924e(this).m4420k(com.android.thememanager.module.detail.presenter.ki.class);
        g1();
    }
}
