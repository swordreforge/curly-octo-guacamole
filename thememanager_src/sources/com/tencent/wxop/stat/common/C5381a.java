package com.tencent.wxop.stat.common;

import com.android.thememanager.controller.online.InterfaceC1925p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5381a {

    /* JADX INFO: renamed from: a */
    private String f30092a;

    /* JADX INFO: renamed from: b */
    private String f30093b;

    /* JADX INFO: renamed from: c */
    private String f30094c;

    /* JADX INFO: renamed from: d */
    private String f30095d;

    /* JADX INFO: renamed from: e */
    private int f30096e;

    /* JADX INFO: renamed from: f */
    private int f30097f;

    /* JADX INFO: renamed from: g */
    private long f30098g;

    public C5381a() {
        this.f30092a = null;
        this.f30093b = null;
        this.f30094c = null;
        this.f30095d = "0";
        this.f30097f = 0;
        this.f30098g = 0L;
    }

    public C5381a(String str, String str2, int i2) {
        this.f30094c = null;
        this.f30095d = "0";
        this.f30097f = 0;
        this.f30098g = 0L;
        this.f30092a = str;
        this.f30093b = str2;
        this.f30096e = i2;
    }

    /* JADX INFO: renamed from: a */
    JSONObject m18380a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C5398r.m18466a(jSONObject, "ui", this.f30092a);
            C5398r.m18466a(jSONObject, "mc", this.f30093b);
            C5398r.m18466a(jSONObject, "mid", this.f30095d);
            C5398r.m18466a(jSONObject, "aid", this.f30094c);
            jSONObject.put("ts", this.f30098g);
            jSONObject.put(InterfaceC1925p.w1, this.f30097f);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m18381a(int i2) {
        this.f30096e = i2;
    }

    /* JADX INFO: renamed from: b */
    public String m18382b() {
        return this.f30092a;
    }

    /* JADX INFO: renamed from: c */
    public String m18383c() {
        return this.f30093b;
    }

    /* JADX INFO: renamed from: d */
    public int m18384d() {
        return this.f30096e;
    }

    public String toString() {
        return m18380a().toString();
    }
}
