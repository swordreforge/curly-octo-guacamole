package com.google.common.hash;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: Striped64.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
abstract class a9 extends Number {

    /* JADX INFO: renamed from: k */
    private static final Unsafe f26978k;

    /* JADX INFO: renamed from: n */
    private static final long f26979n;

    /* JADX INFO: renamed from: q */
    private static final long f26980q;
    volatile transient long base;
    volatile transient int busy;

    @NullableDecl
    volatile transient toq[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: com.google.common.hash.a9$k */
    /* JADX INFO: compiled from: Striped64.java */
    static class C4650k implements PrivilegedExceptionAction<Unsafe> {
        C4650k() {
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

    /* JADX INFO: compiled from: Striped64.java */
    static final class toq {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final long f68295cdj;

        /* JADX INFO: renamed from: h */
        private static final Unsafe f26981h;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        volatile long f68296f7l8;

        /* JADX INFO: renamed from: g */
        volatile long f26982g;

        /* JADX INFO: renamed from: k */
        volatile long f26983k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        volatile long f68297kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        volatile long f68298ld6;

        /* JADX INFO: renamed from: n */
        volatile long f26984n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        volatile long f68299n7h;

        /* JADX INFO: renamed from: p */
        volatile long f26985p;

        /* JADX INFO: renamed from: q */
        volatile long f26986q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        volatile long f68300qrj;

        /* JADX INFO: renamed from: s */
        volatile long f26987s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        volatile long f68301toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        volatile long f68302x2;

        /* JADX INFO: renamed from: y */
        volatile long f26988y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        volatile long f68303zy;

        static {
            try {
                Unsafe unsafeM16318k = a9.m16318k();
                f26981h = unsafeM16318k;
                f68295cdj = unsafeM16318k.objectFieldOffset(toq.class.getDeclaredField(AnimatedProperty.PROPERTY_NAME_Y));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        toq(long j2) {
            this.f26988y = j2;
        }

        /* JADX INFO: renamed from: k */
        final boolean m16320k(long j2, long j3) {
            return f26981h.compareAndSwapLong(this, f68295cdj, j2, j3);
        }
    }

    static {
        try {
            Unsafe unsafeM16318k = m16318k();
            f26978k = unsafeM16318k;
            f26980q = unsafeM16318k.objectFieldOffset(a9.class.getDeclaredField(C3678q.f65841uv6));
            f26979n = unsafeM16318k.objectFieldOffset(a9.class.getDeclaredField("busy"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    a9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static Unsafe m16318k() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new C4650k());
        }
    }

    final boolean casBase(long j2, long j3) {
        return f26978k.compareAndSwapLong(this, f26980q, j2, j3);
    }

    final boolean casBusy() {
        return f26978k.compareAndSwapInt(this, f26979n, 0, 1);
    }

    abstract long fn(long j2, long j3);

    final void internalReset(long j2) {
        toq[] toqVarArr = this.cells;
        this.base = j2;
        if (toqVarArr != null) {
            for (toq toqVar : toqVarArr) {
                if (toqVar != null) {
                    toqVar.f26988y = j2;
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
    final void retryUpdate(long r17, @org.checkerframework.checker.nullness.compatqual.NullableDecl int[] r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.a9.retryUpdate(long, int[], boolean):void");
    }
}
