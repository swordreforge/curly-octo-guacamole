package com.xiaomi.accountsdk.account;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.n7h;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.lvui;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.g */
/* JADX INFO: compiled from: RegionConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5496g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72738f7l8 = "last_download_time";

    /* JADX INFO: renamed from: g */
    private static final String f30736g = "region_json";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final long f72739kja0 = 86400000;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f72740ld6 = "register.check.timeout";

    /* JADX INFO: renamed from: n */
    private static final String f30737n = "region_config_staging";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final long f72741n7h = 10000;

    /* JADX INFO: renamed from: p */
    private static final String f30738p = "client.update.interval";

    /* JADX INFO: renamed from: q */
    private static final String f30739q = "region_config";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f72742qrj = "region.codes";

    /* JADX INFO: renamed from: s */
    private static final String f30740s = "check_timeout";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f72743x2 = "register.domain";

    /* JADX INFO: renamed from: y */
    private static final String f30741y = "download_interval_time";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72744zy = "RegionConfig";

    /* JADX INFO: renamed from: k */
    private Context f30742k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private SharedPreferences f72745toq;

    public C5496g(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f30742k = applicationContext;
        this.f72745toq = applicationContext.getSharedPreferences(C5502s.f30772k ? f30737n : f30739q, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m18763g(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("Config");
            long j2 = jSONObject.getLong(f30738p) * 1000;
            this.f72745toq.edit().putLong(f72738f7l8, System.currentTimeMillis()).putLong(f30741y, j2).putLong(f30740s, jSONObject.getLong(f72740ld6) * 1000).putString(f30736g, str).commit();
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f72744zy, "JSON ERROR", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    private String m18764n() throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5555y c5555yM19001s = C5550t.m19001s(C5504y.f30799n + "/regionConfig", null, new com.xiaomi.accountsdk.utils.n7h().easyPut(C5550t.f72946zy, new com.xiaomi.accountsdk.hasheddeviceidlib.zy(this.f30742k).zy()).easyPut("_locale", lvui.m19105g(Locale.getDefault())), true);
        if (c5555yM19001s == null) {
            throw new n7h("result content is null");
        }
        String strM18811v = C5502s.m18811v(c5555yM19001s);
        try {
            JSONObject jSONObject = new JSONObject(strM18811v);
            if (jSONObject.getInt("code") == 0) {
                return jSONObject.getString("data");
            }
            throw new n7h(strM18811v.toString());
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f72744zy, "JSON ERROR", e2);
            throw new n7h(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m18765q(JSONArray jSONArray, String str) {
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (TextUtils.equals(jSONArray.optString(i2), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void zy() {
        long j2 = this.f72745toq.getLong(f72738f7l8, 0L);
        if (Math.abs(System.currentTimeMillis() - j2) < this.f72745toq.getLong(f30741y, 86400000L)) {
            AbstractC5574n.m19111k(f72744zy, "not download twice within interval time");
            return;
        }
        try {
            m18763g(m18764n());
        } catch (Exception e2) {
            AbstractC5574n.m19116z(f72744zy, "download region config failed", e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public Long m18766k() {
        zy();
        return Long.valueOf(this.f72745toq.getLong(f30740s, f72741n7h));
    }

    public String toq(String str) {
        JSONObject jSONObject;
        Iterator<String> itKeys;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        zy();
        String string = this.f72745toq.getString(f30736g, null);
        if (string == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(string);
            itKeys = jSONObject.keys();
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f72744zy, "JSON ERROR", e2);
        }
        while (itKeys.hasNext()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
            if (m18765q(jSONObject2.optJSONArray(f72742qrj), str.toString())) {
                return jSONObject2.getString(f72743x2);
            }
            return null;
        }
        return null;
    }
}
