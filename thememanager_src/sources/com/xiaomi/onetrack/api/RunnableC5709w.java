package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5804p;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.w */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5709w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f31887a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31888b;

    RunnableC5709w(C5699m c5699m, boolean z2) {
        this.f31888b = c5699m;
        this.f31887a = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f31888b.m19871f()) {
                return;
            }
            String strM20216z = com.xiaomi.onetrack.util.aa.m20216z();
            if (TextUtils.isEmpty(strM20216z)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM20216z);
            this.f31888b.f31851b.mo19705a(C5693g.f31791g, jSONObject.put("B", jSONObject.optJSONObject("B").put(C5693g.f31805u, this.f31887a)).toString());
            if (C5804p.f32410a) {
                C5804p.m20342a("OneTrackImp", "trackPageEndAuto");
            }
            com.xiaomi.onetrack.util.aa.m20190i("");
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "trackPageEndAuto error:" + e2.toString());
        }
    }
}
