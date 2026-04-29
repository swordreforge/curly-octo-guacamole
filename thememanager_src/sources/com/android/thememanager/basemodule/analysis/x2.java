package com.android.thememanager.basemodule.analysis;

import android.util.ArrayMap;
import android.util.Log;
import com.google.gson.C4871g;

/* JADX INFO: compiled from: TrackIdParser.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f57491ld6 = ":";

    /* JADX INFO: renamed from: p */
    private static final String f9798p = "_";

    /* JADX INFO: renamed from: s */
    private static final String f9799s = "TrackId";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f57492x2 = "-";

    /* JADX INFO: renamed from: k */
    private String f9801k = "";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57494toq = "";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f57495zy = "";

    /* JADX INFO: renamed from: q */
    private String f9803q = "";

    /* JADX INFO: renamed from: n */
    private String f9802n = "";

    /* JADX INFO: renamed from: g */
    private String f9800g = "";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f57493f7l8 = "";

    /* JADX INFO: renamed from: y */
    private String f9804y = "";

    /* JADX INFO: renamed from: k */
    private static ArrayMap<String, Object> m6678k(String key, String extra) {
        try {
            return (ArrayMap) new C4871g().n7h(extra, ArrayMap.class);
        } catch (Exception e2) {
            Log.e(f9799s, "TrackId,convertToMap failed", e2);
            ArrayMap<String, Object> arrayMap = new ArrayMap<>(2);
            arrayMap.put(key, extra);
            return arrayMap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.ArrayMap<java.lang.String, java.lang.Object> toq(java.lang.String r9) {
        /*
            r0 = 2
            if (r9 != 0) goto L9
            android.util.ArrayMap r9 = new android.util.ArrayMap
            r9.<init>(r0)
            return r9
        L9:
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>(r0)
            java.lang.String r2 = "_"
            r3 = -1
            java.lang.String[] r9 = r9.split(r2, r3)
            r2 = 0
            r4 = r2
            r5 = r4
        L18:
            int r6 = r9.length
            if (r4 >= r6) goto L83
            java.lang.String r6 = ":"
            r7 = 1
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6e;
                case 2: goto L66;
                case 3: goto L5d;
                case 4: goto L51;
                case 5: goto L46;
                case 6: goto L3d;
                case 7: goto L34;
                case 8: goto L2a;
                case 9: goto L22;
                case 10: goto L22;
                default: goto L21;
            }
        L21:
            goto L7d
        L22:
            r6 = r9[r4]
            java.lang.String r7 = "secExtra"
            zy(r1, r7, r6)
            goto L7d
        L2a:
            r6 = 8
            r6 = r9[r6]
            java.lang.String r7 = "secContent"
            r1.put(r7, r6)
            goto L7d
        L34:
            r6 = 7
            r6 = r9[r6]
            java.lang.String r7 = "secIndex"
            r1.put(r7, r6)
            goto L7d
        L3d:
            r6 = 6
            r6 = r9[r6]
            java.lang.String r7 = "extra"
            zy(r1, r7, r6)
            goto L7d
        L46:
            r8 = 5
            r8 = r9[r8]
            java.lang.String[] r6 = r8.split(r6, r3)
            int r6 = r6.length
            if (r6 >= r0) goto L7d
            goto L5b
        L51:
            r8 = 4
            r8 = r9[r8]
            java.lang.String[] r6 = r8.split(r6, r3)
            int r6 = r6.length
            if (r6 >= r0) goto L7d
        L5b:
            r5 = r7
            goto L7d
        L5d:
            r6 = 3
            r6 = r9[r6]
            java.lang.String r7 = "contentIndex"
            r1.put(r7, r6)
            goto L7d
        L66:
            r6 = r9[r0]
            java.lang.String r7 = "content"
            r1.put(r7, r6)
            goto L7d
        L6e:
            r6 = r9[r7]
            java.lang.String r7 = "cardIndx"
            r1.put(r7, r6)
            goto L7d
        L76:
            r6 = r9[r2]
            java.lang.String r7 = "cardId"
            r1.put(r7, r6)
        L7d:
            if (r5 == 0) goto L80
            goto L83
        L80:
            int r4 = r4 + 1
            goto L18
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.analysis.x2.toq(java.lang.String):android.util.ArrayMap");
    }

    private static void zy(ArrayMap<String, Object> map, String key, String extra) {
        if (C1706p.cdj(extra)) {
            map.putAll((ArrayMap<? extends String, ? extends Object>) m6678k(key, extra));
        } else {
            map.put(key, extra);
        }
    }
}
