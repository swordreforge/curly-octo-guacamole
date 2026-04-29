package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.ServiceQualityEvent;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: loaded from: classes3.dex */
class ac implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ServiceQualityEvent f31641a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31642b;

    ac(C5699m c5699m, ServiceQualityEvent serviceQualityEvent) {
        this.f31642b = c5699m;
        this.f31641a = serviceQualityEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f31642b.m19871f()) {
                return;
            }
            this.f31642b.f31851b.mo19705a(C5693g.f31789e, C5694h.m19783a(this.f31641a, this.f31642b.f31854f, this.f31642b.f31856h, this.f31642b.f31857i, this.f31642b.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "trackNetAvailableEvent error: " + e2.toString());
        }
    }
}
