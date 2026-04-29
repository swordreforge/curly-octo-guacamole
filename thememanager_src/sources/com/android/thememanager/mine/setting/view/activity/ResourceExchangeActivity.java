package com.android.thememanager.mine.setting.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.mine.setting.model.ResourceExchangeRequestInterface;
import com.google.gson.C4871g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import p001b.InterfaceC1357q;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceExchangeActivity extends AbstractActivityC1717k implements InterfaceC1357q {

    /* JADX INFO: renamed from: e */
    private static final String f12956e = "redeem_code";

    /* JADX INFO: renamed from: j */
    private static final String f12957j = "auto_redeem";

    /* JADX INFO: renamed from: o */
    private static final int f12958o = 10;

    /* JADX INFO: renamed from: c */
    private View f12959c;

    /* JADX INFO: renamed from: f */
    private Button f12960f;

    /* JADX INFO: renamed from: l */
    private Button f12961l;

    /* JADX INFO: renamed from: r */
    private EditText f12962r;

    private static class RedeemResult {
        String moduleId;

        private RedeemResult() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.activity.ResourceExchangeActivity$k */
    class ViewOnClickListenerC2200k implements View.OnClickListener {
        ViewOnClickListenerC2200k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ResourceExchangeActivity.this.g1();
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ResourceExchangeActivity.this.finish();
        }
    }

    private static class zy implements InterfaceC7648q<CommonResponse<Object>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<ResourceExchangeActivity> f12965k;

        /* JADX INFO: renamed from: q */
        private String f12966q;

        public zy(ResourceExchangeActivity activity, String code) {
            this.f12965k = new WeakReference<>(activity);
            this.f12966q = code;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(retrofit2.toq<CommonResponse<Object>> call, Throwable t2) {
            ResourceExchangeActivity resourceExchangeActivity = this.f12965k.get();
            if (resourceExchangeActivity == null) {
                return;
            }
            resourceExchangeActivity.i9jn();
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(retrofit2.toq<CommonResponse<Object>> call, C7639i<CommonResponse<Object>> response) {
            ResourceExchangeActivity resourceExchangeActivity = this.f12965k.get();
            if (resourceExchangeActivity == null) {
                return;
            }
            resourceExchangeActivity.r8s8(response, this.f12966q);
        }
    }

    private void v0af() {
        View view = this.f12959c;
        if (view != null) {
            view.setVisibility(0);
        }
        Button button = this.f12961l;
        if (button != null) {
            button.setEnabled(false);
        }
        Button button2 = this.f12960f;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        EditText editText = this.f12962r;
        if (editText != null) {
            editText.setEnabled(false);
        }
    }

    private void was() {
        View view = this.f12959c;
        if (view != null) {
            view.setVisibility(8);
        }
        Button button = this.f12961l;
        if (button != null) {
            button.setEnabled(true);
        }
        Button button2 = this.f12960f;
        if (button2 != null) {
            button2.setEnabled(true);
        }
        EditText editText = this.f12962r;
        if (editText != null) {
            editText.setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zsr0(int r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r2 == r0) goto L38
            switch(r2) {
                case 1001: goto L30;
                case 1002: goto L28;
                case 1003: goto L20;
                case 1004: goto L18;
                case 1005: goto L10;
                case 1006: goto L8;
                default: goto L7;
            }
        L7:
            goto L3f
        L8:
            r2 = 2131887394(0x7f120522, float:1.9409394E38)
            java.lang.String r3 = r1.getString(r2)
            goto L46
        L10:
            r2 = 2131887396(0x7f120524, float:1.9409398E38)
            java.lang.String r3 = r1.getString(r2)
            goto L46
        L18:
            r2 = 2131887405(0x7f12052d, float:1.9409416E38)
            java.lang.String r3 = r1.getString(r2)
            goto L46
        L20:
            r2 = 2131887397(0x7f120525, float:1.94094E38)
            java.lang.String r3 = r1.getString(r2)
            goto L46
        L28:
            r2 = 2131887398(0x7f120526, float:1.9409402E38)
            java.lang.String r3 = r1.getString(r2)
            goto L46
        L30:
            r2 = 2131887409(0x7f120531, float:1.9409424E38)
            java.lang.String r3 = r1.getString(r2)
            goto L46
        L38:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3f
            goto L46
        L3f:
            r2 = 2131887527(0x7f1205a7, float:1.9409664E38)
            java.lang.String r3 = r1.getString(r2)
        L46:
            r2 = 0
            com.android.thememanager.basemodule.utils.nn86.toq(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.mine.setting.view.activity.ResourceExchangeActivity.zsr0(int, java.lang.String):void");
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.cin;
    }

    protected void g1() {
        String string = this.f12962r.getText().toString();
        if (TextUtils.isEmpty(string)) {
            nn86.m7150k(R.string.resource_exchange_empty_format, 0);
            return;
        }
        if (string.length() < 10) {
            nn86.m7150k(R.string.resource_exchange_wrong_format_by_local, 0);
        } else if (!mcp.m7139n()) {
            nn86.m7150k(R.string.online_no_network, 0);
        } else {
            v0af();
            ((ResourceExchangeRequestInterface) f7l8.m6882h().toq(ResourceExchangeRequestInterface.class)).checkRedeemCode(string).mo27954p(new zy(this, string));
        }
    }

    public void i9jn() {
        was();
        zsr0(-1, null);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        C1802c.m7008k(getIntent());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me_resource_exchange);
        this.f12962r = (EditText) findViewById(R.id.edit);
        this.f12961l = (Button) findViewById(R.id.exchangeBtn);
        this.f12960f = (Button) findViewById(R.id.cancelBtn);
        this.f12959c = findViewById(R.id.loading);
        C6077k.m22377z(this.f12962r, this.f12961l, this.f12960f);
        String stringExtra = getIntent().getStringExtra("redeem_code");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f12962r.setText(stringExtra);
            EditText editText = this.f12962r;
            editText.setSelection(editText.length());
        }
        this.f12961l.setOnClickListener(new ViewOnClickListenerC2200k());
        if (!TextUtils.isEmpty(stringExtra) && getIntent().getBooleanExtra(f12957j, false)) {
            this.f12961l.performClick();
        }
        this.f12960f.setOnClickListener(new toq());
    }

    public void r8s8(C7639i<CommonResponse<Object>> response, String code) {
        was();
        if (!com.android.thememanager.basemodule.network.theme.toq.m6892k(response)) {
            if (response == null || response.m27986k() == null) {
                return;
            }
            zsr0(response.m27986k().apiCode, response.m27986k().apiMessage);
            return;
        }
        C4871g c4871g = new C4871g();
        Intent intentKi = com.android.thememanager.toq.ki(this, null, ((RedeemResult) c4871g.n7h(c4871g.o1t(response.m27986k().apiData), RedeemResult.class)).moduleId, null, null, Boolean.FALSE, null);
        intentKi.putExtra("redeem_code", code);
        startActivity(intentKi);
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById(R.id.edit).getWindowToken(), 0);
    }
}
