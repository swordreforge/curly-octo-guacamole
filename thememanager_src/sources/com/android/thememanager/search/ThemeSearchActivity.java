package com.android.thememanager.search;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.view.fragment.C2355s;
import com.android.thememanager.recommend.view.fragment.C2356y;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.py;
import i1.C6077k;
import java.util.ArrayList;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeSearchActivity extends kja0 implements InterfaceC1357q {

    /* JADX INFO: renamed from: a */
    protected static final String f14628a = "list_fragment_tag";

    /* JADX INFO: renamed from: b */
    public static final int f14629b = 1;

    /* JADX INFO: renamed from: x */
    protected static final String f14630x = "hint_fragment_tag";

    /* JADX INFO: renamed from: c */
    protected C2484y f14631c;

    /* JADX INFO: renamed from: e */
    private C2356y f14632e;

    /* JADX INFO: renamed from: j */
    private boolean f14633j;

    /* JADX INFO: renamed from: m */
    private String f14634m;

    /* JADX INFO: renamed from: o */
    private boolean f14635o;

    /* JADX INFO: renamed from: com.android.thememanager.search.ThemeSearchActivity$k */
    class ViewOnClickListenerC2477k implements View.OnClickListener {
        ViewOnClickListenerC2477k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ThemeSearchActivity.this.onBackPressed();
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.android.thememanager.basemodule.base.toq f14637k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.android.thememanager.basemodule.base.toq f14639q;

        toq(final com.android.thememanager.basemodule.base.toq val$hide, final com.android.thememanager.basemodule.base.toq val$show) {
            this.f14637k = val$hide;
            this.f14639q = val$show;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14637k.nnh(false);
            this.f14639q.nnh(true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String cfr() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.search.ThemeSearchActivity.cfr():java.lang.String");
    }

    private void jbh(boolean showList, int anim) {
        FragmentManager supportFragmentManager;
        if (isFinishing() || (supportFragmentManager = getSupportFragmentManager()) == null || supportFragmentManager.r8s8()) {
            return;
        }
        o1t o1tVarKi = supportFragmentManager.ki();
        o1tVarKi.d3(anim, 0);
        com.android.thememanager.basemodule.base.toq toqVarZkd = zkd(o1tVarKi);
        C2355s c2355sSe = se(o1tVarKi);
        com.android.thememanager.basemodule.base.toq toqVar = showList ? c2355sSe : toqVarZkd;
        if (!showList) {
            toqVarZkd = c2355sSe;
        }
        o1tVarKi.fn3e(toqVar);
        o1tVarKi.x9kr(toqVarZkd);
        o1tVarKi.n7h();
        b3e(toqVar, toqVarZkd);
    }

    private String ktq() {
        String resourceCode = this.f9137r.getResourceCode();
        resourceCode.hashCode();
        switch (resourceCode) {
            case "ringtone":
            case "widget_suit":
            case "videowallpaper":
            case "aod":
            case "fonts":
            case "icons":
            case "theme":
            case "wallpaper":
            case "largeicons":
                return this.f9137r.getResourceCode();
            default:
                return "theme";
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.gjbz;
    }

    public void b3e(final com.android.thememanager.basemodule.base.toq hide, final com.android.thememanager.basemodule.base.toq show) {
        runOnUiThread(new toq(hide, show));
    }

    public void bek6(String hint) {
        this.f14631c.d2ok(hint);
    }

    public String bwp() {
        return getIntent().getStringExtra(InterfaceC1357q.f53941t8iq);
    }

    public C2484y bz2() {
        return this.f14631c;
    }

    public void cv06(String key) {
        this.f14634m = key;
    }

    public void h7am(boolean visible) {
        C2356y c2356y = this.f14632e;
        if (c2356y != null) {
            c2356y.hyow(visible);
        }
    }

    public void mbx(int anim) {
        jbh(true, anim);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 5001) {
            return;
        }
        if (requestCode != 1 || resultCode != -1) {
            if (data != null) {
                setResult(resultCode, data);
                finish();
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) data.getSerializableExtra("android.speech.extra.RESULTS");
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.f14631c.x9kr((String) arrayList.get(0), true);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String string;
        m6711e(savedInstanceState);
        py.m9954q(getIntent());
        super.onCreate(savedInstanceState);
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        appCompatActionBar.mo156e(16);
        appCompatActionBar.hb(true);
        appCompatActionBar.mo157f(R.layout.resource_search_action_bar_view);
        ImageView imageView = (ImageView) appCompatActionBar.kja0().findViewById(R.id.back_btn);
        if (com.android.thememanager.basemodule.utils.o1t.kja0()) {
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView.setImageResource(R.drawable.regular_back_gte_v12);
        }
        imageView.setOnClickListener(new ViewOnClickListenerC2477k());
        C1812k.m7106k(imageView, R.string.accessibiliy_description_content_back);
        C6077k.f7l8(imageView);
        EditText editText = (EditText) appCompatActionBar.kja0().findViewById(R.id.search_view);
        ImageView imageView2 = (ImageView) appCompatActionBar.kja0().findViewById(R.id.color_picker);
        ImageView imageView3 = (ImageView) appCompatActionBar.kja0().findViewById(R.id.xiaoai);
        ImageView imageView4 = (ImageView) appCompatActionBar.kja0().findViewById(R.id.clear);
        C1812k.m7106k(imageView4, R.string.resource_delete);
        C1812k.m7106k(imageView3, R.string.voice_input);
        C6077k.m22377z(editText, imageView3, imageView4);
        editText.requestFocus();
        this.f14635o = getIntent().getBooleanExtra(InterfaceC1357q.f53905lv5, false);
        this.f14634m = getIntent().getStringExtra(InterfaceC1357q.f53866eqxt);
        TextView textView = (TextView) appCompatActionBar.kja0().findViewById(R.id.filter_btn);
        C6077k.f7l8(textView);
        if (!TextUtils.isEmpty(this.f14634m)) {
            editText.setText(this.f14634m);
        }
        this.f14631c = z4(editText, imageView2, imageView3, imageView4, textView);
        if (!TextUtils.isEmpty(this.f14634m)) {
            yqrt();
        }
        if (TextUtils.isEmpty(this.f14634m)) {
            vep5(0);
        } else {
            mbx(0);
        }
        if (savedInstanceState != null && (string = savedInstanceState.getString(InterfaceC1357q.f53866eqxt)) != null) {
            this.f14631c.x9kr(string, false);
        }
        g1.mu(this, "ringtone");
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f14633j) {
            String stringExtra = intent.getStringExtra(InterfaceC1357q.f53866eqxt);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            this.f14631c.x9kr(stringExtra, false);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.f14634m;
        if (str != null) {
            outState.putString(InterfaceC1357q.f53866eqxt, str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        if (!hasFocus || this.f14633j) {
            return;
        }
        String stringExtra = getIntent().getStringExtra(InterfaceC1357q.f53866eqxt);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f14631c.x9kr(stringExtra, true);
        }
        this.f14633j = true;
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.resource_search_list_container;
    }

    protected C2355s se(o1t trans) {
        C2355s c2355s = (C2355s) getSupportFragmentManager().nmn5(f14630x);
        if (c2355s != null) {
            return c2355s;
        }
        C2355s c2355sOvdh = C2355s.ovdh(ktq(), true);
        trans.zy(R.id.container, c2355sOvdh, f14630x);
        return c2355sOvdh;
    }

    public boolean uj2j() {
        return this.f14635o;
    }

    public void vep5(int anim) {
        this.f14631c.d3(8);
        w831();
        jbh(false, anim);
    }

    public void w831() {
        C2356y c2356y = this.f14632e;
        if (c2356y != null) {
            c2356y.el();
        }
    }

    public void yqrt() {
        if ("videowallpaper".equals(this.f9137r.getResourceCode()) || "ringtone".equals(this.f9137r.getResourceCode())) {
            this.f14631c.d3(8);
        } else {
            this.f14631c.d3(0);
        }
    }

    protected C2484y z4(EditText searchView, ImageView colorPicker, ImageView xiaoai, ImageView clear, TextView filterTv) {
        return new C2484y(this, searchView, colorPicker, xiaoai, clear, this.f9137r, filterTv);
    }

    protected C2356y zkd(o1t trans) {
        C2356y c2356y = (C2356y) getSupportFragmentManager().nmn5(f14628a);
        this.f14632e = c2356y;
        if (c2356y == null) {
            C2356y c2356yG0ad = C2356y.g0ad(cfr(), this.f14634m, this.f9137r.getResourceCode());
            this.f14632e = c2356yG0ad;
            trans.zy(R.id.container, c2356yG0ad, f14628a);
        }
        this.f14632e.qh4d(this.f14634m);
        return this.f14632e;
    }
}
