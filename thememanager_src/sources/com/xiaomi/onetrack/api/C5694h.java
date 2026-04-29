package com.xiaomi.onetrack.api;

import android.content.Context;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.ServiceQualityEvent;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5806r;
import com.xiaomi.onetrack.util.C5810v;
import com.xiaomi.onetrack.util.DeviceUtil;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.h */
/* JADX INFO: loaded from: classes3.dex */
public class C5694h {

    /* JADX INFO: renamed from: a */
    public static final String f31811a = "B";

    /* JADX INFO: renamed from: b */
    public static final String f31812b = "H";

    /* JADX INFO: renamed from: c */
    private static final String f31813c = "EventDataBuilder";

    /* JADX INFO: renamed from: a */
    public static String m19790a(String str, JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20061a(str, configuration, iEventHook, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m19792b(JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20061a(C5693g.f31788d, configuration, iEventHook, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m19793c(JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20061a("ot_login", configuration, iEventHook, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m19794d(JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20061a("ot_logout", configuration, iEventHook, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19784a(C5695i c5695i, JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20060a(c5695i, configuration, iEventHook, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19786a(String str, String str2, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject, boolean z2, C5810v c5810v, boolean z3) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f31812b, C5757b.m20061a(str2, configuration, iEventHook, c5810v, z3, false));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C5693g.f31802r, str);
        jSONObject3.put("type", 1);
        jSONObject3.put(C5693g.f31804t, z2);
        jSONObject2.put("B", C5806r.m20379a(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19785a(String str, String str2, long j2, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f31812b, C5757b.m20061a(str2, configuration, iEventHook, c5810v, z2, false));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C5693g.f31802r, str);
        jSONObject3.put("type", 2);
        jSONObject3.put("duration", j2);
        jSONObject2.put("B", C5806r.m20379a(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19787a(String str, String str2, String str3, String str4, String str5, long j2, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObjectM20061a = C5757b.m20061a("onetrack_bug_report", configuration, iEventHook, c5810v, z2, false);
        if (str5 != null) {
            jSONObjectM20061a.put(C5757b.b.f32148o, str5);
        }
        jSONObject2.put(f31812b, jSONObjectM20061a);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("exception", str);
        jSONObject3.put("type", str3);
        jSONObject3.put("message", str2);
        jSONObject3.put("feature", str4);
        jSONObject3.put(C5693g.f31799o, j2);
        jSONObject2.put("B", C5806r.m20379a(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19782a(Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f31812b, C5757b.m20061a("onetrack_dau", configuration, iEventHook, c5810v, z2, false));
        JSONObject jSONObject3 = new JSONObject();
        Context contextM20053b = C5756a.m20053b();
        boolean zM20209s = com.xiaomi.onetrack.util.aa.m20209s();
        if (zM20209s) {
            com.xiaomi.onetrack.util.aa.m20172c(false);
        }
        jSONObject3.put(C5693g.f31808x, zM20209s);
        if (!(C5805q.m20359a() ? C5805q.m20369h() : configuration.isInternational())) {
            if (configuration.isIMEIEnable()) {
                jSONObject3.put(C5693g.f31809y, DeviceUtil.m20128f(contextM20053b));
            }
            if (configuration.isIMSIEnable()) {
                jSONObject3.put(C5693g.f31810z, DeviceUtil.m20134i(contextM20053b));
            }
        }
        jSONObject3.put(C5693g.f31760B, C5692f.m19779a(configuration));
        jSONObject2.put("B", C5806r.m20379a(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19791a(JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20061a(C5693g.f31787c, configuration, iEventHook, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19788a(String str, String str2, JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f31812b, C5757b.m20062a(str2, configuration, iEventHook, str, c5810v, z2, false));
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19781a(Configuration configuration, OneTrack.IEventHook iEventHook, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f31812b, C5757b.m20061a(C5693g.f31793i, configuration, iEventHook, c5810v, z2, false));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("value", C5735i.m19962b());
        jSONObject.put("B", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19783a(ServiceQualityEvent serviceQualityEvent, Configuration configuration, OneTrack.IEventHook iEventHook, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f31812b, C5757b.m20061a(C5693g.f31789e, configuration, iEventHook, c5810v, z2, false));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C5693g.f31761C, serviceQualityEvent.getScheme());
        jSONObject2.put("host", serviceQualityEvent.getHost());
        jSONObject2.put(C5693g.f31763E, serviceQualityEvent.getPort());
        jSONObject2.put("path", serviceQualityEvent.getPath());
        jSONObject2.put(C5693g.f31765G, serviceQualityEvent.getIps());
        jSONObject2.put(C5693g.f31766H, serviceQualityEvent.getResponseCode());
        jSONObject2.put("status", serviceQualityEvent.getStatusCode());
        jSONObject2.put("exception", serviceQualityEvent.getExceptionTag());
        jSONObject2.put("result", serviceQualityEvent.getResultType());
        jSONObject2.put(C5693g.f31770L, serviceQualityEvent.getRetryCount());
        jSONObject2.put(C5693g.f31771M, serviceQualityEvent.getRequestTimestamp());
        jSONObject2.put(C5693g.f31772N, serviceQualityEvent.getRequestNetType());
        jSONObject2.put(C5693g.f31773O, serviceQualityEvent.getDnsLookupTime());
        jSONObject2.put(C5693g.f31774P, serviceQualityEvent.getTcpConnectTime());
        jSONObject2.put(C5693g.f31776R, serviceQualityEvent.getHandshakeTime());
        jSONObject2.put(C5693g.f31777S, serviceQualityEvent.getReceiveFirstByteTime());
        jSONObject2.put(C5693g.f31778T, serviceQualityEvent.getReceiveAllByteTime());
        jSONObject2.put(C5693g.f31775Q, serviceQualityEvent.getRequestDataSendTime());
        jSONObject2.put("duration", serviceQualityEvent.getDuration());
        jSONObject2.put(C5693g.f31780V, serviceQualityEvent.getNetSdkVersion());
        Map<String, Object> extraParams = serviceQualityEvent.getExtraParams();
        if (extraParams != null && extraParams.size() > 0) {
            for (Map.Entry<String, Object> entry : extraParams.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (C5806r.m20383b(value)) {
                    jSONObject2.put(key, value);
                }
            }
        }
        jSONObject.put("B", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19780a(long j2, String str, long j3, long j4, Configuration configuration, OneTrack.IEventHook iEventHook, C5810v c5810v, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f31812b, C5757b.m20061a(C5693g.f31794j, configuration, iEventHook, c5810v, z2, false));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C5693g.f31781W, j2);
        jSONObject2.put(C5693g.f31782X, str);
        jSONObject2.put(C5693g.f31783Y, j3);
        jSONObject2.put(C5693g.f31784Z, j4);
        jSONObject.put("B", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m19789a(String str, JSONObject jSONObject, Configuration configuration, OneTrack.IEventHook iEventHook, JSONObject jSONObject2, C5810v c5810v, JSONArray jSONArray, boolean z2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObjectM20061a = C5757b.m20061a(str, configuration, iEventHook, c5810v, z2, true);
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObjectM20061a.put(C5757b.b.f32132H, jSONArray);
        }
        jSONObject3.put(f31812b, jSONObjectM20061a);
        jSONObject3.put("B", C5806r.m20379a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }
}
