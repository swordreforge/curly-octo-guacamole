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
import okhttp3.internal.platform.C7499q;
import okhttp3.internal.platform.android.C7489p;
import okhttp3.internal.platform.android.ld6;
import okhttp3.mcp;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.s */
/* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
public final class C7491s implements ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f43350k = new toq(null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C7489p.k f93994toq = new k();

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.s$k */
    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public static final class k implements C7489p.k {
        k() {
        }

        @Override // okhttp3.internal.platform.android.C7489p.k
        public boolean toq(@InterfaceC7396q SSLSocket sslSocket) {
            d2ok.m23075h(sslSocket, "sslSocket");
            return C7499q.f94008f7l8.m27253q() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // okhttp3.internal.platform.android.C7489p.k
        @InterfaceC7396q
        public ld6 zy(@InterfaceC7396q SSLSocket sslSocket) {
            d2ok.m23075h(sslSocket, "sslSocket");
            return new C7491s();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.s$toq */
    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7489p.k m27222k() {
            return C7491s.f93994toq;
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: g */
    public void mo27212g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        if (toq(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C7498p.f43366k.toq(protocols).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: k */
    public boolean mo27213k() {
        return C7499q.f94008f7l8.m27253q();
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
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    public String zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        if (toq(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }
}
