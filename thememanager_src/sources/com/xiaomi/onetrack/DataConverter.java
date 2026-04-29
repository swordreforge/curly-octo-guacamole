package com.xiaomi.onetrack;

import android.os.Bundle;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5806r;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DataConverter {

    /* JADX INFO: renamed from: a */
    private static final String f31512a = "DataConverter";

    /* JADX INFO: renamed from: a */
    private static List m19623a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (C5806r.m20383b(obj)) {
                arrayList.add(obj);
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                HashMap map = new HashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj2 = jSONObject.get(next);
                    if (C5806r.m20383b(obj2)) {
                        map.put(next, obj2);
                    }
                }
                if (map.size() > 0) {
                    arrayList.add(map);
                }
            }
        }
        return arrayList;
    }

    public static Map fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (C5806r.m20383b(obj)) {
                    map.put(str, obj);
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj2 = Array.get(obj, i2);
                        if (C5806r.m20383b(obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        map.put(str, arrayList);
                    }
                } else if (obj instanceof List) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (C5806r.m20383b(obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        map.put(str, arrayList2);
                    }
                } else if (C5804p.f32410a) {
                    C5806r.m20380a(f31512a, str);
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31512a, "convert bundle error:" + e2.toString());
        }
        return map;
    }

    public static Map fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (C5806r.m20383b(obj)) {
                    map.put(next, obj);
                } else if (obj instanceof JSONArray) {
                    map.put(next, m19623a((JSONArray) obj));
                } else if (C5804p.f32410a) {
                    C5806r.m20380a(f31512a, next);
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31512a, "convert json to map error:" + e2.toString());
        }
        return map;
    }
}
