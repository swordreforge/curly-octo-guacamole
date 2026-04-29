package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class al implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f31668a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31669b;

    al(C5699m c5699m, Map map) {
        this.f31669b = c5699m;
        this.f31668a = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31669b.m19871f()) {
                return;
            }
            this.f31669b.f31851b.mo19705a(C5693g.f31787c, C5694h.m19791a(C5806r.m20378a((Map<String, Object>) this.f31668a, false), this.f31669b.f31854f, this.f31669b.f31856h, this.f31669b.m19829f(C5693g.f31787c), this.f31669b.f31857i, this.f31669b.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "setUserProfile map error:" + e2.toString());
        }
    }
}
