package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: renamed from: okhttp3.internal.platform.s */
/* JADX INFO: compiled from: OpenJSSEPlatform.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nOpenJSSEPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n*L\n68#1:102,2\n*E\n"})
public final class C7500s extends C7498p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f94009f7l8;

    /* JADX INFO: renamed from: y */
    private static final boolean f43372y;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final Provider f43373g;

    /* JADX INFO: renamed from: okhttp3.internal.platform.s$k */
    /* JADX INFO: compiled from: OpenJSSEPlatform.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final C7500s m27256k() {
            ni7 ni7Var = null;
            if (toq()) {
                return new C7500s(ni7Var);
            }
            return null;
        }

        public final boolean toq() {
            return C7500s.f43372y;
        }
    }

    static {
        k kVar = new k(null);
        f94009f7l8 = kVar;
        boolean z2 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, kVar.getClass().getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f43372y = z2;
    }

    private C7500s() {
        this.f43373g = new OpenJSSE();
    }

    public /* synthetic */ C7500s(ni7 ni7Var) {
        this();
    }

    @Override // okhttp3.internal.platform.C7498p
    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.mo27232g(sslSocket, str, protocols);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            sSLParameters.setApplicationProtocols((String[]) C7498p.f43366k.toq(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public SSLContext mo27241h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f43373g);
        d2ok.kja0(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    public X509TrustManager ki() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f43373g);
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

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo27233p(sslSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : d2ok.f7l8(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    public X509TrustManager t8r(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }
}
