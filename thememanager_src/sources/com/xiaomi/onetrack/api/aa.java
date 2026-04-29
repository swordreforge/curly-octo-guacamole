package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5778k;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class aa implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31637a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31638b;

    aa(C5699m c5699m, String str) {
        this.f31638b = c5699m;
        this.f31637a = str;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            String strM20266a = C5778k.m20266a(C5806r.m20374a(this.f31638b.f31854f));
            if (TextUtils.isEmpty(strM20266a)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM20266a);
            jSONObject.remove(this.f31637a);
            C5778k.m20268a(C5806r.m20374a(this.f31638b.f31854f), jSONObject.toString());
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "removeCommonProperty error:" + e2.toString());
        }
    }
}
