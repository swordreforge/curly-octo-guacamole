package com.market.sdk.utils;

import android.util.Log;
import com.market.sdk.MarketManager;
import com.market.sdk.reflect.C4990q;
import com.market.sdk.reflect.C4991s;
import java.util.Map;

/* JADX INFO: compiled from: ReflectUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {

    /* JADX INFO: renamed from: k */
    private static final String f28216k = "ReflectUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, C4990q> f69001toq = C5007g.m17425g();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<String, com.market.sdk.reflect.toq> f69002zy = C5007g.m17425g();

    /* JADX INFO: renamed from: q */
    private static Map<String, Class> f28217q = C5007g.m17425g();

    private n7h() {
    }

    public static String f7l8(Class<?> cls, Class<?>... clsArr) {
        try {
            return C4991s.m17360q(clsArr, cls);
        } catch (Throwable th) {
            Log.e(MarketManager.f27964n, th.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static C4990q m17455g(Class<?> cls, String str, String str2) {
        try {
            String qVar = toq(cls, str, str2);
            C4990q c4990q = f69001toq.get(qVar);
            if (c4990q != null) {
                return c4990q;
            }
            C4990q c4990qM17351s = C4990q.m17351s(cls, str, str2);
            f69001toq.put(qVar, c4990qM17351s);
            return c4990qM17351s;
        } catch (Throwable th) {
            Log.e(f28216k, "Exception e: " + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m17456k(Class<?> cls, String str, String str2) {
        return cls.toString() + "/" + str + "/" + str2;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m17457n(Class<?> cls, Object obj, String str, String str2) {
        try {
            com.market.sdk.reflect.toq toqVarM17458q = m17458q(cls, str, str2);
            if (toqVarM17458q == null) {
                return null;
            }
            return (T) toqVarM17458q.m17364k(obj);
        } catch (Exception e2) {
            Log.d(MarketManager.f27964n, e2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static com.market.sdk.reflect.toq m17458q(Class<?> cls, String str, String str2) {
        try {
            String strM17456k = m17456k(cls, str, str2);
            com.market.sdk.reflect.toq toqVar = f69002zy.get(strM17456k);
            if (toqVar != null) {
                return toqVar;
            }
            com.market.sdk.reflect.toq toqVarM17363q = com.market.sdk.reflect.toq.m17363q(cls, str, str2);
            f69002zy.put(strM17456k, toqVarM17363q);
            return toqVarM17363q;
        } catch (Throwable th) {
            Log.e(f28216k, "Exception: " + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static <T> T m17459s(Class<?> cls, Object obj, String str, String str2, Object... objArr) {
        try {
            C4990q c4990qM17455g = m17455g(cls, str, str2);
            if (c4990qM17455g != null) {
                return (T) c4990qM17455g.f7l8(cls, obj, objArr);
            }
            return null;
        } catch (Throwable th) {
            Log.e(f28216k, "Exception: " + th);
            return null;
        }
    }

    private static String toq(Class<?> cls, String str, String str2) {
        return cls.toString() + "/" + str + "/" + str2;
    }

    /* JADX INFO: renamed from: y */
    public static void m17460y(Class<?> cls, Object obj, String str, String str2, Object... objArr) {
        try {
            C4990q c4990qM17455g = m17455g(cls, str, str2);
            if (c4990qM17455g != null) {
                c4990qM17455g.m17354k(cls, obj, objArr);
            }
        } catch (Throwable th) {
            Log.e(f28216k, "Exception: " + th);
        }
    }

    public static Class<?> zy(String str) {
        Class<?> cls = f28217q.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = Class.forName(str);
            f28217q.put(str, cls);
            return cls;
        } catch (Exception e2) {
            Log.e(f28216k, e2.toString(), e2);
            return cls;
        }
    }
}
