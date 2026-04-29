package com.xiaomi.onetrack.p013b;

import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5804p;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.c */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5715c implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JSONObject f31925a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5713a f31926b;

    RunnableC5715c(C5713a c5713a, JSONObject jSONObject) {
        this.f31926b = c5713a;
        this.f31925a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5804p.m20342a("AppConfigUpdater", "checkAppConfigVersion start");
        JSONArray jSONArrayOptJSONArray = this.f31925a.optJSONArray("config");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("appId");
                C5804p.m20342a("AppConfigUpdater", "appId: " + strOptString);
                if (!TextUtils.isEmpty(strOptString)) {
                    int iOptInt = jSONObjectOptJSONObject == null ? 0 : jSONObjectOptJSONObject.optInt("version");
                    int iM19927e = C5720h.m19910a().m19927e(strOptString);
                    boolean zM19893h = C5713a.m19893h(strOptString);
                    boolean z2 = C5713a.f31893A.containsKey(strOptString) && ((Boolean) C5713a.f31893A.get(strOptString)).booleanValue();
                    C5804p.m20342a("AppConfigUpdater", "local version: " + iM19927e + ", server version: " + iOptInt + ", canUpdate: " + zM19893h + ", isScheduling: " + z2);
                    if (iOptInt > 0 && iOptInt > iM19927e && zM19893h && !z2) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 0;
                        messageObtain.obj = strOptString;
                        long jRandom = (long) (Math.random() * 1800000.0d);
                        C5804p.m20342a("AppConfigUpdater", "the message will be handled after " + jRandom + " ms");
                        C5713a.f31920y.sendMessageDelayed(messageObtain, jRandom);
                        C5713a.f31893A.put(strOptString, Boolean.TRUE);
                    }
                }
            }
        }
    }
}
