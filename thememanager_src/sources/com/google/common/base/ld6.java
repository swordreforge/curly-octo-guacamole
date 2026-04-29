package com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Enums.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class ld6 {

    /* JADX INFO: renamed from: k */
    @wlev.zy
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f25681k = new WeakHashMap();

    /* JADX INFO: renamed from: com.google.common.base.ld6$k */
    /* JADX INFO: compiled from: Enums.java */
    private static final class C4263k<T extends Enum<T>> extends AbstractC4272s<String, T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Class<T> enumClass;

        C4263k(Class<T> cls) {
            this.enumClass = (Class) jk.a9(cls);
        }

        @Override // com.google.common.base.AbstractC4272s, com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4263k) {
                return this.enumClass.equals(((C4263k) obj).enumClass);
            }
            return false;
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        public String toString() {
            return "Enums.stringConverter(" + this.enumClass.getName() + ".class)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(T t2) {
            return t2.name();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public T doForward(String str) {
            return (T) Enum.valueOf(this.enumClass, str);
        }
    }

    private ld6() {
    }

    @wlev.zy
    /* JADX INFO: renamed from: k */
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m15403k(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> mapM15405q;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = f25681k;
        synchronized (map) {
            mapM15405q = map.get(cls);
            if (mapM15405q == null) {
                mapM15405q = m15405q(cls);
            }
        }
        return mapM15405q;
    }

    /* JADX INFO: renamed from: n */
    public static <T extends Enum<T>> AbstractC4272s<String, T> m15404n(Class<T> cls) {
        return new C4263k(cls);
    }

    @wlev.zy
    /* JADX INFO: renamed from: q */
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m15405q(Class<T> cls) {
        HashMap map = new HashMap();
        for (Enum r2 : EnumSet.allOf(cls)) {
            map.put(r2.name(), new WeakReference(r2));
        }
        f25681k.put(cls, map);
        return map;
    }

    @wlev.zy
    public static Field toq(Enum<?> r1) {
        try {
            return r1.getDeclaringClass().getDeclaredField(r1.name());
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    public static <T extends Enum<T>> o1t<T> zy(Class<T> cls, String str) {
        jk.a9(cls);
        jk.a9(str);
        return mcp.m15410q(cls, str);
    }
}
