package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public class i9jn {

    /* JADX INFO: renamed from: n */
    private static long f33797n;

    /* JADX INFO: renamed from: q */
    private static long f33798q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static long f73616zy;

    /* JADX INFO: renamed from: k */
    private final zy f33799k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C5918k f73617toq;

    /* JADX INFO: renamed from: com.xiaomi.push.service.i9jn$k */
    private static final class C5918k {

        /* JADX INFO: renamed from: k */
        private final zy f33800k;

        C5918k(zy zyVar) {
            this.f33800k = zyVar;
        }

        protected void finalize() throws Throwable {
            try {
                synchronized (this.f33800k) {
                    this.f33800k.f33811y = true;
                    this.f33800k.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.i9jn$q */
    static class C5919q {

        /* JADX INFO: renamed from: g */
        private long f33801g;

        /* JADX INFO: renamed from: k */
        final Object f33802k = new Object();

        /* JADX INFO: renamed from: n */
        int f33803n;

        /* JADX INFO: renamed from: q */
        toq f33804q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f73618toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        long f73619zy;

        C5919q() {
        }

        /* JADX INFO: renamed from: k */
        void m21628k(long j2) {
            synchronized (this.f33802k) {
                this.f33801g = j2;
            }
        }

        public boolean toq() {
            boolean z2;
            synchronized (this.f33802k) {
                z2 = !this.f73618toq && this.f73619zy > 0;
                this.f73618toq = true;
            }
            return z2;
        }
    }

    public static abstract class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        protected int f33805k;

        public toq(int i2) {
            this.f33805k = i2;
        }
    }

    private static final class zy extends Thread {

        /* JADX INFO: renamed from: g */
        private boolean f33806g;

        /* JADX INFO: renamed from: y */
        private boolean f33811y;

        /* JADX INFO: renamed from: k */
        private volatile long f33807k = 0;

        /* JADX INFO: renamed from: q */
        private volatile boolean f33809q = false;

        /* JADX INFO: renamed from: n */
        private long f33808n = 50;

        /* JADX INFO: renamed from: s */
        private C5920k f33810s = new C5920k();

        /* JADX INFO: renamed from: com.xiaomi.push.service.i9jn$zy$k */
        private static final class C5920k {

            /* JADX INFO: renamed from: k */
            private int f33812k;

            /* JADX INFO: renamed from: q */
            private int f33813q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private C5919q[] f73620toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private int f73621zy;

            private C5920k() {
                this.f33812k = 256;
                this.f73620toq = new C5919q[256];
                this.f73621zy = 0;
                this.f33813q = 0;
            }

            private void qrj(int i2) {
                int i3 = (i2 * 2) + 1;
                while (true) {
                    int i4 = this.f73621zy;
                    if (i3 >= i4 || i4 <= 0) {
                        return;
                    }
                    int i5 = i3 + 1;
                    if (i5 < i4) {
                        C5919q[] c5919qArr = this.f73620toq;
                        if (c5919qArr[i5].f73619zy < c5919qArr[i3].f73619zy) {
                            i3 = i5;
                        }
                    }
                    C5919q[] c5919qArr2 = this.f73620toq;
                    C5919q c5919q = c5919qArr2[i2];
                    long j2 = c5919q.f73619zy;
                    C5919q c5919q2 = c5919qArr2[i3];
                    if (j2 < c5919q2.f73619zy) {
                        return;
                    }
                    c5919qArr2[i2] = c5919q2;
                    c5919qArr2[i3] = c5919q;
                    int i6 = i3;
                    i3 = (i3 * 2) + 1;
                    i2 = i6;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int toq(C5919q c5919q) {
                int i2 = 0;
                while (true) {
                    C5919q[] c5919qArr = this.f73620toq;
                    if (i2 >= c5919qArr.length) {
                        return -1;
                    }
                    if (c5919qArr[i2] == c5919q) {
                        return i2;
                    }
                    i2++;
                }
            }

            private void x2() {
                int i2 = this.f73621zy - 1;
                int i3 = (i2 - 1) / 2;
                while (true) {
                    C5919q[] c5919qArr = this.f73620toq;
                    C5919q c5919q = c5919qArr[i2];
                    long j2 = c5919q.f73619zy;
                    C5919q c5919q2 = c5919qArr[i3];
                    if (j2 >= c5919q2.f73619zy) {
                        return;
                    }
                    c5919qArr[i2] = c5919q2;
                    c5919qArr[i3] = c5919q;
                    int i4 = i3;
                    i3 = (i3 - 1) / 2;
                    i2 = i4;
                }
            }

            public void f7l8(C5919q c5919q) {
                C5919q[] c5919qArr = this.f73620toq;
                int length = c5919qArr.length;
                int i2 = this.f73621zy;
                if (length == i2) {
                    C5919q[] c5919qArr2 = new C5919q[i2 * 2];
                    System.arraycopy(c5919qArr, 0, c5919qArr2, 0, i2);
                    this.f73620toq = c5919qArr2;
                }
                C5919q[] c5919qArr3 = this.f73620toq;
                int i3 = this.f73621zy;
                this.f73621zy = i3 + 1;
                c5919qArr3[i3] = c5919q;
                x2();
            }

            /* JADX INFO: renamed from: g */
            public void m21634g(int i2, toq toqVar) {
                for (int i3 = 0; i3 < this.f73621zy; i3++) {
                    C5919q c5919q = this.f73620toq[i3];
                    if (c5919q.f33804q == toqVar) {
                        c5919q.toq();
                    }
                }
                m21636p();
            }

            public void ld6(int i2) {
                int i3;
                if (i2 < 0 || i2 >= (i3 = this.f73621zy)) {
                    return;
                }
                C5919q[] c5919qArr = this.f73620toq;
                int i4 = i3 - 1;
                this.f73621zy = i4;
                c5919qArr[i2] = c5919qArr[i4];
                c5919qArr[i4] = null;
                qrj(i2);
            }

            /* JADX INFO: renamed from: n */
            public void m21635n(int i2) {
                for (int i3 = 0; i3 < this.f73621zy; i3++) {
                    C5919q c5919q = this.f73620toq[i3];
                    if (c5919q.f33803n == i2) {
                        c5919q.toq();
                    }
                }
                m21636p();
            }

            /* JADX INFO: renamed from: p */
            public void m21636p() {
                int i2 = 0;
                while (i2 < this.f73621zy) {
                    if (this.f73620toq[i2].f73618toq) {
                        this.f33813q++;
                        ld6(i2);
                        i2--;
                    }
                    i2++;
                }
            }

            /* JADX INFO: renamed from: q */
            public void m21637q() {
                this.f73620toq = new C5919q[this.f33812k];
                this.f73621zy = 0;
            }

            /* JADX INFO: renamed from: s */
            public boolean m21638s(int i2) {
                for (int i3 = 0; i3 < this.f73621zy; i3++) {
                    if (this.f73620toq[i3].f33803n == i2) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX INFO: renamed from: y */
            public boolean m21639y() {
                return this.f73621zy == 0;
            }

            public C5919q zy() {
                return this.f73620toq[0];
            }
        }

        zy(String str, boolean z2) {
            setName(str);
            setDaemon(z2);
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public void m21631q(C5919q c5919q) {
            this.f33810s.f7l8(c5919q);
            notify();
        }

        /* JADX INFO: renamed from: n */
        public boolean m21632n() {
            return this.f33809q && SystemClock.uptimeMillis() - this.f33807k > 600000;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
        
            r10.f33807k = android.os.SystemClock.uptimeMillis();
            r10.f33809q = true;
            r2.f33804q.run();
            r10.f33809q = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
        
            r10.f33806g = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a8, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r10 = this;
            L0:
                monitor-enter(r10)
                boolean r0 = r10.f33806g     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L7
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                return
            L7:
                com.xiaomi.push.service.i9jn$zy$k r0 = r10.f33810s     // Catch: java.lang.Throwable -> Lb2
                boolean r0 = r0.m21639y()     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L1a
                boolean r0 = r10.f33811y     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L15
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                return
            L15:
                r10.wait()     // Catch: java.lang.InterruptedException -> L18 java.lang.Throwable -> Lb2
            L18:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L1a:
                long r0 = com.xiaomi.push.service.i9jn.m21621k()     // Catch: java.lang.Throwable -> Lb2
                com.xiaomi.push.service.i9jn$zy$k r2 = r10.f33810s     // Catch: java.lang.Throwable -> Lb2
                com.xiaomi.push.service.i9jn$q r2 = r2.zy()     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r3 = r2.f33802k     // Catch: java.lang.Throwable -> Lb2
                monitor-enter(r3)     // Catch: java.lang.Throwable -> Lb2
                boolean r4 = r2.f73618toq     // Catch: java.lang.Throwable -> Laf
                r5 = 0
                if (r4 == 0) goto L34
                com.xiaomi.push.service.i9jn$zy$k r0 = r10.f33810s     // Catch: java.lang.Throwable -> Laf
                r0.ld6(r5)     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L34:
                long r6 = r2.f73619zy     // Catch: java.lang.Throwable -> Laf
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
                r0 = 0
                int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                r8 = 50
                if (r3 <= 0) goto L57
                long r0 = r10.f33808n     // Catch: java.lang.Throwable -> Lb2
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L47
                r6 = r0
            L47:
                long r0 = r0 + r8
                r10.f33808n = r0     // Catch: java.lang.Throwable -> Lb2
                r2 = 500(0x1f4, double:2.47E-321)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L52
                r10.f33808n = r2     // Catch: java.lang.Throwable -> Lb2
            L52:
                r10.wait(r6)     // Catch: java.lang.InterruptedException -> L55 java.lang.Throwable -> Lb2
            L55:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L57:
                r10.f33808n = r8     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r3 = r2.f33802k     // Catch: java.lang.Throwable -> Lb2
                monitor-enter(r3)     // Catch: java.lang.Throwable -> Lb2
                com.xiaomi.push.service.i9jn$zy$k r4 = r10.f33810s     // Catch: java.lang.Throwable -> Lac
                com.xiaomi.push.service.i9jn$q r4 = r4.zy()     // Catch: java.lang.Throwable -> Lac
                long r6 = r4.f73619zy     // Catch: java.lang.Throwable -> Lac
                long r8 = r2.f73619zy     // Catch: java.lang.Throwable -> Lac
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto L71
                com.xiaomi.push.service.i9jn$zy$k r4 = r10.f33810s     // Catch: java.lang.Throwable -> Lac
                int r4 = com.xiaomi.push.service.i9jn.zy.C5920k.m21633k(r4, r2)     // Catch: java.lang.Throwable -> Lac
                goto L72
            L71:
                r4 = r5
            L72:
                boolean r6 = r2.f73618toq     // Catch: java.lang.Throwable -> Lac
                if (r6 == 0) goto L83
                com.xiaomi.push.service.i9jn$zy$k r0 = r10.f33810s     // Catch: java.lang.Throwable -> Lac
                int r1 = com.xiaomi.push.service.i9jn.zy.C5920k.m21633k(r0, r2)     // Catch: java.lang.Throwable -> Lac
                r0.ld6(r1)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L83:
                long r6 = r2.f73619zy     // Catch: java.lang.Throwable -> Lac
                r2.m21628k(r6)     // Catch: java.lang.Throwable -> Lac
                com.xiaomi.push.service.i9jn$zy$k r6 = r10.f33810s     // Catch: java.lang.Throwable -> Lac
                r6.ld6(r4)     // Catch: java.lang.Throwable -> Lac
                r2.f73619zy = r0     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> La3
                r10.f33807k = r3     // Catch: java.lang.Throwable -> La3
                r10.f33809q = r0     // Catch: java.lang.Throwable -> La3
                com.xiaomi.push.service.i9jn$toq r1 = r2.f33804q     // Catch: java.lang.Throwable -> La3
                r1.run()     // Catch: java.lang.Throwable -> La3
                r10.f33809q = r5     // Catch: java.lang.Throwable -> La3
                goto L0
            La3:
                r1 = move-exception
                monitor-enter(r10)
                r10.f33806g = r0     // Catch: java.lang.Throwable -> La9
                monitor-exit(r10)     // Catch: java.lang.Throwable -> La9
                throw r1
            La9:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> La9
                throw r0
            Lac:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                throw r0     // Catch: java.lang.Throwable -> Lb2
            Laf:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
                throw r0     // Catch: java.lang.Throwable -> Lb2
            Lb2:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.i9jn.zy.run():void");
        }

        public synchronized void toq() {
            this.f33806g = true;
            this.f33810s.m21637q();
            notify();
        }
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        f73616zy = jElapsedRealtime;
        f33798q = jElapsedRealtime;
    }

    public i9jn(String str, boolean z2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        zy zyVar = new zy(str, z2);
        this.f33799k = zyVar;
        this.f73617toq = new C5918k(zyVar);
    }

    /* JADX INFO: renamed from: k */
    static synchronized long m21621k() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = f33798q;
        if (jElapsedRealtime > j2) {
            f73616zy += jElapsedRealtime - j2;
        }
        f33798q = jElapsedRealtime;
        return f73616zy;
    }

    private void ld6(toq toqVar, long j2) {
        synchronized (this.f33799k) {
            if (this.f33799k.f33806g) {
                throw new IllegalStateException("Timer was canceled");
            }
            long jM21621k = j2 + m21621k();
            if (jM21621k < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + jM21621k);
            }
            C5919q c5919q = new C5919q();
            c5919q.f33803n = toqVar.f33805k;
            c5919q.f33804q = toqVar;
            c5919q.f73619zy = jM21621k;
            this.f33799k.m21631q(c5919q);
        }
    }

    /* JADX INFO: renamed from: s */
    private static synchronized long m21622s() {
        long j2;
        j2 = f33797n;
        f33797n = 1 + j2;
        return j2;
    }

    public boolean f7l8() {
        return this.f33799k.m21632n();
    }

    /* JADX INFO: renamed from: g */
    public void m21623g(toq toqVar, long j2) {
        if (j2 >= 0) {
            ld6(toqVar, j2);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j2);
    }

    /* JADX INFO: renamed from: n */
    public void m21624n(toq toqVar) {
        if (com.xiaomi.channel.commonutils.logger.zy.m19295k() >= 1 || Thread.currentThread() == this.f33799k) {
            toqVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.zy.jk("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m21625p() {
        synchronized (this.f33799k) {
            this.f33799k.f33810s.m21637q();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21626q(int i2, toq toqVar) {
        synchronized (this.f33799k) {
            this.f33799k.f33810s.m21634g(i2, toqVar);
        }
    }

    public void toq() {
        com.xiaomi.channel.commonutils.logger.zy.kja0("quit. finalizer:" + this.f73617toq);
        this.f33799k.toq();
    }

    /* JADX INFO: renamed from: y */
    public boolean m21627y(int i2) {
        boolean zM21638s;
        synchronized (this.f33799k) {
            zM21638s = this.f33799k.f33810s.m21638s(i2);
        }
        return zM21638s;
    }

    public void zy(int i2) {
        synchronized (this.f33799k) {
            this.f33799k.f33810s.m21635n(i2);
        }
    }

    public i9jn(String str) {
        this(str, false);
    }

    public i9jn(boolean z2) {
        this("Timer-" + m21622s(), z2);
    }

    public i9jn() {
        this(false);
    }
}
