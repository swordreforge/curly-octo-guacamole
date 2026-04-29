package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.p */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5702p implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f31866a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31867b;

    RunnableC5702p(C5699m c5699m, Map map) {
        this.f31867b = c5699m;
        this.f31866a = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31867b.m19871f()) {
                return;
            }
            this.f31867b.f31851b.mo19705a(C5693g.f31788d, C5694h.m19792b(new JSONObject(this.f31866a), this.f31867b.f31854f, this.f31867b.f31856h, this.f31867b.m19829f(C5693g.f31788d), this.f31867b.f31857i, this.f31867b.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "userProfileIncrement map error:" + e2.toString());
        }
    }
}
