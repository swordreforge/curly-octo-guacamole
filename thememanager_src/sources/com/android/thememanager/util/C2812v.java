package com.android.thememanager.util;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: renamed from: com.android.thememanager.util.v */
/* JADX INFO: compiled from: ThemeAnalyticsHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2812v implements com.android.thememanager.basemodule.analysis.ld6, InterfaceC1789q, com.android.thememanager.basemodule.analysis.toq {
    /* JADX INFO: renamed from: k */
    public static void m10045k(Resource resource, com.android.thememanager.fu4 resContext) {
        String title;
        String strMcp = g1.mcp(resContext.getResourceCode(), resource);
        String hash = "Default";
        if (g1.m9739c(resContext.getResourceCode(), resource.getMetaPath())) {
            title = "Default";
        } else {
            hash = resource.getHash();
            title = resource.getTitle();
        }
        toq(strMcp, hash, title);
    }

    public static void toq(String themeOnlineId, String themeHash, String themeName) {
        String strY9n = g1.y9n();
        String strEk5k = g1.ek5k();
        String strYz = g1.yz();
        long jM9738b = g1.m9738b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = jM9738b > 0 ? (int) ((jCurrentTimeMillis - jM9738b) / 1000) : -1;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("resourceType", "theme");
        if (TextUtils.isEmpty(strY9n)) {
            strY9n = com.android.thememanager.basemodule.analysis.ld6.mdr;
        }
        arrayMap.put("productId", strY9n);
        if (TextUtils.isEmpty(strEk5k)) {
            strEk5k = com.android.thememanager.basemodule.analysis.ld6.mdr;
        }
        arrayMap.put("hash", strEk5k);
        if (TextUtils.isEmpty(strYz)) {
            strYz = com.android.thememanager.basemodule.analysis.ld6.mdr;
        }
        arrayMap.put("name", strYz);
        arrayMap.put("duration", Integer.valueOf(i2));
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.gw, C1706p.ki(arrayMap));
        g1.t8iq(themeOnlineId, themeHash, themeName, jCurrentTimeMillis);
    }
}
