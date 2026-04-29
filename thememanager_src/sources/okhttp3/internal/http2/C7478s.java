package okhttp3.internal.http2;

import b7.C1359g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okio.C7560j;
import okio.C7572p;
import okio.nn86;
import okio.vyq;

/* JADX INFO: renamed from: okhttp3.internal.http2.s */
/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
public final class C7478s {

    /* JADX INFO: renamed from: h */
    public static final long f43296h = 16384;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f93971kja0 = new k(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final ArrayDeque<fn3e> f93972f7l8;

    /* JADX INFO: renamed from: g */
    private long f43297g;

    /* JADX INFO: renamed from: k */
    private final int f43298k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    private final q f93973ld6;

    /* JADX INFO: renamed from: n */
    private long f43299n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7395n
    private IOException f93974n7h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final toq f43300p;

    /* JADX INFO: renamed from: q */
    private long f43301q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7395n
    private okhttp3.internal.http2.toq f93975qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final zy f43302s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C7471g f93976toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    private final q f93977x2;

    /* JADX INFO: renamed from: y */
    private boolean f43303y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f93978zy;

    /* JADX INFO: renamed from: okhttp3.internal.http2.s$k */
    /* JADX INFO: compiled from: Http2Stream.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.s$q */
    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class q extends C7572p {
        public q() {
        }

        @Override // okio.C7572p
        protected void fti() {
            C7478s.this.m27170g(okhttp3.internal.http2.toq.CANCEL);
            C7478s.this.m27178y().r25n();
        }

        public final void gvn7() throws IOException {
            if (wvg()) {
                throw mo27180t(null);
            }
        }

        @Override // okio.C7572p
        @InterfaceC7396q
        /* JADX INFO: renamed from: t */
        protected IOException mo27180t(@InterfaceC7395n IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.s$zy */
    /* JADX INFO: compiled from: Http2Stream.kt */
    @lv5({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class zy implements nn86 {

        /* JADX INFO: renamed from: k */
        private final long f43311k;

        /* JADX INFO: renamed from: q */
        private boolean f43314q;

        /* JADX INFO: renamed from: s */
        private boolean f43315s;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private fn3e f43316y;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final okio.x2 f43312n = new okio.x2();

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final okio.x2 f43310g = new okio.x2();

        public zy(long j2, boolean z2) {
            this.f43311k = j2;
            this.f43314q = z2;
        }

        private final void fu4(long j2) {
            C7478s c7478s = C7478s.this;
            if (!C1359g.f7245y || !Thread.holdsLock(c7478s)) {
                C7478s.this.m27178y().nnh(j2);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7478s);
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            C7478s c7478s = C7478s.this;
            synchronized (c7478s) {
                this.f43315s = true;
                size = this.f43310g.size();
                this.f43310g.m27873y();
                d2ok.n7h(c7478s, "null cannot be cast to non-null type java.lang.Object");
                c7478s.notifyAll();
                was wasVar = was.f36763k;
            }
            if (size > 0) {
                fu4(size);
            }
            C7478s.this.toq();
        }

        /* JADX INFO: renamed from: h */
        public final void m27185h(boolean z2) {
            this.f43314q = z2;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27186k() {
            return this.f43315s;
        }

        public final void ki(@InterfaceC7395n fn3e fn3eVar) {
            this.f43316y = fn3eVar;
        }

        public final void ld6(@InterfaceC7396q okio.n7h source, long j2) throws IOException {
            boolean z2;
            boolean z3;
            boolean z5;
            d2ok.m23075h(source, "source");
            C7478s c7478s = C7478s.this;
            if (C1359g.f7245y && Thread.holdsLock(c7478s)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7478s);
            }
            long j3 = j2;
            while (j3 > 0) {
                synchronized (C7478s.this) {
                    z2 = this.f43314q;
                    z3 = true;
                    z5 = this.f43310g.size() + j3 > this.f43311k;
                    was wasVar = was.f36763k;
                }
                if (z5) {
                    source.skip(j3);
                    C7478s.this.m27170g(okhttp3.internal.http2.toq.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z2) {
                    source.skip(j3);
                    return;
                }
                long jWx16 = source.wx16(this.f43312n, j3);
                if (jWx16 == -1) {
                    throw new EOFException();
                }
                j3 -= jWx16;
                C7478s c7478s2 = C7478s.this;
                synchronized (c7478s2) {
                    if (this.f43315s) {
                        this.f43312n.m27873y();
                    } else {
                        if (this.f43310g.size() != 0) {
                            z3 = false;
                        }
                        this.f43310g.ek5k(this.f43312n);
                        if (z3) {
                            d2ok.n7h(c7478s2, "null cannot be cast to non-null type java.lang.Object");
                            c7478s2.notifyAll();
                        }
                    }
                }
            }
            fu4(j2);
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: p */
        public final fn3e m27187p() {
            return this.f43316y;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final okio.x2 m27188q() {
            return this.f43310g;
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return C7478s.this.n7h();
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q okio.x2 sink, long j2) throws IOException {
            long jWx16;
            boolean z2;
            d2ok.m23075h(sink, "sink");
            long j3 = 0;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            while (true) {
                IOException iOExceptionM27174p = null;
                C7478s c7478s = C7478s.this;
                synchronized (c7478s) {
                    c7478s.n7h().o1t();
                    try {
                        if (c7478s.m27176s() != null && !this.f43314q && (iOExceptionM27174p = c7478s.m27174p()) == null) {
                            okhttp3.internal.http2.toq toqVarM27176s = c7478s.m27176s();
                            d2ok.qrj(toqVarM27176s);
                            iOExceptionM27174p = new n7h(toqVarM27176s);
                        }
                        if (this.f43315s) {
                            throw new IOException("stream closed");
                        }
                        if (this.f43310g.size() > j3) {
                            okio.x2 x2Var = this.f43310g;
                            jWx16 = x2Var.wx16(sink, Math.min(j2, x2Var.size()));
                            c7478s.a9(c7478s.qrj() + jWx16);
                            long jQrj = c7478s.qrj() - c7478s.x2();
                            if (iOExceptionM27174p == null && jQrj >= c7478s.m27178y().bek6().m27164n() / 2) {
                                c7478s.m27178y().rp(c7478s.ld6(), jQrj);
                                c7478s.jk(c7478s.qrj());
                            }
                        } else if (this.f43314q || iOExceptionM27174p != null) {
                            jWx16 = -1;
                        } else {
                            c7478s.oc();
                            jWx16 = -1;
                            z2 = true;
                            c7478s.n7h().gvn7();
                            was wasVar = was.f36763k;
                        }
                        z2 = false;
                        c7478s.n7h().gvn7();
                        was wasVar2 = was.f36763k;
                    } finally {
                    }
                }
                if (!z2) {
                    if (jWx16 != -1) {
                        return jWx16;
                    }
                    if (iOExceptionM27174p == null) {
                        return -1L;
                    }
                    throw iOExceptionM27174p;
                }
                j3 = 0;
            }
        }

        public final void x2(boolean z2) {
            this.f43315s = z2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final okio.x2 m27189y() {
            return this.f43312n;
        }

        public final boolean zy() {
            return this.f43314q;
        }
    }

    public C7478s(int i2, @InterfaceC7396q C7471g connection, boolean z2, boolean z3, @InterfaceC7395n fn3e fn3eVar) {
        d2ok.m23075h(connection, "connection");
        this.f43298k = i2;
        this.f93976toq = connection;
        this.f43297g = connection.h7am().m27164n();
        ArrayDeque<fn3e> arrayDeque = new ArrayDeque<>();
        this.f93972f7l8 = arrayDeque;
        this.f43302s = new zy(connection.bek6().m27164n(), z3);
        this.f43300p = new toq(z2);
        this.f93973ld6 = new q();
        this.f93977x2 = new q();
        if (fn3eVar == null) {
            if (!zurt()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!zurt())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(fn3eVar);
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m27169n(okhttp3.internal.http2.toq toqVar, IOException iOException) {
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f93975qrj != null) {
                return false;
            }
            this.f93975qrj = toqVar;
            this.f93974n7h = iOException;
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f43302s.zy() && this.f43300p.m27183q()) {
                return false;
            }
            was wasVar = was.f36763k;
            this.f93976toq.nme(this.f43298k);
            return true;
        }
    }

    public final void a9(long j2) {
        this.f93978zy = j2;
    }

    @InterfaceC7396q
    public final nn86 cdj() {
        return this.f43302s;
    }

    @InterfaceC7396q
    public final C7560j d2ok() {
        return this.f93977x2;
    }

    @InterfaceC7396q
    public final synchronized fn3e d3() throws IOException {
        fn3e fn3eVarM27187p;
        if (!this.f43302s.zy() || !this.f43302s.m27189y().py() || !this.f43302s.m27188q().py()) {
            if (this.f93975qrj == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f93974n7h;
            if (iOException != null) {
                throw iOException;
            }
            okhttp3.internal.http2.toq toqVar = this.f93975qrj;
            d2ok.qrj(toqVar);
            throw new n7h(toqVar);
        }
        fn3eVarM27187p = this.f43302s.m27187p();
        if (fn3eVarM27187p == null) {
            fn3eVarM27187p = C1359g.f53992toq;
        }
        return fn3eVarM27187p;
    }

    public final void eqxt(@InterfaceC7396q List<okhttp3.internal.http2.zy> responseHeaders, boolean z2, boolean z3) throws IOException {
        boolean z5;
        d2ok.m23075h(responseHeaders, "responseHeaders");
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            this.f43303y = true;
            if (z2) {
                this.f43300p.ld6(true);
            }
            was wasVar = was.f36763k;
        }
        if (!z3) {
            synchronized (this.f93976toq) {
                z5 = this.f93976toq.e5() >= this.f93976toq.ga();
            }
            z3 = z5;
        }
        this.f93976toq.kiv(this.f43298k, z2, responseHeaders);
        if (z3) {
            this.f93976toq.flush();
        }
    }

    public final void f7l8(@InterfaceC7396q fn3e trailers) {
        d2ok.m23075h(trailers, "trailers");
        synchronized (this) {
            boolean z2 = true;
            if (!(!this.f43300p.m27183q())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.f43300p.x2(trailers);
            was wasVar = was.f36763k;
        }
    }

    @InterfaceC7396q
    public final q fn3e() {
        return this.f93977x2;
    }

    public final void fti(long j2) {
        this.f43297g = j2;
    }

    @InterfaceC7396q
    public final C7560j fu4() {
        return this.f93973ld6;
    }

    /* JADX INFO: renamed from: g */
    public final void m27170g(@InterfaceC7396q okhttp3.internal.http2.toq errorCode) {
        d2ok.m23075h(errorCode, "errorCode");
        if (m27169n(errorCode, null)) {
            this.f93976toq.yw(this.f43298k, errorCode);
        }
    }

    @InterfaceC7396q
    public final synchronized fn3e gvn7() throws IOException {
        fn3e fn3eVarRemoveFirst;
        this.f93973ld6.o1t();
        while (this.f93972f7l8.isEmpty() && this.f93975qrj == null) {
            try {
                oc();
            } catch (Throwable th) {
                this.f93973ld6.gvn7();
                throw th;
            }
        }
        this.f93973ld6.gvn7();
        if (!(!this.f93972f7l8.isEmpty())) {
            IOException iOException = this.f93974n7h;
            if (iOException != null) {
                throw iOException;
            }
            okhttp3.internal.http2.toq toqVar = this.f93975qrj;
            d2ok.qrj(toqVar);
            throw new n7h(toqVar);
        }
        fn3eVarRemoveFirst = this.f93972f7l8.removeFirst();
        d2ok.kja0(fn3eVarRemoveFirst, "headersQueue.removeFirst()");
        return fn3eVarRemoveFirst;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public final toq m27171h() {
        return this.f43300p;
    }

    /* JADX INFO: renamed from: i */
    public final long m27172i() {
        return this.f43299n;
    }

    public final void jk(long j2) {
        this.f43301q = j2;
    }

    public final void jp0y(long j2) {
        this.f43299n = j2;
    }

    /* JADX INFO: renamed from: k */
    public final void m27173k(long j2) {
        this.f43297g += j2;
        if (j2 > 0) {
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @InterfaceC7396q
    public final zy ki() {
        return this.f43302s;
    }

    @InterfaceC7396q
    public final vyq kja0() {
        synchronized (this) {
            if (!(this.f43303y || zurt())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            was wasVar = was.f36763k;
        }
        return this.f43300p;
    }

    public final int ld6() {
        return this.f43298k;
    }

    public final void mcp(@InterfaceC7395n IOException iOException) {
        this.f93974n7h = iOException;
    }

    @InterfaceC7396q
    public final q n7h() {
        return this.f93973ld6;
    }

    public final synchronized boolean ni7() {
        if (this.f93975qrj != null) {
            return false;
        }
        if ((this.f43302s.zy() || this.f43302s.m27186k()) && (this.f43300p.m27183q() || this.f43300p.zy())) {
            if (this.f43303y) {
                return false;
            }
        }
        return true;
    }

    public final void o1t(@InterfaceC7396q fn3e headers, boolean z2) {
        boolean zNi7;
        d2ok.m23075h(headers, "headers");
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f43303y && z2) {
                this.f43302s.ki(headers);
            } else {
                this.f43303y = true;
                this.f93972f7l8.add(headers);
            }
            if (z2) {
                this.f43302s.m27185h(true);
            }
            zNi7 = ni7();
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            was wasVar = was.f36763k;
        }
        if (zNi7) {
            return;
        }
        this.f93976toq.nme(this.f43298k);
    }

    public final void oc() throws InterruptedIOException {
        try {
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public final IOException m27174p() {
        return this.f93974n7h;
    }

    /* JADX INFO: renamed from: q */
    public final void m27175q(@InterfaceC7396q okhttp3.internal.http2.toq rstStatusCode, @InterfaceC7395n IOException iOException) throws IOException {
        d2ok.m23075h(rstStatusCode, "rstStatusCode");
        if (m27169n(rstStatusCode, iOException)) {
            this.f93976toq.o5(this.f43298k, rstStatusCode);
        }
    }

    public final long qrj() {
        return this.f93978zy;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final synchronized okhttp3.internal.http2.toq m27176s() {
        return this.f93975qrj;
    }

    /* JADX INFO: renamed from: t */
    public final void m27177t(@InterfaceC7395n okhttp3.internal.http2.toq toqVar) {
        this.f93975qrj = toqVar;
    }

    public final long t8r() {
        return this.f43297g;
    }

    public final void toq() throws IOException {
        boolean z2;
        boolean zNi7;
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z2 = !this.f43302s.zy() && this.f43302s.m27186k() && (this.f43300p.m27183q() || this.f43300p.zy());
            zNi7 = ni7();
            was wasVar = was.f36763k;
        }
        if (z2) {
            m27175q(okhttp3.internal.http2.toq.CANCEL, null);
        } else {
            if (zNi7) {
                return;
            }
            this.f93976toq.nme(this.f43298k);
        }
    }

    public final synchronized void wvg(@InterfaceC7396q okhttp3.internal.http2.toq errorCode) {
        d2ok.m23075h(errorCode, "errorCode");
        if (this.f93975qrj == null) {
            this.f93975qrj = errorCode;
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final long x2() {
        return this.f43301q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final C7471g m27178y() {
        return this.f93976toq;
    }

    /* JADX INFO: renamed from: z */
    public final void m27179z(@InterfaceC7396q okio.n7h source, int i2) throws IOException {
        d2ok.m23075h(source, "source");
        if (!C1359g.f7245y || !Thread.holdsLock(this)) {
            this.f43302s.ld6(source, i2);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean zurt() {
        return this.f93976toq.t8iq() == ((this.f43298k & 1) == 1);
    }

    public final void zy() throws IOException {
        if (this.f43300p.zy()) {
            throw new IOException("stream closed");
        }
        if (this.f43300p.m27183q()) {
            throw new IOException("stream finished");
        }
        if (this.f93975qrj != null) {
            IOException iOException = this.f93974n7h;
            if (iOException != null) {
                throw iOException;
            }
            okhttp3.internal.http2.toq toqVar = this.f93975qrj;
            d2ok.qrj(toqVar);
            throw new n7h(toqVar);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.s$toq */
    /* JADX INFO: compiled from: Http2Stream.kt */
    @lv5({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class toq implements vyq {

        /* JADX INFO: renamed from: g */
        private boolean f43305g;

        /* JADX INFO: renamed from: k */
        private boolean f43306k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private fn3e f43307n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final okio.x2 f43308q;

        public toq(boolean z2) {
            this.f43306k = z2;
            this.f43308q = new okio.x2();
        }

        /* JADX INFO: renamed from: k */
        private final void m27181k(boolean z2) throws IOException {
            long jMin;
            boolean z3;
            C7478s c7478s = C7478s.this;
            synchronized (c7478s) {
                c7478s.fn3e().o1t();
                while (c7478s.m27172i() >= c7478s.t8r() && !this.f43306k && !this.f43305g && c7478s.m27176s() == null) {
                    try {
                        c7478s.oc();
                    } finally {
                        c7478s.fn3e().gvn7();
                    }
                }
                c7478s.fn3e().gvn7();
                c7478s.zy();
                jMin = Math.min(c7478s.t8r() - c7478s.m27172i(), this.f43308q.size());
                c7478s.jp0y(c7478s.m27172i() + jMin);
                z3 = z2 && jMin == this.f43308q.size();
                was wasVar = was.f36763k;
            }
            C7478s.this.fn3e().o1t();
            try {
                C7478s.this.m27178y().uf(C7478s.this.ld6(), z3, this.f43308q, jMin);
            } finally {
                c7478s = C7478s.this;
            }
        }

        @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7478s c7478s = C7478s.this;
            if (C1359g.f7245y && Thread.holdsLock(c7478s)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7478s);
            }
            C7478s c7478s2 = C7478s.this;
            synchronized (c7478s2) {
                if (this.f43305g) {
                    return;
                }
                boolean z2 = c7478s2.m27176s() == null;
                was wasVar = was.f36763k;
                if (!C7478s.this.m27171h().f43306k) {
                    boolean z3 = this.f43308q.size() > 0;
                    if (this.f43307n != null) {
                        while (this.f43308q.size() > 0) {
                            m27181k(false);
                        }
                        C7471g c7471gM27178y = C7478s.this.m27178y();
                        int iLd6 = C7478s.this.ld6();
                        fn3e fn3eVar = this.f43307n;
                        d2ok.qrj(fn3eVar);
                        c7471gM27178y.kiv(iLd6, z2, C1359g.hb(fn3eVar));
                    } else if (z3) {
                        while (this.f43308q.size() > 0) {
                            m27181k(true);
                        }
                    } else if (z2) {
                        C7478s.this.m27178y().uf(C7478s.this.ld6(), true, null, 0L);
                    }
                }
                synchronized (C7478s.this) {
                    this.f43305g = true;
                    was wasVar2 = was.f36763k;
                }
                C7478s.this.m27178y().flush();
                C7478s.this.toq();
            }
        }

        @Override // okio.vyq, java.io.Flushable
        public void flush() throws IOException {
            C7478s c7478s = C7478s.this;
            if (C1359g.f7245y && Thread.holdsLock(c7478s)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7478s);
            }
            C7478s c7478s2 = C7478s.this;
            synchronized (c7478s2) {
                c7478s2.zy();
                was wasVar = was.f36763k;
            }
            while (this.f43308q.size() > 0) {
                m27181k(false);
                C7478s.this.m27178y().flush();
            }
        }

        @Override // okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q okio.x2 source, long j2) throws IOException {
            d2ok.m23075h(source, "source");
            C7478s c7478s = C7478s.this;
            if (!C1359g.f7245y || !Thread.holdsLock(c7478s)) {
                this.f43308q.mo26936j(source, j2);
                while (this.f43308q.size() >= 16384) {
                    m27181k(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7478s);
            }
        }

        public final void ld6(boolean z2) {
            this.f43306k = z2;
        }

        /* JADX INFO: renamed from: p */
        public final void m27182p(boolean z2) {
            this.f43305g = z2;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m27183q() {
            return this.f43306k;
        }

        @Override // okio.vyq
        @InterfaceC7396q
        public C7560j toq() {
            return C7478s.this.fn3e();
        }

        public final void x2(@InterfaceC7395n fn3e fn3eVar) {
            this.f43307n = fn3eVar;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public final fn3e m27184y() {
            return this.f43307n;
        }

        public final boolean zy() {
            return this.f43305g;
        }

        public /* synthetic */ toq(C7478s c7478s, boolean z2, int i2, ni7 ni7Var) {
            this((i2 & 1) != 0 ? false : z2);
        }
    }
}
