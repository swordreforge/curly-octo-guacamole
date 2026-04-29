package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kja0 {

    /* JADX INFO: renamed from: com.google.gson.internal.kja0$k */
    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class C4900k extends kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Method f27742k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Object f68780toq;

        C4900k(Method method, Object obj) {
            this.f27742k = method;
            this.f68780toq = obj;
        }

        @Override // com.google.gson.internal.kja0
        public <T> T zy(Class<T> cls) throws Exception {
            kja0.m17166k(cls);
            return (T) this.f27742k.invoke(this.f68780toq, cls);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.kja0$q */
    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class C4901q extends kja0 {
        C4901q() {
        }

        @Override // com.google.gson.internal.kja0
        public <T> T zy(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class toq extends kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Method f27743k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f68781toq;

        toq(Method method, int i2) {
            this.f27743k = method;
            this.f68781toq = i2;
        }

        @Override // com.google.gson.internal.kja0
        public <T> T zy(Class<T> cls) throws Exception {
            kja0.m17166k(cls);
            return (T) this.f27743k.invoke(null, cls, Integer.valueOf(this.f68781toq));
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class zy extends kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Method f27744k;

        zy(Method method) {
            this.f27744k = method;
        }

        @Override // com.google.gson.internal.kja0
        public <T> T zy(Class<T> cls) throws Exception {
            kja0.m17166k(cls);
            return (T) this.f27744k.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: renamed from: k */
    static void m17166k(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static kja0 toq() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C4900k(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new toq(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    return new C4901q();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new zy(declaredMethod3);
            }
        }
    }

    public abstract <T> T zy(Class<T> cls) throws Exception;
}
