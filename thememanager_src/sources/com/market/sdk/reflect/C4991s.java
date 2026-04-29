package com.market.sdk.reflect;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.market.sdk.reflect.s */
/* JADX INFO: compiled from: ReflectUtilsForMiui.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4991s {

    /* JADX INFO: renamed from: k */
    private static final String f28128k = "this$0";

    /* JADX INFO: renamed from: n */
    public static final String f28129n = "<init>";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Class<?>[] f68926toq = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String[] f68927zy = {toq.f68929toq, "B", toq.f28134q, "S", toq.f28131g, toq.f68928f7l8, toq.f28136y, toq.f28135s, "V"};

    /* JADX INFO: renamed from: q */
    private static final WeakHashMap<Object, HashMap<String, Object>> f28130q = new WeakHashMap<>();

    protected C4991s() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static Object f7l8(Object obj, String str, Object obj2) {
        HashMap<String, Object> map;
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("object must not be null");
        }
        if (str == null) {
            throw new NullPointerException("fieldName must not be null");
        }
        WeakHashMap<Object, HashMap<String, Object>> weakHashMap = f28130q;
        synchronized (weakHashMap) {
            map = weakHashMap.get(obj);
            if (map == null) {
                map = new HashMap<>();
                weakHashMap.put(obj, map);
            }
        }
        synchronized (map) {
            objPut = map.put(str, obj2);
        }
        return objPut;
    }

    /* JADX INFO: renamed from: g */
    public static Object m17357g(Object obj, String str) {
        Object objRemove;
        if (obj == null) {
            throw new NullPointerException("object must not be null");
        }
        if (str == null) {
            throw new NullPointerException("fieldName must not be null");
        }
        WeakHashMap<Object, HashMap<String, Object>> weakHashMap = f28130q;
        synchronized (weakHashMap) {
            HashMap<String, Object> map = weakHashMap.get(obj);
            if (map == null) {
                return null;
            }
            synchronized (map) {
                objRemove = map.remove(str);
            }
            return objRemove;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Object m17358k(Object obj, String str) {
        Object obj2;
        if (obj == null) {
            throw new NullPointerException("object must not be null");
        }
        if (str == null) {
            throw new NullPointerException("fieldName must not be null");
        }
        WeakHashMap<Object, HashMap<String, Object>> weakHashMap = f28130q;
        synchronized (weakHashMap) {
            HashMap<String, Object> map = weakHashMap.get(obj);
            if (map == null) {
                return null;
            }
            synchronized (map) {
                obj2 = map.get(str);
            }
            return obj2;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Object m17359n(Object obj) throws NoSuchFieldException {
        return toq.m17363q(obj.getClass(), f28128k, toq(obj.getClass())).m17364k(obj);
    }

    /* JADX INFO: renamed from: q */
    public static String m17360q(Class<?>[] clsArr, Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        if (clsArr != null) {
            for (Class<?> cls2 : clsArr) {
                sb.append(toq(cls2));
            }
        }
        sb.append(')');
        sb.append(toq(cls));
        return sb.toString();
    }

    public static String toq(Class<?> cls) {
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = f68926toq;
            if (i2 >= clsArr.length) {
                return zy(cls.getName());
            }
            if (cls == clsArr[i2]) {
                return f68927zy[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m17361y(Class<?> cls, Object obj, Object obj2, Object obj3) throws zy {
        if (cls == null && obj == null) {
            throw new zy("clazz and holder cannot be all null");
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                try {
                    if (field.get(obj) == obj2) {
                        field.set(obj, obj3);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static String zy(String str) {
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = f68926toq;
            if (i2 >= clsArr.length) {
                break;
            }
            if (clsArr[i2].getName().equals(str)) {
                str = f68927zy[i2];
            }
            i2++;
        }
        String strReplace = str.replace(".", "/");
        if (strReplace.startsWith("[")) {
            return strReplace;
        }
        return "L" + strReplace + ";";
    }
}
