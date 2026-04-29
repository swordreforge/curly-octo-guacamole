package com.tencent.wxop.stat.event;

/* JADX INFO: loaded from: classes3.dex */
public enum EventType {
    PAGE_VIEW(1),
    SESSION_ENV(2),
    ERROR(3),
    CUSTOM(1000),
    ADDITION(1001),
    MONITOR_STAT(1002),
    MTA_GAME_USER(1003),
    NETWORK_MONITOR(1004),
    NETWORK_DETECTOR(1005);


    /* JADX INFO: renamed from: a */
    private int f30179a;

    EventType(int i2) {
        this.f30179a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m18478a() {
        return this.f30179a;
    }
}
