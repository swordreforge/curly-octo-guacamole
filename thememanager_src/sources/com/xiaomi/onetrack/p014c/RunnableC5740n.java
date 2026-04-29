package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.api.as;
import com.xiaomi.onetrack.util.C5804p;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.n */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5740n implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f32044a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5738l f32045b;

    RunnableC5740n(C5738l c5738l, String str) {
        this.f32045b = c5738l;
        this.f32044a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            List<JSONObject> listM19971b = C5738l.m19971b(this.f32044a);
            if (listM19971b != null && listM19971b.size() > 0) {
                for (JSONObject jSONObject : listM19971b) {
                    as.m19714a().m19732a(this.f32044a, jSONObject.optString("eventName"), jSONObject.optString("data"));
                }
            }
            this.f32045b.m19975a(this.f32044a);
        } catch (Exception e2) {
            C5804p.m20347b("SystemImpCacheManager", "trackSystemImpCache event error: " + e2.toString());
        }
    }
}
