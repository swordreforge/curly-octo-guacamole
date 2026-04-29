package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.api.InterfaceC5696j;
import com.xiaomi.onetrack.util.C5804p;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.k */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5737k implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC5696j f32031a;

    RunnableC5737k(InterfaceC5696j interfaceC5696j) {
        this.f32031a = interfaceC5696j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            List<JSONObject> listM19963c = C5735i.m19963c();
            if (listM19963c != null && listM19963c.size() > 0) {
                for (JSONObject jSONObject : listM19963c) {
                    this.f32031a.mo19705a(jSONObject.optString("eventName"), jSONObject.optString("data"));
                }
            }
            C5735i.m19965c(true);
        } catch (Exception e2) {
            C5804p.m20347b("NetworkAccessManager", "cta event error: " + e2.toString());
        }
        boolean unused = C5735i.f32028l = false;
    }
}
