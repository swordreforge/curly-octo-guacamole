package okhttp3.internal.platform;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.mcp;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: renamed from: okhttp3.internal.platform.q */
/* JADX INFO: compiled from: ConscryptPlatform.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
public final class C7499q extends C7498p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f94008f7l8;

    /* JADX INFO: renamed from: y */
    private static final boolean f43369y;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final Provider f43370g;

    /* JADX INFO: renamed from: okhttp3.internal.platform.q$k */
    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ boolean toq(k kVar, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i3 = 0;
            }
            if ((i5 & 4) != 0) {
                i4 = 0;
            }
            return kVar.m27252k(i2, i3, i4);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27252k(int i2, int i3, int i4) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i2 ? version.major() > i2 : version.minor() != i3 ? version.minor() > i3 : version.patch() >= i4;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m27253q() {
            return C7499q.f43369y;
        }

        @InterfaceC7395n
        public final C7499q zy() {
            ni7 ni7Var = null;
            if (m27253q()) {
                return new C7499q(ni7Var);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.q$toq */
    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    public static final class toq implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final toq f43371k = new toq();

        private toq() {
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27254k(@InterfaceC7395n String str, @InterfaceC7395n SSLSession sSLSession) {
            return true;
        }

        public boolean toq(@InterfaceC7395n X509Certificate[] x509CertificateArr, @InterfaceC7395n String str, @InterfaceC7395n SSLSession sSLSession) {
            return true;
        }
    }

    static {
        k kVar = new k(null);
        f94008f7l8 = kVar;
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, kVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (kVar.m27252k(2, 1, 0)) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f43369y = z2;
    }

    private C7499q() {
        Provider providerNewProvider = Conscrypt.newProvider();
        d2ok.kja0(providerNewProvider, "newProvider()");
        this.f43370g = providerNewProvider;
    }

    public /* synthetic */ C7499q(ni7 ni7Var) {
        this();
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    public SSLSocketFactory cdj(@InterfaceC7396q X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        d2ok.m23075h(trustManager, "trustManager");
        SSLContext sSLContextMo27241h = mo27241h();
        sSLContextMo27241h.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo27241h.getSocketFactory();
        d2ok.kja0(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.C7498p
    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo27232g(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C7498p.f43366k.toq(protocols).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public SSLContext mo27241h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f43370g);
        d2ok.kja0(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    public X509TrustManager ki() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        d2ok.qrj(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            d2ok.n7h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, toq.f43371k);
            return x509TrustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        d2ok.kja0(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo27233p(sslSocket);
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    public X509TrustManager t8r(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}
