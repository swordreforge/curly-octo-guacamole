package com.xiaomi.accountsdk.request;

import p039w.C7723k;

/* JADX INFO: compiled from: InvalidResponseException.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h extends C7723k {
    private static final long serialVersionUID = 5544530065307643635L;
    public boolean isHtmlOr302;

    public n7h(String str) {
        this(str, (Throwable) null);
    }

    public n7h(int i2, String str) {
        super(i2, str);
        this.isHtmlOr302 = false;
    }

    public n7h(String str, Throwable th) {
        this(str, th, false);
    }

    public n7h(String str, Throwable th, boolean z2) {
        super(-1, str, th);
        this.isHtmlOr302 = z2;
    }
}
