package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
public class StatSpecifyReportedInfo {

    /* JADX INFO: renamed from: a */
    private String f29987a = null;

    /* JADX INFO: renamed from: b */
    private String f29988b = null;

    /* JADX INFO: renamed from: c */
    private String f29989c = null;

    /* JADX INFO: renamed from: d */
    private boolean f29990d = false;

    /* JADX INFO: renamed from: e */
    private boolean f29991e = false;

    public String getAppKey() {
        return this.f29987a;
    }

    public String getInstallChannel() {
        return this.f29988b;
    }

    public String getVersion() {
        return this.f29989c;
    }

    public boolean isImportant() {
        return this.f29991e;
    }

    public boolean isSendImmediately() {
        return this.f29990d;
    }

    public void setAppKey(String str) {
        this.f29987a = str;
    }

    public void setImportant(boolean z2) {
        this.f29991e = z2;
    }

    public void setInstallChannel(String str) {
        this.f29988b = str;
    }

    public void setSendImmediately(boolean z2) {
        this.f29990d = z2;
    }

    public void setVersion(String str) {
        this.f29989c = str;
    }

    public String toString() {
        return "StatSpecifyReportedInfo [appKey=" + this.f29987a + ", installChannel=" + this.f29988b + ", version=" + this.f29989c + ", sendImmediately=" + this.f29990d + ", isImportant=" + this.f29991e + "]";
    }
}
