package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ah implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31651a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f31652b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5699m f31653c;

    ah(C5699m c5699m, String str, Map map) {
        this.f31653c = c5699m;
        this.f31651a = str;
        this.f31652b = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (!this.f31653c.m19871f() && !this.f31653c.m19824d(this.f31651a)) {
                this.f31653c.f31851b.mo19705a(this.f31651a, C5694h.m19790a(this.f31651a, C5806r.m20378a((Map<String, Object>) this.f31652b, true), this.f31653c.f31854f, this.f31653c.f31856h, this.f31653c.m19829f(this.f31651a), this.f31653c.f31857i, this.f31653c.f31858j));
            }
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "track map error: " + e2.toString());
        }
    }
}
