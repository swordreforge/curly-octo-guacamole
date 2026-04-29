package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.C5581y;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: AesWithIVRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static wvg.C5553n m19003k(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        return wvg.zy(toq(str, map, map2, z2, str2));
    }

    /* JADX INFO: renamed from: q */
    public static wvg.C5555y m19004q(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        if (!map.containsKey("_nonce")) {
            map.put("_nonce", C5581y.m19157s());
        }
        return C5557z.ki(str, map, map2, z2, str2, new com.xiaomi.accountsdk.utils.zy(str2));
    }

    public static wvg.C5555y toq(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws C5545n, n7h, C5539k, zy, IOException {
        if (!map.containsKey("_nonce")) {
            map.put("_nonce", C5581y.m19157s());
        }
        return C5557z.m19040s(str, map, map2, z2, str2, new com.xiaomi.accountsdk.utils.zy(str2));
    }

    public static wvg.C5553n zy(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws n7h, C5545n, C5539k, zy, IOException {
        return wvg.zy(m19004q(str, map, map2, z2, str2));
    }
}
