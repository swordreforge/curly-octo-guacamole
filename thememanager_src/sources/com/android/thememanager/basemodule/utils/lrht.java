package com.android.thememanager.basemodule.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import yz.C7794k;

/* JADX INFO: compiled from: ThemeReflectUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class lrht {

    /* JADX INFO: renamed from: k */
    private static final String f10348k = "ThemeReflectUtils";

    public static <T> T f7l8(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return (T) method.invoke(obj, objArr);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "invoke Exception: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Method m7116g(Class<?> clazz, String name, Class<?>... parameterTypes) {
        try {
            return clazz.getDeclaredMethod(name, parameterTypes);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "getMethod Exception: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Class<?> m7117k(String name) {
        try {
            return Class.forName(name);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "getClass Exception: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Method m7118n(Class<?> clazz, String name, Class<?>... parameterTypes) {
        try {
            return clazz.getMethod(name, parameterTypes);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "getMethod Exception: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m7119q(Class<?> cls, String str, Object obj) {
        try {
            Field fieldZy = zy(cls, str);
            fieldZy.setAccessible(true);
            return (T) fieldZy.get(obj);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "getFieldValue Exception: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static <T> void m7120s(Class<?> clazz, String name, Object instance, T newValue) {
        try {
            Field qVar = toq(clazz, name);
            qVar.setAccessible(true);
            qVar.set(instance, newValue);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "setFieldValue Exception: " + e2);
        }
    }

    public static Field toq(Class<?> clazz, String name) {
        try {
            return clazz.getDeclaredField(name);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "getDeclaredField Exception: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static Object m7121y(String name) {
        try {
            return m7117k(name).newInstance();
        } catch (Exception e2) {
            C7794k.toq(f10348k, "newInstance Exception: " + e2);
            return null;
        }
    }

    public static Field zy(Class<?> clazz, String name) {
        try {
            return clazz.getField(name);
        } catch (Exception e2) {
            C7794k.toq(f10348k, "getField Exception: " + e2);
            return null;
        }
    }
}
