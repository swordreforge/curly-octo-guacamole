package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.text.jk;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.mcp;

/* JADX INFO: renamed from: okhttp3.internal.platform.y */
/* JADX INFO: compiled from: Jdk9Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
public class C7502y extends C7498p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final boolean f94012f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final k f43378g = new k(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: okhttp3.internal.platform.y$k */
    /* JADX INFO: compiled from: Jdk9Platform.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final C7502y m27262k() {
            if (toq()) {
                return new C7502y();
            }
            return null;
        }

        public final boolean toq() {
            return C7502y.f94012f7l8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("java.specification.version");
        Integer numCfr = property != null ? jk.cfr(property) : null;
        boolean z2 = true;
        if (numCfr == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z2 = false;
            }
        } else if (numCfr.intValue() < 9) {
            z2 = false;
        }
        f94012f7l8 = z2;
    }

    @Override // okhttp3.internal.platform.C7498p
    @b7.zy
    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C7498p.f43366k.toq(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.C7498p
    @b7.zy
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : d2ok.f7l8(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    public X509TrustManager t8r(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
