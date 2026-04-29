package com.market.sdk;

/* JADX INFO: compiled from: ServerType.java */
/* JADX INFO: loaded from: classes3.dex */
public enum fu4 {
    PRODUCT("https://api.developer.xiaomi.com/autoupdate/", "https://global.developer.xiaomi.com/autoupdate/");

    private String baseUrl;
    private String globalBaseUrl;

    fu4(String str, String str2) {
        this.baseUrl = str;
        this.globalBaseUrl = str2;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getGlobalBaseUrl() {
        return this.globalBaseUrl;
    }
}
