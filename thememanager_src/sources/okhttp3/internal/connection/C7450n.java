package okhttp3.internal.connection;

import androidx.core.app.x9kr;
import b7.C1359g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.C6231h;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7436h;
import okhttp3.C7514k;
import okhttp3.C7529t;
import okhttp3.InterfaceC7435g;
import okhttp3.InterfaceC7519n;
import okhttp3.fti;
import okhttp3.internal.platform.C7498p;
import okhttp3.jk;
import okhttp3.ki;
import okhttp3.zurt;
import okio.C7572p;

/* JADX INFO: renamed from: okhttp3.internal.connection.n */
/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class C7450n implements InterfaceC7519n {

    /* JADX INFO: renamed from: c */
    private boolean f43076c;

    /* JADX INFO: renamed from: e */
    private volatile boolean f43077e;

    /* JADX INFO: renamed from: f */
    private boolean f43078f;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final f7l8 f43079g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private Object f43080h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7395n
    private C7452q f43081i;

    /* JADX INFO: renamed from: j */
    @InterfaceC7395n
    private volatile okhttp3.internal.connection.zy f43082j;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7529t f43083k;

    /* JADX INFO: renamed from: l */
    private boolean f43084l;

    /* JADX INFO: renamed from: n */
    private final boolean f43085n;

    /* JADX INFO: renamed from: o */
    @InterfaceC7395n
    private volatile C7448g f43086o;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final AtomicBoolean f43087p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final jk f43088q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7395n
    private okhttp3.internal.connection.zy f43089r;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final zy f43090s;

    /* JADX INFO: renamed from: t */
    private boolean f43091t;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final ki f43092y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private C7448g f43093z;

    /* JADX INFO: renamed from: okhttp3.internal.connection.n$k */
    /* JADX INFO: compiled from: RealCall.kt */
    @lv5({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class k implements Runnable {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final InterfaceC7435g f43094k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7450n f43095n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private volatile AtomicInteger f43096q;

        public k(@InterfaceC7396q C7450n c7450n, InterfaceC7435g responseCallback) {
            d2ok.m23075h(responseCallback, "responseCallback");
            this.f43095n = c7450n;
            this.f43094k = responseCallback;
            this.f43096q = new AtomicInteger(0);
        }

        /* JADX INFO: renamed from: g */
        public final void m27037g(@InterfaceC7396q k other) {
            d2ok.m23075h(other, "other");
            this.f43096q = other.f43096q;
        }

        /* JADX INFO: renamed from: k */
        public final void m27038k(@InterfaceC7396q ExecutorService executorService) {
            d2ok.m23075h(executorService, "executorService");
            C7436h c7436hM27428c = this.f43095n.cdj().m27428c();
            if (C1359g.f7245y && Thread.holdsLock(c7436hM27428c)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7436hM27428c);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.f43095n.wvg(interruptedIOException);
                    this.f43094k.zy(this.f43095n, interruptedIOException);
                    this.f43095n.cdj().m27428c().m26922y(this);
                }
            } catch (Throwable th) {
                this.f43095n.cdj().m27428c().m26922y(this);
                throw th;
            }
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final jk m27039n() {
            return this.f43095n.ni7();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final String m27040q() {
            return this.f43095n.ni7().cdj().fti();
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            Throwable th;
            IOException e2;
            C7436h c7436hM27428c;
            String str = "OkHttp " + this.f43095n.m27035t();
            C7450n c7450n = this.f43095n;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                try {
                    c7450n.f43090s.o1t();
                    try {
                        z2 = true;
                        try {
                            this.f43094k.mo22383q(c7450n, c7450n.fu4());
                            c7436hM27428c = c7450n.cdj().m27428c();
                        } catch (IOException e3) {
                            e2 = e3;
                            if (z2) {
                                C7498p.f43366k.f7l8().qrj("Callback failure for " + c7450n.d3(), 4, e2);
                            } else {
                                this.f43094k.zy(c7450n, e2);
                            }
                            c7436hM27428c = c7450n.cdj().m27428c();
                        } catch (Throwable th2) {
                            th = th2;
                            c7450n.cancel();
                            if (!z2) {
                                IOException iOException = new IOException("canceled due to " + th);
                                C6231h.m22845k(iOException, th);
                                this.f43094k.zy(c7450n, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        z2 = false;
                        e2 = e4;
                    } catch (Throwable th3) {
                        z2 = false;
                        th = th3;
                    }
                    c7436hM27428c.m26922y(this);
                } catch (Throwable th4) {
                    c7450n.cdj().m27428c().m26922y(this);
                    throw th4;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }

        @InterfaceC7396q
        public final C7450n toq() {
            return this.f43095n;
        }

        @InterfaceC7396q
        public final AtomicInteger zy() {
            return this.f43096q;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.n$toq */
    /* JADX INFO: compiled from: RealCall.kt */
    public static final class toq extends WeakReference<C7450n> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private final Object f43097k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(@InterfaceC7396q C7450n referent, @InterfaceC7395n Object obj) {
            super(referent);
            d2ok.m23075h(referent, "referent");
            this.f43097k = obj;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final Object m27041k() {
            return this.f43097k;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.n$zy */
    /* JADX INFO: compiled from: RealCall.kt */
    public static final class zy extends C7572p {
        zy() {
        }

        @Override // okio.C7572p
        protected void fti() {
            C7450n.this.cancel();
        }
    }

    public C7450n(@InterfaceC7396q C7529t client, @InterfaceC7396q jk originalRequest, boolean z2) {
        d2ok.m23075h(client, "client");
        d2ok.m23075h(originalRequest, "originalRequest");
        this.f43083k = client;
        this.f43088q = originalRequest;
        this.f43085n = z2;
        this.f43079g = client.n5r1().zy();
        this.f43092y = client.uv6().mo5773k(this);
        zy zyVar = new zy();
        zyVar.mo27758p(client.dd(), TimeUnit.MILLISECONDS);
        this.f43090s = zyVar;
        this.f43087p = new AtomicBoolean();
        this.f43076c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d3() {
        StringBuilder sb = new StringBuilder();
        sb.append(x2() ? "canceled " : "");
        sb.append(this.f43085n ? "web socket" : x9kr.f50136ch);
        sb.append(" to ");
        sb.append(m27035t());
        return sb.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    private final <E extends IOException> E m27027g(E e2) {
        Socket socketMcp;
        boolean z2 = C1359g.f7245y;
        if (z2 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        C7448g c7448g = this.f43093z;
        if (c7448g != null) {
            if (z2 && Thread.holdsLock(c7448g)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7448g);
            }
            synchronized (c7448g) {
                socketMcp = mcp();
            }
            if (this.f43093z == null) {
                if (socketMcp != null) {
                    C1359g.cdj(socketMcp);
                }
                this.f43092y.x2(this, c7448g);
            } else {
                if (!(socketMcp == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e3 = (E) gvn7(e2);
        if (e2 != null) {
            ki kiVar = this.f43092y;
            d2ok.qrj(e3);
            kiVar.mo27350n(this, e3);
        } else {
            this.f43092y.mo27352q(this);
        }
        return e3;
    }

    private final <E extends IOException> E gvn7(E e2) {
        if (this.f43091t || !this.f43090s.wvg()) {
            return e2;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e2 != null) {
            interruptedIOException.initCause(e2);
        }
        return interruptedIOException;
    }

    private final C7514k qrj(zurt zurtVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierHb;
        okhttp3.f7l8 f7l8VarNcyb;
        if (zurtVar.jp0y()) {
            SSLSocketFactory sSLSocketFactoryM27441x = this.f43083k.m27441x();
            hostnameVerifierHb = this.f43083k.hb();
            sSLSocketFactory = sSLSocketFactoryM27441x;
            f7l8VarNcyb = this.f43083k.ncyb();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierHb = null;
            f7l8VarNcyb = null;
        }
        return new C7514k(zurtVar.fti(), zurtVar.m27520r(), this.f43083k.lrht(), this.f43083k.zp(), sSLSocketFactory, hostnameVerifierHb, f7l8VarNcyb, this.f43083k.bf2(), this.f43083k.m27427b(), this.f43083k.y9n(), this.f43083k.hyr(), this.f43083k.i1());
    }

    /* JADX INFO: renamed from: y */
    private final void m27030y() {
        this.f43080h = C7498p.f43366k.f7l8().ld6("response.body().close()");
        this.f43092y.mo27346g(this);
    }

    public final void a9(@InterfaceC7395n C7448g c7448g) {
        this.f43086o = c7448g;
    }

    @Override // okhttp3.InterfaceC7519n
    public void cancel() {
        if (this.f43077e) {
            return;
        }
        this.f43077e = true;
        okhttp3.internal.connection.zy zyVar = this.f43082j;
        if (zyVar != null) {
            zyVar.toq();
        }
        C7448g c7448g = this.f43086o;
        if (c7448g != null) {
            c7448g.m27023s();
        }
        this.f43092y.f7l8(this);
    }

    @InterfaceC7396q
    public final C7529t cdj() {
        return this.f43083k;
    }

    @Override // okhttp3.InterfaceC7519n
    @InterfaceC7396q
    public fti f7l8() {
        if (!this.f43087p.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f43090s.o1t();
        m27030y();
        try {
            this.f43083k.m27428c().m26920q(this);
            return fu4();
        } finally {
            this.f43083k.m27428c().m26921s(this);
        }
    }

    public final boolean fn3e() {
        return this.f43085n;
    }

    @Override // okhttp3.InterfaceC7519n
    @InterfaceC7396q
    /* JADX INFO: renamed from: fti, reason: merged with bridge method [inline-methods] */
    public C7572p toq() {
        return this.f43090s;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    @mub.InterfaceC7396q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.fti fu4() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.t r0 = r11.f43083k
            java.util.List r0 = r0.m27433j()
            kotlin.collections.fn3e.zp(r2, r0)
            okhttp3.internal.http.p r0 = new okhttp3.internal.http.p
            okhttp3.t r1 = r11.f43083k
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.k r0 = new okhttp3.internal.http.k
            okhttp3.t r1 = r11.f43083k
            okhttp3.n7h r1 = r1.m27430f()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.k r0 = new okhttp3.internal.cache.k
            okhttp3.t r1 = r11.f43083k
            okhttp3.zy r1 = r1.m27438r()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.k r0 = okhttp3.internal.connection.C7449k.f43075k
            r2.add(r0)
            boolean r0 = r11.f43085n
            if (r0 != 0) goto L46
            okhttp3.t r0 = r11.f43083k
            java.util.List r0 = r0.m27435m()
            kotlin.collections.fn3e.zp(r2, r0)
        L46:
            okhttp3.internal.http.toq r0 = new okhttp3.internal.http.toq
            boolean r1 = r11.f43085n
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.f7l8 r9 = new okhttp3.internal.http.f7l8
            r3 = 0
            r4 = 0
            okhttp3.jk r5 = r11.f43088q
            okhttp3.t r0 = r11.f43083k
            int r6 = r0.m27434l()
            okhttp3.t r0 = r11.f43083k
            int r7 = r0.a98o()
            okhttp3.t r0 = r11.f43083k
            int r8 = r0.nmn5()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.jk r2 = r11.f43088q     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            okhttp3.fti r2 = r9.mo27071q(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.x2()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.wvg(r1)
            return r2
        L7f:
            b7.C1359g.kja0(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto L9c
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.wvg(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.d2ok.n7h(r0, r3)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L9c:
            if (r0 != 0) goto La1
            r11.wvg(r1)
        La1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C7450n.fu4():okhttp3.fti");
    }

    @Override // okhttp3.InterfaceC7519n
    /* JADX INFO: renamed from: h */
    public void mo27031h(@InterfaceC7396q InterfaceC7435g responseCallback) {
        d2ok.m23075h(responseCallback, "responseCallback");
        if (!this.f43087p.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m27030y();
        this.f43083k.m27428c().zy(new k(this, responseCallback));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final ki m27032i() {
        return this.f43092y;
    }

    public final boolean jk() {
        C7452q c7452q = this.f43081i;
        d2ok.qrj(c7452q);
        return c7452q.m27050n();
    }

    public final void jp0y() {
        if (!(!this.f43091t)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f43091t = true;
        this.f43090s.wvg();
    }

    @InterfaceC7395n
    public final C7448g ki() {
        return this.f43093z;
    }

    public final void kja0(boolean z2) {
        okhttp3.internal.connection.zy zyVar;
        synchronized (this) {
            if (!this.f43076c) {
                throw new IllegalStateException("released".toString());
            }
            was wasVar = was.f36763k;
        }
        if (z2 && (zyVar = this.f43082j) != null) {
            zyVar.m27061q();
        }
        this.f43089r = null;
    }

    @Override // okhttp3.InterfaceC7519n
    public boolean ld6() {
        return this.f43087p.get();
    }

    @InterfaceC7395n
    public final Socket mcp() {
        C7448g c7448g = this.f43093z;
        d2ok.qrj(c7448g);
        if (C1359g.f7245y && !Thread.holdsLock(c7448g)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7448g);
        }
        List<Reference<C7450n>> listT8r = c7448g.t8r();
        Iterator<Reference<C7450n>> it = listT8r.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (d2ok.f7l8(it.next().get(), this)) {
                break;
            }
            i2++;
        }
        if (!(i2 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listT8r.remove(i2);
        this.f43093z = null;
        if (listT8r.isEmpty()) {
            c7448g.jp0y(System.nanoTime());
            if (this.f43079g.zy(c7448g)) {
                return c7448g.mo27022q();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m27033n(@InterfaceC7396q C7448g connection) {
        d2ok.m23075h(connection, "connection");
        if (!C1359g.f7245y || Thread.holdsLock(connection)) {
            if (!(this.f43093z == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f43093z = connection;
            connection.t8r().add(new toq(this, this.f43080h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final void n7h(@InterfaceC7396q jk request, boolean z2) {
        d2ok.m23075h(request, "request");
        if (!(this.f43089r == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f43078f)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f43084l)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            was wasVar = was.f36763k;
        }
        if (z2) {
            this.f43081i = new C7452q(this.f43079g, qrj(request.cdj()), this, this.f43092y);
        }
    }

    @InterfaceC7396q
    public final jk ni7() {
        return this.f43088q;
    }

    public final <E extends IOException> E o1t(@InterfaceC7396q okhttp3.internal.connection.zy exchange, boolean z2, boolean z3, E e2) {
        boolean z5;
        boolean z6;
        d2ok.m23075h(exchange, "exchange");
        if (!d2ok.f7l8(exchange, this.f43082j)) {
            return e2;
        }
        synchronized (this) {
            z5 = false;
            if (z2) {
                try {
                    if (!this.f43084l) {
                        if (z3 || !this.f43078f) {
                            z6 = false;
                        }
                    }
                    if (z2) {
                        this.f43084l = false;
                    }
                    if (z3) {
                        this.f43078f = false;
                    }
                    boolean z7 = this.f43084l;
                    boolean z8 = (z7 || this.f43078f) ? false : true;
                    if (!z7 && !this.f43078f && !this.f43076c) {
                        z5 = true;
                    }
                    z6 = z5;
                    z5 = z8;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z3) {
                }
                z6 = false;
            }
            was wasVar = was.f36763k;
        }
        if (z5) {
            this.f43082j = null;
            C7448g c7448g = this.f43093z;
            if (c7448g != null) {
                c7448g.fu4();
            }
        }
        return z6 ? (E) m27027g(e2) : e2;
    }

    @Override // okhttp3.InterfaceC7519n
    @InterfaceC7396q
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C7450n mo28303clone() {
        return new C7450n(this.f43083k, this.f43088q, this.f43085n);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public final String m27035t() {
        return this.f43088q.cdj().m27510c();
    }

    @InterfaceC7395n
    public final C7448g t8r() {
        return this.f43086o;
    }

    @InterfaceC7395n
    public final IOException wvg(@InterfaceC7395n IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f43076c) {
                this.f43076c = false;
                if (!this.f43084l && !this.f43078f) {
                    z2 = true;
                }
            }
            was wasVar = was.f36763k;
        }
        return z2 ? m27027g(iOException) : iOException;
    }

    @Override // okhttp3.InterfaceC7519n
    public boolean x2() {
        return this.f43077e;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public final okhttp3.internal.connection.zy m27036z(@InterfaceC7396q okhttp3.internal.http.f7l8 chain) throws IOException {
        d2ok.m23075h(chain, "chain");
        synchronized (this) {
            if (!this.f43076c) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f43078f)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f43084l)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            was wasVar = was.f36763k;
        }
        C7452q c7452q = this.f43081i;
        d2ok.qrj(c7452q);
        okhttp3.internal.connection.zy zyVar = new okhttp3.internal.connection.zy(this, this.f43092y, c7452q, c7452q.m27049k(this.f43083k, chain));
        this.f43089r = zyVar;
        this.f43082j = zyVar;
        synchronized (this) {
            this.f43084l = true;
            this.f43078f = true;
        }
        if (this.f43077e) {
            throw new IOException("Canceled");
        }
        return zyVar;
    }

    @InterfaceC7395n
    public final okhttp3.internal.connection.zy zurt() {
        return this.f43089r;
    }

    @Override // okhttp3.InterfaceC7519n
    @InterfaceC7396q
    public jk zy() {
        return this.f43088q;
    }
}
