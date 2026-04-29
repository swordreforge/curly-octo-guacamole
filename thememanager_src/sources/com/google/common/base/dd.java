package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Throwables.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class dd {

    /* JADX INFO: renamed from: k */
    @wlev.zy
    private static final String f25645k = "sun.misc.JavaLangAccess";

    /* JADX INFO: renamed from: n */
    @NullableDecl
    @wlev.zy
    private static final Method f25646n;

    /* JADX INFO: renamed from: q */
    @NullableDecl
    @wlev.zy
    private static final Method f25647q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7732q
    @wlev.zy
    static final String f68094toq = "sun.misc.SharedSecrets";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @NullableDecl
    @wlev.zy
    private static final Object f68095zy;

    /* JADX INFO: renamed from: com.google.common.base.dd$k */
    /* JADX INFO: compiled from: Throwables.java */
    static class C4241k extends AbstractList<StackTraceElement> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Throwable f25648k;

        C4241k(Throwable th) {
            this.f25648k = th;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int i2) {
            return (StackTraceElement) dd.qrj(dd.f25647q, dd.f68095zy, this.f25648k, Integer.valueOf(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ((Integer) dd.qrj(dd.f25646n, dd.f68095zy, this.f25648k)).intValue();
        }
    }

    static {
        Object objM15324y = m15324y();
        f68095zy = objM15324y;
        f25647q = objM15324y == null ? null : f7l8();
        f25646n = objM15324y != null ? ld6() : null;
    }

    private dd() {
    }

    @CanIgnoreReturnValue
    @wlev.zy
    @Deprecated
    public static RuntimeException cdj(Throwable th) {
        ni7(th);
        throw new RuntimeException(th);
    }

    @NullableDecl
    @wlev.zy
    private static Method f7l8() {
        return m15323s("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @wlev.zy
    public static <X1 extends Throwable, X2 extends Throwable> void fn3e(@NullableDecl Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable {
        jk.a9(cls2);
        ki(th, cls);
        m15318i(th, cls2);
    }

    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static <X extends Throwable> X m15316g(Throwable th, Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (ClassCastException e2) {
            e2.initCause(th);
            throw e2;
        }
    }

    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: h */
    public static boolean m15317h() {
        return (f25647q == null || f25646n == null) ? false : true;
    }

    @wlev.zy
    /* JADX INFO: renamed from: i */
    public static <X extends Throwable> void m15318i(@NullableDecl Throwable th, Class<X> cls) throws Throwable {
        ki(th, cls);
        t8r(th);
    }

    @wlev.zy
    @Deprecated
    public static <X extends Throwable> void ki(@NullableDecl Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            zurt(th, cls);
        }
    }

    @InterfaceC7731k
    @wlev.zy
    public static List<StackTraceElement> kja0(Throwable th) {
        return m15317h() ? n7h(th) : Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    @NullableDecl
    @wlev.zy
    private static Method ld6() {
        try {
            Method methodM15323s = m15323s("getStackTraceDepth", Throwable.class);
            if (methodM15323s == null) {
                return null;
            }
            methodM15323s.invoke(m15324y(), new Throwable());
            return methodM15323s;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: n */
    public static List<Throwable> m15320n(Throwable th) {
        jk.a9(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z2 = false;
        Throwable cause = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
            if (z2) {
                cause = cause.getCause();
            }
            z2 = !z2;
        }
    }

    @wlev.zy
    private static List<StackTraceElement> n7h(Throwable th) {
        jk.a9(th);
        return new C4241k(th);
    }

    public static void ni7(Throwable th) {
        jk.a9(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* JADX INFO: renamed from: p */
    public static Throwable m15321p(Throwable th) {
        boolean z2 = false;
        Throwable cause = th;
        while (true) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                return th;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z2) {
                cause = cause.getCause();
            }
            z2 = !z2;
            th = cause2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wlev.zy
    public static Object qrj(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw cdj(e3.getCause());
        }
    }

    @NullableDecl
    @wlev.zy
    /* JADX INFO: renamed from: s */
    private static Method m15323s(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(f25645k, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @wlev.zy
    @Deprecated
    public static void t8r(@NullableDecl Throwable th) {
        if (th != null) {
            ni7(th);
        }
    }

    @wlev.zy
    public static String x2(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    @wlev.zy
    /* JADX INFO: renamed from: y */
    private static Object m15324y() {
        try {
            return Class.forName(f68094toq, false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @wlev.zy
    public static <X extends Throwable> void zurt(Throwable th, Class<X> cls) throws Throwable {
        jk.a9(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }
}
