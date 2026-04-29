package com.xiaomi.onetrack.api;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.as;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p014c.C5738l;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5810v;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ap implements as.InterfaceC5685a, InterfaceC5696j {

    /* JADX INFO: renamed from: a */
    private static final String f31681a = "OneTrackSystemImp";

    /* JADX INFO: renamed from: b */
    private static final int f31682b = 102400;

    /* JADX INFO: renamed from: c */
    private static final int f31683c = 512000;

    /* JADX INFO: renamed from: d */
    private static final int f31684d = 2;

    /* JADX INFO: renamed from: e */
    private final ConcurrentHashMap<String, String> f31685e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    private Configuration f31686f;

    /* JADX INFO: renamed from: g */
    private as f31687g;

    /* JADX INFO: renamed from: h */
    private C5810v f31688h;

    public ap(Configuration configuration, C5810v c5810v) {
        this.f31686f = configuration;
        this.f31688h = c5810v;
        as asVarM19714a = as.m19714a();
        this.f31687g = asVarM19714a;
        asVarM19714a.m19731a(this);
        C5776i.m20256a(new aq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m19711b() {
        try {
            C5738l.m19969a().m19977c(this.f31686f.getAppId());
            if (TextUtils.isEmpty(this.f31686f.getAdEventAppId())) {
                return;
            }
            C5738l.m19969a().m19977c(this.f31686f.getAdEventAppId());
        } catch (Exception e2) {
            C5804p.m20342a(f31681a, "trackCachedEvents: " + e2.toString());
        }
    }

    @Override // com.xiaomi.onetrack.api.InterfaceC5696j
    /* JADX INFO: renamed from: a */
    public void mo19705a(String str, String str2) {
        boolean zM19709a = m19709a(str2);
        C5810v c5810v = this.f31688h;
        if (c5810v != null && !c5810v.m20401a(str) && !zM19709a) {
            C5804p.m20342a(f31681a, "The privacy policy is not permitted, and the event is not basic or recommend event or custom dau event, skip it.");
            return;
        }
        if (m19710a(str, str2, zM19709a)) {
            if (C5735i.m19962b()) {
                C5735i.m19956a(this);
            } else if (!C5693g.f31793i.equalsIgnoreCase(str)) {
                C5735i.m19957a(str, str2);
                return;
            }
            if (C5804p.f32410a) {
                C5804p.m20342a(f31681a, "track name:" + str + " data :" + str2 + " tid" + Process.myTid());
            }
            if (this.f31687g.m19733a(str, str2, this.f31686f, zM19709a)) {
                return;
            }
            String appId = this.f31686f.getAppId();
            if (zM19709a) {
                appId = this.f31686f.getAdEventAppId();
            }
            C5738l.m19969a().m19976a(appId, str, str2);
            if (C5804p.f32410a) {
                C5804p.m20342a(f31681a, "track mIOneTrackService is null! SystemImpCacheManager cache data:" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m19710a(String str, String str2, boolean z2) {
        if (OneTrack.isDisable()) {
            return false;
        }
        if (str != null && str.equals("onetrack_bug_report")) {
            return true;
        }
        if (z2) {
            if (str2 != null && str2.length() > f31683c) {
                C5804p.m20342a(f31681a, "ad Event size exceed limitation!");
                return false;
            }
        } else if (str2 != null && str2.length() * 2 > f31682b) {
            C5804p.m20342a(f31681a, "Event size exceed limitation!");
            return false;
        }
        return true;
    }

    @Override // com.xiaomi.onetrack.api.InterfaceC5696j
    /* JADX INFO: renamed from: a */
    public void mo19704a(int i2) {
        this.f31687g.m19730a(i2);
    }

    @Override // com.xiaomi.onetrack.api.InterfaceC5696j
    /* JADX INFO: renamed from: a */
    public void mo19706a(boolean z2) {
        C5735i.m19956a(this);
    }

    @Override // com.xiaomi.onetrack.api.as.InterfaceC5685a
    /* JADX INFO: renamed from: a */
    public void mo19712a() {
        C5776i.m20256a(new ar(this));
    }

    /* JADX INFO: renamed from: a */
    private boolean m19709a(String str) {
        try {
            return new JSONObject(str).optJSONObject(C5694h.f31812b).optBoolean(C5757b.b.f32130F, false);
        } catch (Throwable unused) {
            C5804p.m20342a(f31681a, "");
            return false;
        }
    }
}
