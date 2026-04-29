package com.tencent.wxop.stat.event;

import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.c */
/* JADX INFO: loaded from: classes3.dex */
public class C5403c {

    /* JADX INFO: renamed from: a */
    public String f30183a;

    /* JADX INFO: renamed from: b */
    public JSONArray f30184b;

    /* JADX INFO: renamed from: c */
    public JSONObject f30185c;

    public C5403c() {
        this.f30185c = null;
    }

    public C5403c(String str, String[] strArr, Properties properties) {
        JSONObject jSONObject;
        this.f30185c = null;
        this.f30183a = str;
        if (properties != null) {
            jSONObject = new JSONObject(properties);
        } else {
            if (strArr != null) {
                this.f30184b = new JSONArray();
                for (String str2 : strArr) {
                    this.f30184b.put(str2);
                }
                return;
            }
            jSONObject = new JSONObject();
        }
        this.f30185c = jSONObject;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5403c) {
            return toString().equals(((C5403c) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f30183a);
        sb.append(",");
        JSONArray jSONArray = this.f30184b;
        if (jSONArray != null) {
            sb.append(jSONArray.toString());
        }
        JSONObject jSONObject = this.f30185c;
        if (jSONObject != null) {
            sb.append(jSONObject.toString());
        }
        return sb.toString();
    }
}
