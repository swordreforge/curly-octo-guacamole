package com.xiaomi.accountsdk.request;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.a9;
import com.xiaomi.accountsdk.utils.kja0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.t */
/* JADX INFO: compiled from: SimpleRequestForAccount.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5550t {

    /* JADX INFO: renamed from: k */
    public static final String f30977k = "fidNonce";

    /* JADX INFO: renamed from: q */
    public static final String f30978q = "userSpaceId";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f72945toq = "fidNonceSign";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f72946zy = "deviceId";

    public static wvg.C5555y f7l8(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2) throws C5539k, zy, IOException {
        return m19002y(str, map, map2, map3, z2, null);
    }

    /* JADX INFO: renamed from: g */
    public static wvg.f7l8 m18996g(String str, Map<String, String> map, Map<String, String> map2) throws C5539k, zy, IOException {
        return wvg.m19012s(str, map, zy(m18997k(map2)), null);
    }

    /* JADX INFO: renamed from: k */
    static Map<String, String> m18997k(Map<String, String> map) {
        return toq(map, new com.xiaomi.accountsdk.hasheddeviceidlib.zy(C5500p.toq()).zy());
    }

    public static wvg.C5555y ld6(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z2, Integer num) throws C5539k, zy, IOException {
        return wvg.zurt(str, map, zy(m18997k(map2)), map3, map4, z2, num);
    }

    /* JADX INFO: renamed from: n */
    public static wvg.C5553n m18998n(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, zy, IOException {
        return wvg.m19005g(str, map, zy(m18997k(map2)), null, z2);
    }

    /* JADX INFO: renamed from: p */
    public static wvg.C5553n m18999p(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, zy, IOException {
        return wvg.t8r(str, map, zy(m18997k(map2)), null, z2);
    }

    /* JADX INFO: renamed from: q */
    static Map<String, String> m19000q(Map<String, String> map, kja0.C5571k c5571k) {
        com.xiaomi.accountsdk.utils.kja0 kja0VarM19097k;
        if (map == null || c5571k == null || !map.containsKey(f72946zy) || map.containsKey(f30977k) || map.containsKey(f72945toq) || (kja0VarM19097k = c5571k.m19097k(kja0.toq.NATIVE)) == null || TextUtils.isEmpty(kja0VarM19097k.f31024k) || TextUtils.isEmpty(kja0VarM19097k.f72965toq)) {
            return map;
        }
        HashMap map2 = new HashMap(map);
        map2.put(f30977k, kja0VarM19097k.f31024k);
        map2.put(f72945toq, kja0VarM19097k.f72965toq);
        return map2;
    }

    /* JADX INFO: renamed from: s */
    public static wvg.C5555y m19001s(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, zy, IOException {
        return m19002y(str, map, null, map2, z2, null);
    }

    static Map<String, String> toq(Map<String, String> map, String str) {
        if (map != null && map.containsKey(f72946zy)) {
            return map;
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put(f72946zy, str);
        String strM19053k = a9.m19053k();
        if (!TextUtils.isEmpty(strM19053k)) {
            map2.put(f30978q, strM19053k);
        }
        return map2;
    }

    public static wvg.C5555y x2(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, zy, IOException {
        return ld6(str, map, map2, null, null, z2, null);
    }

    /* JADX INFO: renamed from: y */
    public static wvg.C5555y m19002y(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2, Integer num) throws C5539k, zy, IOException {
        return wvg.ld6(str, map, map2, zy(m18997k(map3)), z2, num);
    }

    static Map<String, String> zy(Map<String, String> map) {
        return m19000q(map, new kja0.C5571k());
    }
}
