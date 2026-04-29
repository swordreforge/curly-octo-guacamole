package okhttp3;

import b7.C1359g;
import com.xiaomi.onetrack.api.C5693g;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C6163t;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import le7.C6773q;
import le7.zy;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.InterfaceC7519n;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.connection.C7450n;
import okhttp3.internal.connection.C7454y;
import okhttp3.internal.platform.C7498p;
import okhttp3.internal.ws.C7507n;
import okhttp3.ki;
import okhttp3.ni7;
import okhttp3.oc;
import oph.C7581k;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: okhttp3.t */
/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
public class C7529t implements Cloneable, InterfaceC7519n.k, oc.InterfaceC7524k {

    /* JADX INFO: renamed from: a */
    @InterfaceC7396q
    private final HostnameVerifier f43566a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final int f94188ab;

    /* JADX INFO: renamed from: b */
    @InterfaceC7396q
    private final List<mcp> f43567b;
    private final long bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final int f94189bo;

    @InterfaceC7396q
    private final C7454y bp;

    /* JADX INFO: renamed from: c */
    @InterfaceC7396q
    private final okhttp3.toq f43568c;

    /* JADX INFO: renamed from: d */
    private final int f43569d;

    /* JADX INFO: renamed from: e */
    @InterfaceC7396q
    private final SocketFactory f43570e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7396q
    private final ProxySelector f43571f;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final List<ni7> f43572g;

    /* JADX INFO: renamed from: h */
    private final boolean f43573h;

    /* JADX INFO: renamed from: i */
    private final boolean f43574i;

    /* JADX INFO: renamed from: j */
    @InterfaceC7395n
    private final SSLSocketFactory f43575j;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7436h f43576k;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private final Proxy f43577l;

    /* JADX INFO: renamed from: m */
    @InterfaceC7396q
    private final List<x2> f43578m;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final List<ni7> f43579n;

    /* JADX INFO: renamed from: o */
    @InterfaceC7395n
    private final X509TrustManager f43580o;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final okhttp3.toq f43581p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final ld6 f43582q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7396q
    private final cdj f43583r;

    /* JADX INFO: renamed from: s */
    private final boolean f43584s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7395n
    private final zy f43585t;

    /* JADX INFO: renamed from: u */
    @InterfaceC7395n
    private final le7.zy f43586u;

    /* JADX INFO: renamed from: v */
    private final int f43587v;

    /* JADX INFO: renamed from: w */
    private final int f43588w;

    /* JADX INFO: renamed from: x */
    @InterfaceC7396q
    private final f7l8 f43589x;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final ki.zy f43590y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7396q
    private final n7h f43591z;

    @InterfaceC7396q
    public static final toq bv = new toq(null);

    @InterfaceC7396q
    private static final List<mcp> an = C1359g.mcp(mcp.HTTP_2, mcp.HTTP_1_1);

    @InterfaceC7396q
    private static final List<x2> id = C1359g.mcp(x2.f43614s, x2.f94217ld6);

    /* JADX INFO: renamed from: okhttp3.t$toq */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final List<x2> m27469k() {
            return C7529t.id;
        }

        @InterfaceC7396q
        public final List<mcp> toq() {
            return C7529t.an;
        }
    }

    public C7529t(@InterfaceC7396q k builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM27455l;
        d2ok.m23075h(builder, "builder");
        this.f43576k = builder.a9();
        this.f43582q = builder.m27463t();
        this.f43579n = C1359g.y9n(builder.eqxt());
        this.f43572g = C1359g.y9n(builder.lvui());
        this.f43590y = builder.jp0y();
        this.f43584s = builder.hyr();
        this.f43581p = builder.zurt();
        this.f43573h = builder.gvn7();
        this.f43574i = builder.d3();
        this.f43591z = builder.jk();
        this.f43585t = builder.ni7();
        this.f43583r = builder.fti();
        this.f43577l = builder.x9kr();
        if (builder.x9kr() != null) {
            proxySelectorM27455l = C7581k.f43863k;
        } else {
            proxySelectorM27455l = builder.m27455l();
            proxySelectorM27455l = proxySelectorM27455l == null ? ProxySelector.getDefault() : proxySelectorM27455l;
            if (proxySelectorM27455l == null) {
                proxySelectorM27455l = C7581k.f43863k;
            }
        }
        this.f43571f = proxySelectorM27455l;
        this.f43568c = builder.ncyb();
        this.f43570e = builder.m27446c();
        List<x2> listMcp = builder.mcp();
        this.f43578m = listMcp;
        this.f43567b = builder.dd();
        this.f43566a = builder.oc();
        this.f94189bo = builder.fu4();
        this.f43587v = builder.wvg();
        this.f43569d = builder.n5r1();
        this.f43588w = builder.uv6();
        this.f94188ab = builder.m27461r();
        this.bb = builder.d2ok();
        C7454y c7454yM27449f = builder.m27449f();
        this.bp = c7454yM27449f == null ? new C7454y() : c7454yM27449f;
        boolean z2 = true;
        if (!(listMcp instanceof Collection) || !listMcp.isEmpty()) {
            Iterator<T> it = listMcp.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((x2) it.next()).m27478s()) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            this.f43575j = null;
            this.f43586u = null;
            this.f43580o = null;
            this.f43589x = f7l8.f42923q;
        } else if (builder.lrht() != null) {
            this.f43575j = builder.lrht();
            le7.zy zyVarM27468z = builder.m27468z();
            d2ok.qrj(zyVarM27468z);
            this.f43586u = zyVarM27468z;
            X509TrustManager x509TrustManagerVyq = builder.vyq();
            d2ok.qrj(x509TrustManagerVyq);
            this.f43580o = x509TrustManagerVyq;
            f7l8 f7l8VarO1t = builder.o1t();
            d2ok.qrj(zyVarM27468z);
            this.f43589x = f7l8VarO1t.m26853p(zyVarM27468z);
        } else {
            C7498p.k kVar = C7498p.f43366k;
            X509TrustManager x509TrustManagerKi = kVar.f7l8().ki();
            this.f43580o = x509TrustManagerKi;
            C7498p c7498pF7l8 = kVar.f7l8();
            d2ok.qrj(x509TrustManagerKi);
            this.f43575j = c7498pF7l8.cdj(x509TrustManagerKi);
            zy.C6774k c6774k = le7.zy.f37605k;
            d2ok.qrj(x509TrustManagerKi);
            le7.zy zyVarM24714k = c6774k.m24714k(x509TrustManagerKi);
            this.f43586u = zyVarM24714k;
            f7l8 f7l8VarO1t2 = builder.o1t();
            d2ok.qrj(zyVarM24714k);
            this.f43589x = f7l8VarO1t2.m26853p(zyVarM24714k);
        }
        ch();
    }

    private final void ch() {
        boolean z2;
        d2ok.n7h(this.f43579n, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f43579n).toString());
        }
        d2ok.n7h(this.f43572g, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.f43572g).toString());
        }
        List<x2> list = this.f43578m;
        if ((list instanceof Collection) && list.isEmpty()) {
            z2 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((x2) it.next()).m27478s()) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        if (!z2) {
            if (this.f43575j == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f43586u == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f43580o == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f43575j == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f43586u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f43580o == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!d2ok.f7l8(this.f43589x, f7l8.f42923q)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @InterfaceC6769y(name = "retryOnConnectionFailure")
    /* JADX INFO: renamed from: a */
    public final boolean m27426a() {
        return this.f43584s;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "readTimeoutMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_readTimeoutMillis")
    public final int a9() {
        return this.f43569d;
    }

    @InterfaceC6769y(name = "readTimeoutMillis")
    public final int a98o() {
        return this.f43569d;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "proxy")
    /* JADX INFO: renamed from: b */
    public final Proxy m27427b() {
        return this.f43577l;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "proxyAuthenticator")
    public final okhttp3.toq bf2() {
        return this.f43568c;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "dispatcher")
    /* JADX INFO: renamed from: c */
    public final C7436h m27428c() {
        return this.f43576k;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cookieJar", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cookieJar")
    public final n7h cdj() {
        return this.f43591z;
    }

    @InterfaceC7396q
    public Object clone() {
        return super.clone();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "writeTimeoutMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_writeTimeoutMillis")
    public final int d3() {
        return this.f43588w;
    }

    @InterfaceC6769y(name = "callTimeoutMillis")
    public final int dd() {
        return this.f94189bo;
    }

    @InterfaceC6769y(name = "followSslRedirects")
    /* JADX INFO: renamed from: e */
    public final boolean m27429e() {
        return this.f43574i;
    }

    @InterfaceC7396q
    public k ek5k() {
        return new k(this);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "cookieJar")
    /* JADX INFO: renamed from: f */
    public final n7h m27430f() {
        return this.f43591z;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "followRedirects", imports = {}))
    @InterfaceC6769y(name = "-deprecated_followRedirects")
    public final boolean fn3e() {
        return this.f43573h;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "retryOnConnectionFailure", imports = {}))
    @InterfaceC6769y(name = "-deprecated_retryOnConnectionFailure")
    public final boolean fti() {
        return this.f43584s;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "interceptors", imports = {}))
    @InterfaceC6769y(name = "-deprecated_interceptors")
    public final List<ni7> fu4() {
        return this.f43579n;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cache", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cache")
    /* JADX INFO: renamed from: g */
    public final zy m27431g() {
        return this.f43585t;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "sslSocketFactory", imports = {}))
    @InterfaceC6769y(name = "-deprecated_sslSocketFactory")
    public final SSLSocketFactory gvn7() {
        return m27441x();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "hostnameVerifier")
    public final HostnameVerifier hb() {
        return this.f43566a;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "connectionSpecs")
    public final List<x2> hyr() {
        return this.f43578m;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "eventListenerFactory", imports = {}))
    @InterfaceC6769y(name = "-deprecated_eventListenerFactory")
    /* JADX INFO: renamed from: i */
    public final ki.zy m27432i() {
        return this.f43590y;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "proxySelector")
    public final ProxySelector i1() {
        return this.f43571f;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "interceptors")
    /* JADX INFO: renamed from: j */
    public final List<ni7> m27433j() {
        return this.f43579n;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxySelector", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxySelector")
    public final ProxySelector jk() {
        return this.f43571f;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "socketFactory", imports = {}))
    @InterfaceC6769y(name = "-deprecated_socketFactory")
    public final SocketFactory jp0y() {
        return this.f43570e;
    }

    @Override // okhttp3.InterfaceC7519n.k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public InterfaceC7519n mo27367k(@InterfaceC7396q jk request) {
        d2ok.m23075h(request, "request");
        return new C7450n(this, request, false);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "dispatcher", imports = {}))
    @InterfaceC6769y(name = "-deprecated_dispatcher")
    public final C7436h ki() {
        return this.f43576k;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "connectionSpecs", imports = {}))
    @InterfaceC6769y(name = "-deprecated_connectionSpecs")
    public final List<x2> kja0() {
        return this.f43578m;
    }

    @InterfaceC6769y(name = "connectTimeoutMillis")
    /* JADX INFO: renamed from: l */
    public final int m27434l() {
        return this.f43587v;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = C5693g.f31773O)
    public final cdj lrht() {
        return this.f43583r;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "x509TrustManager")
    public final X509TrustManager lv5() {
        return this.f43580o;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "authenticator")
    public final okhttp3.toq lvui() {
        return this.f43581p;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "networkInterceptors")
    /* JADX INFO: renamed from: m */
    public final List<ni7> m27435m() {
        return this.f43572g;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxyAuthenticator", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxyAuthenticator")
    public final okhttp3.toq mcp() {
        return this.f43568c;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "authenticator", imports = {}))
    @InterfaceC6769y(name = "-deprecated_authenticator")
    /* JADX INFO: renamed from: n */
    public final okhttp3.toq m27436n() {
        return this.f43581p;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "connectionPool")
    public final ld6 n5r1() {
        return this.f43582q;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "connectionPool", imports = {}))
    @InterfaceC6769y(name = "-deprecated_connectionPool")
    public final ld6 n7h() {
        return this.f43582q;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "certificatePinner")
    public final f7l8 ncyb() {
        return this.f43589x;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "hostnameVerifier", imports = {}))
    @InterfaceC6769y(name = "-deprecated_hostnameVerifier")
    public final HostnameVerifier ni7() {
        return this.f43566a;
    }

    @InterfaceC6769y(name = "writeTimeoutMillis")
    public final int nmn5() {
        return this.f43588w;
    }

    @InterfaceC7396q
    public final C7454y nn86() {
        return this.bp;
    }

    @InterfaceC6769y(name = "minWebSocketMessageToCompress")
    /* JADX INFO: renamed from: o */
    public final long m27437o() {
        return this.bb;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "pingIntervalMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_pingIntervalMillis")
    public final int o1t() {
        return this.f94188ab;
    }

    @Override // okhttp3.oc.InterfaceC7524k
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public oc mo27377q(@InterfaceC7396q jk request, @InterfaceC7396q eqxt listener) {
        d2ok.m23075h(request, "request");
        d2ok.m23075h(listener, "listener");
        C7507n c7507n = new C7507n(C7445q.f43045s, request, listener, new Random(), this.f94188ab, null, this.bb);
        c7507n.ki(this);
        return c7507n;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "connectTimeoutMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_connectTimeoutMillis")
    public final int qrj() {
        return this.f43587v;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "cache")
    /* JADX INFO: renamed from: r */
    public final zy m27438r() {
        return this.f43585t;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "certificatePinner", imports = {}))
    @InterfaceC6769y(name = "-deprecated_certificatePinner")
    /* JADX INFO: renamed from: s */
    public final f7l8 m27439s() {
        return this.f43589x;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxy", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxy")
    /* JADX INFO: renamed from: t */
    public final Proxy m27440t() {
        return this.f43577l;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C5693g.f31773O, imports = {}))
    @InterfaceC6769y(name = "-deprecated_dns")
    public final cdj t8r() {
        return this.f43583r;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "eventListenerFactory")
    public final ki.zy uv6() {
        return this.f43590y;
    }

    @InterfaceC6769y(name = "followRedirects")
    public final boolean vyq() {
        return this.f43573h;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "protocols", imports = {}))
    @InterfaceC6769y(name = "-deprecated_protocols")
    public final List<mcp> wvg() {
        return this.f43567b;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "sslSocketFactory")
    /* JADX INFO: renamed from: x */
    public final SSLSocketFactory m27441x() {
        SSLSocketFactory sSLSocketFactory = this.f43575j;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "certificateChainCleaner")
    public final le7.zy x9kr() {
        return this.f43586u;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "callTimeoutMillis", imports = {}))
    @InterfaceC6769y(name = "-deprecated_callTimeoutMillis")
    /* JADX INFO: renamed from: y */
    public final int m27442y() {
        return this.f94189bo;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "protocols")
    public final List<mcp> y9n() {
        return this.f43567b;
    }

    @InterfaceC6769y(name = "pingIntervalMillis")
    public final int yz() {
        return this.f94188ab;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "networkInterceptors", imports = {}))
    @InterfaceC6769y(name = "-deprecated_networkInterceptors")
    /* JADX INFO: renamed from: z */
    public final List<ni7> m27443z() {
        return this.f43572g;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "socketFactory")
    public final SocketFactory zp() {
        return this.f43570e;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "followSslRedirects", imports = {}))
    @InterfaceC6769y(name = "-deprecated_followSslRedirects")
    public final boolean zurt() {
        return this.f43574i;
    }

    /* JADX INFO: renamed from: okhttp3.t$k */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    @lv5({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    public static final class k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        @InterfaceC7395n
        private SSLSocketFactory f94190cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        private okhttp3.toq f94191f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        @InterfaceC7396q
        private HostnameVerifier f94192fn3e;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private int f94193fu4;

        /* JADX INFO: renamed from: g */
        private boolean f43592g;

        /* JADX INFO: renamed from: h */
        @InterfaceC7396q
        private SocketFactory f43593h;

        /* JADX INFO: renamed from: i */
        @InterfaceC7396q
        private List<? extends mcp> f43594i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        @InterfaceC7395n
        private C7454y f94194jk;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private C7436h f43595k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        @InterfaceC7395n
        private X509TrustManager f94195ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        @InterfaceC7396q
        private okhttp3.toq f94196kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @InterfaceC7395n
        private zy f94197ld6;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private long f94198mcp;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private ki.zy f43596n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        @InterfaceC7395n
        private ProxySelector f94199n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        @InterfaceC7395n
        private le7.zy f94200ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private int f94201o1t;

        /* JADX INFO: renamed from: p */
        @InterfaceC7396q
        private n7h f43597p;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final List<ni7> f43598q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        @InterfaceC7395n
        private Proxy f94202qrj;

        /* JADX INFO: renamed from: s */
        private boolean f43599s;

        /* JADX INFO: renamed from: t */
        private int f43600t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        @InterfaceC7396q
        private List<x2> f94203t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private ld6 f94204toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private int f94205wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        @InterfaceC7396q
        private cdj f94206x2;

        /* JADX INFO: renamed from: y */
        private boolean f43601y;

        /* JADX INFO: renamed from: z */
        private int f43602z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        @InterfaceC7396q
        private f7l8 f94207zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final List<ni7> f94208zy;

        /* JADX INFO: renamed from: okhttp3.t$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OkHttpClient.kt */
        @lv5({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class C8129k implements ni7 {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ cyoe.x2<ni7.InterfaceC7521k, fti> f43603k;

            /* JADX WARN: Multi-variable type inference failed */
            public C8129k(cyoe.x2<? super ni7.InterfaceC7521k, fti> x2Var) {
                this.f43603k = x2Var;
            }

            @Override // okhttp3.ni7
            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) {
                d2ok.m23075h(chain, "chain");
                return this.f43603k.invoke(chain);
            }
        }

        /* JADX INFO: renamed from: okhttp3.t$k$toq */
        /* JADX INFO: compiled from: OkHttpClient.kt */
        @lv5({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class toq implements ni7 {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ cyoe.x2<ni7.InterfaceC7521k, fti> f43604k;

            /* JADX WARN: Multi-variable type inference failed */
            public toq(cyoe.x2<? super ni7.InterfaceC7521k, fti> x2Var) {
                this.f43604k = x2Var;
            }

            @Override // okhttp3.ni7
            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) {
                d2ok.m23075h(chain, "chain");
                return this.f43604k.invoke(chain);
            }
        }

        public k() {
            this.f43595k = new C7436h();
            this.f94204toq = new ld6();
            this.f94208zy = new ArrayList();
            this.f43598q = new ArrayList();
            this.f43596n = C1359g.f7l8(ki.f94065toq);
            this.f43592g = true;
            okhttp3.toq toqVar = okhttp3.toq.f94213toq;
            this.f94191f7l8 = toqVar;
            this.f43601y = true;
            this.f43599s = true;
            this.f43597p = n7h.f94068toq;
            this.f94206x2 = cdj.f93816toq;
            this.f94196kja0 = toqVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            d2ok.kja0(socketFactory, "getDefault()");
            this.f43593h = socketFactory;
            toq toqVar2 = C7529t.bv;
            this.f94203t8r = toqVar2.m27469k();
            this.f43594i = toqVar2.toq();
            this.f94192fn3e = C6773q.f37603k;
            this.f94207zurt = f7l8.f42923q;
            this.f43602z = 10000;
            this.f94201o1t = 10000;
            this.f94205wvg = 10000;
            this.f94198mcp = 1024L;
        }

        /* JADX INFO: renamed from: a */
        public final void m27444a(@InterfaceC7396q okhttp3.toq toqVar) {
            d2ok.m23075h(toqVar, "<set-?>");
            this.f94191f7l8 = toqVar;
        }

        @InterfaceC7396q
        public final C7436h a9() {
            return this.f43595k;
        }

        @InterfaceC7396q
        public final k a98o(boolean z2) {
            this.f43592g = z2;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: b */
        public final k m27445b(@InterfaceC7396q ProxySelector proxySelector) {
            d2ok.m23075h(proxySelector, "proxySelector");
            if (!d2ok.f7l8(proxySelector, this.f94199n7h)) {
                this.f94194jk = null;
            }
            this.f94199n7h = proxySelector;
            return this;
        }

        @InterfaceC7396q
        public final k bf2(long j2, @InterfaceC7396q TimeUnit unit) {
            d2ok.m23075h(unit, "unit");
            this.f94201o1t = C1359g.qrj("timeout", j2, unit);
            return this;
        }

        public final void bo(@InterfaceC7396q n7h n7hVar) {
            d2ok.m23075h(n7hVar, "<set-?>");
            this.f43597p = n7hVar;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: c */
        public final SocketFactory m27446c() {
            return this.f43593h;
        }

        public final void c8jq(@InterfaceC7396q cdj cdjVar) {
            d2ok.m23075h(cdjVar, "<set-?>");
            this.f94206x2 = cdjVar;
        }

        @InterfaceC7396q
        public final k cdj(@InterfaceC7396q cdj dns) {
            d2ok.m23075h(dns, "dns");
            if (!d2ok.f7l8(dns, this.f94206x2)) {
                this.f94194jk = null;
            }
            this.f94206x2 = dns;
            return this;
        }

        public final void ch(@InterfaceC7395n le7.zy zyVar) {
            this.f94200ni7 = zyVar;
        }

        /* JADX INFO: renamed from: d */
        public final void m27447d(int i2) {
            this.f43600t = i2;
        }

        public final long d2ok() {
            return this.f94198mcp;
        }

        public final boolean d3() {
            return this.f43599s;
        }

        public final void d8wk(@InterfaceC7396q SocketFactory socketFactory) {
            d2ok.m23075h(socketFactory, "<set-?>");
            this.f43593h = socketFactory;
        }

        @InterfaceC7396q
        public final List<mcp> dd() {
            return this.f43594i;
        }

        public final void dr(boolean z2) {
            this.f43601y = z2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: e */
        public final k m27448e(@InterfaceC7396q HostnameVerifier hostnameVerifier) {
            d2ok.m23075h(hostnameVerifier, "hostnameVerifier");
            if (!d2ok.f7l8(hostnameVerifier, this.f94192fn3e)) {
                this.f94194jk = null;
            }
            this.f94192fn3e = hostnameVerifier;
            return this;
        }

        @InterfaceC7396q
        public final k ek5k(@InterfaceC7396q List<? extends mcp> protocols) {
            d2ok.m23075h(protocols, "protocols");
            List listXzk4 = kotlin.collections.a9.xzk4(protocols);
            mcp mcpVar = mcp.H2_PRIOR_KNOWLEDGE;
            if (!(listXzk4.contains(mcpVar) || listXzk4.contains(mcp.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listXzk4).toString());
            }
            if (!(!listXzk4.contains(mcpVar) || listXzk4.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listXzk4).toString());
            }
            if (!(!listXzk4.contains(mcp.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listXzk4).toString());
            }
            d2ok.n7h(listXzk4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (!(!listXzk4.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            listXzk4.remove(mcp.SPDY_3);
            if (!d2ok.f7l8(listXzk4, this.f43594i)) {
                this.f94194jk = null;
            }
            List<? extends mcp> listUnmodifiableList = Collections.unmodifiableList(listXzk4);
            d2ok.kja0(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f43594i = listUnmodifiableList;
            return this;
        }

        @InterfaceC7396q
        public final List<ni7> eqxt() {
            return this.f94208zy;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: f */
        public final C7454y m27449f() {
            return this.f94194jk;
        }

        @InterfaceC7396q
        public final k f7l8(@InterfaceC7395n zy zyVar) {
            this.f94197ld6 = zyVar;
            return this;
        }

        @InterfaceC7396q
        public final k fn3e(boolean z2) {
            this.f43599s = z2;
            return this;
        }

        public final void fnq8(@InterfaceC7395n ProxySelector proxySelector) {
            this.f94199n7h = proxySelector;
        }

        @InterfaceC7396q
        public final cdj fti() {
            return this.f94206x2;
        }

        public final int fu4() {
            return this.f94193fu4;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final C7529t m27450g() {
            return new C7529t(this);
        }

        public final void g1(@InterfaceC7395n SSLSocketFactory sSLSocketFactory) {
            this.f94190cdj = sSLSocketFactory;
        }

        public final void gbni(@InterfaceC7395n X509TrustManager x509TrustManager) {
            this.f94195ki = x509TrustManager;
        }

        public final boolean gvn7() {
            return this.f43601y;
        }

        public final void gyi(@InterfaceC7396q ki.zy zyVar) {
            d2ok.m23075h(zyVar, "<set-?>");
            this.f43596n = zyVar;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: h */
        public final k m27451h(@InterfaceC7396q C7436h dispatcher) {
            d2ok.m23075h(dispatcher, "dispatcher");
            this.f43595k = dispatcher;
            return this;
        }

        @InterfaceC7396q
        public final k hb(long j2) {
            if (j2 >= 0) {
                this.f94198mcp = j2;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j2).toString());
        }

        public final boolean hyr() {
            return this.f43592g;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: i */
        public final k m27452i(boolean z2) {
            this.f43601y = z2;
            return this;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        public final k i1(@InterfaceC7396q Duration duration) {
            d2ok.m23075h(duration, "duration");
            bf2(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC7396q
        public final k i9jn(@InterfaceC7396q SSLSocketFactory sslSocketFactory, @InterfaceC7396q X509TrustManager trustManager) {
            d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
            d2ok.m23075h(trustManager, "trustManager");
            if (!d2ok.f7l8(sslSocketFactory, this.f94190cdj) || !d2ok.f7l8(trustManager, this.f94195ki)) {
                this.f94194jk = null;
            }
            this.f94190cdj = sslSocketFactory;
            this.f94200ni7 = le7.zy.f37605k.m24714k(trustManager);
            this.f94195ki = trustManager;
            return this;
        }

        public final void ikck(long j2) {
            this.f94198mcp = j2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: j */
        public final List<ni7> m27453j() {
            return this.f43598q;
        }

        @InterfaceC7396q
        public final n7h jk() {
            return this.f43597p;
        }

        @InterfaceC7396q
        public final ki.zy jp0y() {
            return this.f43596n;
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "-addInterceptor")
        /* JADX INFO: renamed from: k */
        public final k m27454k(@InterfaceC7396q cyoe.x2<? super ni7.InterfaceC7521k, fti> block) {
            d2ok.m23075h(block, "block");
            return zy(new C8129k(block));
        }

        @InterfaceC7396q
        public final k ki(@InterfaceC7396q ki eventListener) {
            d2ok.m23075h(eventListener, "eventListener");
            this.f43596n = C1359g.f7l8(eventListener);
            return this;
        }

        @InterfaceC7396q
        public final k kja0(@InterfaceC7396q n7h cookieJar) {
            d2ok.m23075h(cookieJar, "cookieJar");
            this.f43597p = cookieJar;
            return this;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: l */
        public final ProxySelector m27455l() {
            return this.f94199n7h;
        }

        @InterfaceC7396q
        public final k ld6(long j2, @InterfaceC7396q TimeUnit unit) {
            d2ok.m23075h(unit, "unit");
            this.f43602z = C1359g.qrj("timeout", j2, unit);
            return this;
        }

        @InterfaceC7395n
        public final SSLSocketFactory lrht() {
            return this.f94190cdj;
        }

        @InterfaceC7396q
        public final k ltg8(long j2, @InterfaceC7396q TimeUnit unit) {
            d2ok.m23075h(unit, "unit");
            this.f94205wvg = C1359g.qrj("timeout", j2, unit);
            return this;
        }

        public final void lv5(int i2) {
            this.f43602z = i2;
        }

        @InterfaceC7396q
        public final List<ni7> lvui() {
            return this.f43598q;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: m */
        public final k m27456m(@InterfaceC7396q Duration duration) {
            d2ok.m23075h(duration, "duration");
            m27458o(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC7396q
        public final List<x2> mcp() {
            return this.f94203t8r;
        }

        public final void mu(@InterfaceC7396q List<? extends mcp> list) {
            d2ok.m23075h(list, "<set-?>");
            this.f43594i = list;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final k m27457n(@InterfaceC7396q okhttp3.toq authenticator) {
            d2ok.m23075h(authenticator, "authenticator");
            this.f94191f7l8 = authenticator;
            return this;
        }

        public final int n5r1() {
            return this.f94201o1t;
        }

        @InterfaceC7396q
        public final k n7h(@InterfaceC7396q List<x2> connectionSpecs) {
            d2ok.m23075h(connectionSpecs, "connectionSpecs");
            if (!d2ok.f7l8(connectionSpecs, this.f94203t8r)) {
                this.f94194jk = null;
            }
            this.f94203t8r = C1359g.y9n(connectionSpecs);
            return this;
        }

        @InterfaceC7396q
        public final okhttp3.toq ncyb() {
            return this.f94196kja0;
        }

        @InterfaceC7395n
        public final zy ni7() {
            return this.f94197ld6;
        }

        public final void nmn5(@InterfaceC7396q f7l8 f7l8Var) {
            d2ok.m23075h(f7l8Var, "<set-?>");
            this.f94207zurt = f7l8Var;
        }

        @InterfaceC7396q
        public final List<ni7> nn86() {
            return this.f94208zy;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: o */
        public final k m27458o(long j2, @InterfaceC7396q TimeUnit unit) {
            d2ok.m23075h(unit, "unit");
            this.f43600t = C1359g.qrj("interval", j2, unit);
            return this;
        }

        @InterfaceC7396q
        public final f7l8 o1t() {
            return this.f94207zurt;
        }

        @InterfaceC7396q
        public final HostnameVerifier oc() {
            return this.f94192fn3e;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public final k m27459p(@InterfaceC7396q f7l8 certificatePinner) {
            d2ok.m23075h(certificatePinner, "certificatePinner");
            if (!d2ok.f7l8(certificatePinner, this.f94207zurt)) {
                this.f94194jk = null;
            }
            this.f94207zurt = certificatePinner;
            return this;
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final k py(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
            d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
            if (!d2ok.f7l8(sslSocketFactory, this.f94190cdj)) {
                this.f94194jk = null;
            }
            this.f94190cdj = sslSocketFactory;
            C7498p.k kVar = C7498p.f43366k;
            X509TrustManager x509TrustManagerT8r = kVar.f7l8().t8r(sslSocketFactory);
            if (x509TrustManagerT8r != null) {
                this.f94195ki = x509TrustManagerT8r;
                C7498p c7498pF7l8 = kVar.f7l8();
                X509TrustManager x509TrustManager = this.f94195ki;
                d2ok.qrj(x509TrustManager);
                this.f94200ni7 = c7498pF7l8.mo27234q(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + kVar.f7l8() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final k m27460q(@InterfaceC7396q ni7 interceptor) {
            d2ok.m23075h(interceptor, "interceptor");
            this.f43598q.add(interceptor);
            return this;
        }

        public final void qkj8(@InterfaceC7396q okhttp3.toq toqVar) {
            d2ok.m23075h(toqVar, "<set-?>");
            this.f94196kja0 = toqVar;
        }

        public final void qo(int i2) {
            this.f94201o1t = i2;
        }

        @InterfaceC7396q
        public final k qrj(@InterfaceC7396q ld6 connectionPool) {
            d2ok.m23075h(connectionPool, "connectionPool");
            this.f94204toq = connectionPool;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public final int m27461r() {
            return this.f43600t;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        public final k r8s8(@InterfaceC7396q Duration duration) {
            d2ok.m23075h(duration, "duration");
            ltg8(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: s */
        public final k m27462s(@InterfaceC7396q Duration duration) {
            d2ok.m23075h(duration, "duration");
            m27467y(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: t */
        public final ld6 m27463t() {
            return this.f94204toq;
        }

        public final void t8iq(@InterfaceC7396q ld6 ld6Var) {
            d2ok.m23075h(ld6Var, "<set-?>");
            this.f94204toq = ld6Var;
        }

        @InterfaceC7396q
        public final k t8r(@InterfaceC7396q ki.zy eventListenerFactory) {
            d2ok.m23075h(eventListenerFactory, "eventListenerFactory");
            this.f43596n = eventListenerFactory;
            return this;
        }

        public final void tfm(boolean z2) {
            this.f43592g = z2;
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "-addNetworkInterceptor")
        public final k toq(@InterfaceC7396q cyoe.x2<? super ni7.InterfaceC7521k, fti> block) {
            d2ok.m23075h(block, "block");
            return m27460q(new toq(block));
        }

        /* JADX INFO: renamed from: u */
        public final void m27464u(@InterfaceC7396q List<x2> list) {
            d2ok.m23075h(list, "<set-?>");
            this.f94203t8r = list;
        }

        public final int uv6() {
            return this.f94205wvg;
        }

        /* JADX INFO: renamed from: v */
        public final void m27465v(@InterfaceC7396q HostnameVerifier hostnameVerifier) {
            d2ok.m23075h(hostnameVerifier, "<set-?>");
            this.f94192fn3e = hostnameVerifier;
        }

        public final void vq(@InterfaceC7395n Proxy proxy) {
            this.f94202qrj = proxy;
        }

        @InterfaceC7395n
        public final X509TrustManager vyq() {
            return this.f94195ki;
        }

        public final void was(int i2) {
            this.f94205wvg = i2;
        }

        public final void wo(@InterfaceC7395n C7454y c7454y) {
            this.f94194jk = c7454y;
        }

        public final int wvg() {
            return this.f43602z;
        }

        /* JADX INFO: renamed from: x */
        public final void m27466x(int i2) {
            this.f94193fu4 = i2;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        public final k x2(@InterfaceC7396q Duration duration) {
            d2ok.m23075h(duration, "duration");
            ld6(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC7395n
        public final Proxy x9kr() {
            return this.f94202qrj;
        }

        public final void xwq3(boolean z2) {
            this.f43599s = z2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final k m27467y(long j2, @InterfaceC7396q TimeUnit unit) {
            d2ok.m23075h(unit, "unit");
            this.f94193fu4 = C1359g.qrj("timeout", j2, unit);
            return this;
        }

        public final void y2(@InterfaceC7396q C7436h c7436h) {
            d2ok.m23075h(c7436h, "<set-?>");
            this.f43595k = c7436h;
        }

        @InterfaceC7396q
        public final k y9n(@InterfaceC7396q okhttp3.toq proxyAuthenticator) {
            d2ok.m23075h(proxyAuthenticator, "proxyAuthenticator");
            if (!d2ok.f7l8(proxyAuthenticator, this.f94196kja0)) {
                this.f94194jk = null;
            }
            this.f94196kja0 = proxyAuthenticator;
            return this;
        }

        @InterfaceC7396q
        public final k yz(@InterfaceC7395n Proxy proxy) {
            if (!d2ok.f7l8(proxy, this.f94202qrj)) {
                this.f94194jk = null;
            }
            this.f94202qrj = proxy;
            return this;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: z */
        public final le7.zy m27468z() {
            return this.f94200ni7;
        }

        public final void zp(@InterfaceC7395n zy zyVar) {
            this.f94197ld6 = zyVar;
        }

        @InterfaceC7396q
        public final k zsr0(@InterfaceC7396q SocketFactory socketFactory) {
            d2ok.m23075h(socketFactory, "socketFactory");
            if (!(!(socketFactory instanceof SSLSocketFactory))) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!d2ok.f7l8(socketFactory, this.f43593h)) {
                this.f94194jk = null;
            }
            this.f43593h = socketFactory;
            return this;
        }

        @InterfaceC7396q
        public final okhttp3.toq zurt() {
            return this.f94191f7l8;
        }

        @InterfaceC7396q
        public final k zy(@InterfaceC7396q ni7 interceptor) {
            d2ok.m23075h(interceptor, "interceptor");
            this.f94208zy.add(interceptor);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public k(@InterfaceC7396q C7529t okHttpClient) {
            this();
            d2ok.m23075h(okHttpClient, "okHttpClient");
            this.f43595k = okHttpClient.m27428c();
            this.f94204toq = okHttpClient.n5r1();
            C6163t.zp(this.f94208zy, okHttpClient.m27433j());
            C6163t.zp(this.f43598q, okHttpClient.m27435m());
            this.f43596n = okHttpClient.uv6();
            this.f43592g = okHttpClient.m27426a();
            this.f94191f7l8 = okHttpClient.lvui();
            this.f43601y = okHttpClient.vyq();
            this.f43599s = okHttpClient.m27429e();
            this.f43597p = okHttpClient.m27430f();
            this.f94197ld6 = okHttpClient.m27438r();
            this.f94206x2 = okHttpClient.lrht();
            this.f94202qrj = okHttpClient.m27427b();
            this.f94199n7h = okHttpClient.i1();
            this.f94196kja0 = okHttpClient.bf2();
            this.f43593h = okHttpClient.zp();
            this.f94190cdj = okHttpClient.f43575j;
            this.f94195ki = okHttpClient.lv5();
            this.f94203t8r = okHttpClient.hyr();
            this.f43594i = okHttpClient.y9n();
            this.f94192fn3e = okHttpClient.hb();
            this.f94207zurt = okHttpClient.ncyb();
            this.f94200ni7 = okHttpClient.x9kr();
            this.f94193fu4 = okHttpClient.dd();
            this.f43602z = okHttpClient.m27434l();
            this.f94201o1t = okHttpClient.a98o();
            this.f94205wvg = okHttpClient.nmn5();
            this.f43600t = okHttpClient.yz();
            this.f94198mcp = okHttpClient.m27437o();
            this.f94194jk = okHttpClient.nn86();
        }
    }

    public C7529t() {
        this(new k());
    }
}
