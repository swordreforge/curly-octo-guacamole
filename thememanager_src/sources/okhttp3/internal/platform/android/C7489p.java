package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.android.ld6;
import okhttp3.mcp;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.p */
/* JADX INFO: compiled from: DeferredSocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7489p implements ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final k f43348k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private ld6 f93993toq;

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.p$k */
    /* JADX INFO: compiled from: DeferredSocketAdapter.kt */
    public interface k {
        boolean toq(@InterfaceC7396q SSLSocket sSLSocket);

        @InterfaceC7396q
        ld6 zy(@InterfaceC7396q SSLSocket sSLSocket);
    }

    public C7489p(@InterfaceC7396q k socketAdapterFactory) {
        d2ok.m23075h(socketAdapterFactory, "socketAdapterFactory");
        this.f43348k = socketAdapterFactory;
    }

    private final synchronized ld6 f7l8(SSLSocket sSLSocket) {
        if (this.f93993toq == null && this.f43348k.toq(sSLSocket)) {
            this.f93993toq = this.f43348k.zy(sSLSocket);
        }
        return this.f93993toq;
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: g */
    public void mo27212g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        ld6 ld6VarF7l8 = f7l8(sslSocket);
        if (ld6VarF7l8 != null) {
            ld6VarF7l8.mo27212g(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: k */
    public boolean mo27213k() {
        return true;
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
        return this.f43348k.toq(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    public String zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        ld6 ld6VarF7l8 = f7l8(sslSocket);
        if (ld6VarF7l8 != null) {
            return ld6VarF7l8.zy(sslSocket);
        }
        return null;
    }
}
