package com.google.gson.internal;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: Primitives.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qrj {
    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m17182k(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* JADX INFO: renamed from: q */
    public static <T> Class<T> m17183q(Class<T> cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static boolean toq(Type type) {
        return type == Integer.class || type == Float.class || type == Byte.class || type == Double.class || type == Long.class || type == Character.class || type == Boolean.class || type == Short.class || type == Void.class;
    }

    public static <T> Class<T> zy(Class<T> cls) {
        return cls == Integer.class ? Integer.TYPE : cls == Float.class ? Float.TYPE : cls == Byte.class ? Byte.TYPE : cls == Double.class ? Double.TYPE : cls == Long.class ? Long.TYPE : cls == Character.class ? Character.TYPE : cls == Boolean.class ? Boolean.TYPE : cls == Short.class ? Short.TYPE : cls == Void.class ? Void.TYPE : cls;
    }
}
