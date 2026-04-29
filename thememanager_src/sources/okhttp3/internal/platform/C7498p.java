package okhttp3.internal.platform;

import b7.C1359g;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.fu4;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import l05.qrj;
import le7.C6771k;
import le7.InterfaceC6772n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.mcp;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.platform.p */
/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
public class C7498p {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final k f43366k;

    /* JADX INFO: renamed from: n */
    private static final Logger f43367n;

    /* JADX INFO: renamed from: q */
    public static final int f43368q = 5;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static volatile C7498p f94006toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f94007zy = 4;

    /* JADX INFO: renamed from: okhttp3.internal.platform.p$k */
    /* JADX INFO: compiled from: Platform.kt */
    @lv5({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final C7498p m27244g() {
            return m27250y() ? m27248q() : m27246n();
        }

        private final boolean ld6() {
            return d2ok.f7l8("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: n */
        private final C7498p m27246n() {
            C7500s c7500sM27256k;
            zy zyVarM27264k;
            C7499q c7499qZy;
            if (m27247p() && (c7499qZy = C7499q.f94008f7l8.zy()) != null) {
                return c7499qZy;
            }
            if (m27249s() && (zyVarM27264k = zy.f94013f7l8.m27264k()) != null) {
                return zyVarM27264k;
            }
            if (ld6() && (c7500sM27256k = C7500s.f94009f7l8.m27256k()) != null) {
                return c7500sM27256k;
            }
            C7502y c7502yM27262k = C7502y.f43378g.m27262k();
            if (c7502yM27262k != null) {
                return c7502yM27262k;
            }
            C7498p c7498pM27238k = C7497n.f94002ld6.m27238k();
            return c7498pM27238k != null ? c7498pM27238k : new C7498p();
        }

        /* JADX INFO: renamed from: p */
        private final boolean m27247p() {
            return d2ok.f7l8("Conscrypt", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: q */
        private final C7498p m27248q() {
            okhttp3.internal.platform.android.zy.f43357k.toq();
            C7498p c7498pM27235k = C7496k.f94001f7l8.m27235k();
            if (c7498pM27235k != null) {
                return c7498pM27235k;
            }
            C7498p c7498pM27258k = toq.f43375y.m27258k();
            d2ok.qrj(c7498pM27258k);
            return c7498pM27258k;
        }

        public static /* synthetic */ void qrj(k kVar, C7498p c7498p, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                c7498p = kVar.m27244g();
            }
            kVar.x2(c7498p);
        }

        /* JADX INFO: renamed from: s */
        private final boolean m27249s() {
            return d2ok.f7l8("BC", Security.getProviders()[0].getName());
        }

        @InterfaceC7396q
        @qrj
        public final C7498p f7l8() {
            return C7498p.f94006toq;
        }

        @InterfaceC7396q
        public final List<String> toq(@InterfaceC7396q List<? extends mcp> protocols) {
            d2ok.m23075h(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((mcp) obj) != mcp.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(fu4.vyq(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((mcp) it.next()).toString());
            }
            return arrayList2;
        }

        public final void x2(@InterfaceC7396q C7498p platform) {
            d2ok.m23075h(platform, "platform");
            C7498p.f94006toq = platform;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m27250y() {
            return d2ok.f7l8("Dalvik", System.getProperty("java.vm.name"));
        }

        @InterfaceC7396q
        public final byte[] zy(@InterfaceC7396q List<? extends mcp> protocols) {
            d2ok.m23075h(protocols, "protocols");
            x2 x2Var = new x2();
            for (String str : toq(protocols)) {
                x2Var.writeByte(str.length());
                x2Var.lrht(str);
            }
            return x2Var.gbni();
        }
    }

    static {
        k kVar = new k(null);
        f43366k = kVar;
        f94006toq = kVar.m27244g();
        f43367n = Logger.getLogger(C7529t.class.getName());
    }

    public static /* synthetic */ void n7h(C7498p c7498p, String str, int i2, Throwable th, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        if ((i3 & 4) != 0) {
            th = null;
        }
        c7498p.qrj(str, i2, th);
    }

    @InterfaceC7396q
    @qrj
    /* JADX INFO: renamed from: y */
    public static final C7498p m27240y() {
        return f43366k.f7l8();
    }

    @InterfaceC7396q
    public SSLSocketFactory cdj(@InterfaceC7396q X509TrustManager trustManager) {
        d2ok.m23075h(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo27241h = mo27241h();
            sSLContextMo27241h.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo27241h.getSocketFactory();
            d2ok.kja0(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public void f7l8(@InterfaceC7396q Socket socket, @InterfaceC7396q InetSocketAddress address, int i2) throws IOException {
        d2ok.m23075h(socket, "socket");
        d2ok.m23075h(address, "address");
        socket.connect(address, i2);
    }

    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public SSLContext mo27241h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        d2ok.kja0(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @InterfaceC7396q
    public X509TrustManager ki() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        d2ok.qrj(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            d2ok.n7h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        d2ok.kja0(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public void kja0(@InterfaceC7396q String message, @InterfaceC7395n Object obj) {
        d2ok.m23075h(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        qrj(message, 5, (Throwable) obj);
    }

    @InterfaceC7395n
    public Object ld6(@InterfaceC7396q String closer) {
        d2ok.m23075h(closer, "closer");
        if (f43367n.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public InterfaceC6772n mo27242n(@InterfaceC7396q X509TrustManager trustManager) {
        d2ok.m23075h(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        d2ok.kja0(acceptedIssuers, "trustManager.acceptedIssuers");
        return new le7.toq((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        return null;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public le7.zy mo27234q(@InterfaceC7396q X509TrustManager trustManager) {
        d2ok.m23075h(trustManager, "trustManager");
        return new C6771k(mo27242n(trustManager));
    }

    public void qrj(@InterfaceC7396q String message, int i2, @InterfaceC7395n Throwable th) {
        d2ok.m23075h(message, "message");
        f43367n.log(i2 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final String m27243s() {
        return "OkHttp";
    }

    @InterfaceC7395n
    public X509TrustManager t8r(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            d2ok.kja0(sslContextClass, "sslContextClass");
            Object objM5752f = C1359g.m5752f(sslSocketFactory, sslContextClass, "context");
            if (objM5752f == null) {
                return null;
            }
            return (X509TrustManager) C1359g.m5752f(objM5752f, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e2) {
            if (d2ok.f7l8(e2.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                return null;
            }
            throw e2;
        }
    }

    @InterfaceC7396q
    public String toString() {
        String simpleName = getClass().getSimpleName();
        d2ok.kja0(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public boolean x2(@InterfaceC7396q String hostname) {
        d2ok.m23075h(hostname, "hostname");
        return true;
    }

    public void zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
    }
}
