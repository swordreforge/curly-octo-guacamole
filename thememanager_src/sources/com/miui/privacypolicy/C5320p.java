package com.miui.privacypolicy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.miui.privacypolicy.C5321q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.miui.privacypolicy.p */
/* JADX INFO: compiled from: PrivacyUpdateManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5320p {

    /* JADX INFO: renamed from: k */
    private static final String f29754k = "Privacy_UpdateManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72470toq = "https://data.sec.miui.com/privacy/get/v1";

    private C5320p() {
    }

    /* JADX INFO: renamed from: k */
    private static boolean m18122k(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.compareToIgnoreCase(str2) < 0;
    }

    protected static String toq(Context context, String str, String str2) throws Throwable {
        if (System.currentTimeMillis() - x2.m18133n(context.getApplicationContext(), str + "_privacy_update_time", 0L) < 86400000) {
            String strF7l8 = zy.f7l8(context, "privacy_version", str);
            String strF7l82 = zy.f7l8(context, "privacy_update", str);
            if (!TextUtils.isEmpty(strF7l82)) {
                try {
                    return m18122k(strF7l8, new JSONObject(strF7l82).optString("version")) ? strF7l82 : String.valueOf(-8);
                } catch (Exception e2) {
                    Log.e(f29754k, "handlePrivacyUpdateTask parse temp version error, ", e2);
                }
            }
            return String.valueOf(-5);
        }
        x2.m18134p(context.getApplicationContext(), str + "_privacy_update_time", System.currentTimeMillis());
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
        } catch (Exception e3) {
            Log.e(f29754k, "build jsonObject error, ", e3);
        }
        String strM18128y = C5321q.m18128y(map, f72470toq, C5321q.toq.POST, jSONObject);
        if (TextUtils.isEmpty(strM18128y)) {
            return String.valueOf(-2);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strM18128y);
            int iOptInt = jSONObject2.optInt("code");
            String strOptString = jSONObject2.optString("message");
            if (iOptInt == 200 && "success".equals(strOptString)) {
                String strOptString2 = jSONObject2.optString("data");
                String strOptString3 = new JSONObject(strOptString2).optString("version");
                if (!m18122k(zy.f7l8(context, "privacy_version", str), strOptString3)) {
                    return String.valueOf(-8);
                }
                zy.m18143s(strOptString2, context, "privacy_update", str);
                zy.m18143s(strOptString3, context, "privacy_temp_update_version", str);
                return strOptString2;
            }
        } catch (Exception e4) {
            Log.e(f29754k, "handlePrivacyRevokeTask error, ", e4);
        }
        return String.valueOf(-3);
    }
}
