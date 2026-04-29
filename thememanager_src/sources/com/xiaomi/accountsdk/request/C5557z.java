package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.C5570k;
import com.xiaomi.accountsdk.utils.InterfaceC5575p;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.z */
/* JADX INFO: compiled from: SecureRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5557z {
    public static wvg.C5555y cdj(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return m19035i(str, map, map2, z2, str2, null, null, null);
    }

    public static wvg.C5553n f7l8(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num, Map<String, String> map3) throws C5545n, n7h, C5539k, zy, IOException {
        return wvg.zy(ld6(str, map, map2, z2, str2, interfaceC5575p, num, map3));
    }

    private static wvg.C5555y fn3e(wvg.C5555y c5555y, String str, InterfaceC5575p interfaceC5575p) throws C5545n, n7h, IOException {
        if (c5555y == null) {
            throw new IOException("no response from server");
        }
        String strM19020s = c5555y.m19020s();
        if (strM19020s == null) {
            throw new n7h("invalid response from server");
        }
        String strM19036k = m19036k(strM19020s, interfaceC5575p);
        x2().mo19126g(strM19036k);
        wvg.C5555y c5555y2 = new wvg.C5555y(strM19036k);
        c5555y2.f7l8(c5555y.zy());
        c5555y2.m19025y(c5555y.m19024q());
        return c5555y2;
    }

    /* JADX INFO: renamed from: g */
    public static wvg.C5553n m19033g(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num) throws C5545n, n7h, C5539k, zy, IOException {
        return f7l8(str, map, map2, z2, str2, interfaceC5575p, num, null);
    }

    /* JADX INFO: renamed from: h */
    public static wvg.C5553n m19034h(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num, Map<String, String> map3) throws n7h, C5545n, C5539k, zy, IOException {
        return wvg.zy(m19035i(str, map, map2, z2, str2, interfaceC5575p, num, map3));
    }

    /* JADX INFO: renamed from: i */
    public static wvg.C5555y m19035i(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num, Map<String, String> map3) throws C5545n, n7h, C5539k, zy, IOException {
        if (interfaceC5575p == null) {
            interfaceC5575p = new C5570k(str2);
        }
        return fn3e(wvg.ni7(str, zy("POST", str, map, str2, interfaceC5575p), map2, map3, z2, num), str2, interfaceC5575p);
    }

    /* JADX INFO: renamed from: k */
    private static String m19036k(String str, InterfaceC5575p interfaceC5575p) throws C5545n, n7h {
        if (interfaceC5575p == null) {
            throw new C5545n("no invalid coder");
        }
        try {
            return interfaceC5575p.toq(str);
        } catch (C5545n e2) {
            throw new n7h("failed to decrypt response", e2);
        }
    }

    public static wvg.C5555y ki(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws C5545n, n7h, C5539k, zy, IOException {
        return m19035i(str, map, map2, z2, str2, interfaceC5575p, null, null);
    }

    public static wvg.C5553n kja0(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num) throws n7h, C5545n, C5539k, zy, IOException {
        return m19034h(str, map, map2, z2, str2, interfaceC5575p, num, null);
    }

    public static wvg.C5555y ld6(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num, Map<String, String> map3) throws C5545n, n7h, C5539k, zy, IOException {
        if (interfaceC5575p == null) {
            interfaceC5575p = new C5570k(str2);
        }
        return fn3e(wvg.ld6(str, zy("GET", str, map, str2, interfaceC5575p), map3, map2, z2, num), str2, interfaceC5575p);
    }

    /* JADX INFO: renamed from: n */
    public static wvg.C5553n m19037n(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws C5545n, n7h, C5539k, zy, IOException {
        return f7l8(str, map, map2, z2, str2, interfaceC5575p, null, null);
    }

    public static wvg.C5553n n7h(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws n7h, C5545n, C5539k, zy, IOException {
        return m19034h(str, map, map2, z2, str2, interfaceC5575p, null, null);
    }

    /* JADX INFO: renamed from: p */
    public static wvg.C5555y m19038p(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num) throws C5545n, n7h, C5539k, zy, IOException {
        return ld6(str, map, map2, z2, str2, interfaceC5575p, num, null);
    }

    /* JADX INFO: renamed from: q */
    public static wvg.C5553n m19039q(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return f7l8(str, map, map2, z2, str2, null, null, null);
    }

    public static wvg.C5553n qrj(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws n7h, C5545n, C5539k, zy, IOException {
        return m19034h(str, map, map2, z2, str2, null, null, null);
    }

    /* JADX INFO: renamed from: s */
    public static wvg.C5555y m19040s(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws C5545n, n7h, C5539k, zy, IOException {
        return ld6(str, map, map2, z2, str2, interfaceC5575p, null, null);
    }

    public static wvg.C5555y t8r(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num) throws C5545n, n7h, C5539k, zy, IOException {
        return m19035i(str, map, map2, z2, str2, interfaceC5575p, num, null);
    }

    public static Map<String, String> toq(String str, String str2, Map<String, String> map, String str3) throws C5545n {
        return zy(str, str2, map, str3, new C5570k(str3));
    }

    private static com.xiaomi.accountsdk.utils.qrj x2() {
        return com.xiaomi.accountsdk.utils.x2.m19149k();
    }

    /* JADX INFO: renamed from: y */
    public static wvg.C5555y m19041y(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return ld6(str, map, map2, z2, str2, null, null, null);
    }

    public static Map<String, String> zy(String str, String str2, Map<String, String> map, String str3, InterfaceC5575p interfaceC5575p) throws C5545n {
        if (interfaceC5575p == null) {
            throw new C5545n("no invalid cypt coder");
        }
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    if (!key.startsWith("_")) {
                        value = interfaceC5575p.mo19092k(value);
                    }
                    map2.put(key, value);
                }
            }
        }
        map2.put("signature", com.xiaomi.accountsdk.utils.mcp.m19109k(str, str2, map2, str3));
        return map2;
    }
}
