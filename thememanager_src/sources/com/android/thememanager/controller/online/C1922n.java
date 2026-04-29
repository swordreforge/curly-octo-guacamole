package com.android.thememanager.controller.online;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.n */
/* JADX INFO: compiled from: HttpStatusException.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1922n extends Exception {
    private static final long serialVersionUID = 1;
    private int mReasponseCode;
    private String mResponseReason;

    public C1922n(int responseCode, String responseReason) {
        super("Http response: code=" + responseCode + " reason=" + responseReason);
        this.mReasponseCode = responseCode;
        this.mResponseReason = responseReason;
    }

    public int getResponseCode() {
        return this.mReasponseCode;
    }

    public String getResponseReason() {
        return this.mResponseReason;
    }
}
