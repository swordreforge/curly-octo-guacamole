package com.xiaomi.ad.entity.util;

import android.text.TextUtils;
import com.xiaomi.ad.entity.contract.InterfaceC5588g;
import com.xiaomi.ad.entity.contract.f7l8;
import com.xiaomi.mipush.sdk.C5658n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import u38j.C7683q;

/* JADX INFO: renamed from: com.xiaomi.ad.entity.util.k */
/* JADX INFO: compiled from: EntityUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5595k {

    /* JADX INFO: renamed from: k */
    private static final String f31137k = "EntityUtils";

    /* JADX INFO: renamed from: q */
    private static final String f31138q = "deserialize";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73023toq = "type";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f73024zy = "value";

    /* JADX INFO: renamed from: k */
    public static <T extends InterfaceC5588g> T m19208k(T t2, String str) {
        return toq(m19209n(t2, zy(str)), zy(str));
    }

    /* JADX INFO: renamed from: n */
    public static String m19209n(InterfaceC5588g interfaceC5588g, String str) {
        if (interfaceC5588g == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", interfaceC5588g.getClass().getCanonicalName());
            jSONObject.put("value", interfaceC5588g.serialize());
        } catch (JSONException unused) {
            C7683q.m28057q(f31137k, "serialize exception, entity str: " + interfaceC5588g.serialize());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: q */
    public static List<String> m19210q(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static f7l8 toq(String str, String str2) {
        String strOptString;
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                jSONObject = new JSONObject(str);
                strOptString = jSONObject.optString("type");
            } catch (JSONException e2) {
                C7683q.m28055n(zy(f31137k), "deserialize exception, entity: " + str, e2);
                return null;
            }
        } catch (ClassNotFoundException e3) {
            e = e3;
            strOptString = null;
        } catch (IllegalAccessException e4) {
            e = e4;
            strOptString = null;
        } catch (NoSuchMethodException e6) {
            e = e6;
            strOptString = null;
        } catch (InvocationTargetException e7) {
            e = e7;
            strOptString = null;
        }
        try {
            if (TextUtils.isEmpty(strOptString)) {
                C7683q.m28057q(zy(f31137k), "entityClass is empty");
                return null;
            }
            String strOptString2 = jSONObject.optString("value");
            if (TextUtils.isEmpty(strOptString2)) {
                C7683q.m28057q(zy(f31137k), "entityContent is empty");
                return null;
            }
            Method declaredMethod = Class.forName(strOptString).getDeclaredMethod(f31138q, String.class);
            declaredMethod.setAccessible(true);
            return (f7l8) declaredMethod.invoke(null, strOptString2);
        } catch (ClassNotFoundException e8) {
            e = e8;
            C7683q.m28055n(zy(str2), String.format("no entity class [%s], entity str: %s", strOptString, str), e);
            return null;
        } catch (IllegalAccessException e9) {
            e = e9;
            C7683q.m28055n(zy(str2), String.format("illegal access [%s.%s], entity str: %s", strOptString, f31138q, str), e);
            return null;
        } catch (NoSuchMethodException e10) {
            e = e10;
            C7683q.m28055n(zy(str2), String.format("no entity method [%s] in class [%s], entity str: %s", f31138q, strOptString, str), e);
            return null;
        } catch (InvocationTargetException e11) {
            e = e11;
            C7683q.m28055n(zy(str2), String.format("invocation [%s.%s] exception, entity str: %s", strOptString, f31138q, str), e);
            return null;
        }
    }

    private static String zy(String str) {
        return str + C5658n.f73185t8r + f31137k;
    }
}
