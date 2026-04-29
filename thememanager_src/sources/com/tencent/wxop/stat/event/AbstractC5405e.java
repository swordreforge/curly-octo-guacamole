package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.p003a.p004a.p005a.p006a.C5361y;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.au;
import com.tencent.wxop.stat.common.C5381a;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5398r;
import com.xiaomi.onetrack.p013b.C5725m;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5405e {

    /* JADX INFO: renamed from: j */
    protected static String f30190j;

    /* JADX INFO: renamed from: a */
    private StatSpecifyReportedInfo f30191a;

    /* JADX INFO: renamed from: b */
    protected String f30192b;

    /* JADX INFO: renamed from: c */
    protected long f30193c = System.currentTimeMillis() / 1000;

    /* JADX INFO: renamed from: d */
    protected int f30194d;

    /* JADX INFO: renamed from: e */
    protected C5381a f30195e;

    /* JADX INFO: renamed from: f */
    protected int f30196f;

    /* JADX INFO: renamed from: g */
    protected String f30197g;

    /* JADX INFO: renamed from: h */
    protected String f30198h;

    /* JADX INFO: renamed from: i */
    protected String f30199i;

    /* JADX INFO: renamed from: k */
    protected boolean f30200k;

    /* JADX INFO: renamed from: l */
    protected Context f30201l;

    AbstractC5405e(Context context, int i2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30192b = null;
        this.f30195e = null;
        this.f30197g = null;
        this.f30198h = null;
        this.f30199i = null;
        this.f30200k = false;
        this.f30191a = null;
        this.f30201l = context;
        this.f30194d = i2;
        this.f30198h = StatConfig.getInstallChannel(context);
        this.f30199i = C5392l.m18432h(context);
        this.f30192b = StatConfig.getAppKey(context);
        if (statSpecifyReportedInfo != null) {
            this.f30191a = statSpecifyReportedInfo;
            if (C5392l.m18422c(statSpecifyReportedInfo.getAppKey())) {
                this.f30192b = statSpecifyReportedInfo.getAppKey();
            }
            if (C5392l.m18422c(statSpecifyReportedInfo.getInstallChannel())) {
                this.f30198h = statSpecifyReportedInfo.getInstallChannel();
            }
            if (C5392l.m18422c(statSpecifyReportedInfo.getVersion())) {
                this.f30199i = statSpecifyReportedInfo.getVersion();
            }
            this.f30200k = statSpecifyReportedInfo.isImportant();
        }
        this.f30197g = StatConfig.getCustomUserId(context);
        this.f30195e = au.m18335a(context).m18368b(context);
        EventType eventTypeMo18479a = mo18479a();
        EventType eventType = EventType.NETWORK_DETECTOR;
        this.f30196f = eventTypeMo18479a != eventType ? C5392l.m18441q(context).intValue() : -eventType.m18478a();
        if (C5361y.f7l8(f30190j)) {
            return;
        }
        String localMidOnly = StatConfig.getLocalMidOnly(context);
        f30190j = localMidOnly;
        if (C5392l.m18422c(localMidOnly)) {
            return;
        }
        f30190j = "0";
    }

    /* JADX INFO: renamed from: a */
    public abstract EventType mo18479a();

    /* JADX INFO: renamed from: a */
    public abstract boolean mo18480a(JSONObject jSONObject);

    /* JADX INFO: renamed from: b */
    public boolean m18485b(JSONObject jSONObject) {
        try {
            C5398r.m18466a(jSONObject, "ky", this.f30192b);
            jSONObject.put("et", mo18479a().m18478a());
            C5381a c5381a = this.f30195e;
            if (c5381a != null) {
                jSONObject.put("ui", c5381a.m18382b());
                C5398r.m18466a(jSONObject, "mc", this.f30195e.m18383c());
                int iM18384d = this.f30195e.m18384d();
                jSONObject.put("ut", iM18384d);
                if (iM18384d == 0 && C5392l.m18445u(this.f30201l) == 1) {
                    jSONObject.put("ia", 1);
                }
            }
            C5398r.m18466a(jSONObject, "cui", this.f30197g);
            if (mo18479a() != EventType.SESSION_ENV) {
                C5398r.m18466a(jSONObject, C5725m.f31968f, this.f30199i);
                C5398r.m18466a(jSONObject, "ch", this.f30198h);
            }
            if (this.f30200k) {
                jSONObject.put("impt", 1);
            }
            C5398r.m18466a(jSONObject, "mid", f30190j);
            jSONObject.put("cch", "wxop");
            jSONObject.put("idx", this.f30196f);
            jSONObject.put("si", this.f30194d);
            jSONObject.put("ts", this.f30193c);
            jSONObject.put("dts", C5392l.m18407a(this.f30201l, false));
            return mo18480a(jSONObject);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public long m18486c() {
        return this.f30193c;
    }

    /* JADX INFO: renamed from: d */
    public StatSpecifyReportedInfo m18487d() {
        return this.f30191a;
    }

    /* JADX INFO: renamed from: e */
    public Context m18488e() {
        return this.f30201l;
    }

    /* JADX INFO: renamed from: f */
    public boolean m18489f() {
        return this.f30200k;
    }

    /* JADX INFO: renamed from: g */
    public String m18490g() {
        try {
            JSONObject jSONObject = new JSONObject();
            m18485b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
