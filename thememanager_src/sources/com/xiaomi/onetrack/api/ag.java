package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ag implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31647a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f31648b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f31649c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C5699m f31650d;

    ag(C5699m c5699m, String str, Map map, String str2) {
        this.f31650d = c5699m;
        this.f31647a = str;
        this.f31648b = map;
        this.f31649c = str2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (!this.f31650d.m19871f() && !this.f31650d.m19824d(this.f31647a)) {
                this.f31650d.f31851b.mo19705a(this.f31647a, C5694h.m19788a(this.f31649c, this.f31647a, C5806r.m20378a((Map<String, Object>) this.f31648b, true), this.f31650d.f31854f, this.f31650d.f31856h, this.f31650d.m19829f(this.f31647a), this.f31650d.f31857i, this.f31650d.f31858j));
            }
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "track json error:" + e2.toString());
        }
    }
}
