package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.o */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5701o implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31861a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ OneTrack.UserIdType f31862b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f31863c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Map f31864d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C5699m f31865e;

    RunnableC5701o(C5699m c5699m, String str, OneTrack.UserIdType userIdType, boolean z2, Map map) {
        this.f31865e = c5699m;
        this.f31861a = str;
        this.f31862b = userIdType;
        this.f31863c = z2;
        this.f31864d = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31865e.m19871f()) {
                return;
            }
            com.xiaomi.onetrack.util.aa.m20184g(this.f31861a);
            com.xiaomi.onetrack.util.aa.m20187h(this.f31862b.getUserIdType());
            if (this.f31863c) {
                return;
            }
            JSONObject jSONObjectM20378a = C5806r.m20378a((Map<String, Object>) this.f31864d, false);
            if (!C5757b.m20065a(this.f31865e.f31858j)) {
                jSONObjectM20378a.put("uid", this.f31861a);
                jSONObjectM20378a.put("uid_type", this.f31862b.getUserIdType());
            }
            this.f31865e.f31851b.mo19705a("ot_login", C5694h.m19793c(jSONObjectM20378a, this.f31865e.f31854f, this.f31865e.f31856h, this.f31865e.m19829f("ot_login"), this.f31865e.f31857i, this.f31865e.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "login error:" + e2.toString());
        }
    }
}
