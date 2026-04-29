package u38j;

import android.util.Log;

/* JADX INFO: renamed from: u38j.q */
/* JADX INFO: compiled from: MLog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7683q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f94991f7l8 = 0;

    /* JADX INFO: renamed from: g */
    private static final int f44429g = 4;

    /* JADX INFO: renamed from: k */
    private static final int f44430k = 3000;

    /* JADX INFO: renamed from: n */
    private static final int f44431n = 3;

    /* JADX INFO: renamed from: q */
    private static final int f44432q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f94992toq = 0;

    /* JADX INFO: renamed from: y */
    private static boolean f44433y = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f94993zy = 1;

    static {
        f94991f7l8 = toq.m28060k() ? 4 : 1;
        f44433y = false;
    }

    public static void f7l8(String str, String str2) {
        if (f94991f7l8 >= 2) {
            m28058s(m28054k(str), str2, 2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m28052g() {
        return f94991f7l8;
    }

    /* JADX INFO: renamed from: h */
    public static void m28053h(String str, String str2, Throwable th) {
        if (f94991f7l8 >= 1) {
            Log.w(m28054k(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m28054k(String str) {
        if (f44433y) {
            return "AD-SDK-" + str;
        }
        return "AD-PLUGIN-" + str;
    }

    public static void kja0(String str, String str2) {
        if (f94991f7l8 >= 1) {
            m28058s(m28054k(str), str2, 1);
        }
    }

    public static void ld6(int i2) {
        f94991f7l8 = i2;
    }

    /* JADX INFO: renamed from: n */
    public static void m28055n(String str, String str2, Throwable th) {
        if (f94991f7l8 >= 0) {
            Log.e(m28054k(str), str2, th);
        }
    }

    public static void n7h(String str, String str2, Throwable th) {
        if (f94991f7l8 >= 4) {
            Log.v(m28054k(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m28056p() {
        f94991f7l8 = 1000;
    }

    /* JADX INFO: renamed from: q */
    public static void m28057q(String str, String str2) {
        if (f94991f7l8 >= 0) {
            m28058s(m28054k(str), str2, 0);
        }
    }

    public static void qrj(String str, String str2) {
        if (f94991f7l8 >= 4) {
            m28058s(m28054k(str), str2, 4);
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m28058s(String str, String str2, int i2) {
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

    public static void toq(String str, String str2) {
        if (f94991f7l8 >= 2) {
            m28058s(m28054k(str), str2, 2);
        }
    }

    public static void x2(boolean z2) {
        f44433y = z2;
    }

    /* JADX INFO: renamed from: y */
    public static void m28059y(String str, String str2, Throwable th) {
        if (f94991f7l8 >= 2) {
            Log.i(m28054k(str), str2, th);
        }
    }

    public static void zy(String str, String str2, Throwable th) {
        if (f94991f7l8 >= 3) {
            Log.d(m28054k(str), str2, th);
        }
    }
}
