package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ai implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31654a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f31655b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f31656c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C5699m f31657d;

    ai(C5699m c5699m, String str, Map map, List list) {
        this.f31657d = c5699m;
        this.f31654a = str;
        this.f31655b = map;
        this.f31656c = list;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (TextUtils.isEmpty(this.f31657d.f31854f.getAdEventAppId())) {
                C5804p.m20342a("OneTrackImp", "adEventAppId is null,Please configure,event name:" + this.f31654a);
                return;
            }
            if (!this.f31657d.m19871f() && !this.f31657d.m19824d(this.f31654a)) {
                this.f31657d.f31851b.mo19705a(this.f31654a, C5694h.m19789a(this.f31654a, C5806r.m20378a((Map<String, Object>) this.f31655b, true), this.f31657d.f31854f, this.f31657d.f31856h, this.f31657d.m19829f(this.f31654a), this.f31657d.f31857i, C5806r.m20375a(this.f31656c), this.f31657d.f31858j));
            }
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "track map error: " + e2.toString());
        }
    }
}
