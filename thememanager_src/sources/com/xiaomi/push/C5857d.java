package com.xiaomi.push;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.push.d */
/* JADX INFO: loaded from: classes3.dex */
public class C5857d {

    /* JADX INFO: renamed from: k */
    private int f32789k;

    /* JADX INFO: renamed from: n */
    private long f32790n;

    /* JADX INFO: renamed from: q */
    private String f32791q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f73301toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f73302zy;

    public C5857d() {
        this(0, 0L, 0L, null);
    }

    /* JADX INFO: renamed from: k */
    public int m20711k() {
        return this.f32789k;
    }

    public C5857d toq(JSONObject jSONObject) {
        this.f73301toq = jSONObject.getLong("cost");
        this.f32790n = jSONObject.getLong("size");
        this.f73302zy = jSONObject.getLong("ts");
        this.f32789k = jSONObject.getInt("wt");
        this.f32791q = jSONObject.optString("expt");
        return this;
    }

    public JSONObject zy() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f73301toq);
        jSONObject.put("size", this.f32790n);
        jSONObject.put("ts", this.f73302zy);
        jSONObject.put("wt", this.f32789k);
        jSONObject.put("expt", this.f32791q);
        return jSONObject;
    }

    public C5857d(int i2, long j2, long j3, Exception exc) {
        this.f32789k = i2;
        this.f73301toq = j2;
        this.f32790n = j3;
        this.f73302zy = System.currentTimeMillis();
        if (exc != null) {
            this.f32791q = exc.getClass().getSimpleName();
        }
    }
}
