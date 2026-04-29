package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
public enum StatReportStrategy {
    INSTANT(1),
    ONLY_WIFI(2),
    BATCH(3),
    APP_LAUNCH(4),
    DEVELOPER(5),
    PERIOD(6),
    ONLY_WIFI_NO_CACHE(7);


    /* JADX INFO: renamed from: a */
    int f29966a;

    StatReportStrategy(int i2) {
        this.f29966a = i2;
    }

    public static StatReportStrategy getStatReportStrategy(int i2) {
        for (StatReportStrategy statReportStrategy : values()) {
            if (i2 == statReportStrategy.m18278a()) {
                return statReportStrategy;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m18278a() {
        return this.f29966a;
    }
}
