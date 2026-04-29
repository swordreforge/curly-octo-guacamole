package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.C7498p;
import okhttp3.internal.platform.android.ld6;
import okhttp3.mcp;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.k */
/* JADX INFO: compiled from: Android10SocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
@b7.zy
@lv5({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n60#1:78,2\n*E\n"})
public final class C7486k implements ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final k f43347k = new k(null);

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.k$k */
    /* JADX INFO: compiled from: Android10SocketAdapter.kt */
    @b7.zy
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final ld6 m27219k() {
            if (toq()) {
                return new C7486k();
            }
            return null;
        }

        public final boolean toq() {
            return C7498p.f43366k.m27250y() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo27212g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) throws IOException {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C7498p.f43366k.toq(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: k */
    public boolean mo27213k() {
        return f43347k.toq();
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
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    @SuppressLint({"NewApi"})
    public String zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : d2ok.f7l8(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }
}
