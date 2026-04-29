package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.q */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5703q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31868a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Number f31869b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5699m f31870c;

    RunnableC5703q(C5699m c5699m, String str, Number number) {
        this.f31870c = c5699m;
        this.f31868a = str;
        this.f31869b = number;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31870c.m19871f()) {
                return;
            }
            this.f31870c.f31851b.mo19705a(C5693g.f31788d, C5694h.m19792b(new JSONObject().put(this.f31868a, this.f31869b), this.f31870c.f31854f, this.f31870c.f31856h, this.f31870c.m19829f(C5693g.f31788d), this.f31870c.f31857i, this.f31870c.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "userProfileIncrement single error:" + e2.toString());
        }
    }
}
