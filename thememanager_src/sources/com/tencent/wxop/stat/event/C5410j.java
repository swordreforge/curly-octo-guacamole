package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5398r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.j */
/* JADX INFO: loaded from: classes3.dex */
public class C5410j extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    Long f30210a;

    /* JADX INFO: renamed from: m */
    String f30211m;

    /* JADX INFO: renamed from: n */
    String f30212n;

    public C5410j(Context context, String str, String str2, int i2, Long l2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30212n = str;
        this.f30211m = str2;
        this.f30210a = l2;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.PAGE_VIEW;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        C5398r.m18466a(jSONObject, "pi", this.f30211m);
        C5398r.m18466a(jSONObject, "rf", this.f30212n);
        Long l2 = this.f30210a;
        if (l2 == null) {
            return true;
        }
        jSONObject.put("du", l2);
        return true;
    }
}
