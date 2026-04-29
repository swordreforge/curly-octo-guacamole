package com.xiaomi.accountsdk.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.z */
/* JADX INFO: compiled from: ObjectUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5582z {
    public static Map<String, Object> f7l8(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, toq(jSONObject.opt(next)));
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static List<Object> m19161g(String str) {
        JSONArray jSONArrayM19163n = m19163n(str);
        if (jSONArrayM19163n == null) {
            return null;
        }
        return m19162k(jSONArrayM19163n);
    }

    /* JADX INFO: renamed from: k */
    public static List<Object> m19162k(JSONArray jSONArray) {
        Object qVar = toq(jSONArray);
        if (qVar instanceof List) {
            return (List) qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static JSONArray m19163n(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONArray(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m19164q(Map<?, ?> map) {
        if (map == null) {
            return "null";
        }
        Set<Map.Entry<?, ?>> setEntrySet = map.entrySet();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<?, ?> entry : setEntrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append("(");
            sb.append(key);
            sb.append(",");
            sb.append(value);
            sb.append("),");
        }
        sb.append("}");
        return sb.toString();
    }

    private static Object toq(Object obj) {
        if (obj instanceof JSONObject) {
            return f7l8((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj == JSONObject.NULL) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(toq(jSONArray.opt(i2)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static Map<String, String> m19165y(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && value.size() > 0) {
                    map2.put(key, value.get(0));
                }
            }
        }
        return map2;
    }

    public static Object zy(Object obj) {
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(zy(it.next()));
            }
            return jSONArray;
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            try {
                jSONObject.put((String) obj2, zy(map.get(obj2)));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }
}
