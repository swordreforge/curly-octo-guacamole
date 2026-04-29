package com.xiaomi.onetrack.p013b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.onetrack.BuildConfig;
import com.xiaomi.onetrack.p015d.C5750d;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p018g.C5765b;
import com.xiaomi.onetrack.p018g.C5766c;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5812x;
import com.xiaomi.onetrack.util.C5814z;
import com.xiaomi.onetrack.util.DeviceUtil;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5713a {

    /* JADX INFO: renamed from: a */
    public static final String f31896a = "disable_log";

    /* JADX INFO: renamed from: b */
    public static final String f31897b = "event";

    /* JADX INFO: renamed from: c */
    public static final String f31898c = "events";

    /* JADX INFO: renamed from: d */
    public static final String f31899d = "level";

    /* JADX INFO: renamed from: e */
    public static final String f31900e = "sample";

    /* JADX INFO: renamed from: f */
    public static final String f31901f = "needIds";

    /* JADX INFO: renamed from: g */
    public static final String f31902g = "bannedParams";

    /* JADX INFO: renamed from: h */
    public static final String f31903h = "version";

    /* JADX INFO: renamed from: i */
    private static final String f31904i = "AppConfigUpdater";

    /* JADX INFO: renamed from: j */
    private static final long f31905j = 172800000;

    /* JADX INFO: renamed from: k */
    private static final String f31906k = "hash";

    /* JADX INFO: renamed from: l */
    private static final String f31907l = "appId";

    /* JADX INFO: renamed from: m */
    private static final String f31908m = "apps";

    /* JADX INFO: renamed from: n */
    private static final String f31909n = "type";

    /* JADX INFO: renamed from: o */
    private static final String f31910o = "status";

    /* JADX INFO: renamed from: p */
    private static final String f31911p = "deleted";

    /* JADX INFO: renamed from: q */
    private static final String f31912q = "Android";

    /* JADX INFO: renamed from: s */
    private static final int f31914s = 0;

    /* JADX INFO: renamed from: t */
    private static final int f31915t = 1;

    /* JADX INFO: renamed from: u */
    private static final int f31916u = 2;

    /* JADX INFO: renamed from: v */
    private static final int f31917v = 100;

    /* JADX INFO: renamed from: x */
    private static final long f31919x = 1800000;

    /* JADX INFO: renamed from: z */
    private static final int f31921z = 0;

    /* JADX INFO: renamed from: r */
    private static AtomicBoolean f31913r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w */
    private static ConcurrentHashMap<String, Long> f31918w = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: y */
    private static b f31920y = new b(Looper.getMainLooper(), null);

    /* JADX INFO: renamed from: A */
    private static ConcurrentHashMap<String, Boolean> f31893A = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: B */
    private static ConcurrentHashMap<String, Boolean> f31894B = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: C */
    private static String f31895C = "";

    /* JADX INFO: renamed from: com.xiaomi.onetrack.b.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private static final C5713a f31922a = new C5713a(null);

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.onetrack.b.a$b */
    static class b extends Handler {
        /* synthetic */ b(Looper looper, RunnableC5714b runnableC5714b) {
            this(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C5804p.m20342a(C5713a.f31904i, "ScheduleCloudHandler.handleMessage, msg.what=" + message.what);
            if (message.what == 0) {
                Object obj = message.obj;
                if (obj == null) {
                    C5804p.m20342a(C5713a.f31904i, "ScheduleCloudHandler.handleMessage, msg.obj is null");
                    return;
                }
                try {
                    String str = (String) obj;
                    C5804p.m20342a(C5713a.f31904i, "ScheduleCloudHandler.handleMessage, appId: " + str);
                    C5776i.m20256a(new RunnableC5716d(this, str));
                } catch (Exception e2) {
                    C5804p.m20347b(C5713a.f31904i, "handleMessage error: " + e2.getMessage());
                }
            }
        }

        private b(Looper looper) {
            super(looper);
        }
    }

    /* synthetic */ C5713a(RunnableC5714b runnableC5714b) {
        this();
    }

    /* JADX INFO: renamed from: d */
    private static void m19889d(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            f31918w.put(list.get(i2), Long.valueOf(System.currentTimeMillis() + f31919x));
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m19891f(String str) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f31894B;
        return concurrentHashMap != null && concurrentHashMap.containsKey(str) && f31894B.get(str).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private boolean m19892g(String str) {
        if (!C5766c.m20110a()) {
            C5804p.m20342a(f31904i, "net is not connected!");
            return false;
        }
        C5724l c5724lM19928f = C5720h.m19910a().m19928f(str);
        if (c5724lM19928f == null) {
            return true;
        }
        long j2 = c5724lM19928f.f31960c;
        return j2 < System.currentTimeMillis() || j2 - System.currentTimeMillis() > f31905j || m19891f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static boolean m19893h(String str) {
        Long l2 = f31918w.get(str);
        return l2 == null || l2.longValue() - System.currentTimeMillis() < 0 || l2.longValue() - System.currentTimeMillis() > f31919x;
    }

    private C5713a() {
        String strM20148C = aa.m20148C();
        if (!TextUtils.isEmpty(strM20148C)) {
            f31895C = strM20148C;
            return;
        }
        String strM20370i = C5805q.m20370i();
        if (TextUtils.isEmpty(strM20370i)) {
            return;
        }
        f31895C = strM20370i;
        aa.m20199l(strM20370i);
    }

    /* JADX INFO: renamed from: a */
    public static C5713a m19872a() {
        return a.f31922a;
    }

    /* JADX INFO: renamed from: b */
    public void m19896b(String str) {
        C5776i.m20256a(new RunnableC5714b(this, str));
    }

    /* JADX INFO: renamed from: c */
    public void m19897c(String str) {
        if (!m19892g(str)) {
            C5804p.m20342a(f31904i, "AppConfigUpdater Does not meet prerequisites for request");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m19885b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m19885b(List<String> list) {
        C5804p.m20342a(f31904i, "pullCloudData start, appIds: " + list.toString());
        if (C5805q.m20361a(f31904i)) {
            return;
        }
        if (f31913r.compareAndSet(false, true)) {
            HashMap map = new HashMap();
            try {
                try {
                    String strM20370i = C5805q.m20370i();
                    if (!TextUtils.isEmpty(strM20370i)) {
                        f31895C = strM20370i;
                        aa.m20199l(strM20370i);
                    }
                    String strM20295a = C5783a.m20293a().m20295a(C5756a.m20053b());
                    if (C5814z.m20421b(strM20295a)) {
                        strM20295a = C5750d.m20025c(strM20295a);
                    }
                    map.put(C5725m.f31963a, strM20295a);
                    map.put(C5725m.f31964b, C5805q.m20365d());
                    map.put(C5725m.f31965c, C5805q.m20364c());
                    map.put(C5725m.f31966d, C5805q.m20369h() ? "1" : "0");
                    map.put(C5725m.f31967e, BuildConfig.SDK_VERSION);
                    map.put(C5725m.f31975m, C5756a.m20055c());
                    map.put(C5725m.f31968f, C5805q.m20366e());
                    map.put(C5725m.f31969g, DeviceUtil.m20117b());
                    map.put(C5725m.f31970h, strM20370i);
                    map.put(C5725m.f31971i, m19888c(list));
                    map.put(C5725m.f31972j, C5756a.m20058e());
                    map.put("platform", f31912q);
                    map.put(C5725m.f31976n, "1");
                    String strM20414c = C5812x.m20403a().m20414c();
                    C5804p.m20342a(f31904i, "pullData:" + strM20414c);
                    String strM20107b = C5765b.m20107b(strM20414c, map, true);
                    C5804p.m20342a(f31904i, "response:" + strM20107b);
                    m19875a(strM20107b, list);
                } catch (Exception e2) {
                    C5804p.m20347b(f31904i, "pullCloudData error: " + e2.getMessage());
                }
            } finally {
                f31913r.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19894a(String str) {
        f31894B.put(str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: a */
    public static void m19875a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") == 0) {
                m19889d(list);
                m19880a(jSONObject.optJSONObject("data").optJSONArray("apps"), list);
            }
        } catch (Exception e2) {
            C5804p.m20342a(f31904i, "saveAppCloudData: " + e2.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19898d(String str) {
        if (TextUtils.isEmpty(f31895C) || TextUtils.isEmpty(str) || TextUtils.equals(f31895C, str)) {
            return;
        }
        Iterator<Map.Entry<String, Boolean>> it = f31894B.entrySet().iterator();
        while (it.hasNext()) {
            it.next().setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m19888c(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = list.get(i2);
                jSONObject.put("appId", str);
                if (m19891f(str)) {
                    jSONObject.put("hash", "");
                } else {
                    jSONObject.put("hash", C5720h.m19910a().m19926d(str));
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m19880a(JSONArray jSONArray, List<String> list) throws JSONException {
        C5804p.m20342a(f31904i, "updateDataToDb start");
        long jCurrentTimeMillis = System.currentTimeMillis() + 86400000 + ((long) new Random().nextInt(86400000));
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("appId");
                C5804p.m20342a(f31904i, "appId: " + strOptString);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                    m19876a(strOptString, jSONObjectOptJSONObject, jCurrentTimeMillis);
                }
            }
            m19879a(list, jCurrentTimeMillis, arrayList);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                f31894B.put(it.next(), Boolean.FALSE);
            }
            return;
        }
        m19878a(list, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: a */
    private static void m19876a(String str, JSONObject jSONObject, long j2) throws JSONException {
        int iOptInt = jSONObject == null ? 0 : jSONObject.optInt("version");
        int iM19927e = C5720h.m19910a().m19927e(str);
        C5804p.m20342a(f31904i, "local version: " + iM19927e + ", server version: " + iOptInt);
        if (iM19927e > 0 && iOptInt < iM19927e && !m19891f(str)) {
            m19881a(jSONObject, j2);
            return;
        }
        int iOptInt2 = jSONObject != null ? jSONObject.optInt("type") : -1;
        C5804p.m20342a(f31904i, "type: " + iOptInt2);
        if (iOptInt2 == 0 || iOptInt2 == 1 || m19891f(str)) {
            m19882a(jSONObject, j2, iOptInt);
        } else if (iOptInt2 == 2) {
            m19886b(jSONObject, j2);
        } else {
            C5804p.m20342a(f31904i, "handleData do nothing!");
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m19886b(JSONObject jSONObject, long j2) {
        ArrayList<C5724l> arrayList = new ArrayList<>();
        if (jSONObject != null && jSONObject.has("events")) {
            C5724l c5724l = new C5724l();
            c5724l.f31961d = jSONObject.optString("hash");
            String strOptString = jSONObject.optString("appId");
            c5724l.f31958a = strOptString;
            c5724l.f31959b = m19883b(jSONObject);
            c5724l.f31960c = j2;
            c5724l.f31962e = m19874a(strOptString, jSONObject);
            arrayList.add(c5724l);
        } else {
            C5804p.m20342a(f31904i, "handleIncrementalUpdate config is not change!");
        }
        if (!arrayList.isEmpty()) {
            C5720h.m19910a().m19920a(arrayList);
        } else {
            C5804p.m20342a(f31904i, "handleIncrementalUpdate no configuration can be updated!");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m19881a(JSONObject jSONObject, long j2) {
        ArrayList<C5724l> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            C5724l c5724l = new C5724l();
            c5724l.f31958a = jSONObject.optString("appId");
            c5724l.f31960c = j2;
            arrayList.add(c5724l);
        }
        if (!arrayList.isEmpty()) {
            C5720h.m19910a().m19920a(arrayList);
        } else {
            C5804p.m20342a(f31904i, "updateMinVersionData no timestamp can be updated!");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m19882a(JSONObject jSONObject, long j2, int i2) throws JSONException {
        C5724l c5724lM19928f;
        JSONObject jSONObject2;
        ArrayList<C5724l> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            C5724l c5724l = new C5724l();
            c5724l.f31961d = jSONObject.optString("hash");
            c5724l.f31958a = jSONObject.optString("appId");
            c5724l.f31959b = m19883b(jSONObject);
            c5724l.f31960c = j2;
            if (!jSONObject.has("events") && (c5724lM19928f = C5720h.m19910a().m19928f(c5724l.f31958a)) != null && (jSONObject2 = c5724lM19928f.f31962e) != null && jSONObject2.optJSONArray("events") != null) {
                jSONObject.put("events", c5724lM19928f.f31962e.optJSONArray("events"));
            }
            c5724l.f31962e = jSONObject;
            arrayList.add(c5724l);
        }
        if (!arrayList.isEmpty()) {
            C5720h.m19910a().m19920a(arrayList);
        } else {
            C5804p.m20342a(f31904i, "handleFullOrNoNewData no configuration can be updated!");
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m19883b(JSONObject jSONObject) {
        try {
            int iOptInt = jSONObject.optInt(f31900e, 100);
            if (iOptInt < 0 || iOptInt > 100) {
                return 100;
            }
            return iOptInt;
        } catch (Exception e2) {
            C5804p.m20342a(f31904i, "getCommonSample Exception:" + e2.getMessage());
            return 100;
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m19874a(String str, JSONObject jSONObject) {
        try {
            C5724l c5724lM19928f = C5720h.m19910a().m19928f(str);
            jSONObject.put("events", m19873a(c5724lM19928f != null ? c5724lM19928f.f31962e.optJSONArray("events") : null, jSONObject.optJSONArray("events")));
            return jSONObject;
        } catch (Exception e2) {
            C5804p.m20347b(f31904i, "mergeConfig: " + e2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONArray m19873a(JSONArray jSONArray, JSONArray jSONArray2) {
        int i2 = 0;
        while (jSONArray2 != null) {
            try {
                if (i2 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject.optString("event");
                int i3 = 0;
                while (true) {
                    if (jSONArray == null || i3 >= jSONArray.length()) {
                        break;
                    }
                    if (TextUtils.equals(strOptString, jSONArray.optJSONObject(i3).optString("event"))) {
                        jSONArray.remove(i3);
                        break;
                    }
                    i3++;
                }
                if (!jSONObjectOptJSONObject.has("status") || (jSONObjectOptJSONObject.has("status") && !TextUtils.equals(jSONObjectOptJSONObject.optString("status"), f31911p))) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    jSONArray.put(jSONObjectOptJSONObject);
                }
                i2++;
            } catch (Exception e2) {
                C5804p.m20347b(f31904i, "mergeEventsElement error:" + e2.toString());
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private static void m19879a(List<String> list, long j2, List<String> list2) {
        try {
            if (list.size() != list2.size()) {
                list.removeAll(list2);
                m19878a(list, j2);
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31904i, "handleInvalidAppIds error:" + e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m19878a(List<String> list, long j2) {
        try {
            ArrayList<C5724l> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < list.size(); i2++) {
                C5724l c5724l = new C5724l();
                c5724l.f31958a = list.get(i2);
                c5724l.f31959b = 100L;
                c5724l.f31960c = j2;
                arrayList.add(c5724l);
            }
            C5720h.m19910a().m19920a(arrayList);
        } catch (Exception e2) {
            C5804p.m20347b(f31904i, "handleError" + e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19895a(JSONObject jSONObject) {
        C5776i.m20256a(new RunnableC5715c(this, jSONObject));
    }
}
