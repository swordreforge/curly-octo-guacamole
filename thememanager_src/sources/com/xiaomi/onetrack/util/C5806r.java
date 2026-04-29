package com.xiaomi.onetrack.util;

import android.text.TextUtils;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.p015d.C5750d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.r */
/* JADX INFO: loaded from: classes3.dex */
public class C5806r {

    /* JADX INFO: renamed from: a */
    public static final String f32446a = "onetrack_";

    /* JADX INFO: renamed from: b */
    public static final String f32447b = "ot_";

    /* JADX INFO: renamed from: c */
    private static final String f32448c = "ParamUtil";

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo20388a(Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20378a(Map<String, Object> map, boolean z2) {
        return m20377a(map, new C5807s(z2));
    }

    /* JADX INFO: renamed from: b */
    private static boolean m20384b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static boolean m20387d(Object obj) {
        return obj instanceof Number;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20376a(Map<String, Object> map) {
        return m20377a(map, new C5808t());
    }

    /* JADX INFO: renamed from: c */
    private static boolean m20386c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (i2 == 0 && Character.isDigit(c2)) {
                return false;
            }
            if (c2 != '_' && !Character.isDigit(c2) && ((c2 < 'a' || c2 > 'z') && (c2 < 'A' || c2 > 'Z'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m20377a(Map<String, Object> map, a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!aVar.mo20388a(value)) {
                    if (C5804p.f32410a) {
                        m20380a(f32448c, entry.getKey());
                    }
                } else if (m20383b(value)) {
                    jSONObject.put(key, value);
                } else if (value instanceof List) {
                    jSONObject.put(key, m20375a((List) value));
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b(f32448c, "checkParam error:" + e2.toString());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20383b(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String);
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m20375a(List list) throws JSONException {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (m20383b(obj)) {
                jSONArray.put(obj);
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                boolean z2 = false;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof String) && m20383b(value)) {
                        jSONObject.put((String) key, value);
                        z2 = true;
                    }
                }
                if (z2) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m20380a(String str, String str2) {
        C5804p.m20347b(str, "key is " + str2 + ", the param value is invalid，please change the parameter type to string ,numeric, boolean！");
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20379a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null && jSONObject2 != null) {
            return jSONObject2;
        }
        if (jSONObject != null && jSONObject2 == null) {
            return jSONObject;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
            return jSONObject2;
        } catch (Exception e2) {
            C5804p.m20347b(f32448c, "merge error：" + e2.toString());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20381a(Object obj) {
        return m20383b(obj) || (obj instanceof List);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20382a(String str) {
        if (!m20386c(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return (lowerCase.startsWith(f32446a) || lowerCase.startsWith(f32447b)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static String m20374a(Configuration configuration) {
        StringBuilder sb = new StringBuilder();
        String appId = configuration.getAppId();
        String pluginId = configuration.getPluginId();
        if (!TextUtils.isEmpty(appId)) {
            sb.append(appId);
        }
        if (!TextUtils.isEmpty(pluginId)) {
            sb.append(pluginId);
        }
        return C5750d.m20034h(sb.toString());
    }
}
