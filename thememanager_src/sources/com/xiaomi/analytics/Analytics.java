package com.xiaomi.analytics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.analytics.LogEvent;
import com.xiaomi.analytics.internal.util.C5609k;
import com.xiaomi.analytics.internal.util.C5610n;
import com.xiaomi.analytics.internal.util.ld6;
import com.xiaomi.analytics.internal.util.toq;
import com.xiaomi.analytics.internal.v1.InterfaceC5615k;
import com.xiaomi.analytics.internal.zy;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Analytics {
    private static final String TAG = "Analytics";
    private static volatile Analytics sAnalytics = null;
    private static volatile boolean sIsBasicMode = false;
    private static volatile boolean sUpdateEnable = true;
    private Context mContext;
    private LoggerFactory<Tracker> sTrackerFactory = new LoggerFactory<>();

    private Analytics(Context context) {
        Context contextM19255k = toq.m19255k(context);
        this.mContext = contextM19255k;
        BaseLogger.init(contextM19255k);
        keepMethods();
        zy.fti(this.mContext);
        com.xiaomi.analytics.internal.toq.m19235k(this.mContext).toq();
        ld6.m19247k(this.mContext);
    }

    public static synchronized Analytics getInstance(Context context) {
        if (sAnalytics == null) {
            sAnalytics = new Analytics(context);
        }
        return sAnalytics;
    }

    public static boolean isBasicMode() {
        return sIsBasicMode;
    }

    private static boolean isPlatformSignature(Context context) {
        boolean qVar = C5610n.toq(toq.zy(context, context.getPackageName()));
        Log.d(C5609k.m19240k(TAG), String.format("%s is platform signatures : %b", context.getPackageName(), Boolean.valueOf(qVar)));
        return qVar;
    }

    private static boolean isSystemPackage(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || (applicationInfo.flags & 1) == 0) ? false : true;
    }

    public static boolean isUpdateEnable() {
        return sUpdateEnable;
    }

    private void keepMethods() {
        new Tracker("");
    }

    public static void setBasicMode(boolean z2) {
        sIsBasicMode = z2;
    }

    public static void setUpdateEnable(boolean z2) {
        sUpdateEnable = z2;
    }

    public static void setUseSystemAnalyticsOnly(Context context) {
        if (!com.xiaomi.analytics.internal.v1.zy.m19268h(context)) {
            Log.e(C5609k.m19240k(TAG), "system analytics is not exist.");
            return;
        }
        Log.d(C5609k.m19240k(TAG), "use system analytics only");
        zy.m19282o();
        setUpdateEnable(false);
    }

    public static void trackSystem(Context context, String str, Action action) throws Exception {
        if (!isSystemPackage(context) && !isPlatformSignature(context)) {
            throw new IllegalArgumentException("App is not allowed to use this method to track event, except system or platform signed apps. Use getTracker instead.");
        }
        Intent intent = new Intent();
        intent.setClassName("com.miui.analytics", "com.miui.analytics.EventService");
        if (str == null) {
            str = "";
        }
        intent.putExtra(InterfaceC1925p.qn, str);
        intent.putExtra("content", action.getContent().toString());
        intent.putExtra("extra", action.getExtra().toString());
        if (context.getApplicationContext() != null) {
            intent.putExtra("appid", context.getPackageName());
        }
        if (action instanceof AdAction) {
            intent.putExtra("type", LogEvent.LogType.TYPE_AD.value());
        } else {
            intent.putExtra("type", LogEvent.LogType.TYPE_EVENT.value());
        }
        context.startService(intent);
    }

    public void addJavascriptInterface(WebView webView, String str) {
        webView.addJavascriptInterface(this, str);
    }

    public void deleteAllEvents() {
        InterfaceC5615k interfaceC5615kMcp = zy.fti(this.mContext).mcp();
        if (interfaceC5615kMcp != null) {
            interfaceC5615kMcp.deleteAllEvents(this.mContext.getPackageName());
        }
    }

    public String getClientExtraSync(String str) throws TimeoutException {
        return getClientExtraSync(str, 5000);
    }

    public Tracker getTracker(String str) {
        return (Tracker) this.sTrackerFactory.getLogger(Tracker.class, str);
    }

    public void setDebugOn(boolean z2) {
        C5609k.f31199k = z2;
        InterfaceC5615k interfaceC5615kMcp = zy.fti(this.mContext).mcp();
        if (interfaceC5615kMcp != null) {
            interfaceC5615kMcp.setDebugOn(z2);
        }
    }

    public void setDontUseSystemAnalytics(boolean z2) {
        zy.fti(this.mContext).nn86(z2);
    }

    public void setPolicyConfiguration(PolicyConfiguration policyConfiguration) {
        zy.fti(this.mContext).m19291j(policyConfiguration);
    }

    @JavascriptInterface
    public void trackAdAction(String str, String str2, String str3) {
        try {
            AdAction adActionNewAdAction = Actions.newAdAction(str2);
            try {
                adActionNewAdAction.addContent(new JSONObject(str3));
            } catch (Exception unused) {
            }
            getTracker(str).track(adActionNewAdAction);
        } catch (Exception e2) {
            C5609k.m19241n(TAG, "JavascriptInterface trackAdAction exception:", e2);
        }
    }

    @JavascriptInterface
    public void trackCustomAction(String str, String str2) {
        try {
            CustomAction customActionNewCustomAction = Actions.newCustomAction();
            try {
                customActionNewCustomAction.addContent(new JSONObject(str2));
            } catch (Exception unused) {
            }
            getTracker(str).track(customActionNewCustomAction);
        } catch (Exception e2) {
            C5609k.m19241n(TAG, "JavascriptInterface trackCustomAction exception:", e2);
        }
    }

    @JavascriptInterface
    public void trackEventAction(String str, String str2, String str3) {
        try {
            EventAction eventActionNewEventAction = Actions.newEventAction(str2);
            try {
                eventActionNewEventAction.addContent(new JSONObject(str3));
            } catch (Exception unused) {
            }
            getTracker(str).track(eventActionNewEventAction);
        } catch (Exception e2) {
            C5609k.m19241n(TAG, "JavascriptInterface trackEventAction exception:", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r0.mo19266k(r4) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getClientExtraSync(final java.lang.String r4, final int r5) throws java.util.concurrent.TimeoutException {
        /*
            r3 = this;
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch: java.lang.Exception -> L2f
            com.xiaomi.analytics.Analytics$1 r1 = new com.xiaomi.analytics.Analytics$1     // Catch: java.lang.Exception -> L2f
            r1.<init>()     // Catch: java.lang.Exception -> L2f
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2f
            com.xiaomi.analytics.internal.util.qrj.m19254k(r0)     // Catch: java.lang.Exception -> L2f
            long r1 = (long) r5     // Catch: java.lang.Exception -> L2f
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L2f
            java.lang.Object r5 = r0.get(r1, r5)     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L2f
            android.content.Context r0 = r3.mContext     // Catch: java.lang.Exception -> L2f
            com.xiaomi.analytics.internal.zy r0 = com.xiaomi.analytics.internal.zy.fti(r0)     // Catch: java.lang.Exception -> L2f
            com.xiaomi.analytics.internal.v1.k r0 = r0.mcp()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L2e
            boolean r4 = r0.mo19266k(r4)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L2f
        L2e:
            return r5
        L2f:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.analytics.Analytics.getClientExtraSync(java.lang.String, int):java.lang.String");
    }

    @JavascriptInterface
    public void trackAdAction(String str, String str2, String str3, String str4) {
        try {
            AdAction adActionNewAdAction = Actions.newAdAction(str2, str3);
            try {
                adActionNewAdAction.addContent(new JSONObject(str4));
            } catch (Exception unused) {
            }
            getTracker(str).track(adActionNewAdAction);
        } catch (Exception e2) {
            C5609k.m19241n(TAG, "JavascriptInterface trackAdAction exception:", e2);
        }
    }

    @JavascriptInterface
    public void trackEventAction(String str, String str2, String str3, String str4) {
        try {
            EventAction eventActionNewEventAction = Actions.newEventAction(str2, str3);
            try {
                eventActionNewEventAction.addContent(new JSONObject(str4));
            } catch (Exception unused) {
            }
            getTracker(str).track(eventActionNewEventAction);
        } catch (Exception e2) {
            C5609k.m19241n(TAG, "JavascriptInterface trackEventAction exception:", e2);
        }
    }
}
