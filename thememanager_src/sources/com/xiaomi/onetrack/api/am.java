package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class am implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f31670a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f31671b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5699m f31672c;

    am(C5699m c5699m, Object obj, String str) {
        this.f31672c = c5699m;
        this.f31670a = obj;
        this.f31671b = str;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31672c.m19871f()) {
                return;
            }
            if (!C5806r.m20383b(this.f31670a)) {
                C5806r.m20380a("OneTrackImp", this.f31671b);
                return;
            }
            this.f31672c.f31851b.mo19705a(C5693g.f31787c, C5694h.m19791a(new JSONObject().put(this.f31671b, this.f31670a), this.f31672c.f31854f, this.f31672c.f31856h, this.f31672c.m19829f(C5693g.f31787c), this.f31672c.f31857i, this.f31672c.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "setUserProfile single error:" + e2.toString());
        }
    }
}
