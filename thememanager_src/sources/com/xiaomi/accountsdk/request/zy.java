package com.xiaomi.accountsdk.request;

import p039w.C7726q;

/* JADX INFO: compiled from: AuthenticationFailureException.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends C7726q {
    private static final long serialVersionUID = 1933476556350874440L;
    private String caDisableSecondsHeader;
    private String wwwAuthenticateHeader;

    public zy(String str) {
        super(0, str);
        this.wwwAuthenticateHeader = null;
        this.caDisableSecondsHeader = null;
    }

    public String getCaDisableSecondsHeader() {
        return this.caDisableSecondsHeader;
    }

    public String getWwwAuthenticateHeader() {
        return this.wwwAuthenticateHeader;
    }

    public void setCaDisableSecondsHeader(String str) {
        this.caDisableSecondsHeader = str;
    }

    public void setWwwAuthenticateHeader(String str) {
        this.wwwAuthenticateHeader = str;
    }

    public zy(int i2, String str) {
        super(i2, str);
        this.wwwAuthenticateHeader = null;
        this.caDisableSecondsHeader = null;
    }
}
