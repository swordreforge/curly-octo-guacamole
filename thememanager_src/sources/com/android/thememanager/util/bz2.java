package com.android.thememanager.util;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.thememanager.ThemeResourceTabActivity;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1822q;
import com.android.thememanager.h5.jsinterface.C2065q;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: UserSurveyHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class bz2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f61203f7l8 = 200;

    /* JADX INFO: renamed from: g */
    public static final int f16340g = 2;

    /* JADX INFO: renamed from: p */
    private static final String f16341p = "yyyy-MM-dd";

    /* JADX INFO: renamed from: s */
    private static final String f16342s = "participate_survey_end_time";

    /* JADX INFO: renamed from: y */
    private static final String f16343y = "has_popup_survey_window";

    /* JADX INFO: renamed from: k */
    private ThemeResourceTabActivity f16344k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private WebView f61204toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Handler f61205zy;

    /* JADX INFO: renamed from: q */
    private boolean f16346q = false;

    /* JADX INFO: renamed from: n */
    private Config f16345n = C1724k.m6723p().f7l8();

    /* JADX INFO: renamed from: com.android.thememanager.util.bz2$k */
    /* JADX INFO: compiled from: UserSurveyHelper.java */
    class HandlerC2762k extends Handler {
        HandlerC2762k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            bz2.this.m9639p();
        }
    }

    public bz2(ThemeResourceTabActivity activity) {
        this.f16344k = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m9639p() {
        WebView webView = this.f61204toq;
        if (webView == null || !this.f16346q) {
            return;
        }
        webView.setVisibility(0);
        this.f61204toq.loadUrl("javascript:popupWindow()");
        Config config = this.f16345n;
        m9641y(config.research_satisfaction_url, config.research_satisfaction_period);
    }

    /* JADX INFO: renamed from: q */
    private boolean m9640q(Context context, String url) {
        return C1781k.toq(context) && !com.android.thememanager.basemodule.utils.zy.m7262k() && Locale.getDefault().getLanguage().startsWith("zh") && (!toq(url) || (toq(url) && !zy()));
    }

    private boolean toq(String url) {
        return PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getBoolean(f16343y + C1822q.zy(url), false);
    }

    /* JADX INFO: renamed from: y */
    private void m9641y(String url, int periodTime) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
        editorEdit.putBoolean(f16343y + C1822q.zy(url), true);
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, periodTime);
        editorEdit.putString(f16342s, new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
        editorEdit.commit();
    }

    private boolean zy() {
        String string = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getString(f16342s, "");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            return Calendar.getInstance().getTime().before(new SimpleDateFormat("yyyy-MM-dd").parse(string));
        } catch (ParseException unused) {
            return false;
        }
    }

    public void f7l8() {
        if (this.f61205zy == null || !com.android.thememanager.basemodule.utils.mcp.m7139n()) {
            return;
        }
        this.f61205zy.sendEmptyMessageDelayed(2, 200L);
    }

    /* JADX INFO: renamed from: g */
    public void m9642g() {
        Handler handler = this.f61205zy;
        if (handler != null) {
            handler.removeMessages(2);
            this.f61205zy = null;
        }
        WebView webView = this.f61204toq;
        if (webView != null) {
            if (webView.getParent() != null) {
                ((ViewGroup) this.f61204toq.getParent()).removeView(this.f61204toq);
            }
            this.f61204toq.destroy();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m9643n() {
        Config config = this.f16345n;
        if (config == null || TextUtils.isEmpty(config.research_satisfaction_url) || !m9640q(this.f16344k, this.f16345n.research_satisfaction_url)) {
            return;
        }
        String str = this.f16345n.research_satisfaction_url;
        C2065q c2065q = new C2065q(this);
        this.f61204toq = new WebView(this.f16344k);
        ((FrameLayout) this.f16344k.findViewById(R.id.content)).addView(this.f61204toq);
        this.f61204toq.setVisibility(4);
        WebSettings settings = this.f61204toq.getSettings();
        this.f61204toq.addJavascriptInterface(c2065q, C2065q.f60291toq);
        this.f61204toq.setOverScrollMode(2);
        this.f61204toq.setBackgroundColor(0);
        this.f61204toq.setLayerType(1, null);
        com.android.thememanager.basemodule.utils.a98o.m7002k(this.f61204toq);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setTextZoom(100);
        this.f61204toq.loadUrl(str);
        this.f61205zy = new HandlerC2762k();
    }

    /* JADX INFO: renamed from: s */
    public void m9644s(boolean loadComplete) {
        this.f16346q = loadComplete;
    }
}
