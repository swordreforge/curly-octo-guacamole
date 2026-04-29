package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.mcp;

/* JADX INFO: compiled from: SocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface ld6 {

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.ld6$k */
    /* JADX INFO: compiled from: SocketAdapter.kt */
    public static final class C7487k {
        /* JADX INFO: renamed from: k */
        public static boolean m27220k(@InterfaceC7396q ld6 ld6Var, @InterfaceC7396q SSLSocketFactory sslSocketFactory) {
            d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
            return false;
        }

        @InterfaceC7395n
        public static X509TrustManager toq(@InterfaceC7396q ld6 ld6Var, @InterfaceC7396q SSLSocketFactory sslSocketFactory) {
            d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    void mo27212g(@InterfaceC7396q SSLSocket sSLSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> list);

    /* JADX INFO: renamed from: k */
    boolean mo27213k();

    /* JADX INFO: renamed from: n */
    boolean mo27214n(@InterfaceC7396q SSLSocketFactory sSLSocketFactory);

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    X509TrustManager mo27215q(@InterfaceC7396q SSLSocketFactory sSLSocketFactory);

    boolean toq(@InterfaceC7396q SSLSocket sSLSocket);

    @InterfaceC7395n
    String zy(@InterfaceC7396q SSLSocket sSLSocket);
}
