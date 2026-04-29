package miuix.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Reflects.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {
    private toq() {
    }

    public static Field f7l8(Class<?> cls, String str) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Method m26535g(String str, String str2, Class<?>... clsArr) {
        return m26537n(m26536k(str), str2, clsArr);
    }

    /* JADX INFO: renamed from: k */
    public static Class<?> m26536k(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Object ld6(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Method m26537n(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static Method m26538p(String str, String str2, Class<?>... clsArr) {
        return m26540s(m26536k(str), str2, clsArr);
    }

    /* JADX INFO: renamed from: q */
    public static Field m26539q(String str, String str2) {
        return zy(m26536k(str), str2);
    }

    /* JADX INFO: renamed from: s */
    public static Method m26540s(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Object toq(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void x2(Object obj, Field field, Object obj2) {
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static Field m26541y(String str, String str2) {
        return f7l8(m26536k(str), str2);
    }

    public static Field zy(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }
}
