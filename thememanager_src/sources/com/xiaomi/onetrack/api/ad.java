package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: loaded from: classes3.dex */
class ad implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5699m f31643a;

    ad(C5699m c5699m) {
        this.f31643a = c5699m;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f31643a.m19871f()) {
                return;
            }
            this.f31643a.f31851b.mo19705a(C5693g.f31793i, C5694h.m19781a(this.f31643a.f31854f, this.f31643a.f31856h, this.f31643a.f31857i, this.f31643a.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "cta event error: " + e2.toString());
        }
    }
}
