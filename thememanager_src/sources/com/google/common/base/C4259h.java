package com.google.common.base;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.base.h */
/* JADX INFO: compiled from: FinalizableReferenceQueue.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public class C4259h implements Closeable {

    /* JADX INFO: renamed from: g */
    private static final Logger f25673g = Logger.getLogger(C4259h.class.getName());

    /* JADX INFO: renamed from: s */
    private static final Method f25674s = m15364q(m15365y(new q(), new k(), new toq()));

    /* JADX INFO: renamed from: y */
    private static final String f25675y = "com.google.common.base.internal.Finalizer";

    /* JADX INFO: renamed from: k */
    final ReferenceQueue<Object> f25676k;

    /* JADX INFO: renamed from: n */
    final boolean f25677n;

    /* JADX INFO: renamed from: q */
    final PhantomReference<Object> f25678q;

    /* JADX INFO: renamed from: com.google.common.base.h$k */
    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    static class k implements zy {

        /* JADX INFO: renamed from: k */
        private static final String f25679k = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        k() {
        }

        @Override // com.google.common.base.C4259h.zy
        @NullableDecl
        /* JADX INFO: renamed from: k */
        public Class<?> mo15366k() {
            try {
                return zy(toq()).loadClass(C4259h.f25675y);
            } catch (Exception e2) {
                C4259h.f25673g.log(Level.WARNING, f25679k, (Throwable) e2);
                return null;
            }
        }

        URL toq() throws IOException {
            String str = C4259h.f25675y.replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + string);
        }

        URLClassLoader zy(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.h$q */
    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    static class q implements zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7732q
        static boolean f25680k;

        q() {
        }

        @Override // com.google.common.base.C4259h.zy
        @NullableDecl
        /* JADX INFO: renamed from: k */
        public Class<?> mo15366k() {
            if (f25680k) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(C4259h.f25675y);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                C4259h.f25673g.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.h$toq */
    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    static class toq implements zy {
        toq() {
        }

        @Override // com.google.common.base.C4259h.zy
        /* JADX INFO: renamed from: k */
        public Class<?> mo15366k() {
            try {
                return Class.forName("ga.k");
            } catch (ClassNotFoundException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.h$zy */
    /* JADX INFO: compiled from: FinalizableReferenceQueue.java */
    interface zy {
        @NullableDecl
        /* JADX INFO: renamed from: k */
        Class<?> mo15366k();
    }

    public C4259h() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f25676k = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f25678q = phantomReference;
        boolean z2 = true;
        try {
            f25674s.invoke(null, kja0.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (Throwable th) {
            f25673g.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z2 = false;
        }
        this.f25677n = z2;
    }

    /* JADX INFO: renamed from: q */
    static Method m15364q(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: y */
    private static Class<?> m15365y(zy... zyVarArr) {
        for (zy zyVar : zyVarArr) {
            Class<?> clsMo15366k = zyVar.mo15366k();
            if (clsMo15366k != null) {
                return clsMo15366k;
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25678q.enqueue();
        zy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void zy() {
        if (this.f25677n) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.f25676k.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((kja0) referencePoll).m15392k();
            } catch (Throwable th) {
                f25673g.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
        }
    }
}
