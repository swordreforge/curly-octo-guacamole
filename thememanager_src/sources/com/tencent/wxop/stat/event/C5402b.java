package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatServiceImpl;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5402b extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    protected C5403c f30181a;

    /* JADX INFO: renamed from: m */
    private long f30182m;

    public C5402b(Context context, int i2, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        C5403c c5403c = new C5403c();
        this.f30181a = c5403c;
        this.f30182m = -1L;
        c5403c.f30183a = str;
    }

    /* JADX INFO: renamed from: h */
    private void m18481h() {
        Properties commonKeyValueForKVEvent;
        String str = this.f30181a.f30183a;
        if (str == null || (commonKeyValueForKVEvent = StatServiceImpl.getCommonKeyValueForKVEvent(str)) == null || commonKeyValueForKVEvent.size() <= 0) {
            return;
        }
        JSONObject jSONObject = this.f30181a.f30185c;
        if (jSONObject == null || jSONObject.length() == 0) {
            this.f30181a.f30185c = new JSONObject(commonKeyValueForKVEvent);
            return;
        }
        for (Map.Entry entry : commonKeyValueForKVEvent.entrySet()) {
            try {
                this.f30181a.f30185c.put(entry.getKey().toString(), entry.getValue());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.CUSTOM;
    }

    /* JADX INFO: renamed from: a */
    public void m18482a(long j2) {
        this.f30182m = j2;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        String str;
        jSONObject.put("ei", this.f30181a.f30183a);
        long j2 = this.f30182m;
        if (j2 > 0) {
            jSONObject.put("du", j2);
        }
        Object obj = this.f30181a.f30184b;
        if (obj == null) {
            m18481h();
            obj = this.f30181a.f30185c;
            str = "kv";
        } else {
            str = "ar";
        }
        jSONObject.put(str, obj);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C5403c m18483b() {
        return this.f30181a;
    }
}
