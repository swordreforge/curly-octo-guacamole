package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5695i {

    /* JADX INFO: renamed from: a */
    private static final String f31814a = "H5DataModel";

    /* JADX INFO: renamed from: b */
    private String f31815b;

    /* JADX INFO: renamed from: c */
    private long f31816c;

    /* JADX INFO: renamed from: d */
    private String f31817d;

    /* JADX INFO: renamed from: e */
    private String f31818e;

    /* JADX INFO: renamed from: f */
    private String f31819f;

    /* JADX INFO: renamed from: g */
    private String f31820g;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.api.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static String f31821a = "event";

        /* JADX INFO: renamed from: b */
        public static String f31822b = "session_id";

        /* JADX INFO: renamed from: c */
        public static String f31823c = "instance_id";

        /* JADX INFO: renamed from: d */
        public static String f31824d = "platform";

        /* JADX INFO: renamed from: e */
        public static String f31825e = "e_ts";

        /* JADX INFO: renamed from: f */
        public static String f31826f = "tz";

        /* JADX INFO: renamed from: g */
        public static String f31827g = "sdk_ver";

        /* JADX INFO: renamed from: h */
        public static String f31828h = "app_id";

        /* JADX INFO: renamed from: i */
        public static String f31829i = "channel";

        /* JADX INFO: renamed from: j */
        public static String f31830j = "uid";

        /* JADX INFO: renamed from: k */
        public static String f31831k = "uid_type";
    }

    public C5695i(JSONObject jSONObject) {
        this.f31815b = m19795a(jSONObject, a.f31821a);
        try {
            this.f31816c = Long.parseLong(m19795a(jSONObject, a.f31825e));
        } catch (Exception e2) {
            C5804p.m20347b(f31814a, "e_ts parse error: " + e2.getMessage());
        }
        this.f31817d = m19795a(jSONObject, a.f31828h);
        this.f31818e = m19795a(jSONObject, a.f31829i);
        this.f31819f = m19795a(jSONObject, a.f31830j);
        this.f31820g = m19795a(jSONObject, a.f31831k);
    }

    /* JADX INFO: renamed from: a */
    private String m19795a(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        return objOpt == null ? "" : String.valueOf(objOpt);
    }

    /* JADX INFO: renamed from: b */
    public long m19797b() {
        return this.f31816c;
    }

    /* JADX INFO: renamed from: c */
    public String m19798c() {
        return this.f31817d;
    }

    /* JADX INFO: renamed from: d */
    public String m19799d() {
        return this.f31818e;
    }

    /* JADX INFO: renamed from: e */
    public String m19800e() {
        return this.f31819f;
    }

    /* JADX INFO: renamed from: f */
    public String m19801f() {
        return this.f31820g;
    }

    public String toString() {
        return "H5DataModel{eventName='" + this.f31815b + "', e_ts=" + this.f31816c + ", appId='" + this.f31817d + "', channel='" + this.f31818e + "', uid='" + this.f31819f + "', uidType='" + this.f31820g + "'}";
    }

    /* JADX INFO: renamed from: a */
    public String m19796a() {
        return this.f31815b;
    }
}
