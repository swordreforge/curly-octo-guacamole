package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.InterfaceC5575p;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: SecureRequestForAccount.java */
/* JADX INFO: loaded from: classes3.dex */
public class o1t {
    public static wvg.C5553n f7l8(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws n7h, C5545n, C5539k, zy, IOException {
        return C5557z.m19034h(str, map, C5550t.zy(C5550t.m18997k(map2)), z2, str2, interfaceC5575p, null, null);
    }

    /* JADX INFO: renamed from: g */
    public static wvg.C5553n m18974g(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws n7h, C5545n, C5539k, zy, IOException {
        return f7l8(str, map, map2, z2, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public static wvg.C5553n m18975k(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return toq(str, map, map2, z2, str2, null);
    }

    /* JADX INFO: renamed from: n */
    public static wvg.C5555y m18976n(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p, Integer num) throws C5545n, n7h, C5539k, zy, IOException {
        return C5557z.ld6(str, map, C5550t.zy(C5550t.m18997k(map2)), z2, str2, interfaceC5575p, num, null);
    }

    /* JADX INFO: renamed from: q */
    public static wvg.C5555y m18977q(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws C5545n, n7h, C5539k, zy, IOException {
        return m18976n(str, map, map2, z2, str2, interfaceC5575p, null);
    }

    public static wvg.C5553n toq(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2, InterfaceC5575p interfaceC5575p) throws C5545n, n7h, C5539k, zy, IOException {
        return C5557z.f7l8(str, map, C5550t.zy(C5550t.m18997k(map2)), z2, str2, interfaceC5575p, null, null);
    }

    /* JADX INFO: renamed from: y */
    public static wvg.C5555y m18978y(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return C5557z.m19035i(str, map, C5550t.zy(C5550t.m18997k(map2)), z2, str2, null, null, null);
    }

    public static wvg.C5555y zy(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return m18976n(str, map, map2, z2, str2, null, null);
    }
}
