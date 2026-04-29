package miuix.hybrid.internal;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: miuix.hybrid.internal.s */
/* JADX INFO: compiled from: JsonConfigParser.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7135s implements toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f87731f7l8 = "params";

    /* JADX INFO: renamed from: g */
    private static final String f40296g = "features";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f87732ld6 = "origin";

    /* JADX INFO: renamed from: n */
    private static final String f40297n = "content";

    /* JADX INFO: renamed from: p */
    private static final String f40298p = "permissions";

    /* JADX INFO: renamed from: q */
    private static final String f40299q = "vendor";

    /* JADX INFO: renamed from: s */
    private static final String f40300s = "value";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87733toq = "signature";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f87734x2 = "subdomains";

    /* JADX INFO: renamed from: y */
    private static final String f40301y = "name";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87735zy = "timestamp";

    /* JADX INFO: renamed from: k */
    private JSONObject f40302k;

    private C7135s(JSONObject json) {
        this.f40302k = json;
    }

    /* JADX INFO: renamed from: g */
    private void m25869g(C7127k config, JSONObject jsonRoot) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jsonRoot.optJSONArray(f40298p);
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                C7129p c7129p = new C7129p();
                c7129p.m25833g(jSONObject.getString("origin"));
                c7129p.m25836q(jSONObject.optBoolean(f87734x2));
                config.toq(c7129p);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m25870n(C7127k config, JSONObject jsonRoot) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jsonRoot.optJSONArray(f40296g);
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                C7134q c7134q = new C7134q();
                c7134q.m25863n(jSONObject.getString("name"));
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(f87731f7l8);
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
                        c7134q.m25861g(jSONObject2.getString("name"), jSONObject2.getString("value"));
                    }
                }
                config.m25811k(c7134q);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static C7135s m25871q(String content) throws C7126g {
        try {
            return zy(new JSONObject(content));
        } catch (JSONException e2) {
            throw new C7126g(201, e2.getMessage());
        }
    }

    private C7127k toq(C7127k config, Map<String, Object> metaData) {
        return config;
    }

    public static C7135s zy(JSONObject json) {
        return new C7135s(json);
    }

    @Override // miuix.hybrid.internal.toq
    /* JADX INFO: renamed from: k */
    public C7127k mo25823k(Map<String, Object> metaData) throws C7126g {
        C7127k c7127k = new C7127k();
        try {
            JSONObject jSONObject = this.f40302k;
            x2 x2Var = new x2();
            x2Var.zy(jSONObject.getString("signature"));
            x2Var.m25901q(jSONObject.getLong("timestamp"));
            c7127k.m25810i(x2Var);
            c7127k.fn3e(jSONObject.getString(f40299q));
            c7127k.kja0(jSONObject.optString("content"));
            m25870n(c7127k, jSONObject);
            m25869g(c7127k, jSONObject);
            return toq(c7127k, metaData);
        } catch (JSONException e2) {
            throw new C7126g(201, e2.getMessage());
        }
    }
}
