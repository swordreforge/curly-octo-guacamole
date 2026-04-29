package com.tencent.wxop.stat;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkMonitor {

    /* JADX INFO: renamed from: a */
    private long f29901a = 0;

    /* JADX INFO: renamed from: b */
    private int f29902b = 0;

    /* JADX INFO: renamed from: c */
    private String f29903c = "";

    /* JADX INFO: renamed from: d */
    private int f29904d = 0;

    /* JADX INFO: renamed from: e */
    private String f29905e = "";

    public String getDomain() {
        return this.f29903c;
    }

    public long getMillisecondsConsume() {
        return this.f29901a;
    }

    public int getPort() {
        return this.f29904d;
    }

    public String getRemoteIp() {
        return this.f29905e;
    }

    public int getStatusCode() {
        return this.f29902b;
    }

    public void setDomain(String str) {
        this.f29903c = str;
    }

    public void setMillisecondsConsume(long j2) {
        this.f29901a = j2;
    }

    public void setPort(int i2) {
        this.f29904d = i2;
    }

    public void setRemoteIp(String str) {
        this.f29905e = str;
    }

    public void setStatusCode(int i2) {
        this.f29902b = i2;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tm", this.f29901a);
            jSONObject.put("st", this.f29902b);
            String str = this.f29903c;
            if (str != null) {
                jSONObject.put("dm", str);
            }
            jSONObject.put("pt", this.f29904d);
            String str2 = this.f29905e;
            if (str2 != null) {
                jSONObject.put("rip", str2);
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
