package com.miui.maml.util.net;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectUtils {
    private static Object convertObj(Object obj) {
        if (obj instanceof JSONObject) {
            return jsonToMap((JSONObject) obj);
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
            arrayList.add(convertObj(jSONArray.opt(i2)));
        }
        return arrayList;
    }

    public static Object convertObjectToJson(Object obj) {
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(convertObjectToJson(it.next()));
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
                jSONObject.put((String) obj2, convertObjectToJson(map.get(obj2)));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static String flattenMap(Map<?, ?> map) {
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

    public static Map<String, Object> jsonToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, convertObj(jSONObject.opt(next)));
        }
        return map;
    }

    public static Map<String, String> listToMap(Map<String, List<String>> map) {
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

    public static ContentValues mapToPairs(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            contentValues.put(key, value);
        }
        return contentValues;
    }
}
