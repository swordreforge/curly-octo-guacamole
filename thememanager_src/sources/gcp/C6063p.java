package gcp;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gcp.p */
/* JADX INFO: compiled from: ReflectUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6063p {

    /* JADX INFO: renamed from: g */
    public static boolean f35049g = false;

    /* JADX INFO: renamed from: k */
    private static final String f35050k = "ReflectUtils";

    /* JADX INFO: renamed from: q */
    private static Map<String, Method> f35052q = new HashMap();

    /* JADX INFO: renamed from: n */
    private static Map<String, Field> f35051n = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Class<?>[] f77042toq = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String[] f77043zy = {com.market.sdk.reflect.toq.f68929toq, "B", com.market.sdk.reflect.toq.f28134q, "S", com.market.sdk.reflect.toq.f28131g, com.market.sdk.reflect.toq.f68928f7l8, com.market.sdk.reflect.toq.f28136y, com.market.sdk.reflect.toq.f28135s, "V"};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static StringBuffer f77041f7l8 = new StringBuffer();

    private C6063p() {
    }

    public static <T> T cdj(Class<?> cls, Class<?>[] clsArr, Object... objArr) {
        try {
            return (T) cls.getConstructor(clsArr).newInstance(objArr);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            Log.e(f35050k, "invokeObjectConstructor", e2);
            ni7(cls.getName(), "", e2);
            return null;
        }
    }

    public static Field f7l8(Class<?> cls, String str, String str2) {
        try {
            String strM22327k = m22327k(cls, str, str2);
            Field field = f35051n.get(strM22327k);
            if (field != null) {
                return field;
            }
            Field field2 = cls.getField(str);
            field2.setAccessible(true);
            f35051n.put(strM22327k, field2);
            return field2;
        } catch (Exception e2) {
            Log.e(f35050k, "getField", e2);
            ni7(cls.getName(), str, e2);
            return null;
        }
    }

    public static <T> T fn3e(String str, Class[] clsArr, Object[] objArr) {
        try {
            return (T) zy(str).getConstructor(clsArr).newInstance(objArr);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m22324g(Class<?> cls, String str, Class<?> cls2) {
        return f7l8(cls, str, x2(cls2));
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m22325h(Class<?> cls, Object obj, String str, Class<?> cls2, Class<?>[] clsArr, Object... objArr) {
        if (clsArr == null) {
            try {
                clsArr = new Class[0];
            } catch (Exception e2) {
                Log.e(f35050k, "invokeObject", e2);
                return null;
            }
        }
        Method methodM22329p = m22329p(cls, str, ld6(cls2, clsArr), clsArr);
        if (methodM22329p != null) {
            return (T) methodM22329p.invoke(obj, objArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m22326i(String str, Class[] clsArr, Object... objArr) {
        try {
            return (T) zy(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e2) {
            Log.e(f35050k, "newInstance" + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m22327k(Class<?> cls, String str, String str2) {
        return cls.toString() + "/" + str + "/" + str2;
    }

    public static <T> T ki(Class<?> cls, Object obj, String str, Class<?> cls2, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method methodM22329p = m22329p(cls, str, ld6(cls2, clsArr), clsArr);
            if (methodM22329p != null) {
                return (T) methodM22329p.invoke(obj, objArr);
            }
            return null;
        } catch (Exception e2) {
            Log.e(f35050k, "invokeObject", e2);
            return null;
        }
    }

    public static <T> T kja0(Class<?> cls, Object obj, String str, Class<?> cls2, T t2, Class<?>[] clsArr, Object... objArr) {
        if (clsArr == null) {
            try {
                clsArr = new Class[0];
            } catch (Exception e2) {
                Log.e(f35050k, "invokeObject", e2);
            }
        }
        Method methodM22329p = m22329p(cls, str, ld6(cls2, clsArr), clsArr);
        if (methodM22329p != null) {
            return (T) methodM22329p.invoke(obj, objArr);
        }
        return t2;
    }

    public static String ld6(Class<?> cls, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        if (clsArr != null) {
            for (Class<?> cls2 : clsArr) {
                sb.append(x2(cls2));
            }
        }
        sb.append(')');
        sb.append(x2(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m22328n(Object obj, Class<?> cls, String str, Class<?> cls2) {
        Field fieldM22330q = m22330q(cls, str, x2(cls2));
        if (fieldM22330q == null) {
            return null;
        }
        try {
            return (T) fieldM22330q.get(obj);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public static <T> T n7h(Class<?> cls, String str, Class<?> cls2) {
        try {
            return (T) m22324g(cls, str, cls2).get(null);
        } catch (Exception e2) {
            Log.d(f35050k, "getStaticFieldValue", e2);
            return null;
        }
    }

    public static void ni7(String str, String str2, Exception exc) {
        if (f35049g) {
            String name = exc.getClass().getName();
            f77041f7l8.append(str + "---" + name + "---" + str2 + "\n");
        }
    }

    /* JADX INFO: renamed from: p */
    public static Method m22329p(Class<?> cls, String str, String str2, Class<?>... clsArr) {
        Method declaredMethod;
        try {
            String qVar = toq(cls, str, str2);
            Method method = f35052q.get(qVar);
            if (method == null) {
                try {
                    declaredMethod = cls.getMethod(str, clsArr);
                } catch (Exception unused) {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                }
                method = declaredMethod;
                f35052q.put(qVar, method);
            }
            return method;
        } catch (Exception e2) {
            Log.d(f35050k, "getMethod", e2);
            ni7(cls.getName(), str, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Field m22330q(Class<?> cls, String str, String str2) {
        try {
            String strM22327k = m22327k(cls, str, str2);
            Field field = f35051n.get(strM22327k);
            if (field != null) {
                return field;
            }
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            f35051n.put(strM22327k, declaredField);
            return declaredField;
        } catch (Exception e2) {
            Log.e(f35050k, "getField", e2);
            ni7(cls.getName(), str, e2);
            return null;
        }
    }

    public static String qrj(String str) {
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = f77042toq;
            if (i2 >= clsArr.length) {
                break;
            }
            if (clsArr[i2].getName().equals(str)) {
                str = f77043zy[i2];
            }
            i2++;
        }
        String strReplace = str.replace(".", "/");
        if (strReplace.startsWith("[")) {
            return strReplace;
        }
        return "L" + strReplace + ";";
    }

    /* JADX INFO: renamed from: s */
    public static <T> T m22331s(Object obj, Class<?> cls, String str, Class<?> cls2, T t2) {
        Field fieldM22324g = m22324g(cls, str, cls2);
        if (fieldM22324g != null) {
            try {
                return (T) fieldM22324g.get(obj);
            } catch (Exception unused) {
            }
        }
        return t2;
    }

    public static <T> T t8r(Class<?> cls, Object obj, String str, Class<?> cls2, Class<?>[] clsArr, float[] fArr) {
        try {
            Method methodM22329p = m22329p(cls, str, ld6(cls2, clsArr), clsArr);
            if (methodM22329p != null) {
                return (T) methodM22329p.invoke(obj, fArr);
            }
            return null;
        } catch (Exception e2) {
            Log.e(f35050k, "invokeObject", e2);
            return null;
        }
    }

    private static String toq(Class<?> cls, String str, String str2) {
        return cls.toString() + "/" + str + "/" + str2;
    }

    public static String x2(Class<?> cls) {
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = f77042toq;
            if (i2 >= clsArr.length) {
                return qrj(cls.getName());
            }
            if (cls == clsArr[i2]) {
                return f77043zy[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static <T> T m22332y(Object obj, Class<?> cls, String str, Class<?> cls2) {
        Field fieldM22324g = m22324g(cls, str, cls2);
        if (fieldM22324g == null) {
            return null;
        }
        try {
            return (T) fieldM22324g.get(obj);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public static void zurt(Object obj, String str, Class cls, Object obj2) {
        try {
            Field fieldM22324g = m22324g(obj.getClass(), str, cls);
            if (cls == Integer.TYPE) {
                fieldM22324g.set(obj, Integer.valueOf(((Integer) obj2).intValue()));
            } else if (cls == Float.TYPE) {
                fieldM22324g.set(obj, Float.valueOf(((Float) obj2).floatValue()));
            } else if (cls == Long.TYPE) {
                fieldM22324g.set(obj, Long.valueOf(((Long) obj2).longValue()));
            } else if (cls == Boolean.TYPE) {
                fieldM22324g.set(obj, Boolean.valueOf(((Boolean) obj2).booleanValue()));
            } else if (cls == Double.TYPE) {
                fieldM22324g.set(obj, Double.valueOf(((Double) obj2).doubleValue()));
            } else if (cls == Character.TYPE) {
                fieldM22324g.set(obj, Character.valueOf(((Character) obj2).charValue()));
            } else if (cls == Byte.TYPE) {
                fieldM22324g.set(obj, Byte.valueOf(((Byte) obj2).byteValue()));
            } else if (cls == Short.TYPE) {
                fieldM22324g.set(obj, Short.valueOf(((Short) obj2).shortValue()));
            } else {
                fieldM22324g.set(obj, cls.cast(obj2));
            }
        } catch (Exception unused) {
        }
    }

    public static Class<?> zy(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            Log.e(f35050k, "getClass", e2);
            return null;
        }
    }
}
