package com.android.thememanager.activity;

import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.thememanager.C2475s;
import com.android.thememanager.R;
import com.theme.loopwallpaper.view.C5449k;
import miuix.appcompat.app.ki;

/* JADX INFO: loaded from: classes.dex */
public class ThemeAboutActivity extends kja0 implements com.market.sdk.fti, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private static final String f8857a = "xiaomitheme";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f57276bo = "com.tencent.mm.ui.LauncherUI";

    /* JADX INFO: renamed from: u */
    private static final String f8859u = "com.tencent.mm";

    /* JADX INFO: renamed from: v */
    private static final String f8860v = "https://beian.miit.gov.cn";

    /* JADX INFO: renamed from: x */
    private static final String f8862x = "http://weibo.com/xiaomitheme";

    /* JADX INFO: renamed from: b */
    private miuix.appcompat.app.ki f8863b;

    /* JADX INFO: renamed from: c */
    private int f8864c = -1;

    /* JADX INFO: renamed from: e */
    private C5449k f8865e;

    /* JADX INFO: renamed from: j */
    private C5449k f8866j;

    /* JADX INFO: renamed from: m */
    private ImageView f8867m;

    /* JADX INFO: renamed from: o */
    private C5449k f8868o;

    /* JADX INFO: renamed from: d */
    private static final Float f8858d = Float.valueOf(17.0f);

    /* JADX INFO: renamed from: w */
    private static final Float f8861w = Float.valueOf(14.0f);

    /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeAboutActivity$k */
    class DialogInterfaceOnClickListenerC1550k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1550k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
        }
    }

    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ThemeAboutActivity.this.z4();
        }
    }

    private void bwp() {
        if (this.f8863b == null) {
            ((ClipboardManager) getSystemService("clipboard")).setText(f8857a);
            this.f8863b = new ki.C6947k(this).m25050z(getResources().getString(R.string.goto_wechat, f8857a)).dd(R.string.ad_download_open, new toq()).mcp(R.string.miuishare_account_login_cancel, new DialogInterfaceOnClickListenerC1550k()).m25037g();
        }
        if (this.f8863b.isShowing()) {
            return;
        }
        this.f8863b.show();
    }

    private void bz2() {
        int color = getResources().getColor(R.color.theme_about_title_text_color);
        int color2 = getResources().getColor(R.color.theme_about_summary_text_color);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.theme_about_arrow_margin_end);
        this.f8867m = (ImageView) findViewById(R.id.new_message);
        C5449k c5449k = new C5449k(findViewById(R.id.upgrade));
        this.f8865e = c5449k;
        c5449k.m18559k();
        this.f8865e.m18561p(R.string.version_update);
        this.f8865e.m18558g(R.string.already_latest_version);
        C5449k c5449k2 = this.f8865e;
        Float f2 = f8858d;
        c5449k2.qrj(f2.floatValue());
        this.f8865e.m18563s(f8861w.floatValue());
        this.f8865e.ld6(color);
        this.f8865e.m18564y(color2);
        this.f8865e.zy(dimensionPixelSize);
        this.f8865e.x2(dimensionPixelSize);
        this.f8865e.m18562q(R.drawable.theme_about_arrow);
        this.f8865e.f30410k.setOnClickListener(this);
        C5449k c5449k3 = new C5449k(findViewById(R.id.weibo));
        this.f8866j = c5449k3;
        c5449k3.m18559k();
        this.f8866j.m18561p(R.string.weibo);
        this.f8866j.qrj(f2.floatValue());
        this.f8866j.ld6(color);
        this.f8866j.m18564y(color2);
        this.f8866j.zy(dimensionPixelSize);
        this.f8866j.x2(dimensionPixelSize);
        this.f8866j.m18562q(R.drawable.theme_about_arrow);
        this.f8866j.f30410k.setOnClickListener(this);
        C5449k c5449k4 = new C5449k(findViewById(R.id.official_accounts));
        this.f8868o = c5449k4;
        c5449k4.m18559k();
        this.f8868o.m18561p(R.string.official_accounts);
        this.f8868o.qrj(f2.floatValue());
        this.f8868o.ld6(color);
        this.f8868o.m18564y(color2);
        this.f8868o.zy(dimensionPixelSize);
        this.f8868o.x2(dimensionPixelSize);
        this.f8868o.m18562q(R.drawable.theme_about_arrow);
        this.f8868o.f30410k.setOnClickListener(this);
        ((TextView) findViewById(R.id.current_version)).setText(getResources().getString(R.string.current_version, C2475s.f14620g));
        TextView textView = (TextView) findViewById(R.id.tv_icp);
        textView.setOnClickListener(this);
        if (com.android.thememanager.basemodule.utils.y9n.m7258z()) {
            ((RelativeLayout.LayoutParams) textView.getLayoutParams()).bottomMargin += com.android.thememanager.basemodule.utils.y9n.cdj(this);
        }
    }

    private void se() {
        if (this.f8864c == 0) {
            com.android.thememanager.v9.f7l8.m10164h(this, bf2.toq.toq().getPackageName(), true);
        } else {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.already_latest_version, 0);
        }
    }

    private void w831() {
        com.market.sdk.a9.m17288p(false);
        com.market.sdk.a9.m17293z(this);
        com.market.sdk.a9.jk(false);
    }

    private void yqrt() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f8860v)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            ComponentName componentName = new ComponentName("com.tencent.mm", f57276bo);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.addFlags(268435456);
            intent.setComponent(componentName);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.wechat_not_found, 0);
        }
    }

    private void zkd() {
        startActivity(com.android.thememanager.basemodule.utils.x9kr.zy(f8862x));
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        com.market.sdk.a9.m17293z(null);
    }

    @Override // com.market.sdk.fti
    public void lrht(int i2, com.market.sdk.mcp updateResponse) {
        this.f8864c = i2;
        if (i2 == 0) {
            this.f8867m.setVisibility(0);
            this.f8865e.m18558g(R.string.check_has_new_version);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        switch (v2.getId()) {
            case R.id.official_accounts /* 2131428424 */:
                bwp();
                break;
            case R.id.tv_icp /* 2131429009 */:
                yqrt();
                break;
            case R.id.upgrade /* 2131429027 */:
                se();
                break;
            case R.id.weibo /* 2131429116 */:
                zkd();
                break;
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.android.thememanager.basemodule.utils.o1t.wvg(m6709b(), mo6344m());
        bz2();
        w831();
        this.f8865e.kja0(false);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        com.market.sdk.a9.m17293z(null);
        miuix.appcompat.app.ki kiVar = this.f8863b;
        if (kiVar != null && kiVar.isShowing()) {
            this.f8863b.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.activity_theme_about;
    }
}
