package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
public final class n5r1 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final ReentrantLock f94294f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private vyq f43802g;

    /* JADX INFO: renamed from: k */
    private final long f43803k;

    /* JADX INFO: renamed from: n */
    private boolean f43804n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final nn86 f43805p;

    /* JADX INFO: renamed from: q */
    private boolean f43806q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final vyq f43807s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final x2 f94295toq = new x2();

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Condition f43808y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f94296zy;

    /* JADX INFO: renamed from: okio.n5r1$k */
    /* JADX INFO: compiled from: Pipe.kt */
    @lv5({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n217#3:259\n218#3:286\n217#3:287\n218#3:314\n217#3:315\n218#3:342\n268#4,26:260\n268#4,26:288\n268#4,26:316\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:259\n87#1:286\n106#1:287\n106#1:314\n124#1:315\n124#1:342\n87#1:260,26\n106#1:288,26\n124#1:316,26\n*E\n"})
    public static final class C7568k implements vyq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7560j f43809k = new C7560j();

        C7568k() {
        }

        @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockM27811p = n5r1.this.m27811p();
            n5r1 n5r1Var = n5r1.this;
            reentrantLockM27811p.lock();
            try {
                if (n5r1Var.x2()) {
                    return;
                }
                vyq vyqVarM27813s = n5r1Var.m27813s();
                if (vyqVarM27813s == null) {
                    if (n5r1Var.qrj() && n5r1Var.m27808g().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    n5r1Var.m27809h(true);
                    n5r1Var.m27814y().signalAll();
                    vyqVarM27813s = null;
                }
                was wasVar = was.f36763k;
                if (vyqVarM27813s != null) {
                    n5r1 n5r1Var2 = n5r1.this;
                    C7560j qVar = vyqVarM27813s.toq();
                    C7560j qVar2 = n5r1Var2.ki().toq();
                    long jLd6 = qVar.ld6();
                    long jM27762k = C7560j.f43771q.m27762k(qVar2.ld6(), qVar.ld6());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    qVar.mo27758p(jM27762k, timeUnit);
                    if (!qVar.f7l8()) {
                        if (qVar2.f7l8()) {
                            qVar.mo27755g(qVar2.mo27757n());
                        }
                        try {
                            vyqVarM27813s.close();
                            qVar.mo27758p(jLd6, timeUnit);
                            if (qVar2.f7l8()) {
                                qVar.toq();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                            if (qVar2.f7l8()) {
                                qVar.toq();
                            }
                            throw th;
                        }
                    }
                    long jMo27757n = qVar.mo27757n();
                    if (qVar2.f7l8()) {
                        qVar.mo27755g(Math.min(qVar.mo27757n(), qVar2.mo27757n()));
                    }
                    try {
                        vyqVarM27813s.close();
                        qVar.mo27758p(jLd6, timeUnit);
                        if (qVar2.f7l8()) {
                            qVar.mo27755g(jMo27757n);
                        }
                    } catch (Throwable th2) {
                        qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                        if (qVar2.f7l8()) {
                            qVar.mo27755g(jMo27757n);
                        }
                        throw th2;
                    }
                }
            } finally {
                reentrantLockM27811p.unlock();
            }
        }

        @Override // okio.vyq, java.io.Flushable
        public void flush() {
            ReentrantLock reentrantLockM27811p = n5r1.this.m27811p();
            n5r1 n5r1Var = n5r1.this;
            reentrantLockM27811p.lock();
            try {
                if (!(!n5r1Var.x2())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (n5r1Var.f7l8()) {
                    throw new IOException("canceled");
                }
                vyq vyqVarM27813s = n5r1Var.m27813s();
                if (vyqVarM27813s == null) {
                    if (n5r1Var.qrj() && n5r1Var.m27808g().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    vyqVarM27813s = null;
                }
                was wasVar = was.f36763k;
                if (vyqVarM27813s != null) {
                    n5r1 n5r1Var2 = n5r1.this;
                    C7560j qVar = vyqVarM27813s.toq();
                    C7560j qVar2 = n5r1Var2.ki().toq();
                    long jLd6 = qVar.ld6();
                    long jM27762k = C7560j.f43771q.m27762k(qVar2.ld6(), qVar.ld6());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    qVar.mo27758p(jM27762k, timeUnit);
                    if (!qVar.f7l8()) {
                        if (qVar2.f7l8()) {
                            qVar.mo27755g(qVar2.mo27757n());
                        }
                        try {
                            vyqVarM27813s.flush();
                            qVar.mo27758p(jLd6, timeUnit);
                            if (qVar2.f7l8()) {
                                qVar.toq();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                            if (qVar2.f7l8()) {
                                qVar.toq();
                            }
                            throw th;
                        }
                    }
                    long jMo27757n = qVar.mo27757n();
                    if (qVar2.f7l8()) {
                        qVar.mo27755g(Math.min(qVar.mo27757n(), qVar2.mo27757n()));
                    }
                    try {
                        vyqVarM27813s.flush();
                        qVar.mo27758p(jLd6, timeUnit);
                        if (qVar2.f7l8()) {
                            qVar.mo27755g(jMo27757n);
                        }
                    } catch (Throwable th2) {
                        qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                        if (qVar2.f7l8()) {
                            qVar.mo27755g(jMo27757n);
                        }
                        throw th2;
                    }
                }
            } finally {
                reentrantLockM27811p.unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
        
            r1 = kotlin.was.f36763k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            if (r2 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            r0 = r12.f43810q;
            r1 = r2.toq();
            r0 = r0.ki().toq();
            r3 = r1.ld6();
            r5 = okio.C7560j.f43771q.m27762k(r0.ld6(), r1.ld6());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.mo27758p(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
        
            if (r1.f7l8() == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
        
            r5 = r1.mo27757n();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
        
            if (r0.f7l8() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
        
            r1.mo27755g(java.lang.Math.min(r1.mo27757n(), r0.mo27757n()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            r2.mo26936j(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        
            r1.mo27758p(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
        
            if (r0.f7l8() == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        
            r1.mo27755g(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
        
            r1.mo27758p(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
        
            if (r0.f7l8() != false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        
            r1.mo27755g(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
        
            if (r0.f7l8() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
        
            r1.mo27755g(r0.mo27757n());
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
        
            r2.mo26936j(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
        
            r1.mo27758p(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
        
            if (r0.f7l8() == false) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
        
            r1.toq();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        
            r1.mo27758p(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0109, code lost:
        
            if (r0.f7l8() != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
        
            r1.toq();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x010e, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        @Override // okio.vyq
        /* JADX INFO: renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo26936j(@mub.InterfaceC7396q okio.x2 r13, long r14) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.n5r1.C7568k.mo26936j(okio.x2, long):void");
        }

        @Override // okio.vyq
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43809k;
        }
    }

    /* JADX INFO: compiled from: Pipe.kt */
    @lv5({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    public static final class toq implements nn86 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7560j f43811k = new C7560j();

        toq() {
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockM27811p = n5r1.this.m27811p();
            n5r1 n5r1Var = n5r1.this;
            reentrantLockM27811p.lock();
            try {
                n5r1Var.cdj(true);
                n5r1Var.m27814y().signalAll();
                was wasVar = was.f36763k;
            } finally {
                reentrantLockM27811p.unlock();
            }
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43811k;
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            ReentrantLock reentrantLockM27811p = n5r1.this.m27811p();
            n5r1 n5r1Var = n5r1.this;
            reentrantLockM27811p.lock();
            try {
                if (!(!n5r1Var.qrj())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (n5r1Var.f7l8()) {
                    throw new IOException("canceled");
                }
                while (n5r1Var.m27808g().size() == 0) {
                    if (n5r1Var.x2()) {
                        return -1L;
                    }
                    this.f43811k.m27756k(n5r1Var.m27814y());
                    if (n5r1Var.f7l8()) {
                        throw new IOException("canceled");
                    }
                }
                long jWx16 = n5r1Var.m27808g().wx16(sink, j2);
                n5r1Var.m27814y().signalAll();
                return jWx16;
            } finally {
                reentrantLockM27811p.unlock();
            }
        }
    }

    public n5r1(long j2) {
        this.f43803k = j2;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f94294f7l8 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.d2ok.kja0(conditionNewCondition, "newCondition(...)");
        this.f43808y = conditionNewCondition;
        if (j2 >= 1) {
            this.f43807s = new C7568k();
            this.f43805p = new toq();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j2).toString());
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m27807n(vyq vyqVar, cyoe.x2<? super vyq, was> x2Var) {
        C7560j qVar = vyqVar.toq();
        C7560j qVar2 = ki().toq();
        long jLd6 = qVar.ld6();
        long jM27762k = C7560j.f43771q.m27762k(qVar2.ld6(), qVar.ld6());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        qVar.mo27758p(jM27762k, timeUnit);
        if (!qVar.f7l8()) {
            if (qVar2.f7l8()) {
                qVar.mo27755g(qVar2.mo27757n());
            }
            try {
                x2Var.invoke(vyqVar);
                was wasVar = was.f36763k;
                kotlin.jvm.internal.d3.m23090q(1);
                qVar.mo27758p(jLd6, timeUnit);
                if (qVar2.f7l8()) {
                    qVar.toq();
                }
                kotlin.jvm.internal.d3.zy(1);
                return;
            } catch (Throwable th) {
                kotlin.jvm.internal.d3.m23090q(1);
                qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                if (qVar2.f7l8()) {
                    qVar.toq();
                }
                kotlin.jvm.internal.d3.zy(1);
                throw th;
            }
        }
        long jMo27757n = qVar.mo27757n();
        if (qVar2.f7l8()) {
            qVar.mo27755g(Math.min(qVar.mo27757n(), qVar2.mo27757n()));
        }
        try {
            x2Var.invoke(vyqVar);
            was wasVar2 = was.f36763k;
            kotlin.jvm.internal.d3.m23090q(1);
            qVar.mo27758p(jLd6, timeUnit);
            if (qVar2.f7l8()) {
                qVar.mo27755g(jMo27757n);
            }
            kotlin.jvm.internal.d3.zy(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.d3.m23090q(1);
            qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
            if (qVar2.f7l8()) {
                qVar.mo27755g(jMo27757n);
            }
            kotlin.jvm.internal.d3.zy(1);
            throw th2;
        }
    }

    public final void cdj(boolean z2) {
        this.f43804n = z2;
    }

    public final boolean f7l8() {
        return this.f94296zy;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final x2 m27808g() {
        return this.f94295toq;
    }

    /* JADX INFO: renamed from: h */
    public final void m27809h(boolean z2) {
        this.f43806q = z2;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "sink", imports = {}))
    @InterfaceC6769y(name = "-deprecated_sink")
    /* JADX INFO: renamed from: k */
    public final vyq m27810k() {
        return this.f43807s;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "sink")
    public final vyq ki() {
        return this.f43807s;
    }

    public final void kja0(@InterfaceC7395n vyq vyqVar) {
        this.f43802g = vyqVar;
    }

    public final long ld6() {
        return this.f43803k;
    }

    public final void n7h(boolean z2) {
        this.f94296zy = z2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final ReentrantLock m27811p() {
        return this.f94294f7l8;
    }

    /* JADX INFO: renamed from: q */
    public final void m27812q(@InterfaceC7396q vyq sink) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        while (true) {
            this.f94294f7l8.lock();
            try {
                if (!(this.f43802g == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.f94296zy) {
                    this.f43802g = sink;
                    throw new IOException("canceled");
                }
                if (this.f94295toq.py()) {
                    this.f43804n = true;
                    this.f43802g = sink;
                    return;
                }
                boolean z2 = this.f43806q;
                x2 x2Var = new x2();
                x2 x2Var2 = this.f94295toq;
                x2Var.mo26936j(x2Var2, x2Var2.size());
                this.f43808y.signalAll();
                was wasVar = was.f36763k;
                try {
                    sink.mo26936j(x2Var, x2Var.size());
                    if (z2) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th) {
                    this.f94294f7l8.lock();
                    try {
                        this.f43804n = true;
                        this.f43808y.signalAll();
                        was wasVar2 = was.f36763k;
                        throw th;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final boolean qrj() {
        return this.f43804n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final vyq m27813s() {
        return this.f43802g;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "source")
    public final nn86 t8r() {
        return this.f43805p;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "source", imports = {}))
    @InterfaceC6769y(name = "-deprecated_source")
    public final nn86 toq() {
        return this.f43805p;
    }

    public final boolean x2() {
        return this.f43806q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final Condition m27814y() {
        return this.f43808y;
    }

    public final void zy() {
        ReentrantLock reentrantLock = this.f94294f7l8;
        reentrantLock.lock();
        try {
            this.f94296zy = true;
            this.f94295toq.m27873y();
            this.f43808y.signalAll();
            was wasVar = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }
}
