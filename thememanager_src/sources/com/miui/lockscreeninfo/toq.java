package com.miui.lockscreeninfo;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static Class<?>[] f29441k;

    /* JADX INFO: renamed from: n */
    public static StringBuffer f29442n;

    /* JADX INFO: renamed from: q */
    public static boolean f29443q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String[] f72122toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<String, Method> f72123zy = new HashMap();

    static {
        new HashMap();
        f29441k = new Class[]{Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
        f72122toq = new String[]{com.market.sdk.reflect.toq.f68929toq, "B", com.market.sdk.reflect.toq.f28134q, "S", com.market.sdk.reflect.toq.f28131g, com.market.sdk.reflect.toq.f68928f7l8, com.market.sdk.reflect.toq.f28136y, com.market.sdk.reflect.toq.f28135s, "V"};
        f29442n = new StringBuffer();
    }

    public static String f7l8(Class<?> cls, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        if (clsArr != null) {
            for (Class<?> cls2 : clsArr) {
                sb.append(m17829n(cls2));
            }
        }
        sb.append(')');
        sb.append(m17829n(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    private static String m17827g(Class<?> cls, String str, String str2) {
        return cls.toString() + "/" + str + "/" + str2;
    }

    /* JADX INFO: renamed from: k */
    public static Class<?> m17828k(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            Log.e("ReflectUtils", "getClass", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m17829n(Class<?> cls) {
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = f29441k;
            if (i2 >= clsArr.length) {
                return m17830p(cls.getName());
            }
            if (cls == clsArr[i2]) {
                return f72122toq[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m17830p(String str) {
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = f29441k;
            if (i2 >= clsArr.length) {
                break;
            }
            if (clsArr[i2].getName().equals(str)) {
                str = f72122toq[i2];
            }
            i2++;
        }
        String strReplace = str.replace(".", "/");
        if (strReplace.startsWith("[")) {
            return strReplace;
        }
        return "L" + strReplace + ";";
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m17831q(String str, Class[] clsArr, Object... objArr) {
        try {
            return (T) m17828k(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e2) {
            Log.e("ReflectUtils", "newInstance" + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m17832s(String str, String str2, Exception exc) {
        if (f29443q) {
            String name = exc.getClass().getName();
            f29442n.append(str + "---" + name + "---" + str2 + "\n");
        }
    }

    public static <T> T toq(Class<?> cls, Object obj, String str, Class<?> cls2, T t2, Class<?>[] clsArr, Object... objArr) {
        if (clsArr == null) {
            try {
                clsArr = new Class[0];
            } catch (Exception e2) {
                Log.e("ReflectUtils", "invokeObject", e2);
            }
        }
        Method methodM17833y = m17833y(cls, str, f7l8(cls2, clsArr), clsArr);
        if (methodM17833y != null) {
            return (T) methodM17833y.invoke(obj, objArr);
        }
        return t2;
    }

    /* JADX INFO: renamed from: y */
    public static Method m17833y(Class<?> cls, String str, String str2, Class<?>... clsArr) {
        Method declaredMethod;
        try {
            String strM17827g = m17827g(cls, str, str2);
            Method method = f72123zy.get(strM17827g);
            if (method == null) {
                try {
                    declaredMethod = cls.getMethod(str, clsArr);
                } catch (Exception unused) {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                }
                method = declaredMethod;
                f72123zy.put(strM17827g, method);
            }
            return method;
        } catch (Exception e2) {
            Log.d("ReflectUtils", "getMethod", e2);
            m17832s(cls.getName(), str, e2);
            return null;
        }
    }

    public static <T> T zy(Class<?> cls, Object obj, String str, Class<?> cls2, Class<?>[] clsArr, Object... objArr) {
        if (clsArr == null) {
            try {
                clsArr = new Class[0];
            } catch (Exception e2) {
                Log.e("ReflectUtils", "invokeObject", e2);
                return null;
            }
        }
        Method methodM17833y = m17833y(cls, str, f7l8(cls2, clsArr), clsArr);
        if (methodM17833y != null) {
            return (T) methodM17833y.invoke(obj, objArr);
        }
        return null;
    }
}
