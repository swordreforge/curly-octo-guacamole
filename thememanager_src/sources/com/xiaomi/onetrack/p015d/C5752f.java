package com.xiaomi.onetrack.p015d;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p018g.C5765b;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5812x;
import com.xiaomi.onetrack.util.aa;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.d.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5752f {

    /* JADX INFO: renamed from: a */
    public static final JSONObject f32090a = new JSONObject();

    /* JADX INFO: renamed from: b */
    private static final String f32091b = "SecretKeyManager";

    /* JADX INFO: renamed from: c */
    private static final String f32092c = "secretKey";

    /* JADX INFO: renamed from: d */
    private static final String f32093d = "sid";

    /* JADX INFO: renamed from: e */
    private static final String f32094e = "key";

    /* JADX INFO: renamed from: f */
    private Context f32095f;

    /* JADX INFO: renamed from: g */
    private JSONObject f32096g;

    /* JADX INFO: renamed from: h */
    private String[] f32097h;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.d.f$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C5752f f32098a = new C5752f();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5752f m20039a() {
        return a.f32098a;
    }

    /* JADX INFO: renamed from: d */
    private void m20040d() {
        if (C5804p.f32410a) {
            if (TextUtils.isEmpty(this.f32097h[0]) || TextUtils.isEmpty(this.f32097h[1])) {
                C5804p.m20342a(f32091b, "key or sid is invalid!");
            } else {
                C5804p.m20342a(f32091b, "key  and sid is valid! ");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private JSONObject m20041e() {
        JSONObject jSONObjectM20042f = this.f32096g;
        if (jSONObjectM20042f == null && (jSONObjectM20042f = m20042f()) != null) {
            this.f32096g = jSONObjectM20042f;
        }
        return jSONObjectM20042f == null ? m20044c() : jSONObjectM20042f;
    }

    /* JADX INFO: renamed from: f */
    private JSONObject m20042f() {
        try {
            String strM20182g = aa.m20182g();
            if (TextUtils.isEmpty(strM20182g)) {
                return null;
            }
            return new JSONObject(C5748b.m20011b(this.f32095f, strM20182g));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String[] m20043b() {
        JSONObject jSONObjectM20041e = m20041e();
        this.f32097h[0] = jSONObjectM20041e != null ? jSONObjectM20041e.optString("key") : "";
        this.f32097h[1] = jSONObjectM20041e != null ? jSONObjectM20041e.optString(f32093d) : "";
        m20040d();
        return this.f32097h;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m20044c() {
        try {
        } catch (Exception e2) {
            C5804p.m20347b(f32091b, "requestSecretData: " + e2.toString());
        }
        if (C5805q.m20361a(f32091b)) {
            return f32090a;
        }
        byte[] bArrM19996a = C5747a.m19996a();
        String strM20012a = C5749c.m20012a(C5751e.m20036a(bArrM19996a));
        HashMap map = new HashMap();
        map.put(f32092c, strM20012a);
        String strM20107b = C5765b.m20107b(C5812x.m20403a().m20416e(), map, true);
        if (!TextUtils.isEmpty(strM20107b)) {
            JSONObject jSONObject = new JSONObject(strM20107b);
            int iOptInt = jSONObject.optInt("code");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (iOptInt == 0 && jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("key");
                String strOptString2 = jSONObjectOptJSONObject.optString(f32093d);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    String strM20012a2 = C5749c.m20012a(C5747a.m20001b(C5749c.m20014a(strOptString), bArrM19996a));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key", strM20012a2);
                    jSONObject2.put(f32093d, strOptString2);
                    this.f32096g = jSONObject2;
                    aa.m20156a(C5748b.m20006a(this.f32095f, jSONObject2.toString()));
                    aa.m20189i(System.currentTimeMillis());
                }
            }
        }
        return this.f32096g;
    }

    private C5752f() {
        this.f32096g = null;
        this.f32097h = new String[2];
        this.f32095f = C5756a.m20048a();
    }
}
