package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.C5378a;
import com.tencent.wxop.stat.StatAppMonitor;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5398r;
import com.xiaomi.onetrack.p013b.C5725m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.g */
/* JADX INFO: loaded from: classes3.dex */
public class C5407g extends AbstractC5405e {

    /* JADX INFO: renamed from: m */
    private static String f30203m;

    /* JADX INFO: renamed from: n */
    private static String f30204n;

    /* JADX INFO: renamed from: a */
    private StatAppMonitor f30205a;

    public C5407g(Context context, int i2, StatAppMonitor statAppMonitor, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30205a = null;
        this.f30205a = statAppMonitor.m28270clone();
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.MONITOR_STAT;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        StatAppMonitor statAppMonitor = this.f30205a;
        if (statAppMonitor == null) {
            return false;
        }
        jSONObject.put("na", statAppMonitor.getInterfaceName());
        jSONObject.put("rq", this.f30205a.getReqSize());
        jSONObject.put("rp", this.f30205a.getRespSize());
        jSONObject.put("rt", this.f30205a.getResultType());
        jSONObject.put("tm", this.f30205a.getMillisecondsConsume());
        jSONObject.put("rc", this.f30205a.getReturnCode());
        jSONObject.put("sp", this.f30205a.getSampling());
        if (f30204n == null) {
            f30204n = C5392l.m18436l(this.f30201l);
        }
        C5398r.m18466a(jSONObject, C5725m.f31968f, f30204n);
        if (f30203m == null) {
            f30203m = C5392l.m18429g(this.f30201l);
        }
        C5398r.m18466a(jSONObject, "op", f30203m);
        jSONObject.put("cn", C5378a.m18307a(this.f30201l).m18316b());
        return true;
    }
}
