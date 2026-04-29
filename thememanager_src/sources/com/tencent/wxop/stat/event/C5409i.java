package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.C5378a;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5398r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5409i extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    private static String f30207a;

    /* JADX INFO: renamed from: m */
    private String f30208m;

    /* JADX INFO: renamed from: n */
    private String f30209n;

    public C5409i(Context context, int i2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30208m = null;
        this.f30209n = null;
        this.f30208m = C5378a.m18307a(context).m18316b();
        if (f30207a == null) {
            f30207a = C5392l.m18429g(context);
        }
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.NETWORK_MONITOR;
    }

    /* JADX INFO: renamed from: a */
    public void m18491a(String str) {
        this.f30209n = str;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        C5398r.m18466a(jSONObject, "op", f30207a);
        C5398r.m18466a(jSONObject, "cn", this.f30208m);
        jSONObject.put("sp", this.f30209n);
        return true;
    }
}
