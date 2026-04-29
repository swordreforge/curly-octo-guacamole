package com.miui.privacypolicy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.miui.privacypolicy.C5321q;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.miui.privacypolicy.g */
/* JADX INFO: compiled from: PrivacyAgreeManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5317g {

    /* JADX INFO: renamed from: k */
    private static final String f29748k = "Privacy_AgreeManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72466toq = "https://data.sec.miui.com/privacy/agree/v1";

    private C5317g() {
    }

    /* JADX INFO: renamed from: k */
    protected static int m18120k(Context context, String str, String str2, String str3, String str4, String str5) throws Throwable {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str4)) {
            str4 = context.getPackageName();
        }
        map.put("pkg", str4);
        map.put("policyName", str);
        map.put("idContent", str2);
        map.put(com.android.thememanager.basemodule.analysis.toq.wh, C5321q.f29755g);
        if (TextUtils.isEmpty(str5)) {
            str5 = C5319n.m18121k(context);
        }
        map.put(com.android.thememanager.basemodule.analysis.toq.vymi, str5);
        String strF7l8 = zy.f7l8(context, "privacy_temp_update_version", str);
        if (TextUtils.isEmpty(strF7l8)) {
            strF7l8 = "";
        }
        map.put("policyVersion", strF7l8);
        map.put("language", Locale.getDefault().getLanguage());
        map.put("region", Locale.getDefault().getCountry());
        map.put("timestamp", str3);
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e2) {
            Log.e(f29748k, "build jsonObject error, ", e2);
        }
        String strM18128y = C5321q.m18128y(map, f72466toq, C5321q.toq.POST, jSONObject);
        if (TextUtils.isEmpty(strM18128y)) {
            zy.m18143s(jSONObject.toString(), context, "privacy_agree_error", str);
            return -2;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strM18128y);
            int iOptInt = jSONObject2.optInt("code");
            String strOptString = jSONObject2.optString("message");
            if (iOptInt == 200 && "success".equals(strOptString)) {
                String strOptString2 = new JSONObject(jSONObject2.optString("data")).optString("latestPolicyVersion");
                if (!TextUtils.isEmpty(strOptString2)) {
                    zy.m18143s(strOptString2, context, "privacy_version", str);
                    zy.m18142q(context, "privacy_agree_error", str);
                    zy.m18142q(context, "privacy_temp_update_version", str);
                    zy.m18142q(context, "privacy_update", str);
                    return 1;
                }
            }
        } catch (Exception e3) {
            Log.e(f29748k, "handlePrivacyAgreeTask error, ", e3);
        }
        zy.m18143s(jSONObject.toString(), context, "privacy_agree_error", str);
        return -3;
    }
}
