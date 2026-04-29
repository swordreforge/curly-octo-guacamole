package com.google.common.reflect;

import com.google.common.base.jk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.reflect.y */
/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class C4782y {
    private C4782y() {
    }

    /* JADX INFO: renamed from: k */
    public static String m16845k(Class<?> cls) {
        return toq(cls.getName());
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m16846q(Class<T> cls, InvocationHandler invocationHandler) {
        jk.a9(invocationHandler);
        jk.fn3e(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static String toq(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? "" : str.substring(0, iLastIndexOf);
    }

    public static void zy(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (ClassNotFoundException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
