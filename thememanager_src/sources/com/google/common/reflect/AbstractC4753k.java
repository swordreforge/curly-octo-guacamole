package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.reflect.k */
/* JADX INFO: compiled from: AbstractInvocationHandler.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class AbstractC4753k implements InvocationHandler {

    /* JADX INFO: renamed from: k */
    private static final Object[] f27319k = new Object[0];

    private static boolean toq(Object obj, Class<?> cls) {
        return cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()));
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, @NullableDecl Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = f27319k;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (objArr.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (objArr.length == 0 && method.getName().equals("toString")) ? toString() : m16764k(obj, method, objArr);
        }
        Object obj2 = objArr[0];
        if (obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj == obj2) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(toq(obj2, obj.getClass()) && equals(Proxy.getInvocationHandler(obj2)));
    }

    /* JADX INFO: renamed from: k */
    protected abstract Object m16764k(Object obj, Method method, Object[] objArr) throws Throwable;

    public String toString() {
        return super.toString();
    }
}
