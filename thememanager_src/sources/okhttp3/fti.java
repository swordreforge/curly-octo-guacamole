package okhttp3;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.xiaomi.onetrack.api.C5693g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okhttp3.internal.http.C7459n;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class fti implements Closeable {

    /* JADX INFO: renamed from: f */
    @InterfaceC7395n
    private C7526q f42930f;

    /* JADX INFO: renamed from: g */
    private final int f42931g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private final fti f42932h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7395n
    private final fti f42933i;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final jk f42934k;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private final okhttp3.internal.connection.zy f42935l;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final String f42936n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private final jp0y f42937p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final mcp f42938q;

    /* JADX INFO: renamed from: r */
    private final long f42939r;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final fn3e f42940s;

    /* JADX INFO: renamed from: t */
    private final long f42941t;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private final C7437i f42942y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private final fti f42943z;

    public fti(@InterfaceC7396q jk request, @InterfaceC7396q mcp protocol, @InterfaceC7396q String message, int i2, @InterfaceC7395n C7437i c7437i, @InterfaceC7396q fn3e headers, @InterfaceC7395n jp0y jp0yVar, @InterfaceC7395n fti ftiVar, @InterfaceC7395n fti ftiVar2, @InterfaceC7395n fti ftiVar3, long j2, long j3, @InterfaceC7395n okhttp3.internal.connection.zy zyVar) {
        d2ok.m23075h(request, "request");
        d2ok.m23075h(protocol, "protocol");
        d2ok.m23075h(message, "message");
        d2ok.m23075h(headers, "headers");
        this.f42934k = request;
        this.f42938q = protocol;
        this.f42936n = message;
        this.f42931g = i2;
        this.f42942y = c7437i;
        this.f42940s = headers;
        this.f42937p = jp0yVar;
        this.f42932h = ftiVar;
        this.f42933i = ftiVar2;
        this.f42943z = ftiVar3;
        this.f42941t = j2;
        this.f42939r = j3;
        this.f42935l = zyVar;
    }

    public static /* synthetic */ String g1(fti ftiVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return ftiVar.t8iq(str, str2);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "exchange")
    public final okhttp3.internal.connection.zy a98o() {
        return this.f42935l;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "protocol")
    public final mcp bap7() {
        return this.f42938q;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "message")
    public final String bek6() {
        return this.f42936n;
    }

    public final boolean bwp() {
        int i2 = this.f42931g;
        if (i2 != 307 && i2 != 308) {
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jp0y jp0yVar = this.f42937p;
        if (jp0yVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        jp0yVar.close();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "sentRequestAtMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_sentRequestAtMillis")
    public final long d2ok() {
        return this.f42941t;
    }

    @InterfaceC7396q
    public final fn3e e5() throws IOException {
        okhttp3.internal.connection.zy zyVar = this.f42935l;
        if (zyVar != null) {
            return zyVar.zurt();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "cacheControl")
    /* JADX INFO: renamed from: f */
    public final C7526q m26879f() {
        C7526q c7526q = this.f42930f;
        if (c7526q != null) {
            return c7526q;
        }
        C7526q c7526qZy = C7526q.f94070n7h.zy(this.f42940s);
        this.f42930f = c7526qZy;
        return c7526qZy;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "protocol", imports = {}))
    @InterfaceC6769y(name = "-deprecated_protocol")
    public final mcp fu4() {
        return this.f42938q;
    }

    @InterfaceC6769y(name = "sentRequestAtMillis")
    public final long ga() {
        return this.f42941t;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "networkResponse", imports = {}))
    @InterfaceC6769y(name = "-deprecated_networkResponse")
    /* JADX INFO: renamed from: h */
    public final fti m26880h() {
        return this.f42932h;
    }

    @InterfaceC6769y(name = "receivedResponseAtMillis")
    public final long h4b() {
        return this.f42939r;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "networkResponse")
    public final fti h7am() {
        return this.f42932h;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = C3678q.f22041h)
    public final jp0y hyr() {
        return this.f42937p;
    }

    @InterfaceC6769y(name = "code")
    public final int i1() {
        return this.f42931g;
    }

    @InterfaceC7396q
    public final C7433k ij() {
        return new C7433k(this);
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C3678q.f22041h, imports = {}))
    @InterfaceC6769y(name = "-deprecated_body")
    /* JADX INFO: renamed from: k */
    public final jp0y m26881k() {
        return this.f42937p;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "priorResponse", imports = {}))
    @InterfaceC6769y(name = "-deprecated_priorResponse")
    public final fti ki() {
        return this.f42943z;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "headers", imports = {}))
    @InterfaceC6769y(name = "-deprecated_headers")
    public final fn3e ld6() {
        return this.f42940s;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "headers")
    public final fn3e ltg8() {
        return this.f42940s;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "priorResponse")
    public final fti ngy() {
        return this.f42943z;
    }

    @InterfaceC6768s
    @InterfaceC7395n
    public final String nmn5(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        return g1(this, name, null, 2, null);
    }

    @InterfaceC7396q
    public final jp0y nsb(long j2) throws IOException {
        jp0y jp0yVar = this.f42937p;
        d2ok.qrj(jp0yVar);
        okio.n7h n7hVarPeek = jp0yVar.y9n().peek();
        okio.x2 x2Var = new okio.x2();
        n7hVarPeek.bf2(j2);
        x2Var.ktq(n7hVarPeek, Math.min(j2, n7hVarPeek.mo27611g().size()));
        return jp0y.f43469q.m27332g(x2Var, this.f42937p.mo27094h(), x2Var.size());
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C5693g.f31776R, imports = {}))
    @InterfaceC6769y(name = "-deprecated_handshake")
    /* JADX INFO: renamed from: p */
    public final C7437i m26882p() {
        return this.f42942y;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cacheResponse", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cacheResponse")
    /* JADX INFO: renamed from: q */
    public final fti m26883q() {
        return this.f42933i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m26884s() {
        int i2 = this.f42931g;
        return 200 <= i2 && i2 < 300;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "request", imports = {}))
    @InterfaceC6769y(name = "-deprecated_request")
    /* JADX INFO: renamed from: t */
    public final jk m26885t() {
        return this.f42934k;
    }

    @InterfaceC6768s
    @InterfaceC7395n
    public final String t8iq(@InterfaceC7396q String name, @InterfaceC7395n String str) {
        d2ok.m23075h(name, "name");
        String strZy = this.f42940s.zy(name);
        return strZy == null ? str : strZy;
    }

    @InterfaceC7396q
    public String toString() {
        return "Response{protocol=" + this.f42938q + ", code=" + this.f42931g + ", message=" + this.f42936n + ", url=" + this.f42934k.cdj() + '}';
    }

    @InterfaceC7396q
    public final List<String> was(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        return this.f42940s.kja0(name);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "request")
    public final jk wlev() {
        return this.f42934k;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "receivedResponseAtMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_receivedResponseAtMillis")
    public final long wvg() {
        return this.f42939r;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = C5693g.f31776R)
    /* JADX INFO: renamed from: x */
    public final C7437i m26886x() {
        return this.f42942y;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "message", imports = {}))
    @InterfaceC6769y(name = "-deprecated_message")
    public final String x2() {
        return this.f42936n;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "code", imports = {}))
    @InterfaceC6769y(name = "-deprecated_code")
    /* JADX INFO: renamed from: y */
    public final int m26887y() {
        return this.f42931g;
    }

    @InterfaceC7396q
    public final List<C7533y> y9n() {
        String str;
        fn3e fn3eVar = this.f42940s;
        int i2 = this.f42931g;
        if (i2 == 401) {
            str = com.google.common.net.zy.f68554vq;
        } else {
            if (i2 != 407) {
                return kotlin.collections.ni7.a9();
            }
            str = com.google.common.net.zy.f68496ch;
        }
        return C7459n.toq(fn3eVar, str);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "cacheResponse")
    public final fti yz() {
        return this.f42933i;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cacheControl", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cacheControl")
    public final C7526q zy() {
        return m26879f();
    }

    /* JADX INFO: renamed from: okhttp3.fti$k */
    /* JADX INFO: compiled from: Response.kt */
    @lv5({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class C7433k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7395n
        private jp0y f93821f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private fn3e.C7432k f42944g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private jk f42945k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private long f93822ld6;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private C7437i f42946n;

        /* JADX INFO: renamed from: p */
        @InterfaceC7395n
        private fti f42947p;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private String f42948q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        @InterfaceC7395n
        private okhttp3.internal.connection.zy f93823qrj;

        /* JADX INFO: renamed from: s */
        @InterfaceC7395n
        private fti f42949s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private mcp f93824toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private long f93825x2;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private fti f42950y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f93826zy;

        public C7433k() {
            this.f93826zy = -1;
            this.f42944g = new fn3e.C7432k();
        }

        /* JADX INFO: renamed from: g */
        private final void m26888g(String str, fti ftiVar) {
            if (ftiVar != null) {
                if (!(ftiVar.hyr() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(ftiVar.h7am() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(ftiVar.yz() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (ftiVar.ngy() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* JADX INFO: renamed from: n */
        private final void m26889n(fti ftiVar) {
            if (ftiVar != null) {
                if (!(ftiVar.hyr() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        @InterfaceC7396q
        public C7433k a9(@InterfaceC7396q jk request) {
            d2ok.m23075h(request, "request");
            this.f42945k = request;
            return this;
        }

        @InterfaceC7395n
        public final mcp cdj() {
            return this.f93824toq;
        }

        public final void d2ok(@InterfaceC7396q fn3e.C7432k c7432k) {
            d2ok.m23075h(c7432k, "<set-?>");
            this.f42944g = c7432k;
        }

        public final void d3(int i2) {
            this.f93826zy = i2;
        }

        public final void dd(@InterfaceC7395n fti ftiVar) {
            this.f42947p = ftiVar;
        }

        public final void eqxt(@InterfaceC7395n C7437i c7437i) {
            this.f42946n = c7437i;
        }

        @InterfaceC7396q
        public C7433k f7l8(int i2) {
            this.f93826zy = i2;
            return this;
        }

        @InterfaceC7396q
        public C7433k fn3e(@InterfaceC7395n C7437i c7437i) {
            this.f42946n = c7437i;
            return this;
        }

        @InterfaceC7396q
        public C7433k fti(long j2) {
            this.f93822ld6 = j2;
            return this;
        }

        public final void fu4(@InterfaceC7396q okhttp3.internal.connection.zy deferredTrailers) {
            d2ok.m23075h(deferredTrailers, "deferredTrailers");
            this.f93823qrj = deferredTrailers;
        }

        public final void gvn7(@InterfaceC7395n fti ftiVar) {
            this.f42949s = ftiVar;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: h */
        public final fti m26890h() {
            return this.f42947p;
        }

        /* JADX INFO: renamed from: i */
        public final long m26891i() {
            return this.f93822ld6;
        }

        @InterfaceC7396q
        public C7433k jk(@InterfaceC7396q String name) {
            d2ok.m23075h(name, "name");
            this.f42944g.x2(name);
            return this;
        }

        public final void jp0y(@InterfaceC7395n jp0y jp0yVar) {
            this.f93821f7l8 = jp0yVar;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public C7433k m26892k(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            this.f42944g.toq(name, value);
            return this;
        }

        public final long ki() {
            return this.f93825x2;
        }

        @InterfaceC7395n
        public final fti kja0() {
            return this.f42950y;
        }

        /* JADX INFO: renamed from: l */
        public final void m26893l(@InterfaceC7395n jk jkVar) {
            this.f42945k = jkVar;
        }

        @InterfaceC7395n
        public final okhttp3.internal.connection.zy ld6() {
            return this.f93823qrj;
        }

        public final void lvui(@InterfaceC7395n String str) {
            this.f42948q = str;
        }

        @InterfaceC7396q
        public C7433k mcp(long j2) {
            this.f93825x2 = j2;
            return this;
        }

        public final void n5r1(long j2) {
            this.f93822ld6 = j2;
        }

        @InterfaceC7395n
        public final String n7h() {
            return this.f42948q;
        }

        public final void ncyb(long j2) {
            this.f93825x2 = j2;
        }

        @InterfaceC7396q
        public C7433k ni7(@InterfaceC7396q fn3e headers) {
            d2ok.m23075h(headers, "headers");
            this.f42944g = headers.m26862p();
            return this;
        }

        @InterfaceC7396q
        public C7433k o1t(@InterfaceC7395n fti ftiVar) {
            m26888g("networkResponse", ftiVar);
            this.f42950y = ftiVar;
            return this;
        }

        public final void oc(@InterfaceC7395n okhttp3.internal.connection.zy zyVar) {
            this.f93823qrj = zyVar;
        }

        /* JADX INFO: renamed from: p */
        public final int m26894p() {
            return this.f93826zy;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public C7433k m26895q(@InterfaceC7395n fti ftiVar) {
            m26888g("cacheResponse", ftiVar);
            this.f42949s = ftiVar;
            return this;
        }

        @InterfaceC7396q
        public final fn3e.C7432k qrj() {
            return this.f42944g;
        }

        /* JADX INFO: renamed from: r */
        public final void m26896r(@InterfaceC7395n fti ftiVar) {
            this.f42950y = ftiVar;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: s */
        public final fti m26897s() {
            return this.f42949s;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: t */
        public C7433k m26898t(@InterfaceC7396q mcp protocol) {
            d2ok.m23075h(protocol, "protocol");
            this.f93824toq = protocol;
            return this;
        }

        @InterfaceC7395n
        public final jk t8r() {
            return this.f42945k;
        }

        @InterfaceC7396q
        public C7433k toq(@InterfaceC7395n jp0y jp0yVar) {
            this.f93821f7l8 = jp0yVar;
            return this;
        }

        @InterfaceC7396q
        public C7433k wvg(@InterfaceC7395n fti ftiVar) {
            m26889n(ftiVar);
            this.f42947p = ftiVar;
            return this;
        }

        @InterfaceC7395n
        public final C7437i x2() {
            return this.f42946n;
        }

        public final void x9kr(@InterfaceC7395n mcp mcpVar) {
            this.f93824toq = mcpVar;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public final jp0y m26899y() {
            return this.f93821f7l8;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: z */
        public C7433k m26900z(@InterfaceC7396q String message) {
            d2ok.m23075h(message, "message");
            this.f42948q = message;
            return this;
        }

        @InterfaceC7396q
        public C7433k zurt(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            this.f42944g.qrj(name, value);
            return this;
        }

        @InterfaceC7396q
        public fti zy() {
            int i2 = this.f93826zy;
            if (!(i2 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f93826zy).toString());
            }
            jk jkVar = this.f42945k;
            if (jkVar == null) {
                throw new IllegalStateException("request == null".toString());
            }
            mcp mcpVar = this.f93824toq;
            if (mcpVar == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f42948q;
            if (str != null) {
                return new fti(jkVar, mcpVar, str, i2, this.f42946n, this.f42944g.m26870s(), this.f93821f7l8, this.f42950y, this.f42949s, this.f42947p, this.f93822ld6, this.f93825x2, this.f93823qrj);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public C7433k(@InterfaceC7396q fti response) {
            d2ok.m23075h(response, "response");
            this.f93826zy = -1;
            this.f42945k = response.wlev();
            this.f93824toq = response.bap7();
            this.f93826zy = response.i1();
            this.f42948q = response.bek6();
            this.f42946n = response.m26886x();
            this.f42944g = response.ltg8().m26862p();
            this.f93821f7l8 = response.hyr();
            this.f42950y = response.h7am();
            this.f42949s = response.yz();
            this.f42947p = response.ngy();
            this.f93822ld6 = response.ga();
            this.f93825x2 = response.h4b();
            this.f93823qrj = response.a98o();
        }
    }
}
