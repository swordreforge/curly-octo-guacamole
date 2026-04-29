package com.miui.privacypolicy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.miui.privacypolicy.C5321q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.miui.privacypolicy.y */
/* JADX INFO: compiled from: PrivacyQueryManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5323y {

    /* JADX INFO: renamed from: k */
    private static final String f29772k = "Privacy_QueryManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72478toq = "https://data.sec.miui.com/privacy/latestVersion";

    private C5323y() {
    }

    /* JADX INFO: renamed from: k */
    protected static int m18138k(Context context, String str, String str2) throws Throwable {
        if (System.currentTimeMillis() - x2.m18133n(context, str + "_privacy_query_time", 0L) < 86400000) {
            return -5;
        }
        x2.m18134p(context, str + "_privacy_query_time", System.currentTimeMillis());
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            str2 = context.getPackageName();
        }
        map.put("pkg", str2);
        map.put("policyName", str);
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e2) {
            Log.e(f29772k, "build jsonObject error, ", e2);
        }
        String strM18128y = C5321q.m18128y(map, f72478toq, C5321q.toq.POST, jSONObject);
        if (TextUtils.isEmpty(strM18128y)) {
            return -2;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strM18128y);
            int iOptInt = jSONObject2.optInt("code");
            String strOptString = jSONObject2.optString("message");
            if (iOptInt != 200 || !"success".equals(strOptString)) {
                return -3;
            }
            String strOptString2 = jSONObject2.optString("data");
            if (TextUtils.isEmpty(strOptString2)) {
                return -3;
            }
            zy.m18143s(strOptString2, context, "privacy_version", str);
            return 1;
        } catch (Exception e3) {
            Log.e(f29772k, "handlePrivacyAgreeTask error, ", e3);
            return -3;
        }
    }
}
