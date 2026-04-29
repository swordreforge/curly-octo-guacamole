package bek6;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ReflectionHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static Map<String, Method> f7264k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, Field> f54009toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<String, Constructor> f54011zy = new HashMap();

    /* JADX INFO: renamed from: q */
    private static Method f7267q = null;

    /* JADX INFO: renamed from: n */
    private static Method f7265n = null;

    /* JADX INFO: renamed from: g */
    private static Method f7263g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Method f54007f7l8 = null;

    /* JADX INFO: renamed from: y */
    private static Method f7269y = null;

    /* JADX INFO: renamed from: s */
    private static Method f7268s = null;

    /* JADX INFO: renamed from: p */
    private static Method f7266p = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Method f54008ld6 = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static Method f54010x2 = null;

    public static <T> T cdj(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodN7h = n7h(cls, str, clsArr);
        if (methodN7h != null) {
            return (T) m5802h(methodN7h, obj, objArr);
        }
        return null;
    }

    public static <T> T f7l8(Class<?> cls, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Constructor constructorM5801g = m5801g(cls, clsArr);
        if (constructorM5801g == null) {
            return null;
        }
        return (T) m5803i(constructorM5801g, objArr);
    }

    private static void fn3e(Object receiver, boolean flag) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f54007f7l8 == null) {
            f54007f7l8 = AccessibleObject.class.getMethod("setAccessible", Boolean.TYPE);
        }
        f54007f7l8.invoke(receiver, Boolean.valueOf(flag));
    }

    /* JADX INFO: renamed from: g */
    public static Constructor m5801g(Class<?> clazz, Class<?>... parameterTypes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String qVar = toq(clazz, parameterTypes);
        Constructor constructor = f54011zy.get(qVar);
        if (constructor != null) {
            return constructor;
        }
        Constructor constructorM5809y = m5809y(clazz, parameterTypes);
        fn3e(constructorM5809y, true);
        f54011zy.put(qVar, constructorM5809y);
        return constructorM5809y;
    }

    /* JADX INFO: renamed from: h */
    private static Object m5802h(Object receiver, Object... args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f7267q == null) {
            f7267q = Method.class.getMethod("invoke", Object.class, Object[].class);
        }
        return f7267q.invoke(receiver, args);
    }

    /* JADX INFO: renamed from: i */
    private static <T> T m5803i(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f7268s == null) {
            f7268s = Constructor.class.getMethod("newInstance", Object[].class);
        }
        return (T) f7268s.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: k */
    private static Class m5804k(String className) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f7266p == null) {
            f7266p = Class.class.getMethod("forName", String.class);
        }
        return (Class) f7266p.invoke(null, className);
    }

    public static Object ki(Class<?> clazz, Class<?>[] parameterTypes, Object... values) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        if (clazz != null) {
            return clazz.getConstructor(parameterTypes).newInstance(values);
        }
        return null;
    }

    public static void kja0(Class<?> clazz, Object receiver, String name, Class<?>[] parameterTypes, Object... args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodN7h = n7h(clazz, name, parameterTypes);
        if (methodN7h != null) {
            m5802h(methodN7h, receiver, args);
        }
    }

    public static Field ld6(Class<?> clazz, String name) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strZy = zy(clazz, name);
        Field field = f54009toq.get(strZy);
        if (field != null) {
            return field;
        }
        Field fieldM5808s = m5808s(clazz, name);
        fn3e(fieldM5808s, true);
        f54009toq.put(strZy, fieldM5808s);
        return fieldM5808s;
    }

    /* JADX INFO: renamed from: n */
    public static Class<?> m5805n(String name) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return m5804k(name);
    }

    public static Method n7h(Class<?> clazz, String name, Class<?>... parameterTypes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strM5807q = m5807q(clazz, name, parameterTypes);
        Method method = f7264k.get(strM5807q);
        if (method != null) {
            return method;
        }
        Method methodM5806p = m5806p(clazz, name, parameterTypes);
        fn3e(methodM5806p, true);
        f7264k.put(strM5807q, methodM5806p);
        return methodM5806p;
    }

    private static void ni7(Object receiver, Object obj, Object value) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f54008ld6 == null) {
            f54008ld6 = Field.class.getMethod("set", Object.class, Object.class);
        }
        f54008ld6.invoke(receiver, obj, value);
    }

    /* JADX INFO: renamed from: p */
    private static Method m5806p(Object receiver, String name, Class<?>... parameterTypes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f7263g == null) {
            f7263g = Class.class.getMethod("getDeclaredMethod", String.class, Class[].class);
        }
        return (Method) f7263g.invoke(receiver, name, parameterTypes);
    }

    /* JADX INFO: renamed from: q */
    private static String m5807q(Class<?> clazz, String name, Class<?>[] parameterTypes) {
        return clazz.toString() + "/" + name + "/" + Arrays.toString(parameterTypes);
    }

    private static Object qrj(Object receiver, Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f54010x2 == null) {
            f54010x2 = Field.class.getMethod("get", Object.class);
        }
        return f54010x2.invoke(receiver, obj);
    }

    /* JADX INFO: renamed from: s */
    private static Field m5808s(Object receiver, String name) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f7265n == null) {
            f7265n = Class.class.getMethod("getDeclaredField", String.class);
        }
        return (Field) f7265n.invoke(receiver, name);
    }

    public static Object t8r(String className, Object[] args) throws Exception {
        Class<?> cls = Class.forName(className);
        Class<?>[] clsArr = new Class[args.length];
        int length = args.length;
        for (int i2 = 0; i2 < length; i2++) {
            clsArr[i2] = args[i2].getClass();
        }
        Constructor<?> constructor = cls.getConstructor(clsArr);
        constructor.setAccessible(true);
        return constructor.newInstance(args);
    }

    private static String toq(Class<?> clazz, Class<?>... parameterTypes) {
        return clazz.toString() + "/" + Arrays.toString(parameterTypes);
    }

    public static <T> T x2(Class<?> cls, Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field fieldLd6 = ld6(cls, str);
        if (fieldLd6 == null) {
            return null;
        }
        return (T) qrj(fieldLd6, obj);
    }

    /* JADX INFO: renamed from: y */
    private static Constructor m5809y(Object receiver, Class<?>... parameterTypes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f7269y == null) {
            f7269y = Class.class.getMethod("getDeclaredConstructor", Class[].class);
        }
        return (Constructor) f7269y.invoke(receiver, parameterTypes);
    }

    public static void zurt(Class<?> clazz, Object receiver, String name, Object value) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field fieldLd6 = ld6(clazz, name);
        if (fieldLd6 != null) {
            ni7(fieldLd6, receiver, value);
        }
    }

    private static String zy(Class<?> clazz, String name) {
        return clazz.toString() + "/" + name;
    }
}
