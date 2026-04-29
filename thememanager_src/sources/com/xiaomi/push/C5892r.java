package com.xiaomi.push;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.r */
/* JADX INFO: loaded from: classes3.dex */
public class C5892r {

    /* JADX INFO: renamed from: k */
    private static final Map<Class<?>, Class<?>> f33576k;

    /* JADX INFO: renamed from: com.xiaomi.push.r$k */
    public static class k<T> {

        /* JADX INFO: renamed from: k */
        public final Class<? extends T> f33577k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final T f73540toq;
    }

    static {
        HashMap map = new HashMap();
        f33576k = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(cls, cls);
        Class cls5 = Byte.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    public static <T> T f7l8(String str, String str2, Object... objArr) {
        try {
            return (T) zy(wu.zy(null, str), str2, objArr);
        } catch (Exception e2) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str + ", " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m21409g(String str, String str2) {
        try {
            return (T) m21410k(wu.zy(null, str), null, str2);
        } catch (Exception e2) {
            Log.w("JavaCalls", "Meet exception when call getStaticField '" + str2 + "' in " + str + ", " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static <T> T m21410k(Class<? extends Object> cls, Object obj, String str) throws NoSuchFieldException {
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    public static void kja0(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    private static boolean ld6(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class<?> cls = clsArr2[i2];
            if (cls != null && !clsArr[i2].isAssignableFrom(cls)) {
                Map<Class<?>, Class<?>> map = f33576k;
                if (!map.containsKey(clsArr[i2]) || !map.get(clsArr[i2]).equals(map.get(clsArr2[i2]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m21411n(Object obj, String str, Object... objArr) {
        try {
            return (T) n7h(obj, str, objArr);
        } catch (Exception e2) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str + "' in " + obj + ", " + e2);
            return null;
        }
    }

    public static <T> T n7h(Object obj, String str, Object... objArr) {
        return (T) m21415y(obj.getClass(), str, x2(objArr)).invoke(obj, qrj(objArr));
    }

    /* JADX INFO: renamed from: p */
    public static void m21412p(Object obj, String str, Object obj2) {
        try {
            kja0(obj, str, obj2);
        } catch (Exception e2) {
            Log.w("JavaCalls", "Meet exception when call setField '" + str + "' in " + obj + ", " + e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m21413q(Object obj, String str) {
        try {
            return (T) m21410k(obj.getClass(), obj, str);
        } catch (Exception e2) {
            Log.w("JavaCalls", "Meet exception when call getField '" + str + "' in " + obj + ", " + e2);
            return null;
        }
    }

    private static Object[] qrj(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null || !(obj instanceof k)) {
                objArr2[i2] = obj;
            } else {
                objArr2[i2] = ((k) obj).f73540toq;
            }
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: s */
    private static Method m21414s(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && ld6(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public static <T> T toq(Class<? extends Object> cls, String str) {
        try {
            return (T) m21410k(cls, null, str);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getStaticField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(cls != null ? cls.getSimpleName() : "");
            sb.append(", ");
            sb.append(e2);
            Log.w("JavaCalls", sb.toString());
            return null;
        }
    }

    private static Class<?>[] x2(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null || !(obj instanceof k)) {
                clsArr[i2] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i2] = ((k) obj).f33577k;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: y */
    private static Method m21415y(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodM21414s = m21414s(cls.getDeclaredMethods(), str, clsArr);
        if (methodM21414s != null) {
            methodM21414s.setAccessible(true);
            return methodM21414s;
        }
        if (cls.getSuperclass() != null) {
            return m21415y(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    public static <T> T zy(Class<?> cls, String str, Object... objArr) {
        return (T) m21415y(cls, str, x2(objArr)).invoke(null, qrj(objArr));
    }
}
