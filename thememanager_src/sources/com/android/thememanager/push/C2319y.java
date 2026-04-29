package com.android.thememanager.push;

import android.text.TextUtils;
import com.android.thememanager.push.InterfaceC2316n;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.thememanager.push.y */
/* JADX INFO: compiled from: ThemePushMessage.java */
/* JADX INFO: loaded from: classes2.dex */
class C2319y implements InterfaceC2316n {

    /* JADX INFO: renamed from: p */
    String f13522p = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    EnumC2318s f60621ld6 = EnumC2318s.PUSH_DEFAULT;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    Map<String, String> f60622x2 = new HashMap();

    C2319y() {
    }

    /* JADX INFO: renamed from: k */
    private static void m8472k(String jsonStr, Map<String, String> storeMap) {
        if (TextUtils.isEmpty(jsonStr)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                storeMap.put(next, jSONObject.optString(next, ""));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    static C2319y toq(MiPushMessage pushMesage) {
        C2319y c2319y = new C2319y();
        c2319y.f60622x2.put(InterfaceC2316n.zy.f60619toq, pushMesage.getTitle());
        c2319y.f60622x2.put(InterfaceC2316n.zy.f60620zy, pushMesage.getDescription());
        m8472k(pushMesage.getContent(), c2319y.f60622x2);
        m8472k(c2319y.f60622x2.remove("content"), c2319y.f60622x2);
        m8472k(c2319y.f60622x2.remove("data"), c2319y.f60622x2);
        Map<String, String> extra = pushMesage.getExtra();
        if (extra != null) {
            c2319y.f60622x2.putAll(extra);
        }
        c2319y.f60621ld6 = EnumC2318s.getType(c2319y.f60622x2.get("type"));
        c2319y.f13522p = pushMesage.getMessageId();
        return c2319y;
    }
}
