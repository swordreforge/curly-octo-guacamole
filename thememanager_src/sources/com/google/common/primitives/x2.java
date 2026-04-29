package com.google.common.primitives;

import com.google.common.base.jk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Primitives.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class x2 {

    /* JADX INFO: renamed from: k */
    private static final Map<Class<?>, Class<?>> f27306k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f68587toq;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m16740k(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m16740k(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m16740k(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m16740k(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m16740k(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m16740k(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m16740k(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m16740k(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m16740k(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f27306k = Collections.unmodifiableMap(linkedHashMap);
        f68587toq = Collections.unmodifiableMap(linkedHashMap2);
    }

    private x2() {
    }

    /* JADX INFO: renamed from: g */
    public static <T> Class<T> m16739g(Class<T> cls) {
        jk.a9(cls);
        Class<T> cls2 = (Class) f27306k.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* JADX INFO: renamed from: k */
    private static void m16740k(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* JADX INFO: renamed from: n */
    public static <T> Class<T> m16741n(Class<T> cls) {
        jk.a9(cls);
        Class<T> cls2 = (Class) f68587toq.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m16742q(Class<?> cls) {
        return f68587toq.containsKey(jk.a9(cls));
    }

    public static Set<Class<?>> toq() {
        return f27306k.keySet();
    }

    public static Set<Class<?>> zy() {
        return f68587toq.keySet();
    }
}
