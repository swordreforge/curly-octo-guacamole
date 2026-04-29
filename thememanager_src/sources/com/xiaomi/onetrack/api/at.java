package com.xiaomi.onetrack.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class at {

    /* JADX INFO: renamed from: a */
    public static final String f31707a = "name";

    /* JADX INFO: renamed from: b */
    public static final String f31708b = "gender";

    /* JADX INFO: renamed from: c */
    public static final String f31709c = "birthday";

    /* JADX INFO: renamed from: d */
    public static final String f31710d = "phone";

    /* JADX INFO: renamed from: e */
    public static final String f31711e = "job";

    /* JADX INFO: renamed from: f */
    public static final String f31712f = "hobby";

    /* JADX INFO: renamed from: g */
    public static final String f31713g = "region";

    /* JADX INFO: renamed from: h */
    public static final String f31714h = "province";

    /* JADX INFO: renamed from: i */
    public static final String f31715i = "city";

    /* JADX INFO: renamed from: j */
    private String f31716j;

    /* JADX INFO: renamed from: k */
    private String f31717k;

    /* JADX INFO: renamed from: l */
    private String f31718l;

    /* JADX INFO: renamed from: m */
    private String f31719m;

    /* JADX INFO: renamed from: n */
    private String f31720n;

    /* JADX INFO: renamed from: o */
    private String f31721o;

    /* JADX INFO: renamed from: p */
    private String f31722p;

    /* JADX INFO: renamed from: q */
    private String f31723q;

    /* JADX INFO: renamed from: r */
    private String f31724r;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.api.at$a */
    public static final class C5687a {

        /* JADX INFO: renamed from: a */
        private String f31725a;

        /* JADX INFO: renamed from: b */
        private String f31726b;

        /* JADX INFO: renamed from: c */
        private String f31727c;

        /* JADX INFO: renamed from: d */
        private String f31728d;

        /* JADX INFO: renamed from: e */
        private String f31729e;

        /* JADX INFO: renamed from: f */
        private String f31730f;

        /* JADX INFO: renamed from: g */
        private String f31731g;

        /* JADX INFO: renamed from: h */
        private String f31732h;

        /* JADX INFO: renamed from: i */
        private String f31733i;

        /* JADX INFO: renamed from: a */
        public C5687a m19753a(String str) {
            this.f31725a = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C5687a m19755b(String str) {
            this.f31726b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C5687a m19756c(String str) {
            this.f31727c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C5687a m19757d(String str) {
            this.f31728d = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C5687a m19758e(String str) {
            this.f31729e = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C5687a m19759f(String str) {
            this.f31730f = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C5687a m19760g(String str) {
            this.f31731g = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5687a m19761h(String str) {
            this.f31732h = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C5687a m19762i(String str) {
            this.f31733i = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public at m19754a() {
            at atVar = new at();
            atVar.f31721o = this.f31730f;
            atVar.f31720n = this.f31729e;
            atVar.f31724r = this.f31733i;
            atVar.f31719m = this.f31728d;
            atVar.f31723q = this.f31732h;
            atVar.f31718l = this.f31727c;
            atVar.f31716j = this.f31725a;
            atVar.f31722p = this.f31731g;
            atVar.f31717k = this.f31726b;
            return atVar;
        }
    }

    /* JADX INFO: renamed from: j */
    public JSONObject m19752j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f31716j);
            jSONObject.put(f31708b, this.f31717k);
            jSONObject.put(f31709c, this.f31718l);
            jSONObject.put("phone", this.f31719m);
            jSONObject.put(f31711e, this.f31720n);
            jSONObject.put(f31712f, this.f31721o);
            jSONObject.put("region", this.f31722p);
            jSONObject.put(f31714h, this.f31723q);
            jSONObject.put(f31715i, this.f31724r);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return m19752j().toString();
    }

    private at() {
    }

    /* JADX INFO: renamed from: a */
    public String m19743a() {
        return this.f31716j;
    }

    /* JADX INFO: renamed from: b */
    public String m19744b() {
        return this.f31717k;
    }

    /* JADX INFO: renamed from: c */
    public String m19745c() {
        return this.f31718l;
    }

    /* JADX INFO: renamed from: d */
    public String m19746d() {
        return this.f31719m;
    }

    /* JADX INFO: renamed from: e */
    public String m19747e() {
        return this.f31720n;
    }

    /* JADX INFO: renamed from: f */
    public String m19748f() {
        return this.f31721o;
    }

    /* JADX INFO: renamed from: g */
    public String m19749g() {
        return this.f31722p;
    }

    /* JADX INFO: renamed from: h */
    public String m19750h() {
        return this.f31723q;
    }

    /* JADX INFO: renamed from: i */
    public String m19751i() {
        return this.f31724r;
    }
}
