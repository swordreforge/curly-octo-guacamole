package miuix.hybrid;

import org.json.JSONException;
import org.json.JSONObject;
import zy.lvui;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes3.dex */
public class o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f87748f7l8 = 3;

    /* JADX INFO: renamed from: g */
    public static final int f40343g = 2;

    /* JADX INFO: renamed from: h */
    private static final String f40344h = "content";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f87749kja0 = "code";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f87750ld6 = 202;

    /* JADX INFO: renamed from: n */
    public static final int f40345n = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f87751n7h = 205;

    /* JADX INFO: renamed from: p */
    public static final int f40346p = 201;

    /* JADX INFO: renamed from: q */
    public static final int f40347q = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f87752qrj = 204;

    /* JADX INFO: renamed from: s */
    public static final int f40348s = 200;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f87753x2 = 203;

    /* JADX INFO: renamed from: y */
    public static final int f40349y = 100;

    /* JADX INFO: renamed from: k */
    private final int f40350k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f87754toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final JSONObject f87755zy;

    public o1t(int code) {
        this(code, "");
    }

    /* JADX INFO: renamed from: k */
    public int m25908k() {
        return this.f40350k;
    }

    @lvui
    public String toString() {
        return this.f87755zy.toString();
    }

    public String toq() {
        return this.f87754toq;
    }

    public JSONObject zy() {
        return this.f87755zy;
    }

    public o1t(String content) {
        this(0, content);
    }

    public o1t(int code, String content) {
        JSONObject jSONObject = new JSONObject();
        this.f87755zy = jSONObject;
        this.f40350k = code;
        this.f87754toq = content;
        try {
            jSONObject.put("code", code);
            jSONObject.put("content", content);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public o1t(JSONObject content) {
        this(0, content);
    }

    public o1t(int code, JSONObject content) {
        JSONObject jSONObject = new JSONObject();
        this.f87755zy = jSONObject;
        this.f40350k = code;
        this.f87754toq = content.toString();
        try {
            jSONObject.put("code", code);
            jSONObject.put("content", content);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
