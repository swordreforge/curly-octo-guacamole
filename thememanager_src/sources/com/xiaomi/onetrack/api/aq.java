package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.OneTrack;

/* JADX INFO: loaded from: classes3.dex */
class aq implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ap f31689a;

    aq(ap apVar) {
        this.f31689a = apVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (OneTrack.isRestrictGetNetworkInfo()) {
            C5689c.m19765a().m19778f();
        }
    }
}
