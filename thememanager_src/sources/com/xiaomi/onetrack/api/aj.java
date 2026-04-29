package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class aj implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31658a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31659b;

    aj(C5699m c5699m, String str) {
        this.f31659b = c5699m;
        this.f31658a = str;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31659b.m19871f()) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f31658a);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(C5694h.f31812b) && jSONObjectOptJSONObject.has("B")) {
                    C5695i c5695i = new C5695i(jSONObjectOptJSONObject.optJSONObject(C5694h.f31812b));
                    if (!this.f31659b.m19827e(c5695i.m19796a())) {
                        this.f31659b.f31851b.mo19705a(c5695i.m19796a(), C5694h.m19784a(c5695i, jSONObjectOptJSONObject.optJSONObject("B"), this.f31659b.f31854f, this.f31659b.f31856h, this.f31659b.m19829f(c5695i.m19796a()), this.f31659b.f31857i, this.f31659b.f31858j));
                    }
                } else {
                    C5804p.m20342a("OneTrackImp", "h5 json is empty or has no \"H\" or \"B\" ");
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "trackEventFromH5 error: " + e2.toString());
        }
    }
}
