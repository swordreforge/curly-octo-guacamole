package com.market.sdk.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.market.sdk.reflect.q */
/* JADX INFO: compiled from: Method.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4990q {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f68925toq = "Method";

    /* JADX INFO: renamed from: k */
    private final Method f28127k;

    private C4990q(Method method) {
        this.f28127k = method;
    }

    /* JADX INFO: renamed from: p */
    public static C4990q m17350p(String str, String str2, String str3) throws C4988n, NoSuchMethodException {
        try {
            return m17351s(Class.forName(str), str2, str3);
        } catch (ClassNotFoundException e2) {
            throw new C4988n(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    public static C4990q m17351s(Class<?> cls, String str, String str2) throws NoSuchMethodException {
        try {
            return new C4990q(cls.getMethod(str, C4992y.m17369s(str2)));
        } catch (ClassNotFoundException e2) {
            throw new NoSuchMethodException(e2.getMessage());
        } catch (NoSuchMethodException e3) {
            throw new NoSuchMethodException(e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public static C4990q m17352y(Class<?> cls, String str, Class<?> cls2, Class<?>... clsArr) {
        return new C4990q(null);
    }

    public Object f7l8(Class<?> cls, Object obj, Object... objArr) throws zy {
        Method method = this.f28127k;
        if (method == null) {
            return null;
        }
        try {
            method.setAccessible(true);
            return this.f28127k.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new zy(e2.getMessage());
        } catch (InvocationTargetException e3) {
            throw new zy(e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public long m17353g(Class<?> cls, Object obj, Object... objArr) throws zy {
        Object objF7l8 = f7l8(cls, obj, objArr);
        if (objF7l8 != null && (objF7l8 instanceof Long)) {
            return ((Long) objF7l8).longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: k */
    public void m17354k(Class<?> cls, Object obj, Object... objArr) throws zy {
        Method method = this.f28127k;
        if (method == null) {
            return;
        }
        try {
            method.setAccessible(true);
            this.f28127k.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new zy(e2.getMessage());
        } catch (InvocationTargetException e3) {
            throw new zy(e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public int m17355n(Class<?> cls, Object obj, Object... objArr) throws zy {
        Object objF7l8 = f7l8(cls, obj, objArr);
        if (objF7l8 != null && (objF7l8 instanceof Integer)) {
            return ((Integer) objF7l8).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public float m17356q(Class<?> cls, Object obj, Object... objArr) throws zy {
        Object objF7l8 = f7l8(cls, obj, objArr);
        if (objF7l8 != null && (objF7l8 instanceof Double)) {
            return ((Float) objF7l8).floatValue();
        }
        return 0.0f;
    }

    public boolean toq(Class<?> cls, Object obj, Object... objArr) throws zy {
        Object objF7l8 = f7l8(cls, obj, objArr);
        if (objF7l8 != null && (objF7l8 instanceof Boolean)) {
            return ((Boolean) objF7l8).booleanValue();
        }
        return false;
    }

    public double zy(Class<?> cls, Object obj, Object... objArr) throws zy {
        Object objF7l8 = f7l8(cls, obj, objArr);
        if (objF7l8 != null && (objF7l8 instanceof Double)) {
            return ((Double) objF7l8).doubleValue();
        }
        return 0.0d;
    }
}
