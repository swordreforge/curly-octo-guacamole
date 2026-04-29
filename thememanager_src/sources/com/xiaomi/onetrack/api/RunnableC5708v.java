package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.v */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5708v implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31884a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f31885b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5699m f31886c;

    RunnableC5708v(C5699m c5699m, String str, long j2) {
        this.f31886c = c5699m;
        this.f31884a = str;
        this.f31885b = j2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31886c.m19871f()) {
                return;
            }
            if (!this.f31886c.f31854f.isAutoTrackActivityAction()) {
                C5804p.m20342a("OneTrackImp", "config.autoTrackActivityAction is false, ignore onetrack_pa pause event");
            } else {
                com.xiaomi.onetrack.util.aa.m20190i(C5694h.m19785a(this.f31884a, C5693g.f31791g, this.f31885b, this.f31886c.f31854f, this.f31886c.f31856h, this.f31886c.m19829f(C5693g.f31791g), this.f31886c.f31857i, this.f31886c.f31858j));
            }
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "savePageEndData error:" + e2.toString());
        }
    }
}
