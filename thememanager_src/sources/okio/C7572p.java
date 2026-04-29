package okio;

import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.p */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes4.dex */
public class C7572p extends C7560j {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7395n
    private static C7572p f94300kja0 = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    private static final Condition f94301ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final long f94302n7h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final ReentrantLock f43824p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final long f94303qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    public static final k f43825s = new k(null);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f94304x2 = 65536;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private C7572p f94305f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f43826g;

    /* JADX INFO: renamed from: y */
    private long f43827y;

    /* JADX INFO: renamed from: okio.p$k */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @lv5({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f7l8(C7572p c7572p, long j2, boolean z2) {
            ReentrantLock reentrantLockM27844g = C7572p.f43825s.m27844g();
            reentrantLockM27844g.lock();
            try {
                if (!(!c7572p.f43826g)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                c7572p.f43826g = true;
                if (C7572p.f94300kja0 == null) {
                    C7572p.f94300kja0 = new C7572p();
                    new toq().start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    c7572p.f43827y = Math.min(j2, c7572p.mo27757n() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    c7572p.f43827y = j2 + jNanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    c7572p.f43827y = c7572p.mo27757n();
                }
                long jMcp = c7572p.mcp(jNanoTime);
                C7572p c7572p2 = C7572p.f94300kja0;
                kotlin.jvm.internal.d2ok.qrj(c7572p2);
                while (c7572p2.f94305f7l8 != null) {
                    C7572p c7572p3 = c7572p2.f94305f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7572p3);
                    if (jMcp < c7572p3.mcp(jNanoTime)) {
                        break;
                    }
                    c7572p2 = c7572p2.f94305f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7572p2);
                }
                c7572p.f94305f7l8 = c7572p2.f94305f7l8;
                c7572p2.f94305f7l8 = c7572p;
                if (c7572p2 == C7572p.f94300kja0) {
                    C7572p.f43825s.m27845n().signal();
                }
                was wasVar = was.f36763k;
            } finally {
                reentrantLockM27844g.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public final boolean m27843q(C7572p c7572p) {
            ReentrantLock reentrantLockM27844g = C7572p.f43825s.m27844g();
            reentrantLockM27844g.lock();
            try {
                if (!c7572p.f43826g) {
                    return false;
                }
                c7572p.f43826g = false;
                for (C7572p c7572p2 = C7572p.f94300kja0; c7572p2 != null; c7572p2 = c7572p2.f94305f7l8) {
                    if (c7572p2.f94305f7l8 == c7572p) {
                        c7572p2.f94305f7l8 = c7572p.f94305f7l8;
                        c7572p.f94305f7l8 = null;
                        return false;
                    }
                }
                return true;
            } finally {
                reentrantLockM27844g.unlock();
            }
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final ReentrantLock m27844g() {
            return C7572p.f43824p;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final Condition m27845n() {
            return C7572p.f94301ld6;
        }

        @InterfaceC7395n
        public final C7572p zy() throws InterruptedException {
            C7572p c7572p = C7572p.f94300kja0;
            kotlin.jvm.internal.d2ok.qrj(c7572p);
            C7572p c7572p2 = c7572p.f94305f7l8;
            if (c7572p2 == null) {
                long jNanoTime = System.nanoTime();
                m27845n().await(C7572p.f94303qrj, TimeUnit.MILLISECONDS);
                C7572p c7572p3 = C7572p.f94300kja0;
                kotlin.jvm.internal.d2ok.qrj(c7572p3);
                if (c7572p3.f94305f7l8 != null || System.nanoTime() - jNanoTime < C7572p.f94302n7h) {
                    return null;
                }
                return C7572p.f94300kja0;
            }
            long jMcp = c7572p2.mcp(System.nanoTime());
            if (jMcp > 0) {
                m27845n().await(jMcp, TimeUnit.NANOSECONDS);
                return null;
            }
            C7572p c7572p4 = C7572p.f94300kja0;
            kotlin.jvm.internal.d2ok.qrj(c7572p4);
            c7572p4.f94305f7l8 = c7572p2.f94305f7l8;
            c7572p2.f94305f7l8 = null;
            return c7572p2;
        }
    }

    /* JADX INFO: renamed from: okio.p$q */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @lv5({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
    public static final class q implements nn86 {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ nn86 f43829q;

        q(nn86 nn86Var) {
            this.f43829q = nn86Var;
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7572p c7572p = C7572p.this;
            nn86 nn86Var = this.f43829q;
            c7572p.o1t();
            try {
                nn86Var.close();
                was wasVar = was.f36763k;
                if (c7572p.wvg()) {
                    throw c7572p.m27841i(null);
                }
            } catch (IOException e2) {
                if (!c7572p.wvg()) {
                    throw e2;
                }
                throw c7572p.m27841i(e2);
            } finally {
                c7572p.wvg();
            }
        }

        @Override // okio.nn86
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7572p toq() {
            return C7572p.this;
        }

        @InterfaceC7396q
        public String toString() {
            return "AsyncTimeout.source(" + this.f43829q + ')';
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            C7572p c7572p = C7572p.this;
            nn86 nn86Var = this.f43829q;
            c7572p.o1t();
            try {
                long jWx16 = nn86Var.wx16(sink, j2);
                if (c7572p.wvg()) {
                    throw c7572p.m27841i(null);
                }
                return jWx16;
            } catch (IOException e2) {
                if (c7572p.wvg()) {
                    throw c7572p.m27841i(e2);
                }
                throw e2;
            } finally {
                c7572p.wvg();
            }
        }
    }

    /* JADX INFO: renamed from: okio.p$toq */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    private static final class toq extends Thread {
        public toq() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockM27844g;
            C7572p c7572pZy;
            while (true) {
                try {
                    k kVar = C7572p.f43825s;
                    reentrantLockM27844g = kVar.m27844g();
                    reentrantLockM27844g.lock();
                    try {
                        c7572pZy = kVar.zy();
                    } finally {
                        reentrantLockM27844g.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c7572pZy == C7572p.f94300kja0) {
                    C7572p.f94300kja0 = null;
                    return;
                }
                was wasVar = was.f36763k;
                reentrantLockM27844g.unlock();
                if (c7572pZy != null) {
                    c7572pZy.fti();
                }
            }
        }
    }

    /* JADX INFO: renamed from: okio.p$zy */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @lv5({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
    public static final class zy implements vyq {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ vyq f43831q;

        zy(vyq vyqVar) {
            this.f43831q = vyqVar;
        }

        @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7572p c7572p = C7572p.this;
            vyq vyqVar = this.f43831q;
            c7572p.o1t();
            try {
                vyqVar.close();
                was wasVar = was.f36763k;
                if (c7572p.wvg()) {
                    throw c7572p.m27841i(null);
                }
            } catch (IOException e2) {
                if (!c7572p.wvg()) {
                    throw e2;
                }
                throw c7572p.m27841i(e2);
            } finally {
                c7572p.wvg();
            }
        }

        @Override // okio.vyq, java.io.Flushable
        public void flush() throws IOException {
            C7572p c7572p = C7572p.this;
            vyq vyqVar = this.f43831q;
            c7572p.o1t();
            try {
                vyqVar.flush();
                was wasVar = was.f36763k;
                if (c7572p.wvg()) {
                    throw c7572p.m27841i(null);
                }
            } catch (IOException e2) {
                if (!c7572p.wvg()) {
                    throw e2;
                }
                throw c7572p.m27841i(e2);
            } finally {
                c7572p.wvg();
            }
        }

        @Override // okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            C7575s.m27855n(source.size(), 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                C7541c c7541c = source.f43846k;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                while (true) {
                    if (j3 >= 65536) {
                        break;
                    }
                    j3 += (long) (c7541c.f94264zy - c7541c.f94263toq);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        c7541c = c7541c.f43686g;
                        kotlin.jvm.internal.d2ok.qrj(c7541c);
                    }
                }
                C7572p c7572p = C7572p.this;
                vyq vyqVar = this.f43831q;
                c7572p.o1t();
                try {
                    vyqVar.mo26936j(source, j3);
                    was wasVar = was.f36763k;
                    if (c7572p.wvg()) {
                        throw c7572p.m27841i(null);
                    }
                    j2 -= j3;
                } catch (IOException e2) {
                    if (!c7572p.wvg()) {
                        throw e2;
                    }
                    throw c7572p.m27841i(e2);
                } finally {
                    c7572p.wvg();
                }
            }
        }

        @Override // okio.vyq
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7572p toq() {
            return C7572p.this;
        }

        @InterfaceC7396q
        public String toString() {
            return "AsyncTimeout.sink(" + this.f43831q + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f43824p = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.d2ok.kja0(conditionNewCondition, "newCondition(...)");
        f94301ld6 = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f94303qrj = millis;
        f94302n7h = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long mcp(long j2) {
        return this.f43827y - j2;
    }

    @InterfaceC7396q
    public final nn86 a9(@InterfaceC7396q nn86 source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        return new q(source);
    }

    protected void fti() {
    }

    @kotlin.nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final IOException m27841i(@InterfaceC7395n IOException iOException) {
        return mo27180t(iOException);
    }

    @InterfaceC7396q
    public final vyq jk(@InterfaceC7396q vyq sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        return new zy(sink);
    }

    public final <T> T jp0y(@InterfaceC7396q InterfaceC5981k<? extends T> block) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        o1t();
        try {
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.d3.m23090q(1);
                if (wvg()) {
                    throw m27841i(null);
                }
                kotlin.jvm.internal.d3.zy(1);
                return tInvoke;
            } catch (IOException e2) {
                if (wvg()) {
                    throw m27841i(e2);
                }
                throw e2;
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.d3.m23090q(1);
            wvg();
            kotlin.jvm.internal.d3.zy(1);
            throw th;
        }
    }

    public final void o1t() {
        long jLd6 = ld6();
        boolean zF7l8 = f7l8();
        if (jLd6 != 0 || zF7l8) {
            f43825s.f7l8(this, jLd6, zF7l8);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    protected IOException mo27180t(@InterfaceC7395n IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean wvg() {
        return f43825s.m27843q(this);
    }
}
