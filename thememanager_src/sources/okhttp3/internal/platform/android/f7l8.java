package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.C7498p;
import okhttp3.internal.platform.android.C7489p;
import okhttp3.internal.platform.android.ld6;
import okhttp3.mcp;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n37#2,2:69\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n53#1:69,2\n*E\n"})
public final class f7l8 implements ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f43341k = new toq(null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C7489p.k f93989toq = new C7484k();

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.f7l8$k */
    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class C7484k implements C7489p.k {
        C7484k() {
        }

        @Override // okhttp3.internal.platform.android.C7489p.k
        public boolean toq(@InterfaceC7396q SSLSocket sslSocket) {
            d2ok.m23075h(sslSocket, "sslSocket");
            return okhttp3.internal.platform.zy.f94013f7l8.toq() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // okhttp3.internal.platform.android.C7489p.k
        @InterfaceC7396q
        public ld6 zy(@InterfaceC7396q SSLSocket sslSocket) {
            d2ok.m23075h(sslSocket, "sslSocket");
            return new f7l8();
        }
    }

    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7489p.k m27216k() {
            return f7l8.f93989toq;
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: g */
    public void mo27212g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        if (toq(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C7498p.f43366k.toq(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: k */
    public boolean mo27213k() {
        return okhttp3.internal.platform.zy.f94013f7l8.toq();
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo27214n(@InterfaceC7396q SSLSocketFactory sSLSocketFactory) {
        return ld6.C7487k.m27220k(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public X509TrustManager mo27215q(@InterfaceC7396q SSLSocketFactory sSLSocketFactory) {
        return ld6.C7487k.toq(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.ld6
    public boolean toq(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    public String zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : d2ok.f7l8(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }
}
