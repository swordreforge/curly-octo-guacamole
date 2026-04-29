package com.google.common.util.concurrent;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import com.xiaomi.onetrack.p009a.C5675a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Monitor.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public final class hb {

    /* JADX INFO: renamed from: k */
    private final boolean f27442k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ReentrantLock f68633toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @GuardedBy(com.android.thememanager.util.yz.xk5)
    private AbstractC4811k f68634zy;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.hb$k */
    /* JADX INFO: compiled from: Monitor.java */
    @InterfaceC7731k
    public static abstract class AbstractC4811k {

        /* JADX INFO: renamed from: k */
        @Weak
        final hb f27443k;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        @GuardedBy("monitor.lock")
        AbstractC4811k f27444q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Condition f68635toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @GuardedBy("monitor.lock")
        int f68636zy = 0;

        protected AbstractC4811k(hb hbVar) {
            this.f27443k = (hb) com.google.common.base.jk.fti(hbVar, C5675a.a.f31582b);
            this.f68635toq = hbVar.f68633toq.newCondition();
        }

        /* JADX INFO: renamed from: k */
        public abstract boolean mo16888k();
    }

    public hb() {
        this(false);
    }

    private static long a9(long j2, long j3) {
        if (j3 <= 0) {
            return 0L;
        }
        return j3 - (System.nanoTime() - j2);
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    private void fti() {
        for (AbstractC4811k abstractC4811k = this.f68634zy; abstractC4811k != null; abstractC4811k = abstractC4811k.f27444q) {
            abstractC4811k.f68635toq.signalAll();
        }
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    /* JADX INFO: renamed from: g */
    private void m16938g(AbstractC4811k abstractC4811k) {
        int i2 = abstractC4811k.f68636zy - 1;
        abstractC4811k.f68636zy = i2;
        if (i2 == 0) {
            AbstractC4811k abstractC4811k2 = this.f68634zy;
            AbstractC4811k abstractC4811k3 = null;
            while (abstractC4811k2 != abstractC4811k) {
                abstractC4811k3 = abstractC4811k2;
                abstractC4811k2 = abstractC4811k2.f27444q;
            }
            if (abstractC4811k3 == null) {
                this.f68634zy = abstractC4811k2.f27444q;
            } else {
                abstractC4811k3.f27444q = abstractC4811k2.f27444q;
            }
            abstractC4811k2.f27444q = null;
        }
    }

    private static long gvn7(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (nanos <= 0) {
            return 0L;
        }
        if (nanos > 6917529027641081853L) {
            return 6917529027641081853L;
        }
        return nanos;
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    private void jp0y() {
        for (AbstractC4811k abstractC4811k = this.f68634zy; abstractC4811k != null; abstractC4811k = abstractC4811k.f27444q) {
            if (mcp(abstractC4811k)) {
                abstractC4811k.f68635toq.signal();
                return;
            }
        }
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    private boolean mcp(AbstractC4811k abstractC4811k) {
        try {
            return abstractC4811k.mo16888k();
        } catch (Throwable th) {
            fti();
            throw th;
        }
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    /* JADX INFO: renamed from: n */
    private void m16940n(AbstractC4811k abstractC4811k) {
        int i2 = abstractC4811k.f68636zy;
        abstractC4811k.f68636zy = i2 + 1;
        if (i2 == 0) {
            abstractC4811k.f27444q = this.f68634zy;
            this.f68634zy = abstractC4811k;
        }
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    /* JADX INFO: renamed from: q */
    private void m16941q(AbstractC4811k abstractC4811k, boolean z2) {
        if (z2) {
            jp0y();
        }
        m16940n(abstractC4811k);
        do {
            try {
                abstractC4811k.f68635toq.awaitUninterruptibly();
            } finally {
                m16938g(abstractC4811k);
            }
        } while (!abstractC4811k.mo16888k());
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    private void toq(AbstractC4811k abstractC4811k, boolean z2) throws InterruptedException {
        if (z2) {
            jp0y();
        }
        m16940n(abstractC4811k);
        do {
            try {
                abstractC4811k.f68635toq.await();
            } finally {
                m16938g(abstractC4811k);
            }
        } while (!abstractC4811k.mo16888k());
    }

    /* JADX INFO: renamed from: z */
    private static long m16942z(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    @GuardedBy(com.android.thememanager.util.yz.xk5)
    private boolean zy(AbstractC4811k abstractC4811k, long j2, boolean z2) throws InterruptedException {
        boolean z3 = true;
        while (j2 > 0) {
            if (z3) {
                if (z2) {
                    try {
                        jp0y();
                    } finally {
                        if (!z3) {
                            m16938g(abstractC4811k);
                        }
                    }
                }
                m16940n(abstractC4811k);
                z3 = false;
            }
            j2 = abstractC4811k.f68635toq.awaitNanos(j2);
            if (abstractC4811k.mo16888k()) {
                if (!z3) {
                    m16938g(abstractC4811k);
                }
                return true;
            }
        }
        return false;
    }

    public void cdj(AbstractC4811k abstractC4811k) {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (abstractC4811k.mo16888k()) {
                return;
            }
            m16941q(abstractC4811k, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            jk();
            throw th;
        }
    }

    public boolean d2ok(AbstractC4811k abstractC4811k, long j2, TimeUnit timeUnit) throws InterruptedException {
        long jGvn7 = gvn7(j2, timeUnit);
        if (!(abstractC4811k.f27443k == this) || !this.f68633toq.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (abstractC4811k.mo16888k()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return zy(abstractC4811k, jGvn7, true);
    }

    public boolean d3() {
        return this.f68633toq.tryLock();
    }

    public void eqxt(AbstractC4811k abstractC4811k) throws InterruptedException {
        if (!(abstractC4811k.f27443k == this) || !this.f68633toq.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (abstractC4811k.mo16888k()) {
            return;
        }
        toq(abstractC4811k, true);
    }

    public void f7l8() {
        this.f68633toq.lock();
    }

    public int fn3e(AbstractC4811k abstractC4811k) {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        this.f68633toq.lock();
        try {
            return abstractC4811k.f68636zy;
        } finally {
            this.f68633toq.unlock();
        }
    }

    public boolean fu4(AbstractC4811k abstractC4811k) {
        return fn3e(abstractC4811k) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m16943h(com.google.common.util.concurrent.hb.AbstractC4811k r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = gvn7(r12, r14)
            com.google.common.util.concurrent.hb r2 = r11.f27443k
            if (r2 != r10) goto L60
            java.util.concurrent.locks.ReentrantLock r2 = r10.f68633toq
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f27442k
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = m16942z(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.mo16888k()     // Catch: java.lang.Throwable -> L50
            if (r12 != 0) goto L49
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = a9(r8, r0)     // Catch: java.lang.Throwable -> L50
        L43:
            boolean r11 = r10.zy(r11, r0, r3)     // Catch: java.lang.Throwable -> L50
            if (r11 == 0) goto L4a
        L49:
            r5 = 1
        L4a:
            if (r5 != 0) goto L4f
            r2.unlock()
        L4f:
            return r5
        L50:
            r11 = move-exception
            if (r3 != 0) goto L5c
            r10.jp0y()     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5c:
            r2.unlock()
            throw r11
        L60:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.hb.m16943h(com.google.common.util.concurrent.hb$k, long, java.util.concurrent.TimeUnit):boolean");
    }

    /* JADX INFO: renamed from: i */
    public int m16944i() {
        return this.f68633toq.getQueueLength();
    }

    public void jk() {
        ReentrantLock reentrantLock = this.f68633toq;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                jp0y();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean ki(AbstractC4811k abstractC4811k, long j2, TimeUnit timeUnit) throws Throwable {
        long jM16942z;
        long jA9;
        long jGvn7 = gvn7(j2, timeUnit);
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean zInterrupted = Thread.interrupted();
        boolean zZy = true;
        try {
            if (this.f27442k || !reentrantLock.tryLock()) {
                jM16942z = m16942z(jGvn7);
                long jA92 = jGvn7;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (Throwable th) {
                            th = th;
                            zInterrupted = true;
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jA92 = a9(jM16942z, jGvn7);
                        zInterrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(jA92, TimeUnit.NANOSECONDS)) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
            } else {
                jM16942z = 0;
            }
            while (!abstractC4811k.mo16888k()) {
                try {
                    if (jM16942z == 0) {
                        jM16942z = m16942z(jGvn7);
                        jA9 = jGvn7;
                    } else {
                        jA9 = a9(jM16942z, jGvn7);
                    }
                    zZy = zy(abstractC4811k, jA9, zIsHeldByCurrentThread);
                } catch (InterruptedException unused2) {
                    zInterrupted = zZy;
                    zIsHeldByCurrentThread = false;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            if (!zZy) {
                reentrantLock.unlock();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zZy;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void kja0(AbstractC4811k abstractC4811k) throws InterruptedException {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (abstractC4811k.mo16888k()) {
                return;
            }
            toq(abstractC4811k, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            jk();
            throw th;
        }
    }

    public boolean ld6(AbstractC4811k abstractC4811k) throws InterruptedException {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        reentrantLock.lockInterruptibly();
        try {
            boolean zMo16888k = abstractC4811k.mo16888k();
            if (!zMo16888k) {
            }
            return zMo16888k;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void lvui(AbstractC4811k abstractC4811k) {
        if (!(abstractC4811k.f27443k == this) || !this.f68633toq.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (abstractC4811k.mo16888k()) {
            return;
        }
        m16941q(abstractC4811k, true);
    }

    public boolean n7h(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f68633toq.tryLock(j2, timeUnit);
    }

    public boolean ni7() {
        return this.f68633toq.hasQueuedThreads();
    }

    public boolean o1t() {
        return this.f27442k;
    }

    public boolean oc(AbstractC4811k abstractC4811k) {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zMo16888k = abstractC4811k.mo16888k();
            if (!zMo16888k) {
            }
            return zMo16888k;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m16945p(AbstractC4811k abstractC4811k, long j2, TimeUnit timeUnit) {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        if (!m16949y(j2, timeUnit)) {
            return false;
        }
        try {
            boolean zMo16888k = abstractC4811k.mo16888k();
            if (!zMo16888k) {
            }
            return zMo16888k;
        } finally {
            this.f68633toq.unlock();
        }
    }

    public void qrj() throws InterruptedException {
        this.f68633toq.lockInterruptibly();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m16946r(com.google.common.util.concurrent.hb.AbstractC4811k r8, long r9, java.util.concurrent.TimeUnit r11) throws java.lang.Throwable {
        /*
            r7 = this;
            long r9 = gvn7(r9, r11)
            com.google.common.util.concurrent.hb r11 = r8.f27443k
            r0 = 0
            r1 = 1
            if (r11 != r7) goto Lc
            r11 = r1
            goto Ld
        Lc:
            r11 = r0
        Ld:
            java.util.concurrent.locks.ReentrantLock r2 = r7.f68633toq
            boolean r2 = r2.isHeldByCurrentThread()
            r11 = r11 & r2
            if (r11 == 0) goto L58
            boolean r11 = r8.mo16888k()
            if (r11 == 0) goto L1d
            return r1
        L1d:
            long r2 = m16942z(r9)
            boolean r11 = java.lang.Thread.interrupted()
            r4 = r9
            r6 = r1
        L27:
            boolean r8 = r7.zy(r8, r4, r6)     // Catch: java.lang.Throwable -> L35 java.lang.InterruptedException -> L38
            if (r11 == 0) goto L34
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L34:
            return r8
        L35:
            r8 = move-exception
            r1 = r11
            goto L4e
        L38:
            boolean r11 = r8.mo16888k()     // Catch: java.lang.Throwable -> L4d
            if (r11 == 0) goto L46
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
            return r1
        L46:
            long r4 = a9(r2, r9)     // Catch: java.lang.Throwable -> L4d
            r6 = r0
            r11 = r1
            goto L27
        L4d:
            r8 = move-exception
        L4e:
            if (r1 == 0) goto L57
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L57:
            throw r8
        L58:
            java.lang.IllegalMonitorStateException r8 = new java.lang.IllegalMonitorStateException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.hb.m16946r(com.google.common.util.concurrent.hb$k, long, java.util.concurrent.TimeUnit):boolean");
    }

    /* JADX INFO: renamed from: s */
    public boolean m16947s(AbstractC4811k abstractC4811k) {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        reentrantLock.lock();
        try {
            boolean zMo16888k = abstractC4811k.mo16888k();
            if (!zMo16888k) {
            }
            return zMo16888k;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m16948t() {
        return this.f68633toq.isHeldByCurrentThread();
    }

    public int t8r() {
        return this.f68633toq.getHoldCount();
    }

    public boolean wvg() {
        return this.f68633toq.isLocked();
    }

    public boolean x2(AbstractC4811k abstractC4811k, long j2, TimeUnit timeUnit) throws InterruptedException {
        if (abstractC4811k.f27443k != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f68633toq;
        if (!reentrantLock.tryLock(j2, timeUnit)) {
            return false;
        }
        try {
            boolean zMo16888k = abstractC4811k.mo16888k();
            if (!zMo16888k) {
            }
            return zMo16888k;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m16949y(long j2, TimeUnit timeUnit) throws Throwable {
        boolean zTryLock;
        long jGvn7 = gvn7(j2, timeUnit);
        ReentrantLock reentrantLock = this.f68633toq;
        boolean z2 = true;
        if (!this.f27442k && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jA9 = jGvn7;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jA9, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th) {
                        th = th;
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    jA9 = a9(jNanoTime, jGvn7);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th2) {
            th = th2;
            z2 = zInterrupted;
        }
    }

    public boolean zurt(Thread thread) {
        return this.f68633toq.hasQueuedThread(thread);
    }

    public hb(boolean z2) {
        this.f68634zy = null;
        this.f27442k = z2;
        this.f68633toq = new ReentrantLock(z2);
    }
}
