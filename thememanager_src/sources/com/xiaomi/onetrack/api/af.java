package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5806r;

/* JADX INFO: loaded from: classes3.dex */
class af implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f31645a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31646b;

    af(C5699m c5699m, boolean z2) {
        this.f31646b = c5699m;
        this.f31645a = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31646b.f31857i.m20400a(this.f31645a);
        com.xiaomi.onetrack.util.aa.m20158a(C5806r.m20374a(this.f31646b.f31854f), this.f31645a);
    }
}
