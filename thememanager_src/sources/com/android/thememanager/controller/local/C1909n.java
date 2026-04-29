package com.android.thememanager.controller.local;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.n */
/* JADX INFO: compiled from: ImportException.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1909n extends Exception {
    private static final long serialVersionUID = 1;
    private k errorType;

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.n$k */
    /* JADX INFO: compiled from: ImportException.java */
    public enum k {
        UNZIP,
        PATCH,
        IMPORT,
        OTHER
    }

    public C1909n() {
        this.errorType = k.OTHER;
    }

    public k getErrorType() {
        return this.errorType;
    }

    public void setErrorType(k errorType) {
        this.errorType = errorType;
    }

    public C1909n(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
        this.errorType = k.OTHER;
    }

    public C1909n(String detailMessage) {
        super(detailMessage);
        this.errorType = k.OTHER;
    }

    public C1909n(Throwable throwable) {
        super(throwable);
        this.errorType = k.OTHER;
    }

    public C1909n(k errorType) {
        k kVar = k.OTHER;
        this.errorType = errorType;
    }
}
