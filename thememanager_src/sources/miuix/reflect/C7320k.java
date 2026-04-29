package miuix.reflect;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: miuix.reflect.k */
/* JADX INFO: compiled from: ReflectionHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7320k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Method f90052f7l8;

    /* JADX INFO: renamed from: g */
    private static Method f41586g;

    /* JADX INFO: renamed from: k */
    static HashMap<String, Class<?>> f41587k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Method f90053ld6;

    /* JADX INFO: renamed from: n */
    private static Method f41588n;

    /* JADX INFO: renamed from: p */
    private static Method f41589p;

    /* JADX INFO: renamed from: q */
    private static Map<String, Constructor> f41590q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static Method f90054qrj;

    /* JADX INFO: renamed from: s */
    private static Method f41591s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, Method> f90055toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static Method f90056x2;

    /* JADX INFO: renamed from: y */
    private static Method f41592y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<String, Field> f90057zy;

    static {
        HashMap<String, Class<?>> map = new HashMap<>();
        f41587k = map;
        map.put("byte", Byte.TYPE);
        f41587k.put("short", Short.TYPE);
        f41587k.put("int", Integer.TYPE);
        f41587k.put("long", Long.TYPE);
        f41587k.put("char", Character.TYPE);
        f41587k.put(zurt.toq.f1755g, Boolean.TYPE);
        f41587k.put(zurt.toq.f47471zy, Float.TYPE);
        f41587k.put("double", Double.TYPE);
        f41587k.put("byte[]", byte[].class);
        f41587k.put("short[]", short[].class);
        f41587k.put("int[]", int[].class);
        f41587k.put("long[]", long[].class);
        f41587k.put("char[]", char[].class);
        f41587k.put("boolean[]", boolean[].class);
        f41587k.put("float[]", float[].class);
        f41587k.put("double[]", double[].class);
        f90055toq = new HashMap();
        f90057zy = new HashMap();
        f41590q = new HashMap();
        f41588n = null;
        f41586g = null;
        f90052f7l8 = null;
        f41592y = null;
        f41591s = null;
        f41589p = null;
        f90053ld6 = null;
        f90056x2 = null;
        f90054qrj = null;
    }

    private static Object cdj(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f41588n == null) {
            f41588n = Method.class.getMethod("invoke", Object.class, Object[].class);
        }
        return f41588n.invoke(obj, objArr);
    }

    public static <T> T f7l8(Class<?> cls, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Constructor constructorM26525g = m26525g(cls, clsArr);
        if (constructorM26525g == null) {
            return null;
        }
        return (T) t8r(constructorM26525g, objArr);
    }

    public static void fn3e(Class<?> cls, Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field fieldX2 = x2(cls, str);
        if (fieldX2 != null) {
            zurt(fieldX2, obj, obj2);
        }
    }

    private static Class<?> fu4(String str) throws ClassNotFoundException {
        if (f41587k.containsKey(str)) {
            return f41587k.get(str);
        }
        if (!str.contains(".")) {
            str = "java.lang." + str;
        }
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: g */
    public static Constructor m26525g(Class<?> cls, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String qVar = toq(cls, clsArr);
        Constructor constructor = f41590q.get(qVar);
        if (constructor != null) {
            return constructor;
        }
        Constructor constructorM26533y = m26533y(cls, clsArr);
        m26527i(constructorM26533y, true);
        f41590q.put(qVar, constructorM26533y);
        return constructorM26533y;
    }

    /* JADX INFO: renamed from: h */
    public static void m26526h(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodKja0 = kja0(cls, str, clsArr);
        if (methodKja0 != null) {
            cdj(methodKja0, obj, objArr);
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m26527i(Object obj, boolean z2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f41592y == null) {
            f41592y = AccessibleObject.class.getMethod("setAccessible", Boolean.TYPE);
        }
        f41592y.invoke(obj, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: k */
    private static Class m26528k(String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f90053ld6 == null) {
            f90053ld6 = Class.class.getMethod("forName", String.class);
        }
        return (Class) f90053ld6.invoke(null, str);
    }

    public static <T> T ki(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodKja0 = kja0(cls, str, clsArr);
        if (methodKja0 != null) {
            return (T) cdj(methodKja0, obj, objArr);
        }
        return null;
    }

    public static Method kja0(Class<?> cls, String str, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strM26531q = m26531q(cls, str, clsArr);
        Method method = f90055toq.get(strM26531q);
        if (method != null) {
            return method;
        }
        Method methodM26530p = m26530p(cls, str, clsArr);
        m26527i(methodM26530p, true);
        f90055toq.put(strM26531q, methodM26530p);
        return methodM26530p;
    }

    public static Object ld6(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Enum.valueOf(Class.forName(str), str2);
            } catch (ClassCastException | ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static Class<?> m26529n(String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return m26528k(str);
    }

    private static Object n7h(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f90054qrj == null) {
            f90054qrj = Field.class.getMethod("get", Object.class);
        }
        return f90054qrj.invoke(obj, obj2);
    }

    public static Class<?> ni7(String str) {
        try {
            return fu4(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    private static Method m26530p(Object obj, String str, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f90052f7l8 == null) {
            f90052f7l8 = Class.class.getMethod("getDeclaredMethod", String.class, Class[].class);
        }
        return (Method) f90052f7l8.invoke(obj, str, clsArr);
    }

    /* JADX INFO: renamed from: q */
    private static String m26531q(Class<?> cls, String str, Class<?>[] clsArr) {
        return cls.toString() + "/" + str + "/" + Arrays.toString(clsArr);
    }

    public static <T> T qrj(Class<?> cls, Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field fieldX2 = x2(cls, str);
        if (fieldX2 == null) {
            return null;
        }
        return (T) n7h(fieldX2, obj);
    }

    /* JADX INFO: renamed from: s */
    private static Field m26532s(Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f41586g == null) {
            f41586g = Class.class.getMethod("getDeclaredField", String.class);
        }
        return (Field) f41586g.invoke(obj, str);
    }

    private static <T> T t8r(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f41589p == null) {
            f41589p = Constructor.class.getMethod("newInstance", Object[].class);
        }
        return (T) f41589p.invoke(obj, objArr);
    }

    private static String toq(Class<?> cls, Class<?>... clsArr) {
        return cls.toString() + "/" + Arrays.toString(clsArr);
    }

    public static Field x2(Class<?> cls, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strZy = zy(cls, str);
        Field field = f90057zy.get(strZy);
        if (field != null) {
            return field;
        }
        Field fieldM26532s = m26532s(cls, str);
        m26527i(fieldM26532s, true);
        f90057zy.put(strZy, fieldM26532s);
        return fieldM26532s;
    }

    /* JADX INFO: renamed from: y */
    private static Constructor m26533y(Object obj, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f41591s == null) {
            f41591s = Class.class.getMethod("getDeclaredConstructor", Class[].class);
        }
        return (Constructor) f41591s.invoke(obj, clsArr);
    }

    /* JADX INFO: renamed from: z */
    public static Class<?>[] m26534z(String[] strArr) throws ClassNotFoundException {
        if (strArr == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            clsArr[i2] = fu4(strArr[i2]);
        }
        return clsArr;
    }

    private static void zurt(Object obj, Object obj2, Object obj3) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f90056x2 == null) {
            f90056x2 = Field.class.getMethod("set", Object.class, Object.class);
        }
        f90056x2.invoke(obj, obj2, obj3);
    }

    private static String zy(Class<?> cls, String str) {
        return cls.toString() + "/" + str;
    }
}
