package com.market.sdk;

/* JADX INFO: compiled from: AppUpdate64.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private String f28568k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f70894toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f70895zy;

    public zy(String str, String str2, String str3) {
        this.f28568k = str;
        this.f70894toq = str2;
        this.f70895zy = str3;
    }

    /* JADX INFO: renamed from: g */
    public void m17514g(String str) {
        this.f70895zy = str;
    }

    /* JADX INFO: renamed from: k */
    public String m17515k() {
        return this.f28568k;
    }

    /* JADX INFO: renamed from: n */
    public void m17516n(String str) {
        this.f70894toq = str;
    }

    /* JADX INFO: renamed from: q */
    public void m17517q(String str) {
        this.f28568k = str;
    }

    public String toString() {
        return "AppUpdate64{packageName='" + this.f28568k + "', versionCode='" + this.f70894toq + "', versionName='" + this.f70895zy + "'}";
    }

    public String toq() {
        return this.f70894toq;
    }

    public String zy() {
        return this.f70895zy;
    }
}
