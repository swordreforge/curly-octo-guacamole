package okhttp3;

import b7.C1359g;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C6227f;
import kotlin.collections.nn86;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okhttp3.internal.http.C7456g;
import okhttp3.zurt;
import y9n.InterfaceC7782q;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
public final class jk {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private C7526q f43462g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final zurt f43463k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Map<Class<?>, Object> f43464n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final a9 f43465q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final String f94057toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final fn3e f94058zy;

    public jk(@InterfaceC7396q zurt url, @InterfaceC7396q String method, @InterfaceC7396q fn3e headers, @InterfaceC7395n a9 a9Var, @InterfaceC7396q Map<Class<?>, ? extends Object> tags) {
        d2ok.m23075h(url, "url");
        d2ok.m23075h(method, "method");
        d2ok.m23075h(headers, "headers");
        d2ok.m23075h(tags, "tags");
        this.f43463k = url;
        this.f94057toq = method;
        this.f94058zy = headers;
        this.f43465q = a9Var;
        this.f43464n = tags;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "url")
    public final zurt cdj() {
        return this.f43463k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "cacheControl")
    public final C7526q f7l8() {
        C7526q c7526q = this.f43462g;
        if (c7526q != null) {
            return c7526q;
        }
        C7526q c7526qZy = C7526q.f94070n7h.zy(this.f94058zy);
        this.f43462g = c7526qZy;
        return c7526qZy;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = C3678q.f22041h)
    /* JADX INFO: renamed from: g */
    public final a9 m27305g() {
        return this.f43465q;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    public final <T> T m27306h(@InterfaceC7396q Class<? extends T> type) {
        d2ok.m23075h(type, "type");
        return type.cast(this.f43464n.get(type));
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C3678q.f22041h, imports = {}))
    @InterfaceC6769y(name = "-deprecated_body")
    /* JADX INFO: renamed from: k */
    public final a9 m27307k() {
        return this.f43465q;
    }

    @InterfaceC7395n
    public final Object kja0() {
        return m27306h(Object.class);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "headers")
    public final fn3e ld6() {
        return this.f94058zy;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "url", imports = {}))
    @InterfaceC6769y(name = "-deprecated_url")
    /* JADX INFO: renamed from: n */
    public final zurt m27308n() {
        return this.f43463k;
    }

    @InterfaceC7396q
    public final C7511k n7h() {
        return new C7511k(this);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final List<String> m27309p(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        return this.f94058zy.kja0(name);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "method", imports = {}))
    @InterfaceC6769y(name = "-deprecated_method")
    /* JADX INFO: renamed from: q */
    public final String m27310q() {
        return this.f94057toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "method")
    public final String qrj() {
        return this.f94057toq;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final String m27311s(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        return this.f94058zy.zy(name);
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f94057toq);
        sb.append(", url=");
        sb.append(this.f43463k);
        if (this.f94058zy.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (C6227f<? extends String, ? extends String> c6227f : this.f94058zy) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.ni7.lrht();
                }
                C6227f<? extends String, ? extends String> c6227f2 = c6227f;
                String strComponent1 = c6227f2.component1();
                String strComponent2 = c6227f2.component2();
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i2 = i3;
            }
            sb.append(']');
        }
        if (!this.f43464n.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f43464n);
        }
        sb.append('}');
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cacheControl", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cacheControl")
    public final C7526q toq() {
        return f7l8();
    }

    public final boolean x2() {
        return this.f43463k.jp0y();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final Map<Class<?>, Object> m27312y() {
        return this.f43464n;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "headers", imports = {}))
    @InterfaceC6769y(name = "-deprecated_headers")
    public final fn3e zy() {
        return this.f94058zy;
    }

    /* JADX INFO: renamed from: okhttp3.jk$k */
    /* JADX INFO: compiled from: Request.kt */
    @lv5({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class C7511k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private zurt f43466k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private Map<Class<?>, Object> f43467n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private a9 f43468q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private String f94059toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private fn3e.C7432k f94060zy;

        public C7511k() {
            this.f43467n = new LinkedHashMap();
            this.f94059toq = "GET";
            this.f94060zy = new fn3e.C7432k();
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ C7511k m27313g(C7511k c7511k, a9 a9Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i2 & 1) != 0) {
                a9Var = C1359g.f7243q;
            }
            return c7511k.m27317n(a9Var);
        }

        @InterfaceC7396q
        public C7511k cdj(@InterfaceC7396q a9 body) {
            d2ok.m23075h(body, "body");
            return m27314h("PATCH", body);
        }

        @InterfaceC7396q
        public C7511k f7l8() {
            return m27314h("GET", null);
        }

        public final void fn3e(@InterfaceC7395n a9 a9Var) {
            this.f43468q = a9Var;
        }

        public final void fu4(@InterfaceC7396q Map<Class<?>, Object> map) {
            d2ok.m23075h(map, "<set-?>");
            this.f43467n = map;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: h */
        public C7511k m27314h(@InterfaceC7396q String method, @InterfaceC7395n a9 a9Var) {
            d2ok.m23075h(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (a9Var == null) {
                if (!(true ^ C7456g.m27074n(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C7456g.toq(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f94059toq = method;
            this.f43468q = a9Var;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: i */
        public C7511k m27315i(@InterfaceC7396q String name) {
            d2ok.m23075h(name, "name");
            this.f94060zy.x2(name);
            return this;
        }

        @InterfaceC7396q
        public C7511k jk(@InterfaceC7396q zurt url) {
            d2ok.m23075h(url, "url");
            this.f43466k = url;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public C7511k m27316k(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            this.f94060zy.toq(name, value);
            return this;
        }

        @InterfaceC7396q
        public C7511k ki(@InterfaceC7396q a9 body) {
            d2ok.m23075h(body, "body");
            return m27314h("POST", body);
        }

        @InterfaceC7396q
        public C7511k kja0(@InterfaceC7396q fn3e headers) {
            d2ok.m23075h(headers, "headers");
            this.f94060zy = headers.m26862p();
            return this;
        }

        @InterfaceC7396q
        public final Map<Class<?>, Object> ld6() {
            return this.f43467n;
        }

        @InterfaceC7396q
        public C7511k mcp(@InterfaceC7396q URL url) {
            d2ok.m23075h(url, "url");
            zurt.toq toqVar = zurt.f94239ld6;
            String string = url.toString();
            d2ok.kja0(string, "url.toString()");
            return jk(toqVar.m27552y(string));
        }

        @InterfaceC6768s
        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public C7511k m27317n(@InterfaceC7395n a9 a9Var) {
            return m27314h(InterfaceC7782q.f100601fu4, a9Var);
        }

        @InterfaceC7396q
        public C7511k n7h(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            this.f94060zy.qrj(name, value);
            return this;
        }

        public final void ni7(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<set-?>");
            this.f94059toq = str;
        }

        @InterfaceC7396q
        public <T> C7511k o1t(@InterfaceC7396q Class<? super T> type, @InterfaceC7395n T t2) {
            d2ok.m23075h(type, "type");
            if (t2 == null) {
                this.f43467n.remove(type);
            } else {
                if (this.f43467n.isEmpty()) {
                    this.f43467n = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f43467n;
                T tCast = type.cast(t2);
                d2ok.qrj(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public final String m27318p() {
            return this.f94059toq;
        }

        @InterfaceC6768s
        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C7511k m27319q() {
            return m27313g(this, null, 1, null);
        }

        @InterfaceC7396q
        public C7511k qrj() {
            return m27314h("HEAD", null);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final fn3e.C7432k m27320s() {
            return this.f94060zy;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: t */
        public C7511k m27321t(@InterfaceC7396q String url) {
            d2ok.m23075h(url, "url");
            if (kotlin.text.a9.l05(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (kotlin.text.a9.l05(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return jk(zurt.f94239ld6.m27552y(url));
        }

        @InterfaceC7396q
        public C7511k t8r(@InterfaceC7396q a9 body) {
            d2ok.m23075h(body, "body");
            return m27314h("PUT", body);
        }

        @InterfaceC7396q
        public jk toq() {
            zurt zurtVar = this.f43466k;
            if (zurtVar != null) {
                return new jk(zurtVar, this.f94059toq, this.f94060zy.m26870s(), this.f43468q, C1359g.m5749b(this.f43467n));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @InterfaceC7396q
        public C7511k wvg(@InterfaceC7395n Object obj) {
            return o1t(Object.class, obj);
        }

        @InterfaceC7395n
        public final zurt x2() {
            return this.f43466k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public final a9 m27322y() {
            return this.f43468q;
        }

        /* JADX INFO: renamed from: z */
        public final void m27323z(@InterfaceC7395n zurt zurtVar) {
            this.f43466k = zurtVar;
        }

        public final void zurt(@InterfaceC7396q fn3e.C7432k c7432k) {
            d2ok.m23075h(c7432k, "<set-?>");
            this.f94060zy = c7432k;
        }

        @InterfaceC7396q
        public C7511k zy(@InterfaceC7396q C7526q cacheControl) {
            d2ok.m23075h(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? m27315i(com.google.common.net.zy.f27254k) : n7h(com.google.common.net.zy.f27254k, string);
        }

        public C7511k(@InterfaceC7396q jk request) {
            Map<Class<?>, Object> mapWo;
            d2ok.m23075h(request, "request");
            this.f43467n = new LinkedHashMap();
            this.f43466k = request.cdj();
            this.f94059toq = request.qrj();
            this.f43468q = request.m27305g();
            if (request.m27312y().isEmpty()) {
                mapWo = new LinkedHashMap<>();
            } else {
                mapWo = nn86.wo(request.m27312y());
            }
            this.f43467n = mapWo;
            this.f94060zy = request.ld6().m26862p();
        }
    }
}
