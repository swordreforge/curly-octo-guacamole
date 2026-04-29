package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class ag {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f30014a;

    static {
        int[] iArr = new int[StatReportStrategy.values().length];
        f30014a = iArr;
        try {
            iArr[StatReportStrategy.INSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30014a[StatReportStrategy.PERIOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30014a[StatReportStrategy.APP_LAUNCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30014a[StatReportStrategy.DEVELOPER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30014a[StatReportStrategy.BATCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f30014a[StatReportStrategy.ONLY_WIFI.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f30014a[StatReportStrategy.ONLY_WIFI_NO_CACHE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
