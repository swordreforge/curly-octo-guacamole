package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5398r;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.h */
/* JADX INFO: loaded from: classes3.dex */
public class C5408h extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    public static final StatSpecifyReportedInfo f30206a;

    static {
        StatSpecifyReportedInfo statSpecifyReportedInfo = new StatSpecifyReportedInfo();
        f30206a = statSpecifyReportedInfo;
        statSpecifyReportedInfo.setAppKey("A9VH9B8L4GX4");
    }

    public C5408h(Context context) {
        super(context, 0, f30206a);
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.NETWORK_DETECTOR;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) {
        C5398r.m18466a(jSONObject, "actky", StatConfig.getAppKey(this.f30201l));
        return true;
    }
}
