package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatGameUser;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5398r;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5406f extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    private StatGameUser f30202a;

    public C5406f(Context context, int i2, StatGameUser statGameUser, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30202a = null;
        this.f30202a = statGameUser.m28271clone();
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.MTA_GAME_USER;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) {
        StatGameUser statGameUser = this.f30202a;
        if (statGameUser == null) {
            return false;
        }
        C5398r.m18466a(jSONObject, "wod", statGameUser.getWorldName());
        C5398r.m18466a(jSONObject, "gid", this.f30202a.getAccount());
        C5398r.m18466a(jSONObject, "lev", this.f30202a.getLevel());
        return true;
    }
}
