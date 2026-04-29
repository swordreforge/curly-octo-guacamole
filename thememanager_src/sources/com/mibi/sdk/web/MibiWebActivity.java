package com.mibi.sdk.web;

import a5id.C0002k;
import android.R;
import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mibi.sdk.common.C5032k;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.request.wvg;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import vy.C7718q;

/* JADX INFO: loaded from: classes3.dex */
public class MibiWebActivity extends Activity {
    private static int BACKGROUND_COLOR = Color.parseColor("#f0f0f0");
    private static int INFO_TEXT_COLOR = Color.parseColor("#bababa");
    private static int INFO_TEXT_SIZE = 11;
    private static final String MIBI_SDK_VERSION = "0.2";
    private static final String MIBI_WEB_INTERFACE = "MIBIPay";
    private static final int SHOW_WEBVIEW_DELAY = 500;
    private static final String TAG = "MibiWebActivity";
    private TextView mInfoText;
    private boolean mIsBacking;
    private LinearLayout mProgressContainer;
    private Intent mResultData;
    private WebView mWebView;
    private final String KEY_WEB_URL = "webUrl";
    private final String XIAOMI_ACCOUNT_TYPE = "com.xiaomi";
    private EnumC5035q mLoginState = EnumC5035q.LOAD_ING;
    private final AccountManagerCallback<Bundle> mAuthTokenCallBack = new zy();

    /* JADX INFO: renamed from: com.mibi.sdk.web.MibiWebActivity$k */
    class C5033k extends WebViewClient {

        /* JADX INFO: renamed from: com.mibi.sdk.web.MibiWebActivity$k$k */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MibiWebActivity.this.hideProgressView();
            }
        }

        C5033k() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (MibiWebActivity.this.mLoginState == EnumC5035q.LOGIN_FINISHING) {
                MibiWebActivity.this.mLoginState = EnumC5035q.LOGIN_FINISHED;
                MibiWebActivity.this.mWebView.postDelayed(new k(), 500L);
            } else if (MibiWebActivity.this.mLoginState == EnumC5035q.LOAD_ING) {
                MibiWebActivity.this.hideProgressView();
                MibiWebActivity.this.mLoginState = EnumC5035q.LOAD_FINISHED;
                MibiWebActivity.this.mIsBacking = false;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (MibiWebActivity.this.mLoginState == EnumC5035q.LOAD_ING) {
                MibiWebActivity.this.showProgressView();
            } else if (MibiWebActivity.this.mLoginState == EnumC5035q.LOGIN_ING) {
                MibiWebActivity.this.mLoginState = EnumC5035q.LOGIN_FINISHING;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (TextUtils.equals(str, "com.xiaomi")) {
                if (MibiWebActivity.this.mIsBacking) {
                    MibiWebActivity.this.finish();
                    return;
                }
                vy.zy zyVarM1k = C0002k.m1k();
                if (zyVarM1k == null) {
                    return;
                }
                MibiWebActivity.this.mLoginState = EnumC5035q.LOGIN_ING;
                Account[] accountArrZy = zyVarM1k.zy(str);
                if (accountArrZy.length == 0) {
                    return;
                }
                MibiWebActivity.this.showProgressView();
                String str4 = C5480k.f72647ld6 + str3;
                Account account = accountArrZy[0];
                MibiWebActivity mibiWebActivity = MibiWebActivity.this;
                zyVarM1k.toq(account, str4, null, mibiWebActivity, mibiWebActivity.mAuthTokenCallBack, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.mibi.sdk.web.MibiWebActivity$n */
    public class C5034n {
        public C5034n() {
        }

        @JavascriptInterface
        public void finish() {
            MibiWebActivity.this.finish();
        }

        @JavascriptInterface
        public void setResult(String str) {
            MibiWebActivity.this.setResult(str);
        }
    }

    /* JADX INFO: renamed from: com.mibi.sdk.web.MibiWebActivity$q */
    private enum EnumC5035q {
        LOAD_ING,
        LOGIN_ING,
        LOGIN_FINISHING,
        LOGIN_FINISHED,
        LOAD_FINISHED
    }

    class toq extends WebChromeClient {

        /* JADX INFO: renamed from: com.mibi.sdk.web.MibiWebActivity$toq$k */
        class DialogInterfaceOnClickListenerC5036k implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ JsResult f28580k;

            DialogInterfaceOnClickListenerC5036k(JsResult jsResult) {
                this.f28580k = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                this.f28580k.confirm();
            }
        }

        /* JADX INFO: renamed from: com.mibi.sdk.web.MibiWebActivity$toq$toq, reason: collision with other inner class name */
        class DialogInterfaceOnCancelListenerC8025toq implements DialogInterface.OnCancelListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ JsResult f28582k;

            DialogInterfaceOnCancelListenerC8025toq(JsResult jsResult) {
                this.f28582k = jsResult;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                this.f28582k.cancel();
            }
        }

        toq() {
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            super.onCloseWindow(webView);
            MibiWebActivity.this.finish();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MibiWebActivity.this);
            builder.setMessage(str2);
            builder.setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC5036k(jsResult));
            builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC8025toq(jsResult));
            builder.show();
            return true;
        }
    }

    class zy implements AccountManagerCallback<Bundle> {
        zy() {
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            try {
                String string = accountManagerFuture.getResult().getString("authtoken");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                MibiWebActivity.this.mWebView.loadUrl(string);
            } catch (Exception e2) {
                Log.e(MibiWebActivity.TAG, "load stsUrl failed", e2);
            }
        }
    }

    private Bundle convertJson2Map(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    bundle.putString(next, obj.toString());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
            return bundle;
        } catch (JSONException e2) {
            Log.e(TAG, "convertJson2Map failed", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressView() {
        this.mProgressContainer.setVisibility(8);
    }

    private void initView() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(BACKGROUND_COLOR);
        WebView webView = new WebView(this);
        this.mWebView = webView;
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        this.mProgressContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.mProgressContainer.setGravity(17);
        TextView textView = new TextView(this);
        textView.setTextSize(INFO_TEXT_SIZE);
        textView.setTextColor(INFO_TEXT_COLOR);
        textView.setText("Loading...");
        this.mProgressContainer.addView(new ProgressBar(this), new LinearLayout.LayoutParams(-2, -2));
        this.mProgressContainer.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(this.mProgressContainer, new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    private Intent makeResult(int i2, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("code", i2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("message", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent.putExtra("result", convertJson2Map(new JSONObject(str2)));
            } catch (JSONException unused) {
                Log.d(TAG, "result is not json");
                intent.putExtra("result", str2);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("message", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("result", str2);
            }
        } catch (JSONException unused2) {
        }
        intent.putExtra(C7718q.f44958t, jSONObject.toString());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(String str) {
        int i2;
        String strOptString;
        String strOptString2 = "user canceled";
        try {
            JSONObject jSONObject = new JSONObject(str);
            i2 = jSONObject.getInt("code");
            try {
                strOptString2 = jSONObject.optString("message");
                strOptString = jSONObject.optString("result");
            } catch (JSONException e2) {
                e = e2;
                Log.e(TAG, "setResult failed", e);
                strOptString = null;
            }
        } catch (JSONException e3) {
            e = e3;
            i2 = 0;
        }
        int i3 = i2 == 0 ? -1 : 0;
        Intent intentMakeResult = makeResult(i3, strOptString2, strOptString);
        this.mResultData = intentMakeResult;
        setResult(i3, intentMakeResult);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void setupWebView() {
        if (C5032k.f70898toq) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDefaultTextEncodingName(wvg.f72949toq);
        this.mWebView.addJavascriptInterface(new C5034n(), MIBI_WEB_INTERFACE);
        appendUA("XiaoMi/MiuiBrowser/4.3");
        appendUA("MibiSdk/0.2");
        appendUA("lg/" + C5032k.toq() + "_" + C5032k.m17526k());
        this.mWebView.setWebViewClient(new C5033k());
        this.mWebView.setWebChromeClient(new toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showProgressView() {
        this.mProgressContainer.setVisibility(0);
    }

    protected void appendUA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String userAgentString = this.mWebView.getSettings().getUserAgentString();
        this.mWebView.getSettings().setUserAgentString(userAgentString.trim() + " " + str.trim());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.mResultData == null) {
            Intent intentMakeResult = makeResult(0, "user canceled", null);
            this.mResultData = intentMakeResult;
            setResult(0, intentMakeResult);
        }
        if (this.mWebView.canGoBack()) {
            this.mWebView.goBack();
            this.mIsBacking = true;
        } else {
            super.onBackPressed();
            C0002k.toq(null);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setupWebView();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("webUrl");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.mWebView.loadUrl(stringExtra);
            } else {
                setResult(2, makeResult(2, "url is empty", null));
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mWebView.removeAllViews();
        this.mWebView.destroy();
    }
}
