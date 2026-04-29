package okhttp3;

import b7.C1359g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class jp0y implements Closeable {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final toq f43469q = new toq(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private Reader f43470k;

    /* JADX INFO: renamed from: okhttp3.jp0y$k */
    /* JADX INFO: compiled from: ResponseBody.kt */
    @lv5({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class C7512k extends Reader {

        /* JADX INFO: renamed from: g */
        @InterfaceC7395n
        private Reader f43471g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final okio.n7h f43472k;

        /* JADX INFO: renamed from: n */
        private boolean f43473n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final Charset f43474q;

        public C7512k(@InterfaceC7396q okio.n7h source, @InterfaceC7396q Charset charset) {
            d2ok.m23075h(source, "source");
            d2ok.m23075h(charset, "charset");
            this.f43472k = source;
            this.f43474q = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            was wasVar;
            this.f43473n = true;
            Reader reader = this.f43471g;
            if (reader != null) {
                reader.close();
                wasVar = was.f36763k;
            } else {
                wasVar = null;
            }
            if (wasVar == null) {
                this.f43472k.close();
            }
        }

        @Override // java.io.Reader
        public int read(@InterfaceC7396q char[] cbuf, int i2, int i3) throws IOException {
            d2ok.m23075h(cbuf, "cbuf");
            if (this.f43473n) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f43471g;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f43472k.pjz9(), C1359g.hyr(this.f43472k, this.f43474q));
                this.f43471g = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i2, i3);
        }
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class toq {

        /* JADX INFO: renamed from: okhttp3.jp0y$toq$k */
        /* JADX INFO: compiled from: ResponseBody.kt */
        public static final class C7513k extends jp0y {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ long f43475g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ fu4 f43476n;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ okio.n7h f43477y;

            C7513k(fu4 fu4Var, long j2, okio.n7h n7hVar) {
                this.f43476n = fu4Var;
                this.f43475g = j2;
                this.f43477y = n7hVar;
            }

            @Override // okhttp3.jp0y
            @InterfaceC7395n
            /* JADX INFO: renamed from: h */
            public fu4 mo27094h() {
                return this.f43476n;
            }

            @Override // okhttp3.jp0y
            public long x2() {
                return this.f43475g;
            }

            @Override // okhttp3.jp0y
            @InterfaceC7396q
            public okio.n7h y9n() {
                return this.f43477y;
            }
        }

        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ jp0y ld6(toq toqVar, okio.kja0 kja0Var, fu4 fu4Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            return toqVar.f7l8(kja0Var, fu4Var);
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ jp0y m27330p(toq toqVar, okio.n7h n7hVar, fu4 fu4Var, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            if ((i2 & 2) != 0) {
                j2 = -1;
            }
            return toqVar.m27332g(n7hVar, fu4Var, j2);
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ jp0y m27331s(toq toqVar, String str, fu4 fu4Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            return toqVar.m27333k(str, fu4Var);
        }

        public static /* synthetic */ jp0y x2(toq toqVar, byte[] bArr, fu4 fu4Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            return toqVar.m27336y(bArr, fu4Var);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        public final jp0y f7l8(@InterfaceC7396q okio.kja0 kja0Var, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(kja0Var, "<this>");
            return m27332g(new okio.x2().uc(kja0Var), fu4Var, kja0Var.size());
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        /* JADX INFO: renamed from: g */
        public final jp0y m27332g(@InterfaceC7396q okio.n7h n7hVar, @InterfaceC7395n fu4 fu4Var, long j2) {
            d2ok.m23075h(n7hVar, "<this>");
            return new C7513k(fu4Var, j2, n7hVar);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final jp0y m27333k(@InterfaceC7396q String str, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(str, "<this>");
            Charset charset = C6433g.f81921toq;
            if (fu4Var != null) {
                Charset charsetF7l8 = fu4.f7l8(fu4Var, null, 1, null);
                if (charsetF7l8 == null) {
                    fu4Var = fu4.f42952n.m26909q(fu4Var + "; charset=utf-8");
                } else {
                    charset = charsetF7l8;
                }
            }
            okio.x2 x2VarJz5 = new okio.x2().jz5(str, charset);
            return m27332g(x2VarJz5, fu4Var, x2VarJz5.size());
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final jp0y m27334n(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] content) {
            d2ok.m23075h(content, "content");
            return m27336y(content, fu4Var);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final jp0y m27335q(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q okio.kja0 content) {
            d2ok.m23075h(content, "content");
            return f7l8(content, fu4Var);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @l05.qrj
        public final jp0y toq(@InterfaceC7395n fu4 fu4Var, long j2, @InterfaceC7396q okio.n7h content) {
            d2ok.m23075h(content, "content");
            return m27332g(content, fu4Var, j2);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        /* JADX INFO: renamed from: y */
        public final jp0y m27336y(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(bArr, "<this>");
            return m27332g(new okio.x2().write(bArr), fu4Var, bArr.length);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @l05.qrj
        public final jp0y zy(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q String content) {
            d2ok.m23075h(content, "content");
            return m27333k(content, fu4Var);
        }
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @l05.qrj
    public static final jp0y d2ok(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] bArr) {
        return f43469q.m27334n(fu4Var, bArr);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    /* JADX INFO: renamed from: f */
    public static final jp0y m27324f(@InterfaceC7396q okio.kja0 kja0Var, @InterfaceC7395n fu4 fu4Var) {
        return f43469q.f7l8(kja0Var, fu4Var);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @l05.qrj
    public static final jp0y fu4(@InterfaceC7395n fu4 fu4Var, long j2, @InterfaceC7396q okio.n7h n7hVar) {
        return f43469q.toq(fu4Var, j2, n7hVar);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    public static final jp0y hyr(@InterfaceC7396q okio.n7h n7hVar, @InterfaceC7395n fu4 fu4Var, long j2) {
        return f43469q.m27332g(n7hVar, fu4Var, j2);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    public static final jp0y ki(@InterfaceC7396q String str, @InterfaceC7395n fu4 fu4Var) {
        return f43469q.m27333k(str, fu4Var);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T ld6(cyoe.x2<? super okio.n7h, ? extends T> x2Var, cyoe.x2<? super T, Integer> x2Var2) throws IOException {
        long jX2 = x2();
        if (jX2 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jX2);
        }
        okio.n7h n7hVarY9n = y9n();
        try {
            T tInvoke = x2Var.invoke(n7hVarY9n);
            kotlin.jvm.internal.d3.m23090q(1);
            kotlin.io.zy.m23032k(n7hVarY9n, null);
            kotlin.jvm.internal.d3.zy(1);
            int iIntValue = x2Var2.invoke(tInvoke).intValue();
            if (jX2 == -1 || jX2 == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jX2 + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    /* JADX INFO: renamed from: p */
    private final Charset m27325p() {
        Charset charsetM26904g;
        fu4 fu4VarMo27094h = mo27094h();
        return (fu4VarMo27094h == null || (charsetM26904g = fu4VarMo27094h.m26904g(C6433g.f81921toq)) == null) ? C6433g.f81921toq : charsetM26904g;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @l05.qrj
    /* JADX INFO: renamed from: t */
    public static final jp0y m27326t(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q okio.kja0 kja0Var) {
        return f43469q.m27335q(fu4Var, kja0Var);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @l05.qrj
    public static final jp0y wvg(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q String str) {
        return f43469q.zy(fu4Var, str);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    public static final jp0y yz(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var) {
        return f43469q.m27336y(bArr, fu4Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1359g.kja0(y9n());
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    public abstract fu4 mo27094h();

    @InterfaceC7396q
    public final String i1() throws IOException {
        okio.n7h n7hVarY9n = y9n();
        try {
            String strSe = n7hVarY9n.se(C1359g.hyr(n7hVarY9n, m27325p()));
            kotlin.io.zy.m23032k(n7hVarY9n, null);
            return strSe;
        } finally {
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final InputStream m27327k() {
        return y9n().pjz9();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final byte[] m27328q() throws IOException {
        long jX2 = x2();
        if (jX2 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jX2);
        }
        okio.n7h n7hVarY9n = y9n();
        try {
            byte[] bArrGbni = n7hVarY9n.gbni();
            kotlin.io.zy.m23032k(n7hVarY9n, null);
            int length = bArrGbni.length;
            if (jX2 == -1 || jX2 == length) {
                return bArrGbni;
            }
            throw new IOException("Content-Length (" + jX2 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public abstract long x2();

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final Reader m27329y() {
        Reader reader = this.f43470k;
        if (reader != null) {
            return reader;
        }
        C7512k c7512k = new C7512k(y9n(), m27325p());
        this.f43470k = c7512k;
        return c7512k;
    }

    @InterfaceC7396q
    public abstract okio.n7h y9n();

    @InterfaceC7396q
    public final okio.kja0 zy() throws IOException {
        long jX2 = x2();
        if (jX2 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jX2);
        }
        okio.n7h n7hVarY9n = y9n();
        try {
            okio.kja0 kja0VarUj2j = n7hVarY9n.uj2j();
            kotlin.io.zy.m23032k(n7hVarY9n, null);
            int size = kja0VarUj2j.size();
            if (jX2 == -1 || jX2 == size) {
                return kja0VarUj2j;
            }
            throw new IOException("Content-Length (" + jX2 + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }
}
