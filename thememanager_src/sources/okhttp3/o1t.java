package okhttp3;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.elements.MusicLyricParser;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.http1.C7465k;
import okio.C7560j;
import okio.dd;
import okio.kja0;
import okio.nn86;

/* JADX INFO: compiled from: MultipartReader.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class o1t implements Closeable {

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    public static final C7523k f43501i = new C7523k(null);

    /* JADX INFO: renamed from: z */
    @InterfaceC7396q
    private static final dd f43502z;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final okio.kja0 f43503g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private zy f43504h;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final okio.n7h f43505k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final okio.kja0 f43506n;

    /* JADX INFO: renamed from: p */
    private boolean f43507p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final String f43508q;

    /* JADX INFO: renamed from: s */
    private boolean f43509s;

    /* JADX INFO: renamed from: y */
    private int f43510y;

    /* JADX INFO: renamed from: okhttp3.o1t$k */
    /* JADX INFO: compiled from: MultipartReader.kt */
    public static final class C7523k {
        private C7523k() {
        }

        public /* synthetic */ C7523k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final dd m27375k() {
            return o1t.f43502z;
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    public static final class toq implements Closeable {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final fn3e f43511k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final okio.n7h f43512q;

        public toq(@InterfaceC7396q fn3e headers, @InterfaceC7396q okio.n7h body) {
            d2ok.m23075h(headers, "headers");
            d2ok.m23075h(body, "body");
            this.f43511k = headers;
            this.f43512q = body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f43512q.close();
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = C3678q.f22041h)
        /* JADX INFO: renamed from: k */
        public final okio.n7h m27376k() {
            return this.f43512q;
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "headers")
        public final fn3e zy() {
            return this.f43511k;
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @lv5({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    private final class zy implements nn86 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7560j f43513k = new C7560j();

        public zy() {
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d2ok.f7l8(o1t.this.f43504h, this)) {
                o1t.this.f43504h = null;
            }
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43513k;
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q okio.x2 sink, long j2) {
            d2ok.m23075h(sink, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!d2ok.f7l8(o1t.this.f43504h, this)) {
                throw new IllegalStateException("closed".toString());
            }
            C7560j qVar = o1t.this.f43505k.toq();
            C7560j c7560j = this.f43513k;
            o1t o1tVar = o1t.this;
            long jLd6 = qVar.ld6();
            long jM27762k = C7560j.f43771q.m27762k(c7560j.ld6(), qVar.ld6());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            qVar.mo27758p(jM27762k, timeUnit);
            if (!qVar.f7l8()) {
                if (c7560j.f7l8()) {
                    qVar.mo27755g(c7560j.mo27757n());
                }
                try {
                    long jX2 = o1tVar.x2(j2);
                    long jWx16 = jX2 == 0 ? -1L : o1tVar.f43505k.wx16(sink, jX2);
                    qVar.mo27758p(jLd6, timeUnit);
                    if (c7560j.f7l8()) {
                        qVar.toq();
                    }
                    return jWx16;
                } catch (Throwable th) {
                    qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                    if (c7560j.f7l8()) {
                        qVar.toq();
                    }
                    throw th;
                }
            }
            long jMo27757n = qVar.mo27757n();
            if (c7560j.f7l8()) {
                qVar.mo27755g(Math.min(qVar.mo27757n(), c7560j.mo27757n()));
            }
            try {
                long jX22 = o1tVar.x2(j2);
                long jWx162 = jX22 == 0 ? -1L : o1tVar.f43505k.wx16(sink, jX22);
                qVar.mo27758p(jLd6, timeUnit);
                if (c7560j.f7l8()) {
                    qVar.mo27755g(jMo27757n);
                }
                return jWx162;
            } catch (Throwable th2) {
                qVar.mo27758p(jLd6, TimeUnit.NANOSECONDS);
                if (c7560j.f7l8()) {
                    qVar.mo27755g(jMo27757n);
                }
                throw th2;
            }
        }
    }

    static {
        dd.C7542k c7542k = dd.f43697n;
        kja0.C7563k c7563k = okio.kja0.Companion;
        f43502z = c7542k.m27604q(c7563k.x2(MusicLyricParser.CRLF), c7563k.x2("--"), c7563k.x2(" "), c7563k.x2("\t"));
    }

    public o1t(@InterfaceC7396q okio.n7h source, @InterfaceC7396q String boundary) throws IOException {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(boundary, "boundary");
        this.f43505k = source;
        this.f43508q = boundary;
        this.f43506n = new okio.x2().lrht("--").lrht(boundary).uj2j();
        this.f43503g = new okio.x2().lrht("\r\n--").lrht(boundary).uj2j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x2(long j2) throws IOException {
        this.f43505k.dr(this.f43503g.size());
        long jJk = this.f43505k.mo27611g().jk(this.f43503g);
        return jJk == -1 ? Math.min(j2, (this.f43505k.mo27611g().size() - ((long) this.f43503g.size())) + 1) : Math.min(j2, jJk);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f43509s) {
            return;
        }
        this.f43509s = true;
        this.f43504h = null;
        this.f43505k.close();
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    public final toq m27374h() throws IOException {
        if (!(!this.f43509s)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f43507p) {
            return null;
        }
        if (this.f43510y == 0 && this.f43505k.vyq(0L, this.f43506n)) {
            this.f43505k.skip(this.f43506n.size());
        } else {
            while (true) {
                long jX2 = x2(8192L);
                if (jX2 == 0) {
                    break;
                }
                this.f43505k.skip(jX2);
            }
            this.f43505k.skip(this.f43503g.size());
        }
        boolean z2 = false;
        while (true) {
            int iLh = this.f43505k.lh(f43502z);
            if (iLh == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iLh == 0) {
                this.f43510y++;
                fn3e qVar = new C7465k(this.f43505k).toq();
                zy zyVar = new zy();
                this.f43504h = zyVar;
                return new toq(qVar, okio.d2ok.m27592n(zyVar));
            }
            if (iLh == 1) {
                if (z2) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f43510y == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.f43507p = true;
                return null;
            }
            if (iLh == 2 || iLh == 3) {
                z2 = true;
            }
        }
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "boundary")
    public final String ld6() {
        return this.f43508q;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o1t(@InterfaceC7396q jp0y response) throws IOException {
        String strM26907s;
        d2ok.m23075h(response, "response");
        okio.n7h n7hVarY9n = response.y9n();
        fu4 fu4VarMo27094h = response.mo27094h();
        if (fu4VarMo27094h != null && (strM26907s = fu4VarMo27094h.m26907s("boundary")) != null) {
            this(n7hVarY9n, strM26907s);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
