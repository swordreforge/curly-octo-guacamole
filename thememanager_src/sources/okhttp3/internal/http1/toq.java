package okhttp3.internal.http1;

import b7.C1359g;
import com.miui.maml.elements.MusicLyricParser;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import kotlin.text.eqxt;
import kotlin.text.fti;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.connection.C7448g;
import okhttp3.internal.http.C7459n;
import okhttp3.internal.http.C7462s;
import okhttp3.internal.http.InterfaceC7461q;
import okhttp3.internal.http.ld6;
import okhttp3.jk;
import okhttp3.zurt;
import okio.C7560j;
import okio.n7h;
import okio.nn86;
import okio.o1t;
import okio.qrj;
import okio.vyq;
import okio.x2;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class toq implements InterfaceC7461q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f93906cdj = 5;

    /* JADX INFO: renamed from: h */
    private static final int f43159h = 4;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f93907ki = 6;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f93908kja0 = 3;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final long f93909ld6 = -1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f93910n7h = 2;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final C7469q f43160p = new C7469q(null);

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f93911qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f93912x2 = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f93913f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final qrj f43161g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final n7h f43162n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C7448g f43163q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private fn3e f43164s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final C7465k f43165y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final C7529t f93914zy;

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @lv5({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class f7l8 extends AbstractC7467k {

        /* JADX INFO: renamed from: g */
        private boolean f43166g;

        public f7l8() {
            super();
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m27103k()) {
                return;
            }
            if (!this.f43166g) {
                m27104q();
            }
            m27105y(true);
        }

        @Override // okhttp3.internal.http1.toq.AbstractC7467k, okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!(!m27103k())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f43166g) {
                return -1L;
            }
            long jWx16 = super.wx16(sink, j2);
            if (jWx16 != -1) {
                return jWx16;
            }
            this.f43166g = true;
            m27104q();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http1.toq$g */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @lv5({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class C7466g implements vyq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final o1t f43168k;

        /* JADX INFO: renamed from: q */
        private boolean f43170q;

        public C7466g() {
            this.f43168k = new o1t(toq.this.f43161g.toq());
        }

        @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f43170q) {
                return;
            }
            this.f43170q = true;
            toq.this.t8r(this.f43168k);
            toq.this.f93913f7l8 = 3;
        }

        @Override // okio.vyq, java.io.Flushable
        public void flush() throws IOException {
            if (this.f43170q) {
                return;
            }
            toq.this.f43161g.flush();
        }

        @Override // okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
            d2ok.m23075h(source, "source");
            if (!(!this.f43170q)) {
                throw new IllegalStateException("closed".toString());
            }
            C1359g.n7h(source.size(), 0L, j2);
            toq.this.f43161g.mo26936j(source, j2);
        }

        @Override // okio.vyq
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43168k;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http1.toq$k */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private abstract class AbstractC7467k implements nn86 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final o1t f43171k;

        /* JADX INFO: renamed from: q */
        private boolean f43173q;

        public AbstractC7467k() {
            this.f43171k = new o1t(toq.this.f43162n.toq());
        }

        /* JADX INFO: renamed from: k */
        protected final boolean m27103k() {
            return this.f43173q;
        }

        /* JADX INFO: renamed from: q */
        public final void m27104q() {
            if (toq.this.f93913f7l8 == 6) {
                return;
            }
            if (toq.this.f93913f7l8 == 5) {
                toq.this.t8r(this.f43171k);
                toq.this.f93913f7l8 = 6;
            } else {
                throw new IllegalStateException("state: " + toq.this.f93913f7l8);
            }
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43171k;
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            try {
                return toq.this.f43162n.wx16(sink, j2);
            } catch (IOException e2) {
                toq.this.zy().a9();
                m27104q();
                throw e2;
            }
        }

        /* JADX INFO: renamed from: y */
        protected final void m27105y(boolean z2) {
            this.f43173q = z2;
        }

        @InterfaceC7396q
        protected final o1t zy() {
            return this.f43171k;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http1.toq$n */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @lv5({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class C7468n extends AbstractC7467k {

        /* JADX INFO: renamed from: g */
        private long f43174g;

        public C7468n(long j2) {
            super();
            this.f43174g = j2;
            if (j2 == 0) {
                m27104q();
            }
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m27103k()) {
                return;
            }
            if (this.f43174g != 0 && !C1359g.ni7(this, 100, TimeUnit.MILLISECONDS)) {
                toq.this.zy().a9();
                m27104q();
            }
            m27105y(true);
        }

        @Override // okhttp3.internal.http1.toq.AbstractC7467k, okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!(!m27103k())) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f43174g;
            if (j3 == 0) {
                return -1L;
            }
            long jWx16 = super.wx16(sink, Math.min(j3, j2));
            if (jWx16 == -1) {
                toq.this.zy().a9();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m27104q();
                throw protocolException;
            }
            long j4 = this.f43174g - jWx16;
            this.f43174g = j4;
            if (j4 == 0) {
                m27104q();
            }
            return jWx16;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http1.toq$q */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public static final class C7469q {
        private C7469q() {
        }

        public /* synthetic */ C7469q(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http1.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @lv5({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class C8123toq implements vyq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final o1t f43176k;

        /* JADX INFO: renamed from: q */
        private boolean f43178q;

        public C8123toq() {
            this.f43176k = new o1t(toq.this.f43161g.toq());
        }

        @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f43178q) {
                return;
            }
            this.f43178q = true;
            toq.this.f43161g.lrht("0\r\n\r\n");
            toq.this.t8r(this.f43176k);
            toq.this.f93913f7l8 = 3;
        }

        @Override // okio.vyq, java.io.Flushable
        public synchronized void flush() {
            if (this.f43178q) {
                return;
            }
            toq.this.f43161g.flush();
        }

        @Override // okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
            d2ok.m23075h(source, "source");
            if (!(!this.f43178q)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return;
            }
            toq.this.f43161g.bz2(j2);
            toq.this.f43161g.lrht(MusicLyricParser.CRLF);
            toq.this.f43161g.mo26936j(source, j2);
            toq.this.f43161g.lrht(MusicLyricParser.CRLF);
        }

        @Override // okio.vyq
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43176k;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @lv5({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class zy extends AbstractC7467k {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final zurt f43179g;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ toq f43180p;

        /* JADX INFO: renamed from: s */
        private boolean f43181s;

        /* JADX INFO: renamed from: y */
        private long f43182y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zy(@InterfaceC7396q toq toqVar, zurt url) {
            super();
            d2ok.m23075h(url, "url");
            this.f43180p = toqVar;
            this.f43179g = url;
            this.f43182y = -1L;
            this.f43181s = true;
        }

        /* JADX INFO: renamed from: p */
        private final void m27106p() throws IOException {
            if (this.f43182y != -1) {
                this.f43180p.f43162n.zp();
            }
            try {
                this.f43182y = this.f43180p.f43162n.n2t();
                String string = fti.l92(this.f43180p.f43162n.zp()).toString();
                if (this.f43182y >= 0) {
                    if (!(string.length() > 0) || a9.r6ty(string, ";", false, 2, null)) {
                        if (this.f43182y == 0) {
                            this.f43181s = false;
                            toq toqVar = this.f43180p;
                            toqVar.f43164s = toqVar.f43165y.toq();
                            C7529t c7529t = this.f43180p.f93914zy;
                            d2ok.qrj(c7529t);
                            okhttp3.n7h n7hVarM27430f = c7529t.m27430f();
                            zurt zurtVar = this.f43179g;
                            fn3e fn3eVar = this.f43180p.f43164s;
                            d2ok.qrj(fn3eVar);
                            C7459n.f7l8(n7hVarM27430f, zurtVar, fn3eVar);
                            m27104q();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f43182y + string + eqxt.f81913toq);
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m27103k()) {
                return;
            }
            if (this.f43181s && !C1359g.ni7(this, 100, TimeUnit.MILLISECONDS)) {
                this.f43180p.zy().a9();
                m27104q();
            }
            m27105y(true);
        }

        @Override // okhttp3.internal.http1.toq.AbstractC7467k, okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!(!m27103k())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f43181s) {
                return -1L;
            }
            long j3 = this.f43182y;
            if (j3 == 0 || j3 == -1) {
                m27106p();
                if (!this.f43181s) {
                    return -1L;
                }
            }
            long jWx16 = super.wx16(sink, Math.min(j2, this.f43182y));
            if (jWx16 != -1) {
                this.f43182y -= jWx16;
                return jWx16;
            }
            this.f43180p.zy().a9();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m27104q();
            throw protocolException;
        }
    }

    public toq(@InterfaceC7395n C7529t c7529t, @InterfaceC7396q C7448g connection, @InterfaceC7396q n7h source, @InterfaceC7396q qrj sink) {
        d2ok.m23075h(connection, "connection");
        d2ok.m23075h(source, "source");
        d2ok.m23075h(sink, "sink");
        this.f93914zy = c7529t;
        this.f43163q = connection;
        this.f43162n = source;
        this.f43161g = sink;
        this.f43165y = new C7465k(source);
    }

    private final boolean fn3e(okhttp3.fti ftiVar) {
        return a9.e5("chunked", okhttp3.fti.g1(ftiVar, com.google.common.net.zy.f27247d, null, 2, null), true);
    }

    private final nn86 fu4(zurt zurtVar) {
        if (this.f93913f7l8 == 4) {
            this.f93913f7l8 = 5;
            return new zy(this, zurtVar);
        }
        throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
    }

    /* JADX INFO: renamed from: i */
    private final boolean m27099i(jk jkVar) {
        return a9.e5("chunked", jkVar.m27311s(com.google.common.net.zy.f27247d), true);
    }

    private final vyq ni7() {
        if (this.f93913f7l8 == 1) {
            this.f93913f7l8 = 2;
            return new C8123toq();
        }
        throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
    }

    private final vyq o1t() {
        if (this.f93913f7l8 == 1) {
            this.f93913f7l8 = 2;
            return new C7466g();
        }
        throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t8r(o1t o1tVar) {
        C7560j c7560jQrj = o1tVar.qrj();
        o1tVar.n7h(C7560j.f43770n);
        c7560jQrj.toq();
        c7560jQrj.zy();
    }

    private final nn86 wvg() {
        if (this.f93913f7l8 == 4) {
            this.f93913f7l8 = 5;
            zy().a9();
            return new f7l8();
        }
        throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
    }

    /* JADX INFO: renamed from: z */
    private final nn86 m27101z(long j2) {
        if (this.f93913f7l8 == 4) {
            this.f93913f7l8 = 5;
            return new C7468n(j2);
        }
        throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    public void cancel() {
        zy().m27023s();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7395n
    public fti.C7433k f7l8(boolean z2) {
        int i2 = this.f93913f7l8;
        boolean z3 = false;
        if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
            throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
        }
        try {
            ld6 qVar = ld6.f43141q.toq(this.f43165y.zy());
            fti.C7433k c7433kNi7 = new fti.C7433k().m26898t(qVar.f43143k).f7l8(qVar.f93897toq).m26900z(qVar.f93898zy).ni7(this.f43165y.toq());
            if (z2 && qVar.f93897toq == 100) {
                return null;
            }
            int i3 = qVar.f93897toq;
            if (i3 == 100) {
                this.f93913f7l8 = 3;
                return c7433kNi7;
            }
            if (102 <= i3 && i3 < 200) {
                z3 = true;
            }
            if (z3) {
                this.f93913f7l8 = 3;
                return c7433kNi7;
            }
            this.f93913f7l8 = 4;
            return c7433kNi7;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on " + zy().toq().m26913q().ni7().m27510c(), e2);
        }
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: g */
    public void mo27087g(@InterfaceC7396q jk request) {
        d2ok.m23075h(request, "request");
        C7462s c7462s = C7462s.f43150k;
        Proxy.Type type = zy().toq().m26912n().type();
        d2ok.kja0(type, "connection.route().proxy.type()");
        mcp(request.ld6(), c7462s.m27093k(request, type));
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: k */
    public void mo27088k() {
        this.f43161g.flush();
    }

    public final void mcp(@InterfaceC7396q fn3e headers, @InterfaceC7396q String requestLine) {
        d2ok.m23075h(headers, "headers");
        d2ok.m23075h(requestLine, "requestLine");
        if (!(this.f93913f7l8 == 0)) {
            throw new IllegalStateException(("state: " + this.f93913f7l8).toString());
        }
        this.f43161g.lrht(requestLine).lrht(MusicLyricParser.CRLF);
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f43161g.lrht(headers.m26864y(i2)).lrht(": ").lrht(headers.n7h(i2)).lrht(MusicLyricParser.CRLF);
        }
        this.f43161g.lrht(MusicLyricParser.CRLF);
        this.f93913f7l8 = 1;
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27089n(@InterfaceC7396q jk request, long j2) throws ProtocolException {
        d2ok.m23075h(request, "request");
        if (request.m27305g() != null && request.m27305g().m26832h()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m27099i(request)) {
            return ni7();
        }
        if (j2 != -1) {
            return o1t();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: q */
    public long mo27090q(@InterfaceC7396q okhttp3.fti response) {
        d2ok.m23075h(response, "response");
        if (!C7459n.zy(response)) {
            return 0L;
        }
        if (fn3e(response)) {
            return -1L;
        }
        return C1359g.wvg(response);
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public fn3e mo27091s() {
        if (!(this.f93913f7l8 == 6)) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        fn3e fn3eVar = this.f43164s;
        return fn3eVar == null ? C1359g.f53992toq : fn3eVar;
    }

    /* JADX INFO: renamed from: t */
    public final void m27102t(@InterfaceC7396q okhttp3.fti response) {
        d2ok.m23075h(response, "response");
        long jWvg = C1359g.wvg(response);
        if (jWvg == -1) {
            return;
        }
        nn86 nn86VarM27101z = m27101z(jWvg);
        C1359g.uv6(nn86VarM27101z, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        nn86VarM27101z.close();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    public nn86 toq(@InterfaceC7396q okhttp3.fti response) {
        d2ok.m23075h(response, "response");
        if (!C7459n.zy(response)) {
            return m27101z(0L);
        }
        if (fn3e(response)) {
            return fu4(response.wlev().cdj());
        }
        long jWvg = C1359g.wvg(response);
        return jWvg != -1 ? m27101z(jWvg) : wvg();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: y */
    public void mo27092y() throws IOException {
        this.f43161g.flush();
    }

    public final boolean zurt() {
        return this.f93913f7l8 == 6;
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    public C7448g zy() {
        return this.f43163q;
    }
}
