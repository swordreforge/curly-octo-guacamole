package com.xiaomi.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.analytics.internal.util.C5609k;
import com.xiaomi.analytics.internal.util.kja0;
import com.xiaomi.analytics.internal.util.toq;
import com.xiaomi.analytics.internal.v1.InterfaceC5615k;
import com.xiaomi.analytics.internal.zy;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
class BaseLogger {
    private static final String TAG = "BaseLogger";
    private static volatile InterfaceC5615k sAnalytics;
    private static String sAppId;
    private static Context sContext;
    private String mConfigKey;
    private String mSession = "";
    private static ConcurrentLinkedQueue<PendingUnit> sPendingActions = new ConcurrentLinkedQueue<>();
    private static zy.InterfaceC5617g mOnPreparedListener = new zy.InterfaceC5617g() { // from class: com.xiaomi.analytics.BaseLogger.1
        @Override // com.xiaomi.analytics.internal.zy.InterfaceC5617g
        public void onSdkCorePrepared(InterfaceC5615k interfaceC5615k) {
            InterfaceC5615k unused = BaseLogger.sAnalytics = interfaceC5615k;
            BaseLogger.drainPendingEvents();
        }
    };

    private static class PendingUnit {
        String mAppId;
        String mConfigKey;
        LogEvent mEvent;
        boolean mIsBasicMode;
        String mSessionId;

        public PendingUnit(String str, String str2, String str3, LogEvent logEvent, boolean z2) {
            this.mConfigKey = str2;
            this.mSessionId = str3;
            this.mEvent = logEvent;
            this.mAppId = str;
            this.mIsBasicMode = z2;
        }
    }

    BaseLogger(String str) {
        this.mConfigKey = "";
        if (sContext == null) {
            throw new IllegalStateException("Do you forget to do Logger.init ?");
        }
        this.mConfigKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void drainPendingEvents() {
        if (sPendingActions.size() <= 0 || sAnalytics == null) {
            return;
        }
        C5609k.toq(TAG, "drainPendingEvents ");
        ArrayList arrayList = new ArrayList();
        while (sPendingActions.size() > 0) {
            PendingUnit pendingUnitPoll = sPendingActions.poll();
            arrayList.add(pendingUnitPoll.mEvent.pack(pendingUnitPoll.mAppId, pendingUnitPoll.mConfigKey, pendingUnitPoll.mSessionId, pendingUnitPoll.mIsBasicMode));
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            ArrayList arrayList2 = new ArrayList();
            while (arrayList2.size() < 100 && i2 < arrayList.size()) {
                arrayList2.add(arrayList.get(i2));
                i2++;
            }
            C5609k.toq(TAG, "trackEvents " + arrayList2.size());
            sAnalytics.trackEvents((String[]) kja0.zy(arrayList2, String.class));
        }
    }

    static synchronized void init(Context context) {
        Context contextM19255k = toq.m19255k(context);
        sContext = contextM19255k;
        String packageName = contextM19255k.getPackageName();
        sAppId = packageName;
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("Context is not a application context.");
        }
        zy.fti(sContext).hb(mOnPreparedListener);
    }

    public void endSession() {
        this.mSession = "";
    }

    protected void log(LogEvent logEvent) {
        C5609k.toq(TAG, "log start. sAppId: " + sAppId);
        if (logEvent != null) {
            sAnalytics = zy.fti(sContext).mcp();
            zy.fti(sContext).m19290c();
            StringBuilder sb = new StringBuilder();
            sb.append("sAnalytics is null ? ");
            sb.append(sAnalytics == null);
            C5609k.toq(TAG, sb.toString());
            if (sAnalytics == null) {
                sPendingActions.offer(new PendingUnit(sAppId, this.mConfigKey, this.mSession, logEvent, Analytics.isBasicMode()));
                return;
            }
            String strPack = logEvent.pack(sAppId, this.mConfigKey, this.mSession, Analytics.isBasicMode());
            C5609k.toq(TAG, "log data : " + strPack);
            sAnalytics.trackEvent(strPack);
        }
    }

    public void startSession() {
        this.mSession = UUID.randomUUID().toString();
        C5609k.toq(TAG, "startSession " + this.mSession);
    }

    protected void log(String str, LogEvent logEvent) {
        C5609k.toq(TAG, "log start. appId: " + str);
        if (logEvent == null || TextUtils.isEmpty(str)) {
            return;
        }
        sAnalytics = zy.fti(sContext).mcp();
        zy.fti(sContext).m19290c();
        StringBuilder sb = new StringBuilder();
        sb.append("sAnalytics is null ? ");
        sb.append(sAnalytics == null);
        C5609k.toq(TAG, sb.toString());
        if (sAnalytics != null) {
            String strPack = logEvent.pack(str, this.mConfigKey, this.mSession, Analytics.isBasicMode());
            C5609k.toq(TAG, "log data : " + strPack);
            sAnalytics.trackEvent(strPack);
            return;
        }
        sPendingActions.offer(new PendingUnit(str, this.mConfigKey, this.mSession, logEvent, Analytics.isBasicMode()));
    }
}
