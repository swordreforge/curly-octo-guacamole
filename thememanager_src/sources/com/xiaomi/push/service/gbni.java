package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class gbni {

    /* JADX INFO: renamed from: k */
    private static final Map<String, Long> f33786k = new HashMap();

    /* JADX INFO: renamed from: k */
    private static void m21616k() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f33786k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (jElapsedRealtime - entry.getValue().longValue() > 60000) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f33786k.remove((String) it.next());
        }
    }

    public static boolean toq(byte[] bArr, String str) {
        boolean z2 = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String strM21301g = com.xiaomi.push.n5r1.m21301g(bArr);
            if (!TextUtils.isEmpty(strM21301g)) {
                Map<String, Long> map = f33786k;
                synchronized (map) {
                    if (map.get(strM21301g + str) != null) {
                        z2 = true;
                    } else {
                        map.put(strM21301g + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    m21616k();
                }
            }
        }
        return z2;
    }
}
