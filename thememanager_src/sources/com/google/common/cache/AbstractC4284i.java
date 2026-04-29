package com.google.common.cache;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.common.cache.i */
/* JADX INFO: compiled from: Striped64.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
abstract class AbstractC4284i extends Number {

    /* JADX INFO: renamed from: k */
    private static final Unsafe f25772k;

    /* JADX INFO: renamed from: n */
    private static final long f25773n;

    /* JADX INFO: renamed from: q */
    private static final long f25774q;
    volatile transient long base;
    volatile transient int busy;

    @NullableDecl
    volatile transient toq[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: com.google.common.cache.i$k */
    /* JADX INFO: compiled from: Striped64.java */
    static class k implements PrivilegedExceptionAction<Unsafe> {
        k() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.i$toq */
    /* JADX INFO: compiled from: Striped64.java */
    static final class toq {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final long f68141cdj;

        /* JADX INFO: renamed from: h */
        private static final Unsafe f25775h;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        volatile long f68142f7l8;

        /* JADX INFO: renamed from: g */
        volatile long f25776g;

        /* JADX INFO: renamed from: k */
        volatile long f25777k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        volatile long f68143kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        volatile long f68144ld6;

        /* JADX INFO: renamed from: n */
        volatile long f25778n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        volatile long f68145n7h;

        /* JADX INFO: renamed from: p */
        volatile long f25779p;

        /* JADX INFO: renamed from: q */
        volatile long f25780q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        volatile long f68146qrj;

        /* JADX INFO: renamed from: s */
        volatile long f25781s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        volatile long f68147toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        volatile long f68148x2;

        /* JADX INFO: renamed from: y */
        volatile long f25782y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        volatile long f68149zy;

        static {
            try {
                Unsafe unsafeM15470k = AbstractC4284i.m15470k();
                f25775h = unsafeM15470k;
                f68141cdj = unsafeM15470k.objectFieldOffset(toq.class.getDeclaredField(AnimatedProperty.PROPERTY_NAME_Y));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        toq(long j2) {
            this.f25782y = j2;
        }

        /* JADX INFO: renamed from: k */
        final boolean m15472k(long j2, long j3) {
            return f25775h.compareAndSwapLong(this, f68141cdj, j2, j3);
        }
    }

    static {
        try {
            Unsafe unsafeM15470k = m15470k();
            f25772k = unsafeM15470k;
            f25774q = unsafeM15470k.objectFieldOffset(AbstractC4284i.class.getDeclaredField(C3678q.f65841uv6));
            f25773n = unsafeM15470k.objectFieldOffset(AbstractC4284i.class.getDeclaredField("busy"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    AbstractC4284i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static Unsafe m15470k() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new k());
        }
    }

    final boolean casBase(long j2, long j3) {
        return f25772k.compareAndSwapLong(this, f25774q, j2, j3);
    }

    final boolean casBusy() {
        return f25772k.compareAndSwapInt(this, f25773n, 0, 1);
    }

    abstract long fn(long j2, long j3);

    final void internalReset(long j2) {
        toq[] toqVarArr = this.cells;
        this.base = j2;
        if (toqVarArr != null) {
            for (toq toqVar : toqVarArr) {
                if (toqVar != null) {
                    toqVar.f25782y = j2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void retryUpdate(long r17, int[] r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.AbstractC4284i.retryUpdate(long, int[], boolean):void");
    }
}
