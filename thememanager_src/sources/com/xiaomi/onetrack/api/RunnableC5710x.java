package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5778k;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.x */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5710x implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f31889a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31890b;

    RunnableC5710x(C5699m c5699m, Map map) {
        this.f31890b = c5699m;
        this.f31889a = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            JSONObject jSONObjectM20378a = C5806r.m20378a((Map<String, Object>) this.f31889a, true);
            String strM20266a = C5778k.m20266a(C5806r.m20374a(this.f31890b.f31854f));
            C5778k.m20268a(C5806r.m20374a(this.f31890b.f31854f), C5806r.m20379a(jSONObjectM20378a, TextUtils.isEmpty(strM20266a) ? null : new JSONObject(strM20266a)).toString());
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", " " + e2.toString());
        }
    }
}
