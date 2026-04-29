package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.accountsdk.guestaccount.data.EnumC5515n;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccount;
import com.xiaomi.accountsdk.guestaccount.f7l8;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.C5567h;
import com.xiaomi.accountsdk.utils.C5577s;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GuestAccountOnlineFetcher.java */
/* JADX INFO: loaded from: classes3.dex */
class x2 {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f72889a9 = "GuestAccountOnlineFetch";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f72890cdj = "visitorType";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72891f7l8 = "appPackage";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f72892fn3e = "code";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f72893fu4 = "_serviceToken";

    /* JADX INFO: renamed from: g */
    private static final String f30889g = "visitorType";

    /* JADX INFO: renamed from: h */
    private static final String f30890h = "_sign";

    /* JADX INFO: renamed from: i */
    private static final String f30891i = "visitorPassToken";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    static final String f72894jk = "BEYBuDbVZqYHzAVT+TAAAA==";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f72895ki = "visitorId";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f72896kja0 = "visitorId";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f72897ld6 = "fidNonce";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f72898mcp = "ssecurity";

    /* JADX INFO: renamed from: n */
    private static final String f30892n = "psid";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f72899n7h = "visitorPassToken";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f72900ni7 = "data";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f72901o1t = "_ph";

    /* JADX INFO: renamed from: p */
    private static final String f30893p = "visitorSdkVersion";

    /* JADX INFO: renamed from: q */
    private static final String f30894q = "sid";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f72902qrj = "callback";

    /* JADX INFO: renamed from: s */
    private static final String f30895s = "visitorDeviceId";

    /* JADX INFO: renamed from: t */
    private static final String f30896t = "visitorId";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f72903t8r = "cVisitorId";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f72904wvg = "callback";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f72905x2 = "fidNonceSign";

    /* JADX INFO: renamed from: y */
    private static final String f30897y = "clientInfo";

    /* JADX INFO: renamed from: z */
    private static final String f30898z = "_slh";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f72906zurt = "result";

    /* JADX INFO: renamed from: k */
    private final Context f30899k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC5518g f72907toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private f7l8 f72908zy = new C5529y();

    /* JADX INFO: compiled from: GuestAccountOnlineFetcher.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        final Integer f30900k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final JSONObject f72909toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final JSONObject f72910zy;

        private toq(Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f30900k = num;
            this.f72909toq = jSONObject;
            this.f72910zy = jSONObject2;
        }
    }

    /* JADX INFO: compiled from: GuestAccountOnlineFetcher.java */
    static class zy {

        /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.x2$zy$k */
        /* JADX INFO: compiled from: GuestAccountOnlineFetcher.java */
        static class C5528k {

            /* JADX INFO: renamed from: k */
            static final String f30901k = "https://v.id.mi.com/visitor/register";

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            static final String f72911toq = "https://v.id.mi.com/visitor/login";

            C5528k() {
            }
        }

        /* JADX INFO: compiled from: GuestAccountOnlineFetcher.java */
        static class toq {

            /* JADX INFO: renamed from: k */
            static final String f30902k = "http://visitor.preview.n.xiaomi.net/visitor/register";

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            static final String f72912toq = "http://visitor.preview.n.xiaomi.net/visitor/login";

            toq() {
            }
        }

        zy() {
        }
    }

    x2(Context context) {
        this.f72907toq = new C5523n(context);
        this.f30899k = context;
    }

    static boolean f7l8(Context context) {
        return new File(context.getFilesDir(), "staging.flag").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private toq m18892k(String str) {
        JSONObject jSONObject = null;
        try {
            return m18893p(this.f72908zy.mo18870q(str));
        } catch (IOException e2) {
            AbstractC5574n.o1t(f72889a9, e2);
            return new toq(6, jSONObject, null == true ? 1 : 0);
        } catch (JSONException e3) {
            AbstractC5574n.o1t(f72889a9, e3);
            return new toq(5, null == true ? 1 : 0, null == true ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private toq ld6(String str, Map<String, String> map, Map<String, String> map2) {
        JSONObject jSONObject = null;
        try {
            return m18893p(this.f72908zy.mo18869k(str, map, map2));
        } catch (IOException e2) {
            AbstractC5574n.o1t(f72889a9, e2);
            return new toq(6, jSONObject, null == true ? 1 : 0);
        } catch (JSONException e3) {
            AbstractC5574n.o1t(f72889a9, e3);
            return new toq(5, null == true ? 1 : 0, null == true ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private toq m18893p(f7l8.C5517k c5517k) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (c5517k.f72870toq == null) {
            int i2 = c5517k.f30853k;
            if (i2 >= 100) {
                return new toq(Integer.valueOf(i2), jSONObject2, null == true ? 1 : 0);
            }
            throw new IllegalStateException("rawresponse.responseCode = " + c5517k.f30853k + " < 100");
        }
        JSONObject jSONObject3 = new JSONObject(c5517k.f72870toq);
        int i3 = jSONObject3.getInt("code");
        if (i3 != 0) {
            return new toq(Integer.valueOf(i3), null == true ? 1 : 0, null == true ? 1 : 0);
        }
        if (!TextUtils.equals(jSONObject3.getString("result"), "ok")) {
            return new toq(5, null == true ? 1 : 0, null == true ? 1 : 0);
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
        if (jSONObject4 == null) {
            return new toq(5, null == true ? 1 : 0, null == true ? 1 : 0);
        }
        try {
            jSONObject = new JSONObject(c5517k.f72871zy);
        } catch (JSONException e2) {
            AbstractC5574n.m19116z(f72889a9, "", e2);
            jSONObject = null;
        }
        return new toq(null == true ? 1 : 0, jSONObject4, jSONObject);
    }

    /* JADX INFO: renamed from: q */
    static String m18894q(Context context) {
        return f7l8(context) ? "http://visitor.preview.n.xiaomi.net/visitor/register" : "https://v.id.mi.com/visitor/register";
    }

    /* JADX INFO: renamed from: s */
    private String m18895s() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("macAddress", C5577s.f7l8(this.f72907toq.mo18872n(), 10));
            jSONObject.putOpt("bluetooth", C5577s.f7l8(this.f72907toq.mo18873q(), 10));
            jSONObject.putOpt("aid", this.f72907toq.zy());
            return jSONObject.toString();
        } catch (JSONException unused) {
            throw new IllegalStateException("should never happen");
        }
    }

    static String toq(Context context) {
        return f7l8(context) ? "http://visitor.preview.n.xiaomi.net/visitor/login" : "https://v.id.mi.com/visitor/login";
    }

    /* JADX INFO: renamed from: g */
    String m18896g(String str) {
        return str + f30898z;
    }

    com.xiaomi.accountsdk.guestaccount.data.zy kja0(GuestAccount guestAccount) {
        String str = guestAccount.f30832p;
        if (str == null) {
            throw new IllegalArgumentException("guestAccount.callback == null");
        }
        try {
            f7l8.C5517k c5517kMo18870q = this.f72908zy.mo18870q(str);
            int i2 = c5517kMo18870q.f30853k;
            if (i2 < 100) {
                throw new IllegalStateException("rawresponse.responseCode = " + c5517kMo18870q.f30853k + " < 100");
            }
            if (i2 != 200) {
                return new com.xiaomi.accountsdk.guestaccount.data.zy().m18864g(c5517kMo18870q.f30853k);
            }
            Map<String, String> map = c5517kMo18870q.f30854q;
            if (map == null) {
                return new com.xiaomi.accountsdk.guestaccount.data.zy().m18864g(5);
            }
            String str2 = map.get(InterfaceC1925p.du);
            if (TextUtils.isEmpty(str2)) {
                return new com.xiaomi.accountsdk.guestaccount.data.zy().m18864g(5);
            }
            String str3 = c5517kMo18870q.f30854q.get(f72903t8r);
            String str4 = c5517kMo18870q.f30854q.get(m18896g(guestAccount.f30831n));
            String str5 = c5517kMo18870q.f30854q.get(zy(guestAccount.f30831n));
            GuestAccount.C5512k c5512kFn3e = new GuestAccount.C5512k().fn3e(guestAccount.f30830k);
            if (TextUtils.isEmpty(str3)) {
                str3 = guestAccount.f30833q;
            }
            return new com.xiaomi.accountsdk.guestaccount.data.zy().m18868y(c5512kFn3e.x2(str3).ki(guestAccount.f30831n).cdj(str2).m18855h(guestAccount.f30835y).n7h(guestAccount.f30834s).t8r(str4).kja0(str5).ld6());
        } catch (IOException e2) {
            AbstractC5574n.o1t(f72889a9, e2);
            return new com.xiaomi.accountsdk.guestaccount.data.zy().m18864g(6);
        }
    }

    /* JADX INFO: renamed from: n */
    String m18897n(String str) {
        return str + f72893fu4;
    }

    void n7h(f7l8 f7l8Var) {
        if (f7l8Var == null) {
            throw new IllegalArgumentException("request == null");
        }
        this.f72908zy = f7l8Var;
    }

    void qrj(InterfaceC5518g interfaceC5518g) {
        if (interfaceC5518g == null) {
            throw new IllegalArgumentException("hardwareInfoFetcher == null");
        }
        this.f72907toq = interfaceC5518g;
    }

    com.xiaomi.accountsdk.guestaccount.data.zy x2(EnumC5515n enumC5515n, String str, String str2, String str3) {
        String str4;
        if (enumC5515n == null) {
            enumC5515n = EnumC5515n.DEFAULT;
        }
        C5567h qVar = this.f72907toq.toq();
        if (qVar == null || qVar.f31024k == null || qVar.f72965toq == null) {
            enumC5515n = EnumC5515n.DEFAULT;
        }
        String packageName = this.f30899k.getPackageName();
        String strM18895s = m18895s();
        String strM18894q = m18894q(this.f30899k);
        String strMo18871k = this.f72907toq.mo18871k();
        HashMap map = new HashMap();
        map.put("visitorType", String.valueOf(enumC5515n.serverValue));
        map.put(f30894q, str);
        map.put(f30892n, str3);
        map.put(f72891f7l8, packageName);
        if (!TextUtils.isEmpty(strM18895s)) {
            map.put(f30897y, strM18895s);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("callback", str2);
        }
        map.put("nonce", String.valueOf(C5577s.m19131k(System.currentTimeMillis())));
        HashMap map2 = new HashMap();
        map2.put(f30895s, strMo18871k);
        map2.put(f30893p, com.xiaomi.accountsdk.guestaccount.toq.f30883k);
        if (qVar != null && (str4 = qVar.f31024k) != null && qVar.f72965toq != null) {
            map2.put("fidNonce", str4);
            map2.put("fidNonceSign", qVar.f72965toq);
        }
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        treeMap.putAll(map2);
        map2.put("_sign", C5577s.toq("POST", strM18894q, treeMap, f72894jk));
        try {
            toq toqVarLd6 = ld6(strM18894q, map, map2);
            if (toqVarLd6.f30900k != null) {
                return new com.xiaomi.accountsdk.guestaccount.data.zy().m18864g(toqVarLd6.f30900k.intValue());
            }
            JSONObject jSONObject = toqVarLd6.f72909toq;
            EnumC5515n fromServerValue = EnumC5515n.getFromServerValue(jSONObject.getInt("visitorType"));
            if (fromServerValue == null) {
                return com.xiaomi.accountsdk.guestaccount.toq.f72877cdj;
            }
            String string = jSONObject.getString("visitorPassToken");
            String string2 = jSONObject.getString("visitorId");
            String strOptString = jSONObject.optString(f72903t8r);
            String strOptString2 = jSONObject.optString(m18897n(str));
            JSONObject jSONObject2 = toqVarLd6.f72910zy;
            return new com.xiaomi.accountsdk.guestaccount.data.zy().m18868y(new GuestAccount.C5512k().fn3e(string2).x2(strOptString).ki(str).cdj(strOptString2).m18855h(jSONObject2 == null ? null : jSONObject2.optString(f72898mcp)).n7h(string).m18856i(fromServerValue).qrj(jSONObject.optString("callback")).t8r(jSONObject.optString(m18896g(str))).kja0(jSONObject.optString(zy(str))).ld6());
        } catch (JSONException e2) {
            AbstractC5574n.o1t(f72889a9, e2);
            return com.xiaomi.accountsdk.guestaccount.toq.f72877cdj;
        }
    }

    /* JADX INFO: renamed from: y */
    com.xiaomi.accountsdk.guestaccount.data.zy m18898y(GuestAccount guestAccount, String str) {
        if (guestAccount.f30831n == null) {
            throw new IllegalArgumentException("guestAccount.sid == null");
        }
        if (guestAccount.f30830k == null) {
            throw new IllegalArgumentException("guestAccount.userId == null");
        }
        if (guestAccount.f30834s == null) {
            throw new IllegalArgumentException("guestAccount.passToken == null");
        }
        String qVar = toq(this.f30899k);
        HashMap map = new HashMap();
        map.put(f30894q, guestAccount.f30831n);
        map.put("visitorId", guestAccount.f30830k);
        if (!TextUtils.isEmpty(str)) {
            map.put("callback", str);
        }
        map.put("nonce", String.valueOf(C5577s.m19131k(System.currentTimeMillis())));
        String strMo18871k = this.f72907toq.mo18871k();
        HashMap map2 = new HashMap();
        map2.put(f30895s, strMo18871k);
        map2.put(f30893p, com.xiaomi.accountsdk.guestaccount.toq.f30883k);
        map2.put("visitorPassToken", guestAccount.f30834s);
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        treeMap.putAll(map2);
        map2.put("_sign", C5577s.toq("POST", qVar, treeMap, f72894jk));
        try {
            toq toqVarLd6 = ld6(qVar, map, map2);
            if (toqVarLd6.f30900k != null) {
                return new com.xiaomi.accountsdk.guestaccount.data.zy().m18864g(toqVarLd6.f30900k.intValue());
            }
            JSONObject jSONObject = toqVarLd6.f72909toq;
            String string = jSONObject.getString("visitorId");
            String strOptString = jSONObject.optString(f72903t8r);
            String string2 = jSONObject.getString("visitorPassToken");
            String strOptString2 = jSONObject.optString(m18897n(guestAccount.f30831n));
            JSONObject jSONObject2 = toqVarLd6.f72910zy;
            String strOptString3 = jSONObject2 == null ? null : jSONObject2.optString(f72898mcp);
            String strOptString4 = jSONObject.optString(m18896g(guestAccount.f30831n));
            return new com.xiaomi.accountsdk.guestaccount.data.zy().m18868y(new GuestAccount.C5512k().fn3e(string).x2(strOptString).n7h(string2).ki(guestAccount.f30831n).cdj(strOptString2).m18855h(strOptString3).t8r(strOptString4).kja0(jSONObject.optString(zy(guestAccount.f30831n))).qrj(jSONObject.optString("callback")).ld6());
        } catch (JSONException e2) {
            AbstractC5574n.o1t(f72889a9, e2);
            return com.xiaomi.accountsdk.guestaccount.toq.f72877cdj;
        }
    }

    String zy(String str) {
        return str + f72901o1t;
    }
}
