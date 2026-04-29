package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5398r;
import com.xiaomi.accountsdk.account.C5497k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5401a extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    private StatAccount f30180a;

    public C5401a(Context context, int i2, StatAccount statAccount, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30180a = statAccount;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.ADDITION;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        C5398r.m18466a(jSONObject, C5497k.f72765zy, this.f30180a.getAccount());
        jSONObject.put("acc", this.f30180a.toJsonString());
        return true;
    }
}
