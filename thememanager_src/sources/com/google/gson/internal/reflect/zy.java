package com.google.gson.internal.reflect;

import com.google.gson.qrj;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: UnsafeReflectionAccessor.java */
/* JADX INFO: loaded from: classes3.dex */
final class zy extends toq {

    /* JADX INFO: renamed from: q */
    private static Class f27779q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f68784toq = m17185q();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Field f68785zy = zy();

    zy() {
    }

    /* JADX INFO: renamed from: q */
    private static Object m17185q() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f27779q = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field zy() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    boolean m17186n(AccessibleObject accessibleObject) {
        if (this.f68784toq != null && this.f68785zy != null) {
            try {
                f27779q.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f68784toq, accessibleObject, Long.valueOf(((Long) f27779q.getMethod("objectFieldOffset", Field.class).invoke(this.f68784toq, this.f68785zy)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.google.gson.internal.reflect.toq
    public void toq(AccessibleObject accessibleObject) {
        if (m17186n(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new qrj("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
