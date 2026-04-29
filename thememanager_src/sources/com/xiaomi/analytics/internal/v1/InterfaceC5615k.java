package com.xiaomi.analytics.internal.v1;

import com.xiaomi.analytics.internal.C5605n;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.v1.k */
/* JADX INFO: compiled from: AnalyticsInterface.java */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5615k {
    void close();

    void deleteAllEvents(String str);

    C5605n getVersion();

    void init();

    /* JADX INFO: renamed from: k */
    boolean mo19266k(String str);

    void setDebugOn(boolean z2);

    void setDefaultPolicy(String str, String str2);

    String toq(String str);

    void trackEvent(String str);

    void trackEvents(String[] strArr);
}
