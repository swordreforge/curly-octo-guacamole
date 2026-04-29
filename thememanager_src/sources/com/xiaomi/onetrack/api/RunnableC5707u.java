package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.u */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5707u implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31881a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f31882b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5699m f31883c;

    RunnableC5707u(C5699m c5699m, String str, boolean z2) {
        this.f31883c = c5699m;
        this.f31881a = str;
        this.f31882b = z2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31883c.m19871f()) {
                return;
            }
            if (!this.f31883c.f31854f.isAutoTrackActivityAction()) {
                C5804p.m20342a("OneTrackImp", "config.autoTrackActivityAction is false, ignore onetrack_pa resume event");
                return;
            }
            this.f31883c.f31851b.mo19705a(C5693g.f31791g, C5694h.m19786a(this.f31881a, C5693g.f31791g, this.f31883c.f31854f, this.f31883c.f31856h, this.f31883c.m19829f(C5693g.f31791g), this.f31882b, this.f31883c.f31857i, this.f31883c.f31858j));
            if (C5804p.f32410a) {
                C5804p.m20342a("OneTrackImp", "trackPageStartAuto");
            }
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "auto trackPageStartAuto error: " + e2.toString());
        }
    }
}
