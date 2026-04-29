package ga;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: ga.k */
/* JADX INFO: compiled from: Finalizer.java */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC6048k implements Runnable {

    /* JADX INFO: renamed from: g */
    private static final Logger f34697g = Logger.getLogger(RunnableC6048k.class.getName());

    /* JADX INFO: renamed from: p */
    @NullableDecl
    private static final Field f34698p;

    /* JADX INFO: renamed from: s */
    @NullableDecl
    private static final Constructor<Thread> f34699s;

    /* JADX INFO: renamed from: y */
    private static final String f34700y = "com.google.common.base.FinalizableReference";

    /* JADX INFO: renamed from: k */
    private final WeakReference<Class<?>> f34701k;

    /* JADX INFO: renamed from: n */
    private final ReferenceQueue<Object> f34702n;

    /* JADX INFO: renamed from: q */
    private final PhantomReference<Object> f34703q;

    static {
        Constructor<Thread> qVar = toq();
        f34699s = qVar;
        f34698p = qVar == null ? m22279q() : null;
    }

    private RunnableC6048k(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.f34702n = referenceQueue;
        this.f34701k = new WeakReference<>(cls);
        this.f34703q = phantomReference;
    }

    /* JADX INFO: renamed from: k */
    private boolean m22277k(Reference<?> reference) {
        Method methodZy = zy();
        if (methodZy == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f34703q) {
                return false;
            }
            try {
                methodZy.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                f34697g.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.f34702n.poll();
        } while (reference != null);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m22278n(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        Thread thread;
        if (!cls.getName().equals("com.google.common.base.kja0")) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        RunnableC6048k runnableC6048k = new RunnableC6048k(cls, referenceQueue, phantomReference);
        String name = RunnableC6048k.class.getName();
        Constructor<Thread> constructor = f34699s;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, runnableC6048k, name, 0L, Boolean.FALSE);
            } catch (Throwable th) {
                f34697g.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, runnableC6048k, name);
        }
        thread.setDaemon(true);
        try {
            Field field = f34698p;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th2) {
            f34697g.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        thread.start();
    }

    @NullableDecl
    /* JADX INFO: renamed from: q */
    private static Field m22279q() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f34697g.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    @NullableDecl
    private static Constructor<Thread> toq() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private Method zy() {
        Class<?> cls = this.f34701k.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (m22277k(this.f34702n.remove())) {
        }
    }
}
