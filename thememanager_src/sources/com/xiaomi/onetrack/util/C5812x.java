package com.xiaomi.onetrack.util;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.p013b.C5717e;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.x */
/* JADX INFO: loaded from: classes3.dex */
public class C5812x {

    /* JADX INFO: renamed from: A */
    private static final String f32465A = "/api/v4/detail/config_common";

    /* JADX INFO: renamed from: a */
    private static final String f32467a = "RegionDomainManager";

    /* JADX INFO: renamed from: b */
    private static final String f32468b = "CN";

    /* JADX INFO: renamed from: c */
    private static final String f32469c = "INTL";

    /* JADX INFO: renamed from: d */
    private static final String f32470d = "IN";

    /* JADX INFO: renamed from: e */
    private static final String f32471e = "RU";

    /* JADX INFO: renamed from: f */
    private static final String f32472f = "http://";

    /* JADX INFO: renamed from: g */
    private static final String f32473g = "https://";

    /* JADX INFO: renamed from: h */
    private static String f32474h = "";

    /* JADX INFO: renamed from: i */
    private static String f32475i = "";

    /* JADX INFO: renamed from: j */
    private static String f32476j = "";

    /* JADX INFO: renamed from: k */
    private static String f32477k = "";

    /* JADX INFO: renamed from: l */
    private static String f32478l = "";

    /* JADX INFO: renamed from: m */
    private static String f32479m = "";

    /* JADX INFO: renamed from: n */
    private static String f32480n = "";

    /* JADX INFO: renamed from: o */
    private static String f32481o = "";

    /* JADX INFO: renamed from: x */
    private static final String f32490x = "/track/v4";

    /* JADX INFO: renamed from: y */
    private static final String f32491y = "/track/key_get";

    /* JADX INFO: renamed from: z */
    private static final String f32492z = "/api/v4/detail/config";

    /* JADX INFO: renamed from: B */
    private Context f32493B;

    /* JADX INFO: renamed from: p */
    private static final byte[] f32482p = {116, 114, 97, 99, 107, 105, 110, 103, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: q */
    private static final byte[] f32483q = {116, 114, 97, 99, 107, 105, 110, 103, 46, 105, 110, 116, 108, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: r */
    private static final byte[] f32484r = {116, 114, 97, 99, 107, 105, 110, 103, 46, 114, 117, 115, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: s */
    private static final byte[] f32485s = {116, 114, 97, 99, 107, 105, 110, 103, 46, 105, 110, 100, 105, 97, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: t */
    private static final byte[] f32486t = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: u */
    private static final byte[] f32487u = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 105, 110, 116, 108, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: v */
    private static final byte[] f32488v = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 105, 110, 100, 105, 97, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: w */
    private static final byte[] f32489w = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 114, 117, 115, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* JADX INFO: renamed from: C */
    private static ConcurrentHashMap<String, String> f32466C = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.x$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private static final C5812x f32494a = new C5812x();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private String m20405a(byte[] bArr) {
        String str = "";
        try {
            String str2 = new String(bArr, "UTF-8");
            try {
                C5804p.m20342a(f32467a, "transmitToString host:" + str2);
                return str2;
            } catch (Exception e2) {
                e = e2;
                str = str2;
                C5804p.m20347b(f32467a, e.getMessage());
                return str;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m20406f() {
        f32474h = m20405a(f32482p);
        f32475i = m20405a(f32483q);
        f32476j = m20405a(f32484r);
        f32477k = m20405a(f32485s);
        f32478l = m20405a(f32486t);
        f32479m = m20405a(f32487u);
        f32480n = m20405a(f32488v);
        f32481o = m20405a(f32489w);
    }

    /* JADX INFO: renamed from: g */
    private void m20407g() {
        try {
            String strM20185h = aa.m20185h();
            if (TextUtils.isEmpty(strM20185h)) {
                return;
            }
            m20412a(new JSONObject(strM20185h));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    private String m20408h() {
        return f32473g;
    }

    /* JADX INFO: renamed from: i */
    private String m20409i() {
        return m20404a(C5805q.m20369h(), C5805q.m20370i());
    }

    /* JADX INFO: renamed from: j */
    private String m20410j() {
        boolean zM20369h = C5805q.m20369h();
        String strM20370i = C5805q.m20370i();
        return !zM20369h ? f32478l : TextUtils.equals(strM20370i, "IN") ? f32480n : TextUtils.equals(strM20370i, "RU") ? f32481o : f32479m;
    }

    /* JADX INFO: renamed from: b */
    public String m20413b() {
        try {
            if (TextUtils.isEmpty(aa.m20197l())) {
                C5717e.m19902b();
            }
        } catch (Exception e2) {
            C5804p.m20342a(f32467a, "getTrackingUrl: " + e2.toString());
        }
        return m20411a(m20408h(), m20409i(), f32490x);
    }

    /* JADX INFO: renamed from: c */
    public String m20414c() {
        return m20411a(m20408h(), m20410j(), f32492z);
    }

    /* JADX INFO: renamed from: d */
    public String m20415d() {
        return m20411a(m20408h(), m20410j(), f32465A);
    }

    /* JADX INFO: renamed from: e */
    public String m20416e() {
        return m20411a(m20408h(), m20409i(), f32491y);
    }

    private C5812x() {
        m20406f();
        f32466C.put("IN", f32477k);
        f32466C.put("RU", f32476j);
        m20407g();
    }

    /* JADX INFO: renamed from: a */
    public static C5812x m20403a() {
        return a.f32494a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m20412a(JSONObject jSONObject) {
        C5804p.m20342a(f32467a, "updateHostMap:" + jSONObject.toString());
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                    f32466C.put(next, strOptString);
                }
            }
            aa.m20163b(new JSONObject(f32466C).toString());
        } catch (Exception e2) {
            C5804p.m20342a(f32467a, "updateHostMap: " + e2.toString());
        }
        C5804p.m20342a(f32467a, "merge config:" + new JSONObject(f32466C).toString());
    }

    /* JADX INFO: renamed from: a */
    public String m20411a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: a */
    private String m20404a(boolean z2, String str) {
        if (!z2) {
            return f32474h;
        }
        String str2 = f32466C.get(str);
        return TextUtils.isEmpty(str2) ? f32475i : str2;
    }
}
