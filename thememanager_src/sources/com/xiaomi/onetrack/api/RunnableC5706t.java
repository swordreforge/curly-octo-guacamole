package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.t */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5706t implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5699m f31880a;

    RunnableC5706t(C5699m c5699m) {
        this.f31880a = c5699m;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31880a.m19871f() || com.xiaomi.onetrack.util.ac.m20227d(com.xiaomi.onetrack.util.aa.m20210t())) {
                return;
            }
            com.xiaomi.onetrack.util.aa.m20201m(System.currentTimeMillis());
            this.f31880a.f31851b.mo19705a("onetrack_dau", C5694h.m19782a(this.f31880a.f31854f, this.f31880a.f31856h, this.f31880a.m19829f("onetrack_dau"), this.f31880a.f31857i, this.f31880a.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "trackDau error  e:" + e2.toString());
        }
    }
}
