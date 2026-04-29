package okhttp3.internal.concurrent;

import b7.C1359g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a9;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.internal.concurrent.q */
/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class C7445q {

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final Logger f43044p;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final Runnable f93861f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final List<okhttp3.internal.concurrent.zy> f43047g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final k f43048k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final List<okhttp3.internal.concurrent.zy> f43049n;

    /* JADX INFO: renamed from: q */
    private long f43050q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f93862toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f93863zy;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final toq f43046y = new toq(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C7445q f43045s = new C7445q(new zy(C1359g.vyq(C1359g.f7244s + " TaskRunner", true)));

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.q$k */
    /* JADX INFO: compiled from: TaskRunner.kt */
    public interface k {
        void execute(@InterfaceC7396q Runnable runnable);

        /* JADX INFO: renamed from: k */
        void mo26992k(@InterfaceC7396q C7445q c7445q);

        /* JADX INFO: renamed from: q */
        long mo26993q();

        void toq(@InterfaceC7396q C7445q c7445q, long j2);

        void zy(@InterfaceC7396q C7445q c7445q);
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.q$q */
    /* JADX INFO: compiled from: TaskRunner.kt */
    @lv5({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n+ 2 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n*L\n1#1,314:1\n35#2,19:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n*L\n62#1:315,19\n*E\n"})
    public static final class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7444k abstractC7444kM26988n;
            while (true) {
                C7445q c7445q = C7445q.this;
                synchronized (c7445q) {
                    abstractC7444kM26988n = c7445q.m26988n();
                }
                if (abstractC7444kM26988n == null) {
                    return;
                }
                okhttp3.internal.concurrent.zy zyVarM26983q = abstractC7444kM26988n.m26983q();
                d2ok.qrj(zyVarM26983q);
                C7445q c7445q2 = C7445q.this;
                long jMo26993q = -1;
                boolean zIsLoggable = C7445q.f43046y.m26994k().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo26993q = zyVarM26983q.ld6().m26991y().mo26993q();
                    okhttp3.internal.concurrent.toq.zy(abstractC7444kM26988n, zyVarM26983q, "starting");
                }
                try {
                    try {
                        c7445q2.ld6(abstractC7444kM26988n);
                        was wasVar = was.f36763k;
                        if (zIsLoggable) {
                            okhttp3.internal.concurrent.toq.zy(abstractC7444kM26988n, zyVarM26983q, "finished run in " + okhttp3.internal.concurrent.toq.toq(zyVarM26983q.ld6().m26991y().mo26993q() - jMo26993q));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        okhttp3.internal.concurrent.toq.zy(abstractC7444kM26988n, zyVarM26983q, "failed a run in " + okhttp3.internal.concurrent.toq.toq(zyVarM26983q.ld6().m26991y().mo26993q() - jMo26993q));
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.q$toq */
    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final Logger m26994k() {
            return C7445q.f43044p;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.q$zy */
    /* JADX INFO: compiled from: TaskRunner.kt */
    @lv5({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class zy implements k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final ThreadPoolExecutor f43052k;

        public zy(@InterfaceC7396q ThreadFactory threadFactory) {
            d2ok.m23075h(threadFactory, "threadFactory");
            this.f43052k = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.C7445q.k
        public void execute(@InterfaceC7396q Runnable runnable) {
            d2ok.m23075h(runnable, "runnable");
            this.f43052k.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.C7445q.k
        /* JADX INFO: renamed from: k */
        public void mo26992k(@InterfaceC7396q C7445q taskRunner) {
            d2ok.m23075h(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        /* JADX INFO: renamed from: n */
        public final void m26995n() {
            this.f43052k.shutdown();
        }

        @Override // okhttp3.internal.concurrent.C7445q.k
        /* JADX INFO: renamed from: q */
        public long mo26993q() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.C7445q.k
        public void toq(@InterfaceC7396q C7445q taskRunner, long j2) throws InterruptedException {
            d2ok.m23075h(taskRunner, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                taskRunner.wait(j3, (int) j4);
            }
        }

        @Override // okhttp3.internal.concurrent.C7445q.k
        public void zy(@InterfaceC7396q C7445q taskRunner) {
            d2ok.m23075h(taskRunner, "taskRunner");
        }
    }

    static {
        Logger logger = Logger.getLogger(C7445q.class.getName());
        d2ok.kja0(logger, "getLogger(TaskRunner::class.java.name)");
        f43044p = logger;
    }

    public C7445q(@InterfaceC7396q k backend) {
        d2ok.m23075h(backend, "backend");
        this.f43048k = backend;
        this.f93862toq = 10000;
        this.f43049n = new ArrayList();
        this.f43047g = new ArrayList();
        this.f93861f7l8 = new q();
    }

    /* JADX INFO: renamed from: g */
    private final void m26985g(AbstractC7444k abstractC7444k) {
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC7444k.f7l8(-1L);
        okhttp3.internal.concurrent.zy zyVarM26983q = abstractC7444k.m26983q();
        d2ok.qrj(zyVarM26983q);
        zyVarM26983q.f7l8().remove(abstractC7444k);
        this.f43047g.remove(zyVarM26983q);
        zyVarM26983q.ki(abstractC7444k);
        this.f43049n.add(zyVarM26983q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ld6(AbstractC7444k abstractC7444k) {
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC7444k.toq());
        try {
            long jMo26947g = abstractC7444k.mo26947g();
            synchronized (this) {
                m26987q(abstractC7444k, jMo26947g);
                was wasVar = was.f36763k;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m26987q(abstractC7444k, -1L);
                was wasVar2 = was.f36763k;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m26987q(AbstractC7444k abstractC7444k, long j2) {
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        okhttp3.internal.concurrent.zy zyVarM26983q = abstractC7444k.m26983q();
        d2ok.qrj(zyVarM26983q);
        if (!(zyVarM26983q.m27004n() == abstractC7444k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zM27001g = zyVarM26983q.m27001g();
        zyVarM26983q.t8r(false);
        zyVarM26983q.ki(null);
        this.f43049n.remove(zyVarM26983q);
        if (j2 != -1 && !zM27001g && !zyVarM26983q.m27005p()) {
            zyVarM26983q.cdj(abstractC7444k, j2, true);
        }
        if (!zyVarM26983q.f7l8().isEmpty()) {
            this.f43047g.add(zyVarM26983q);
        }
    }

    public final void f7l8() {
        int size = this.f43049n.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.f43049n.get(size).toq();
            }
        }
        for (int size2 = this.f43047g.size() - 1; -1 < size2; size2--) {
            okhttp3.internal.concurrent.zy zyVar = this.f43047g.get(size2);
            zyVar.toq();
            if (zyVar.f7l8().isEmpty()) {
                this.f43047g.remove(size2);
            }
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final AbstractC7444k m26988n() {
        boolean z2;
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f43047g.isEmpty()) {
            long jMo26993q = this.f43048k.mo26993q();
            long jMin = Long.MAX_VALUE;
            Iterator<okhttp3.internal.concurrent.zy> it = this.f43047g.iterator();
            AbstractC7444k abstractC7444k = null;
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                AbstractC7444k abstractC7444k2 = it.next().f7l8().get(0);
                long jMax = Math.max(0L, abstractC7444k2.zy() - jMo26993q);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC7444k != null) {
                        z2 = true;
                        break;
                    }
                    abstractC7444k = abstractC7444k2;
                }
            }
            if (abstractC7444k != null) {
                m26985g(abstractC7444k);
                if (z2 || (!this.f93863zy && (!this.f43047g.isEmpty()))) {
                    this.f43048k.execute(this.f93861f7l8);
                }
                return abstractC7444k;
            }
            if (this.f93863zy) {
                if (jMin < this.f43050q - jMo26993q) {
                    this.f43048k.mo26992k(this);
                }
                return null;
            }
            this.f93863zy = true;
            this.f43050q = jMo26993q + jMin;
            try {
                try {
                    this.f43048k.toq(this, jMin);
                } catch (InterruptedException unused) {
                    f7l8();
                }
            } finally {
                this.f93863zy = false;
            }
        }
        return null;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final okhttp3.internal.concurrent.zy m26989p() {
        int i2;
        synchronized (this) {
            i2 = this.f93862toq;
            this.f93862toq = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new okhttp3.internal.concurrent.zy(this, sb.toString());
    }

    /* JADX INFO: renamed from: s */
    public final void m26990s(@InterfaceC7396q okhttp3.internal.concurrent.zy taskQueue) {
        d2ok.m23075h(taskQueue, "taskQueue");
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m27004n() == null) {
            if (!taskQueue.f7l8().isEmpty()) {
                C1359g.zy(this.f43047g, taskQueue);
            } else {
                this.f43047g.remove(taskQueue);
            }
        }
        if (this.f93863zy) {
            this.f43048k.mo26992k(this);
        } else {
            this.f43048k.execute(this.f93861f7l8);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final k m26991y() {
        return this.f43048k;
    }

    @InterfaceC7396q
    public final List<okhttp3.internal.concurrent.zy> zy() {
        List<okhttp3.internal.concurrent.zy> listL7o;
        synchronized (this) {
            listL7o = a9.l7o(this.f43049n, this.f43047g);
        }
        return listL7o;
    }
}
