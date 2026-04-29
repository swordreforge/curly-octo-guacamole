package com.xiaomi.onetrack.p017f;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.BuildConfig;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.C5694h;
import com.xiaomi.onetrack.api.C5695i;
import com.xiaomi.onetrack.p013b.C5713a;
import com.xiaomi.onetrack.p018g.C5766c;
import com.xiaomi.onetrack.util.C5782o;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5810v;
import com.xiaomi.onetrack.util.C5814z;
import com.xiaomi.onetrack.util.DeviceUtil;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.ac;
import com.xiaomi.onetrack.util.oaid.C5783a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.f.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5757b {

    /* JADX INFO: renamed from: a */
    public static final int f32107a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f32108b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f32109c = 2;

    /* JADX INFO: renamed from: d */
    private static final String f32110d = "Event";

    /* JADX INFO: renamed from: e */
    private long f32111e;

    /* JADX INFO: renamed from: f */
    private String f32112f;

    /* JADX INFO: renamed from: g */
    private String f32113g;

    /* JADX INFO: renamed from: h */
    private String f32114h;

    /* JADX INFO: renamed from: i */
    private int f32115i;

    /* JADX INFO: renamed from: j */
    private JSONObject f32116j;

    /* JADX INFO: renamed from: k */
    private long f32117k;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.f.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private long f32118a;

        /* JADX INFO: renamed from: b */
        private String f32119b;

        /* JADX INFO: renamed from: c */
        private String f32120c;

        /* JADX INFO: renamed from: d */
        private String f32121d;

        /* JADX INFO: renamed from: e */
        private int f32122e;

        /* JADX INFO: renamed from: f */
        private JSONObject f32123f;

        /* JADX INFO: renamed from: g */
        private long f32124g;

        /* JADX INFO: renamed from: a */
        public a m20089a(long j2) {
            this.f32118a = this.f32118a;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m20094b(String str) {
            this.f32120c = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m20095c(String str) {
            this.f32121d = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m20090a(String str) {
            this.f32119b = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m20093b(long j2) {
            this.f32124g = j2;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m20088a(int i2) {
            this.f32122e = i2;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m20091a(JSONObject jSONObject) {
            this.f32123f = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C5757b m20092a() {
            return new C5757b(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.onetrack.f.b$b */
    public static class b {

        /* JADX INFO: renamed from: A */
        public static String f32125A = "sdk_mode";

        /* JADX INFO: renamed from: B */
        public static String f32126B = "ot_first_day";

        /* JADX INFO: renamed from: C */
        public static String f32127C = "ot_test_env";

        /* JADX INFO: renamed from: D */
        public static String f32128D = "ot_privacy_policy";

        /* JADX INFO: renamed from: E */
        public static String f32129E = "market_name";

        /* JADX INFO: renamed from: F */
        public static String f32130F = "ot_ad";

        /* JADX INFO: renamed from: G */
        public static String f32131G = "ot_basic_mode";

        /* JADX INFO: renamed from: H */
        public static String f32132H = "ot_ad_monitor";

        /* JADX INFO: renamed from: I */
        public static String f32133I = "ot_hybrid_type";

        /* JADX INFO: renamed from: a */
        public static String f32134a = "event";

        /* JADX INFO: renamed from: b */
        public static String f32135b = "imei";

        /* JADX INFO: renamed from: c */
        public static String f32136c = "oaid";

        /* JADX INFO: renamed from: d */
        public static String f32137d = "sn";

        /* JADX INFO: renamed from: e */
        public static String f32138e = "gaid";

        /* JADX INFO: renamed from: f */
        public static String f32139f = "android_id";

        /* JADX INFO: renamed from: g */
        public static String f32140g = "instance_id";

        /* JADX INFO: renamed from: h */
        public static String f32141h = "mfrs";

        /* JADX INFO: renamed from: i */
        public static String f32142i = "model";

        /* JADX INFO: renamed from: j */
        public static String f32143j = "platform";

        /* JADX INFO: renamed from: k */
        public static String f32144k = "miui";

        /* JADX INFO: renamed from: l */
        public static String f32145l = "build";

        /* JADX INFO: renamed from: m */
        public static String f32146m = "os_ver";

        /* JADX INFO: renamed from: n */
        public static String f32147n = "app_id";

        /* JADX INFO: renamed from: o */
        public static String f32148o = "app_ver";

        /* JADX INFO: renamed from: p */
        public static String f32149p = "pkg";

        /* JADX INFO: renamed from: q */
        public static String f32150q = "channel";

        /* JADX INFO: renamed from: r */
        public static String f32151r = "e_ts";

        /* JADX INFO: renamed from: s */
        public static String f32152s = "tz";

        /* JADX INFO: renamed from: t */
        public static String f32153t = "net";

        /* JADX INFO: renamed from: u */
        public static String f32154u = "region";

        /* JADX INFO: renamed from: v */
        public static String f32155v = "plugin_id";

        /* JADX INFO: renamed from: w */
        public static String f32156w = "sdk_ver";

        /* JADX INFO: renamed from: x */
        public static String f32157x = "uid";

        /* JADX INFO: renamed from: y */
        public static String f32158y = "uid_type";

        /* JADX INFO: renamed from: z */
        public static String f32159z = "sid";
    }

    /* JADX INFO: renamed from: a */
    public void m20067a(long j2) {
        this.f32111e = j2;
    }

    /* JADX INFO: renamed from: b */
    public long m20069b() {
        return this.f32111e;
    }

    /* JADX INFO: renamed from: c */
    public String m20073c() {
        return this.f32112f;
    }

    /* JADX INFO: renamed from: d */
    public String m20075d() {
        return this.f32113g;
    }

    /* JADX INFO: renamed from: e */
    public String m20076e() {
        return this.f32114h;
    }

    /* JADX INFO: renamed from: f */
    public int m20077f() {
        return this.f32115i;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m20078g() {
        return this.f32116j;
    }

    /* JADX INFO: renamed from: h */
    public long m20079h() {
        return this.f32117k;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20080i() {
        try {
            JSONObject jSONObject = this.f32116j;
            if (jSONObject == null || !jSONObject.has(C5694h.f31812b) || !this.f32116j.has("B") || TextUtils.isEmpty(this.f32112f)) {
                return false;
            }
            return !TextUtils.isEmpty(this.f32113g);
        } catch (Exception e2) {
            C5804p.m20348b(f32110d, "check event isValid error, ", e2);
            return false;
        }
    }

    public C5757b() {
    }

    /* JADX INFO: renamed from: a */
    public void m20068a(String str) {
        this.f32112f = str;
    }

    /* JADX INFO: renamed from: b */
    public void m20071b(String str) {
        this.f32113g = str;
    }

    /* JADX INFO: renamed from: c */
    public void m20074c(String str) {
        this.f32114h = str;
    }

    private C5757b(a aVar) {
        this.f32111e = aVar.f32118a;
        this.f32112f = aVar.f32119b;
        this.f32113g = aVar.f32120c;
        this.f32114h = aVar.f32121d;
        this.f32115i = aVar.f32122e;
        this.f32116j = aVar.f32123f;
        this.f32117k = aVar.f32124g;
    }

    /* JADX INFO: renamed from: a */
    public void m20066a(int i2) {
        this.f32115i = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m20072b(JSONObject jSONObject) {
        this.f32116j = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20061a(String str, Configuration configuration, OneTrack.IEventHook iEventHook, C5810v c5810v, boolean z2, boolean z3) throws JSONException {
        return m20062a(str, configuration, iEventHook, "", c5810v, z2, z3);
    }

    /* JADX INFO: renamed from: b */
    public void m20070b(long j2) {
        this.f32117k = j2;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20062a(String str, Configuration configuration, OneTrack.IEventHook iEventHook, String str2, C5810v c5810v, boolean z2, boolean z3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context contextM20053b = C5756a.m20053b();
        jSONObject.put(b.f32134a, str);
        boolean zM20065a = m20065a(z2);
        if (!zM20065a) {
            if (C5805q.m20359a() ? C5805q.m20369h() : configuration.isInternational()) {
                if (iEventHook != null && iEventHook.isRecommendEvent(str)) {
                    String strM20126e = DeviceUtil.m20126e(contextM20053b);
                    if (!TextUtils.isEmpty(strM20126e)) {
                        jSONObject.put(b.f32138e, strM20126e);
                    }
                }
            } else {
                jSONObject.put(b.f32135b, DeviceUtil.m20118b(contextM20053b));
                String strM20295a = C5783a.m20293a().m20295a(contextM20053b);
                jSONObject.put(b.f32136c, strM20295a);
                if (!C5814z.m20421b(strM20295a)) {
                    jSONObject.put(b.f32139f, DeviceUtil.m20137k(contextM20053b));
                }
            }
            jSONObject.put(b.f32140g, C5782o.m20286a().m20292b());
            m20064a(jSONObject, configuration, str2);
            m20063a(jSONObject, contextM20053b);
            jSONObject.put(b.f32159z, C5805q.m20367f());
        }
        jSONObject.put(b.f32141h, DeviceUtil.m20124d());
        jSONObject.put(b.f32142i, DeviceUtil.m20117b());
        jSONObject.put(b.f32143j, "Android");
        jSONObject.put(b.f32144k, C5805q.m20365d());
        jSONObject.put(b.f32145l, C5805q.m20364c());
        jSONObject.put(b.f32146m, C5805q.m20366e());
        jSONObject.put(b.f32148o, C5756a.m20055c());
        jSONObject.put(b.f32151r, System.currentTimeMillis());
        jSONObject.put(b.f32152s, C5805q.m20362b());
        jSONObject.put(b.f32153t, C5766c.m20109a(contextM20053b).toString());
        String strM20370i = C5805q.m20370i();
        C5713a.m19872a().m19898d(strM20370i);
        jSONObject.put(b.f32154u, strM20370i);
        jSONObject.put(b.f32156w, BuildConfig.SDK_VERSION);
        if (z3) {
            jSONObject.put(b.f32147n, configuration.getAdEventAppId());
        } else {
            jSONObject.put(b.f32147n, configuration.getAppId());
        }
        jSONObject.put(b.f32130F, z3);
        jSONObject.put(b.f32149p, C5756a.m20058e());
        jSONObject.put(b.f32150q, !TextUtils.isEmpty(configuration.getChannel()) ? configuration.getChannel() : "default");
        jSONObject.put(b.f32125A, (configuration.getMode() != null ? configuration.getMode() : OneTrack.Mode.APP).getType());
        jSONObject.put(b.f32126B, ac.m20227d(aa.m20147B()));
        if (C5804p.f32412c) {
            jSONObject.put(b.f32127C, true);
        }
        jSONObject.put(b.f32128D, c5810v.m20398a());
        jSONObject.put(b.f32129E, DeviceUtil.m20121c());
        jSONObject.put(b.f32131G, zM20065a);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20060a(C5695i c5695i, Configuration configuration, OneTrack.IEventHook iEventHook, C5810v c5810v, boolean z2, boolean z3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context contextM20053b = C5756a.m20053b();
        jSONObject.put(b.f32134a, c5695i.m19796a());
        boolean zM20065a = m20065a(z2);
        if (!zM20065a) {
            if (C5805q.m20359a() ? C5805q.m20369h() : configuration.isInternational()) {
                if (iEventHook != null && iEventHook.isRecommendEvent(c5695i.m19796a())) {
                    String strM20126e = DeviceUtil.m20126e(contextM20053b);
                    if (!TextUtils.isEmpty(strM20126e)) {
                        jSONObject.put(b.f32138e, strM20126e);
                    }
                }
            } else {
                jSONObject.put(b.f32135b, DeviceUtil.m20118b(contextM20053b));
                String strM20295a = C5783a.m20293a().m20295a(contextM20053b);
                jSONObject.put(b.f32136c, strM20295a);
                if (!C5814z.m20421b(strM20295a)) {
                    jSONObject.put(b.f32139f, DeviceUtil.m20137k(contextM20053b));
                }
            }
            jSONObject.put(b.f32140g, C5782o.m20286a().m20292b());
            jSONObject.put(b.f32155v, configuration.getPluginId());
            if (!TextUtils.isEmpty(c5695i.m19800e()) && !TextUtils.isEmpty(c5695i.m19801f())) {
                jSONObject.put(b.f32157x, c5695i.m19800e());
                jSONObject.put(b.f32158y, c5695i.m19801f());
            }
            jSONObject.put(b.f32159z, C5805q.m20367f());
        }
        jSONObject.put(b.f32130F, z3);
        jSONObject.put(b.f32141h, DeviceUtil.m20124d());
        jSONObject.put(b.f32142i, DeviceUtil.m20117b());
        jSONObject.put(b.f32143j, "Android");
        jSONObject.put(b.f32144k, C5805q.m20365d());
        jSONObject.put(b.f32145l, C5805q.m20364c());
        jSONObject.put(b.f32146m, C5805q.m20366e());
        jSONObject.put(b.f32148o, C5756a.m20055c());
        jSONObject.put(b.f32151r, c5695i.m19797b());
        jSONObject.put(b.f32152s, C5805q.m20362b());
        jSONObject.put(b.f32153t, C5766c.m20109a(contextM20053b).toString());
        jSONObject.put(b.f32154u, C5805q.m20370i());
        jSONObject.put(b.f32156w, BuildConfig.SDK_VERSION);
        jSONObject.put(b.f32147n, c5695i.m19798c());
        jSONObject.put(b.f32149p, C5756a.m20058e());
        jSONObject.put(b.f32150q, !TextUtils.isEmpty(c5695i.m19799d()) ? c5695i.m19799d() : "default");
        jSONObject.put(b.f32125A, (configuration.getMode() != null ? configuration.getMode() : OneTrack.Mode.APP).getType());
        jSONObject.put(b.f32126B, ac.m20227d(aa.m20147B()));
        if (C5804p.f32412c) {
            jSONObject.put(b.f32127C, true);
        }
        jSONObject.put(b.f32128D, c5810v.m20398a());
        jSONObject.put(b.f32129E, DeviceUtil.m20121c());
        jSONObject.put(b.f32131G, zM20065a);
        jSONObject.put(b.f32133I, "JS");
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static void m20063a(JSONObject jSONObject, Context context) throws JSONException {
        String strM20211u = aa.m20211u();
        String strM20213w = aa.m20213w();
        if (TextUtils.isEmpty(strM20211u) || TextUtils.isEmpty(strM20213w)) {
            return;
        }
        jSONObject.put(b.f32157x, strM20211u);
        jSONObject.put(b.f32158y, strM20213w);
    }

    /* JADX INFO: renamed from: a */
    private static void m20064a(JSONObject jSONObject, Configuration configuration, String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(b.f32155v, str);
        } else {
            jSONObject.put(b.f32155v, configuration.getPluginId());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20065a(boolean z2) {
        return OneTrack.getGlobalBasicModeEnable() == 0 ? z2 : OneTrack.getGlobalBasicModeEnable() != 1 && OneTrack.getGlobalBasicModeEnable() == 2;
    }
}
