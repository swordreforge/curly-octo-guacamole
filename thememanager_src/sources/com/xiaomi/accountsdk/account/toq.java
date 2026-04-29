package com.xiaomi.accountsdk.account;

import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.accountsdk.account.data.C5481n;
import com.xiaomi.accountsdk.account.data.C5487q;
import com.xiaomi.accountsdk.account.data.kja0;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.o1t;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.C5582z;
import com.xiaomi.accountsdk.utils.lvui;
import com.xiaomi.accountsdk.utils.n7h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceInfoHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f30786k = "DeviceInfoHelper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Integer f72810toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f72811zy = 0;

    private static ArrayList<kja0> f7l8(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<kja0> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                arrayList.add(new kja0(jSONObjectOptJSONObject.optString("simId"), jSONObjectOptJSONObject.optString("phone")));
            }
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f30786k, "setPhoneInfo", e2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private static C5481n m18822g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        C5481n c5481n = new C5481n(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            c5481n.m18688g(jSONObject.optString("fullImageUrl"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(lvui.m19105g(Locale.getDefault()));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("default");
            }
            if (jSONObjectOptJSONObject != null) {
                c5481n.f7l8(jSONObjectOptJSONObject.optString("modelName"));
                c5481n.m18690n(jSONObjectOptJSONObject.optString("deviceName"));
            }
        } catch (JSONException e2) {
            AbstractC5574n.o1t(f30786k, e2);
        }
        return c5481n;
    }

    /* JADX INFO: renamed from: k */
    private static JSONArray m18823k(Map<String, Object> map) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object objZy = C5582z.zy(entry.getValue());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", key);
                jSONObject.put("value", objZy);
            } catch (JSONException e2) {
                AbstractC5574n.m19113q(f30786k, "convertDevSettingValues", e2);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: n */
    private static n7h<String, String> m18824n(com.xiaomi.accountsdk.account.data.n7h n7hVar) {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        n7h<String, String> n7hVarEasyPut = new n7h().easyPut(InterfaceC1925p.du, n7hVar.m18695q());
        if (TextUtils.isEmpty(n7hVar.m18693k())) {
            n7hVarEasyPut.easyPut("userId", n7hVar.m18694n());
        } else {
            n7hVarEasyPut.easyPut(InterfaceC1925p.dqjj, n7hVar.m18693k());
        }
        return n7hVarEasyPut;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static boolean m18825p(String str, String str2, String str3, String str4, String str5, Map<String, Object> map) throws com.xiaomi.accountsdk.request.n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return m18827s(new com.xiaomi.accountsdk.account.data.n7h(str, str2, null, str3, str4), str5, map);
    }

    /* JADX INFO: renamed from: q */
    public static HashMap<String, C5481n> m18826q(ArrayList<String> arrayList) throws com.xiaomi.accountsdk.request.n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (arrayList == null) {
            throw new IllegalArgumentException("invalid parameter");
        }
        HashMap<String, C5481n> map = new HashMap<>();
        if (arrayList.size() == 0) {
            return map;
        }
        wvg.C5555y c5555yM19001s = C5550t.m19001s(C5504y.f72833kja0, new n7h().easyPut("models", new JSONArray((Collection) arrayList).toString()), null, true);
        if (c5555yM19001s == null) {
            throw new com.xiaomi.accountsdk.request.n7h("failed to getModelInfos");
        }
        try {
            JSONObject jSONObject = new JSONObject(c5555yM19001s.m19020s());
            if (jSONObject.getInt("code") == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String strM19105g = lvui.m19105g(Locale.getDefault());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str = arrayList.get(i2);
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(str);
                    C5481n c5481n = new C5481n(str);
                    c5481n.f7l8(str);
                    if (jSONObjectOptJSONObject != null) {
                        c5481n.m18688g(jSONObjectOptJSONObject.optString("fullImageUrl"));
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strM19105g);
                        if (jSONObjectOptJSONObject2 == null) {
                            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("default");
                        }
                        if (jSONObjectOptJSONObject2 != null) {
                            c5481n.m18690n(jSONObjectOptJSONObject2.optString("deviceName"));
                            c5481n.f7l8(jSONObjectOptJSONObject2.optString("modelName"));
                        }
                    }
                    map.put(str, c5481n);
                }
            }
            return map;
        } catch (JSONException e2) {
            AbstractC5574n.m19116z(f30786k, "fail to parse JSONObject", e2);
            throw new com.xiaomi.accountsdk.request.n7h(c5555yM19001s.toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m18827s(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, Map<String, Object> map) throws com.xiaomi.accountsdk.request.n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null || map == null) {
            throw new IllegalArgumentException("invalid parameter");
        }
        JSONArray jSONArrayM18823k = m18823k(map);
        HashMap map2 = new HashMap();
        map2.put("userId", n7hVar.m18694n());
        map2.put(C5487q.f30669g, str);
        map2.put("content", jSONArrayM18823k.toString());
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f30793h, map2, m18824n(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to upload device settings info");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        c5553nM18974g.m19019s("description");
        if (f72810toq.equals(objM19019s)) {
            return true;
        }
        AbstractC5574n.m19111k(f30786k, "failed upload dev name, code: " + objM19019s);
        return false;
    }

    public static ArrayList<HashMap<String, Object>> toq(com.xiaomi.accountsdk.account.data.n7h n7hVar, ArrayList<String> arrayList) throws C5545n, com.xiaomi.accountsdk.request.n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("null passportInfo");
        }
        if (arrayList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        wvg.C5553n c5553nM18975k = o1t.m18975k(C5504y.f72815cdj, new n7h().easyPut("userId", n7hVar.m18694n()).easyPut("meta", jSONArray.toString()), m18824n(n7hVar), true, n7hVar.toq());
        if (c5553nM18975k == null) {
            throw new IOException("failed to get devices list");
        }
        Object objM19019s = c5553nM18975k.m19019s("code");
        AbstractC5574n.fu4(f30786k, "getDeviceList code : " + objM19019s);
        if (f72810toq.equals(objM19019s)) {
            Object objM19019s2 = c5553nM18975k.m19019s("data");
            if (objM19019s2 instanceof Map) {
                Object obj = ((Map) objM19019s2).get("all_device_settings");
                if (obj instanceof ArrayList) {
                    ArrayList<HashMap<String, Object>> arrayList2 = (ArrayList) obj;
                    Iterator<HashMap<String, Object>> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        m18828y(it2.next());
                    }
                    return arrayList2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static void m18828y(HashMap<String, Object> map) {
        if (map == null) {
            return;
        }
        if (map.get(C5487q.f30671n) != null) {
            map.put(C5487q.f30671n, f7l8(map.get(C5487q.f30671n).toString()));
        }
        if (map.get("model") == null || map.get(C5487q.f30673s) == null) {
            return;
        }
        map.put(C5487q.f30673s, m18822g(map.get("model").toString(), map.get(C5487q.f30673s).toString()));
    }

    public static HashMap<String, Object> zy(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, List<String> list) throws C5545n, com.xiaomi.accountsdk.request.n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("null passportInfo");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        wvg.C5553n c5553nM18975k = o1t.m18975k(C5504y.f30793h, new n7h().easyPut("userId", n7hVar.m18694n()).easyPut(C5487q.f30669g, str).easyPut("meta", jSONArray.toString()), m18824n(n7hVar), true, n7hVar.toq());
        if (c5553nM18975k == null) {
            throw new IOException("failed to get device info");
        }
        Object objM19019s = c5553nM18975k.m19019s("code");
        AbstractC5574n.fu4(f30786k, "getDeviceInfo code : " + objM19019s);
        if (f72810toq.equals(objM19019s)) {
            Object objM19019s2 = c5553nM18975k.m19019s("data");
            if (objM19019s2 instanceof Map) {
                Object obj = ((Map) objM19019s2).get("settings");
                if (obj instanceof ArrayList) {
                    HashMap<String, Object> map = new HashMap<>();
                    for (HashMap map2 : (ArrayList) obj) {
                        map.put((String) map2.get("name"), map2.get("value"));
                    }
                    m18828y(map);
                    return map;
                }
            }
        }
        throw new com.xiaomi.accountsdk.request.n7h("failed to get device info : " + c5553nM18975k.toString());
    }
}
