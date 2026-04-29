package com.xiaomi.onetrack.api;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.p013b.C5713a;
import com.xiaomi.onetrack.p013b.C5720h;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.p017f.C5759d;
import com.xiaomi.onetrack.p017f.C5762g;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5810v;
import com.xiaomi.onetrack.util.C5814z;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class an implements InterfaceC5696j {

    /* JADX INFO: renamed from: a */
    private static final String f31673a = "OneTrackLocalImp";

    /* JADX INFO: renamed from: b */
    private static final int f31674b = 102400;

    /* JADX INFO: renamed from: c */
    private static final int f31675c = 512000;

    /* JADX INFO: renamed from: d */
    private static final int f31676d = 2;

    /* JADX INFO: renamed from: e */
    private Configuration f31677e;

    /* JADX INFO: renamed from: f */
    private C5810v f31678f;

    public an(Context context, Configuration configuration, C5810v c5810v) {
        C5762g.m20098a(context);
        this.f31677e = configuration;
        this.f31678f = c5810v;
    }

    /* JADX INFO: renamed from: b */
    private boolean m19701b(String str, String str2) {
        List<String> listM20418a;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] strArrSplit = str.split(C5814z.f32495a);
            if (strArrSplit != null && strArrSplit.length >= 5 && (listM20418a = C5814z.m20418a(str2, ",")) != null) {
                if (listM20418a.contains(strArrSplit[4])) {
                    return true;
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31673a, "isMatchId error：" + e2.toString());
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m19702c(String str, String str2) {
        try {
            return C5720h.m19910a().m19922a(str, str2, C5713a.f31896a, false);
        } catch (Exception e2) {
            C5804p.m20347b(f31673a, "isDisableTrackForEvent error: " + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m19703d(String str, String str2) {
        long jM19923b = C5720h.m19910a().m19923b(str, str2);
        long jAbs = Math.abs(C5783a.m20293a().m20295a(C5756a.m20053b()).hashCode()) % 100;
        boolean z2 = jM19923b > jAbs;
        C5804p.m20342a(f31673a, "shouldUploadBySampling " + str2 + ",  shouldUpload=" + z2 + ", sample=" + jM19923b + ", val=" + jAbs);
        return !z2;
    }

    @Override // com.xiaomi.onetrack.api.InterfaceC5696j
    /* JADX INFO: renamed from: a */
    public void mo19705a(String str, String str2) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = null;
        try {
            jSONObject = new JSONObject(str2);
            try {
                jSONObjectOptJSONObject = jSONObject.optJSONObject(C5694h.f31812b);
                try {
                    jSONObjectOptJSONObject2 = jSONObject.optJSONObject("B");
                } catch (JSONException e2) {
                    e = e2;
                    C5804p.m20342a(f31673a, " data JSONException e:" + e.getMessage());
                }
            } catch (JSONException e3) {
                e = e3;
                jSONObjectOptJSONObject = null;
            }
        } catch (JSONException e4) {
            e = e4;
            jSONObject = null;
            jSONObjectOptJSONObject = null;
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject2;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObjectOptJSONObject;
        boolean zM19700a = m19700a(jSONObject4);
        C5810v c5810v = this.f31678f;
        if (c5810v != null && !c5810v.m20401a(str) && !zM19700a) {
            C5804p.m20342a(f31673a, "The privacy policy is not permitted, and the event is not basic or recommend event or custom dau event, skip it.");
            return;
        }
        if (m19707a(str, str2, zM19700a)) {
            if (!C5735i.m19962b()) {
                C5735i.m19957a(str, str2);
                return;
            }
            C5735i.m19956a(this);
            if (C5804p.f32410a && !str.equalsIgnoreCase("onetrack_bug_report")) {
                C5804p.m20342a(f31673a, "track data:" + str2);
            }
            if (zM19700a) {
                C5713a.m19872a().m19896b(this.f31677e.getAdEventAppId());
            }
            C5713a.m19872a().m19896b(this.f31677e.getAppId());
            m19697a(str, jSONObject3, jSONObject4, jSONObject2, zM19700a);
        }
    }

    @Override // com.xiaomi.onetrack.api.InterfaceC5696j
    /* JADX INFO: renamed from: a */
    public void mo19704a(int i2) {
        C5776i.m20256a(new ao(this, i2));
    }

    @Override // com.xiaomi.onetrack.api.InterfaceC5696j
    /* JADX INFO: renamed from: a */
    public void mo19706a(boolean z2) {
        C5735i.m19956a(this);
    }

    /* JADX INFO: renamed from: a */
    public boolean m19707a(String str, String str2, boolean z2) {
        if (!OneTrack.isDisable() && !OneTrack.isUseSystemNetTrafficOnly()) {
            if (str != null && str.equals("onetrack_bug_report")) {
                return true;
            }
            if (z2) {
                if (str2 != null && str2.length() > f31675c) {
                    C5804p.m20342a(f31673a, "ad Event size exceed limitation!");
                    return false;
                }
            } else if (str2 != null && str2.length() * 2 > f31674b) {
                C5804p.m20342a(f31673a, "Event size exceed limitation!");
                return false;
            }
            return true;
        }
        C5804p.m20342a(f31673a, "Tracking data is disabled or onetrack use system net traffic only, skip it.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m19697a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z2) {
        String strM19918a = "";
        String appId = this.f31677e.getAppId();
        if (z2) {
            appId = this.f31677e.getAdEventAppId();
        }
        if (m19699a(appId)) {
            C5804p.m20342a(f31673a, "This app disabled tracking data, skip it.");
            return;
        }
        try {
            String strM19918a2 = C5720h.m19910a().m19918a(appId, str, C5713a.f31901f, "");
            String strOptString = jSONObject3 == null ? "" : jSONObject3.optString("tip");
            C5804p.m20342a(f31673a, "tip: " + strOptString + ", needIds: " + strM19918a2);
            if (m19701b(strOptString, strM19918a2)) {
                if (m19702c(appId, str)) {
                    C5804p.m20342a(f31673a, " This event disabled tracking data , skip it.");
                    return;
                } else {
                    if (m19703d(appId, str)) {
                        C5804p.m20342a(f31673a, " This event should not upload by sampling , skip it.");
                        return;
                    }
                    strM19918a = C5720h.m19910a().m19918a(appId, str, C5713a.f31902g, "");
                }
            }
            String strM19925c = C5720h.m19910a().m19925c(appId);
            C5804p.m20342a(f31673a, "bannedParamsForApp: " + strM19925c + ", bannedParamsForEvent: " + strM19918a);
            Set<String> setM20419a = C5814z.m20419a(strM19925c, strM19918a, ",");
            m19698a(jSONObject2, setM20419a);
            m19698a(jSONObject3, setM20419a);
            if (z2) {
                C5759d.m20097b(appId, C5756a.m20058e(), str, jSONObject.toString());
            } else {
                C5759d.m20096a(appId, C5756a.m20058e(), str, jSONObject.toString());
            }
        } catch (Throwable th) {
            C5804p.m20347b(f31673a, "checkCloudControl error：" + th.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m19698a(JSONObject jSONObject, Set<String> set) {
        if (jSONObject != null && set != null && set.size() != 0) {
            C5804p.m20342a(f31673a, "jsonObject: " + jSONObject.toString() + ", bannedParams: " + set.toString());
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    if (set.contains(itKeys.next())) {
                        itKeys.remove();
                    }
                }
                return;
            } catch (Exception e2) {
                C5804p.m20347b(f31673a, "filterParams error：" + e2.toString());
                return;
            }
        }
        C5804p.m20342a(f31673a, "jsonObject is null or bannedParams is empty");
    }

    /* JADX INFO: renamed from: a */
    private boolean m19699a(String str) {
        try {
            return C5720h.m19910a().m19921a(str, C5713a.f31896a);
        } catch (Exception e2) {
            C5804p.m20347b(f31673a, "isDisableTrackForApp error: " + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m19700a(JSONObject jSONObject) {
        try {
            return jSONObject.optBoolean(C5757b.b.f32130F, false);
        } catch (Throwable unused) {
            C5804p.m20342a(f31673a, "");
            return false;
        }
    }
}
