package com.xiaomi.onetrack.util;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.onetrack.p017f.C5756a;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.p */
/* JADX INFO: loaded from: classes3.dex */
public class C5804p {

    /* JADX INFO: renamed from: a */
    public static boolean f32410a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f32411b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f32412c = false;

    /* JADX INFO: renamed from: d */
    private static final int f32413d = 3000;

    /* JADX INFO: renamed from: e */
    private static final String f32414e = "OneTrack-Api-";

    /* JADX INFO: renamed from: f */
    private static final int f32415f = 0;

    /* JADX INFO: renamed from: g */
    private static final int f32416g = 1;

    /* JADX INFO: renamed from: h */
    private static final int f32417h = 2;

    /* JADX INFO: renamed from: i */
    private static final int f32418i = 3;

    /* JADX INFO: renamed from: j */
    private static final int f32419j = 4;

    /* JADX INFO: renamed from: k */
    private static boolean f32420k = false;

    /* JADX INFO: renamed from: l */
    private static boolean f32421l = false;

    /* JADX INFO: renamed from: m */
    private static boolean f32422m = false;

    /* JADX INFO: renamed from: n */
    private static boolean f32423n = false;

    /* JADX INFO: renamed from: a */
    public static void m20341a() {
        try {
            String strM20058e = C5756a.m20058e();
            String strM20218a = ab.m20218a("debug.onetrack.log");
            boolean z2 = true;
            f32421l = (TextUtils.isEmpty(strM20218a) || TextUtils.isEmpty(strM20058e) || !TextUtils.equals(strM20058e, strM20218a)) ? false : true;
            String strM20218a2 = ab.m20218a("debug.onetrack.upload");
            f32411b = (TextUtils.isEmpty(strM20218a2) || TextUtils.isEmpty(strM20058e) || !TextUtils.equals(strM20058e, strM20218a2)) ? false : true;
            String strM20218a3 = ab.m20218a("debug.onetrack.test");
            if (TextUtils.isEmpty(strM20218a3) || TextUtils.isEmpty(strM20058e) || !TextUtils.equals(strM20058e, strM20218a3)) {
                z2 = false;
            }
            f32423n = z2;
            m20346b();
            m20350c();
        } catch (Exception e2) {
            Log.e("OneTrackSdk", "LogUtil static initializer: " + e2.toString());
        }
        Log.d("OneTrackSdk", "log on: " + f32421l + ", quick upload on: " + f32411b);
    }

    /* JADX INFO: renamed from: b */
    public static void m20347b(String str, String str2) {
        if (f32410a) {
            m20343a(m20340a(str), str2, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20351c(String str, String str2) {
        if (f32410a) {
            m20343a(m20340a(str), str2, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20353d(String str, String str2) {
        if (f32410a) {
            m20343a(m20340a(str), str2, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20348b(String str, String str2, Throwable th) {
        if (f32410a) {
            Log.e(m20340a(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20352c(String str, String str2, Throwable th) {
        if (f32410a) {
            Log.w(m20340a(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20354d(String str, String str2, Throwable th) {
        if (f32410a) {
            Log.i(m20340a(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m20346b() {
        f32410a = f32420k || f32421l;
        Log.d("OneTrackSdk", "updateDebugSwitch sEnable: " + f32410a + " sDebugMode：" + f32420k + " sDebugProperty：" + f32421l);
    }

    /* JADX INFO: renamed from: c */
    private static void m20350c() {
        f32412c = f32422m || f32423n;
        Log.d("OneTrackSdk", "updateTestSwitch sTestEnable: " + f32412c + " sTestMode：" + f32422m + " sTestProperty：" + f32423n);
    }

    /* JADX INFO: renamed from: b */
    public static void m20349b(boolean z2) {
        f32422m = z2;
        m20350c();
    }

    /* JADX INFO: renamed from: a */
    public static void m20342a(String str, String str2) {
        if (f32410a) {
            m20343a(m20340a(str), str2, 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20344a(String str, String str2, Throwable th) {
        if (f32410a) {
            Log.d(m20340a(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m20343a(String str, String str2, int i2) {
        if (str2 == null) {
            return;
        }
        int i3 = 0;
        while (i3 <= str2.length() / 3000) {
            int i4 = i3 * 3000;
            i3++;
            int iMin = Math.min(str2.length(), i3 * 3000);
            if (i4 < iMin) {
                String strSubstring = str2.substring(i4, iMin);
                if (i2 == 0) {
                    Log.e(str, strSubstring);
                } else if (i2 == 1) {
                    Log.w(str, strSubstring);
                } else if (i2 == 2) {
                    Log.i(str, strSubstring);
                } else if (i2 == 3) {
                    Log.d(str, strSubstring);
                } else if (i2 == 4) {
                    Log.v(str, strSubstring);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m20340a(String str) {
        return f32414e + str;
    }

    /* JADX INFO: renamed from: a */
    public static void m20345a(boolean z2) {
        f32420k = z2;
        m20346b();
    }
}
