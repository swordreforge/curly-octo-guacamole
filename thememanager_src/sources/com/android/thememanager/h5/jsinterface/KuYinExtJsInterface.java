package com.android.thememanager.h5.jsinterface;

import android.app.Activity;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.utils.C1819o;
import java.util.Deque;
import java.util.LinkedList;
import miuix.hybrid.HybridView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class KuYinExtJsInterface {
    public static final String KUYIN_EXT_JS_INTERFACE = "KuYinExt";

    /* JADX INFO: renamed from: g */
    private static final String f12211g = "pname";

    /* JADX INFO: renamed from: n */
    private static final String f12212n = "pid";

    /* JADX INFO: renamed from: q */
    private static final String f12213q = "KuYinExtJsInterface";

    /* JADX INFO: renamed from: k */
    private final Activity f12214k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HybridView f60287toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Deque<String> f60288zy = new LinkedList();

    public KuYinExtJsInterface(Activity activity, HybridView webView) {
        this.f12214k = activity;
        this.f60287toq = webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void toq(String str) {
        if (this.f12214k.isFinishing()) {
            return;
        }
        C1819o.m7152e(this.f12214k, str);
        this.f60288zy.push(str);
    }

    @JavascriptInterface
    public String changePage(String rawParam) {
        try {
            final String string = new JSONObject(rawParam).getString(f12211g);
            this.f12214k.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.jsinterface.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12215k.toq(string);
                }
            });
            return null;
        } catch (JSONException e2) {
            Log.e(f12213q, "changeTitle error: " + e2);
            return null;
        }
    }

    @JavascriptInterface
    public String getExperimentalParameter() {
        if (!C1819o.eqxt(this.f12214k)) {
            return null;
        }
        Activity activity = this.f12214k;
        if (activity instanceof ThemeTabActivity) {
            return ((ThemeTabActivity) activity).wx16();
        }
        return null;
    }

    public boolean onBackPressed() {
        if (this.f60288zy.isEmpty()) {
            return false;
        }
        if (this.f60287toq.zy()) {
            this.f60288zy.pop();
        } else {
            this.f60288zy.clear();
        }
        this.f60287toq.x2("javascript:KY.ine.stopPlay()");
        if (this.f60288zy.isEmpty()) {
            return false;
        }
        C1819o.m7152e(this.f12214k, this.f60288zy.peek());
        this.f60287toq.m25770y();
        return true;
    }

    public void onPause() {
        if (this.f60288zy.isEmpty()) {
            return;
        }
        this.f60287toq.x2("javascript:KY.ine.stopPlay()");
    }

    @JavascriptInterface
    public void setRingResult(String result) {
        if (result == null) {
            Log.d(f12213q, "get subscription ring result is null");
        }
        Log.d(f12213q, "get subscription ring result");
        if (C1819o.eqxt(this.f12214k)) {
            Activity activity = this.f12214k;
            if (activity instanceof ThemeTabActivity) {
                ((ThemeTabActivity) activity).pjz9(result);
            }
        }
    }
}
