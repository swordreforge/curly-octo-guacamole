package com.miui.privacypolicy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.miui.privacypolicy.C5321q;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.miui.privacypolicy.s */
/* JADX INFO: compiled from: PrivacyRevokeManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5322s {

    /* JADX INFO: renamed from: k */
    private static final String f29764k = "Privacy_RevokeManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72474toq = "https://data.sec.miui.com/privacy/revoke/v1";

    private C5322s() {
    }

    /* JADX INFO: renamed from: k */
    protected static int m18130k(Context context, String str, String str2, String str3, String str4) throws Throwable {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str3)) {
            str3 = context.getPackageName();
        }
        map.put("pkg", str3);
        map.put("policyName", str);
        map.put("idContent", str2);
        map.put("idStatus", "1");
        map.put(com.android.thememanager.basemodule.analysis.toq.wh, C5321q.f29755g);
        if (TextUtils.isEmpty(str4)) {
            str4 = C5319n.m18121k(context);
        }
        map.put(com.android.thememanager.basemodule.analysis.toq.vymi, str4);
        String strF7l8 = zy.f7l8(context, "privacy_version", str);
        if (TextUtils.isEmpty(strF7l8)) {
            strF7l8 = "";
        }
        map.put("policyVersion", strF7l8);
        map.put("language", Locale.getDefault().getLanguage());
        map.put("region", Locale.getDefault().getCountry());
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e2) {
            Log.e(f29764k, "build jsonObject error, ", e2);
        }
        String strM18128y = C5321q.m18128y(map, f72474toq, C5321q.toq.POST, jSONObject);
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
            zy.m18142q(context, "privacy_version", str);
            zy.m18142q(context, "privacy_update", str);
            zy.m18142q(context, "privacy_temp_update_version", str);
            zy.m18142q(context, "privacy_agree_error", str);
            x2.m18132k(context);
            return 1;
        } catch (Exception e3) {
            Log.e(f29764k, "handlePrivacyRevokeTask error, ", e3);
            return -3;
        }
    }
}
