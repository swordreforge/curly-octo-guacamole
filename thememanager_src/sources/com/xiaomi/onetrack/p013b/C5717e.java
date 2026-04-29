package com.xiaomi.onetrack.p013b;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import com.xiaomi.onetrack.BuildConfig;
import com.xiaomi.onetrack.p015d.C5750d;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p018g.C5765b;
import com.xiaomi.onetrack.p018g.C5766c;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5812x;
import com.xiaomi.onetrack.util.C5814z;
import com.xiaomi.onetrack.util.DeviceUtil;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.e */
/* JADX INFO: loaded from: classes3.dex */
public class C5717e {

    /* JADX INFO: renamed from: a */
    public static final String f31929a = "l";

    /* JADX INFO: renamed from: b */
    private static final String f31930b = "CommonConfigUpdater";

    /* JADX INFO: renamed from: c */
    private static final String f31931c = "t";

    /* JADX INFO: renamed from: d */
    private static final String f31932d = "levels";

    /* JADX INFO: renamed from: e */
    private static final String f31933e = "Android";

    /* JADX INFO: renamed from: f */
    private static ConcurrentHashMap<Integer, Integer> f31934f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private static final long f31935g = 172800000;

    /* JADX INFO: renamed from: a */
    public static void m19900a() {
        C5776i.m20256a(new RunnableC5718f());
    }

    /* JADX INFO: renamed from: b */
    public static void m19902b() {
        if (m19905e()) {
            m19906f();
        } else {
            C5804p.m20342a(f31930b, "CommonConfigUpdater Does not meet prerequisites for request");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map<Integer, Integer> m19903c() {
        try {
        } catch (Exception e2) {
            C5804p.m20342a(f31930b, "getLevelIntervalConfig: " + e2.toString());
        }
        if (!f31934f.isEmpty()) {
            return f31934f;
        }
        String strM20197l = aa.m20197l();
        if (!TextUtils.isEmpty(strM20197l)) {
            JSONArray jSONArrayOptJSONArray = new JSONObject(strM20197l).optJSONArray(f31932d);
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                int iOptInt = jSONObject.optInt(f31929a);
                int iOptInt2 = jSONObject.optInt("t");
                if (iOptInt > 0 && iOptInt2 > 0) {
                    f31934f.put(Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2));
                }
            }
        }
        return f31934f.isEmpty() ? m19907g() : f31934f;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m19905e() {
        if (!C5766c.m20110a()) {
            C5804p.m20347b(f31930b, "net is not connected!");
            return false;
        }
        if (TextUtils.isEmpty(aa.m20197l())) {
            return true;
        }
        long jM20191j = aa.m20191j();
        return jM20191j < System.currentTimeMillis() || jM20191j - System.currentTimeMillis() > f31935g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m19906f() {
        if (C5805q.m20361a(f31930b)) {
            return;
        }
        HashMap map = new HashMap();
        try {
            String strM20295a = C5783a.m20293a().m20295a(C5756a.m20053b());
            if (C5814z.m20421b(strM20295a)) {
                strM20295a = C5750d.m20025c(strM20295a);
            }
            map.put(C5725m.f31963a, strM20295a);
            map.put(C5725m.f31964b, C5805q.m20365d());
            map.put(C5725m.f31965c, C5805q.m20364c());
            map.put(C5725m.f31966d, C5805q.m20369h() ? "1" : "0");
            map.put(C5725m.f31967e, BuildConfig.SDK_VERSION);
            map.put(C5725m.f31975m, C5756a.m20055c());
            map.put(C5725m.f31968f, C5805q.m20366e());
            map.put(C5725m.f31969g, DeviceUtil.m20117b());
            map.put(C5725m.f31970h, C5805q.m20370i());
            map.put("platform", f31933e);
            String strM20415d = C5812x.m20403a().m20415d();
            String strM20107b = C5765b.m20107b(strM20415d, map, true);
            C5804p.m20342a(f31930b, "url:" + strM20415d + " response:" + strM20107b);
            m19901a(strM20107b);
        } catch (IOException e2) {
            C5804p.m20342a(f31930b, "requestCloudData: " + e2.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    private static HashMap<Integer, Integer> m19907g() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1000);
        map.put(2, Integer.valueOf(C5765b.f32179b));
        map.put(3, Integer.valueOf(C5658n.f73189x9kr));
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m19901a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") == 0) {
                String strOptString = jSONObject.optString("hash");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("regionUrl");
                    if (jSONObjectOptJSONObject2 != null) {
                        C5812x.m20403a().m20412a(jSONObjectOptJSONObject2);
                    }
                    aa.m20175d(jSONObjectOptJSONObject.toString());
                    aa.m20170c(strOptString);
                }
                aa.m20192j(System.currentTimeMillis() + 86400000 + ((long) new Random().nextInt(86400000)));
            }
        } catch (JSONException e2) {
            C5804p.m20342a(f31930b, "saveCommonCloudData: " + e2.toString());
        }
    }
}
