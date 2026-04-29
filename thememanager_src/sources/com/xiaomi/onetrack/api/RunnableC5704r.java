package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.r */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5704r implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f31871a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f31872b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5699m f31873c;

    RunnableC5704r(C5699m c5699m, boolean z2, Map map) {
        this.f31873c = c5699m;
        this.f31871a = z2;
        this.f31872b = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31873c.m19871f()) {
                return;
            }
            if (!this.f31871a) {
                JSONObject jSONObjectM20378a = C5806r.m20378a((Map<String, Object>) this.f31872b, false);
                if (!C5757b.m20065a(this.f31873c.f31858j)) {
                    String strM20211u = com.xiaomi.onetrack.util.aa.m20211u();
                    String strM20213w = com.xiaomi.onetrack.util.aa.m20213w();
                    jSONObjectM20378a.put("uid", strM20211u);
                    jSONObjectM20378a.put("uid_type", strM20213w);
                }
                this.f31873c.f31851b.mo19705a("ot_logout", C5694h.m19794d(jSONObjectM20378a, this.f31873c.f31854f, this.f31873c.f31856h, this.f31873c.m19829f("ot_logout"), this.f31873c.f31857i, this.f31873c.f31858j));
            }
            com.xiaomi.onetrack.util.aa.m20212v();
            com.xiaomi.onetrack.util.aa.m20214x();
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "logout error:" + e2.toString());
        }
    }
}
