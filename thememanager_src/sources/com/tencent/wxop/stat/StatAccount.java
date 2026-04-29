package com.tencent.wxop.stat;

import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5398r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class StatAccount {
    public static final int CUSTOM_TYPE = 7;
    public static final int DEFAULT_TYPE = 0;
    public static final int EMAIL_TYPE = 6;
    public static final int PHONE_NUM_TYPE = 5;
    public static final int QQ_NUM_TYPE = 1;
    public static final int QQ_OPENID_TYPE = 3;
    public static final int WECHAT_ID_TYPE = 2;
    public static final int WECHAT_OPENID_TYPE = 4;

    /* JADX INFO: renamed from: a */
    private String f29906a;

    /* JADX INFO: renamed from: b */
    private int f29907b;

    /* JADX INFO: renamed from: c */
    private String f29908c;

    /* JADX INFO: renamed from: d */
    private String f29909d;

    public StatAccount(String str) {
        this.f29907b = 0;
        this.f29908c = "";
        this.f29909d = "";
        this.f29906a = str;
    }

    public StatAccount(String str, int i2) {
        this.f29908c = "";
        this.f29909d = "";
        this.f29906a = str;
        this.f29907b = i2;
    }

    public String getAccount() {
        return this.f29906a;
    }

    public int getAccountType() {
        return this.f29907b;
    }

    public String getExt() {
        return this.f29908c;
    }

    public String getExt1() {
        return this.f29909d;
    }

    public void setAccount(String str) {
        this.f29906a = str;
    }

    public void setAccountType(int i2) {
        this.f29907b = i2;
    }

    public void setExt(String str) {
        this.f29908c = str;
    }

    public void setExt1(String str) {
        this.f29909d = str;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        if (C5392l.m18422c(this.f29906a)) {
            try {
                C5398r.m18466a(jSONObject, "a", this.f29906a);
                jSONObject.put("t", this.f29907b);
                C5398r.m18466a(jSONObject, "e", this.f29908c);
                C5398r.m18466a(jSONObject, "e1", this.f29909d);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "StatAccount [account=" + this.f29906a + ", accountType=" + this.f29907b + ", ext=" + this.f29908c + ", ext1=" + this.f29909d + "]";
    }
}
